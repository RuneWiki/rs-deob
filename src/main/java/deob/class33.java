package deob;

@ObfuscatedName("ar")
public class class33 extends class174 {

    @ObfuscatedName("ar.h")
    public static class170 field881 = new class170(64);

    @ObfuscatedName("ar.s")
    public int field868 = 0;

    @ObfuscatedName("ar.o")
    public int field869;

    @ObfuscatedName("ar.p")
    public int field870;

    @ObfuscatedName("ar.x")
    public int field866;

    @ObfuscatedName("ar.k")
    public int field871;

    @ObfuscatedName("bw.g(II)Lar;")
    public static class33 method1535(int arg0) {
        class33 var1 = (class33) field881.method3303((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field880.method3080(1, arg0);
        class33 var3 = new class33();
        if (var2 != null) {
            var3.method689(new class127(var2), arg0);
        }
        var3.method688();
        field881.method3313(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.h(I)V")
    public void method688() {
        this.method693(this.field868);
    }

    @ObfuscatedName("ar.s(Ldw;II)V")
    public void method689(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2499();
            if (var3 == 0) {
                return;
            }
            this.method690(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ar.o(Ldw;IIB)V")
    public void method690(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field868 = arg0.method2503();
        }
    }

    @ObfuscatedName("ar.p(II)V")
    public void method693(int arg0) {
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
        this.field870 = (int) (var14 * 256.0D);
        this.field866 = (int) (var16 * 256.0D);
        if (this.field870 < 0) {
            this.field870 = 0;
        } else if (this.field870 > 255) {
            this.field870 = 255;
        }
        if (this.field866 < 0) {
            this.field866 = 0;
        } else if (this.field866 > 255) {
            this.field866 = 255;
        }
        if (var16 > 0.5D) {
            this.field871 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field871 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field871 < 1) {
            this.field871 = 1;
        }
        this.field869 = (int) ((double) this.field871 * var18);
    }

    @ObfuscatedName("cy.x(B)V")
    public static void method2081() {
        field881.method3306();
    }
}
