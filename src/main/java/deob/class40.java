package deob;

@ObfuscatedName("ax")
public class class40 extends class182 {

    @ObfuscatedName("ax.h")
    public static class171 field940 = new class171(64);

    @ObfuscatedName("ax.k")
    public int field948 = -1;

    @ObfuscatedName("ax.l")
    public int[] field950;

    @ObfuscatedName("ax.e")
    public short[] field943;

    @ObfuscatedName("ax.j")
    public short[] field944;

    @ObfuscatedName("ax.n")
    public short[] field945;

    @ObfuscatedName("ax.f")
    public short[] field946;

    @ObfuscatedName("ax.a")
    public int[] field947 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ax.i")
    public boolean field937 = false;

    @ObfuscatedName("cl.g(Lec;Lec;I)V")
    public static void method1991(class146 arg0, class146 arg1) {
        Statics.field938 = arg0;
        Statics.field942 = arg1;
        Statics.field939 = Statics.field938.method2718(3);
    }

    @ObfuscatedName("cw.v(II)Lax;")
    public static class40 method2088(int arg0) {
        class40 var1 = (class40) field940.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field938.method2708(3, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method771(new class107(var2));
        }
        field940.method3167(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.z(Ldm;I)V")
    public void method771(class107 arg0) {
        while (true) {
            int var2 = arg0.method2139();
            if (var2 == 0) {
                return;
            }
            this.method772(arg0, var2);
        }
    }

    @ObfuscatedName("ax.h(Ldm;II)V")
    public void method772(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field948 = arg0.method2139();
        } else if (arg1 == 2) {
            int var3 = arg0.method2139();
            this.field950 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field950[var4] = arg0.method2141();
            }
        } else if (arg1 == 3) {
            this.field937 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2139();
            this.field943 = new short[var5];
            this.field944 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field943[var6] = (short) arg0.method2141();
                this.field944[var6] = (short) arg0.method2141();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2139();
            this.field945 = new short[var7];
            this.field946 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field945[var8] = (short) arg0.method2141();
                this.field946[var8] = (short) arg0.method2141();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field947[arg1 - 60] = arg0.method2141();
        }
    }

    @ObfuscatedName("ax.k(I)Z")
    public boolean method802() {
        if (this.field950 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field950.length; var2++) {
            if (!Statics.field942.method2710(this.field950[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ax.l(I)Lcv;")
    public class93 method798() {
        if (this.field950 == null) {
            return null;
        }
        class93[] var1 = new class93[this.field950.length];
        for (int var2 = 0; var2 < this.field950.length; var2++) {
            var1[var2] = class93.method1903(Statics.field942, this.field950[var2], 0);
        }
        class93 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class93(var1, var1.length);
        }
        if (this.field943 != null) {
            for (int var4 = 0; var4 < this.field943.length; var4++) {
                var3.method1916(this.field943[var4], this.field944[var4]);
            }
        }
        if (this.field945 != null) {
            for (int var5 = 0; var5 < this.field945.length; var5++) {
                var3.method1917(this.field945[var5], this.field946[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ax.e(I)Z")
    public boolean method775() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field947[var2] != -1 && !Statics.field942.method2710(this.field947[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ax.j(I)Lcv;")
    public class93 method776() {
        class93[] var1 = new class93[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field947[var3] != -1) {
                var1[var2++] = class93.method1903(Statics.field942, this.field947[var3], 0);
            }
        }
        class93 var4 = new class93(var1, var2);
        if (this.field943 != null) {
            for (int var5 = 0; var5 < this.field943.length; var5++) {
                var4.method1916(this.field943[var5], this.field944[var5]);
            }
        }
        if (this.field945 != null) {
            for (int var6 = 0; var6 < this.field945.length; var6++) {
                var4.method1917(this.field945[var6], this.field946[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("dr.n(B)V")
    public static void method2412() {
        field940.method3176();
    }
}
