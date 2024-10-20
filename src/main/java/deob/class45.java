package deob;

@ObfuscatedName("ab")
public class class45 extends class204 {

    @ObfuscatedName("ab.l")
    public static class193 field1036 = new class193(64);

    @ObfuscatedName("ab.y")
    public int field1037 = -1;

    @ObfuscatedName("ab.w")
    public int[] field1038;

    @ObfuscatedName("ab.u")
    public short[] field1039;

    @ObfuscatedName("ab.a")
    public short[] field1043;

    @ObfuscatedName("ab.e")
    public short[] field1041;

    @ObfuscatedName("ab.b")
    public short[] field1042;

    @ObfuscatedName("ab.o")
    public int[] field1040 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ab.m")
    public boolean field1044 = false;

    @ObfuscatedName("p.d(Lfn;Lfn;B)V")
    public static void method9(class167 arg0, class167 arg1) {
        Statics.field1046 = arg0;
        Statics.field3166 = arg1;
        Statics.field1034 = Statics.field1046.method3101(3);
    }

    @ObfuscatedName("bo.p(IB)Lab;")
    public static class45 method1540(int arg0) {
        class45 var1 = (class45) field1036.method3553((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1046.method3134(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method909(new class119(var2));
        }
        field1036.method3554(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.v(Ldf;I)V")
    public void method909(class119 arg0) {
        while (true) {
            int var2 = arg0.method2357();
            if (var2 == 0) {
                return;
            }
            this.method893(arg0, var2);
        }
    }

    @ObfuscatedName("ab.l(Ldf;IB)V")
    public void method893(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1037 = arg0.method2357();
        } else if (arg1 == 2) {
            int var3 = arg0.method2357();
            this.field1038 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1038[var4] = arg0.method2359();
            }
        } else if (arg1 == 3) {
            this.field1044 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2357();
            this.field1039 = new short[var5];
            this.field1043 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1039[var6] = (short) arg0.method2359();
                this.field1043[var6] = (short) arg0.method2359();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2357();
            this.field1041 = new short[var7];
            this.field1042 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1041[var8] = (short) arg0.method2359();
                this.field1042[var8] = (short) arg0.method2359();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1040[arg1 - 60] = arg0.method2359();
        }
    }

    @ObfuscatedName("ab.y(I)Z")
    public boolean method894() {
        if (this.field1038 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1038.length; var2++) {
            if (!Statics.field3166.method3113(this.field1038[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ab.w(B)Lca;")
    public class100 method892() {
        if (this.field1038 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field1038.length];
        for (int var2 = 0; var2 < this.field1038.length; var2++) {
            var1[var2] = class100.method2064(Statics.field3166, this.field1038[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field1039 != null) {
            for (int var4 = 0; var4 < this.field1039.length; var4++) {
                var3.method2075(this.field1039[var4], this.field1043[var4]);
            }
        }
        if (this.field1041 != null) {
            for (int var5 = 0; var5 < this.field1041.length; var5++) {
                var3.method2076(this.field1041[var5], this.field1042[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ab.u(I)Z")
    public boolean method921() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1040[var2] != -1 && !Statics.field3166.method3113(this.field1040[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ab.a(I)Lca;")
    public class100 method897() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1040[var3] != -1) {
                var1[var2++] = class100.method2064(Statics.field3166, this.field1040[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field1039 != null) {
            for (int var5 = 0; var5 < this.field1039.length; var5++) {
                var4.method2075(this.field1039[var5], this.field1043[var5]);
            }
        }
        if (this.field1041 != null) {
            for (int var6 = 0; var6 < this.field1041.length; var6++) {
                var4.method2076(this.field1041[var6], this.field1042[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("dq.e(I)V")
    public static void method2608() {
        field1036.method3556();
    }
}
