package deob;

@ObfuscatedName("ie")
public class class257 extends class206 {

    @ObfuscatedName("ie.w")
    public static class201 field3384 = new class201(64);

    @ObfuscatedName("ie.s")
    public static class201 field3390 = new class201(30);

    @ObfuscatedName("ie.j")
    public int field3388;

    @ObfuscatedName("ie.a")
    public int field3387;

    @ObfuscatedName("ie.t")
    public int field3396 = -1;

    @ObfuscatedName("ie.r")
    public short[] field3389;

    @ObfuscatedName("ie.m")
    public short[] field3397;

    @ObfuscatedName("ie.h")
    public short[] field3391;

    @ObfuscatedName("ie.o")
    public short[] field3392;

    @ObfuscatedName("ie.x")
    public int field3393 = 128;

    @ObfuscatedName("ie.q")
    public int field3394 = 128;

    @ObfuscatedName("ie.v")
    public int field3395 = 0;

    @ObfuscatedName("ie.n")
    public int field3385 = 0;

    @ObfuscatedName("ie.y")
    public int field3386 = 0;

    @ObfuscatedName("av.p(Lik;Lik;B)V")
    public static void method498(class247 arg0, class247 arg1) {
        Statics.field2510 = arg0;
        Statics.field3383 = arg1;
    }

    @ObfuscatedName("v.i(II)Lie;")
    public static class257 method82(int arg0) {
        class257 var1 = (class257) field3384.method3504((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2510.method4032(13, arg0);
        class257 var3 = new class257();
        var3.field3388 = arg0;
        if (var2 != null) {
            var3.method4250(new class185(var2));
        }
        field3384.method3506(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ie.w(Lgj;I)V")
    public void method4250(class185 arg0) {
        while (true) {
            int var2 = arg0.method3197();
            if (var2 == 0) {
                return;
            }
            this.method4254(arg0, var2);
        }
    }

    @ObfuscatedName("ie.s(Lgj;II)V")
    public void method4254(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3387 = arg0.method3124();
        } else if (arg1 == 2) {
            this.field3396 = arg0.method3124();
        } else if (arg1 == 4) {
            this.field3393 = arg0.method3124();
        } else if (arg1 == 5) {
            this.field3394 = arg0.method3124();
        } else if (arg1 == 6) {
            this.field3395 = arg0.method3124();
        } else if (arg1 == 7) {
            this.field3385 = arg0.method3197();
        } else if (arg1 == 8) {
            this.field3386 = arg0.method3197();
        } else if (arg1 == 40) {
            int var3 = arg0.method3197();
            this.field3389 = new short[var3];
            this.field3397 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3389[var4] = (short) arg0.method3124();
                this.field3397[var4] = (short) arg0.method3124();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3197();
            this.field3391 = new short[var5];
            this.field3392 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3391[var6] = (short) arg0.method3124();
                this.field3392[var6] = (short) arg0.method3124();
            }
        }
    }

    @ObfuscatedName("ie.j(II)Len;")
    public final class131 method4252(int arg0) {
        class131 var2 = (class131) field3390.method3504((long) this.field3388);
        if (var2 == null) {
            class125 var3 = class125.method2372(Statics.field3383, this.field3387, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3389 != null) {
                for (int var4 = 0; var4 < this.field3389.length; var4++) {
                    var3.method2383(this.field3389[var4], this.field3397[var4]);
                }
            }
            if (this.field3391 != null) {
                for (int var5 = 0; var5 < this.field3391.length; var5++) {
                    var3.method2384(this.field3391[var5], this.field3392[var5]);
                }
            }
            var2 = var3.method2391(this.field3385 + 64, this.field3386 + 850, -30, -50, -30);
            field3390.method3506(var2, (long) this.field3388);
        }
        class131 var6;
        if (this.field3396 == -1 || arg0 == -1) {
            var6 = var2.method2486(true);
        } else {
            var6 = class272.method2308(this.field3396).method4600(var2, arg0);
        }
        if (this.field3393 != 128 || this.field3394 != 128) {
            var6.method2491(this.field3393, this.field3394, this.field3393);
        }
        if (this.field3395 != 0) {
            if (this.field3395 == 90) {
                var6.method2472();
            }
            if (this.field3395 == 180) {
                var6.method2472();
                var6.method2472();
            }
            if (this.field3395 == 270) {
                var6.method2472();
                var6.method2472();
                var6.method2472();
            }
        }
        return var6;
    }
}
