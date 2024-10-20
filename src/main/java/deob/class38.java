package deob;

@ObfuscatedName("ao")
public class class38 extends class174 {

    @ObfuscatedName("ao.n")
    public static class167 field944 = new class167(64);

    @ObfuscatedName("ao.u")
    public int field932 = 0;

    @ObfuscatedName("ao.t")
    public int field933 = -1;

    @ObfuscatedName("ao.e")
    public boolean field947 = true;

    @ObfuscatedName("ao.a")
    public int field935 = -1;

    @ObfuscatedName("ao.l")
    public int field936;

    @ObfuscatedName("ao.v")
    public int field937;

    @ObfuscatedName("ao.j")
    public int field934;

    @ObfuscatedName("ao.k")
    public int field939;

    @ObfuscatedName("ao.g")
    public int field940;

    @ObfuscatedName("ao.d")
    public int field941;

    @ObfuscatedName("em.z(II)Lao;")
    public static class38 method2928(int arg0) {
        class38 var1 = (class38) field944.method3183((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field938.method2768(4, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method797(new class104(var2), arg0);
        }
        var3.method796();
        field944.method3185(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.n(I)V")
    public void method796() {
        if (this.field935 != -1) {
            this.method806(this.field935);
            this.field939 = this.field936;
            this.field940 = this.field937;
            this.field941 = this.field934;
        }
        this.method806(this.field932);
    }

    @ObfuscatedName("ao.u(Lcj;II)V")
    public void method797(class104 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2257();
            if (var3 == 0) {
                return;
            }
            this.method798(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ao.t(Lcj;III)V")
    public void method798(class104 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field932 = arg0.method2167();
        } else if (arg1 == 2) {
            this.field933 = arg0.method2257();
        } else if (arg1 == 5) {
            this.field947 = false;
        } else if (arg1 == 7) {
            this.field935 = arg0.method2167();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ao.e(II)V")
    public void method806(int arg0) {
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
        this.field936 = (int) (var18 * 256.0D);
        this.field937 = (int) (var14 * 256.0D);
        this.field934 = (int) (var16 * 256.0D);
        if (this.field937 < 0) {
            this.field937 = 0;
        } else if (this.field937 > 255) {
            this.field937 = 255;
        }
        if (this.field934 < 0) {
            this.field934 = 0;
        } else if (this.field934 > 255) {
            this.field934 = 255;
        }
    }
}
