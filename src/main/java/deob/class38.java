package deob;

@ObfuscatedName("ai")
public class class38 extends class176 {

    @ObfuscatedName("ai.i")
    public static class172 field970 = new class172(64);

    @ObfuscatedName("ai.k")
    public int field961 = 0;

    @ObfuscatedName("ai.q")
    public int field963 = -1;

    @ObfuscatedName("ai.j")
    public boolean field964 = true;

    @ObfuscatedName("ai.z")
    public int field968 = -1;

    @ObfuscatedName("ai.m")
    public int field966;

    @ObfuscatedName("ai.w")
    public int field967;

    @ObfuscatedName("ai.a")
    public int field972;

    @ObfuscatedName("ai.d")
    public int field969;

    @ObfuscatedName("ai.u")
    public int field965;

    @ObfuscatedName("ai.p")
    public int field971;

    @ObfuscatedName("cc.e(Lea;B)V")
    public static void method2129(class155 arg0) {
        Statics.field960 = arg0;
    }

    @ObfuscatedName("g.i(IB)Lai;")
    public static class38 method156(int arg0) {
        class38 var1 = (class38) field970.method3262((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field960.method3069(4, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method840(new class128(var2), arg0);
        }
        var3.method839();
        field970.method3264(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.k(B)V")
    public void method839() {
        if (this.field968 != -1) {
            this.method838(this.field968);
            this.field969 = this.field966;
            this.field965 = this.field967;
            this.field971 = this.field972;
        }
        this.method838(this.field961);
    }

    @ObfuscatedName("ai.q(Ldl;II)V")
    public void method840(class128 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2548();
            if (var3 == 0) {
                return;
            }
            this.method841(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ai.j(Ldl;IIB)V")
    public void method841(class128 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field961 = arg0.method2558();
        } else if (arg1 == 2) {
            this.field963 = arg0.method2548();
        } else if (arg1 == 5) {
            this.field964 = false;
        } else if (arg1 == 7) {
            this.field968 = arg0.method2558();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ai.z(IB)V")
    public void method838(int arg0) {
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
        this.field972 = (int) (var16 * 256.0D);
        if (this.field967 < 0) {
            this.field967 = 0;
        } else if (this.field967 > 255) {
            this.field967 = 255;
        }
        if (this.field972 < 0) {
            this.field972 = 0;
        } else if (this.field972 > 255) {
            this.field972 = 255;
        }
    }
}
