package deob;

@ObfuscatedName("hd")
public class class204 extends class481 {

    @ObfuscatedName("hd.ah")
    public static class299 field2191 = new class299(64);

    @ObfuscatedName("hd.ar")
    public int field2202 = 0;

    @ObfuscatedName("hd.ao")
    public int field2192 = -1;

    @ObfuscatedName("hd.ab")
    public boolean field2190 = true;

    @ObfuscatedName("hd.au")
    public int field2194 = -1;

    @ObfuscatedName("hd.aa")
    public int field2198;

    @ObfuscatedName("hd.ac")
    public int field2196;

    @ObfuscatedName("hd.al")
    public int field2189;

    @ObfuscatedName("hd.az")
    public int field2193;

    @ObfuscatedName("hd.ap")
    public int field2199;

    @ObfuscatedName("hd.av")
    public int field2200;

    @ObfuscatedName("ag.at(II)Lhd;")
    public static class204 method327(int arg0) {
        class204 var1 = (class204) field2191.method5289((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2197.method6284(4, arg0);
        class204 var3 = new class204();
        if (var2 != null) {
            var3.method3703(new class527(var2), arg0);
        }
        var3.method3702();
        field2191.method5303(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hd.ah(I)V")
    public void method3702() {
        if (this.field2194 != -1) {
            this.method3704(this.field2194);
            this.field2193 = this.field2198;
            this.field2199 = this.field2196;
            this.field2200 = this.field2189;
        }
        this.method3704(this.field2202);
    }

    @ObfuscatedName("hd.ar(Luj;II)V")
    public void method3703(class527 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8410();
            if (var3 == 0) {
                return;
            }
            this.method3712(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("hd.ao(Luj;IIB)V")
    public void method3712(class527 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2202 = arg0.method8414();
        } else if (arg1 == 2) {
            this.field2192 = arg0.method8410();
        } else if (arg1 == 5) {
            this.field2190 = false;
        } else if (arg1 == 7) {
            this.field2194 = arg0.method8414();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("hd.ab(II)V")
    public void method3704(int arg0) {
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
        this.field2198 = (int) (var18 * 256.0D);
        this.field2196 = (int) (var14 * 256.0D);
        this.field2189 = (int) (var16 * 256.0D);
        if (this.field2196 < 0) {
            this.field2196 = 0;
        } else if (this.field2196 > 255) {
            this.field2196 = 255;
        }
        if (this.field2189 < 0) {
            this.field2189 = 0;
        } else if (this.field2189 > 255) {
            this.field2189 = 255;
        }
    }

    @ObfuscatedName("fi.au(B)V")
    public static void method2999() {
        field2191.method5292();
    }
}
