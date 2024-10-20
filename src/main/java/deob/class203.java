package deob;

@ObfuscatedName("hk")
public class class203 extends class444 {

    @ObfuscatedName("hk.an")
    public static class280 field2271 = new class280(64);

    @ObfuscatedName("hk.aw")
    public int field2283 = 0;

    @ObfuscatedName("hk.ac")
    public int field2281 = -1;

    @ObfuscatedName("hk.au")
    public boolean field2275 = true;

    @ObfuscatedName("hk.ab")
    public int field2272 = -1;

    @ObfuscatedName("hk.aq")
    public int field2277;

    @ObfuscatedName("hk.al")
    public int field2278;

    @ObfuscatedName("hk.at")
    public int field2279;

    @ObfuscatedName("hk.aa")
    public int field2274;

    @ObfuscatedName("hk.ay")
    public int field2285;

    @ObfuscatedName("hk.ao")
    public int field2282;

    @ObfuscatedName("hx.af(Lnm;B)V")
    public static void method3428(class344 arg0) {
        Statics.field2273 = arg0;
    }

    @ObfuscatedName("hk.an(I)V")
    public void method3787() {
        if (this.field2272 != -1) {
            this.method3790(this.field2272);
            this.field2274 = this.field2277;
            this.field2285 = this.field2278;
            this.field2282 = this.field2279;
        }
        this.method3790(this.field2283);
    }

    @ObfuscatedName("hk.aw(Lsg;IS)V")
    public void method3788(class489 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8248();
            if (var3 == 0) {
                return;
            }
            this.method3789(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("hk.ac(Lsg;IIS)V")
    public void method3789(class489 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2283 = arg0.method8252();
        } else if (arg1 == 2) {
            this.field2281 = arg0.method8248();
        } else if (arg1 == 5) {
            this.field2275 = false;
        } else if (arg1 == 7) {
            this.field2272 = arg0.method8252();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("hk.au(II)V")
    public void method3790(int arg0) {
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
        this.field2277 = (int) (var18 * 256.0D);
        this.field2278 = (int) (var14 * 256.0D);
        this.field2279 = (int) (var16 * 256.0D);
        if (this.field2278 < 0) {
            this.field2278 = 0;
        } else if (this.field2278 > 255) {
            this.field2278 = 255;
        }
        if (this.field2279 < 0) {
            this.field2279 = 0;
        } else if (this.field2279 > 255) {
            this.field2279 = 255;
        }
    }
}
