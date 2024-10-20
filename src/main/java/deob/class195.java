package deob;

@ObfuscatedName("hr")
public class class195 extends class444 {

    @ObfuscatedName("hr.an")
    public static class280 field2094 = new class280(64);

    @ObfuscatedName("hr.aw")
    public int field2090 = 0;

    @ObfuscatedName("hr.ac")
    public int field2091;

    @ObfuscatedName("hr.au")
    public int field2093;

    @ObfuscatedName("hr.ab")
    public int field2096;

    @ObfuscatedName("hr.aq")
    public int field2095;

    @ObfuscatedName("cl.af(Lnm;S)V")
    public static void method1732(class344 arg0) {
        Statics.field2092 = arg0;
    }

    @ObfuscatedName("hr.an(I)V")
    public void method3534() {
        this.method3537(this.field2090);
    }

    @ObfuscatedName("hr.aw(Lsg;II)V")
    public void method3544(class489 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8248();
            if (var3 == 0) {
                return;
            }
            this.method3536(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("hr.ac(Lsg;IIB)V")
    public void method3536(class489 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2090 = arg0.method8252();
        }
    }

    @ObfuscatedName("hr.au(II)V")
    public void method3537(int arg0) {
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
        this.field2093 = (int) (var14 * 256.0D);
        this.field2096 = (int) (var16 * 256.0D);
        if (this.field2093 < 0) {
            this.field2093 = 0;
        } else if (this.field2093 > 255) {
            this.field2093 = 255;
        }
        if (this.field2096 < 0) {
            this.field2096 = 0;
        } else if (this.field2096 > 255) {
            this.field2096 = 255;
        }
        if (var16 > 0.5D) {
            this.field2095 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2095 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2095 < 1) {
            this.field2095 = 1;
        }
        this.field2091 = (int) ((double) this.field2095 * var18);
    }

    @ObfuscatedName("lh.ab(B)V")
    public static void method5172() {
        field2094.method5125();
    }
}
