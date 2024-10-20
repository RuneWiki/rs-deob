package deob;

@ObfuscatedName("gq")
public class class193 extends class130 {

    @ObfuscatedName("gq.g")
    public static class125 field2821 = new class125(64);

    @ObfuscatedName("gq.h")
    public int field2822 = -1;

    @ObfuscatedName("gq.v")
    public int[] field2826;

    @ObfuscatedName("gq.l")
    public short[] field2824;

    @ObfuscatedName("gq.c")
    public short[] field2825;

    @ObfuscatedName("gq.u")
    public short[] field2823;

    @ObfuscatedName("gq.k")
    public short[] field2819;

    @ObfuscatedName("gq.z")
    public int[] field2828 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("gq.y")
    public boolean field2827 = false;

    @ObfuscatedName("da.o(II)Lgq;")
    public static class193 method2011(int arg0) {
        class193 var1 = (class193) field2821.method2130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2829.method3012(3, arg0);
        class193 var3 = new class193();
        if (var2 != null) {
            var3.method3202(new class154(var2));
        }
        field2821.method2132(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gq.m(Lez;I)V")
    public void method3202(class154 arg0) {
        while (true) {
            int var2 = arg0.method2552();
            if (var2 == 0) {
                return;
            }
            this.method3203(arg0, var2);
        }
    }

    @ObfuscatedName("gq.b(Lez;II)V")
    public void method3203(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2822 = arg0.method2552();
        } else if (arg1 == 2) {
            int var3 = arg0.method2552();
            this.field2826 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2826[var4] = arg0.method2554();
            }
        } else if (arg1 == 3) {
            this.field2827 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2552();
            this.field2824 = new short[var5];
            this.field2825 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2824[var6] = (short) arg0.method2554();
                this.field2825[var6] = (short) arg0.method2554();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2552();
            this.field2823 = new short[var7];
            this.field2819 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2823[var8] = (short) arg0.method2554();
                this.field2819[var8] = (short) arg0.method2554();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2828[arg1 - 60] = arg0.method2554();
        }
    }

    @ObfuscatedName("gq.g(I)Z")
    public boolean method3204() {
        if (this.field2826 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2826.length; var2++) {
            if (!Statics.field61.method3014(this.field2826[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gq.l(I)Lbg;")
    public class77 method3205() {
        if (this.field2826 == null) {
            return null;
        }
        class77[] var1 = new class77[this.field2826.length];
        for (int var2 = 0; var2 < this.field2826.length; var2++) {
            var1[var2] = class77.method1358(Statics.field61, this.field2826[var2], 0);
        }
        class77 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class77(var1, var1.length);
        }
        if (this.field2824 != null) {
            for (int var4 = 0; var4 < this.field2824.length; var4++) {
                var3.method1372(this.field2824[var4], this.field2825[var4]);
            }
        }
        if (this.field2823 != null) {
            for (int var5 = 0; var5 < this.field2823.length; var5++) {
                var3.method1373(this.field2823[var5], this.field2819[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("gq.c(I)Z")
    public boolean method3206() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2828[var2] != -1 && !Statics.field61.method3014(this.field2828[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gq.u(I)Lbg;")
    public class77 method3207() {
        class77[] var1 = new class77[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2828[var3] != -1) {
                var1[var2++] = class77.method1358(Statics.field61, this.field2828[var3], 0);
            }
        }
        class77 var4 = new class77(var1, var2);
        if (this.field2824 != null) {
            for (int var5 = 0; var5 < this.field2824.length; var5++) {
                var4.method1372(this.field2824[var5], this.field2825[var5]);
            }
        }
        if (this.field2823 != null) {
            for (int var6 = 0; var6 < this.field2823.length; var6++) {
                var4.method1373(this.field2823[var6], this.field2819[var6]);
            }
        }
        return var4;
    }
}
