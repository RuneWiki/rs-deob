package deob;

@ObfuscatedName("aj")
public class class40 extends class180 {

    @ObfuscatedName("aj.v")
    public static class170 field925 = new class170(64);

    @ObfuscatedName("aj.l")
    public int field926 = -1;

    @ObfuscatedName("aj.g")
    public int[] field928;

    @ObfuscatedName("aj.a")
    public short[] field933;

    @ObfuscatedName("aj.x")
    public short[] field929;

    @ObfuscatedName("aj.r")
    public short[] field937;

    @ObfuscatedName("aj.w")
    public short[] field931;

    @ObfuscatedName("aj.c")
    public int[] field932 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aj.f")
    public boolean field923 = false;

    @ObfuscatedName("br.y(II)Laj;")
    public static class40 method1590(int arg0) {
        class40 var1 = (class40) field925.method3145((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field934.method2704(3, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method754(new class107(var2));
        }
        field925.method3147(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.u(Ldo;B)V")
    public void method754(class107 arg0) {
        while (true) {
            int var2 = arg0.method2109();
            if (var2 == 0) {
                return;
            }
            this.method762(arg0, var2);
        }
    }

    @ObfuscatedName("aj.k(Ldo;II)V")
    public void method762(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field926 = arg0.method2109();
        } else if (arg1 == 2) {
            int var3 = arg0.method2109();
            this.field928 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field928[var4] = arg0.method2111();
            }
        } else if (arg1 == 3) {
            this.field923 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2109();
            this.field933 = new short[var5];
            this.field929 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field933[var6] = (short) arg0.method2111();
                this.field929[var6] = (short) arg0.method2111();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2109();
            this.field937 = new short[var7];
            this.field931 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field937[var8] = (short) arg0.method2111();
                this.field931[var8] = (short) arg0.method2111();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field932[arg1 - 60] = arg0.method2111();
        }
    }

    @ObfuscatedName("aj.v(I)Z")
    public boolean method756() {
        if (this.field928 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field928.length; var2++) {
            if (!Statics.field924.method2737(this.field928[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aj.l(B)Lca;")
    public class93 method757() {
        if (this.field928 == null) {
            return null;
        }
        class93[] var1 = new class93[this.field928.length];
        for (int var2 = 0; var2 < this.field928.length; var2++) {
            var1[var2] = class93.method1873(Statics.field924, this.field928[var2], 0);
        }
        class93 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class93(var1, var1.length);
        }
        if (this.field933 != null) {
            for (int var4 = 0; var4 < this.field933.length; var4++) {
                var3.method1886(this.field933[var4], this.field929[var4]);
            }
        }
        if (this.field937 != null) {
            for (int var5 = 0; var5 < this.field937.length; var5++) {
                var3.method1930(this.field937[var5], this.field931[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aj.g(I)Z")
    public boolean method755() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field932[var2] != -1 && !Statics.field924.method2737(this.field932[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aj.a(B)Lca;")
    public class93 method759() {
        class93[] var1 = new class93[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field932[var3] != -1) {
                var1[var2++] = class93.method1873(Statics.field924, this.field932[var3], 0);
            }
        }
        class93 var4 = new class93(var1, var2);
        if (this.field933 != null) {
            for (int var5 = 0; var5 < this.field933.length; var5++) {
                var4.method1886(this.field933[var5], this.field929[var5]);
            }
        }
        if (this.field937 != null) {
            for (int var6 = 0; var6 < this.field937.length; var6++) {
                var4.method1930(this.field937[var6], this.field931[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aj.x(I)V")
    public static void method778() {
        field925.method3141();
    }
}
