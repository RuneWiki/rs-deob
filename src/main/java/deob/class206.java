package deob;

@ObfuscatedName("hf")
public class class206 extends class488 {

    @ObfuscatedName("hf.aw")
    public static class304 field2238 = new class304(64);

    @ObfuscatedName("hf.al")
    public int field2236 = 0;

    @ObfuscatedName("hf.ai")
    public int field2237 = -1;

    @ObfuscatedName("hf.ar")
    public boolean field2234 = true;

    @ObfuscatedName("hf.as")
    public int field2246 = -1;

    @ObfuscatedName("hf.aa")
    public int field2240;

    @ObfuscatedName("hf.az")
    public int field2241;

    @ObfuscatedName("hf.ao")
    public int field2242;

    @ObfuscatedName("hf.au")
    public int field2243;

    @ObfuscatedName("hf.ak")
    public int field2244;

    @ObfuscatedName("hf.ah")
    public int field2239;

    @ObfuscatedName("hf.aw(S)V")
    public void method3699() {
        if (this.field2246 != -1) {
            this.method3702(this.field2246);
            this.field2243 = this.field2240;
            this.field2244 = this.field2241;
            this.field2239 = this.field2242;
        }
        this.method3702(this.field2236);
    }

    @ObfuscatedName("hf.al(Luq;II)V")
    public void method3700(class534 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8591();
            if (var3 == 0) {
                return;
            }
            this.method3701(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("hf.ai(Luq;IIB)V")
    public void method3701(class534 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2236 = arg0.method8595();
        } else if (arg1 == 2) {
            this.field2237 = arg0.method8591();
        } else if (arg1 == 5) {
            this.field2234 = false;
        } else if (arg1 == 7) {
            this.field2246 = arg0.method8595();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("hf.ar(IB)V")
    public void method3702(int arg0) {
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
        this.field2240 = (int) (var18 * 256.0D);
        this.field2241 = (int) (var14 * 256.0D);
        this.field2242 = (int) (var16 * 256.0D);
        if (this.field2241 < 0) {
            this.field2241 = 0;
        } else if (this.field2241 > 255) {
            this.field2241 = 255;
        }
        if (this.field2242 < 0) {
            this.field2242 = 0;
        } else if (this.field2242 > 255) {
            this.field2242 = 255;
        }
    }

    @ObfuscatedName("fr.as(I)V")
    public static void method2961() {
        field2238.method5418();
    }
}
