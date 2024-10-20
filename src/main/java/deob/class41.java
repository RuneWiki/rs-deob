package deob;

@ObfuscatedName("an")
public class class41 extends class182 {

    @ObfuscatedName("an.c")
    public static class171 field962 = new class171(64);

    @ObfuscatedName("an.h")
    public int field961 = 0;

    @ObfuscatedName("an.v")
    public int field964 = -1;

    @ObfuscatedName("an.q")
    public boolean field968 = true;

    @ObfuscatedName("an.s")
    public int field960 = -1;

    @ObfuscatedName("an.g")
    public int field965;

    @ObfuscatedName("an.u")
    public int field966;

    @ObfuscatedName("an.d")
    public int field967;

    @ObfuscatedName("an.y")
    public int field970;

    @ObfuscatedName("an.e")
    public int field969;

    @ObfuscatedName("an.l")
    public int field963;

    @ObfuscatedName("dp.i(Ler;B)V")
    public static void method2417(class146 arg0) {
        Statics.field735 = arg0;
    }

    @ObfuscatedName("g.c(IB)Lan;")
    public static class41 method88(int arg0) {
        class41 var1 = (class41) field962.method3185((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field735.method2811(4, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method802(new class107(var2), arg0);
        }
        var3.method798();
        field962.method3186(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.h(I)V")
    public void method798() {
        if (this.field960 != -1) {
            this.method801(this.field960);
            this.field970 = this.field965;
            this.field969 = this.field966;
            this.field963 = this.field967;
        }
        this.method801(this.field961);
    }

    @ObfuscatedName("an.v(Ldm;II)V")
    public void method802(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2151();
            if (var3 == 0) {
                return;
            }
            this.method799(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("an.q(Ldm;III)V")
    public void method799(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field961 = arg0.method2336();
        } else if (arg1 == 2) {
            this.field964 = arg0.method2151();
        } else if (arg1 == 5) {
            this.field968 = false;
        } else if (arg1 == 7) {
            this.field960 = arg0.method2336();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("an.s(IB)V")
    public void method801(int arg0) {
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
        this.field965 = (int) (var18 * 256.0D);
        this.field966 = (int) (var14 * 256.0D);
        this.field967 = (int) (var16 * 256.0D);
        if (this.field966 < 0) {
            this.field966 = 0;
        } else if (this.field966 > 255) {
            this.field966 = 255;
        }
        if (this.field967 < 0) {
            this.field967 = 0;
        } else if (this.field967 > 255) {
            this.field967 = 255;
        }
    }

    @ObfuscatedName("dr.g(I)V")
    public static void method2563() {
        field962.method3188();
    }
}
