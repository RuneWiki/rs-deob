package deob;

@ObfuscatedName("af")
public class class43 extends class195 {

    @ObfuscatedName("af.l")
    public static class184 field981 = new class184(64);

    @ObfuscatedName("af.g")
    public int field983 = 0;

    @ObfuscatedName("af.u")
    public int field982 = -1;

    @ObfuscatedName("af.q")
    public boolean field985 = true;

    @ObfuscatedName("af.r")
    public int field993 = -1;

    @ObfuscatedName("af.v")
    public int field987;

    @ObfuscatedName("af.y")
    public int field988;

    @ObfuscatedName("af.k")
    public int field986;

    @ObfuscatedName("af.c")
    public int field992;

    @ObfuscatedName("af.j")
    public int field991;

    @ObfuscatedName("af.m")
    public int field990;

    @ObfuscatedName("cx.o(Lfg;I)V")
    public static void method2030(class158 arg0) {
        Statics.field984 = arg0;
    }

    @ObfuscatedName("i.l(IB)Laf;")
    public static class43 method164(int arg0) {
        class43 var1 = (class43) field981.method3401((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field984.method2940(4, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method865(new class111(var2), arg0);
        }
        var3.method878();
        field981.method3403(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.g(B)V")
    public void method878() {
        if (this.field993 != -1) {
            this.method867(this.field993);
            this.field992 = this.field987;
            this.field991 = this.field988;
            this.field990 = this.field986;
        }
        this.method867(this.field983);
    }

    @ObfuscatedName("af.u(Ldk;IB)V")
    public void method865(class111 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2219();
            if (var3 == 0) {
                return;
            }
            this.method881(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("af.q(Ldk;III)V")
    public void method881(class111 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field983 = arg0.method2258();
        } else if (arg1 == 2) {
            this.field982 = arg0.method2219();
        } else if (arg1 == 5) {
            this.field985 = false;
        } else if (arg1 == 7) {
            this.field993 = arg0.method2258();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("af.r(IB)V")
    public void method867(int arg0) {
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
        this.field987 = (int) (var18 * 256.0D);
        this.field988 = (int) (var14 * 256.0D);
        this.field986 = (int) (var16 * 256.0D);
        if (this.field988 < 0) {
            this.field988 = 0;
        } else if (this.field988 > 255) {
            this.field988 = 255;
        }
        if (this.field986 < 0) {
            this.field986 = 0;
        } else if (this.field986 > 255) {
            this.field986 = 255;
        }
    }

    @ObfuscatedName("u.v(I)V")
    public static void method29() {
        field981.method3404();
    }
}
