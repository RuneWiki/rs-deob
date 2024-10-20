package deob;

@ObfuscatedName("gd")
public class class193 extends class130 {

    @ObfuscatedName("gd.h")
    public static class125 field2831 = new class125(64);

    @ObfuscatedName("gd.a")
    public int field2828 = -1;

    @ObfuscatedName("gd.g")
    public int[] field2827;

    @ObfuscatedName("gd.k")
    public short[] field2826;

    @ObfuscatedName("gd.u")
    public short[] field2829;

    @ObfuscatedName("gd.b")
    public short[] field2832;

    @ObfuscatedName("gd.x")
    public short[] field2823;

    @ObfuscatedName("gd.r")
    public int[] field2830 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("gd.n")
    public boolean field2833 = false;

    @ObfuscatedName("gc.c(IB)Lgd;")
    public static class193 method3129(int arg0) {
        class193 var1 = (class193) field2831.method2121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2825.method2986(3, arg0);
        class193 var3 = new class193();
        if (var2 != null) {
            var3.method3200(new class154(var2));
        }
        field2831.method2123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gd.f(Lea;B)V")
    public void method3200(class154 arg0) {
        while (true) {
            int var2 = arg0.method2545();
            if (var2 == 0) {
                return;
            }
            this.method3186(arg0, var2);
        }
    }

    @ObfuscatedName("gd.g(Lea;II)V")
    public void method3186(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2828 = arg0.method2545();
        } else if (arg1 == 2) {
            int var3 = arg0.method2545();
            this.field2827 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2827[var4] = arg0.method2541();
            }
        } else if (arg1 == 3) {
            this.field2833 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2545();
            this.field2826 = new short[var5];
            this.field2829 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2826[var6] = (short) arg0.method2541();
                this.field2829[var6] = (short) arg0.method2541();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2545();
            this.field2832 = new short[var7];
            this.field2823 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2832[var8] = (short) arg0.method2541();
                this.field2823[var8] = (short) arg0.method2541();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2830[arg1 - 60] = arg0.method2541();
        }
    }

    @ObfuscatedName("gd.k(I)Z")
    public boolean method3183() {
        if (this.field2827 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2827.length; var2++) {
            if (!Statics.field576.method2988(this.field2827[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gd.u(I)Lbu;")
    public class77 method3184() {
        if (this.field2827 == null) {
            return null;
        }
        class77[] var1 = new class77[this.field2827.length];
        for (int var2 = 0; var2 < this.field2827.length; var2++) {
            var1[var2] = class77.method1351(Statics.field576, this.field2827[var2], 0);
        }
        class77 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class77(var1, var1.length);
        }
        if (this.field2826 != null) {
            for (int var4 = 0; var4 < this.field2826.length; var4++) {
                var3.method1364(this.field2826[var4], this.field2829[var4]);
            }
        }
        if (this.field2832 != null) {
            for (int var5 = 0; var5 < this.field2832.length; var5++) {
                var3.method1365(this.field2832[var5], this.field2823[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("gd.b(B)Z")
    public boolean method3185() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2830[var2] != -1 && !Statics.field576.method2988(this.field2830[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gd.x(I)Lbu;")
    public class77 method3201() {
        class77[] var1 = new class77[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2830[var3] != -1) {
                var1[var2++] = class77.method1351(Statics.field576, this.field2830[var3], 0);
            }
        }
        class77 var4 = new class77(var1, var2);
        if (this.field2826 != null) {
            for (int var5 = 0; var5 < this.field2826.length; var5++) {
                var4.method1364(this.field2826[var5], this.field2829[var5]);
            }
        }
        if (this.field2832 != null) {
            for (int var6 = 0; var6 < this.field2832.length; var6++) {
                var4.method1365(this.field2832[var6], this.field2823[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ej.r(B)V")
    public static void method2481() {
        field2831.method2124();
    }
}
