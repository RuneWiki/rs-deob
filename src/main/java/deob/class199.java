package deob;

@ObfuscatedName("hi")
public class class199 extends class501 {

    @ObfuscatedName("hi.ad")
    public static class313 field2087 = new class313(64);

    @ObfuscatedName("hi.ag")
    public int field2089 = 0;

    @ObfuscatedName("hi.ak")
    public int field2090;

    @ObfuscatedName("hi.ap")
    public int field2091;

    @ObfuscatedName("hi.an")
    public int field2088;

    @ObfuscatedName("hi.aj")
    public int field2097;

    @ObfuscatedName("gr.aq(Lok;B)V")
    public static void method3182(class388 arg0) {
        Statics.field2092 = arg0;
    }

    @ObfuscatedName("hi.ad(I)V")
    public void method3489() {
        this.method3492(this.field2089);
    }

    @ObfuscatedName("hi.ag(Lvp;II)V")
    public void method3490(class547 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8804();
            if (var3 == 0) {
                return;
            }
            this.method3491(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("hi.ak(Lvp;III)V")
    public void method3491(class547 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2089 = arg0.method8732();
        }
    }

    @ObfuscatedName("hi.ap(II)V")
    public void method3492(int arg0) {
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
        this.field2091 = (int) (var14 * 256.0D);
        this.field2088 = (int) (var16 * 256.0D);
        if (this.field2091 < 0) {
            this.field2091 = 0;
        } else if (this.field2091 > 255) {
            this.field2091 = 255;
        }
        if (this.field2088 < 0) {
            this.field2088 = 0;
        } else if (this.field2088 > 255) {
            this.field2088 = 255;
        }
        if (var16 > 0.5D) {
            this.field2097 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2097 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2097 < 1) {
            this.field2097 = 1;
        }
        this.field2090 = (int) ((double) this.field2097 * var18);
    }
}
