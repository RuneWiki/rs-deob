package deob;

@ObfuscatedName("ar")
public class class41 extends class181 {

    @ObfuscatedName("ar.j")
    public static class171 field937 = new class171(64);

    @ObfuscatedName("ar.a")
    public int field946 = 0;

    @ObfuscatedName("ar.y")
    public int field933 = -1;

    @ObfuscatedName("ar.i")
    public boolean field940 = true;

    @ObfuscatedName("ar.b")
    public int field936 = -1;

    @ObfuscatedName("ar.s")
    public int field935;

    @ObfuscatedName("ar.q")
    public int field938;

    @ObfuscatedName("ar.p")
    public int field931;

    @ObfuscatedName("ar.h")
    public int field934;

    @ObfuscatedName("ar.r")
    public int field941;

    @ObfuscatedName("ar.o")
    public int field942;

    @ObfuscatedName("do.z(Ler;I)V")
    public static void method2416(class146 arg0) {
        Statics.field939 = arg0;
    }

    @ObfuscatedName("ag.j(IB)Lar;")
    public static class41 method566(int arg0) {
        class41 var1 = (class41) field937.method3162((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field939.method2705(4, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method790(new class107(var2), arg0);
        }
        var3.method768();
        field937.method3171(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.a(I)V")
    public void method768() {
        if (this.field936 != -1) {
            this.method769(this.field936);
            this.field934 = this.field935;
            this.field941 = this.field938;
            this.field942 = this.field931;
        }
        this.method769(this.field946);
    }

    @ObfuscatedName("ar.y(Ldq;IB)V")
    public void method790(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2122();
            if (var3 == 0) {
                return;
            }
            this.method770(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ar.i(Ldq;IIB)V")
    public void method770(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field946 = arg0.method2212();
        } else if (arg1 == 2) {
            this.field933 = arg0.method2122();
        } else if (arg1 == 5) {
            this.field940 = false;
        } else if (arg1 == 7) {
            this.field936 = arg0.method2212();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ar.b(IB)V")
    public void method769(int arg0) {
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
        this.field935 = (int) (var18 * 256.0D);
        this.field938 = (int) (var14 * 256.0D);
        this.field931 = (int) (var16 * 256.0D);
        if (this.field938 < 0) {
            this.field938 = 0;
        } else if (this.field938 > 255) {
            this.field938 = 255;
        }
        if (this.field931 < 0) {
            this.field931 = 0;
        } else if (this.field931 > 255) {
            this.field931 = 255;
        }
    }
}
