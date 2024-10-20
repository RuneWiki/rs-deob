package deob;

@ObfuscatedName("al")
public class class36 extends class174 {

    @ObfuscatedName("al.t")
    public static class170 field927 = new class170(64);

    @ObfuscatedName("al.f")
    public int field932 = -1;

    @ObfuscatedName("al.c")
    public int[] field918;

    @ObfuscatedName("al.p")
    public short[] field919;

    @ObfuscatedName("al.s")
    public short[] field920;

    @ObfuscatedName("al.k")
    public short[] field921;

    @ObfuscatedName("al.m")
    public short[] field913;

    @ObfuscatedName("al.y")
    public int[] field923 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("al.b")
    public boolean field929 = false;

    @ObfuscatedName("az.d(Lej;Lej;B)V")
    public static void method807(class152 arg0, class152 arg1) {
        Statics.field924 = arg0;
        Statics.field914 = arg1;
        Statics.field915 = Statics.field924.method2943(3);
    }

    @ObfuscatedName("e.g(II)Lal;")
    public static class36 method192(int arg0) {
        class36 var1 = (class36) field927.method3210((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field924.method2958(3, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method747(new class127(var2));
        }
        field927.method3221(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.a(Ldo;B)V")
    public void method747(class127 arg0) {
        while (true) {
            int var2 = arg0.method2509();
            if (var2 == 0) {
                return;
            }
            this.method732(arg0, var2);
        }
    }

    @ObfuscatedName("al.t(Ldo;II)V")
    public void method732(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field932 = arg0.method2509();
        } else if (arg1 == 2) {
            int var3 = arg0.method2509();
            this.field918 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field918[var4] = arg0.method2512();
            }
        } else if (arg1 == 3) {
            this.field929 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2509();
            this.field919 = new short[var5];
            this.field920 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field919[var6] = (short) arg0.method2512();
                this.field920[var6] = (short) arg0.method2512();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2509();
            this.field921 = new short[var7];
            this.field913 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field921[var8] = (short) arg0.method2512();
                this.field913[var8] = (short) arg0.method2512();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field923[arg1 - 60] = arg0.method2512();
        }
    }

    @ObfuscatedName("al.f(I)Z")
    public boolean method733() {
        if (this.field918 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field918.length; var2++) {
            if (!Statics.field914.method2999(this.field918[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("al.c(I)Lcr;")
    public class101 method746() {
        if (this.field918 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field918.length];
        for (int var2 = 0; var2 < this.field918.length; var2++) {
            var1[var2] = class101.method2016(Statics.field914, this.field918[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field919 != null) {
            for (int var4 = 0; var4 < this.field919.length; var4++) {
                var3.method2035(this.field919[var4], this.field920[var4]);
            }
        }
        if (this.field921 != null) {
            for (int var5 = 0; var5 < this.field921.length; var5++) {
                var3.method2017(this.field921[var5], this.field913[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("al.p(B)Z")
    public boolean method735() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field923[var2] != -1 && !Statics.field914.method2999(this.field923[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("al.s(I)Lcr;")
    public class101 method736() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field923[var3] != -1) {
                var1[var2++] = class101.method2016(Statics.field914, this.field923[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field919 != null) {
            for (int var5 = 0; var5 < this.field919.length; var5++) {
                var4.method2035(this.field919[var5], this.field920[var5]);
            }
        }
        if (this.field921 != null) {
            for (int var6 = 0; var6 < this.field921.length; var6++) {
                var4.method2017(this.field921[var6], this.field913[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("q.k(B)V")
    public static void method206() {
        field927.method3209();
    }
}
