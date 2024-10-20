package deob;

@ObfuscatedName("aq")
public class class42 extends class204 {

    @ObfuscatedName("aq.e")
    public static class193 field971 = new class193(64);

    @ObfuscatedName("aq.u")
    public int field972 = 0;

    @ObfuscatedName("aq.b")
    public int field973;

    @ObfuscatedName("aq.p")
    public int field979;

    @ObfuscatedName("aq.s")
    public int field978;

    @ObfuscatedName("aq.y")
    public int field976;

    @ObfuscatedName("b.o(Lfq;I)V")
    public static void method46(class167 arg0) {
        Statics.field974 = arg0;
    }

    @ObfuscatedName("t.e(II)Laq;")
    public static class42 method101(int arg0) {
        class42 var1 = (class42) field971.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field974.method3057(1, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method821(new class119(var2), arg0);
        }
        var3.method819();
        field971.method3512(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.u(I)V")
    public void method819() {
        this.method822(this.field972);
    }

    @ObfuscatedName("aq.b(Ldi;II)V")
    public void method821(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2427();
            if (var3 == 0) {
                return;
            }
            this.method820(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aq.p(Ldi;III)V")
    public void method820(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field972 = arg0.method2341();
        }
    }

    @ObfuscatedName("aq.s(II)V")
    public void method822(int arg0) {
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
        this.field979 = (int) (var14 * 256.0D);
        this.field978 = (int) (var16 * 256.0D);
        if (this.field979 < 0) {
            this.field979 = 0;
        } else if (this.field979 > 255) {
            this.field979 = 255;
        }
        if (this.field978 < 0) {
            this.field978 = 0;
        } else if (this.field978 > 255) {
            this.field978 = 255;
        }
        if (var16 > 0.5D) {
            this.field976 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field976 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field976 < 1) {
            this.field976 = 1;
        }
        this.field973 = (int) ((double) this.field976 * var18);
    }
}
