package deob;

@ObfuscatedName("av")
public class class33 extends class174 {

    @ObfuscatedName("av.w")
    public static class170 field882 = new class170(64);

    @ObfuscatedName("av.f")
    public int field881 = 0;

    @ObfuscatedName("av.e")
    public int field876;

    @ObfuscatedName("av.t")
    public int field877;

    @ObfuscatedName("av.d")
    public int field878;

    @ObfuscatedName("av.p")
    public int field874;

    @ObfuscatedName("aq.i(Leg;I)V")
    public static void method878(class152 arg0) {
        Statics.field875 = arg0;
    }

    @ObfuscatedName("ct.w(IB)Lav;")
    public static class33 method1654(int arg0) {
        class33 var1 = (class33) field882.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field875.method2970(1, arg0);
        class33 var3 = new class33();
        if (var2 != null) {
            var3.method678(new class127(var2), arg0);
        }
        var3.method677();
        field882.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.f(B)V")
    public void method677() {
        this.method680(this.field881);
    }

    @ObfuscatedName("av.e(Ldz;II)V")
    public void method678(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2472();
            if (var3 == 0) {
                return;
            }
            this.method676(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("av.t(Ldz;III)V")
    public void method676(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field881 = arg0.method2608();
        }
    }

    @ObfuscatedName("av.d(IB)V")
    public void method680(int arg0) {
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
        this.field877 = (int) (var14 * 256.0D);
        this.field878 = (int) (var16 * 256.0D);
        if (this.field877 < 0) {
            this.field877 = 0;
        } else if (this.field877 > 255) {
            this.field877 = 255;
        }
        if (this.field878 < 0) {
            this.field878 = 0;
        } else if (this.field878 > 255) {
            this.field878 = 255;
        }
        if (var16 > 0.5D) {
            this.field874 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field874 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field874 < 1) {
            this.field874 = 1;
        }
        this.field876 = (int) ((double) this.field874 * var18);
    }

    @ObfuscatedName("do.p(S)V")
    public static void method2236() {
        field882.method3243();
    }
}
