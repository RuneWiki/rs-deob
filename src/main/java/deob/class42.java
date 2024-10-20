package deob;

@ObfuscatedName("ab")
public class class42 extends class195 {

    @ObfuscatedName("ab.e")
    public static class184 field978 = new class184(64);

    @ObfuscatedName("ab.h")
    public int field973 = -1;

    @ObfuscatedName("ab.q")
    public int[] field981;

    @ObfuscatedName("ab.l")
    public short[] field975;

    @ObfuscatedName("ab.c")
    public short[] field976;

    @ObfuscatedName("ab.f")
    public short[] field977;

    @ObfuscatedName("ab.s")
    public short[] field974;

    @ObfuscatedName("ab.m")
    public int[] field979 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ab.y")
    public boolean field980 = false;

    @ObfuscatedName("ca.n(Lfd;Lfd;B)V")
    public static void method2076(class158 arg0, class158 arg1) {
        Statics.field2812 = arg0;
        Statics.field987 = arg1;
        Statics.field971 = Statics.field2812.method2898(3);
    }

    @ObfuscatedName("aw.w(II)Lab;")
    public static class42 method639(int arg0) {
        class42 var1 = (class42) field978.method3315((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2812.method2859(3, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method799(new class111(var2));
        }
        field978.method3317(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.i(Ldo;I)V")
    public void method799(class111 arg0) {
        while (true) {
            int var2 = arg0.method2155();
            if (var2 == 0) {
                return;
            }
            this.method798(arg0, var2);
        }
    }

    @ObfuscatedName("ab.e(Ldo;II)V")
    public void method798(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field973 = arg0.method2155();
        } else if (arg1 == 2) {
            int var3 = arg0.method2155();
            this.field981 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field981[var4] = arg0.method2157();
            }
        } else if (arg1 == 3) {
            this.field980 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2155();
            this.field975 = new short[var5];
            this.field976 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field975[var6] = (short) arg0.method2157();
                this.field976[var6] = (short) arg0.method2157();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2155();
            this.field977 = new short[var7];
            this.field974 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field977[var8] = (short) arg0.method2157();
                this.field974[var8] = (short) arg0.method2157();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field979[arg1 - 60] = arg0.method2157();
        }
    }

    @ObfuscatedName("ab.h(I)Z")
    public boolean method796() {
        if (this.field981 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field981.length; var2++) {
            if (!Statics.field987.method2861(this.field981[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ab.q(I)Lce;")
    public class95 method800() {
        if (this.field981 == null) {
            return null;
        }
        class95[] var1 = new class95[this.field981.length];
        for (int var2 = 0; var2 < this.field981.length; var2++) {
            var1[var2] = class95.method1905(Statics.field987, this.field981[var2], 0);
        }
        class95 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class95(var1, var1.length);
        }
        if (this.field975 != null) {
            for (int var4 = 0; var4 < this.field975.length; var4++) {
                var3.method1919(this.field975[var4], this.field976[var4]);
            }
        }
        if (this.field977 != null) {
            for (int var5 = 0; var5 < this.field977.length; var5++) {
                var3.method1920(this.field977[var5], this.field974[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ab.l(B)Z")
    public boolean method810() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field979[var2] != -1 && !Statics.field987.method2861(this.field979[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ab.c(B)Lce;")
    public class95 method802() {
        class95[] var1 = new class95[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field979[var3] != -1) {
                var1[var2++] = class95.method1905(Statics.field987, this.field979[var3], 0);
            }
        }
        class95 var4 = new class95(var1, var2);
        if (this.field975 != null) {
            for (int var5 = 0; var5 < this.field975.length; var5++) {
                var4.method1919(this.field975[var5], this.field976[var5]);
            }
        }
        if (this.field977 != null) {
            for (int var6 = 0; var6 < this.field977.length; var6++) {
                var4.method1920(this.field977[var6], this.field974[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("as.f(B)V")
    public static void method599() {
        field978.method3319();
    }
}
