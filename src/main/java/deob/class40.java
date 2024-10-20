package deob;

@ObfuscatedName("au")
public class class40 extends class181 {

    @ObfuscatedName("au.y")
    public static class171 field915 = new class171(64);

    @ObfuscatedName("au.i")
    public int field912 = -1;

    @ObfuscatedName("au.b")
    public int[] field917;

    @ObfuscatedName("au.s")
    public short[] field918;

    @ObfuscatedName("au.q")
    public short[] field914;

    @ObfuscatedName("au.p")
    public short[] field920;

    @ObfuscatedName("au.h")
    public short[] field921;

    @ObfuscatedName("au.r")
    public int[] field922 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("au.o")
    public boolean field923 = false;

    @ObfuscatedName("bf.z(Ler;Ler;B)V")
    public static void method1599(class146 arg0, class146 arg1) {
        Statics.field927 = arg0;
        Statics.field913 = arg1;
        Statics.field925 = Statics.field927.method2738(3);
    }

    @ObfuscatedName("a.j(II)Lau;")
    public static class40 method19(int arg0) {
        class40 var1 = (class40) field915.method3162((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field927.method2705(3, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method763(new class107(var2));
        }
        field915.method3171(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.a(Ldq;I)V")
    public void method763(class107 arg0) {
        while (true) {
            int var2 = arg0.method2122();
            if (var2 == 0) {
                return;
            }
            this.method761(arg0, var2);
        }
    }

    @ObfuscatedName("au.y(Ldq;II)V")
    public void method761(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field912 = arg0.method2122();
        } else if (arg1 == 2) {
            int var3 = arg0.method2122();
            this.field917 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field917[var4] = arg0.method2239();
            }
        } else if (arg1 == 3) {
            this.field923 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2122();
            this.field918 = new short[var5];
            this.field914 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field918[var6] = (short) arg0.method2239();
                this.field914[var6] = (short) arg0.method2239();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2122();
            this.field920 = new short[var7];
            this.field921 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field920[var8] = (short) arg0.method2239();
                this.field921[var8] = (short) arg0.method2239();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field922[arg1 - 60] = arg0.method2239();
        }
    }

    @ObfuscatedName("au.i(I)Z")
    public boolean method739() {
        if (this.field917 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field917.length; var2++) {
            if (!Statics.field913.method2772(this.field917[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("au.b(B)Lcy;")
    public class93 method740() {
        if (this.field917 == null) {
            return null;
        }
        class93[] var1 = new class93[this.field917.length];
        for (int var2 = 0; var2 < this.field917.length; var2++) {
            var1[var2] = class93.method1883(Statics.field913, this.field917[var2], 0);
        }
        class93 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class93(var1, var1.length);
        }
        if (this.field918 != null) {
            for (int var4 = 0; var4 < this.field918.length; var4++) {
                var3.method1888(this.field918[var4], this.field914[var4]);
            }
        }
        if (this.field920 != null) {
            for (int var5 = 0; var5 < this.field920.length; var5++) {
                var3.method1930(this.field920[var5], this.field921[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("au.s(I)Z")
    public boolean method756() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field922[var2] != -1 && !Statics.field913.method2772(this.field922[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("au.q(I)Lcy;")
    public class93 method748() {
        class93[] var1 = new class93[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field922[var3] != -1) {
                var1[var2++] = class93.method1883(Statics.field913, this.field922[var3], 0);
            }
        }
        class93 var4 = new class93(var1, var2);
        if (this.field918 != null) {
            for (int var5 = 0; var5 < this.field918.length; var5++) {
                var4.method1888(this.field918[var5], this.field914[var5]);
            }
        }
        if (this.field920 != null) {
            for (int var6 = 0; var6 < this.field920.length; var6++) {
                var4.method1930(this.field920[var6], this.field921[var6]);
            }
        }
        return var4;
    }
}
