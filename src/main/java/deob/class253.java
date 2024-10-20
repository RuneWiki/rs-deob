package deob;

@ObfuscatedName("ji")
public class class253 {

    public class253() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("rw.at(III)I")
    public static int method7526(int arg0, int arg1) {
        class204 var2 = class204.method327(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field2194 >= 0) {
            int var3 = var2.field2193;
            int var4 = var2.field2199;
            int var5 = var2.field2200;
            if (var5 > 179) {
                var4 /= 2;
            }
            if (var5 > 192) {
                var4 /= 2;
            }
            if (var5 > 217) {
                var4 /= 2;
            }
            if (var5 > 243) {
                var4 /= 2;
            }
            int var6 = var5 / 2 + (var3 / 4 << 10) + (var4 / 32 << 7);
            int var9 = method2833(var6, 96);
            return class267.field2772[var9] | 0xFF000000;
        } else if (var2.field2192 >= 0) {
            int var10 = method2833(class267.field2773.field3043.method5009(var2.field2192), 96);
            return class267.field2772[var10] | 0xFF000000;
        } else if (var2.field2202 == 16711935) {
            return arg1;
        } else {
            int var11 = var2.field2198;
            int var12 = var2.field2196;
            int var13 = var2.field2189;
            if (var13 > 179) {
                var12 /= 2;
            }
            if (var13 > 192) {
                var12 /= 2;
            }
            if (var13 > 217) {
                var12 /= 2;
            }
            if (var13 > 243) {
                var12 /= 2;
            }
            int var14 = var13 / 2 + (var11 / 4 << 10) + (var12 / 32 << 7);
            int var17 = method2833(var14, 96);
            return class267.field2772[var17] | 0xFF000000;
        }
    }

    @ObfuscatedName("er.ah(III)I")
    public static int method2833(int arg0, int arg1) {
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
