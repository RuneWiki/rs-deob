package deob;

@ObfuscatedName("ah")
public class class37 extends class174 {

    @ObfuscatedName("ah.e")
    public static class170 field933 = new class170(64);

    @ObfuscatedName("ah.a")
    public int field930 = 0;

    @ObfuscatedName("ah.h")
    public int field937 = -1;

    @ObfuscatedName("ah.y")
    public boolean field932 = true;

    @ObfuscatedName("ah.j")
    public int field938 = -1;

    @ObfuscatedName("ah.l")
    public int field935;

    @ObfuscatedName("ah.f")
    public int field936;

    @ObfuscatedName("ah.n")
    public int field929;

    @ObfuscatedName("ah.k")
    public int field931;

    @ObfuscatedName("ah.q")
    public int field939;

    @ObfuscatedName("ah.w")
    public int field940;

    @ObfuscatedName("f.p(Leu;I)V")
    public static void method62(class153 arg0) {
        Statics.field942 = arg0;
    }

    @ObfuscatedName("ag.e(II)Lah;")
    public static class37 method754(int arg0) {
        class37 var1 = (class37) field933.method3266((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field942.method3048(4, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method801(new class127(var2), arg0);
        }
        var3.method809();
        field933.method3268(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.a(I)V")
    public void method809() {
        if (this.field938 != -1) {
            this.method814(this.field938);
            this.field931 = this.field935;
            this.field939 = this.field936;
            this.field940 = this.field929;
        }
        this.method814(this.field930);
    }

    @ObfuscatedName("ah.h(Ldj;II)V")
    public void method801(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2494();
            if (var3 == 0) {
                return;
            }
            this.method802(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ah.y(Ldj;IIB)V")
    public void method802(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field930 = arg0.method2498();
        } else if (arg1 == 2) {
            this.field937 = arg0.method2494();
        } else if (arg1 == 5) {
            this.field932 = false;
        } else if (arg1 == 7) {
            this.field938 = arg0.method2498();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ah.j(II)V")
    public void method814(int arg0) {
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
        this.field936 = (int) (var14 * 256.0D);
        this.field929 = (int) (var16 * 256.0D);
        if (this.field936 < 0) {
            this.field936 = 0;
        } else if (this.field936 > 255) {
            this.field936 = 255;
        }
        if (this.field929 < 0) {
            this.field929 = 0;
        } else if (this.field929 > 255) {
            this.field929 = 255;
        }
    }
}
