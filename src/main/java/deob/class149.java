package deob;

@ObfuscatedName("ey")
public class class149 extends class347 {

    @ObfuscatedName("ey.n")
    public static class221 field1700 = new class221(64);

    @ObfuscatedName("ey.f")
    public int field1696 = 0;

    @ObfuscatedName("ey.y")
    public int field1697;

    @ObfuscatedName("ey.p")
    public int field1694;

    @ObfuscatedName("ey.j")
    public int field1699;

    @ObfuscatedName("ey.r")
    public int field1695;

    @ObfuscatedName("ap.v(Ljv;I)V")
    public static void method186(class275 arg0) {
        Statics.field1698 = arg0;
    }

    @ObfuscatedName("k.n(IB)Ley;")
    public static class149 method150(int arg0) {
        class149 var1 = (class149) field1700.method3948((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1698.method4468(1, arg0);
        class149 var3 = new class149();
        if (var2 != null) {
            var3.method2577(new class383(var2), arg0);
        }
        var3.method2590();
        field1700.method3947(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ey.f(I)V")
    public void method2590() {
        this.method2579(this.field1696);
    }

    @ObfuscatedName("ey.y(Lnd;IB)V")
    public void method2577(class383 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5965();
            if (var3 == 0) {
                return;
            }
            this.method2578(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ey.p(Lnd;III)V")
    public void method2578(class383 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1696 = arg0.method5969();
        }
    }

    @ObfuscatedName("ey.j(IB)V")
    public void method2579(int arg0) {
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
        this.field1694 = (int) (var14 * 256.0D);
        this.field1699 = (int) (var16 * 256.0D);
        if (this.field1694 < 0) {
            this.field1694 = 0;
        } else if (this.field1694 > 255) {
            this.field1694 = 255;
        }
        if (this.field1699 < 0) {
            this.field1699 = 0;
        } else if (this.field1699 > 255) {
            this.field1699 = 255;
        }
        if (var16 > 0.5D) {
            this.field1695 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field1695 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field1695 < 1) {
            this.field1695 = 1;
        }
        this.field1697 = (int) ((double) this.field1695 * var18);
    }

    @ObfuscatedName("jh.r(B)V")
    public static void method4406() {
        field1700.method3957();
    }
}
