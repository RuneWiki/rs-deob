package deob;

@ObfuscatedName("as")
public class class41 extends class187 {

    @ObfuscatedName("as.c")
    public static class176 field925 = new class176(64);

    @ObfuscatedName("as.r")
    public int field934 = -1;

    @ObfuscatedName("as.f")
    public int[] field927;

    @ObfuscatedName("as.z")
    public short[] field928;

    @ObfuscatedName("as.o")
    public short[] field929;

    @ObfuscatedName("as.k")
    public short[] field937;

    @ObfuscatedName("as.s")
    public short[] field931;

    @ObfuscatedName("as.h")
    public int[] field926 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("as.m")
    public boolean field933 = false;

    @ObfuscatedName("cp.p(Len;Len;B)V")
    public static void method1895(class151 arg0, class151 arg1) {
        Statics.field521 = arg0;
        Statics.field923 = arg1;
        Statics.field924 = Statics.field521.method2757(3);
    }

    @ObfuscatedName("fd.y(II)Las;")
    public static class41 method3181(int arg0) {
        class41 var1 = (class41) field925.method3198((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field521.method2811(3, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method779(new class110(var2));
        }
        field925.method3193(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.d(Ldg;I)V")
    public void method779(class110 arg0) {
        while (true) {
            int var2 = arg0.method2309();
            if (var2 == 0) {
                return;
            }
            this.method780(arg0, var2);
        }
    }

    @ObfuscatedName("as.c(Ldg;II)V")
    public void method780(class110 arg0, int arg1) {
        if (arg1 == 1) {
            this.field934 = arg0.method2309();
        } else if (arg1 == 2) {
            int var3 = arg0.method2309();
            this.field927 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field927[var4] = arg0.method2243();
            }
        } else if (arg1 == 3) {
            this.field933 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2309();
            this.field928 = new short[var5];
            this.field929 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field928[var6] = (short) arg0.method2243();
                this.field929[var6] = (short) arg0.method2243();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2309();
            this.field937 = new short[var7];
            this.field931 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field937[var8] = (short) arg0.method2243();
                this.field931[var8] = (short) arg0.method2243();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field926[arg1 - 60] = arg0.method2243();
        }
    }

    @ObfuscatedName("as.r(I)Z")
    public boolean method781() {
        if (this.field927 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field927.length; var2++) {
            if (!Statics.field923.method2783(this.field927[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("as.f(I)Lch;")
    public class94 method796() {
        if (this.field927 == null) {
            return null;
        }
        class94[] var1 = new class94[this.field927.length];
        for (int var2 = 0; var2 < this.field927.length; var2++) {
            var1[var2] = class94.method1903(Statics.field923, this.field927[var2], 0);
        }
        class94 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class94(var1, var1.length);
        }
        if (this.field928 != null) {
            for (int var4 = 0; var4 < this.field928.length; var4++) {
                var3.method1922(this.field928[var4], this.field929[var4]);
            }
        }
        if (this.field937 != null) {
            for (int var5 = 0; var5 < this.field937.length; var5++) {
                var3.method1917(this.field937[var5], this.field931[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("as.z(B)Z")
    public boolean method798() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field926[var2] != -1 && !Statics.field923.method2783(this.field926[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("as.o(I)Lch;")
    public class94 method784() {
        class94[] var1 = new class94[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field926[var3] != -1) {
                var1[var2++] = class94.method1903(Statics.field923, this.field926[var3], 0);
            }
        }
        class94 var4 = new class94(var1, var2);
        if (this.field928 != null) {
            for (int var5 = 0; var5 < this.field928.length; var5++) {
                var4.method1922(this.field928[var5], this.field929[var5]);
            }
        }
        if (this.field937 != null) {
            for (int var6 = 0; var6 < this.field937.length; var6++) {
                var4.method1917(this.field937[var6], this.field931[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ev.k(I)V")
    public static void method2605() {
        field925.method3190();
    }
}
