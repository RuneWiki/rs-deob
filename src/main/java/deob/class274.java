package deob;

@ObfuscatedName("jv")
public class class274 extends class219 {

    @ObfuscatedName("jv.e")
    public static class213 field3500 = new class213(64);

    @ObfuscatedName("jv.b")
    public int field3501 = 0;

    @ObfuscatedName("jv.z")
    public int field3502;

    @ObfuscatedName("jv.n")
    public int field3503;

    @ObfuscatedName("jv.l")
    public int field3499;

    @ObfuscatedName("jv.s")
    public int field3505;

    @ObfuscatedName("be.g(Ljr;I)V")
    public static void method1584(class262 arg0) {
        Statics.field3507 = arg0;
    }

    @ObfuscatedName("eu.e(IB)Ljv;")
    public static class274 method2932(int arg0) {
        class274 var1 = (class274) field3500.method3706((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3507.method4294(1, arg0);
        class274 var3 = new class274();
        if (var2 != null) {
            var3.method4522(new class195(var2), arg0);
        }
        var3.method4533();
        field3500.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jv.b(I)V")
    public void method4533() {
        this.method4524(this.field3501);
    }

    @ObfuscatedName("jv.z(Lgg;II)V")
    public void method4522(class195 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3332();
            if (var3 == 0) {
                return;
            }
            this.method4535(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jv.n(Lgg;III)V")
    public void method4535(class195 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3501 = arg0.method3312();
        }
    }

    @ObfuscatedName("jv.l(II)V")
    public void method4524(int arg0) {
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
        this.field3503 = (int) (var14 * 256.0D);
        this.field3499 = (int) (var16 * 256.0D);
        if (this.field3503 < 0) {
            this.field3503 = 0;
        } else if (this.field3503 > 255) {
            this.field3503 = 255;
        }
        if (this.field3499 < 0) {
            this.field3499 = 0;
        } else if (this.field3499 > 255) {
            this.field3499 = 255;
        }
        if (var16 > 0.5D) {
            this.field3505 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3505 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3505 < 1) {
            this.field3505 = 1;
        }
        this.field3502 = (int) ((double) this.field3505 * var18);
    }
}
