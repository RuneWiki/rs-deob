package deob;

@ObfuscatedName("jv")
public class class252 extends class502 {

    @ObfuscatedName("jv.ay")
    public static class315 field2660 = new class315(64);

    @ObfuscatedName("jv.an")
    public int field2662 = 0;

    @ObfuscatedName("jv.au")
    public int field2663;

    @ObfuscatedName("jv.ax")
    public int field2661;

    @ObfuscatedName("jv.ao")
    public int field2666;

    @ObfuscatedName("jv.am")
    public int field2665;

    @ObfuscatedName("gk.ab(II)Ljv;")
    public static class252 method3281(int arg0) {
        class252 var1 = (class252) field2660.method5586((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2664.method6670(1, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4602(new class549(var2), arg0);
        }
        var3.method4601();
        field2660.method5589(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jv.ay(I)V")
    public void method4601() {
        this.method4607(this.field2662);
    }

    @ObfuscatedName("jv.an(Lvg;IB)V")
    public void method4602(class549 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method9025();
            if (var3 == 0) {
                return;
            }
            this.method4603(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jv.au(Lvg;III)V")
    public void method4603(class549 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2662 = arg0.method8801();
        }
    }

    @ObfuscatedName("jv.ax(IB)V")
    public void method4607(int arg0) {
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        this.field2661 = (int) (var14 * 256.0D);
        this.field2666 = (int) (var16 * 256.0D);
        if (this.field2661 < 0) {
            this.field2661 = 0;
        } else if (this.field2661 > 255) {
            this.field2661 = 255;
        }
        if (this.field2666 < 0) {
            this.field2666 = 0;
        } else if (this.field2666 > 255) {
            this.field2666 = 255;
        }
        if (var16 > 0.5D) {
            this.field2665 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2665 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2665 < 1) {
            this.field2665 = 1;
        }
        this.field2663 = (int) ((double) this.field2665 * var18);
    }
}
