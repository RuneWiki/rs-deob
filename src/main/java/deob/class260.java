package deob;

@ObfuscatedName("in")
public class class260 extends class195 {

    @ObfuscatedName("in.w")
    public static class190 field3594 = new class190(64);

    @ObfuscatedName("in.a")
    public int field3604 = 0;

    @ObfuscatedName("in.t")
    public int field3598 = -1;

    @ObfuscatedName("in.s")
    public boolean field3593 = true;

    @ObfuscatedName("in.r")
    public int field3602 = -1;

    @ObfuscatedName("in.v")
    public int field3599;

    @ObfuscatedName("in.y")
    public int field3600;

    @ObfuscatedName("in.j")
    public int field3601;

    @ObfuscatedName("in.k")
    public int field3597;

    @ObfuscatedName("in.e")
    public int field3603;

    @ObfuscatedName("in.o")
    public int field3595;

    @ObfuscatedName("cf.i(Liq;I)V")
    public static void method1578(class236 arg0) {
        Statics.field3596 = arg0;
    }

    @ObfuscatedName("ca.w(IB)Lin;")
    public static class260 method1563(int arg0) {
        class260 var1 = (class260) field3594.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3596.method3768(4, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4305(new class174(var2), arg0);
        }
        var3.method4316();
        field3594.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("in.a(B)V")
    public void method4316() {
        if (this.field3602 != -1) {
            this.method4309(this.field3602);
            this.field3597 = this.field3599;
            this.field3603 = this.field3600;
            this.field3595 = this.field3601;
        }
        this.method4309(this.field3604);
    }

    @ObfuscatedName("in.t(Lfp;II)V")
    public void method4305(class174 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3061();
            if (var3 == 0) {
                return;
            }
            this.method4311(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("in.s(Lfp;IIB)V")
    public void method4311(class174 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3604 = arg0.method2917();
        } else if (arg1 == 2) {
            this.field3598 = arg0.method3061();
        } else if (arg1 == 5) {
            this.field3593 = false;
        } else if (arg1 == 7) {
            this.field3602 = arg0.method2917();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("in.r(II)V")
    public void method4309(int arg0) {
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
        this.field3599 = (int) (var18 * 256.0D);
        this.field3600 = (int) (var14 * 256.0D);
        this.field3601 = (int) (var16 * 256.0D);
        if (this.field3600 < 0) {
            this.field3600 = 0;
        } else if (this.field3600 > 255) {
            this.field3600 = 255;
        }
        if (this.field3601 < 0) {
            this.field3601 = 0;
        } else if (this.field3601 > 255) {
            this.field3601 = 255;
        }
    }
}
