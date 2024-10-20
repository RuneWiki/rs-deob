package deob;

@ObfuscatedName("ap")
public class class37 extends class174 {

    @ObfuscatedName("ap.c")
    public static class170 field938 = new class170(64);

    @ObfuscatedName("ap.j")
    public int field939 = 0;

    @ObfuscatedName("ap.i")
    public int field948 = -1;

    @ObfuscatedName("ap.k")
    public boolean field946 = true;

    @ObfuscatedName("ap.q")
    public int field942 = -1;

    @ObfuscatedName("ap.t")
    public int field943;

    @ObfuscatedName("ap.v")
    public int field944;

    @ObfuscatedName("ap.y")
    public int field945;

    @ObfuscatedName("ap.w")
    public int field947;

    @ObfuscatedName("ap.g")
    public int field940;

    @ObfuscatedName("ap.s")
    public int field949;

    @ObfuscatedName("j.b(Leo;B)V")
    public static void method22(class153 arg0) {
        Statics.field941 = arg0;
    }

    @ObfuscatedName("p.c(II)Lap;")
    public static class37 method232(int arg0) {
        class37 var1 = (class37) field938.method3188((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field941.method2964(4, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method769(new class127(var2), arg0);
        }
        var3.method790();
        field938.method3190(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.j(B)V")
    public void method790() {
        if (this.field942 != -1) {
            this.method771(this.field942);
            this.field947 = this.field943;
            this.field940 = this.field944;
            this.field949 = this.field945;
        }
        this.method771(this.field939);
    }

    @ObfuscatedName("ap.i(Ldv;II)V")
    public void method769(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2416();
            if (var3 == 0) {
                return;
            }
            this.method784(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ap.k(Ldv;III)V")
    public void method784(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field939 = arg0.method2400();
        } else if (arg1 == 2) {
            this.field948 = arg0.method2416();
        } else if (arg1 == 5) {
            this.field946 = false;
        } else if (arg1 == 7) {
            this.field942 = arg0.method2400();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ap.q(IB)V")
    public void method771(int arg0) {
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
        this.field943 = (int) (var18 * 256.0D);
        this.field944 = (int) (var14 * 256.0D);
        this.field945 = (int) (var16 * 256.0D);
        if (this.field944 < 0) {
            this.field944 = 0;
        } else if (this.field944 > 255) {
            this.field944 = 255;
        }
        if (this.field945 < 0) {
            this.field945 = 0;
        } else if (this.field945 > 255) {
            this.field945 = 255;
        }
    }

    @ObfuscatedName("ag.t(B)V")
    public static void method617() {
        field938.method3191();
    }
}
