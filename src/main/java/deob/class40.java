package deob;

@ObfuscatedName("an")
public class class40 extends class182 {

    @ObfuscatedName("an.p")
    public static class171 field934 = new class171(64);

    @ObfuscatedName("an.c")
    public int field945 = -1;

    @ObfuscatedName("an.y")
    public int[] field935;

    @ObfuscatedName("an.g")
    public short[] field936;

    @ObfuscatedName("an.l")
    public short[] field938;

    @ObfuscatedName("an.h")
    public short[] field931;

    @ObfuscatedName("an.n")
    public short[] field940;

    @ObfuscatedName("an.w")
    public int[] field941 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("an.m")
    public boolean field939 = false;

    @ObfuscatedName("an.o(Ldg;I)V")
    public void method760(class107 arg0) {
        while (true) {
            int var2 = arg0.method2118();
            if (var2 == 0) {
                return;
            }
            this.method782(arg0, var2);
        }
    }

    @ObfuscatedName("an.i(Ldg;II)V")
    public void method782(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field945 = arg0.method2118();
        } else if (arg1 == 2) {
            int var3 = arg0.method2118();
            this.field935 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field935[var4] = arg0.method2120();
            }
        } else if (arg1 == 3) {
            this.field939 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2118();
            this.field936 = new short[var5];
            this.field938 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field936[var6] = (short) arg0.method2120();
                this.field938[var6] = (short) arg0.method2120();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2118();
            this.field931 = new short[var7];
            this.field940 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field931[var8] = (short) arg0.method2120();
                this.field940[var8] = (short) arg0.method2120();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field941[arg1 - 60] = arg0.method2120();
        }
    }

    @ObfuscatedName("an.p(I)Z")
    public boolean method774() {
        if (this.field935 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field935.length; var2++) {
            if (!Statics.field932.method2670(this.field935[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("an.c(I)Lcd;")
    public class93 method763() {
        if (this.field935 == null) {
            return null;
        }
        class93[] var1 = new class93[this.field935.length];
        for (int var2 = 0; var2 < this.field935.length; var2++) {
            var1[var2] = class93.method1883(Statics.field932, this.field935[var2], 0);
        }
        class93 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class93(var1, var1.length);
        }
        if (this.field936 != null) {
            for (int var4 = 0; var4 < this.field936.length; var4++) {
                var3.method1924(this.field936[var4], this.field938[var4]);
            }
        }
        if (this.field931 != null) {
            for (int var5 = 0; var5 < this.field931.length; var5++) {
                var3.method1945(this.field931[var5], this.field940[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("an.y(I)Z")
    public boolean method759() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field941[var2] != -1 && !Statics.field932.method2670(this.field941[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("an.g(I)Lcd;")
    public class93 method762() {
        class93[] var1 = new class93[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field941[var3] != -1) {
                var1[var2++] = class93.method1883(Statics.field932, this.field941[var3], 0);
            }
        }
        class93 var4 = new class93(var1, var2);
        if (this.field936 != null) {
            for (int var5 = 0; var5 < this.field936.length; var5++) {
                var4.method1924(this.field936[var5], this.field938[var5]);
            }
        }
        if (this.field931 != null) {
            for (int var6 = 0; var6 < this.field931.length; var6++) {
                var4.method1945(this.field931[var6], this.field940[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("dv.l(B)V")
    public static void method2336() {
        field934.method3104();
    }
}
