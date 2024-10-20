package deob;

@ObfuscatedName("hu")
public class class195 extends class481 {

    @ObfuscatedName("hu.ah")
    public static class299 field2012 = new class299(64);

    @ObfuscatedName("hu.ar")
    public int field2017 = 0;

    @ObfuscatedName("hu.ao")
    public int field2014;

    @ObfuscatedName("hu.ab")
    public int field2015;

    @ObfuscatedName("hu.au")
    public int field2011;

    @ObfuscatedName("hu.aa")
    public int field2013;

    @ObfuscatedName("dq.at(II)Lhu;")
    public static class195 method2587(int arg0) {
        class195 var1 = (class195) field2012.method5289((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2016.method6284(1, arg0);
        class195 var3 = new class195();
        if (var2 != null) {
            var3.method3463(new class527(var2), arg0);
        }
        var3.method3464();
        field2012.method5303(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hu.ah(B)V")
    public void method3464() {
        this.method3465(this.field2017);
    }

    @ObfuscatedName("hu.ar(Luj;II)V")
    public void method3463(class527 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8410();
            if (var3 == 0) {
                return;
            }
            this.method3469(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("hu.ao(Luj;IIS)V")
    public void method3469(class527 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2017 = arg0.method8414();
        }
    }

    @ObfuscatedName("hu.ab(II)V")
    public void method3465(int arg0) {
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
        this.field2015 = (int) (var14 * 256.0D);
        this.field2011 = (int) (var16 * 256.0D);
        if (this.field2015 < 0) {
            this.field2015 = 0;
        } else if (this.field2015 > 255) {
            this.field2015 = 255;
        }
        if (this.field2011 < 0) {
            this.field2011 = 0;
        } else if (this.field2011 > 255) {
            this.field2011 = 255;
        }
        if (var16 > 0.5D) {
            this.field2013 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2013 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2013 < 1) {
            this.field2013 = 1;
        }
        this.field2014 = (int) ((double) this.field2013 * var18);
    }

    @ObfuscatedName("gg.au(I)V")
    public static void method3223() {
        field2012.method5292();
    }
}
