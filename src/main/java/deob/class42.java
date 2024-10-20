package deob;

@ObfuscatedName("ad")
public class class42 extends class195 {

    @ObfuscatedName("ad.f")
    public static class184 field987 = new class184(64);

    @ObfuscatedName("ad.w")
    public int field990 = -1;

    @ObfuscatedName("ad.t")
    public int[] field989;

    @ObfuscatedName("ad.s")
    public short[] field995;

    @ObfuscatedName("ad.c")
    public short[] field991;

    @ObfuscatedName("ad.d")
    public short[] field994;

    @ObfuscatedName("ad.v")
    public short[] field988;

    @ObfuscatedName("ad.m")
    public int[] field984 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ad.h")
    public boolean field992 = false;

    @ObfuscatedName("fb.p(Lff;Lff;I)V")
    public static void method3094(class158 arg0, class158 arg1) {
        Statics.field993 = arg0;
        Statics.field985 = arg1;
        Statics.field986 = Statics.field993.method2904(3);
    }

    @ObfuscatedName("d.k(II)Lad;")
    public static class42 method93(int arg0) {
        class42 var1 = (class42) field987.method3371((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field993.method2896(3, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method796(new class111(var2));
        }
        field987.method3370(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.e(Lde;B)V")
    public void method796(class111 arg0) {
        while (true) {
            int var2 = arg0.method2314();
            if (var2 == 0) {
                return;
            }
            this.method797(arg0, var2);
        }
    }

    @ObfuscatedName("ad.f(Lde;IB)V")
    public void method797(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field990 = arg0.method2314();
        } else if (arg1 == 2) {
            int var3 = arg0.method2314();
            this.field989 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field989[var4] = arg0.method2177();
            }
        } else if (arg1 == 3) {
            this.field992 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2314();
            this.field995 = new short[var5];
            this.field991 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field995[var6] = (short) arg0.method2177();
                this.field991[var6] = (short) arg0.method2177();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2314();
            this.field994 = new short[var7];
            this.field988 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field994[var8] = (short) arg0.method2177();
                this.field988[var8] = (short) arg0.method2177();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field984[arg1 - 60] = arg0.method2177();
        }
    }

    @ObfuscatedName("ad.w(I)Z")
    public boolean method798() {
        if (this.field989 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field989.length; var2++) {
            if (!Statics.field985.method2898(this.field989[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ad.t(I)Lcv;")
    public class95 method799() {
        if (this.field989 == null) {
            return null;
        }
        class95[] var1 = new class95[this.field989.length];
        for (int var2 = 0; var2 < this.field989.length; var2++) {
            var1[var2] = class95.method1916(Statics.field985, this.field989[var2], 0);
        }
        class95 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class95(var1, var1.length);
        }
        if (this.field995 != null) {
            for (int var4 = 0; var4 < this.field995.length; var4++) {
                var3.method1929(this.field995[var4], this.field991[var4]);
            }
        }
        if (this.field994 != null) {
            for (int var5 = 0; var5 < this.field994.length; var5++) {
                var3.method1930(this.field994[var5], this.field988[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ad.s(I)Z")
    public boolean method800() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field984[var2] != -1 && !Statics.field985.method2898(this.field984[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ad.c(I)Lcv;")
    public class95 method795() {
        class95[] var1 = new class95[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field984[var3] != -1) {
                var1[var2++] = class95.method1916(Statics.field985, this.field984[var3], 0);
            }
        }
        class95 var4 = new class95(var1, var2);
        if (this.field995 != null) {
            for (int var5 = 0; var5 < this.field995.length; var5++) {
                var4.method1929(this.field995[var5], this.field991[var5]);
            }
        }
        if (this.field994 != null) {
            for (int var6 = 0; var6 < this.field994.length; var6++) {
                var4.method1930(this.field994[var6], this.field988[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ai.d(B)V")
    public static void method722() {
        field987.method3374();
    }
}
