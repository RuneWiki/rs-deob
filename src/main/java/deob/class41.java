package deob;

@ObfuscatedName("ab")
public class class41 extends class182 {

    @ObfuscatedName("ab.b")
    public static class171 field959 = new class171(64);

    @ObfuscatedName("ab.e")
    public int field960 = 0;

    @ObfuscatedName("ab.i")
    public int field968 = -1;

    @ObfuscatedName("ab.t")
    public boolean field962 = true;

    @ObfuscatedName("ab.z")
    public int field967 = -1;

    @ObfuscatedName("ab.g")
    public int field964;

    @ObfuscatedName("ab.c")
    public int field965;

    @ObfuscatedName("ab.o")
    public int field966;

    @ObfuscatedName("ab.q")
    public int field970;

    @ObfuscatedName("ab.w")
    public int field974;

    @ObfuscatedName("ab.y")
    public int field969;

    @ObfuscatedName("ah.k(Ley;B)V")
    public static void method582(class146 arg0) {
        Statics.field961 = arg0;
    }

    @ObfuscatedName("w.b(II)Lab;")
    public static class41 method135(int arg0) {
        class41 var1 = (class41) field959.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field961.method2759(4, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method791(new class107(var2), arg0);
        }
        var3.method799();
        field959.method3161(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.e(I)V")
    public void method799() {
        if (this.field967 != -1) {
            this.method793(this.field967);
            this.field970 = this.field964;
            this.field974 = this.field965;
            this.field969 = this.field966;
        }
        this.method793(this.field960);
    }

    @ObfuscatedName("ab.i(Ldi;IB)V")
    public void method791(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2115();
            if (var3 == 0) {
                return;
            }
            this.method796(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ab.t(Ldi;III)V")
    public void method796(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field960 = arg0.method2119();
        } else if (arg1 == 2) {
            this.field968 = arg0.method2115();
        } else if (arg1 == 5) {
            this.field962 = false;
        } else if (arg1 == 7) {
            this.field967 = arg0.method2119();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ab.z(II)V")
    public void method793(int arg0) {
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
        this.field964 = (int) (var18 * 256.0D);
        this.field965 = (int) (var14 * 256.0D);
        this.field966 = (int) (var16 * 256.0D);
        if (this.field965 < 0) {
            this.field965 = 0;
        } else if (this.field965 > 255) {
            this.field965 = 255;
        }
        if (this.field966 < 0) {
            this.field966 = 0;
        } else if (this.field966 > 255) {
            this.field966 = 255;
        }
    }
}
