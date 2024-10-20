package deob;

@ObfuscatedName("lb")
public class class301 {

    public class301() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fa.ap(III)I")
    public static int method3227(int arg0, int arg1) {
        class212 var2 = (class212) class212.field2292.method5928((long) arg0);
        class212 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2293.method7009(4, arg0);
            class212 var5 = new class212();
            if (var4 != null) {
                var5.method4077(new class558(var4), arg0);
            }
            var5.method4071();
            class212.field2292.method5931(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        if (var3 == null) {
            return arg1;
        } else if (var3.field2296 >= 0) {
            int var7 = var3.field2300;
            int var8 = var3.field2302;
            int var9 = var3.field2291;
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
            int var13 = method5756(var10, 96);
            return class240.field2595[var13] | 0xFF000000;
        } else if (var3.field2294 >= 0) {
            int var14 = method5756(class240.field2589.field2913.method4967(var3.field2294), 96);
            return class240.field2595[var14] | 0xFF000000;
        } else if (var3.field2299 == 16711935) {
            return arg1;
        } else {
            int var15 = var3.field2295;
            int var16 = var3.field2298;
            int var17 = var3.field2303;
            if (var17 > 179) {
                var16 /= 2;
            }
            if (var17 > 192) {
                var16 /= 2;
            }
            if (var17 > 217) {
                var16 /= 2;
            }
            if (var17 > 243) {
                var16 /= 2;
            }
            int var18 = var17 / 2 + (var15 / 4 << 10) + (var16 / 32 << 7);
            int var21 = method5756(var18, 96);
            return class240.field2595[var21] | 0xFF000000;
        }
    }

    @ObfuscatedName("lm.aw(III)I")
    public static int method5756(int arg0, int arg1) {
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
