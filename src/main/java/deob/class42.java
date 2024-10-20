package deob;

@ObfuscatedName("au")
public class class42 extends class187 {

    @ObfuscatedName("au.y")
    public static class176 field939 = new class176(64);

    @ObfuscatedName("au.d")
    public int field940 = 0;

    @ObfuscatedName("au.c")
    public int field941 = -1;

    @ObfuscatedName("au.r")
    public boolean field947 = true;

    @ObfuscatedName("au.f")
    public int field945 = -1;

    @ObfuscatedName("au.z")
    public int field944;

    @ObfuscatedName("au.o")
    public int field938;

    @ObfuscatedName("au.k")
    public int field946;

    @ObfuscatedName("au.s")
    public int field943;

    @ObfuscatedName("au.h")
    public int field948;

    @ObfuscatedName("au.m")
    public int field949;

    @ObfuscatedName("m.p(II)Lau;")
    public static class42 method139(int arg0) {
        class42 var1 = (class42) field939.method3198((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field942.method2811(4, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method827(new class110(var2), arg0);
        }
        var3.method821();
        field939.method3193(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.y(I)V")
    public void method821() {
        if (this.field945 != -1) {
            this.method816(this.field945);
            this.field943 = this.field944;
            this.field948 = this.field938;
            this.field949 = this.field946;
        }
        this.method816(this.field940);
    }

    @ObfuscatedName("au.d(Ldg;II)V")
    public void method827(class110 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2309();
            if (var3 == 0) {
                return;
            }
            this.method815(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("au.c(Ldg;III)V")
    public void method815(class110 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field940 = arg0.method2128();
        } else if (arg1 == 2) {
            this.field941 = arg0.method2309();
        } else if (arg1 == 5) {
            this.field947 = false;
        } else if (arg1 == 7) {
            this.field945 = arg0.method2128();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("au.r(II)V")
    public void method816(int arg0) {
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
        this.field944 = (int) (var18 * 256.0D);
        this.field938 = (int) (var14 * 256.0D);
        this.field946 = (int) (var16 * 256.0D);
        if (this.field938 < 0) {
            this.field938 = 0;
        } else if (this.field938 > 255) {
            this.field938 = 255;
        }
        if (this.field946 < 0) {
            this.field946 = 0;
        } else if (this.field946 > 255) {
            this.field946 = 255;
        }
    }

    @ObfuscatedName("aq.f(I)V")
    public static void method663() {
        field939.method3190();
    }
}
