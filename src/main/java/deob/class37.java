package deob;

@ObfuscatedName("af")
public class class37 extends class174 {

    @ObfuscatedName("af.w")
    public static class170 field950 = new class170(64);

    @ObfuscatedName("af.f")
    public int field944 = 0;

    @ObfuscatedName("af.e")
    public int field945 = -1;

    @ObfuscatedName("af.t")
    public boolean field946 = true;

    @ObfuscatedName("af.d")
    public int field947 = -1;

    @ObfuscatedName("af.p")
    public int field948;

    @ObfuscatedName("af.k")
    public int field949;

    @ObfuscatedName("af.r")
    public int field958;

    @ObfuscatedName("af.l")
    public int field942;

    @ObfuscatedName("af.a")
    public int field952;

    @ObfuscatedName("af.z")
    public int field953;

    @ObfuscatedName("d.i(Leg;B)V")
    public static void method42(class152 arg0) {
        Statics.field956 = arg0;
    }

    @ObfuscatedName("ay.w(IS)Laf;")
    public static class37 method1144(int arg0) {
        class37 var1 = (class37) field950.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field956.method2970(4, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method786(new class127(var2), arg0);
        }
        var3.method785();
        field950.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.f(I)V")
    public void method785() {
        if (this.field947 != -1) {
            this.method788(this.field947);
            this.field942 = this.field948;
            this.field952 = this.field949;
            this.field953 = this.field958;
        }
        this.method788(this.field944);
    }

    @ObfuscatedName("af.e(Ldz;II)V")
    public void method786(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2472();
            if (var3 == 0) {
                return;
            }
            this.method787(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("af.t(Ldz;III)V")
    public void method787(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field944 = arg0.method2608();
        } else if (arg1 == 2) {
            this.field945 = arg0.method2472();
        } else if (arg1 == 5) {
            this.field946 = false;
        } else if (arg1 == 7) {
            this.field947 = arg0.method2608();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("af.d(II)V")
    public void method788(int arg0) {
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
        this.field948 = (int) (var18 * 256.0D);
        this.field949 = (int) (var14 * 256.0D);
        this.field958 = (int) (var16 * 256.0D);
        if (this.field949 < 0) {
            this.field949 = 0;
        } else if (this.field949 > 255) {
            this.field949 = 255;
        }
        if (this.field958 < 0) {
            this.field958 = 0;
        } else if (this.field958 > 255) {
            this.field958 = 255;
        }
    }

    @ObfuscatedName("fq.p(B)V")
    public static void method3141() {
        field950.method3243();
    }
}
