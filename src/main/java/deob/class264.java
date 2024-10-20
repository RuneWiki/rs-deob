package deob;

@ObfuscatedName("ks")
public class class264 {

    public class264() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ma.aq(III)I")
    public static int method5535(int arg0, int arg1) {
        class209 var2 = class209.method1105(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field2273 >= 0) {
            int var3 = method3607(var2.field2276, var2.field2277, var2.field2268);
            int var4 = method2349(var3, 96);
            return class278.field2880[var4] | 0xFF000000;
        } else if (var2.field2267 >= 0) {
            int var5 = method2349(class278.field2877.field3195.method5207(var2.field2267), 96);
            return class278.field2880[var5] | 0xFF000000;
        } else if (var2.field2269 == 16711935) {
            return arg1;
        } else {
            int var6 = method3607(var2.field2271, var2.field2270, var2.field2274);
            int var7 = method2349(var6, 96);
            return class278.field2880[var7] | 0xFF000000;
        }
    }

    @ObfuscatedName("db.ad(IIB)I")
    public static int method2349(int arg0, int arg1) {
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            int var3 = (arg0 & 0x7F) * arg1 / 128;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @ObfuscatedName("hg.ag(IIIB)I")
    public static int method3607(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }
}
