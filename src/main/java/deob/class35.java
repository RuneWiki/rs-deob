package deob;

@ObfuscatedName("ak")
public class class35 extends class173 {

    @ObfuscatedName("ak.m")
    public static class169 field925 = new class169(64);

    @ObfuscatedName("ak.n")
    public int field912 = -1;

    @ObfuscatedName("ak.q")
    public int[] field923;

    @ObfuscatedName("ak.a")
    public short[] field918;

    @ObfuscatedName("ak.g")
    public short[] field913;

    @ObfuscatedName("ak.j")
    public short[] field920;

    @ObfuscatedName("ak.l")
    public short[] field921;

    @ObfuscatedName("ak.w")
    public int[] field922 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ak.z")
    public boolean field915 = false;

    @ObfuscatedName("ax.u(Leb;Leb;B)V")
    public static void method526(class151 arg0, class151 arg1) {
        Statics.field919 = arg0;
        Statics.field916 = arg1;
        Statics.field914 = Statics.field919.method2975(3);
    }

    @ObfuscatedName("fz.k(IB)Lak;")
    public static class35 method3101(int arg0) {
        class35 var1 = (class35) field925.method3263((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field919.method2965(3, arg0);
        class35 var3 = new class35();
        if (var2 != null) {
            var3.method732(new class126(var2));
        }
        field925.method3260(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.x(Ldl;I)V")
    public void method732(class126 arg0) {
        while (true) {
            int var2 = arg0.method2559();
            if (var2 == 0) {
                return;
            }
            this.method758(arg0, var2);
        }
    }

    @ObfuscatedName("ak.m(Ldl;IS)V")
    public void method758(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field912 = arg0.method2559();
        } else if (arg1 == 2) {
            int var3 = arg0.method2559();
            this.field923 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field923[var4] = arg0.method2450();
            }
        } else if (arg1 == 3) {
            this.field915 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2559();
            this.field918 = new short[var5];
            this.field913 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field918[var6] = (short) arg0.method2450();
                this.field913[var6] = (short) arg0.method2450();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2559();
            this.field920 = new short[var7];
            this.field921 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field920[var8] = (short) arg0.method2450();
                this.field921[var8] = (short) arg0.method2450();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field922[arg1 - 60] = arg0.method2450();
        }
    }

    @ObfuscatedName("ak.n(B)Z")
    public boolean method734() {
        if (this.field923 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field923.length; var2++) {
            if (!Statics.field916.method3013(this.field923[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ak.q(I)Lcj;")
    public class100 method735() {
        if (this.field923 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field923.length];
        for (int var2 = 0; var2 < this.field923.length; var2++) {
            var1[var2] = class100.method2044(Statics.field916, this.field923[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field918 != null) {
            for (int var4 = 0; var4 < this.field918.length; var4++) {
                var3.method2107(this.field918[var4], this.field913[var4]);
            }
        }
        if (this.field920 != null) {
            for (int var5 = 0; var5 < this.field920.length; var5++) {
                var3.method2110(this.field920[var5], this.field921[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ak.a(I)Z")
    public boolean method736() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field922[var2] != -1 && !Statics.field916.method3013(this.field922[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ak.g(I)Lcj;")
    public class100 method756() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field922[var3] != -1) {
                var1[var2++] = class100.method2044(Statics.field916, this.field922[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field918 != null) {
            for (int var5 = 0; var5 < this.field918.length; var5++) {
                var4.method2107(this.field918[var5], this.field913[var5]);
            }
        }
        if (this.field920 != null) {
            for (int var6 = 0; var6 < this.field920.length; var6++) {
                var4.method2110(this.field920[var6], this.field921[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("k.j(B)V")
    public static void method14() {
        field925.method3261();
    }
}
