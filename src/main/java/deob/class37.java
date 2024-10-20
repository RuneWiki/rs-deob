package deob;

@ObfuscatedName("am")
public class class37 extends class176 {

    @ObfuscatedName("am.l")
    public static class172 field932 = new class172(64);

    @ObfuscatedName("am.s")
    public int field933 = -1;

    @ObfuscatedName("am.d")
    public int[] field934;

    @ObfuscatedName("am.e")
    public short[] field935;

    @ObfuscatedName("am.u")
    public short[] field936;

    @ObfuscatedName("am.q")
    public short[] field941;

    @ObfuscatedName("am.o")
    public short[] field938;

    @ObfuscatedName("am.v")
    public int[] field940 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("am.m")
    public boolean field929 = false;

    @ObfuscatedName("i.i(Leg;Leg;I)V")
    public static void method3(class155 arg0, class155 arg1) {
        Statics.field937 = arg0;
        Statics.field930 = arg1;
        Statics.field931 = Statics.field937.method3084(3);
    }

    @ObfuscatedName("ep.b(IB)Lam;")
    public static class37 method2737(int arg0) {
        class37 var1 = (class37) field932.method3277((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field937.method3043(3, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method771(new class128(var2));
        }
        field932.method3281(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.r(Lds;I)V")
    public void method771(class128 arg0) {
        while (true) {
            int var2 = arg0.method2531();
            if (var2 == 0) {
                return;
            }
            this.method772(arg0, var2);
        }
    }

    @ObfuscatedName("am.l(Lds;II)V")
    public void method772(class128 arg0, int arg1) {
        if (arg1 == 1) {
            this.field933 = arg0.method2531();
        } else if (arg1 == 2) {
            int var3 = arg0.method2531();
            this.field934 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field934[var4] = arg0.method2473();
            }
        } else if (arg1 == 3) {
            this.field929 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2531();
            this.field935 = new short[var5];
            this.field936 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field935[var6] = (short) arg0.method2473();
                this.field936[var6] = (short) arg0.method2473();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2531();
            this.field941 = new short[var7];
            this.field938 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field941[var8] = (short) arg0.method2473();
                this.field938[var8] = (short) arg0.method2473();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field940[arg1 - 60] = arg0.method2473();
        }
    }

    @ObfuscatedName("am.s(B)Z")
    public boolean method773() {
        if (this.field934 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field934.length; var2++) {
            if (!Statics.field930.method3045(this.field934[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("am.d(B)Lco;")
    public class102 method777() {
        if (this.field934 == null) {
            return null;
        }
        class102[] var1 = new class102[this.field934.length];
        for (int var2 = 0; var2 < this.field934.length; var2++) {
            var1[var2] = class102.method2056(Statics.field930, this.field934[var2], 0);
        }
        class102 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class102(var1, var1.length);
        }
        if (this.field935 != null) {
            for (int var4 = 0; var4 < this.field935.length; var4++) {
                var3.method2099(this.field935[var4], this.field936[var4]);
            }
        }
        if (this.field941 != null) {
            for (int var5 = 0; var5 < this.field941.length; var5++) {
                var3.method2075(this.field941[var5], this.field938[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("am.e(I)Z")
    public boolean method775() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field940[var2] != -1 && !Statics.field930.method3045(this.field940[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("am.u(B)Lco;")
    public class102 method776() {
        class102[] var1 = new class102[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field940[var3] != -1) {
                var1[var2++] = class102.method2056(Statics.field930, this.field940[var3], 0);
            }
        }
        class102 var4 = new class102(var1, var2);
        if (this.field935 != null) {
            for (int var5 = 0; var5 < this.field935.length; var5++) {
                var4.method2099(this.field935[var5], this.field936[var5]);
            }
        }
        if (this.field941 != null) {
            for (int var6 = 0; var6 < this.field941.length; var6++) {
                var4.method2075(this.field941[var6], this.field938[var6]);
            }
        }
        return var4;
    }
}
