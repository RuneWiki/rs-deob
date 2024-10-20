package deob;

@ObfuscatedName("at")
public class class36 extends class174 {

    @ObfuscatedName("at.r")
    public static class170 field908 = new class170(64);

    @ObfuscatedName("at.n")
    public int field909 = -1;

    @ObfuscatedName("at.i")
    public int[] field910;

    @ObfuscatedName("at.s")
    public short[] field911;

    @ObfuscatedName("at.w")
    public short[] field906;

    @ObfuscatedName("at.d")
    public short[] field916;

    @ObfuscatedName("at.t")
    public short[] field913;

    @ObfuscatedName("at.f")
    public int[] field915 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("at.b")
    public boolean field924 = false;

    @ObfuscatedName("an.g(II)Lat;")
    public static class36 method792(int arg0) {
        class36 var1 = (class36) field908.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field907.method2968(3, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method779(new class127(var2));
        }
        field908.method3249(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.m(Ldr;B)V")
    public void method779(class127 arg0) {
        while (true) {
            int var2 = arg0.method2414();
            if (var2 == 0) {
                return;
            }
            this.method761(arg0, var2);
        }
    }

    @ObfuscatedName("at.v(Ldr;II)V")
    public void method761(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field909 = arg0.method2414();
        } else if (arg1 == 2) {
            int var3 = arg0.method2414();
            this.field910 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field910[var4] = arg0.method2416();
            }
        } else if (arg1 == 3) {
            this.field924 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2414();
            this.field911 = new short[var5];
            this.field906 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field911[var6] = (short) arg0.method2416();
                this.field906[var6] = (short) arg0.method2416();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2414();
            this.field916 = new short[var7];
            this.field913 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field916[var8] = (short) arg0.method2416();
                this.field913[var8] = (short) arg0.method2416();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field915[arg1 - 60] = arg0.method2416();
        }
    }

    @ObfuscatedName("at.r(I)Z")
    public boolean method762() {
        if (this.field910 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field910.length; var2++) {
            if (!Statics.field905.method2970(this.field910[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("at.n(B)Lck;")
    public class101 method763() {
        if (this.field910 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field910.length];
        for (int var2 = 0; var2 < this.field910.length; var2++) {
            var1[var2] = class101.method2086(Statics.field905, this.field910[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field911 != null) {
            for (int var4 = 0; var4 < this.field911.length; var4++) {
                var3.method2031(this.field911[var4], this.field906[var4]);
            }
        }
        if (this.field916 != null) {
            for (int var5 = 0; var5 < this.field916.length; var5++) {
                var3.method2042(this.field916[var5], this.field913[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("at.i(I)Z")
    public boolean method764() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field915[var2] != -1 && !Statics.field905.method2970(this.field915[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("at.s(I)Lck;")
    public class101 method765() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field915[var3] != -1) {
                var1[var2++] = class101.method2086(Statics.field905, this.field915[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field911 != null) {
            for (int var5 = 0; var5 < this.field911.length; var5++) {
                var4.method2031(this.field911[var5], this.field906[var5]);
            }
        }
        if (this.field916 != null) {
            for (int var6 = 0; var6 < this.field916.length; var6++) {
                var4.method2042(this.field916[var6], this.field913[var6]);
            }
        }
        return var4;
    }
}
