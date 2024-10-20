package deob;

@ObfuscatedName("hk")
public class class196 extends class439 {

    @ObfuscatedName("hk.al")
    public static class276 field2062 = new class276(64);

    @ObfuscatedName("hk.ac")
    public int field2066 = 0;

    @ObfuscatedName("hk.ab")
    public int field2064;

    @ObfuscatedName("hk.an")
    public int field2065;

    @ObfuscatedName("hk.ao")
    public int field2071;

    @ObfuscatedName("hk.av")
    public int field2070;

    @ObfuscatedName("ae.aj(Lne;I)V")
    public static void method202(class340 arg0) {
        Statics.field2067 = arg0;
    }

    @ObfuscatedName("fl.al(II)Lhk;")
    public static class196 method2925(int arg0) {
        class196 var1 = (class196) field2062.method4921((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2067.method5860(1, arg0);
        class196 var3 = new class196();
        if (var2 != null) {
            var3.method3416(new class478(var2), arg0);
        }
        var3.method3425();
        field2062.method4923(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hk.ac(I)V")
    public void method3425() {
        this.method3422(this.field2066);
    }

    @ObfuscatedName("hk.ab(Lsy;II)V")
    public void method3416(class478 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method7909();
            if (var3 == 0) {
                return;
            }
            this.method3415(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("hk.an(Lsy;III)V")
    public void method3415(class478 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2066 = arg0.method7907();
        }
    }

    @ObfuscatedName("hk.ao(IS)V")
    public void method3422(int arg0) {
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
        this.field2065 = (int) (var14 * 256.0D);
        this.field2071 = (int) (var16 * 256.0D);
        if (this.field2065 < 0) {
            this.field2065 = 0;
        } else if (this.field2065 > 255) {
            this.field2065 = 255;
        }
        if (this.field2071 < 0) {
            this.field2071 = 0;
        } else if (this.field2071 > 255) {
            this.field2071 = 255;
        }
        if (var16 > 0.5D) {
            this.field2070 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2070 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2070 < 1) {
            this.field2070 = 1;
        }
        this.field2064 = (int) ((double) this.field2070 * var18);
    }
}
