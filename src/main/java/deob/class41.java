package deob;

@ObfuscatedName("aw")
public class class41 extends class183 {

    @ObfuscatedName("aw.i")
    public static class172 field963 = new class172(64);

    @ObfuscatedName("aw.k")
    public int field964 = 0;

    @ObfuscatedName("aw.e")
    public int field965 = -1;

    @ObfuscatedName("aw.w")
    public boolean field966 = true;

    @ObfuscatedName("aw.m")
    public int field962 = -1;

    @ObfuscatedName("aw.u")
    public int field969;

    @ObfuscatedName("aw.j")
    public int field967;

    @ObfuscatedName("aw.o")
    public int field968;

    @ObfuscatedName("aw.h")
    public int field971;

    @ObfuscatedName("aw.b")
    public int field972;

    @ObfuscatedName("aw.r")
    public int field973;

    @ObfuscatedName("r.g(Leo;B)V")
    public static void method132(class147 arg0) {
        Statics.field970 = arg0;
    }

    @ObfuscatedName("t.i(IS)Law;")
    public static class41 method157(int arg0) {
        class41 var1 = (class41) field963.method3135((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field970.method2734(4, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method782(new class107(var2), arg0);
        }
        var3.method758();
        field963.method3140(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.k(S)V")
    public void method758() {
        if (this.field962 != -1) {
            this.method766(this.field962);
            this.field971 = this.field969;
            this.field972 = this.field967;
            this.field973 = this.field968;
        }
        this.method766(this.field964);
    }

    @ObfuscatedName("aw.e(Ldk;II)V")
    public void method782(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2092();
            if (var3 == 0) {
                return;
            }
            this.method760(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aw.w(Ldk;III)V")
    public void method760(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field964 = arg0.method2096();
        } else if (arg1 == 2) {
            this.field965 = arg0.method2092();
        } else if (arg1 == 5) {
            this.field966 = false;
        } else if (arg1 == 7) {
            this.field962 = arg0.method2096();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("aw.m(II)V")
    public void method766(int arg0) {
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
        this.field969 = (int) (var18 * 256.0D);
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

    @ObfuscatedName("aj.u(B)V")
    public static void method556() {
        field963.method3138();
    }
}
