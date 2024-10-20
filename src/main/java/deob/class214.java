package deob;

@ObfuscatedName("iq")
public class class214 extends class489 {

    @ObfuscatedName("iq.ah")
    public static class304 field2192 = new class304(64);

    @ObfuscatedName("iq.af")
    public int field2197 = 0;

    @ObfuscatedName("iq.at")
    public int field2194;

    @ObfuscatedName("iq.an")
    public int field2191;

    @ObfuscatedName("iq.ao")
    public int field2195;

    @ObfuscatedName("iq.ab")
    public int field2193;

    @ObfuscatedName("pn.az(IB)Liq;")
    public static class214 method6830(int arg0) {
        class214 var1 = (class214) field2192.method5336((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2196.method6328(1, arg0);
        class214 var3 = new class214();
        if (var2 != null) {
            var3.method3627(new class535(var2), arg0);
        }
        var3.method3644();
        field2192.method5346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iq.ah(I)V")
    public void method3644() {
        this.method3646(this.field2197);
    }

    @ObfuscatedName("iq.af(Lur;II)V")
    public void method3627(class535 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8462();
            if (var3 == 0) {
                return;
            }
            this.method3626(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("iq.at(Lur;III)V")
    public void method3626(class535 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2197 = arg0.method8466();
        }
    }

    @ObfuscatedName("iq.an(II)V")
    public void method3646(int arg0) {
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
        this.field2191 = (int) (var14 * 256.0D);
        this.field2195 = (int) (var16 * 256.0D);
        if (this.field2191 < 0) {
            this.field2191 = 0;
        } else if (this.field2191 > 255) {
            this.field2191 = 255;
        }
        if (this.field2195 < 0) {
            this.field2195 = 0;
        } else if (this.field2195 > 255) {
            this.field2195 = 255;
        }
        if (var16 > 0.5D) {
            this.field2193 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2193 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2193 < 1) {
            this.field2193 = 1;
        }
        this.field2194 = (int) ((double) this.field2193 * var18);
    }

    @ObfuscatedName("ty.ao(I)V")
    public static void method8154() {
        field2192.method5339();
    }
}
