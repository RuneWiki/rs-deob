package deob;

@ObfuscatedName("az")
public class class40 extends class183 {

    @ObfuscatedName("az.e")
    public static class172 field956 = new class172(64);

    @ObfuscatedName("az.w")
    public int field949 = -1;

    @ObfuscatedName("az.m")
    public int[] field950;

    @ObfuscatedName("az.u")
    public short[] field947;

    @ObfuscatedName("az.j")
    public short[] field952;

    @ObfuscatedName("az.o")
    public short[] field953;

    @ObfuscatedName("az.h")
    public short[] field954;

    @ObfuscatedName("az.b")
    public int[] field959 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("az.r")
    public boolean field948 = false;

    @ObfuscatedName("fp.g(IB)Laz;")
    public static class40 method2909(int arg0) {
        class40 var1 = (class40) field956.method3135((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field951.method2734(3, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method749(new class107(var2));
        }
        field956.method3140(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.i(Ldk;B)V")
    public void method749(class107 arg0) {
        while (true) {
            int var2 = arg0.method2092();
            if (var2 == 0) {
                return;
            }
            this.method729(arg0, var2);
        }
    }

    @ObfuscatedName("az.k(Ldk;IB)V")
    public void method729(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field949 = arg0.method2092();
        } else if (arg1 == 2) {
            int var3 = arg0.method2092();
            this.field950 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field950[var4] = arg0.method2094();
            }
        } else if (arg1 == 3) {
            this.field948 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2092();
            this.field947 = new short[var5];
            this.field952 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field947[var6] = (short) arg0.method2094();
                this.field952[var6] = (short) arg0.method2094();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2092();
            this.field953 = new short[var7];
            this.field954 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field953[var8] = (short) arg0.method2094();
                this.field954[var8] = (short) arg0.method2094();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field959[arg1 - 60] = arg0.method2094();
        }
    }

    @ObfuscatedName("az.e(I)Z")
    public boolean method739() {
        if (this.field950 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field950.length; var2++) {
            if (!Statics.field1898.method2724(this.field950[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("az.w(I)Lcr;")
    public class93 method731() {
        if (this.field950 == null) {
            return null;
        }
        class93[] var1 = new class93[this.field950.length];
        for (int var2 = 0; var2 < this.field950.length; var2++) {
            var1[var2] = class93.method1903(Statics.field1898, this.field950[var2], 0);
        }
        class93 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class93(var1, var1.length);
        }
        if (this.field947 != null) {
            for (int var4 = 0; var4 < this.field947.length; var4++) {
                var3.method1873(this.field947[var4], this.field952[var4]);
            }
        }
        if (this.field953 != null) {
            for (int var5 = 0; var5 < this.field953.length; var5++) {
                var3.method1874(this.field953[var5], this.field954[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("az.m(B)Z")
    public boolean method732() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field959[var2] != -1 && !Statics.field1898.method2724(this.field959[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("az.u(B)Lcr;")
    public class93 method734() {
        class93[] var1 = new class93[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field959[var3] != -1) {
                var1[var2++] = class93.method1903(Statics.field1898, this.field959[var3], 0);
            }
        }
        class93 var4 = new class93(var1, var2);
        if (this.field947 != null) {
            for (int var5 = 0; var5 < this.field947.length; var5++) {
                var4.method1873(this.field947[var5], this.field952[var5]);
            }
        }
        if (this.field953 != null) {
            for (int var6 = 0; var6 < this.field953.length; var6++) {
                var4.method1874(this.field953[var6], this.field954[var6]);
            }
        }
        return var4;
    }
}
