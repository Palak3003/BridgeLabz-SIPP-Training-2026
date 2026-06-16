public class OTPGenerator {

    public static int generateOTP() {

        return (int)(
                Math.random()
                        * 900000)
                + 100000;
    }

    public static boolean allUnique(
            int[] otpArray) {

        for(int i = 0;
            i < otpArray.length;
            i++) {

            for(int j = i + 1;
                j < otpArray.length;
                j++) {

                if(otpArray[i]
                        == otpArray[j])

                    return false;
            }
        }

        return true;
    }

    public static void main(
            String[] args) {

        int[] otp =
                new int[10];

        for(int i = 0;
            i < otp.length;
            i++) {

            otp[i] =
                    generateOTP();

            System.out.println(
                    otp[i]);
        }

        System.out.println(
                "All Unique = "
                        + allUnique(otp));
    }
}