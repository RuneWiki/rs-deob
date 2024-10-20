package deob;

@ObfuscatedName("ai")
public class class44 extends class208 {

    @ObfuscatedName("ai.l")
    public static class197 field1009 = new class197(64);

    @ObfuscatedName("ai.c")
    public int field1011 = 0;

    @ObfuscatedName("ai.h")
    public int field1012;

    @ObfuscatedName("ai.r")
    public int field1016;

    @ObfuscatedName("ai.a")
    public int field1014;

    @ObfuscatedName("ai.b")
    public int field1015;

    @ObfuscatedName("y.e(Lfe;I)V")
    public static void method186(class171 arg0) {
        Statics.field1013 = arg0;
    }

    @ObfuscatedName("s.l(II)Lai;")
    public static class44 method574(int arg0) {
        class44 var1 = (class44) field1009.method3589((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1013.method3130(1, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method859(new class123(var2), arg0);
        }
        var3.method858();
        field1009.method3591(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.c(B)V")
    public void method858() {
        this.method861(this.field1011);
    }

    @ObfuscatedName("ai.h(Ldd;II)V")
    public void method859(class123 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2464();
            if (var3 == 0) {
                return;
            }
            this.method860(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ai.r(Ldd;III)V")
    public void method860(class123 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1011 = arg0.method2557();
        }
    }

    @ObfuscatedName("ai.a(II)V")
    public void method861(int arg0) {
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
        this.field1016 = (int) (var14 * 256.0D);
        this.field1014 = (int) (var16 * 256.0D);
        if (this.field1016 < 0) {
            this.field1016 = 0;
        } else if (this.field1016 > 255) {
            this.field1016 = 255;
        }
        if (this.field1014 < 0) {
            this.field1014 = 0;
        } else if (this.field1014 > 255) {
            this.field1014 = 255;
        }
        if (var16 > 0.5D) {
            this.field1015 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field1015 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field1015 < 1) {
            this.field1015 = 1;
        }
        this.field1012 = (int) ((double) this.field1015 * var18);
    }

    @ObfuscatedName("dv.b(B)V")
    public static void method2238() {
        field1009.method3590();
    }
}
