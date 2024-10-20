package deob;

@ObfuscatedName("ki")
public class class263 extends class502 {

    @ObfuscatedName("ki.ay")
    public static class315 field2850 = new class315(64);

    @ObfuscatedName("ki.an")
    public int field2851 = 0;

    @ObfuscatedName("ki.au")
    public int field2856 = -1;

    @ObfuscatedName("ki.ax")
    public boolean field2852 = true;

    @ObfuscatedName("ki.ao")
    public int field2853 = -1;

    @ObfuscatedName("ki.am")
    public int field2854;

    @ObfuscatedName("ki.ac")
    public int field2855;

    @ObfuscatedName("ki.ae")
    public int field2848;

    @ObfuscatedName("ki.ad")
    public int field2857;

    @ObfuscatedName("ki.aq")
    public int field2858;

    @ObfuscatedName("ki.al")
    public int field2859;

    @ObfuscatedName("jd.ab(II)Lki;")
    public static class263 method4476(int arg0) {
        class263 var1 = (class263) field2850.method5586((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2849.method6670(4, arg0);
        class263 var3 = new class263();
        if (var2 != null) {
            var3.method4841(new class549(var2), arg0);
        }
        var3.method4840();
        field2850.method5589(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ki.ay(B)V")
    public void method4840() {
        if (this.field2853 != -1) {
            this.method4845(this.field2853);
            this.field2857 = this.field2854;
            this.field2858 = this.field2855;
            this.field2859 = this.field2848;
        }
        this.method4845(this.field2851);
    }

    @ObfuscatedName("ki.an(Lvg;II)V")
    public void method4841(class549 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method9025();
            if (var3 == 0) {
                return;
            }
            this.method4842(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ki.au(Lvg;IIB)V")
    public void method4842(class549 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2851 = arg0.method8801();
        } else if (arg1 == 2) {
            this.field2856 = arg0.method9025();
        } else if (arg1 == 5) {
            this.field2852 = false;
        } else if (arg1 == 7) {
            this.field2853 = arg0.method8801();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ki.ax(II)V")
    public void method4845(int arg0) {
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
        this.field2854 = (int) (var18 * 256.0D);
        this.field2855 = (int) (var14 * 256.0D);
        this.field2848 = (int) (var16 * 256.0D);
        if (this.field2855 < 0) {
            this.field2855 = 0;
        } else if (this.field2855 > 255) {
            this.field2855 = 255;
        }
        if (this.field2848 < 0) {
            this.field2848 = 0;
        } else if (this.field2848 > 255) {
            this.field2848 = 255;
        }
    }
}
