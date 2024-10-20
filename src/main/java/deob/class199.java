package deob;

@ObfuscatedName("hf")
public class class199 extends class457 {

    @ObfuscatedName("hf.an")
    public static class287 field2083 = new class287(64);

    @ObfuscatedName("hf.av")
    public int field2084 = 0;

    @ObfuscatedName("hf.as")
    public int field2086;

    @ObfuscatedName("hf.ax")
    public int field2087;

    @ObfuscatedName("hf.ap")
    public int field2082;

    @ObfuscatedName("hf.ab")
    public int field2088;

    @ObfuscatedName("mm.at(Lnq;I)V")
    public static void method5425(class357 arg0) {
        Statics.field2085 = arg0;
    }

    @ObfuscatedName("ha.an(IB)Lhf;")
    public static class199 method3238(int arg0) {
        class199 var1 = (class199) field2083.method5121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2085.method6080(1, arg0);
        class199 var3 = new class199();
        if (var2 != null) {
            var3.method3461(new class501(var2), arg0);
        }
        var3.method3452();
        field2083.method5123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hf.av(I)V")
    public void method3452() {
        this.method3455(this.field2084);
    }

    @ObfuscatedName("hf.as(Ltz;II)V")
    public void method3461(class501 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8129();
            if (var3 == 0) {
                return;
            }
            this.method3475(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("hf.ax(Ltz;IIS)V")
    public void method3475(class501 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2084 = arg0.method8133();
        }
    }

    @ObfuscatedName("hf.ap(II)V")
    public void method3455(int arg0) {
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
        this.field2087 = (int) (var14 * 256.0D);
        this.field2082 = (int) (var16 * 256.0D);
        if (this.field2087 < 0) {
            this.field2087 = 0;
        } else if (this.field2087 > 255) {
            this.field2087 = 255;
        }
        if (this.field2082 < 0) {
            this.field2082 = 0;
        } else if (this.field2082 > 255) {
            this.field2082 = 255;
        }
        if (var16 > 0.5D) {
            this.field2088 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2088 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2088 < 1) {
            this.field2088 = 1;
        }
        this.field2086 = (int) ((double) this.field2088 * var18);
    }

    @ObfuscatedName("sw.ab(I)V")
    public static void method7990() {
        field2083.method5124();
    }
}
