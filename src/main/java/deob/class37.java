package deob;

@ObfuscatedName("aa")
public class class37 extends class174 {

    @ObfuscatedName("aa.i")
    public static class170 field943 = new class170(64);

    @ObfuscatedName("aa.o")
    public int field946 = 0;

    @ObfuscatedName("aa.n")
    public int field947 = -1;

    @ObfuscatedName("aa.l")
    public boolean field945 = true;

    @ObfuscatedName("aa.v")
    public int field942 = -1;

    @ObfuscatedName("aa.g")
    public int field957;

    @ObfuscatedName("aa.x")
    public int field948;

    @ObfuscatedName("aa.c")
    public int field949;

    @ObfuscatedName("aa.f")
    public int field958;

    @ObfuscatedName("aa.r")
    public int field951;

    @ObfuscatedName("aa.d")
    public int field952;

    @ObfuscatedName("di.p(Lep;I)V")
    public static void method2248(class152 arg0) {
        Statics.field950 = arg0;
    }

    @ObfuscatedName("bi.i(IB)Laa;")
    public static class37 method1388(int arg0) {
        class37 var1 = (class37) field943.method3264((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field950.method3049(4, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method820(new class127(var2), arg0);
        }
        var3.method819();
        field943.method3269(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.o(I)V")
    public void method819() {
        if (this.field942 != -1) {
            this.method822(this.field942);
            this.field958 = this.field957;
            this.field951 = this.field948;
            this.field952 = this.field949;
        }
        this.method822(this.field946);
    }

    @ObfuscatedName("aa.n(Ldt;II)V")
    public void method820(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2659();
            if (var3 == 0) {
                return;
            }
            this.method821(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aa.l(Ldt;IIB)V")
    public void method821(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field946 = arg0.method2595();
        } else if (arg1 == 2) {
            this.field947 = arg0.method2659();
        } else if (arg1 == 5) {
            this.field945 = false;
        } else if (arg1 == 7) {
            this.field942 = arg0.method2595();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("aa.v(IB)V")
    public void method822(int arg0) {
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
        this.field957 = (int) (var18 * 256.0D);
        this.field948 = (int) (var14 * 256.0D);
        this.field949 = (int) (var16 * 256.0D);
        if (this.field948 < 0) {
            this.field948 = 0;
        } else if (this.field948 > 255) {
            this.field948 = 255;
        }
        if (this.field949 < 0) {
            this.field949 = 0;
        } else if (this.field949 > 255) {
            this.field949 = 255;
        }
    }
}
