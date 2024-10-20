package deob;

@ObfuscatedName("as")
public class class36 extends class173 {

    @ObfuscatedName("as.f")
    public static class169 field920 = new class169(64);

    @ObfuscatedName("as.n")
    public int field924 = 0;

    @ObfuscatedName("as.c")
    public int field919 = -1;

    @ObfuscatedName("as.r")
    public boolean field916 = true;

    @ObfuscatedName("as.k")
    public int field921 = -1;

    @ObfuscatedName("as.e")
    public int field917;

    @ObfuscatedName("as.q")
    public int field923;

    @ObfuscatedName("as.u")
    public int field918;

    @ObfuscatedName("as.s")
    public int field925;

    @ObfuscatedName("as.l")
    public int field926;

    @ObfuscatedName("as.o")
    public int field922;

    @ObfuscatedName("v.v(II)Las;")
    public static class36 method2(int arg0) {
        class36 var1 = (class36) field920.method3224((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field927.method3020(4, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method786(new class126(var2), arg0);
        }
        var3.method785();
        field920.method3231(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.f(I)V")
    public void method785() {
        if (this.field921 != -1) {
            this.method808(this.field921);
            this.field925 = this.field917;
            this.field926 = this.field923;
            this.field922 = this.field918;
        }
        this.method808(this.field924);
    }

    @ObfuscatedName("as.n(Ldr;IB)V")
    public void method786(class126 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2466();
            if (var3 == 0) {
                return;
            }
            this.method787(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("as.c(Ldr;III)V")
    public void method787(class126 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field924 = arg0.method2470();
        } else if (arg1 == 2) {
            this.field919 = arg0.method2466();
        } else if (arg1 == 5) {
            this.field916 = false;
        } else if (arg1 == 7) {
            this.field921 = arg0.method2470();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("as.r(II)V")
    public void method808(int arg0) {
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
        this.field917 = (int) (var18 * 256.0D);
        this.field923 = (int) (var14 * 256.0D);
        this.field918 = (int) (var16 * 256.0D);
        if (this.field923 < 0) {
            this.field923 = 0;
        } else if (this.field923 > 255) {
            this.field923 = 255;
        }
        if (this.field918 < 0) {
            this.field918 = 0;
        } else if (this.field918 > 255) {
            this.field918 = 255;
        }
    }

    @ObfuscatedName("ai.k(B)V")
    public static void method818() {
        field920.method3227();
    }
}
