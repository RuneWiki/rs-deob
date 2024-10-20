package deob;

@ObfuscatedName("ag")
public class class38 {

    public class38() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.d(III)I")
    public static int method173(int arg0, int arg1) {
        class267 var2 = class267.method517(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field3657 >= 0) {
            return var2.field3657 | 0xFF000000;
        } else if (var2.field3664 >= 0) {
            int var3 = method2953(Statics.field1933.method2280(var2.field3664), 96);
            return class136.field1941[var3] | 0xFF000000;
        } else if (var2.field3654 == 16711935) {
            return arg1;
        } else {
            int var4 = var2.field3652;
            int var5 = var2.field3659;
            int var6 = var2.field3660;
            if (var6 > 179) {
                var5 /= 2;
            }
            if (var6 > 192) {
                var5 /= 2;
            }
            if (var6 > 217) {
                var5 /= 2;
            }
            if (var6 > 243) {
                var5 /= 2;
            }
            int var7 = var6 / 2 + (var4 / 4 << 10) + (var5 / 32 << 7);
            int var10 = method2953(var7, 96);
            return class136.field1941[var10] | 0xFF000000;
        }
    }

    @ObfuscatedName("fq.x(III)I")
    public static int method2953(int arg0, int arg1) {
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
}
