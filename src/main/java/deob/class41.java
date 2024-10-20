package deob;

@ObfuscatedName("ao")
public class class41 extends class185 {

    @ObfuscatedName("ao.j")
    public static class174 field943 = new class174(64);

    @ObfuscatedName("ao.w")
    public int field944 = -1;

    @ObfuscatedName("ao.c")
    public int[] field945;

    @ObfuscatedName("ao.x")
    public short[] field956;

    @ObfuscatedName("ao.f")
    public short[] field947;

    @ObfuscatedName("ao.t")
    public short[] field948;

    @ObfuscatedName("ao.n")
    public short[] field941;

    @ObfuscatedName("ao.p")
    public int[] field950 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ao.a")
    public boolean field940 = false;

    @ObfuscatedName("s.l(Leo;Leo;B)V")
    public static void method455(class149 arg0, class149 arg1) {
        Statics.field949 = arg0;
        Statics.field942 = arg1;
        Statics.field951 = Statics.field949.method2799(3);
    }

    @ObfuscatedName("cv.y(II)Lao;")
    public static class41 method1863(int arg0) {
        class41 var1 = (class41) field943.method3225((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field949.method2752(3, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method767(new class108(var2));
        }
        field943.method3211(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.g(Ldk;I)V")
    public void method767(class108 arg0) {
        while (true) {
            int var2 = arg0.method2291();
            if (var2 == 0) {
                return;
            }
            this.method785(arg0, var2);
        }
    }

    @ObfuscatedName("ao.j(Ldk;II)V")
    public void method785(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field944 = arg0.method2291();
        } else if (arg1 == 2) {
            int var3 = arg0.method2291();
            this.field945 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field945[var4] = arg0.method2163();
            }
        } else if (arg1 == 3) {
            this.field940 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2291();
            this.field956 = new short[var5];
            this.field947 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field956[var6] = (short) arg0.method2163();
                this.field947[var6] = (short) arg0.method2163();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2291();
            this.field948 = new short[var7];
            this.field941 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field948[var8] = (short) arg0.method2163();
                this.field941[var8] = (short) arg0.method2163();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field950[arg1 - 60] = arg0.method2163();
        }
    }

    @ObfuscatedName("ao.w(I)Z")
    public boolean method769() {
        if (this.field945 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field945.length; var2++) {
            if (!Statics.field942.method2783(this.field945[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ao.c(I)Lcm;")
    public class94 method768() {
        if (this.field945 == null) {
            return null;
        }
        class94[] var1 = new class94[this.field945.length];
        for (int var2 = 0; var2 < this.field945.length; var2++) {
            var1[var2] = class94.method1902(Statics.field942, this.field945[var2], 0);
        }
        class94 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class94(var1, var1.length);
        }
        if (this.field956 != null) {
            for (int var4 = 0; var4 < this.field956.length; var4++) {
                var3.method1908(this.field956[var4], this.field947[var4]);
            }
        }
        if (this.field948 != null) {
            for (int var5 = 0; var5 < this.field948.length; var5++) {
                var3.method1899(this.field948[var5], this.field941[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ao.x(I)Z")
    public boolean method771() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field950[var2] != -1 && !Statics.field942.method2783(this.field950[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ao.f(S)Lcm;")
    public class94 method773() {
        class94[] var1 = new class94[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field950[var3] != -1) {
                var1[var2++] = class94.method1902(Statics.field942, this.field950[var3], 0);
            }
        }
        class94 var4 = new class94(var1, var2);
        if (this.field956 != null) {
            for (int var5 = 0; var5 < this.field956.length; var5++) {
                var4.method1908(this.field956[var5], this.field947[var5]);
            }
        }
        if (this.field948 != null) {
            for (int var6 = 0; var6 < this.field948.length; var6++) {
                var4.method1899(this.field948[var6], this.field941[var6]);
            }
        }
        return var4;
    }
}
