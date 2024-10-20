package deob;

@ObfuscatedName("ib")
public class class254 {

    public class254() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bq.h(III)I")
    public static int method1880(int arg0, int arg1) {
        class198 var2 = (class198) class198.field2265.method4917((long) arg0);
        class198 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2264.method5909(4, arg0);
            class198 var5 = new class198();
            if (var4 != null) {
                var5.method3648(new class467(var4), arg0);
            }
            var5.method3647();
            class198.field2265.method4925(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        if (var3 == null) {
            return arg1;
        } else if (var3.field2269 >= 0) {
            return var3.field2269 | 0xFF000000;
        } else if (var3.field2267 >= 0) {
            int var7 = method5190(Statics.field2491.method4256(var3.field2267), 96);
            return class213.field2504[var7] | 0xFF000000;
        } else if (var3.field2266 == 16711935) {
            return arg1;
        } else {
            int var8 = var3.field2272;
            int var9 = var3.field2270;
            int var10 = var3.field2271;
            if (var10 > 179) {
                var9 /= 2;
            }
            if (var10 > 192) {
                var9 /= 2;
            }
            if (var10 > 217) {
                var9 /= 2;
            }
            if (var10 > 243) {
                var9 /= 2;
            }
            int var11 = var10 / 2 + (var8 / 4 << 10) + (var9 / 32 << 7);
            int var14 = method5190(var11, 96);
            return class213.field2504[var14] | 0xFF000000;
        }
    }

    @ObfuscatedName("kg.e(IIS)I")
    public static int method5190(int arg0, int arg1) {
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
