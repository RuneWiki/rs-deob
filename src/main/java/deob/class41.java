package deob;

@ObfuscatedName("ak")
public class class41 extends class183 {

    @ObfuscatedName("ak.y")
    public static class172 field950 = new class172(64);

    @ObfuscatedName("ak.s")
    public int field943 = 0;

    @ObfuscatedName("ak.g")
    public int field949 = -1;

    @ObfuscatedName("ak.h")
    public boolean field945 = true;

    @ObfuscatedName("ak.l")
    public int field941 = -1;

    @ObfuscatedName("ak.e")
    public int field947;

    @ObfuscatedName("ak.u")
    public int field948;

    @ObfuscatedName("ak.j")
    public int field952;

    @ObfuscatedName("ak.c")
    public int field946;

    @ObfuscatedName("ak.d")
    public int field942;

    @ObfuscatedName("ak.v")
    public int field954;

    @ObfuscatedName("ab.k(II)Lak;")
    public static class41 method493(int arg0) {
        class41 var1 = (class41) field950.method3202((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field944.method2729(4, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method782(new class107(var2), arg0);
        }
        var3.method769();
        field950.method3204(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.y(I)V")
    public void method769() {
        if (this.field941 != -1) {
            this.method772(this.field941);
            this.field946 = this.field947;
            this.field942 = this.field948;
            this.field954 = this.field952;
        }
        this.method772(this.field943);
    }

    @ObfuscatedName("ak.s(Ldy;II)V")
    public void method782(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2138();
            if (var3 == 0) {
                return;
            }
            this.method784(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ak.g(Ldy;III)V")
    public void method784(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field943 = arg0.method2142();
        } else if (arg1 == 2) {
            this.field949 = arg0.method2138();
        } else if (arg1 == 5) {
            this.field945 = false;
        } else if (arg1 == 7) {
            this.field941 = arg0.method2142();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ak.h(IB)V")
    public void method772(int arg0) {
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
        this.field947 = (int) (var18 * 256.0D);
        this.field948 = (int) (var14 * 256.0D);
        this.field952 = (int) (var16 * 256.0D);
        if (this.field948 < 0) {
            this.field948 = 0;
        } else if (this.field948 > 255) {
            this.field948 = 255;
        }
        if (this.field952 < 0) {
            this.field952 = 0;
        } else if (this.field952 > 255) {
            this.field952 = 255;
        }
    }

    @ObfuscatedName("c.l(B)V")
    public static void method113() {
        field950.method3210();
    }
}
