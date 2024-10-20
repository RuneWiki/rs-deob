package deob;

@ObfuscatedName("ax")
public class class36 extends class174 {

    @ObfuscatedName("ax.t")
    public static class170 field906 = new class170(64);

    @ObfuscatedName("ax.k")
    public int field916 = -1;

    @ObfuscatedName("ax.x")
    public int[] field908;

    @ObfuscatedName("ax.v")
    public short[] field904;

    @ObfuscatedName("ax.g")
    public short[] field910;

    @ObfuscatedName("ax.n")
    public short[] field917;

    @ObfuscatedName("ax.q")
    public short[] field912;

    @ObfuscatedName("ax.i")
    public int[] field913 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ax.p")
    public boolean field914 = false;

    @ObfuscatedName("bi.a(II)Lax;")
    public static class36 method1321(int arg0) {
        class36 var1 = (class36) field906.method3208((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field903.method2943(3, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method700(new class126(var2));
        }
        field906.method3210(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.r(Ldf;B)V")
    public void method700(class126 arg0) {
        while (true) {
            int var2 = arg0.method2481();
            if (var2 == 0) {
                return;
            }
            this.method701(arg0, var2);
        }
    }

    @ObfuscatedName("ax.u(Ldf;II)V")
    public void method701(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field916 = arg0.method2481();
        } else if (arg1 == 2) {
            int var3 = arg0.method2481();
            this.field908 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field908[var4] = arg0.method2373();
            }
        } else if (arg1 == 3) {
            this.field914 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2481();
            this.field904 = new short[var5];
            this.field910 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field904[var6] = (short) arg0.method2373();
                this.field910[var6] = (short) arg0.method2373();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2481();
            this.field917 = new short[var7];
            this.field912 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field917[var8] = (short) arg0.method2373();
                this.field912[var8] = (short) arg0.method2373();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field913[arg1 - 60] = arg0.method2373();
        }
    }

    @ObfuscatedName("ax.t(B)Z")
    public boolean method702() {
        if (this.field908 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field908.length; var2++) {
            if (!Statics.field907.method2945(this.field908[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ax.k(I)Lck;")
    public class101 method722() {
        if (this.field908 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field908.length];
        for (int var2 = 0; var2 < this.field908.length; var2++) {
            var1[var2] = class101.method1993(Statics.field907, this.field908[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field904 != null) {
            for (int var4 = 0; var4 < this.field904.length; var4++) {
                var3.method2006(this.field904[var4], this.field910[var4]);
            }
        }
        if (this.field917 != null) {
            for (int var5 = 0; var5 < this.field917.length; var5++) {
                var3.method2007(this.field917[var5], this.field912[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ax.x(B)Z")
    public boolean method699() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field913[var2] != -1 && !Statics.field907.method2945(this.field913[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ax.v(B)Lck;")
    public class101 method707() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field913[var3] != -1) {
                var1[var2++] = class101.method1993(Statics.field907, this.field913[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field904 != null) {
            for (int var5 = 0; var5 < this.field904.length; var5++) {
                var4.method2006(this.field904[var5], this.field910[var5]);
            }
        }
        if (this.field917 != null) {
            for (int var6 = 0; var6 < this.field917.length; var6++) {
                var4.method2007(this.field917[var6], this.field912[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("a.g(I)V")
    public static void method4() {
        field906.method3216();
    }
}
