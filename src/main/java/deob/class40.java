package deob;

@ObfuscatedName("an")
public class class40 extends class183 {

    @ObfuscatedName("an.o")
    public static class172 field943 = new class172(64);

    @ObfuscatedName("an.k")
    public int field944 = -1;

    @ObfuscatedName("an.m")
    public int[] field945;

    @ObfuscatedName("an.i")
    public short[] field946;

    @ObfuscatedName("an.t")
    public short[] field941;

    @ObfuscatedName("an.l")
    public short[] field948;

    @ObfuscatedName("an.p")
    public short[] field949;

    @ObfuscatedName("an.r")
    public int[] field955 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("an.j")
    public boolean field951 = false;

    @ObfuscatedName("t.g(II)Lan;")
    public static class40 method75(int arg0) {
        class40 var1 = (class40) field943.method3112((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field956.method2703(3, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method756(new class107(var2));
        }
        field943.method3115(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.s(Lde;B)V")
    public void method756(class107 arg0) {
        while (true) {
            int var2 = arg0.method2116();
            if (var2 == 0) {
                return;
            }
            this.method755(arg0, var2);
        }
    }

    @ObfuscatedName("an.v(Lde;II)V")
    public void method755(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field944 = arg0.method2116();
        } else if (arg1 == 2) {
            int var3 = arg0.method2116();
            this.field945 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field945[var4] = arg0.method2094();
            }
        } else if (arg1 == 3) {
            this.field951 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2116();
            this.field946 = new short[var5];
            this.field941 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field946[var6] = (short) arg0.method2094();
                this.field941[var6] = (short) arg0.method2094();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2116();
            this.field948 = new short[var7];
            this.field949 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field948[var8] = (short) arg0.method2094();
                this.field949[var8] = (short) arg0.method2094();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field955[arg1 - 60] = arg0.method2094();
        }
    }

    @ObfuscatedName("an.o(I)Z")
    public boolean method758() {
        if (this.field945 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field945.length; var2++) {
            if (!Statics.field942.method2687(this.field945[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("an.k(I)Lcn;")
    public class93 method759() {
        if (this.field945 == null) {
            return null;
        }
        class93[] var1 = new class93[this.field945.length];
        for (int var2 = 0; var2 < this.field945.length; var2++) {
            var1[var2] = class93.method1890(Statics.field942, this.field945[var2], 0);
        }
        class93 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class93(var1, var1.length);
        }
        if (this.field946 != null) {
            for (int var4 = 0; var4 < this.field946.length; var4++) {
                var3.method1859(this.field946[var4], this.field941[var4]);
            }
        }
        if (this.field948 != null) {
            for (int var5 = 0; var5 < this.field948.length; var5++) {
                var3.method1860(this.field948[var5], this.field949[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("an.m(I)Z")
    public boolean method760() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field955[var2] != -1 && !Statics.field942.method2687(this.field955[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("an.i(I)Lcn;")
    public class93 method773() {
        class93[] var1 = new class93[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field955[var3] != -1) {
                var1[var2++] = class93.method1890(Statics.field942, this.field955[var3], 0);
            }
        }
        class93 var4 = new class93(var1, var2);
        if (this.field946 != null) {
            for (int var5 = 0; var5 < this.field946.length; var5++) {
                var4.method1859(this.field946[var5], this.field941[var5]);
            }
        }
        if (this.field948 != null) {
            for (int var6 = 0; var6 < this.field948.length; var6++) {
                var4.method1860(this.field948[var6], this.field949[var6]);
            }
        }
        return var4;
    }
}
