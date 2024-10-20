package deob;

@ObfuscatedName("hg")
public class class207 extends class457 {

    @ObfuscatedName("hg.an")
    public static class287 field2258 = new class287(64);

    @ObfuscatedName("hg.av")
    public int field2267 = 0;

    @ObfuscatedName("hg.as")
    public int field2266 = -1;

    @ObfuscatedName("hg.ax")
    public boolean field2261 = true;

    @ObfuscatedName("hg.ap")
    public int field2262 = -1;

    @ObfuscatedName("hg.ab")
    public int field2257;

    @ObfuscatedName("hg.ak")
    public int field2264;

    @ObfuscatedName("hg.ae")
    public int field2265;

    @ObfuscatedName("hg.af")
    public int field2268;

    @ObfuscatedName("hg.ao")
    public int field2263;

    @ObfuscatedName("hg.aa")
    public int field2270;

    @ObfuscatedName("gk.at(Lnq;I)V")
    public static void method3090(class357 arg0) {
        Statics.field2259 = arg0;
    }

    @ObfuscatedName("hg.an(S)V")
    public void method3697() {
        if (this.field2262 != -1) {
            this.method3699(this.field2262);
            this.field2268 = this.field2257;
            this.field2263 = this.field2264;
            this.field2270 = this.field2265;
        }
        this.method3699(this.field2267);
    }

    @ObfuscatedName("hg.av(Ltz;II)V")
    public void method3702(class501 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8129();
            if (var3 == 0) {
                return;
            }
            this.method3698(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("hg.as(Ltz;IIB)V")
    public void method3698(class501 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2267 = arg0.method8133();
        } else if (arg1 == 2) {
            this.field2266 = arg0.method8129();
        } else if (arg1 == 5) {
            this.field2261 = false;
        } else if (arg1 == 7) {
            this.field2262 = arg0.method8133();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("hg.ax(II)V")
    public void method3699(int arg0) {
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
        this.field2257 = (int) (var18 * 256.0D);
        this.field2264 = (int) (var14 * 256.0D);
        this.field2265 = (int) (var16 * 256.0D);
        if (this.field2264 < 0) {
            this.field2264 = 0;
        } else if (this.field2264 > 255) {
            this.field2264 = 255;
        }
        if (this.field2265 < 0) {
            this.field2265 = 0;
        } else if (this.field2265 > 255) {
            this.field2265 = 255;
        }
    }
}
