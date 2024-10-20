package deob;

@ObfuscatedName("jn")
public class class251 extends class502 {

    @ObfuscatedName("jn.an")
    public static class315 field2658 = new class315(64);

    @ObfuscatedName("jn.au")
    public static class315 field2646 = new class315(30);

    @ObfuscatedName("jn.ax")
    public int field2647;

    @ObfuscatedName("jn.ao")
    public int field2648;

    @ObfuscatedName("jn.am")
    public int field2649 = -1;

    @ObfuscatedName("jn.ac")
    public short[] field2650;

    @ObfuscatedName("jn.ae")
    public short[] field2651;

    @ObfuscatedName("jn.ad")
    public short[] field2644;

    @ObfuscatedName("jn.aq")
    public short[] field2653;

    @ObfuscatedName("jn.al")
    public int field2654 = 128;

    @ObfuscatedName("jn.aj")
    public int field2655 = 128;

    @ObfuscatedName("jn.as")
    public int field2656 = 0;

    @ObfuscatedName("jn.aw")
    public int field2657 = 0;

    @ObfuscatedName("jn.af")
    public int field2652 = 0;

    @ObfuscatedName("la.ab(II)Ljn;")
    public static class251 method5487(int arg0) {
        class251 var1 = (class251) field2658.method5586((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2645.method6670(13, arg0);
        class251 var3 = new class251();
        var3.field2647 = arg0;
        if (var2 != null) {
            var3.method4582(new class549(var2));
        }
        field2658.method5589(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jn.ay(Lvg;B)V")
    public void method4582(class549 arg0) {
        while (true) {
            int var2 = arg0.method9025();
            if (var2 == 0) {
                return;
            }
            this.method4599(arg0, var2);
        }
    }

    @ObfuscatedName("jn.an(Lvg;II)V")
    public void method4599(class549 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2648 = arg0.method8968();
        } else if (arg1 == 2) {
            this.field2649 = arg0.method8968();
        } else if (arg1 == 4) {
            this.field2654 = arg0.method8968();
        } else if (arg1 == 5) {
            this.field2655 = arg0.method8968();
        } else if (arg1 == 6) {
            this.field2656 = arg0.method8968();
        } else if (arg1 == 7) {
            this.field2657 = arg0.method9025();
        } else if (arg1 == 8) {
            this.field2652 = arg0.method9025();
        } else if (arg1 == 40) {
            int var3 = arg0.method9025();
            this.field2650 = new short[var3];
            this.field2651 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2650[var4] = (short) arg0.method8968();
                this.field2651[var4] = (short) arg0.method8968();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method9025();
            this.field2644 = new short[var5];
            this.field2653 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2644[var6] = (short) arg0.method8968();
                this.field2653[var6] = (short) arg0.method8968();
            }
        }
    }

    @ObfuscatedName("jn.au(II)Lhr;")
    public final class197 method4597(int arg0) {
        class197 var2 = this.method4585();
        if (var2 == null) {
            return null;
        }
        class197 var3;
        if (this.field2649 == -1 || arg0 == -1) {
            var3 = var2.method3906(true);
        } else {
            var3 = class264.method3551(this.field2649).method4871(var2, arg0);
        }
        if (this.field2654 != 128 || this.field2655 != 128) {
            var3.method3925(this.field2654, this.field2655, this.field2654);
        }
        if (this.field2656 != 0) {
            if (this.field2656 == 90) {
                var3.method3920();
            }
            if (this.field2656 == 180) {
                var3.method3920();
                var3.method3920();
            }
            if (this.field2656 == 270) {
                var3.method3920();
                var3.method3920();
                var3.method3920();
            }
        }
        return var3;
    }

    @ObfuscatedName("jn.ax(B)Lhr;")
    public final class197 method4585() {
        class197 var1 = (class197) field2646.method5586((long) this.field2647);
        if (var1 == null) {
            class176 var2 = class176.method3343(Statics.field2659, this.field2648, 0);
            if (var2 == null) {
                return null;
            }
            if (this.field2650 != null) {
                for (int var3 = 0; var3 < this.field2650.length; var3++) {
                    var2.method3350(this.field2650[var3], this.field2651[var3]);
                }
            }
            if (this.field2644 != null) {
                for (int var4 = 0; var4 < this.field2644.length; var4++) {
                    var2.method3360(this.field2644[var4], this.field2653[var4]);
                }
            }
            var1 = var2.method3424(this.field2657 + 64, this.field2652 + 850, -30, -50, -30);
            field2646.method5589(var1, (long) this.field2647);
        }
        return var1;
    }
}
