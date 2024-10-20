package deob;

@ObfuscatedName("fu")
public class class157 extends class142 {

    @ObfuscatedName("fu.e")
    public static class100 field2392 = new class100(64);

    @ObfuscatedName("fu.a")
    public int field2390 = -1;

    @ObfuscatedName("fu.g")
    public int[] field2389;

    @ObfuscatedName("fu.w")
    public short[] field2393;

    @ObfuscatedName("fu.v")
    public short[] field2397;

    @ObfuscatedName("fu.u")
    public short[] field2394;

    @ObfuscatedName("fu.m")
    public short[] field2395;

    @ObfuscatedName("fu.b")
    public int[] field2396 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("fu.f")
    public boolean field2388 = false;

    @ObfuscatedName("ci.e(II)Lfu;")
    public static class157 method1214(int arg0) {
        class157 var1 = (class157) field2392.method1231((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2391.method1015(3, arg0);
        class157 var3 = new class157();
        if (var2 != null) {
            var3.method2451(new class135(var2));
        }
        field2392.method1232(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fu.a(Lec;I)V")
    public void method2451(class135 arg0) {
        while (true) {
            int var2 = arg0.method1571();
            if (var2 == 0) {
                return;
            }
            this.method2433(arg0, var2);
        }
    }

    @ObfuscatedName("fu.g(Lec;IB)V")
    public void method2433(class135 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2390 = arg0.method1571();
        } else if (arg1 == 2) {
            int var3 = arg0.method1571();
            this.field2389 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2389[var4] = arg0.method1725();
            }
        } else if (arg1 == 3) {
            this.field2388 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method1571();
            this.field2393 = new short[var5];
            this.field2397 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2393[var6] = (short) arg0.method1725();
                this.field2397[var6] = (short) arg0.method1725();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method1571();
            this.field2394 = new short[var7];
            this.field2395 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2394[var8] = (short) arg0.method1725();
                this.field2395[var8] = (short) arg0.method1725();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2396[arg1 - 60] = arg0.method1725();
        }
    }

    @ObfuscatedName("fu.w(I)Z")
    public boolean method2434() {
        if (this.field2389 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2389.length; var2++) {
            if (!Statics.field168.method1017(this.field2389[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fu.v(I)Lfv;")
    public class179 method2440() {
        if (this.field2389 == null) {
            return null;
        }
        class179[] var1 = new class179[this.field2389.length];
        for (int var2 = 0; var2 < this.field2389.length; var2++) {
            var1[var2] = class179.method2908(Statics.field168, this.field2389[var2], 0);
        }
        class179 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class179(var1, var1.length);
        }
        if (this.field2393 != null) {
            for (int var4 = 0; var4 < this.field2393.length; var4++) {
                var3.method2920(this.field2393[var4], this.field2397[var4]);
            }
        }
        if (this.field2394 != null) {
            for (int var5 = 0; var5 < this.field2394.length; var5++) {
                var3.method2921(this.field2394[var5], this.field2395[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("fu.u(B)Z")
    public boolean method2449() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2396[var2] != -1 && !Statics.field168.method1017(this.field2396[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fu.m(B)Lfv;")
    public class179 method2437() {
        class179[] var1 = new class179[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2396[var3] != -1) {
                var1[var2++] = class179.method2908(Statics.field168, this.field2396[var3], 0);
            }
        }
        class179 var4 = new class179(var1, var2);
        if (this.field2393 != null) {
            for (int var5 = 0; var5 < this.field2393.length; var5++) {
                var4.method2920(this.field2393[var5], this.field2397[var5]);
            }
        }
        if (this.field2394 != null) {
            for (int var6 = 0; var6 < this.field2394.length; var6++) {
                var4.method2921(this.field2394[var6], this.field2395[var6]);
            }
        }
        return var4;
    }
}
