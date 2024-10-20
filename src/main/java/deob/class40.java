package deob;

@ObfuscatedName("ah")
public class class40 extends class180 {

    @ObfuscatedName("ah.g")
    public static class170 field936 = new class170(64);

    @ObfuscatedName("ah.u")
    public int field943 = -1;

    @ObfuscatedName("ah.k")
    public int[] field937;

    @ObfuscatedName("ah.m")
    public short[] field939;

    @ObfuscatedName("ah.t")
    public short[] field940;

    @ObfuscatedName("ah.l")
    public short[] field941;

    @ObfuscatedName("ah.f")
    public short[] field942;

    @ObfuscatedName("ah.c")
    public int[] field933 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ah.i")
    public boolean field944 = false;

    @ObfuscatedName("ab.e(Lec;Lec;B)V")
    public static void method574(class145 arg0, class145 arg1) {
        Statics.field938 = arg0;
        Statics.field934 = arg1;
        Statics.field935 = Statics.field938.method2726(3);
    }

    @ObfuscatedName("ae.p(II)Lah;")
    public static class40 method777(int arg0) {
        class40 var1 = (class40) field936.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field938.method2717(3, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method781(new class107(var2));
        }
        field936.method3161(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.a(Ldp;I)V")
    public void method781(class107 arg0) {
        while (true) {
            int var2 = arg0.method2125();
            if (var2 == 0) {
                return;
            }
            this.method782(arg0, var2);
        }
    }

    @ObfuscatedName("ah.g(Ldp;II)V")
    public void method782(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field943 = arg0.method2125();
        } else if (arg1 == 2) {
            int var3 = arg0.method2125();
            this.field937 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field937[var4] = arg0.method2182();
            }
        } else if (arg1 == 3) {
            this.field944 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2125();
            this.field939 = new short[var5];
            this.field940 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field939[var6] = (short) arg0.method2182();
                this.field940[var6] = (short) arg0.method2182();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2125();
            this.field941 = new short[var7];
            this.field942 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field941[var8] = (short) arg0.method2182();
                this.field942[var8] = (short) arg0.method2182();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field933[arg1 - 60] = arg0.method2182();
        }
    }

    @ObfuscatedName("ah.u(I)Z")
    public boolean method783() {
        if (this.field937 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field937.length; var2++) {
            if (!Statics.field934.method2719(this.field937[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ah.k(I)Lcw;")
    public class93 method784() {
        if (this.field937 == null) {
            return null;
        }
        class93[] var1 = new class93[this.field937.length];
        for (int var2 = 0; var2 < this.field937.length; var2++) {
            var1[var2] = class93.method1960(Statics.field934, this.field937[var2], 0);
        }
        class93 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class93(var1, var1.length);
        }
        if (this.field939 != null) {
            for (int var4 = 0; var4 < this.field939.length; var4++) {
                var3.method1892(this.field939[var4], this.field940[var4]);
            }
        }
        if (this.field941 != null) {
            for (int var5 = 0; var5 < this.field941.length; var5++) {
                var3.method1904(this.field941[var5], this.field942[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ah.m(B)Z")
    public boolean method796() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field933[var2] != -1 && !Statics.field934.method2719(this.field933[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ah.t(B)Lcw;")
    public class93 method809() {
        class93[] var1 = new class93[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field933[var3] != -1) {
                var1[var2++] = class93.method1960(Statics.field934, this.field933[var3], 0);
            }
        }
        class93 var4 = new class93(var1, var2);
        if (this.field939 != null) {
            for (int var5 = 0; var5 < this.field939.length; var5++) {
                var4.method1892(this.field939[var5], this.field940[var5]);
            }
        }
        if (this.field941 != null) {
            for (int var6 = 0; var6 < this.field941.length; var6++) {
                var4.method1904(this.field941[var6], this.field942[var6]);
            }
        }
        return var4;
    }
}
