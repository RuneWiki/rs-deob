package deob;

@ObfuscatedName("aa")
public class class37 extends class174 {

    @ObfuscatedName("aa.r")
    public static class170 field919 = new class170(64);

    @ObfuscatedName("aa.u")
    public int field920 = 0;

    @ObfuscatedName("aa.t")
    public int field925 = -1;

    @ObfuscatedName("aa.k")
    public boolean field922 = true;

    @ObfuscatedName("aa.x")
    public int field928 = -1;

    @ObfuscatedName("aa.v")
    public int field924;

    @ObfuscatedName("aa.g")
    public int field918;

    @ObfuscatedName("aa.n")
    public int field926;

    @ObfuscatedName("aa.q")
    public int field927;

    @ObfuscatedName("aa.i")
    public int field933;

    @ObfuscatedName("aa.p")
    public int field929;

    @ObfuscatedName("ab.a(II)Laa;")
    public static class37 method619(int arg0) {
        class37 var1 = (class37) field919.method3208((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field921.method2943(4, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method728(new class126(var2), arg0);
        }
        var3.method727();
        field919.method3210(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.r(I)V")
    public void method727() {
        if (this.field928 != -1) {
            this.method741(this.field928);
            this.field927 = this.field924;
            this.field933 = this.field918;
            this.field929 = this.field926;
        }
        this.method741(this.field920);
    }

    @ObfuscatedName("aa.u(Ldf;II)V")
    public void method728(class126 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2481();
            if (var3 == 0) {
                return;
            }
            this.method729(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aa.t(Ldf;III)V")
    public void method729(class126 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field920 = arg0.method2382();
        } else if (arg1 == 2) {
            this.field925 = arg0.method2481();
        } else if (arg1 == 5) {
            this.field922 = false;
        } else if (arg1 == 7) {
            this.field928 = arg0.method2382();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("aa.k(II)V")
    public void method741(int arg0) {
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
        this.field924 = (int) (var18 * 256.0D);
        this.field918 = (int) (var14 * 256.0D);
        this.field926 = (int) (var16 * 256.0D);
        if (this.field918 < 0) {
            this.field918 = 0;
        } else if (this.field918 > 255) {
            this.field918 = 255;
        }
        if (this.field926 < 0) {
            this.field926 = 0;
        } else if (this.field926 > 255) {
            this.field926 = 255;
        }
    }

    @ObfuscatedName("cn.x(I)V")
    public static void method2077() {
        field919.method3216();
    }
}
