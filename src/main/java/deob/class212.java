package deob;

@ObfuscatedName("ia")
public class class212 extends class504 {

    @ObfuscatedName("ia.ae")
    public static class317 field2289 = new class317(64);

    @ObfuscatedName("ia.ag")
    public int field2294 = 0;

    @ObfuscatedName("ia.am")
    public int field2291 = -1;

    @ObfuscatedName("ia.ax")
    public boolean field2292 = true;

    @ObfuscatedName("ia.aq")
    public int field2293 = -1;

    @ObfuscatedName("ia.af")
    public int field2288;

    @ObfuscatedName("ia.at")
    public int field2297;

    @ObfuscatedName("ia.au")
    public int field2296;

    @ObfuscatedName("ia.ar")
    public int field2295;

    @ObfuscatedName("ia.al")
    public int field2298;

    @ObfuscatedName("ia.ad")
    public int field2299;

    @ObfuscatedName("ia.ac(I)V")
    public void method3927() {
        if (this.field2293 != -1) {
            this.method3930(this.field2293);
            this.field2295 = this.field2288;
            this.field2298 = this.field2297;
            this.field2299 = this.field2296;
        }
        this.method3930(this.field2294);
    }

    @ObfuscatedName("ia.ae(Lvf;IB)V")
    public void method3933(class551 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8955();
            if (var3 == 0) {
                return;
            }
            this.method3929(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ia.ag(Lvf;III)V")
    public void method3929(class551 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2294 = arg0.method8978();
        } else if (arg1 == 2) {
            this.field2291 = arg0.method8955();
        } else if (arg1 == 5) {
            this.field2292 = false;
        } else if (arg1 == 7) {
            this.field2293 = arg0.method8978();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ia.am(II)V")
    public void method3930(int arg0) {
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
        this.field2288 = (int) (var18 * 256.0D);
        this.field2297 = (int) (var14 * 256.0D);
        this.field2296 = (int) (var16 * 256.0D);
        if (this.field2297 < 0) {
            this.field2297 = 0;
        } else if (this.field2297 > 255) {
            this.field2297 = 255;
        }
        if (this.field2296 < 0) {
            this.field2296 = 0;
        } else if (this.field2296 > 255) {
            this.field2296 = 255;
        }
    }
}
