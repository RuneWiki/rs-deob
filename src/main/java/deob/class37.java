package deob;

@ObfuscatedName("ae")
public class class37 extends class174 {

    @ObfuscatedName("ae.q")
    public static class170 field954 = new class170(64);

    @ObfuscatedName("ae.y")
    public int field955 = 0;

    @ObfuscatedName("ae.v")
    public int field959 = -1;

    @ObfuscatedName("ae.g")
    public boolean field958 = true;

    @ObfuscatedName("ae.x")
    public int field967 = -1;

    @ObfuscatedName("ae.u")
    public int field953;

    @ObfuscatedName("ae.l")
    public int field960;

    @ObfuscatedName("ae.a")
    public int field961;

    @ObfuscatedName("ae.h")
    public int field956;

    @ObfuscatedName("ae.t")
    public int field963;

    @ObfuscatedName("ae.m")
    public int field964;

    @ObfuscatedName("v.c(IB)Lae;")
    public static class37 method30(int arg0) {
        class37 var1 = (class37) field954.method3097((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field957.method2886(4, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method756(new class127(var2), arg0);
        }
        var3.method768();
        field954.method3092(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.q(I)V")
    public void method768() {
        if (this.field967 != -1) {
            this.method758(this.field967);
            this.field956 = this.field953;
            this.field963 = this.field960;
            this.field964 = this.field961;
        }
        this.method758(this.field955);
    }

    @ObfuscatedName("ae.y(Ldg;IB)V")
    public void method756(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2383();
            if (var3 == 0) {
                return;
            }
            this.method757(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ae.v(Ldg;III)V")
    public void method757(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field955 = arg0.method2322();
        } else if (arg1 == 2) {
            this.field959 = arg0.method2383();
        } else if (arg1 == 5) {
            this.field958 = false;
        } else if (arg1 == 7) {
            this.field967 = arg0.method2322();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ae.g(IB)V")
    public void method758(int arg0) {
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
        this.field953 = (int) (var18 * 256.0D);
        this.field960 = (int) (var14 * 256.0D);
        this.field961 = (int) (var16 * 256.0D);
        if (this.field960 < 0) {
            this.field960 = 0;
        } else if (this.field960 > 255) {
            this.field960 = 255;
        }
        if (this.field961 < 0) {
            this.field961 = 0;
        } else if (this.field961 > 255) {
            this.field961 = 255;
        }
    }
}
