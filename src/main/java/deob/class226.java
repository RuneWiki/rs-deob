package deob;

@ObfuscatedName("iv")
public class class226 extends class500 {

    @ObfuscatedName("iv.al")
    public static class312 field2395 = new class312(64);

    @ObfuscatedName("iv.aj")
    public int field2391 = 0;

    @ObfuscatedName("iv.az")
    public int field2402 = -1;

    @ObfuscatedName("iv.af")
    public boolean field2393 = true;

    @ObfuscatedName("iv.aa")
    public int field2392 = -1;

    @ObfuscatedName("iv.at")
    public int field2398;

    @ObfuscatedName("iv.ab")
    public int field2396;

    @ObfuscatedName("iv.ac")
    public int field2397;

    @ObfuscatedName("iv.ao")
    public int field2404;

    @ObfuscatedName("iv.ah")
    public int field2399;

    @ObfuscatedName("iv.av")
    public int field2400;

    @ObfuscatedName("ey.ak(Lor;I)V")
    public static void method2817(class387 arg0) {
        Statics.field2390 = arg0;
    }

    @ObfuscatedName("iv.al(I)V")
    public void method3994() {
        if (this.field2392 != -1) {
            this.method4004(this.field2392);
            this.field2404 = this.field2398;
            this.field2399 = this.field2396;
            this.field2400 = this.field2397;
        }
        this.method4004(this.field2391);
    }

    @ObfuscatedName("iv.aj(Lua;IB)V")
    public void method3993(class546 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8796();
            if (var3 == 0) {
                return;
            }
            this.method3995(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("iv.az(Lua;IIB)V")
    public void method3995(class546 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2391 = arg0.method8790();
        } else if (arg1 == 2) {
            this.field2402 = arg0.method8796();
        } else if (arg1 == 5) {
            this.field2393 = false;
        } else if (arg1 == 7) {
            this.field2392 = arg0.method8790();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("iv.af(II)V")
    public void method4004(int arg0) {
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
        this.field2398 = (int) (var18 * 256.0D);
        this.field2396 = (int) (var14 * 256.0D);
        this.field2397 = (int) (var16 * 256.0D);
        if (this.field2396 < 0) {
            this.field2396 = 0;
        } else if (this.field2396 > 255) {
            this.field2396 = 255;
        }
        if (this.field2397 < 0) {
            this.field2397 = 0;
        } else if (this.field2397 > 255) {
            this.field2397 = 255;
        }
    }
}
