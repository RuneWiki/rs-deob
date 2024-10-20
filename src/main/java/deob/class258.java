package deob;

@ObfuscatedName("jp")
public class class258 {

    public class258() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dt.aq(IIB)I")
    public static int method2246(int arg0, int arg1) {
        class206 var2 = (class206) class206.field2238.method5414((long) arg0);
        class206 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2245.method6489(4, arg0);
            class206 var5 = new class206();
            if (var4 != null) {
                var5.method3700(new class534(var4), arg0);
            }
            var5.method3699();
            class206.field2238.method5421(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        if (var3 == null) {
            return arg1;
        } else if (var3.field2246 >= 0) {
            int var7 = method2423(var3.field2243, var3.field2244, var3.field2239);
            int var8 = method3947(var7, 96);
            return class272.field2817[var8] | 0xFF000000;
        } else if (var3.field2237 >= 0) {
            int var9 = method3947(class272.field2821.field3091.method5107(var3.field2237), 96);
            return class272.field2817[var9] | 0xFF000000;
        } else if (var3.field2236 == 16711935) {
            return arg1;
        } else {
            int var10 = method2423(var3.field2240, var3.field2241, var3.field2242);
            int var11 = method3947(var10, 96);
            return class272.field2817[var11] | 0xFF000000;
        }
    }

    @ObfuscatedName("im.aw(III)I")
    public static int method3947(int arg0, int arg1) {
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

    @ObfuscatedName("df.al(IIIB)I")
    public static int method2423(int arg0, int arg1, int arg2) {
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
