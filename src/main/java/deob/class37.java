package deob;

@ObfuscatedName("aq")
public class class37 extends class176 {

    @ObfuscatedName("aq.q")
    public static class172 field941 = new class172(64);

    @ObfuscatedName("aq.j")
    public int field942 = -1;

    @ObfuscatedName("aq.z")
    public int[] field943;

    @ObfuscatedName("aq.m")
    public short[] field944;

    @ObfuscatedName("aq.w")
    public short[] field945;

    @ObfuscatedName("aq.a")
    public short[] field946;

    @ObfuscatedName("aq.d")
    public short[] field947;

    @ObfuscatedName("aq.u")
    public int[] field939 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aq.p")
    public boolean field958 = false;

    @ObfuscatedName("ch.e(Lea;Lea;I)V")
    public static void method1680(class155 arg0, class155 arg1) {
        Statics.field957 = arg0;
        Statics.field950 = arg1;
        Statics.field2359 = Statics.field957.method3019(3);
    }

    @ObfuscatedName("o.i(II)Laq;")
    public static class37 method161(int arg0) {
        class37 var1 = (class37) field941.method3262((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field957.method3069(3, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method817(new class128(var2));
        }
        field941.method3264(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.k(Ldl;I)V")
    public void method817(class128 arg0) {
        while (true) {
            int var2 = arg0.method2548();
            if (var2 == 0) {
                return;
            }
            this.method828(arg0, var2);
        }
    }

    @ObfuscatedName("aq.q(Ldl;II)V")
    public void method828(class128 arg0, int arg1) {
        if (arg1 == 1) {
            this.field942 = arg0.method2548();
        } else if (arg1 == 2) {
            int var3 = arg0.method2548();
            this.field943 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field943[var4] = arg0.method2456();
            }
        } else if (arg1 == 3) {
            this.field958 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2548();
            this.field944 = new short[var5];
            this.field945 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field944[var6] = (short) arg0.method2456();
                this.field945[var6] = (short) arg0.method2456();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2548();
            this.field946 = new short[var7];
            this.field947 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field946[var8] = (short) arg0.method2456();
                this.field947[var8] = (short) arg0.method2456();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field939[arg1 - 60] = arg0.method2456();
        }
    }

    @ObfuscatedName("aq.j(I)Z")
    public boolean method829() {
        if (this.field943 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field943.length; var2++) {
            if (!Statics.field950.method3022(this.field943[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aq.z(B)Lcq;")
    public class102 method810() {
        if (this.field943 == null) {
            return null;
        }
        class102[] var1 = new class102[this.field943.length];
        for (int var2 = 0; var2 < this.field943.length; var2++) {
            var1[var2] = class102.method2051(Statics.field950, this.field943[var2], 0);
        }
        class102 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class102(var1, var1.length);
        }
        if (this.field944 != null) {
            for (int var4 = 0; var4 < this.field944.length; var4++) {
                var3.method2063(this.field944[var4], this.field945[var4]);
            }
        }
        if (this.field946 != null) {
            for (int var5 = 0; var5 < this.field946.length; var5++) {
                var3.method2104(this.field946[var5], this.field947[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aq.m(B)Z")
    public boolean method830() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field939[var2] != -1 && !Statics.field950.method3022(this.field939[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aq.w(B)Lcq;")
    public class102 method827() {
        class102[] var1 = new class102[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field939[var3] != -1) {
                var1[var2++] = class102.method2051(Statics.field950, this.field939[var3], 0);
            }
        }
        class102 var4 = new class102(var1, var2);
        if (this.field944 != null) {
            for (int var5 = 0; var5 < this.field944.length; var5++) {
                var4.method2063(this.field944[var5], this.field945[var5]);
            }
        }
        if (this.field946 != null) {
            for (int var6 = 0; var6 < this.field946.length; var6++) {
                var4.method2104(this.field946[var6], this.field947[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("q.a(B)V")
    public static void method27() {
        field941.method3265();
    }
}
