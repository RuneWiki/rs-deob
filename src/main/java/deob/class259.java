package deob;

@ObfuscatedName("is")
public class class259 {

    public class259() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ar.i(IIIIIII)I")
    public static int method753(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if ((arg5 & 0x1) == 1) {
            int var6 = arg3;
            arg3 = arg4;
            arg4 = var6;
        }
        int var7 = arg2 & 0x3;
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return arg1;
        } else if (var7 == 2) {
            return 7 - arg0 - (arg3 - 1);
        } else {
            return 7 - arg1 - (arg4 - 1);
        }
    }

    @ObfuscatedName("gb.w(IIIIIIB)I")
    public static int method3567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if ((arg5 & 0x1) == 1) {
            int var6 = arg3;
            arg3 = arg4;
            arg4 = var6;
        }
        int var7 = arg2 & 0x3;
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return 7 - arg0 - (arg3 - 1);
        } else if (var7 == 2) {
            return 7 - arg1 - (arg4 - 1);
        } else {
            return arg0;
        }
    }
}
