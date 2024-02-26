package ch04;

public class Main {

    public boolean isValidPassword(String password) {
        // 비밀번호가 공백이거나 null 인지 검사
        if (Stringutils.isBlank(password)) {
            return false;
        }

        // 비밀번호 길이가 4이상 64 미만
        int length = password.length();
        if (length < 4 || length > 64) {
            return false;
        }

        // 비밀번호에 a !z, 0 ~9, "." 문자만 포함하는가
        for (int i = 0; i < length ; i++ ) {
            char c = password.charAt(i);

            if (!((c >= 'a' && c <= 'z') || ( c >= '0' && c <= '9') || c == '.')) {
                return false;
            }
        }
        return true;
    }



    private static class Stringutils {
        public static boolean isBlank(final String password) {

            return false;
        }
    }
}
