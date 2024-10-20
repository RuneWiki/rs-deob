package deob;

@ObfuscatedName("aq")
public class class36 extends class172 {

    @ObfuscatedName("aq.e")
    public static class168 field921 = new class168(64);

    @ObfuscatedName("aq.n")
    public int field923 = 0;

    @ObfuscatedName("aq.j")
    public int field924 = -1;

    @ObfuscatedName("aq.i")
    public boolean field938 = true;

    @ObfuscatedName("aq.o")
    public int field926 = -1;

    @ObfuscatedName("aq.l")
    public int field922;

    @ObfuscatedName("aq.p")
    public int field927;

    @ObfuscatedName("aq.t")
    public int field929;

    @ObfuscatedName("aq.w")
    public int field930;

    @ObfuscatedName("aq.r")
    public int field931;

    @ObfuscatedName("aq.a")
    public int field932;

    @ObfuscatedName("e.g(Lez;I)V")
    public static void method13(class150 arg0) {
        Statics.field936 = arg0;
    }

    @ObfuscatedName("by.e(II)Laq;")
    public static class36 method1397(int arg0) {
        class36 var1 = (class36) field921.method3311((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field936.method3012(4, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method794(new class126(var2), arg0);
        }
        var3.method793();
        field921.method3314(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.n(I)V")
    public void method793() {
        if (this.field926 != -1) {
            this.method797(this.field926);
            this.field930 = this.field922;
            this.field931 = this.field927;
            this.field932 = this.field929;
        }
        this.method797(this.field923);
    }

    @ObfuscatedName("aq.j(Ldu;II)V")
    public void method794(class126 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2485();
            if (var3 == 0) {
                return;
            }
            this.method795(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aq.i(Ldu;III)V")
    public void method795(class126 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field923 = arg0.method2489();
        } else if (arg1 == 2) {
            this.field924 = arg0.method2485();
        } else if (arg1 == 5) {
            this.field938 = false;
        } else if (arg1 == 7) {
            this.field926 = arg0.method2489();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("aq.o(IB)V")
    public void method797(int arg0) {
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
        this.field922 = (int) (var18 * 256.0D);
        this.field927 = (int) (var14 * 256.0D);
        this.field929 = (int) (var16 * 256.0D);
        if (this.field927 < 0) {
            this.field927 = 0;
        } else if (this.field927 > 255) {
            this.field927 = 255;
        }
        if (this.field929 < 0) {
            this.field929 = 0;
        } else if (this.field929 > 255) {
            this.field929 = 255;
        }
    }
}
