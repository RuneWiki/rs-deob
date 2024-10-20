package deob;

@ObfuscatedName("ai")
public class class42 extends class204 {

    @ObfuscatedName("ai.l")
    public static class193 field943 = new class193(64);

    @ObfuscatedName("ai.y")
    public int field935 = 0;

    @ObfuscatedName("ai.u")
    public int field939;

    @ObfuscatedName("ai.k")
    public int field937;

    @ObfuscatedName("ai.j")
    public int field938;

    @ObfuscatedName("ai.i")
    public int field934;

    @ObfuscatedName("m.m(II)Lai;")
    public static class42 method1(int arg0) {
        class42 var1 = (class42) field943.method3537((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3143.method3080(1, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method858(new class119(var2), arg0);
        }
        var3.method857();
        field943.method3539(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.l(I)V")
    public void method857() {
        this.method876(this.field935);
    }

    @ObfuscatedName("ai.y(Ldx;IB)V")
    public void method858(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2562();
            if (var3 == 0) {
                return;
            }
            this.method859(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ai.u(Ldx;IIB)V")
    public void method859(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field935 = arg0.method2385();
        }
    }

    @ObfuscatedName("ai.k(II)V")
    public void method876(int arg0) {
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
        this.field937 = (int) (var14 * 256.0D);
        this.field938 = (int) (var16 * 256.0D);
        if (this.field937 < 0) {
            this.field937 = 0;
        } else if (this.field937 > 255) {
            this.field937 = 255;
        }
        if (this.field938 < 0) {
            this.field938 = 0;
        } else if (this.field938 > 255) {
            this.field938 = 255;
        }
        if (var16 > 0.5D) {
            this.field934 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field934 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field934 < 1) {
            this.field934 = 1;
        }
        this.field939 = (int) ((double) this.field934 * var18);
    }
}
