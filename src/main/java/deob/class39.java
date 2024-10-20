package deob;

@ObfuscatedName("aa")
public class class39 extends class195 {

    @ObfuscatedName("aa.e")
    public static class184 field905 = new class184(64);

    @ObfuscatedName("aa.a")
    public int field909 = 0;

    @ObfuscatedName("aa.k")
    public int field906;

    @ObfuscatedName("aa.p")
    public int field907;

    @ObfuscatedName("aa.l")
    public int field908;

    @ObfuscatedName("aa.u")
    public int field904;

    @ObfuscatedName("ey.b(II)Laa;")
    public static class39 method2586(int arg0) {
        class39 var1 = (class39) field905.method3254((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field910.method2819(1, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method724(new class111(var2), arg0);
        }
        var3.method713();
        field905.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.e(B)V")
    public void method713() {
        this.method712(this.field909);
    }

    @ObfuscatedName("aa.a(Ldj;II)V")
    public void method724(class111 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2127();
            if (var3 == 0) {
                return;
            }
            this.method729(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aa.k(Ldj;III)V")
    public void method729(class111 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field909 = arg0.method2131();
        }
    }

    @ObfuscatedName("aa.p(II)V")
    public void method712(int arg0) {
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
        this.field907 = (int) (var14 * 256.0D);
        this.field908 = (int) (var16 * 256.0D);
        if (this.field907 < 0) {
            this.field907 = 0;
        } else if (this.field907 > 255) {
            this.field907 = 255;
        }
        if (this.field908 < 0) {
            this.field908 = 0;
        } else if (this.field908 > 255) {
            this.field908 = 255;
        }
        if (var16 > 0.5D) {
            this.field904 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field904 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field904 < 1) {
            this.field904 = 1;
        }
        this.field906 = (int) ((double) this.field904 * var18);
    }
}
