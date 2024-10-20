package deob;

@ObfuscatedName("gh")
public class class193 extends class130 {

    @ObfuscatedName("gh.k")
    public static class125 field2829 = new class125(64);

    @ObfuscatedName("gh.g")
    public int field2820 = -1;

    @ObfuscatedName("gh.n")
    public int[] field2821;

    @ObfuscatedName("gh.a")
    public short[] field2825;

    @ObfuscatedName("gh.q")
    public short[] field2819;

    @ObfuscatedName("gh.w")
    public short[] field2824;

    @ObfuscatedName("gh.v")
    public short[] field2823;

    @ObfuscatedName("gh.h")
    public int[] field2826 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("gh.p")
    public boolean field2830 = false;

    @ObfuscatedName("k.i(Lgq;Lgq;I)V")
    public static void method37(class183 arg0, class183 arg1) {
        Statics.field3281 = arg0;
        Statics.field2822 = arg1;
        Statics.field2818 = Statics.field3281.method3023(3);
    }

    @ObfuscatedName("ct.e(II)Lgh;")
    public static class193 method1778(int arg0) {
        class193 var1 = (class193) field2829.method2150((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3281.method3014(3, arg0);
        class193 var3 = new class193();
        if (var2 != null) {
            var3.method3232(new class154(var2));
        }
        field2829.method2152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gh.f(Let;I)V")
    public void method3232(class154 arg0) {
        while (true) {
            int var2 = arg0.method2573();
            if (var2 == 0) {
                return;
            }
            this.method3233(arg0, var2);
        }
    }

    @ObfuscatedName("gh.k(Let;II)V")
    public void method3233(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2820 = arg0.method2573();
        } else if (arg1 == 2) {
            int var3 = arg0.method2573();
            this.field2821 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2821[var4] = arg0.method2575();
            }
        } else if (arg1 == 3) {
            this.field2830 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2573();
            this.field2825 = new short[var5];
            this.field2819 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2825[var6] = (short) arg0.method2575();
                this.field2819[var6] = (short) arg0.method2575();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2573();
            this.field2824 = new short[var7];
            this.field2823 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2824[var8] = (short) arg0.method2575();
                this.field2823[var8] = (short) arg0.method2575();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2826[arg1 - 60] = arg0.method2575();
        }
    }

    @ObfuscatedName("gh.a(B)Z")
    public boolean method3234() {
        if (this.field2821 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2821.length; var2++) {
            if (!Statics.field2822.method3016(this.field2821[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gh.q(S)Lbv;")
    public class77 method3249() {
        if (this.field2821 == null) {
            return null;
        }
        class77[] var1 = new class77[this.field2821.length];
        for (int var2 = 0; var2 < this.field2821.length; var2++) {
            var1[var2] = class77.method1374(Statics.field2822, this.field2821[var2], 0);
        }
        class77 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class77(var1, var1.length);
        }
        if (this.field2825 != null) {
            for (int var4 = 0; var4 < this.field2825.length; var4++) {
                var3.method1405(this.field2825[var4], this.field2819[var4]);
            }
        }
        if (this.field2824 != null) {
            for (int var5 = 0; var5 < this.field2824.length; var5++) {
                var3.method1398(this.field2824[var5], this.field2823[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("gh.w(I)Z")
    public boolean method3236() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2826[var2] != -1 && !Statics.field2822.method3016(this.field2826[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gh.v(B)Lbv;")
    public class77 method3237() {
        class77[] var1 = new class77[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2826[var3] != -1) {
                var1[var2++] = class77.method1374(Statics.field2822, this.field2826[var3], 0);
            }
        }
        class77 var4 = new class77(var1, var2);
        if (this.field2825 != null) {
            for (int var5 = 0; var5 < this.field2825.length; var5++) {
                var4.method1405(this.field2825[var5], this.field2819[var5]);
            }
        }
        if (this.field2824 != null) {
            for (int var6 = 0; var6 < this.field2824.length; var6++) {
                var4.method1398(this.field2824[var6], this.field2823[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("dq.h(B)V")
    public static void method1882() {
        field2829.method2155();
    }
}
