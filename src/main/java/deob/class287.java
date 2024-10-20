package deob;

@ObfuscatedName("kv")
public class class287 extends class219 {

    @ObfuscatedName("kv.i")
    public static class213 field3740 = new class213(64);

    @ObfuscatedName("kv.o")
    public int field3736 = 0;

    @ObfuscatedName("kv.j")
    public int field3737 = -1;

    @ObfuscatedName("kv.k")
    public boolean field3734 = true;

    @ObfuscatedName("kv.x")
    public int field3739 = -1;

    @ObfuscatedName("kv.z")
    public int field3744;

    @ObfuscatedName("kv.p")
    public int field3741;

    @ObfuscatedName("kv.w")
    public int field3746;

    @ObfuscatedName("kv.r")
    public int field3743;

    @ObfuscatedName("kv.d")
    public int field3742;

    @ObfuscatedName("kv.a")
    public int field3745;

    @ObfuscatedName("il.c(Ljm;B)V")
    public static void method4097(class262 arg0) {
        Statics.field3738 = arg0;
    }

    @ObfuscatedName("jb.i(II)Lkv;")
    public static class287 method4369(int arg0) {
        class287 var1 = (class287) field3740.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3738.method4190(4, arg0);
        class287 var3 = new class287();
        if (var2 != null) {
            var3.method4783(new class195(var2), arg0);
        }
        var3.method4790();
        field3740.method3628(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("kv.o(I)V")
    public void method4790() {
        if (this.field3739 != -1) {
            this.method4785(this.field3739);
            this.field3743 = this.field3744;
            this.field3742 = this.field3741;
            this.field3745 = this.field3746;
        }
        this.method4785(this.field3736);
    }

    @ObfuscatedName("kv.j(Lgp;IB)V")
    public void method4783(class195 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3429();
            if (var3 == 0) {
                return;
            }
            this.method4789(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("kv.k(Lgp;IIB)V")
    public void method4789(class195 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3736 = arg0.method3293();
        } else if (arg1 == 2) {
            this.field3737 = arg0.method3429();
        } else if (arg1 == 5) {
            this.field3734 = false;
        } else if (arg1 == 7) {
            this.field3739 = arg0.method3293();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("kv.x(II)V")
    public void method4785(int arg0) {
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
        this.field3744 = (int) (var18 * 256.0D);
        this.field3741 = (int) (var14 * 256.0D);
        this.field3746 = (int) (var16 * 256.0D);
        if (this.field3741 < 0) {
            this.field3741 = 0;
        } else if (this.field3741 > 255) {
            this.field3741 = 255;
        }
        if (this.field3746 < 0) {
            this.field3746 = 0;
        } else if (this.field3746 > 255) {
            this.field3746 = 255;
        }
    }
}
