package deob;

@ObfuscatedName("km")
public class class272 {

    public class272() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("if.at(III)I")
    public static int method4355(int arg0, int arg1) {
        class207 var2 = (class207) class207.field2258.method5121((long) arg0);
        class207 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2259.method6080(4, arg0);
            class207 var5 = new class207();
            if (var4 != null) {
                var5.method3702(new class501(var4), arg0);
            }
            var5.method3697();
            class207.field2258.method5123(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        if (var3 == null) {
            return arg1;
        } else if (var3.field2262 >= 0) {
            int var7 = var3.field2268;
            int var8 = var3.field2263;
            int var9 = var3.field2270;
            if (var9 > 179) {
                var8 /= 2;
            }
            if (var9 > 192) {
                var8 /= 2;
            }
            if (var9 > 217) {
                var8 /= 2;
            }
            if (var9 > 243) {
                var8 /= 2;
            }
            int var10 = var9 / 2 + (var7 / 4 << 10) + (var8 / 32 << 7);
            int var13 = method2117(var10, 96);
            return class226.field2516[var13] | 0xFF000000;
        } else if (var3.field2266 >= 0) {
            int var14 = method2117(class226.field2521.field2793.method4367(var3.field2266), 96);
            return class226.field2516[var14] | 0xFF000000;
        } else if (var3.field2267 == 16711935) {
            return arg1;
        } else {
            int var15 = method4361(var3.field2257, var3.field2264, var3.field2265);
            int var16 = method2117(var15, 96);
            return class226.field2516[var16] | 0xFF000000;
        }
    }

    @ObfuscatedName("dt.an(IIB)I")
    public static int method2117(int arg0, int arg1) {
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

    @ObfuscatedName("jw.av(IIII)I")
    public static int method4361(int arg0, int arg1, int arg2) {
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
