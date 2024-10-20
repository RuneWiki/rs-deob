package deob;

@ObfuscatedName("go")
public class class193 extends class130 {

    @ObfuscatedName("go.a")
    public static class125 field2800 = new class125(64);

    @ObfuscatedName("go.f")
    public int field2804 = -1;

    @ObfuscatedName("go.c")
    public int[] field2798;

    @ObfuscatedName("go.d")
    public short[] field2803;

    @ObfuscatedName("go.l")
    public short[] field2813;

    @ObfuscatedName("go.g")
    public short[] field2805;

    @ObfuscatedName("go.z")
    public short[] field2806;

    @ObfuscatedName("go.t")
    public int[] field2807 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("go.m")
    public boolean field2808 = false;

    @ObfuscatedName("fm.u(Lgt;Lgt;B)V")
    public static void method3037(class183 arg0, class183 arg1) {
        Statics.field2801 = arg0;
        Statics.field2811 = arg1;
        Statics.field2094 = Statics.field2801.method3122(3);
    }

    @ObfuscatedName("fw.x(II)Lgo;")
    public static class193 method2951(int arg0) {
        class193 var1 = (class193) field2800.method2186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2801.method3071(3, arg0);
        class193 var3 = new class193();
        if (var2 != null) {
            var3.method3274(new class154(var2));
        }
        field2800.method2179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("go.i(Len;I)V")
    public void method3274(class154 arg0) {
        while (true) {
            int var2 = arg0.method2708();
            if (var2 == 0) {
                return;
            }
            this.method3275(arg0, var2);
        }
    }

    @ObfuscatedName("go.a(Len;IB)V")
    public void method3275(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2804 = arg0.method2708();
        } else if (arg1 == 2) {
            int var3 = arg0.method2708();
            this.field2798 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2798[var4] = arg0.method2581();
            }
        } else if (arg1 == 3) {
            this.field2808 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2708();
            this.field2803 = new short[var5];
            this.field2813 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2803[var6] = (short) arg0.method2581();
                this.field2813[var6] = (short) arg0.method2581();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2708();
            this.field2805 = new short[var7];
            this.field2806 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2805[var8] = (short) arg0.method2581();
                this.field2806[var8] = (short) arg0.method2581();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2807[arg1 - 60] = arg0.method2581();
        }
    }

    @ObfuscatedName("go.c(I)Z")
    public boolean method3276() {
        if (this.field2798 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2798.length; var2++) {
            if (!Statics.field2811.method3063(this.field2798[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("go.g(I)Lbc;")
    public class77 method3277() {
        if (this.field2798 == null) {
            return null;
        }
        class77[] var1 = new class77[this.field2798.length];
        for (int var2 = 0; var2 < this.field2798.length; var2++) {
            var1[var2] = class77.method1393(Statics.field2811, this.field2798[var2], 0);
        }
        class77 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class77(var1, var1.length);
        }
        if (this.field2803 != null) {
            for (int var4 = 0; var4 < this.field2803.length; var4++) {
                var3.method1357(this.field2803[var4], this.field2813[var4]);
            }
        }
        if (this.field2805 != null) {
            for (int var5 = 0; var5 < this.field2805.length; var5++) {
                var3.method1399(this.field2805[var5], this.field2806[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("go.z(B)Z")
    public boolean method3278() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2807[var2] != -1 && !Statics.field2811.method3063(this.field2807[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("go.t(I)Lbc;")
    public class77 method3279() {
        class77[] var1 = new class77[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2807[var3] != -1) {
                var1[var2++] = class77.method1393(Statics.field2811, this.field2807[var3], 0);
            }
        }
        class77 var4 = new class77(var1, var2);
        if (this.field2803 != null) {
            for (int var5 = 0; var5 < this.field2803.length; var5++) {
                var4.method1357(this.field2803[var5], this.field2813[var5]);
            }
        }
        if (this.field2805 != null) {
            for (int var6 = 0; var6 < this.field2805.length; var6++) {
                var4.method1399(this.field2805[var6], this.field2806[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("as.m(I)V")
    public static void method853() {
        field2800.method2176();
    }
}
