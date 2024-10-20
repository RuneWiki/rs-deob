package deob;

@ObfuscatedName("gv")
public class class195 extends class151 {

    @ObfuscatedName("gv.q")
    public static class146 field2834 = new class146(64);

    @ObfuscatedName("gv.t")
    public int field2835 = -1;

    @ObfuscatedName("gv.p")
    public int[] field2836;

    @ObfuscatedName("gv.u")
    public short[] field2837;

    @ObfuscatedName("gv.z")
    public short[] field2838;

    @ObfuscatedName("gv.l")
    public short[] field2839;

    @ObfuscatedName("gv.v")
    public short[] field2840;

    @ObfuscatedName("gv.g")
    public int[] field2843 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("gv.w")
    public boolean field2842 = false;

    @ObfuscatedName("dv.d(Lgd;Lgd;S)V")
    public static void method2146(class185 arg0, class185 arg1) {
        Statics.field58 = arg0;
        Statics.field2845 = arg1;
        Statics.field2841 = Statics.field58.method3097(3);
    }

    @ObfuscatedName("w.c(II)Lgv;")
    public static class195 method152(int arg0) {
        class195 var1 = (class195) field2834.method2598((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field58.method3129(3, arg0);
        class195 var3 = new class195();
        if (var2 != null) {
            var3.method3297(new class130(var2));
        }
        field2834.method2607(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gv.n(Ldu;B)V")
    public void method3297(class130 arg0) {
        while (true) {
            int var2 = arg0.method2379();
            if (var2 == 0) {
                return;
            }
            this.method3299(arg0, var2);
        }
    }

    @ObfuscatedName("gv.q(Ldu;II)V")
    public void method3299(class130 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2835 = arg0.method2379();
        } else if (arg1 == 2) {
            int var3 = arg0.method2379();
            this.field2836 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2836[var4] = arg0.method2232();
            }
        } else if (arg1 == 3) {
            this.field2842 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2379();
            this.field2837 = new short[var5];
            this.field2838 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2837[var6] = (short) arg0.method2232();
                this.field2838[var6] = (short) arg0.method2232();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2379();
            this.field2839 = new short[var7];
            this.field2840 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2839[var8] = (short) arg0.method2232();
                this.field2840[var8] = (short) arg0.method2232();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2843[arg1 - 60] = arg0.method2232();
        }
    }

    @ObfuscatedName("gv.t(B)Z")
    public boolean method3314() {
        if (this.field2836 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2836.length; var2++) {
            if (!Statics.field2845.method3089(this.field2836[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gv.p(I)Lbd;")
    public class77 method3298() {
        if (this.field2836 == null) {
            return null;
        }
        class77[] var1 = new class77[this.field2836.length];
        for (int var2 = 0; var2 < this.field2836.length; var2++) {
            var1[var2] = class77.method1394(Statics.field2845, this.field2836[var2], 0);
        }
        class77 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class77(var1, var1.length);
        }
        if (this.field2837 != null) {
            for (int var4 = 0; var4 < this.field2837.length; var4++) {
                var3.method1406(this.field2837[var4], this.field2838[var4]);
            }
        }
        if (this.field2839 != null) {
            for (int var5 = 0; var5 < this.field2839.length; var5++) {
                var3.method1407(this.field2839[var5], this.field2840[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("gv.u(I)Z")
    public boolean method3320() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2843[var2] != -1 && !Statics.field2845.method3089(this.field2843[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gv.w(B)Lbd;")
    public class77 method3326() {
        class77[] var1 = new class77[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2843[var3] != -1) {
                var1[var2++] = class77.method1394(Statics.field2845, this.field2843[var3], 0);
            }
        }
        class77 var4 = new class77(var1, var2);
        if (this.field2837 != null) {
            for (int var5 = 0; var5 < this.field2837.length; var5++) {
                var4.method1406(this.field2837[var5], this.field2838[var5]);
            }
        }
        if (this.field2839 != null) {
            for (int var6 = 0; var6 < this.field2839.length; var6++) {
                var4.method1407(this.field2839[var6], this.field2840[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fk.r(I)V")
    public static void method2907() {
        field2834.method2603();
    }
}
