package deob;

@ObfuscatedName("aa")
public class class41 extends class185 {

    @ObfuscatedName("aa.b")
    public static class174 field966 = new class174(64);

    @ObfuscatedName("aa.k")
    public int field955 = -1;

    @ObfuscatedName("aa.c")
    public int[] field959;

    @ObfuscatedName("aa.w")
    public short[] field963;

    @ObfuscatedName("aa.l")
    public short[] field961;

    @ObfuscatedName("aa.n")
    public short[] field962;

    @ObfuscatedName("aa.d")
    public short[] field965;

    @ObfuscatedName("aa.h")
    public int[] field964 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aa.y")
    public boolean field958 = false;

    @ObfuscatedName("k.g(Lei;Lei;B)V")
    public static void method30(class149 arg0, class149 arg1) {
        Statics.field2932 = arg0;
        Statics.field960 = arg1;
        Statics.field956 = Statics.field2932.method2688(3);
    }

    @ObfuscatedName("ag.j(II)Laa;")
    public static class41 method667(int arg0) {
        class41 var1 = (class41) field966.method3097((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2932.method2660(3, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method727(new class108(var2));
        }
        field966.method3099(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.z(Ldf;B)V")
    public void method727(class108 arg0) {
        while (true) {
            int var2 = arg0.method2083();
            if (var2 == 0) {
                return;
            }
            this.method748(arg0, var2);
        }
    }

    @ObfuscatedName("aa.b(Ldf;II)V")
    public void method748(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field955 = arg0.method2083();
        } else if (arg1 == 2) {
            int var3 = arg0.method2083();
            this.field959 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field959[var4] = arg0.method2263();
            }
        } else if (arg1 == 3) {
            this.field958 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2083();
            this.field963 = new short[var5];
            this.field961 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field963[var6] = (short) arg0.method2263();
                this.field961[var6] = (short) arg0.method2263();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2083();
            this.field962 = new short[var7];
            this.field965 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field962[var8] = (short) arg0.method2263();
                this.field965[var8] = (short) arg0.method2263();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field964[arg1 - 60] = arg0.method2263();
        }
    }

    @ObfuscatedName("aa.k(I)Z")
    public boolean method729() {
        if (this.field959 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field959.length; var2++) {
            if (!Statics.field960.method2712(this.field959[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aa.c(B)Lci;")
    public class94 method730() {
        if (this.field959 == null) {
            return null;
        }
        class94[] var1 = new class94[this.field959.length];
        for (int var2 = 0; var2 < this.field959.length; var2++) {
            var1[var2] = class94.method1848(Statics.field960, this.field959[var2], 0);
        }
        class94 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class94(var1, var1.length);
        }
        if (this.field963 != null) {
            for (int var4 = 0; var4 < this.field963.length; var4++) {
                var3.method1847(this.field963[var4], this.field961[var4]);
            }
        }
        if (this.field962 != null) {
            for (int var5 = 0; var5 < this.field962.length; var5++) {
                var3.method1861(this.field962[var5], this.field965[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aa.w(I)Z")
    public boolean method731() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field964[var2] != -1 && !Statics.field960.method2712(this.field964[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aa.l(I)Lci;")
    public class94 method732() {
        class94[] var1 = new class94[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field964[var3] != -1) {
                var1[var2++] = class94.method1848(Statics.field960, this.field964[var3], 0);
            }
        }
        class94 var4 = new class94(var1, var2);
        if (this.field963 != null) {
            for (int var5 = 0; var5 < this.field963.length; var5++) {
                var4.method1847(this.field963[var5], this.field961[var5]);
            }
        }
        if (this.field962 != null) {
            for (int var6 = 0; var6 < this.field962.length; var6++) {
                var4.method1861(this.field962[var6], this.field965[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fq.n(I)V")
    public static void method3088() {
        field966.method3100();
    }
}
