package deob;

@ObfuscatedName("ah")
public class class42 extends class204 {

    @ObfuscatedName("ah.m")
    public static class193 field958 = new class193(64);

    @ObfuscatedName("ah.f")
    public int field969 = 0;

    @ObfuscatedName("ah.l")
    public int field957;

    @ObfuscatedName("ah.u")
    public int field961;

    @ObfuscatedName("ah.a")
    public int field962;

    @ObfuscatedName("ah.h")
    public int field963;

    @ObfuscatedName("aa.j(Lfa;I)V")
    public static void method668(class167 arg0) {
        Statics.field964 = arg0;
    }

    @ObfuscatedName("ck.m(IB)Lah;")
    public static class42 method2060(int arg0) {
        class42 var1 = (class42) field958.method3543((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field964.method3124(1, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method852(new class119(var2), arg0);
        }
        var3.method851();
        field958.method3540(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.f(I)V")
    public void method851() {
        this.method850(this.field969);
    }

    @ObfuscatedName("ah.l(Ldc;IB)V")
    public void method852(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2372();
            if (var3 == 0) {
                return;
            }
            this.method853(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ah.u(Ldc;III)V")
    public void method853(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field969 = arg0.method2376();
        }
    }

    @ObfuscatedName("ah.a(II)V")
    public void method850(int arg0) {
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
        if (var16 > 0.5D) {
            this.field963 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field963 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field963 < 1) {
            this.field963 = 1;
        }
        this.field957 = (int) ((double) this.field963 * var18);
    }

    @ObfuscatedName("gh.h(I)V")
    public static void method3532() {
        field958.method3541();
    }
}
