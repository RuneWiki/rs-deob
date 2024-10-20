package deob;

@ObfuscatedName("if")
public class class260 extends class195 {

    @ObfuscatedName("if.s")
    public static class190 field3590 = new class190(64);

    @ObfuscatedName("if.q")
    public int field3594 = 0;

    @ObfuscatedName("if.o")
    public int field3592 = -1;

    @ObfuscatedName("if.g")
    public boolean field3593 = true;

    @ObfuscatedName("if.v")
    public int field3589 = -1;

    @ObfuscatedName("if.p")
    public int field3595;

    @ObfuscatedName("if.e")
    public int field3591;

    @ObfuscatedName("if.d")
    public int field3597;

    @ObfuscatedName("if.x")
    public int field3598;

    @ObfuscatedName("if.z")
    public int field3599;

    @ObfuscatedName("if.n")
    public int field3601;

    @ObfuscatedName("j.w(II)Lif;")
    public static class260 method124(int arg0) {
        class260 var1 = (class260) field3590.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3600.method3876(4, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4427(new class174(var2), arg0);
        }
        var3.method4440();
        field3590.method3371(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("if.s(I)V")
    public void method4440() {
        if (this.field3589 != -1) {
            this.method4433(this.field3589);
            this.field3598 = this.field3595;
            this.field3599 = this.field3591;
            this.field3601 = this.field3597;
        }
        this.method4433(this.field3594);
    }

    @ObfuscatedName("if.q(Lfz;IB)V")
    public void method4427(class174 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2971();
            if (var3 == 0) {
                return;
            }
            this.method4428(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("if.o(Lfz;III)V")
    public void method4428(class174 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3594 = arg0.method2975();
        } else if (arg1 == 2) {
            this.field3592 = arg0.method2971();
        } else if (arg1 == 5) {
            this.field3593 = false;
        } else if (arg1 == 7) {
            this.field3589 = arg0.method2975();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("if.g(II)V")
    public void method4433(int arg0) {
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
        this.field3595 = (int) (var18 * 256.0D);
        this.field3591 = (int) (var14 * 256.0D);
        this.field3597 = (int) (var16 * 256.0D);
        if (this.field3591 < 0) {
            this.field3591 = 0;
        } else if (this.field3591 > 255) {
            this.field3591 = 255;
        }
        if (this.field3597 < 0) {
            this.field3597 = 0;
        } else if (this.field3597 > 255) {
            this.field3597 = 255;
        }
    }
}
