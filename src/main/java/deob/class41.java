package deob;

@ObfuscatedName("az")
public class class41 extends class183 {

    @ObfuscatedName("az.x")
    public static class172 field958 = new class172(64);

    @ObfuscatedName("az.k")
    public int field955 = 0;

    @ObfuscatedName("az.i")
    public int field953 = -1;

    @ObfuscatedName("az.d")
    public boolean field957 = true;

    @ObfuscatedName("az.q")
    public int field954 = -1;

    @ObfuscatedName("az.m")
    public int field959;

    @ObfuscatedName("az.a")
    public int field956;

    @ObfuscatedName("az.w")
    public int field961;

    @ObfuscatedName("az.e")
    public int field962;

    @ObfuscatedName("az.o")
    public int field963;

    @ObfuscatedName("az.v")
    public int field964;

    @ObfuscatedName("av.n(IB)Laz;")
    public static class41 method613(int arg0) {
        class41 var1 = (class41) field958.method3115((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field972.method2738(4, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method805(new class107(var2), arg0);
        }
        var3.method804();
        field958.method3117(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.x(I)V")
    public void method804() {
        if (this.field954 != -1) {
            this.method815(this.field954);
            this.field962 = this.field959;
            this.field963 = this.field956;
            this.field964 = this.field961;
        }
        this.method815(this.field955);
    }

    @ObfuscatedName("az.k(Ldw;IS)V")
    public void method805(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2148();
            if (var3 == 0) {
                return;
            }
            this.method806(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("az.i(Ldw;III)V")
    public void method806(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field955 = arg0.method2142();
        } else if (arg1 == 2) {
            this.field953 = arg0.method2148();
        } else if (arg1 == 5) {
            this.field957 = false;
        } else if (arg1 == 7) {
            this.field954 = arg0.method2142();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("az.d(II)V")
    public void method815(int arg0) {
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
        this.field959 = (int) (var18 * 256.0D);
        this.field956 = (int) (var14 * 256.0D);
        this.field961 = (int) (var16 * 256.0D);
        if (this.field956 < 0) {
            this.field956 = 0;
        } else if (this.field956 > 255) {
            this.field956 = 255;
        }
        if (this.field961 < 0) {
            this.field961 = 0;
        } else if (this.field961 > 255) {
            this.field961 = 255;
        }
    }
}
