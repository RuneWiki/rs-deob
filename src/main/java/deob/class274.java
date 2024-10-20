package deob;

@ObfuscatedName("kq")
public class class274 {

    public class274() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("sg.aw(III)I")
    public static int method7942(int arg0, int arg1) {
        class209 var2 = class209.method2884(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field2250 >= 0) {
            int var3 = var2.field2258;
            int var4 = var2.field2255;
            int var5 = var2.field2252;
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
            int var9 = method2967(var6, 96);
            return class228.field2512[var9] | 0xFF000000;
        } else if (var2.field2248 >= 0) {
            int var10 = method2967(class228.field2511.field2783.method4388(var2.field2248), 96);
            return class228.field2512[var10] | 0xFF000000;
        } else if (var2.field2247 == 16711935) {
            return arg1;
        } else {
            int var11 = var2.field2249;
            int var12 = var2.field2245;
            int var13 = var2.field2254;
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
            int var17 = method2967(var14, 96);
            return class228.field2512[var17] | 0xFF000000;
        }
    }

    @ObfuscatedName("fv.ay(III)I")
    public static int method2967(int arg0, int arg1) {
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
