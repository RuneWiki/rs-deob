package deob;

@ObfuscatedName("am")
public class class40 extends class182 {

    @ObfuscatedName("am.w")
    public static class171 field947 = new class171(64);

    @ObfuscatedName("am.m")
    public int field948 = -1;

    @ObfuscatedName("am.j")
    public int[] field949;

    @ObfuscatedName("am.g")
    public short[] field944;

    @ObfuscatedName("am.p")
    public short[] field951;

    @ObfuscatedName("am.o")
    public short[] field952;

    @ObfuscatedName("am.b")
    public short[] field953;

    @ObfuscatedName("am.x")
    public int[] field956 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("am.n")
    public boolean field954 = false;

    @ObfuscatedName("f.k(II)Lam;")
    public static class40 method492(int arg0) {
        class40 var1 = (class40) field947.method3141((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field950.method2749(3, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method763(new class107(var2));
        }
        field947.method3137(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.r(Lde;I)V")
    public void method763(class107 arg0) {
        while (true) {
            int var2 = arg0.method2111();
            if (var2 == 0) {
                return;
            }
            this.method764(arg0, var2);
        }
    }

    @ObfuscatedName("am.y(Lde;IB)V")
    public void method764(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field948 = arg0.method2111();
        } else if (arg1 == 2) {
            int var3 = arg0.method2111();
            this.field949 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field949[var4] = arg0.method2232();
            }
        } else if (arg1 == 3) {
            this.field954 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2111();
            this.field944 = new short[var5];
            this.field951 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field944[var6] = (short) arg0.method2232();
                this.field951[var6] = (short) arg0.method2232();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2111();
            this.field952 = new short[var7];
            this.field953 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field952[var8] = (short) arg0.method2232();
                this.field953[var8] = (short) arg0.method2232();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field956[arg1 - 60] = arg0.method2232();
        }
    }

    @ObfuscatedName("am.w(B)Z")
    public boolean method765() {
        if (this.field949 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field949.length; var2++) {
            if (!Statics.field945.method2727(this.field949[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("am.m(I)Lcl;")
    public class93 method780() {
        if (this.field949 == null) {
            return null;
        }
        class93[] var1 = new class93[this.field949.length];
        for (int var2 = 0; var2 < this.field949.length; var2++) {
            var1[var2] = class93.method1922(Statics.field945, this.field949[var2], 0);
        }
        class93 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class93(var1, var1.length);
        }
        if (this.field944 != null) {
            for (int var4 = 0; var4 < this.field944.length; var4++) {
                var3.method1925(this.field944[var4], this.field951[var4]);
            }
        }
        if (this.field952 != null) {
            for (int var5 = 0; var5 < this.field952.length; var5++) {
                var3.method1885(this.field952[var5], this.field953[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("am.j(I)Z")
    public boolean method767() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field956[var2] != -1 && !Statics.field945.method2727(this.field956[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("am.g(I)Lcl;")
    public class93 method777() {
        class93[] var1 = new class93[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field956[var3] != -1) {
                var1[var2++] = class93.method1922(Statics.field945, this.field956[var3], 0);
            }
        }
        class93 var4 = new class93(var1, var2);
        if (this.field944 != null) {
            for (int var5 = 0; var5 < this.field944.length; var5++) {
                var4.method1925(this.field944[var5], this.field951[var5]);
            }
        }
        if (this.field952 != null) {
            for (int var6 = 0; var6 < this.field952.length; var6++) {
                var4.method1885(this.field952[var6], this.field953[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ad.p(I)V")
    public static void method836() {
        field947.method3138();
    }
}
