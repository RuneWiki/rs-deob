package deob;

@ObfuscatedName("hv")
public class class201 extends class511 {

    @ObfuscatedName("hv.aw")
    public static class316 field2100 = new class316(64);

    @ObfuscatedName("hv.ak")
    public int field2103 = 0;

    @ObfuscatedName("hv.aj")
    public int field2102;

    @ObfuscatedName("hv.ai")
    public int field2101;

    @ObfuscatedName("hv.ay")
    public int field2099;

    @ObfuscatedName("hv.as")
    public int field2105;

    @ObfuscatedName("cg.ap(Lpe;I)V")
    public static void method1201(class392 arg0) {
        Statics.field2104 = arg0;
    }

    @ObfuscatedName("dc.aw(IB)Lhv;")
    public static class201 method2349(int arg0) {
        class201 var1 = (class201) field2100.method5928((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2104.method7009(1, arg0);
        class201 var3 = new class201();
        if (var2 != null) {
            var3.method3835(new class558(var2), arg0);
        }
        var3.method3819();
        field2100.method5931(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hv.ak(I)V")
    public void method3819() {
        this.method3820(this.field2103);
    }

    @ObfuscatedName("hv.aj(Lvl;II)V")
    public void method3835(class558 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method9258();
            if (var3 == 0) {
                return;
            }
            this.method3821(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("hv.ai(Lvl;III)V")
    public void method3821(class558 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2103 = arg0.method9380();
        }
    }

    @ObfuscatedName("hv.ay(II)V")
    public void method3820(int arg0) {
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
        this.field2101 = (int) (var14 * 256.0D);
        this.field2099 = (int) (var16 * 256.0D);
        if (this.field2101 < 0) {
            this.field2101 = 0;
        } else if (this.field2101 > 255) {
            this.field2101 = 255;
        }
        if (this.field2099 < 0) {
            this.field2099 = 0;
        } else if (this.field2099 > 255) {
            this.field2099 = 255;
        }
        if (var16 > 0.5D) {
            this.field2105 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2105 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2105 < 1) {
            this.field2105 = 1;
        }
        this.field2102 = (int) ((double) this.field2105 * var18);
    }

    @ObfuscatedName("gl.as(B)V")
    public static void method3440() {
        field2100.method5930();
    }
}
