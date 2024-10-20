package deob;

@ObfuscatedName("ab")
public class class36 extends class174 {

    @ObfuscatedName("ab.e")
    public static class170 field931 = new class170(64);

    @ObfuscatedName("ab.t")
    public int field926 = -1;

    @ObfuscatedName("ab.d")
    public int[] field934;

    @ObfuscatedName("ab.p")
    public short[] field932;

    @ObfuscatedName("ab.k")
    public short[] field933;

    @ObfuscatedName("ab.r")
    public short[] field937;

    @ObfuscatedName("ab.l")
    public short[] field935;

    @ObfuscatedName("ab.a")
    public int[] field936 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ab.z")
    public boolean field929 = false;

    @ObfuscatedName("h.i(Leg;Leg;I)V")
    public static void method231(class152 arg0, class152 arg1) {
        Statics.field928 = arg0;
        Statics.field927 = arg1;
        Statics.field930 = Statics.field928.method2980(3);
    }

    @ObfuscatedName("bw.w(II)Lab;")
    public static class36 method1354(int arg0) {
        class36 var1 = (class36) field931.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field928.method2970(3, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method754(new class127(var2));
        }
        field931.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.f(Ldz;I)V")
    public void method754(class127 arg0) {
        while (true) {
            int var2 = arg0.method2472();
            if (var2 == 0) {
                return;
            }
            this.method755(arg0, var2);
        }
    }

    @ObfuscatedName("ab.e(Ldz;II)V")
    public void method755(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field926 = arg0.method2472();
        } else if (arg1 == 2) {
            int var3 = arg0.method2472();
            this.field934 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field934[var4] = arg0.method2615();
            }
        } else if (arg1 == 3) {
            this.field929 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2472();
            this.field932 = new short[var5];
            this.field933 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field932[var6] = (short) arg0.method2615();
                this.field933[var6] = (short) arg0.method2615();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2472();
            this.field937 = new short[var7];
            this.field935 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field937[var8] = (short) arg0.method2615();
                this.field935[var8] = (short) arg0.method2615();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field936[arg1 - 60] = arg0.method2615();
        }
    }

    @ObfuscatedName("ab.t(B)Z")
    public boolean method756() {
        if (this.field934 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field934.length; var2++) {
            if (!Statics.field927.method2972(this.field934[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ab.d(I)Lco;")
    public class101 method764() {
        if (this.field934 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field934.length];
        for (int var2 = 0; var2 < this.field934.length; var2++) {
            var1[var2] = class101.method2052(Statics.field927, this.field934[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field932 != null) {
            for (int var4 = 0; var4 < this.field932.length; var4++) {
                var3.method2064(this.field932[var4], this.field933[var4]);
            }
        }
        if (this.field937 != null) {
            for (int var5 = 0; var5 < this.field937.length; var5++) {
                var3.method2066(this.field937[var5], this.field935[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ab.p(I)Z")
    public boolean method761() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field936[var2] != -1 && !Statics.field927.method2972(this.field936[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ab.k(B)Lco;")
    public class101 method757() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field936[var3] != -1) {
                var1[var2++] = class101.method2052(Statics.field927, this.field936[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field932 != null) {
            for (int var5 = 0; var5 < this.field932.length; var5++) {
                var4.method2064(this.field932[var5], this.field933[var5]);
            }
        }
        if (this.field937 != null) {
            for (int var6 = 0; var6 < this.field937.length; var6++) {
                var4.method2066(this.field937[var6], this.field935[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fc.r(B)V")
    public static void method3084() {
        field931.method3243();
    }
}
