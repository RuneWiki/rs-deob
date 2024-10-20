package deob;

@ObfuscatedName("au")
public class class40 extends class183 {

    @ObfuscatedName("au.i")
    public static class172 field945 = new class172(64);

    @ObfuscatedName("au.d")
    public int field944 = -1;

    @ObfuscatedName("au.q")
    public int[] field940;

    @ObfuscatedName("au.m")
    public short[] field950;

    @ObfuscatedName("au.a")
    public short[] field947;

    @ObfuscatedName("au.w")
    public short[] field948;

    @ObfuscatedName("au.e")
    public short[] field949;

    @ObfuscatedName("au.o")
    public int[] field946 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("au.v")
    public boolean field951 = false;

    @ObfuscatedName("o.n(Lej;Lej;I)V")
    public static void method137(class147 arg0, class147 arg1) {
        Statics.field943 = arg0;
        Statics.field941 = arg1;
        Statics.field942 = Statics.field943.method2684(3);
    }

    @ObfuscatedName("d.x(IB)Lau;")
    public static class40 method35(int arg0) {
        class40 var1 = (class40) field945.method3115((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field943.method2738(3, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method774(new class107(var2));
        }
        field945.method3117(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.k(Ldw;I)V")
    public void method774(class107 arg0) {
        while (true) {
            int var2 = arg0.method2148();
            if (var2 == 0) {
                return;
            }
            this.method776(arg0, var2);
        }
    }

    @ObfuscatedName("au.i(Ldw;IS)V")
    public void method776(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field944 = arg0.method2148();
        } else if (arg1 == 2) {
            int var3 = arg0.method2148();
            this.field940 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field940[var4] = arg0.method2140();
            }
        } else if (arg1 == 3) {
            this.field951 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2148();
            this.field950 = new short[var5];
            this.field947 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field950[var6] = (short) arg0.method2140();
                this.field947[var6] = (short) arg0.method2140();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2148();
            this.field948 = new short[var7];
            this.field949 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field948[var8] = (short) arg0.method2140();
                this.field949[var8] = (short) arg0.method2140();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field946[arg1 - 60] = arg0.method2140();
        }
    }

    @ObfuscatedName("au.d(S)Z")
    public boolean method783() {
        if (this.field940 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field940.length; var2++) {
            if (!Statics.field941.method2712(this.field940[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("au.q(I)Lcx;")
    public class93 method777() {
        if (this.field940 == null) {
            return null;
        }
        class93[] var1 = new class93[this.field940.length];
        for (int var2 = 0; var2 < this.field940.length; var2++) {
            var1[var2] = class93.method1894(Statics.field941, this.field940[var2], 0);
        }
        class93 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class93(var1, var1.length);
        }
        if (this.field950 != null) {
            for (int var4 = 0; var4 < this.field950.length; var4++) {
                var3.method1907(this.field950[var4], this.field947[var4]);
            }
        }
        if (this.field948 != null) {
            for (int var5 = 0; var5 < this.field948.length; var5++) {
                var3.method1953(this.field948[var5], this.field949[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("au.m(I)Z")
    public boolean method778() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field946[var2] != -1 && !Statics.field941.method2712(this.field946[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("au.a(B)Lcx;")
    public class93 method788() {
        class93[] var1 = new class93[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field946[var3] != -1) {
                var1[var2++] = class93.method1894(Statics.field941, this.field946[var3], 0);
            }
        }
        class93 var4 = new class93(var1, var2);
        if (this.field950 != null) {
            for (int var5 = 0; var5 < this.field950.length; var5++) {
                var4.method1907(this.field950[var5], this.field947[var5]);
            }
        }
        if (this.field948 != null) {
            for (int var6 = 0; var6 < this.field948.length; var6++) {
                var4.method1953(this.field948[var6], this.field949[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("at.w(I)V")
    public static void method619() {
        field945.method3124();
    }
}
