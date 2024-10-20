package deob;

@ObfuscatedName("at")
public class class36 extends class174 {

    @ObfuscatedName("at.e")
    public static class170 field919 = new class170(64);

    @ObfuscatedName("at.l")
    public int field920 = -1;

    @ObfuscatedName("at.d")
    public int[] field921;

    @ObfuscatedName("at.r")
    public short[] field927;

    @ObfuscatedName("at.k")
    public short[] field918;

    @ObfuscatedName("at.u")
    public short[] field916;

    @ObfuscatedName("at.o")
    public short[] field925;

    @ObfuscatedName("at.g")
    public int[] field923 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("at.s")
    public boolean field926 = false;

    @ObfuscatedName("q.f(Leo;Leo;I)V")
    public static void method161(class153 arg0, class153 arg1) {
        Statics.field922 = arg0;
        Statics.field917 = arg1;
        Statics.field924 = Statics.field922.method3056(3);
    }

    @ObfuscatedName("e.t(IB)Lat;")
    public static class36 method28(int arg0) {
        class36 var1 = (class36) field919.method3276((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field922.method3035(3, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method753(new class127(var2));
        }
        field919.method3275(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.n(Ldq;I)V")
    public void method753(class127 arg0) {
        while (true) {
            int var2 = arg0.method2458();
            if (var2 == 0) {
                return;
            }
            this.method754(arg0, var2);
        }
    }

    @ObfuscatedName("at.e(Ldq;II)V")
    public void method754(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field920 = arg0.method2458();
        } else if (arg1 == 2) {
            int var3 = arg0.method2458();
            this.field921 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field921[var4] = arg0.method2460();
            }
        } else if (arg1 == 3) {
            this.field926 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2458();
            this.field927 = new short[var5];
            this.field918 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field927[var6] = (short) arg0.method2460();
                this.field918[var6] = (short) arg0.method2460();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2458();
            this.field916 = new short[var7];
            this.field925 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field916[var8] = (short) arg0.method2460();
                this.field925[var8] = (short) arg0.method2460();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field923[arg1 - 60] = arg0.method2460();
        }
    }

    @ObfuscatedName("at.l(B)Z")
    public boolean method765() {
        if (this.field921 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field921.length; var2++) {
            if (!Statics.field917.method3103(this.field921[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("at.d(I)Lcz;")
    public class101 method756() {
        if (this.field921 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field921.length];
        for (int var2 = 0; var2 < this.field921.length; var2++) {
            var1[var2] = class101.method2067(Statics.field917, this.field921[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field927 != null) {
            for (int var4 = 0; var4 < this.field927.length; var4++) {
                var3.method2071(this.field927[var4], this.field918[var4]);
            }
        }
        if (this.field916 != null) {
            for (int var5 = 0; var5 < this.field916.length; var5++) {
                var3.method2079(this.field916[var5], this.field925[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("at.r(B)Z")
    public boolean method757() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field923[var2] != -1 && !Statics.field917.method3103(this.field923[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("at.k(S)Lcz;")
    public class101 method758() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field923[var3] != -1) {
                var1[var2++] = class101.method2067(Statics.field917, this.field923[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field927 != null) {
            for (int var5 = 0; var5 < this.field927.length; var5++) {
                var4.method2071(this.field927[var5], this.field918[var5]);
            }
        }
        if (this.field916 != null) {
            for (int var6 = 0; var6 < this.field916.length; var6++) {
                var4.method2079(this.field916[var6], this.field925[var6]);
            }
        }
        return var4;
    }
}
