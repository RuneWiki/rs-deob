package deob;

@ObfuscatedName("ir")
public class class260 extends class195 {

    @ObfuscatedName("ir.c")
    public static class190 field3584 = new class190(64);

    @ObfuscatedName("ir.e")
    public int field3590 = 0;

    @ObfuscatedName("ir.v")
    public int field3587 = -1;

    @ObfuscatedName("ir.b")
    public boolean field3585 = true;

    @ObfuscatedName("ir.y")
    public int field3583 = -1;

    @ObfuscatedName("ir.h")
    public int field3589;

    @ObfuscatedName("ir.x")
    public int field3597;

    @ObfuscatedName("ir.f")
    public int field3591;

    @ObfuscatedName("ir.n")
    public int field3592;

    @ObfuscatedName("ir.a")
    public int field3593;

    @ObfuscatedName("ir.o")
    public int field3586;

    @ObfuscatedName("ax.i(IB)Lir;")
    public static class260 method520(int arg0) {
        class260 var1 = (class260) field3584.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3588.method3769(4, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4323(new class174(var2), arg0);
        }
        var3.method4319();
        field3584.method3222(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.c(I)V")
    public void method4319() {
        if (this.field3583 != -1) {
            this.method4322(this.field3583);
            this.field3592 = this.field3589;
            this.field3593 = this.field3597;
            this.field3586 = this.field3591;
        }
        this.method4322(this.field3590);
    }

    @ObfuscatedName("ir.e(Lfx;II)V")
    public void method4323(class174 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2870();
            if (var3 == 0) {
                return;
            }
            this.method4326(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ir.v(Lfx;IIB)V")
    public void method4326(class174 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3590 = arg0.method2874();
        } else if (arg1 == 2) {
            this.field3587 = arg0.method2870();
        } else if (arg1 == 5) {
            this.field3585 = false;
        } else if (arg1 == 7) {
            this.field3583 = arg0.method2874();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ir.b(IB)V")
    public void method4322(int arg0) {
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
        this.field3589 = (int) (var18 * 256.0D);
        this.field3597 = (int) (var14 * 256.0D);
        this.field3591 = (int) (var16 * 256.0D);
        if (this.field3597 < 0) {
            this.field3597 = 0;
        } else if (this.field3597 > 255) {
            this.field3597 = 255;
        }
        if (this.field3591 < 0) {
            this.field3591 = 0;
        } else if (this.field3591 > 255) {
            this.field3591 = 255;
        }
    }

    @ObfuscatedName("cp.y(B)V")
    public static void method1561() {
        field3584.method3221();
    }
}
