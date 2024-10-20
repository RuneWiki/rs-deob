package deob;

@ObfuscatedName("ak")
public class class41 extends class183 {

    @ObfuscatedName("ak.s")
    public static class172 field958 = new class172(64);

    @ObfuscatedName("ak.v")
    public int field959 = 0;

    @ObfuscatedName("ak.o")
    public int field960 = -1;

    @ObfuscatedName("ak.k")
    public boolean field966 = true;

    @ObfuscatedName("ak.m")
    public int field961 = -1;

    @ObfuscatedName("ak.i")
    public int field963;

    @ObfuscatedName("ak.t")
    public int field969;

    @ObfuscatedName("ak.l")
    public int field965;

    @ObfuscatedName("ak.p")
    public int field957;

    @ObfuscatedName("ak.r")
    public int field967;

    @ObfuscatedName("ak.j")
    public int field962;

    @ObfuscatedName("dh.g(Let;I)V")
    public static void method2458(class147 arg0) {
        Statics.field968 = arg0;
    }

    @ObfuscatedName("ci.s(II)Lak;")
    public static class41 method1834(int arg0) {
        class41 var1 = (class41) field958.method3112((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field968.method2703(4, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method778(new class107(var2), arg0);
        }
        var3.method777();
        field958.method3115(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.v(I)V")
    public void method777() {
        if (this.field961 != -1) {
            this.method796(this.field961);
            this.field957 = this.field963;
            this.field967 = this.field969;
            this.field962 = this.field965;
        }
        this.method796(this.field959);
    }

    @ObfuscatedName("ak.o(Lde;IB)V")
    public void method778(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2116();
            if (var3 == 0) {
                return;
            }
            this.method781(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ak.k(Lde;III)V")
    public void method781(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field959 = arg0.method2096();
        } else if (arg1 == 2) {
            this.field960 = arg0.method2116();
        } else if (arg1 == 5) {
            this.field966 = false;
        } else if (arg1 == 7) {
            this.field961 = arg0.method2096();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ak.m(IB)V")
    public void method796(int arg0) {
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
        this.field963 = (int) (var18 * 256.0D);
        this.field969 = (int) (var14 * 256.0D);
        this.field965 = (int) (var16 * 256.0D);
        if (this.field969 < 0) {
            this.field969 = 0;
        } else if (this.field969 > 255) {
            this.field969 = 255;
        }
        if (this.field965 < 0) {
            this.field965 = 0;
        } else if (this.field965 > 255) {
            this.field965 = 255;
        }
    }

    @ObfuscatedName("fn.i(I)V")
    public static void method3107() {
        field958.method3116();
    }
}
