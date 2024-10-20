package deob;

@ObfuscatedName("io")
public class class222 extends class484 {

    @ObfuscatedName("io.al")
    public static class302 field2303 = new class302(64);

    @ObfuscatedName("io.ak")
    public int field2301 = 0;

    @ObfuscatedName("io.ax")
    public int field2305 = -1;

    @ObfuscatedName("io.ao")
    public boolean field2304 = true;

    @ObfuscatedName("io.ah")
    public int field2310 = -1;

    @ObfuscatedName("io.ar")
    public int field2306;

    @ObfuscatedName("io.ab")
    public int field2312;

    @ObfuscatedName("io.am")
    public int field2308;

    @ObfuscatedName("io.av")
    public int field2309;

    @ObfuscatedName("io.ag")
    public int field2302;

    @ObfuscatedName("io.aa")
    public int field2311;

    @ObfuscatedName("hn.ac(Lom;I)V")
    public static void method3323(class374 arg0) {
        Statics.field168 = arg0;
    }

    @ObfuscatedName("io.ak(I)V")
    public void method3822() {
        if (this.field2310 != -1) {
            this.method3825(this.field2310);
            this.field2309 = this.field2306;
            this.field2302 = this.field2312;
            this.field2311 = this.field2308;
        }
        this.method3825(this.field2301);
    }

    @ObfuscatedName("io.ax(Lul;IB)V")
    public void method3839(class530 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8365();
            if (var3 == 0) {
                return;
            }
            this.method3824(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("io.ao(Lul;III)V")
    public void method3824(class530 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2301 = arg0.method8445();
        } else if (arg1 == 2) {
            this.field2305 = arg0.method8365();
        } else if (arg1 == 5) {
            this.field2304 = false;
        } else if (arg1 == 7) {
            this.field2310 = arg0.method8445();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("io.ah(IB)V")
    public void method3825(int arg0) {
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
        this.field2306 = (int) (var18 * 256.0D);
        this.field2312 = (int) (var14 * 256.0D);
        this.field2308 = (int) (var16 * 256.0D);
        if (this.field2312 < 0) {
            this.field2312 = 0;
        } else if (this.field2312 > 255) {
            this.field2312 = 255;
        }
        if (this.field2308 < 0) {
            this.field2308 = 0;
        } else if (this.field2308 > 255) {
            this.field2308 = 255;
        }
    }
}
