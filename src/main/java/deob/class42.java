package deob;

@ObfuscatedName("al")
public class class42 extends class194 {

    @ObfuscatedName("al.c")
    public static class183 field940 = new class183(64);

    @ObfuscatedName("al.u")
    public int field947 = -1;

    @ObfuscatedName("al.w")
    public int[] field944;

    @ObfuscatedName("al.i")
    public short[] field943;

    @ObfuscatedName("al.r")
    public short[] field946;

    @ObfuscatedName("al.f")
    public short[] field945;

    @ObfuscatedName("al.g")
    public short[] field942;

    @ObfuscatedName("al.o")
    public int[] field941 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("al.h")
    public boolean field948 = false;

    @ObfuscatedName("aw.e(Lfv;Lfv;I)V")
    public static void method614(class158 arg0, class158 arg1) {
        Statics.field939 = arg0;
        Statics.field938 = arg1;
        Statics.field937 = Statics.field939.method2864(3);
    }

    @ObfuscatedName("q.a(IB)Lal;")
    public static class42 method508(int arg0) {
        class42 var1 = (class42) field940.method3302((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field939.method2843(3, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method798(new class111(var2));
        }
        field940.method3304(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.l(Ldh;B)V")
    public void method798(class111 arg0) {
        while (true) {
            int var2 = arg0.method2176();
            if (var2 == 0) {
                return;
            }
            this.method793(arg0, var2);
        }
    }

    @ObfuscatedName("al.c(Ldh;IS)V")
    public void method793(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field947 = arg0.method2176();
        } else if (arg1 == 2) {
            int var3 = arg0.method2176();
            this.field944 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field944[var4] = arg0.method2178();
            }
        } else if (arg1 == 3) {
            this.field948 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2176();
            this.field943 = new short[var5];
            this.field946 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field943[var6] = (short) arg0.method2178();
                this.field946[var6] = (short) arg0.method2178();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2176();
            this.field945 = new short[var7];
            this.field942 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field945[var8] = (short) arg0.method2178();
                this.field942[var8] = (short) arg0.method2178();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field941[arg1 - 60] = arg0.method2178();
        }
    }

    @ObfuscatedName("al.u(S)Z")
    public boolean method796() {
        if (this.field944 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field944.length; var2++) {
            if (!Statics.field938.method2856(this.field944[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("al.w(S)Lcr;")
    public class95 method797() {
        if (this.field944 == null) {
            return null;
        }
        class95[] var1 = new class95[this.field944.length];
        for (int var2 = 0; var2 < this.field944.length; var2++) {
            var1[var2] = class95.method1937(Statics.field938, this.field944[var2], 0);
        }
        class95 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class95(var1, var1.length);
        }
        if (this.field943 != null) {
            for (int var4 = 0; var4 < this.field943.length; var4++) {
                var3.method1936(this.field943[var4], this.field946[var4]);
            }
        }
        if (this.field945 != null) {
            for (int var5 = 0; var5 < this.field945.length; var5++) {
                var3.method1951(this.field945[var5], this.field942[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("al.i(B)Z")
    public boolean method816() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field941[var2] != -1 && !Statics.field938.method2856(this.field941[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("al.r(I)Lcr;")
    public class95 method812() {
        class95[] var1 = new class95[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field941[var3] != -1) {
                var1[var2++] = class95.method1937(Statics.field938, this.field941[var3], 0);
            }
        }
        class95 var4 = new class95(var1, var2);
        if (this.field943 != null) {
            for (int var5 = 0; var5 < this.field943.length; var5++) {
                var4.method1936(this.field943[var5], this.field946[var5]);
            }
        }
        if (this.field945 != null) {
            for (int var6 = 0; var6 < this.field945.length; var6++) {
                var4.method1951(this.field945[var6], this.field942[var6]);
            }
        }
        return var4;
    }
}
