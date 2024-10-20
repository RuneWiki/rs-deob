package deob;

@ObfuscatedName("as")
public class class36 extends class174 {

    @ObfuscatedName("as.d")
    public static class170 field940 = new class170(64);

    @ObfuscatedName("as.b")
    public int field943 = -1;

    @ObfuscatedName("as.i")
    public int[] field944;

    @ObfuscatedName("as.p")
    public short[] field950;

    @ObfuscatedName("as.y")
    public short[] field946;

    @ObfuscatedName("as.u")
    public short[] field947;

    @ObfuscatedName("as.z")
    public short[] field942;

    @ObfuscatedName("as.j")
    public int[] field949 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("as.h")
    public boolean field953 = false;

    @ObfuscatedName("cy.t(Lev;Lev;B)V")
    public static void method1871(class152 arg0, class152 arg1) {
        Statics.field948 = arg0;
        Statics.field2481 = arg1;
        Statics.field941 = Statics.field948.method3048(3);
    }

    @ObfuscatedName("v.l(IS)Las;")
    public static class36 method241(int arg0) {
        class36 var1 = (class36) field940.method3260((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field948.method2987(3, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method787(new class127(var2));
        }
        field940.method3261(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.c(Ldo;B)V")
    public void method787(class127 arg0) {
        while (true) {
            int var2 = arg0.method2438();
            if (var2 == 0) {
                return;
            }
            this.method788(arg0, var2);
        }
    }

    @ObfuscatedName("as.d(Ldo;II)V")
    public void method788(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field943 = arg0.method2438();
        } else if (arg1 == 2) {
            int var3 = arg0.method2438();
            this.field944 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field944[var4] = arg0.method2440();
            }
        } else if (arg1 == 3) {
            this.field953 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2438();
            this.field950 = new short[var5];
            this.field946 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field950[var6] = (short) arg0.method2440();
                this.field946[var6] = (short) arg0.method2440();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2438();
            this.field947 = new short[var7];
            this.field942 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field947[var8] = (short) arg0.method2440();
                this.field942[var8] = (short) arg0.method2440();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field949[arg1 - 60] = arg0.method2440();
        }
    }

    @ObfuscatedName("as.b(S)Z")
    public boolean method794() {
        if (this.field944 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field944.length; var2++) {
            if (!Statics.field2481.method2989(this.field944[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("as.i(S)Lcc;")
    public class101 method790() {
        if (this.field944 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field944.length];
        for (int var2 = 0; var2 < this.field944.length; var2++) {
            var1[var2] = class101.method2086(Statics.field2481, this.field944[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field950 != null) {
            for (int var4 = 0; var4 < this.field950.length; var4++) {
                var3.method2063(this.field950[var4], this.field946[var4]);
            }
        }
        if (this.field947 != null) {
            for (int var5 = 0; var5 < this.field947.length; var5++) {
                var3.method2064(this.field947[var5], this.field942[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("as.p(I)Z")
    public boolean method791() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field949[var2] != -1 && !Statics.field2481.method2989(this.field949[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("as.y(B)Lcc;")
    public class101 method786() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field949[var3] != -1) {
                var1[var2++] = class101.method2086(Statics.field2481, this.field949[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field950 != null) {
            for (int var5 = 0; var5 < this.field950.length; var5++) {
                var4.method2063(this.field950[var5], this.field946[var5]);
            }
        }
        if (this.field947 != null) {
            for (int var6 = 0; var6 < this.field947.length; var6++) {
                var4.method2064(this.field947[var6], this.field942[var6]);
            }
        }
        return var4;
    }
}
