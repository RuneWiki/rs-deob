package deob;

@ObfuscatedName("in")
public class class212 extends class511 {

    @ObfuscatedName("in.aw")
    public static class316 field2292 = new class316(64);

    @ObfuscatedName("in.ak")
    public int field2299 = 0;

    @ObfuscatedName("in.aj")
    public int field2294 = -1;

    @ObfuscatedName("in.ai")
    public boolean field2301 = true;

    @ObfuscatedName("in.ay")
    public int field2296 = -1;

    @ObfuscatedName("in.as")
    public int field2295;

    @ObfuscatedName("in.ae")
    public int field2298;

    @ObfuscatedName("in.am")
    public int field2303;

    @ObfuscatedName("in.at")
    public int field2300;

    @ObfuscatedName("in.au")
    public int field2302;

    @ObfuscatedName("in.an")
    public int field2291;

    @ObfuscatedName("hi.ap(Lpe;I)V")
    public static void method3723(class392 arg0) {
        Statics.field2293 = arg0;
    }

    @ObfuscatedName("in.aw(B)V")
    public void method4071() {
        if (this.field2296 != -1) {
            this.method4073(this.field2296);
            this.field2300 = this.field2295;
            this.field2302 = this.field2298;
            this.field2291 = this.field2303;
        }
        this.method4073(this.field2299);
    }

    @ObfuscatedName("in.ak(Lvl;IB)V")
    public void method4077(class558 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method9258();
            if (var3 == 0) {
                return;
            }
            this.method4076(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("in.aj(Lvl;IIB)V")
    public void method4076(class558 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2299 = arg0.method9380();
        } else if (arg1 == 2) {
            this.field2294 = arg0.method9258();
        } else if (arg1 == 5) {
            this.field2301 = false;
        } else if (arg1 == 7) {
            this.field2296 = arg0.method9380();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("in.ai(II)V")
    public void method4073(int arg0) {
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
        this.field2295 = (int) (var18 * 256.0D);
        this.field2298 = (int) (var14 * 256.0D);
        this.field2303 = (int) (var16 * 256.0D);
        if (this.field2298 < 0) {
            this.field2298 = 0;
        } else if (this.field2298 > 255) {
            this.field2298 = 255;
        }
        if (this.field2303 < 0) {
            this.field2303 = 0;
        } else if (this.field2303 > 255) {
            this.field2303 = 255;
        }
    }

    @ObfuscatedName("ip.ay(B)V")
    public static void method4052() {
        field2292.method5930();
    }
}
