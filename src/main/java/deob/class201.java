package deob;

@ObfuscatedName("ht")
public class class201 extends class504 {

    @ObfuscatedName("ht.ae")
    public static class317 field2098 = new class317(64);

    @ObfuscatedName("ht.ag")
    public int field2099 = 0;

    @ObfuscatedName("ht.am")
    public int field2097;

    @ObfuscatedName("ht.ax")
    public int field2100;

    @ObfuscatedName("ht.aq")
    public int field2101;

    @ObfuscatedName("ht.af")
    public int field2103;

    @ObfuscatedName("hr.ac(Lpo;I)V")
    public static void method3511(class391 arg0) {
        Statics.field2102 = arg0;
    }

    @ObfuscatedName("ht.ae(B)V")
    public void method3681() {
        this.method3684(this.field2099);
    }

    @ObfuscatedName("ht.ag(Lvf;IB)V")
    public void method3682(class551 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8955();
            if (var3 == 0) {
                return;
            }
            this.method3683(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ht.am(Lvf;III)V")
    public void method3683(class551 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2099 = arg0.method8978();
        }
    }

    @ObfuscatedName("ht.ax(II)V")
    public void method3684(int arg0) {
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
        this.field2100 = (int) (var14 * 256.0D);
        this.field2101 = (int) (var16 * 256.0D);
        if (this.field2100 < 0) {
            this.field2100 = 0;
        } else if (this.field2100 > 255) {
            this.field2100 = 255;
        }
        if (this.field2101 < 0) {
            this.field2101 = 0;
        } else if (this.field2101 > 255) {
            this.field2101 = 255;
        }
        if (var16 > 0.5D) {
            this.field2103 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2103 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2103 < 1) {
            this.field2103 = 1;
        }
        this.field2097 = (int) ((double) this.field2103 * var18);
    }
}
