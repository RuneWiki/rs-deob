package deob;

@ObfuscatedName("ac")
public class class36 extends class174 {

    @ObfuscatedName("ac.k")
    public static class170 field908 = new class170(64);

    @ObfuscatedName("ac.n")
    public int field909 = -1;

    @ObfuscatedName("ac.s")
    public int[] field910;

    @ObfuscatedName("ac.x")
    public short[] field911;

    @ObfuscatedName("ac.b")
    public short[] field912;

    @ObfuscatedName("ac.j")
    public short[] field916;

    @ObfuscatedName("ac.p")
    public short[] field914;

    @ObfuscatedName("ac.l")
    public int[] field915 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ac.i")
    public boolean field917 = false;

    @ObfuscatedName("bp.y(II)Lac;")
    public static class36 method1543(int arg0) {
        class36 var1 = (class36) field908.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field922.method2991(3, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method778(new class127(var2));
        }
        field908.method3291(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.m(Ldp;I)V")
    public void method778(class127 arg0) {
        while (true) {
            int var2 = arg0.method2534();
            if (var2 == 0) {
                return;
            }
            this.method762(arg0, var2);
        }
    }

    @ObfuscatedName("ac.d(Ldp;II)V")
    public void method762(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field909 = arg0.method2534();
        } else if (arg1 == 2) {
            int var3 = arg0.method2534();
            this.field910 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field910[var4] = arg0.method2460();
            }
        } else if (arg1 == 3) {
            this.field917 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2534();
            this.field911 = new short[var5];
            this.field912 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field911[var6] = (short) arg0.method2460();
                this.field912[var6] = (short) arg0.method2460();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2534();
            this.field916 = new short[var7];
            this.field914 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field916[var8] = (short) arg0.method2460();
                this.field914[var8] = (short) arg0.method2460();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field915[arg1 - 60] = arg0.method2460();
        }
    }

    @ObfuscatedName("ac.k(B)Z")
    public boolean method775() {
        if (this.field910 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field910.length; var2++) {
            if (!Statics.field919.method2993(this.field910[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ac.n(I)Lcq;")
    public class101 method764() {
        if (this.field910 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field910.length];
        for (int var2 = 0; var2 < this.field910.length; var2++) {
            var1[var2] = class101.method2060(Statics.field919, this.field910[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field911 != null) {
            for (int var4 = 0; var4 < this.field911.length; var4++) {
                var3.method2108(this.field911[var4], this.field912[var4]);
            }
        }
        if (this.field916 != null) {
            for (int var5 = 0; var5 < this.field916.length; var5++) {
                var3.method2073(this.field916[var5], this.field914[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ac.s(I)Z")
    public boolean method765() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field915[var2] != -1 && !Statics.field919.method2993(this.field915[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ac.x(B)Lcq;")
    public class101 method769() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field915[var3] != -1) {
                var1[var2++] = class101.method2060(Statics.field919, this.field915[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field911 != null) {
            for (int var5 = 0; var5 < this.field911.length; var5++) {
                var4.method2108(this.field911[var5], this.field912[var5]);
            }
        }
        if (this.field916 != null) {
            for (int var6 = 0; var6 < this.field916.length; var6++) {
                var4.method2073(this.field916[var6], this.field914[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ey.b(B)V")
    public static void method2952() {
        field908.method3297();
    }
}
