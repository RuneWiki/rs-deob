package deob;

@ObfuscatedName("ih")
public class class254 extends class185 {

    @ObfuscatedName("ih.s")
    public static class155 field3264 = new class155(64);

    @ObfuscatedName("ih.t")
    public static class155 field3265 = new class155(30);

    @ObfuscatedName("ih.i")
    public int field3266;

    @ObfuscatedName("ih.o")
    public int field3267;

    @ObfuscatedName("ih.x")
    public int field3268 = -1;

    @ObfuscatedName("ih.w")
    public short[] field3269;

    @ObfuscatedName("ih.g")
    public short[] field3270;

    @ObfuscatedName("ih.m")
    public short[] field3271;

    @ObfuscatedName("ih.n")
    public short[] field3272;

    @ObfuscatedName("ih.d")
    public int field3273 = 128;

    @ObfuscatedName("ih.h")
    public int field3274 = 128;

    @ObfuscatedName("ih.a")
    public int field3278 = 0;

    @ObfuscatedName("ih.q")
    public int field3276 = 0;

    @ObfuscatedName("ih.c")
    public int field3277 = 0;

    @ObfuscatedName("bu.z(II)Lih;")
    public static class254 method1045(int arg0) {
        class254 var1 = (class254) field3264.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3275.method3873(13, arg0);
        class254 var3 = new class254();
        var3.field3266 = arg0;
        if (var2 != null) {
            var3.method4121(new class310(var2));
        }
        field3264.method3169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ih.k(Lkf;B)V")
    public void method4121(class310 arg0) {
        while (true) {
            int var2 = arg0.method5193();
            if (var2 == 0) {
                return;
            }
            this.method4115(arg0, var2);
        }
    }

    @ObfuscatedName("ih.s(Lkf;II)V")
    public void method4115(class310 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3267 = arg0.method5195();
        } else if (arg1 == 2) {
            this.field3268 = arg0.method5195();
        } else if (arg1 == 4) {
            this.field3273 = arg0.method5195();
        } else if (arg1 == 5) {
            this.field3274 = arg0.method5195();
        } else if (arg1 == 6) {
            this.field3278 = arg0.method5195();
        } else if (arg1 == 7) {
            this.field3276 = arg0.method5193();
        } else if (arg1 == 8) {
            this.field3277 = arg0.method5193();
        } else if (arg1 == 40) {
            int var3 = arg0.method5193();
            this.field3269 = new short[var3];
            this.field3270 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3269[var4] = (short) arg0.method5195();
                this.field3270[var4] = (short) arg0.method5195();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5193();
            this.field3271 = new short[var5];
            this.field3272 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3271[var6] = (short) arg0.method5195();
                this.field3272[var6] = (short) arg0.method5195();
            }
        }
    }

    @ObfuscatedName("ih.t(II)Ler;")
    public final class137 method4116(int arg0) {
        class137 var2 = (class137) field3265.method3170((long) this.field3266);
        if (var2 == null) {
            class131 var3 = class131.method2636(Statics.field3279, this.field3267, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3269 != null) {
                for (int var4 = 0; var4 < this.field3269.length; var4++) {
                    var3.method2691(this.field3269[var4], this.field3270[var4]);
                }
            }
            if (this.field3271 != null) {
                for (int var5 = 0; var5 < this.field3271.length; var5++) {
                    var3.method2652(this.field3271[var5], this.field3272[var5]);
                }
            }
            var2 = var3.method2656(this.field3276 + 64, this.field3277 + 850, -30, -50, -30);
            field3265.method3169(var2, (long) this.field3266);
        }
        class137 var6;
        if (this.field3268 == -1 || arg0 == -1) {
            var6 = var2.method2793(true);
        } else {
            var6 = class269.method536(this.field3268).method4504(var2, arg0);
        }
        if (this.field3273 != 128 || this.field3274 != 128) {
            var6.method2804(this.field3273, this.field3274, this.field3273);
        }
        if (this.field3278 != 0) {
            if (this.field3278 == 90) {
                var6.method2756();
            }
            if (this.field3278 == 180) {
                var6.method2756();
                var6.method2756();
            }
            if (this.field3278 == 270) {
                var6.method2756();
                var6.method2756();
                var6.method2756();
            }
        }
        return var6;
    }
}
