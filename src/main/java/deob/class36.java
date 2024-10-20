package deob;

@ObfuscatedName("ah")
public class class36 extends class174 {

    @ObfuscatedName("ah.o")
    public static class170 field915 = new class170(64);

    @ObfuscatedName("ah.a")
    public int field907 = -1;

    @ObfuscatedName("ah.h")
    public int[] field908;

    @ObfuscatedName("ah.j")
    public short[] field909;

    @ObfuscatedName("ah.f")
    public short[] field910;

    @ObfuscatedName("ah.q")
    public short[] field903;

    @ObfuscatedName("ah.l")
    public short[] field912;

    @ObfuscatedName("ah.d")
    public int[] field913 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ah.z")
    public boolean field914 = false;

    @ObfuscatedName("ba.b(II)Lah;")
    public static class36 method1351(int arg0) {
        class36 var1 = (class36) field915.method3248((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field906.method3026(3, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method750(new class126(var2));
        }
        field915.method3252(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.e(Ldv;B)V")
    public void method750(class126 arg0) {
        while (true) {
            int var2 = arg0.method2436();
            if (var2 == 0) {
                return;
            }
            this.method752(arg0, var2);
        }
    }

    @ObfuscatedName("ah.g(Ldv;II)V")
    public void method752(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field907 = arg0.method2436();
        } else if (arg1 == 2) {
            int var3 = arg0.method2436();
            this.field908 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field908[var4] = arg0.method2572();
            }
        } else if (arg1 == 3) {
            this.field914 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2436();
            this.field909 = new short[var5];
            this.field910 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field909[var6] = (short) arg0.method2572();
                this.field910[var6] = (short) arg0.method2572();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2436();
            this.field903 = new short[var7];
            this.field912 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field903[var8] = (short) arg0.method2572();
                this.field912[var8] = (short) arg0.method2572();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field913[arg1 - 60] = arg0.method2572();
        }
    }

    @ObfuscatedName("ah.o(I)Z")
    public boolean method751() {
        if (this.field908 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field908.length; var2++) {
            if (!Statics.field904.method2998(this.field908[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ah.a(B)Lcu;")
    public class101 method766() {
        if (this.field908 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field908.length];
        for (int var2 = 0; var2 < this.field908.length; var2++) {
            var1[var2] = class101.method2032(Statics.field904, this.field908[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field909 != null) {
            for (int var4 = 0; var4 < this.field909.length; var4++) {
                var3.method2047(this.field909[var4], this.field910[var4]);
            }
        }
        if (this.field903 != null) {
            for (int var5 = 0; var5 < this.field903.length; var5++) {
                var3.method2048(this.field903[var5], this.field912[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ah.h(I)Z")
    public boolean method753() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field913[var2] != -1 && !Statics.field904.method2998(this.field913[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ah.j(I)Lcu;")
    public class101 method754() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field913[var3] != -1) {
                var1[var2++] = class101.method2032(Statics.field904, this.field913[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field909 != null) {
            for (int var5 = 0; var5 < this.field909.length; var5++) {
                var4.method2047(this.field909[var5], this.field910[var5]);
            }
        }
        if (this.field903 != null) {
            for (int var6 = 0; var6 < this.field903.length; var6++) {
                var4.method2048(this.field903[var6], this.field912[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aw.f(B)V")
    public static void method744() {
        field915.method3251();
    }
}
