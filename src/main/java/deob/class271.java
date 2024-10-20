package deob;

@ObfuscatedName("jn")
public class class271 extends class206 {

    @ObfuscatedName("jn.i")
    public static class201 field3644 = new class201(64);

    @ObfuscatedName("jn.w")
    public int field3645 = 0;

    @ObfuscatedName("jn.s")
    public int field3646 = -1;

    @ObfuscatedName("jn.j")
    public boolean field3647 = true;

    @ObfuscatedName("jn.a")
    public int field3648 = -1;

    @ObfuscatedName("jn.t")
    public int field3651;

    @ObfuscatedName("jn.r")
    public int field3650;

    @ObfuscatedName("jn.m")
    public int field3652;

    @ObfuscatedName("jn.h")
    public int field3643;

    @ObfuscatedName("jn.o")
    public int field3653;

    @ObfuscatedName("jn.x")
    public int field3654;

    @ObfuscatedName("ix.p(II)Ljn;")
    public static class271 method4297(int arg0) {
        class271 var1 = (class271) field3644.method3504((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3649.method4032(4, arg0);
        class271 var3 = new class271();
        if (var2 != null) {
            var3.method4581(new class185(var2), arg0);
        }
        var3.method4580();
        field3644.method3506(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jn.i(B)V")
    public void method4580() {
        if (this.field3648 != -1) {
            this.method4584(this.field3648);
            this.field3643 = this.field3651;
            this.field3653 = this.field3650;
            this.field3654 = this.field3652;
        }
        this.method4584(this.field3645);
    }

    @ObfuscatedName("jn.w(Lgj;II)V")
    public void method4581(class185 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3197();
            if (var3 == 0) {
                return;
            }
            this.method4582(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jn.s(Lgj;III)V")
    public void method4582(class185 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3645 = arg0.method3138();
        } else if (arg1 == 2) {
            this.field3646 = arg0.method3197();
        } else if (arg1 == 5) {
            this.field3647 = false;
        } else if (arg1 == 7) {
            this.field3648 = arg0.method3138();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jn.j(II)V")
    public void method4584(int arg0) {
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
        this.field3651 = (int) (var18 * 256.0D);
        this.field3650 = (int) (var14 * 256.0D);
        this.field3652 = (int) (var16 * 256.0D);
        if (this.field3650 < 0) {
            this.field3650 = 0;
        } else if (this.field3650 > 255) {
            this.field3650 = 255;
        }
        if (this.field3652 < 0) {
            this.field3652 = 0;
        } else if (this.field3652 > 255) {
            this.field3652 = 255;
        }
    }
}
