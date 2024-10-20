package deob;

@ObfuscatedName("gl")
public class class193 extends class130 {

    @ObfuscatedName("gl.q")
    public static class125 field2816 = new class125(64);

    @ObfuscatedName("gl.d")
    public int field2817 = -1;

    @ObfuscatedName("gl.k")
    public int[] field2823;

    @ObfuscatedName("gl.j")
    public short[] field2818;

    @ObfuscatedName("gl.s")
    public short[] field2814;

    @ObfuscatedName("gl.o")
    public short[] field2821;

    @ObfuscatedName("gl.a")
    public short[] field2822;

    @ObfuscatedName("gl.c")
    public int[] field2824 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("gl.m")
    public boolean field2819 = false;

    @ObfuscatedName("z.p(Lgp;Lgp;I)V")
    public static void method187(class183 arg0, class183 arg1) {
        Statics.field3283 = arg0;
        Statics.field2820 = arg1;
        Statics.field2815 = Statics.field3283.method3068(3);
    }

    @ObfuscatedName("ga.g(II)Lgl;")
    public static class193 method3160(int arg0) {
        class193 var1 = (class193) field2816.method2169((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3283.method3044(3, arg0);
        class193 var3 = new class193();
        if (var2 != null) {
            var3.method3243(new class154(var2));
        }
        field2816.method2174(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gl.x(Lev;I)V")
    public void method3243(class154 arg0) {
        while (true) {
            int var2 = arg0.method2593();
            if (var2 == 0) {
                return;
            }
            this.method3262(arg0, var2);
        }
    }

    @ObfuscatedName("gl.q(Lev;IB)V")
    public void method3262(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2817 = arg0.method2593();
        } else if (arg1 == 2) {
            int var3 = arg0.method2593();
            this.field2823 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2823[var4] = arg0.method2595();
            }
        } else if (arg1 == 3) {
            this.field2819 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2593();
            this.field2818 = new short[var5];
            this.field2814 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2818[var6] = (short) arg0.method2595();
                this.field2814[var6] = (short) arg0.method2595();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2593();
            this.field2821 = new short[var7];
            this.field2822 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2821[var8] = (short) arg0.method2595();
                this.field2822[var8] = (short) arg0.method2595();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2824[arg1 - 60] = arg0.method2595();
        }
    }

    @ObfuscatedName("gl.d(I)Z")
    public boolean method3238() {
        if (this.field2823 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2823.length; var2++) {
            if (!Statics.field2820.method3085(this.field2823[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gl.k(I)Lbz;")
    public class77 method3241() {
        if (this.field2823 == null) {
            return null;
        }
        class77[] var1 = new class77[this.field2823.length];
        for (int var2 = 0; var2 < this.field2823.length; var2++) {
            var1[var2] = class77.method1361(Statics.field2820, this.field2823[var2], 0);
        }
        class77 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class77(var1, var1.length);
        }
        if (this.field2818 != null) {
            for (int var4 = 0; var4 < this.field2818.length; var4++) {
                var3.method1373(this.field2818[var4], this.field2814[var4]);
            }
        }
        if (this.field2821 != null) {
            for (int var5 = 0; var5 < this.field2821.length; var5++) {
                var3.method1374(this.field2821[var5], this.field2822[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("gl.j(I)Z")
    public boolean method3240() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2824[var2] != -1 && !Statics.field2820.method3085(this.field2824[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gl.s(I)Lbz;")
    public class77 method3249() {
        class77[] var1 = new class77[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2824[var3] != -1) {
                var1[var2++] = class77.method1361(Statics.field2820, this.field2824[var3], 0);
            }
        }
        class77 var4 = new class77(var1, var2);
        if (this.field2818 != null) {
            for (int var5 = 0; var5 < this.field2818.length; var5++) {
                var4.method1373(this.field2818[var5], this.field2814[var5]);
            }
        }
        if (this.field2821 != null) {
            for (int var6 = 0; var6 < this.field2821.length; var6++) {
                var4.method1374(this.field2821[var6], this.field2822[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("dm.o(I)V")
    public static void method1934() {
        field2816.method2170();
    }
}
