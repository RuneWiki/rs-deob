package deob;

@ObfuscatedName("ac")
public class class42 extends class187 {

    @ObfuscatedName("ac.e")
    public static class176 field965 = new class176(64);

    @ObfuscatedName("ac.i")
    public int field962 = 0;

    @ObfuscatedName("ac.k")
    public int field963 = -1;

    @ObfuscatedName("ac.h")
    public boolean field973 = true;

    @ObfuscatedName("ac.p")
    public int field971 = -1;

    @ObfuscatedName("ac.n")
    public int field966;

    @ObfuscatedName("ac.o")
    public int field967;

    @ObfuscatedName("ac.g")
    public int field968;

    @ObfuscatedName("ac.z")
    public int field961;

    @ObfuscatedName("ac.t")
    public int field970;

    @ObfuscatedName("ac.y")
    public int field969;

    @ObfuscatedName("co.b(Lex;B)V")
    public static void method2060(class151 arg0) {
        Statics.field964 = arg0;
    }

    @ObfuscatedName("i.e(IB)Lac;")
    public static class42 method23(int arg0) {
        class42 var1 = (class42) field965.method3218((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field964.method2761(4, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method806(new class110(var2), arg0);
        }
        var3.method805();
        field965.method3220(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.i(I)V")
    public void method805() {
        if (this.field971 != -1) {
            this.method811(this.field971);
            this.field961 = this.field966;
            this.field970 = this.field967;
            this.field969 = this.field968;
        }
        this.method811(this.field962);
    }

    @ObfuscatedName("ac.k(Ldc;II)V")
    public void method806(class110 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2142();
            if (var3 == 0) {
                return;
            }
            this.method807(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ac.h(Ldc;III)V")
    public void method807(class110 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field962 = arg0.method2146();
        } else if (arg1 == 2) {
            this.field963 = arg0.method2142();
        } else if (arg1 == 5) {
            this.field973 = false;
        } else if (arg1 == 7) {
            this.field971 = arg0.method2146();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ac.p(II)V")
    public void method811(int arg0) {
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
        this.field966 = (int) (var18 * 256.0D);
        this.field967 = (int) (var14 * 256.0D);
        this.field968 = (int) (var16 * 256.0D);
        if (this.field967 < 0) {
            this.field967 = 0;
        } else if (this.field967 > 255) {
            this.field967 = 255;
        }
        if (this.field968 < 0) {
            this.field968 = 0;
        } else if (this.field968 > 255) {
            this.field968 = 255;
        }
    }
}
