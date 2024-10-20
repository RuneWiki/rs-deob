package deob;

@ObfuscatedName("hr")
public class class208 extends class469 {

    @ObfuscatedName("hr.ae")
    public static class288 field2295 = new class288(64);

    @ObfuscatedName("hr.ao")
    public int field2289 = 0;

    @ObfuscatedName("hr.at")
    public int field2288 = -1;

    @ObfuscatedName("hr.ac")
    public boolean field2291 = true;

    @ObfuscatedName("hr.ai")
    public int field2292 = -1;

    @ObfuscatedName("hr.az")
    public int field2293;

    @ObfuscatedName("hr.ap")
    public int field2294;

    @ObfuscatedName("hr.aa")
    public int field2301;

    @ObfuscatedName("hr.af")
    public int field2297;

    @ObfuscatedName("hr.ad")
    public int field2296;

    @ObfuscatedName("hr.aq")
    public int field2298;

    @ObfuscatedName("mw.au(Lnu;I)V")
    public static void method5514(class359 arg0) {
        Statics.field2302 = arg0;
    }

    @ObfuscatedName("hr.ae(B)V")
    public void method3721() {
        if (this.field2292 != -1) {
            this.method3726(this.field2292);
            this.field2297 = this.field2293;
            this.field2296 = this.field2294;
            this.field2298 = this.field2301;
        }
        this.method3726(this.field2289);
    }

    @ObfuscatedName("hr.ao(Ltm;IB)V")
    public void method3722(class515 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8300();
            if (var3 == 0) {
                return;
            }
            this.method3720(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("hr.at(Ltm;IIB)V")
    public void method3720(class515 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2289 = arg0.method8466();
        } else if (arg1 == 2) {
            this.field2288 = arg0.method8300();
        } else if (arg1 == 5) {
            this.field2291 = false;
        } else if (arg1 == 7) {
            this.field2292 = arg0.method8466();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("hr.ac(II)V")
    public void method3726(int arg0) {
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
        this.field2293 = (int) (var18 * 256.0D);
        this.field2294 = (int) (var14 * 256.0D);
        this.field2301 = (int) (var16 * 256.0D);
        if (this.field2294 < 0) {
            this.field2294 = 0;
        } else if (this.field2294 > 255) {
            this.field2294 = 255;
        }
        if (this.field2301 < 0) {
            this.field2301 = 0;
        } else if (this.field2301 > 255) {
            this.field2301 = 255;
        }
    }

    @ObfuscatedName("ik.ai(I)V")
    public static void method4386() {
        field2295.method5175();
    }
}
