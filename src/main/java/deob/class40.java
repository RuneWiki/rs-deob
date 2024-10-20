package deob;

@ObfuscatedName("at")
public class class40 extends class182 {

    @ObfuscatedName("at.e")
    public static class171 field931 = new class171(64);

    @ObfuscatedName("at.d")
    public int field932 = -1;

    @ObfuscatedName("at.n")
    public int[] field929;

    @ObfuscatedName("at.v")
    public short[] field940;

    @ObfuscatedName("at.z")
    public short[] field935;

    @ObfuscatedName("at.j")
    public short[] field938;

    @ObfuscatedName("at.u")
    public short[] field933;

    @ObfuscatedName("at.g")
    public int[] field936 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("at.a")
    public boolean field939 = false;

    @ObfuscatedName("g.t(Leg;Leg;I)V")
    public static void method126(class146 arg0, class146 arg1) {
        Statics.field934 = arg0;
        Statics.field665 = arg1;
        Statics.field930 = Statics.field934.method2719(3);
    }

    @ObfuscatedName("ag.s(IB)Lat;")
    public static class40 method810(int arg0) {
        class40 var1 = (class40) field931.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field934.method2709(3, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method769(new class107(var2));
        }
        field931.method3168(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.f(Ldb;I)V")
    public void method769(class107 arg0) {
        while (true) {
            int var2 = arg0.method2101();
            if (var2 == 0) {
                return;
            }
            this.method744(arg0, var2);
        }
    }

    @ObfuscatedName("at.e(Ldb;II)V")
    public void method744(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field932 = arg0.method2101();
        } else if (arg1 == 2) {
            int var3 = arg0.method2101();
            this.field929 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field929[var4] = arg0.method2103();
            }
        } else if (arg1 == 3) {
            this.field939 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2101();
            this.field940 = new short[var5];
            this.field935 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field940[var6] = (short) arg0.method2103();
                this.field935[var6] = (short) arg0.method2103();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2101();
            this.field938 = new short[var7];
            this.field933 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field938[var8] = (short) arg0.method2103();
                this.field933[var8] = (short) arg0.method2103();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field936[arg1 - 60] = arg0.method2103();
        }
    }

    @ObfuscatedName("at.d(I)Z")
    public boolean method764() {
        if (this.field929 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field929.length; var2++) {
            if (!Statics.field665.method2740(this.field929[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("at.n(B)Lca;")
    public class93 method766() {
        if (this.field929 == null) {
            return null;
        }
        class93[] var1 = new class93[this.field929.length];
        for (int var2 = 0; var2 < this.field929.length; var2++) {
            var1[var2] = class93.method1872(Statics.field665, this.field929[var2], 0);
        }
        class93 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class93(var1, var1.length);
        }
        if (this.field940 != null) {
            for (int var4 = 0; var4 < this.field940.length; var4++) {
                var3.method1864(this.field940[var4], this.field935[var4]);
            }
        }
        if (this.field938 != null) {
            for (int var5 = 0; var5 < this.field938.length; var5++) {
                var3.method1865(this.field938[var5], this.field933[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("at.v(I)Z")
    public boolean method747() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field936[var2] != -1 && !Statics.field665.method2740(this.field936[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("at.z(B)Lca;")
    public class93 method748() {
        class93[] var1 = new class93[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field936[var3] != -1) {
                var1[var2++] = class93.method1872(Statics.field665, this.field936[var3], 0);
            }
        }
        class93 var4 = new class93(var1, var2);
        if (this.field940 != null) {
            for (int var5 = 0; var5 < this.field940.length; var5++) {
                var4.method1864(this.field940[var5], this.field935[var5]);
            }
        }
        if (this.field938 != null) {
            for (int var6 = 0; var6 < this.field938.length; var6++) {
                var4.method1865(this.field938[var6], this.field933[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("s.j(I)V")
    public static void method11() {
        field931.method3171();
    }
}
