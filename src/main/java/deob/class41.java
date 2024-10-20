package deob;

@ObfuscatedName("ai")
public class class41 extends class183 {

    @ObfuscatedName("ai.g")
    public static class172 field955 = new class172(64);

    @ObfuscatedName("ai.x")
    public int field954 = 0;

    @ObfuscatedName("ai.c")
    public int field958 = -1;

    @ObfuscatedName("ai.n")
    public boolean field965 = true;

    @ObfuscatedName("ai.s")
    public int field959 = -1;

    @ObfuscatedName("ai.r")
    public int field960;

    @ObfuscatedName("ai.w")
    public int field961;

    @ObfuscatedName("ai.u")
    public int field962;

    @ObfuscatedName("ai.d")
    public int field963;

    @ObfuscatedName("ai.h")
    public int field964;

    @ObfuscatedName("ai.a")
    public int field956;

    @ObfuscatedName("c.p(Ler;I)V")
    public static void method42(class147 arg0) {
        Statics.field957 = arg0;
    }

    @ObfuscatedName("bx.g(II)Lai;")
    public static class41 method1427(int arg0) {
        class41 var1 = (class41) field955.method3225((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field957.method2855(4, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method823(new class107(var2), arg0);
        }
        var3.method839();
        field955.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.x(I)V")
    public void method839() {
        if (this.field959 != -1) {
            this.method835(this.field959);
            this.field963 = this.field960;
            this.field964 = this.field961;
            this.field956 = this.field962;
        }
        this.method835(this.field954);
    }

    @ObfuscatedName("ai.c(Ldp;IB)V")
    public void method823(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2173();
            if (var3 == 0) {
                return;
            }
            this.method824(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ai.n(Ldp;III)V")
    public void method824(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field954 = arg0.method2329();
        } else if (arg1 == 2) {
            this.field958 = arg0.method2173();
        } else if (arg1 == 5) {
            this.field965 = false;
        } else if (arg1 == 7) {
            this.field959 = arg0.method2329();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ai.s(II)V")
    public void method835(int arg0) {
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
        this.field960 = (int) (var18 * 256.0D);
        this.field961 = (int) (var14 * 256.0D);
        this.field962 = (int) (var16 * 256.0D);
        if (this.field961 < 0) {
            this.field961 = 0;
        } else if (this.field961 > 255) {
            this.field961 = 255;
        }
        if (this.field962 < 0) {
            this.field962 = 0;
        } else if (this.field962 > 255) {
            this.field962 = 255;
        }
    }
}
