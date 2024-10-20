package deob;

@ObfuscatedName("gg")
public class class193 extends class130 {

    @ObfuscatedName("gg.d")
    public static class125 field2815 = new class125(64);

    @ObfuscatedName("gg.w")
    public int field2822 = -1;

    @ObfuscatedName("gg.h")
    public int[] field2817;

    @ObfuscatedName("gg.u")
    public short[] field2818;

    @ObfuscatedName("gg.k")
    public short[] field2819;

    @ObfuscatedName("gg.g")
    public short[] field2814;

    @ObfuscatedName("gg.y")
    public short[] field2813;

    @ObfuscatedName("gg.e")
    public int[] field2824 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("gg.q")
    public boolean field2823 = false;

    @ObfuscatedName("af.x(Lgk;Lgk;I)V")
    public static void method670(class183 arg0, class183 arg1) {
        Statics.field2816 = arg0;
        Statics.field2821 = arg1;
        Statics.field919 = Statics.field2816.method3108(3);
    }

    @ObfuscatedName("fz.j(IB)Lgg;")
    public static class193 method3092(int arg0) {
        class193 var1 = (class193) field2815.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2816.method3121(3, arg0);
        class193 var3 = new class193();
        if (var2 != null) {
            var3.method3292(new class154(var2));
        }
        field2815.method2223(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gg.c(Lek;I)V")
    public void method3292(class154 arg0) {
        while (true) {
            int var2 = arg0.method2701();
            if (var2 == 0) {
                return;
            }
            this.method3299(arg0, var2);
        }
    }

    @ObfuscatedName("gg.d(Lek;II)V")
    public void method3299(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2822 = arg0.method2701();
        } else if (arg1 == 2) {
            int var3 = arg0.method2701();
            this.field2817 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2817[var4] = arg0.method2745();
            }
        } else if (arg1 == 3) {
            this.field2823 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2701();
            this.field2818 = new short[var5];
            this.field2819 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2818[var6] = (short) arg0.method2745();
                this.field2819[var6] = (short) arg0.method2745();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2701();
            this.field2814 = new short[var7];
            this.field2813 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2814[var8] = (short) arg0.method2745();
                this.field2813[var8] = (short) arg0.method2745();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2824[arg1 - 60] = arg0.method2745();
        }
    }

    @ObfuscatedName("gg.w(B)Z")
    public boolean method3294() {
        if (this.field2817 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2817.length; var2++) {
            if (!Statics.field2821.method3166(this.field2817[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gg.u(B)Lbg;")
    public class77 method3295() {
        if (this.field2817 == null) {
            return null;
        }
        class77[] var1 = new class77[this.field2817.length];
        for (int var2 = 0; var2 < this.field2817.length; var2++) {
            var1[var2] = class77.method1437(Statics.field2821, this.field2817[var2], 0);
        }
        class77 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class77(var1, var1.length);
        }
        if (this.field2818 != null) {
            for (int var4 = 0; var4 < this.field2818.length; var4++) {
                var3.method1470(this.field2818[var4], this.field2819[var4]);
            }
        }
        if (this.field2814 != null) {
            for (int var5 = 0; var5 < this.field2814.length; var5++) {
                var3.method1451(this.field2814[var5], this.field2813[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("gg.y(I)Z")
    public boolean method3293() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2824[var2] != -1 && !Statics.field2821.method3166(this.field2824[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gg.e(B)Lbg;")
    public class77 method3314() {
        class77[] var1 = new class77[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2824[var3] != -1) {
                var1[var2++] = class77.method1437(Statics.field2821, this.field2824[var3], 0);
            }
        }
        class77 var4 = new class77(var1, var2);
        if (this.field2818 != null) {
            for (int var5 = 0; var5 < this.field2818.length; var5++) {
                var4.method1470(this.field2818[var5], this.field2819[var5]);
            }
        }
        if (this.field2814 != null) {
            for (int var6 = 0; var6 < this.field2814.length; var6++) {
                var4.method1451(this.field2814[var6], this.field2813[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ek.q(I)V")
    public static void method2686() {
        field2815.method2225();
    }
}
