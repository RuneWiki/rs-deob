package deob;

@ObfuscatedName("ak")
public class class42 extends class185 {

    @ObfuscatedName("ak.v")
    public static class174 field969 = new class174(64);

    @ObfuscatedName("ak.m")
    public int field970 = 0;

    @ObfuscatedName("ak.e")
    public int field971 = -1;

    @ObfuscatedName("ak.h")
    public boolean field972 = true;

    @ObfuscatedName("ak.p")
    public int field976 = -1;

    @ObfuscatedName("ak.j")
    public int field973;

    @ObfuscatedName("ak.i")
    public int field975;

    @ObfuscatedName("ak.u")
    public int field980;

    @ObfuscatedName("ak.l")
    public int field977;

    @ObfuscatedName("ak.k")
    public int field978;

    @ObfuscatedName("ak.q")
    public int field968;

    @ObfuscatedName("cb.x(Ley;I)V")
    public static void method1971(class149 arg0) {
        Statics.field979 = arg0;
    }

    @ObfuscatedName("a.v(II)Lak;")
    public static class42 method520(int arg0) {
        class42 var1 = (class42) field969.method3186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field979.method2751(4, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method809(new class108(var2), arg0);
        }
        var3.method826();
        field969.method3183(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.m(B)V")
    public void method826() {
        if (this.field976 != -1) {
            this.method811(this.field976);
            this.field977 = this.field973;
            this.field978 = this.field975;
            this.field968 = this.field980;
        }
        this.method811(this.field970);
    }

    @ObfuscatedName("ak.e(Ldm;II)V")
    public void method809(class108 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2299();
            if (var3 == 0) {
                return;
            }
            this.method824(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ak.h(Ldm;III)V")
    public void method824(class108 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field970 = arg0.method2131();
        } else if (arg1 == 2) {
            this.field971 = arg0.method2299();
        } else if (arg1 == 5) {
            this.field972 = false;
        } else if (arg1 == 7) {
            this.field976 = arg0.method2131();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ak.p(II)V")
    public void method811(int arg0) {
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
        this.field973 = (int) (var18 * 256.0D);
        this.field975 = (int) (var14 * 256.0D);
        this.field980 = (int) (var16 * 256.0D);
        if (this.field975 < 0) {
            this.field975 = 0;
        } else if (this.field975 > 255) {
            this.field975 = 255;
        }
        if (this.field980 < 0) {
            this.field980 = 0;
        } else if (this.field980 > 255) {
            this.field980 = 255;
        }
    }
}
