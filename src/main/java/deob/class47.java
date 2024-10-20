package deob;

@ObfuscatedName("af")
public class class47 extends class208 {

    @ObfuscatedName("af.t")
    public static class197 field1031 = new class197(64);

    @ObfuscatedName("af.v")
    public int field1034 = -1;

    @ObfuscatedName("af.b")
    public int[] field1041;

    @ObfuscatedName("af.m")
    public short[] field1036;

    @ObfuscatedName("af.k")
    public short[] field1037;

    @ObfuscatedName("af.c")
    public short[] field1038;

    @ObfuscatedName("af.w")
    public short[] field1039;

    @ObfuscatedName("af.l")
    public int[] field1040 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("af.h")
    public boolean field1032 = false;

    @ObfuscatedName("bv.f(II)Laf;")
    public static class47 method1102(int arg0) {
        class47 var1 = (class47) field1031.method3569((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1042.method3107(3, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method916(new class123(var2));
        }
        field1031.method3571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.e(Ldx;B)V")
    public void method916(class123 arg0) {
        while (true) {
            int var2 = arg0.method2522();
            if (var2 == 0) {
                return;
            }
            this.method915(arg0, var2);
        }
    }

    @ObfuscatedName("af.n(Ldx;II)V")
    public void method915(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1034 = arg0.method2522();
        } else if (arg1 == 2) {
            int var3 = arg0.method2522();
            this.field1041 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1041[var4] = arg0.method2401();
            }
        } else if (arg1 == 3) {
            this.field1032 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2522();
            this.field1036 = new short[var5];
            this.field1037 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1036[var6] = (short) arg0.method2401();
                this.field1037[var6] = (short) arg0.method2401();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2522();
            this.field1038 = new short[var7];
            this.field1039 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1038[var8] = (short) arg0.method2401();
                this.field1039[var8] = (short) arg0.method2401();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1040[arg1 - 60] = arg0.method2401();
        }
    }

    @ObfuscatedName("af.t(I)Z")
    public boolean method922() {
        if (this.field1041 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1041.length; var2++) {
            if (!Statics.field2948.method3156(this.field1041[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("af.v(I)Lca;")
    public class104 method931() {
        if (this.field1041 == null) {
            return null;
        }
        class104[] var1 = new class104[this.field1041.length];
        for (int var2 = 0; var2 < this.field1041.length; var2++) {
            var1[var2] = class104.method2114(Statics.field2948, this.field1041[var2], 0);
        }
        class104 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class104(var1, var1.length);
        }
        if (this.field1036 != null) {
            for (int var4 = 0; var4 < this.field1036.length; var4++) {
                var3.method2126(this.field1036[var4], this.field1037[var4]);
            }
        }
        if (this.field1038 != null) {
            for (int var5 = 0; var5 < this.field1038.length; var5++) {
                var3.method2127(this.field1038[var5], this.field1039[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("af.b(B)Z")
    public boolean method920() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1040[var2] != -1 && !Statics.field2948.method3156(this.field1040[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("af.m(B)Lca;")
    public class104 method929() {
        class104[] var1 = new class104[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1040[var3] != -1) {
                var1[var2++] = class104.method2114(Statics.field2948, this.field1040[var3], 0);
            }
        }
        class104 var4 = new class104(var1, var2);
        if (this.field1036 != null) {
            for (int var5 = 0; var5 < this.field1036.length; var5++) {
                var4.method2126(this.field1036[var5], this.field1037[var5]);
            }
        }
        if (this.field1038 != null) {
            for (int var6 = 0; var6 < this.field1038.length; var6++) {
                var4.method2127(this.field1038[var6], this.field1039[var6]);
            }
        }
        return var4;
    }
}
