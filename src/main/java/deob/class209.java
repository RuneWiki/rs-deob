package deob;

@ObfuscatedName("ia")
public class class209 extends class470 {

    @ObfuscatedName("ia.ay")
    public static class289 field2251 = new class289(64);

    @ObfuscatedName("ia.ar")
    public int field2247 = 0;

    @ObfuscatedName("ia.am")
    public int field2248 = -1;

    @ObfuscatedName("ia.as")
    public boolean field2256 = true;

    @ObfuscatedName("ia.aj")
    public int field2250 = -1;

    @ObfuscatedName("ia.ag")
    public int field2249;

    @ObfuscatedName("ia.az")
    public int field2245;

    @ObfuscatedName("ia.av")
    public int field2254;

    @ObfuscatedName("ia.ap")
    public int field2258;

    @ObfuscatedName("ia.aq")
    public int field2255;

    @ObfuscatedName("ia.at")
    public int field2252;

    @ObfuscatedName("ff.aw(Lnd;I)V")
    public static void method2989(class360 arg0) {
        Statics.field2253 = arg0;
    }

    @ObfuscatedName("fa.ay(II)Lia;")
    public static class209 method2884(int arg0) {
        class209 var1 = (class209) field2251.method5152((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2253.method6117(4, arg0);
        class209 var3 = new class209();
        if (var2 != null) {
            var3.method3709(new class514(var2), arg0);
        }
        var3.method3713();
        field2251.method5149(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ia.ar(I)V")
    public void method3713() {
        if (this.field2250 != -1) {
            this.method3711(this.field2250);
            this.field2258 = this.field2249;
            this.field2255 = this.field2245;
            this.field2252 = this.field2254;
        }
        this.method3711(this.field2247);
    }

    @ObfuscatedName("ia.am(Lty;II)V")
    public void method3709(class514 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8244();
            if (var3 == 0) {
                return;
            }
            this.method3710(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ia.as(Lty;IIB)V")
    public void method3710(class514 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2247 = arg0.method8248();
        } else if (arg1 == 2) {
            this.field2248 = arg0.method8244();
        } else if (arg1 == 5) {
            this.field2256 = false;
        } else if (arg1 == 7) {
            this.field2250 = arg0.method8248();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ia.aj(II)V")
    public void method3711(int arg0) {
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
        this.field2249 = (int) (var18 * 256.0D);
        this.field2245 = (int) (var14 * 256.0D);
        this.field2254 = (int) (var16 * 256.0D);
        if (this.field2245 < 0) {
            this.field2245 = 0;
        } else if (this.field2245 > 255) {
            this.field2245 = 255;
        }
        if (this.field2254 < 0) {
            this.field2254 = 0;
        } else if (this.field2254 > 255) {
            this.field2254 = 255;
        }
    }

    @ObfuscatedName("px.ag(I)V")
    public static void method6954() {
        field2251.method5146();
    }
}
