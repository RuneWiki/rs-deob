package deob;

@ObfuscatedName("au")
public class class36 extends class174 {

    @ObfuscatedName("au.x")
    public static class170 field915 = new class170(64);

    @ObfuscatedName("au.o")
    public int field911 = -1;

    @ObfuscatedName("au.a")
    public int[] field916;

    @ObfuscatedName("au.w")
    public short[] field917;

    @ObfuscatedName("au.i")
    public short[] field918;

    @ObfuscatedName("au.y")
    public short[] field919;

    @ObfuscatedName("au.m")
    public short[] field925;

    @ObfuscatedName("au.u")
    public int[] field921 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("au.s")
    public boolean field920 = false;

    @ObfuscatedName("f.p(Leh;Leh;B)V")
    public static void method195(class153 arg0, class153 arg1) {
        Statics.field922 = arg0;
        Statics.field912 = arg1;
        Statics.field913 = Statics.field922.method3117(3);
    }

    @ObfuscatedName("cp.l(II)Lau;")
    public static class36 method2078(int arg0) {
        class36 var1 = (class36) field915.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field922.method3078(3, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method758(new class127(var2));
        }
        field915.method3364(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.d(Lds;B)V")
    public void method758(class127 arg0) {
        while (true) {
            int var2 = arg0.method2498();
            if (var2 == 0) {
                return;
            }
            this.method759(arg0, var2);
        }
    }

    @ObfuscatedName("au.x(Lds;II)V")
    public void method759(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field911 = arg0.method2498();
        } else if (arg1 == 2) {
            int var3 = arg0.method2498();
            this.field916 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field916[var4] = arg0.method2581();
            }
        } else if (arg1 == 3) {
            this.field920 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2498();
            this.field917 = new short[var5];
            this.field918 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field917[var6] = (short) arg0.method2581();
                this.field918[var6] = (short) arg0.method2581();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2498();
            this.field919 = new short[var7];
            this.field925 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field919[var8] = (short) arg0.method2581();
                this.field925[var8] = (short) arg0.method2581();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field921[arg1 - 60] = arg0.method2581();
        }
    }

    @ObfuscatedName("au.o(I)Z")
    public boolean method779() {
        if (this.field916 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field916.length; var2++) {
            if (!Statics.field912.method3080(this.field916[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("au.a(B)Lcm;")
    public class101 method761() {
        if (this.field916 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field916.length];
        for (int var2 = 0; var2 < this.field916.length; var2++) {
            var1[var2] = class101.method2098(Statics.field912, this.field916[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field917 != null) {
            for (int var4 = 0; var4 < this.field917.length; var4++) {
                var3.method2097(this.field917[var4], this.field918[var4]);
            }
        }
        if (this.field919 != null) {
            for (int var5 = 0; var5 < this.field919.length; var5++) {
                var3.method2138(this.field919[var5], this.field925[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("au.w(I)Z")
    public boolean method777() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field921[var2] != -1 && !Statics.field912.method3080(this.field921[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("au.i(I)Lcm;")
    public class101 method763() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field921[var3] != -1) {
                var1[var2++] = class101.method2098(Statics.field912, this.field921[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field917 != null) {
            for (int var5 = 0; var5 < this.field917.length; var5++) {
                var4.method2097(this.field917[var5], this.field918[var5]);
            }
        }
        if (this.field919 != null) {
            for (int var6 = 0; var6 < this.field919.length; var6++) {
                var4.method2138(this.field919[var6], this.field925[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("p.y(S)V")
    public static void method3() {
        field915.method3360();
    }
}
