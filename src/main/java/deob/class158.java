package deob;

@ObfuscatedName("fq")
public class class158 {

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("by.c(IIII)I")
    public static int method1454(int arg0, int arg1, int arg2) {
        int var3 = arg2 & 0x3;
        if (var3 == 0) {
            return arg0;
        } else if (var3 == 1) {
            return arg1;
        } else if (var3 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg1;
        }
    }

    @ObfuscatedName("dt.j(IIIIIIB)I")
    public static int method2105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
}
