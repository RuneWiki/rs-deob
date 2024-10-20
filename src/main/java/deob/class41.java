package deob;

@ObfuscatedName("aj")
public class class41 extends class185 {

    @ObfuscatedName("aj.r")
    public static class174 field945 = new class174(64);

    @ObfuscatedName("aj.f")
    public int field946 = -1;

    @ObfuscatedName("aj.l")
    public int[] field959;

    @ObfuscatedName("aj.b")
    public short[] field948;

    @ObfuscatedName("aj.k")
    public short[] field949;

    @ObfuscatedName("aj.g")
    public short[] field953;

    @ObfuscatedName("aj.v")
    public short[] field943;

    @ObfuscatedName("aj.i")
    public int[] field952 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aj.x")
    public boolean field942 = false;

    @ObfuscatedName("ee.c(Ler;Ler;I)V")
    public static void method2867(class149 arg0, class149 arg1) {
        Statics.field951 = arg0;
        Statics.field950 = arg1;
        Statics.field944 = Statics.field951.method2756(3);
    }

    @ObfuscatedName("dy.j(IB)Laj;")
    public static class41 method2416(int arg0) {
        class41 var1 = (class41) field945.method3178((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field951.method2746(3, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method747(new class108(var2));
        }
        field945.method3167(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.y(Ldx;I)V")
    public void method747(class108 arg0) {
        while (true) {
            int var2 = arg0.method2134();
            if (var2 == 0) {
                return;
            }
            this.method749(arg0, var2);
        }
    }

    @ObfuscatedName("aj.r(Ldx;II)V")
    public void method749(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field946 = arg0.method2134();
        } else if (arg1 == 2) {
            int var3 = arg0.method2134();
            this.field959 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field959[var4] = arg0.method2136();
            }
        } else if (arg1 == 3) {
            this.field942 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2134();
            this.field948 = new short[var5];
            this.field949 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field948[var6] = (short) arg0.method2136();
                this.field949[var6] = (short) arg0.method2136();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2134();
            this.field953 = new short[var7];
            this.field943 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field953[var8] = (short) arg0.method2136();
                this.field943[var8] = (short) arg0.method2136();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field952[arg1 - 60] = arg0.method2136();
        }
    }

    @ObfuscatedName("aj.f(I)Z")
    public boolean method750() {
        if (this.field959 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field959.length; var2++) {
            if (!Statics.field950.method2777(this.field959[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aj.l(I)Lce;")
    public class94 method768() {
        if (this.field959 == null) {
            return null;
        }
        class94[] var1 = new class94[this.field959.length];
        for (int var2 = 0; var2 < this.field959.length; var2++) {
            var1[var2] = class94.method1955(Statics.field950, this.field959[var2], 0);
        }
        class94 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class94(var1, var1.length);
        }
        if (this.field948 != null) {
            for (int var4 = 0; var4 < this.field948.length; var4++) {
                var3.method1914(this.field948[var4], this.field949[var4]);
            }
        }
        if (this.field953 != null) {
            for (int var5 = 0; var5 < this.field953.length; var5++) {
                var3.method1915(this.field953[var5], this.field943[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aj.b(I)Z")
    public boolean method752() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field952[var2] != -1 && !Statics.field950.method2777(this.field952[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aj.k(I)Lce;")
    public class94 method753() {
        class94[] var1 = new class94[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field952[var3] != -1) {
                var1[var2++] = class94.method1955(Statics.field950, this.field952[var3], 0);
            }
        }
        class94 var4 = new class94(var1, var2);
        if (this.field948 != null) {
            for (int var5 = 0; var5 < this.field948.length; var5++) {
                var4.method1914(this.field948[var5], this.field949[var5]);
            }
        }
        if (this.field953 != null) {
            for (int var6 = 0; var6 < this.field953.length; var6++) {
                var4.method1915(this.field953[var6], this.field943[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("h.g(B)V")
    public static void method122() {
        field945.method3168();
    }
}
