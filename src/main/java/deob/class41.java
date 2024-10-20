package deob;

@ObfuscatedName("ae")
public class class41 extends class181 {

    @ObfuscatedName("ae.u")
    public static class171 field963 = new class171(64);

    @ObfuscatedName("ae.x")
    public int field962 = 0;

    @ObfuscatedName("ae.j")
    public int field965 = -1;

    @ObfuscatedName("ae.o")
    public boolean field966 = true;

    @ObfuscatedName("ae.n")
    public int field967 = -1;

    @ObfuscatedName("ae.y")
    public int field968;

    @ObfuscatedName("ae.f")
    public int field972;

    @ObfuscatedName("ae.p")
    public int field975;

    @ObfuscatedName("ae.l")
    public int field970;

    @ObfuscatedName("ae.k")
    public int field969;

    @ObfuscatedName("ae.q")
    public int field973;

    @ObfuscatedName("ba.b(IB)Lae;")
    public static class41 method1613(int arg0) {
        class41 var1 = (class41) field963.method3114((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field964.method2692(4, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method782(new class107(var2), arg0);
        }
        var3.method781();
        field963.method3116(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.u(B)V")
    public void method781() {
        if (this.field967 != -1) {
            this.method784(this.field967);
            this.field970 = this.field968;
            this.field969 = this.field972;
            this.field973 = this.field975;
        }
        this.method784(this.field962);
    }

    @ObfuscatedName("ae.x(Ldh;IB)V")
    public void method782(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2134();
            if (var3 == 0) {
                return;
            }
            this.method783(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ae.j(Ldh;IIB)V")
    public void method783(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field962 = arg0.method2138();
        } else if (arg1 == 2) {
            this.field965 = arg0.method2134();
        } else if (arg1 == 5) {
            this.field966 = false;
        } else if (arg1 == 7) {
            this.field967 = arg0.method2138();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ae.o(IB)V")
    public void method784(int arg0) {
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
        this.field968 = (int) (var18 * 256.0D);
        this.field972 = (int) (var14 * 256.0D);
        this.field975 = (int) (var16 * 256.0D);
        if (this.field972 < 0) {
            this.field972 = 0;
        } else if (this.field972 > 255) {
            this.field972 = 255;
        }
        if (this.field975 < 0) {
            this.field975 = 0;
        } else if (this.field975 > 255) {
            this.field975 = 255;
        }
    }

    @ObfuscatedName("ai.n(I)V")
    public static void method574() {
        field963.method3117();
    }
}
