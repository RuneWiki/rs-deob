package deob;

@ObfuscatedName("ax")
public class class36 extends class174 {

    @ObfuscatedName("ax.h")
    public static class170 field922 = new class170(64);

    @ObfuscatedName("ax.u")
    public int field923 = -1;

    @ObfuscatedName("ax.a")
    public int[] field924;

    @ObfuscatedName("ax.q")
    public short[] field930;

    @ObfuscatedName("ax.t")
    public short[] field929;

    @ObfuscatedName("ax.n")
    public short[] field927;

    @ObfuscatedName("ax.i")
    public short[] field926;

    @ObfuscatedName("ax.c")
    public int[] field920 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ax.b")
    public boolean field925 = false;

    @ObfuscatedName("ab.j(Lew;Lew;S)V")
    public static void method767(class153 arg0, class153 arg1) {
        Statics.field928 = arg0;
        Statics.field921 = arg1;
        Statics.field2012 = Statics.field928.method3037(3);
    }

    @ObfuscatedName("ax.o(Ldq;B)V")
    public void method772(class127 arg0) {
        while (true) {
            int var2 = arg0.method2464();
            if (var2 == 0) {
                return;
            }
            this.method773(arg0, var2);
        }
    }

    @ObfuscatedName("ax.h(Ldq;II)V")
    public void method773(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field923 = arg0.method2464();
        } else if (arg1 == 2) {
            int var3 = arg0.method2464();
            this.field924 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field924[var4] = arg0.method2582();
            }
        } else if (arg1 == 3) {
            this.field925 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2464();
            this.field930 = new short[var5];
            this.field929 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field930[var6] = (short) arg0.method2582();
                this.field929[var6] = (short) arg0.method2582();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2464();
            this.field927 = new short[var7];
            this.field926 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field927[var8] = (short) arg0.method2582();
                this.field926[var8] = (short) arg0.method2582();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field920[arg1 - 60] = arg0.method2582();
        }
    }

    @ObfuscatedName("ax.u(I)Z")
    public boolean method774() {
        if (this.field924 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field924.length; var2++) {
            if (!Statics.field921.method3083(this.field924[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ax.a(I)Lch;")
    public class101 method775() {
        if (this.field924 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field924.length];
        for (int var2 = 0; var2 < this.field924.length; var2++) {
            var1[var2] = class101.method2064(Statics.field921, this.field924[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field930 != null) {
            for (int var4 = 0; var4 < this.field930.length; var4++) {
                var3.method2112(this.field930[var4], this.field929[var4]);
            }
        }
        if (this.field927 != null) {
            for (int var5 = 0; var5 < this.field927.length; var5++) {
                var3.method2082(this.field927[var5], this.field926[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ax.q(I)Z")
    public boolean method776() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field920[var2] != -1 && !Statics.field921.method3083(this.field920[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ax.t(I)Lch;")
    public class101 method777() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field920[var3] != -1) {
                var1[var2++] = class101.method2064(Statics.field921, this.field920[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field930 != null) {
            for (int var5 = 0; var5 < this.field930.length; var5++) {
                var4.method2112(this.field930[var5], this.field929[var5]);
            }
        }
        if (this.field927 != null) {
            for (int var6 = 0; var6 < this.field927.length; var6++) {
                var4.method2082(this.field927[var6], this.field926[var6]);
            }
        }
        return var4;
    }
}
