package deob;

@ObfuscatedName("fz")
public class class182 extends class407 {

    @ObfuscatedName("fz.p")
    public static class257 field2011 = new class257(64);

    @ObfuscatedName("fz.f")
    public int field2008 = 0;

    @ObfuscatedName("fz.n")
    public int field2009;

    @ObfuscatedName("fz.k")
    public int field2006;

    @ObfuscatedName("fz.w")
    public int field2007;

    @ObfuscatedName("fz.s")
    public int field2010;

    @ObfuscatedName("ho.c(II)Lfz;")
    public static class182 method4616(int arg0) {
        class182 var1 = (class182) field2011.method4789((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2012.method5499(1, arg0);
        class182 var3 = new class182();
        if (var2 != null) {
            var3.method3321(new class445(var2), arg0);
        }
        var3.method3320();
        field2011.method4781(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fz.p(I)V")
    public void method3320() {
        this.method3322(this.field2008);
    }

    @ObfuscatedName("fz.f(Lqq;IB)V")
    public void method3321(class445 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method7196();
            if (var3 == 0) {
                return;
            }
            this.method3331(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("fz.n(Lqq;IIB)V")
    public void method3331(class445 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2008 = arg0.method7340();
        }
    }

    @ObfuscatedName("fz.k(IB)V")
    public void method3322(int arg0) {
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
        this.field2006 = (int) (var14 * 256.0D);
        this.field2007 = (int) (var16 * 256.0D);
        if (this.field2006 < 0) {
            this.field2006 = 0;
        } else if (this.field2006 > 255) {
            this.field2006 = 255;
        }
        if (this.field2007 < 0) {
            this.field2007 = 0;
        } else if (this.field2007 > 255) {
            this.field2007 = 255;
        }
        if (var16 > 0.5D) {
            this.field2010 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2010 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2010 < 1) {
            this.field2010 = 1;
        }
        this.field2009 = (int) ((double) this.field2010 * var18);
    }
}
