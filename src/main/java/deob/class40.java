package deob;

@ObfuscatedName("ax")
public class class40 extends class183 {

    @ObfuscatedName("ax.c")
    public static class172 field948 = new class172(64);

    @ObfuscatedName("ax.n")
    public int field945 = -1;

    @ObfuscatedName("ax.s")
    public int[] field946;

    @ObfuscatedName("ax.r")
    public short[] field947;

    @ObfuscatedName("ax.w")
    public short[] field942;

    @ObfuscatedName("ax.u")
    public short[] field949;

    @ObfuscatedName("ax.d")
    public short[] field950;

    @ObfuscatedName("ax.h")
    public int[] field951 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ax.a")
    public boolean field944 = false;

    @ObfuscatedName("q.p(Ler;Ler;I)V")
    public static void method508(class147 arg0, class147 arg1) {
        Statics.field952 = arg0;
        Statics.field943 = arg1;
        Statics.field941 = Statics.field952.method2796(3);
    }

    @ObfuscatedName("cy.g(II)Lax;")
    public static class40 method2099(int arg0) {
        class40 var1 = (class40) field948.method3225((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field952.method2855(3, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method801(new class107(var2));
        }
        field948.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.x(Ldp;I)V")
    public void method801(class107 arg0) {
        while (true) {
            int var2 = arg0.method2173();
            if (var2 == 0) {
                return;
            }
            this.method793(arg0, var2);
        }
    }

    @ObfuscatedName("ax.c(Ldp;IB)V")
    public void method793(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field945 = arg0.method2173();
        } else if (arg1 == 2) {
            int var3 = arg0.method2173();
            this.field946 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field946[var4] = arg0.method2175();
            }
        } else if (arg1 == 3) {
            this.field944 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2173();
            this.field947 = new short[var5];
            this.field942 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field947[var6] = (short) arg0.method2175();
                this.field942[var6] = (short) arg0.method2175();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2173();
            this.field949 = new short[var7];
            this.field950 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field949[var8] = (short) arg0.method2175();
                this.field950[var8] = (short) arg0.method2175();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field951[arg1 - 60] = arg0.method2175();
        }
    }

    @ObfuscatedName("ax.n(I)Z")
    public boolean method794() {
        if (this.field946 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field946.length; var2++) {
            if (!Statics.field943.method2805(this.field946[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ax.s(I)Lcq;")
    public class93 method795() {
        if (this.field946 == null) {
            return null;
        }
        class93[] var1 = new class93[this.field946.length];
        for (int var2 = 0; var2 < this.field946.length; var2++) {
            var1[var2] = class93.method1943(Statics.field943, this.field946[var2], 0);
        }
        class93 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class93(var1, var1.length);
        }
        if (this.field947 != null) {
            for (int var4 = 0; var4 < this.field947.length; var4++) {
                var3.method1955(this.field947[var4], this.field942[var4]);
            }
        }
        if (this.field949 != null) {
            for (int var5 = 0; var5 < this.field949.length; var5++) {
                var3.method1956(this.field949[var5], this.field950[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ax.r(I)Z")
    public boolean method796() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field951[var2] != -1 && !Statics.field943.method2805(this.field951[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ax.w(I)Lcq;")
    public class93 method815() {
        class93[] var1 = new class93[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field951[var3] != -1) {
                var1[var2++] = class93.method1943(Statics.field943, this.field951[var3], 0);
            }
        }
        class93 var4 = new class93(var1, var2);
        if (this.field947 != null) {
            for (int var5 = 0; var5 < this.field947.length; var5++) {
                var4.method1955(this.field947[var5], this.field942[var5]);
            }
        }
        if (this.field949 != null) {
            for (int var6 = 0; var6 < this.field949.length; var6++) {
                var4.method1956(this.field949[var6], this.field950[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ao.u(I)V")
    public static void method629() {
        field948.method3227();
    }
}
