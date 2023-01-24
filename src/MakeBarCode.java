public class MakeBarCode { // 바코드 만들기
    public String barcode(int len) {
        return tree("", len);
    }

    public boolean sequence(String str){ // 부분수열 동일 여부 판단
        StringBuffer strB  = new StringBuffer(str); // reverse 메서드 사용하기 위해 Buffer형으로 변환
        String rev = strB.reverse().toString(); // 비교용으로 str를 뒤집은 문자열 생성
        System.out.println(rev);

        for(int i =1; i<=str.length()/2; i++){
            if(rev.substring(0,i).equals(rev.substring(i,i+i))) return false;
        }
        return true;
    }

    public String tree(String str, int len){ // 새로운 바코드 넘버를 만드는 메서드
        String canUseNum = "123";
        if(str.length()==len) return str; // 목표하는 길이(len)이 되면 만든 바코드 출력

        for(int i=0; i<canUseNum.length(); i++){
            String str2 = str + canUseNum.charAt(i);
            if(sequence(str2)) {
                String str3 = tree(str2, len);
                if(str3 != null) return str3;
            }//else if(str!=null) str = str.substring(0, str.length()-1); // 부분수열 동일할 경우 추가했던 문자(마지막 인덱스) 삭제
        }
        return null;
    }
}