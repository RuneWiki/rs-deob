package deob;

@ObfuscatedName("au")
public class class37 extends class174 {

    @ObfuscatedName("au.g")
    public static class170 field948 = new class170(64);

    @ObfuscatedName("au.a")
    public int field946 = 0;

    @ObfuscatedName("au.t")
    public int field938 = -1;

    @ObfuscatedName("au.f")
    public boolean field935 = true;

    @ObfuscatedName("au.c")
    public int field940 = -1;

    @ObfuscatedName("au.p")
    public int field941;

    @ObfuscatedName("au.s")
    public int field942;

    @ObfuscatedName("au.k")
    public int field943;

    @ObfuscatedName("au.m")
    public int field944;

    @ObfuscatedName("au.y")
    public int field937;

    @ObfuscatedName("au.b")
    public int field939;

    @ObfuscatedName("bi.d(II)Lau;")
    public static class37 method1242(int arg0) {
        class37 var1 = (class37) field948.method3210((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field936.method2958(4, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method764(new class127(var2), arg0);
        }
        var3.method763();
        field948.method3221(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.g(I)V")
    public void method763() {
        if (this.field940 != -1) {
            this.method780(this.field940);
            this.field944 = this.field941;
            this.field937 = this.field942;
            this.field939 = this.field943;
        }
        this.method780(this.field946);
    }

    @ObfuscatedName("au.a(Ldo;II)V")
    public void method764(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2509();
            if (var3 == 0) {
                return;
            }
            this.method765(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("au.t(Ldo;III)V")
    public void method765(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field946 = arg0.method2404();
        } else if (arg1 == 2) {
            this.field938 = arg0.method2509();
        } else if (arg1 == 5) {
            this.field935 = false;
        } else if (arg1 == 7) {
            this.field940 = arg0.method2404();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("au.f(II)V")
    public void method780(int arg0) {
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
        this.field941 = (int) (var18 * 256.0D);
        this.field942 = (int) (var14 * 256.0D);
        this.field943 = (int) (var16 * 256.0D);
        if (this.field942 < 0) {
            this.field942 = 0;
        } else if (this.field942 > 255) {
            this.field942 = 255;
        }
        if (this.field943 < 0) {
            this.field943 = 0;
        } else if (this.field943 > 255) {
            this.field943 = 255;
        }
    }
}
