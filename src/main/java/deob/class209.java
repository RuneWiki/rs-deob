package deob;

@ObfuscatedName("ie")
public class class209 extends class501 {

    @ObfuscatedName("ie.ad")
    public static class313 field2272 = new class313(64);

    @ObfuscatedName("ie.ag")
    public int field2269 = 0;

    @ObfuscatedName("ie.ak")
    public int field2267 = -1;

    @ObfuscatedName("ie.ap")
    public boolean field2275 = true;

    @ObfuscatedName("ie.an")
    public int field2273 = -1;

    @ObfuscatedName("ie.aj")
    public int field2271;

    @ObfuscatedName("ie.av")
    public int field2270;

    @ObfuscatedName("ie.ab")
    public int field2274;

    @ObfuscatedName("ie.ai")
    public int field2276;

    @ObfuscatedName("ie.ae")
    public int field2277;

    @ObfuscatedName("ie.au")
    public int field2268;

    @ObfuscatedName("co.aq(IB)Lie;")
    public static class209 method1105(int arg0) {
        class209 var1 = (class209) field2272.method5495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2278.method6539(4, arg0);
        class209 var3 = new class209();
        if (var2 != null) {
            var3.method3731(new class547(var2), arg0);
        }
        var3.method3730();
        field2272.method5498(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ie.ad(I)V")
    public void method3730() {
        if (this.field2273 != -1) {
            this.method3740(this.field2273);
            this.field2276 = this.field2271;
            this.field2277 = this.field2270;
            this.field2268 = this.field2274;
        }
        this.method3740(this.field2269);
    }

    @ObfuscatedName("ie.ag(Lvp;II)V")
    public void method3731(class547 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8804();
            if (var3 == 0) {
                return;
            }
            this.method3738(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ie.ak(Lvp;III)V")
    public void method3738(class547 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2269 = arg0.method8732();
        } else if (arg1 == 2) {
            this.field2267 = arg0.method8804();
        } else if (arg1 == 5) {
            this.field2275 = false;
        } else if (arg1 == 7) {
            this.field2273 = arg0.method8732();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ie.ap(II)V")
    public void method3740(int arg0) {
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
        this.field2271 = (int) (var18 * 256.0D);
        this.field2270 = (int) (var14 * 256.0D);
        this.field2274 = (int) (var16 * 256.0D);
        if (this.field2270 < 0) {
            this.field2270 = 0;
        } else if (this.field2270 > 255) {
            this.field2270 = 255;
        }
        if (this.field2274 < 0) {
            this.field2274 = 0;
        } else if (this.field2274 > 255) {
            this.field2274 = 255;
        }
    }
}
