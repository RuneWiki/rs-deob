package deob;

@ObfuscatedName("am")
public class class177 extends class7 {

    @ObfuscatedName("am.g")
    public int field2720;

    @ObfuscatedName("am.d")
    public int field2709;

    @ObfuscatedName("am.b")
    public int field2715 = 0;

    @ObfuscatedName("am.c")
    public static class75 field2703 = new class75(64);

    @ObfuscatedName("am.a")
    public int field2713;

    @ObfuscatedName("am.m")
    public boolean field2706 = true;

    @ObfuscatedName("am.j")
    public int field2718;

    @ObfuscatedName("am.i")
    public int field2702 = -1;

    @ObfuscatedName("am.z")
    public int field2707 = -1;

    @ObfuscatedName("am.y")
    public int field2716;

    @ObfuscatedName("am.x")
    public int field2708;

    @ObfuscatedName("am.i(Ldv;II)V")
    public void method3204(class28 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method450();
            if (var3 == 0) {
                return;
            }
            this.method3209(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("am.b(I)V")
    public void method3205() {
        if (this.field2707 != -1) {
            this.method3208(this.field2707);
            this.field2720 = this.field2708;
            this.field2716 = this.field2709;
            this.field2713 = this.field2718;
        }
        this.method3208(this.field2715);
    }

    @ObfuscatedName("am.z(II)V")
    public void method3208(int arg0) {
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
        this.field2708 = (int) (var18 * 256.0D);
        this.field2709 = (int) (var14 * 256.0D);
        this.field2718 = (int) (var16 * 256.0D);
        if (this.field2709 < 0) {
            this.field2709 = 0;
        } else if (this.field2709 > 255) {
            this.field2709 = 255;
        }
        if (this.field2718 < 0) {
            this.field2718 = 0;
        } else if (this.field2718 > 255) {
            this.field2718 = 255;
        }
    }

    @ObfuscatedName("am.m(Ldv;III)V")
    public void method3209(class28 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2715 = arg0.method316();
        } else if (arg1 == 2) {
            this.field2702 = arg0.method450();
        } else if (arg1 == 5) {
            this.field2706 = false;
        } else if (arg1 == 7) {
            this.field2707 = arg0.method316();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("s.c(II)Lam;")
    public static class177 method1360(int arg0) {
        class177 var1 = (class177) field2703.method1196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2704.method1298(4, arg0);
        class177 var3 = new class177();
        if (var2 != null) {
            var3.method3204(new class28(var2), arg0);
        }
        var3.method3205();
        field2703.method1184(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bm.x(I)V")
    public static void method2173() {
        field2703.method1188();
    }

    @ObfuscatedName("ah.v(Lel;S)V")
    public static void method3462(class87 arg0) {
        Statics.field2704 = arg0;
    }
}
