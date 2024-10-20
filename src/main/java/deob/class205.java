package deob;

@ObfuscatedName("hz")
public class class205 extends class439 {

    @ObfuscatedName("hz.al")
    public static class276 field2237 = new class276(64);

    @ObfuscatedName("hz.ac")
    public int field2243 = 0;

    @ObfuscatedName("hz.ab")
    public int field2239 = -1;

    @ObfuscatedName("hz.an")
    public boolean field2236 = true;

    @ObfuscatedName("hz.ao")
    public int field2247 = -1;

    @ObfuscatedName("hz.av")
    public int field2242;

    @ObfuscatedName("hz.aq")
    public int field2238;

    @ObfuscatedName("hz.ap")
    public int field2244;

    @ObfuscatedName("hz.ar")
    public int field2245;

    @ObfuscatedName("hz.ak")
    public int field2249;

    @ObfuscatedName("hz.ax")
    public int field2240;

    @ObfuscatedName("fw.aj(Lne;I)V")
    public static void method2957(class340 arg0) {
        Statics.field2246 = arg0;
    }

    @ObfuscatedName("ay.al(II)Lhz;")
    public static class205 method154(int arg0) {
        class205 var1 = (class205) field2237.method4921((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2246.method5860(4, arg0);
        class205 var3 = new class205();
        if (var2 != null) {
            var3.method3666(new class478(var2), arg0);
        }
        var3.method3665();
        field2237.method4923(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hz.ac(I)V")
    public void method3665() {
        if (this.field2247 != -1) {
            this.method3678(this.field2247);
            this.field2245 = this.field2242;
            this.field2249 = this.field2238;
            this.field2240 = this.field2244;
        }
        this.method3678(this.field2243);
    }

    @ObfuscatedName("hz.ab(Lsy;IS)V")
    public void method3666(class478 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method7909();
            if (var3 == 0) {
                return;
            }
            this.method3667(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("hz.an(Lsy;III)V")
    public void method3667(class478 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2243 = arg0.method7907();
        } else if (arg1 == 2) {
            this.field2239 = arg0.method7909();
        } else if (arg1 == 5) {
            this.field2236 = false;
        } else if (arg1 == 7) {
            this.field2247 = arg0.method7907();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("hz.ao(II)V")
    public void method3678(int arg0) {
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
        this.field2242 = (int) (var18 * 256.0D);
        this.field2238 = (int) (var14 * 256.0D);
        this.field2244 = (int) (var16 * 256.0D);
        if (this.field2238 < 0) {
            this.field2238 = 0;
        } else if (this.field2238 > 255) {
            this.field2238 = 255;
        }
        if (this.field2244 < 0) {
            this.field2244 = 0;
        } else if (this.field2244 > 255) {
            this.field2244 = 255;
        }
    }
}
