package deob;

@ObfuscatedName("ah")
public class class36 extends class175 {

    @ObfuscatedName("ah.w")
    public static class171 field913 = new class171(64);

    @ObfuscatedName("ah.r")
    public int field915 = -1;

    @ObfuscatedName("ah.k")
    public int[] field912;

    @ObfuscatedName("ah.z")
    public short[] field922;

    @ObfuscatedName("ah.g")
    public short[] field917;

    @ObfuscatedName("ah.n")
    public short[] field923;

    @ObfuscatedName("ah.j")
    public short[] field919;

    @ObfuscatedName("ah.c")
    public int[] field920 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ah.m")
    public boolean field921 = false;

    @ObfuscatedName("ax.l(Lem;Lem;I)V")
    public static void method808(class154 arg0, class154 arg1) {
        Statics.field918 = arg0;
        Statics.field911 = arg1;
        Statics.field1369 = Statics.field918.method3074(3);
    }

    @ObfuscatedName("en.b(II)Lah;")
    public static class36 method2715(int arg0) {
        class36 var1 = (class36) field913.method3255((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field918.method3029(3, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method755(new class127(var2));
        }
        field913.method3253(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.o(Ldm;I)V")
    public void method755(class127 arg0) {
        while (true) {
            int var2 = arg0.method2440();
            if (var2 == 0) {
                return;
            }
            this.method756(arg0, var2);
        }
    }

    @ObfuscatedName("ah.w(Ldm;IB)V")
    public void method756(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field915 = arg0.method2440();
        } else if (arg1 == 2) {
            int var3 = arg0.method2440();
            this.field912 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field912[var4] = arg0.method2442();
            }
        } else if (arg1 == 3) {
            this.field921 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2440();
            this.field922 = new short[var5];
            this.field917 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field922[var6] = (short) arg0.method2442();
                this.field917[var6] = (short) arg0.method2442();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2440();
            this.field923 = new short[var7];
            this.field919 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field923[var8] = (short) arg0.method2442();
                this.field919[var8] = (short) arg0.method2442();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field920[arg1 - 60] = arg0.method2442();
        }
    }

    @ObfuscatedName("ah.r(I)Z")
    public boolean method757() {
        if (this.field912 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field912.length; var2++) {
            if (!Statics.field911.method3031(this.field912[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ah.k(I)Lcc;")
    public class101 method787() {
        if (this.field912 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field912.length];
        for (int var2 = 0; var2 < this.field912.length; var2++) {
            var1[var2] = class101.method2087(Statics.field911, this.field912[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field922 != null) {
            for (int var4 = 0; var4 < this.field922.length; var4++) {
                var3.method2071(this.field922[var4], this.field917[var4]);
            }
        }
        if (this.field923 != null) {
            for (int var5 = 0; var5 < this.field923.length; var5++) {
                var3.method2038(this.field923[var5], this.field919[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ah.z(I)Z")
    public boolean method777() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field920[var2] != -1 && !Statics.field911.method3031(this.field920[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ah.g(I)Lcc;")
    public class101 method759() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field920[var3] != -1) {
                var1[var2++] = class101.method2087(Statics.field911, this.field920[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field922 != null) {
            for (int var5 = 0; var5 < this.field922.length; var5++) {
                var4.method2071(this.field922[var5], this.field917[var5]);
            }
        }
        if (this.field923 != null) {
            for (int var6 = 0; var6 < this.field923.length; var6++) {
                var4.method2038(this.field923[var6], this.field919[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("an.n(B)V")
    public static void method581() {
        field913.method3254();
    }
}
