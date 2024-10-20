package deob;

@ObfuscatedName("ai")
public class class37 extends class183 {

    @ObfuscatedName("ai.x")
    public static class172 field890 = new class172(64);

    @ObfuscatedName("ai.k")
    public int field895 = 0;

    @ObfuscatedName("ai.i")
    public int field892;

    @ObfuscatedName("ai.d")
    public int field893;

    @ObfuscatedName("ai.q")
    public int field894;

    @ObfuscatedName("ai.m")
    public int field889;

    @ObfuscatedName("j.n(II)Lai;")
    public static class37 method155(int arg0) {
        class37 var1 = (class37) field890.method3115((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field898.method2738(1, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method696(new class107(var2), arg0);
        }
        var3.method702();
        field890.method3117(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.x(B)V")
    public void method702() {
        this.method697(this.field895);
    }

    @ObfuscatedName("ai.k(Ldw;II)V")
    public void method696(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2148();
            if (var3 == 0) {
                return;
            }
            this.method698(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ai.i(Ldw;III)V")
    public void method698(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field895 = arg0.method2142();
        }
    }

    @ObfuscatedName("ai.d(II)V")
    public void method697(int arg0) {
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
        this.field893 = (int) (var14 * 256.0D);
        this.field894 = (int) (var16 * 256.0D);
        if (this.field893 < 0) {
            this.field893 = 0;
        } else if (this.field893 > 255) {
            this.field893 = 255;
        }
        if (this.field894 < 0) {
            this.field894 = 0;
        } else if (this.field894 > 255) {
            this.field894 = 255;
        }
        if (var16 > 0.5D) {
            this.field889 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field889 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field889 < 1) {
            this.field889 = 1;
        }
        this.field892 = (int) ((double) this.field889 * var18);
    }
}
