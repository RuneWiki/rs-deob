package deob;

@ObfuscatedName("at")
public class class37 extends class174 {

    @ObfuscatedName("at.p")
    public static class170 field911 = new class170(64);

    @ObfuscatedName("at.k")
    public int field912 = 0;

    @ObfuscatedName("at.a")
    public int field913 = -1;

    @ObfuscatedName("at.q")
    public boolean field914 = true;

    @ObfuscatedName("at.j")
    public int field915 = -1;

    @ObfuscatedName("at.v")
    public int field916;

    @ObfuscatedName("at.w")
    public int field917;

    @ObfuscatedName("at.l")
    public int field918;

    @ObfuscatedName("at.s")
    public int field919;

    @ObfuscatedName("at.n")
    public int field920;

    @ObfuscatedName("at.c")
    public int field921;

    @ObfuscatedName("j.x(Lej;B)V")
    public static void method33(class152 arg0) {
        Statics.field928 = arg0;
    }

    @ObfuscatedName("m.p(IB)Lat;")
    public static class37 method169(int arg0) {
        class37 var1 = (class37) field911.method3196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field928.method2920(4, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method763(new class127(var2), arg0);
        }
        var3.method762();
        field911.method3197(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.k(I)V")
    public void method762() {
        if (this.field915 != -1) {
            this.method777(this.field915);
            this.field919 = this.field916;
            this.field920 = this.field917;
            this.field921 = this.field918;
        }
        this.method777(this.field912);
    }

    @ObfuscatedName("at.a(Ldg;IB)V")
    public void method763(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2484();
            if (var3 == 0) {
                return;
            }
            this.method764(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("at.q(Ldg;III)V")
    public void method764(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field912 = arg0.method2403();
        } else if (arg1 == 2) {
            this.field913 = arg0.method2484();
        } else if (arg1 == 5) {
            this.field914 = false;
        } else if (arg1 == 7) {
            this.field915 = arg0.method2403();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("at.j(II)V")
    public void method777(int arg0) {
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
        this.field916 = (int) (var18 * 256.0D);
        this.field917 = (int) (var14 * 256.0D);
        this.field918 = (int) (var16 * 256.0D);
        if (this.field917 < 0) {
            this.field917 = 0;
        } else if (this.field917 > 255) {
            this.field917 = 255;
        }
        if (this.field918 < 0) {
            this.field918 = 0;
        } else if (this.field918 > 255) {
            this.field918 = 255;
        }
    }

    @ObfuscatedName("d.v(I)V")
    public static void method219() {
        field911.method3198();
    }
}
