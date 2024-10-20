package deob;

@ObfuscatedName("aa")
public class class37 extends class174 {

    @ObfuscatedName("aa.e")
    public static class170 field923 = new class170(64);

    @ObfuscatedName("aa.g")
    public int field920 = 0;

    @ObfuscatedName("aa.o")
    public int field931 = -1;

    @ObfuscatedName("aa.a")
    public boolean field926 = true;

    @ObfuscatedName("aa.h")
    public int field924 = -1;

    @ObfuscatedName("aa.j")
    public int field925;

    @ObfuscatedName("aa.f")
    public int field933;

    @ObfuscatedName("aa.q")
    public int field919;

    @ObfuscatedName("aa.l")
    public int field927;

    @ObfuscatedName("aa.d")
    public int field928;

    @ObfuscatedName("aa.z")
    public int field929;

    @ObfuscatedName("z.b(Lej;I)V")
    public static void method112(class153 arg0) {
        Statics.field922 = arg0;
    }

    @ObfuscatedName("aa.e(I)V")
    public void method778() {
        if (this.field924 != -1) {
            this.method773(this.field924);
            this.field927 = this.field925;
            this.field928 = this.field933;
            this.field929 = this.field919;
        }
        this.method773(this.field920);
    }

    @ObfuscatedName("aa.g(Ldv;II)V")
    public void method780(class126 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2436();
            if (var3 == 0) {
                return;
            }
            this.method772(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aa.o(Ldv;III)V")
    public void method772(class126 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field920 = arg0.method2440();
        } else if (arg1 == 2) {
            this.field931 = arg0.method2436();
        } else if (arg1 == 5) {
            this.field926 = false;
        } else if (arg1 == 7) {
            this.field924 = arg0.method2440();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("aa.a(IB)V")
    public void method773(int arg0) {
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
        this.field925 = (int) (var18 * 256.0D);
        this.field933 = (int) (var14 * 256.0D);
        this.field919 = (int) (var16 * 256.0D);
        if (this.field933 < 0) {
            this.field933 = 0;
        } else if (this.field933 > 255) {
            this.field933 = 255;
        }
        if (this.field919 < 0) {
            this.field919 = 0;
        } else if (this.field919 > 255) {
            this.field919 = 255;
        }
    }
}
