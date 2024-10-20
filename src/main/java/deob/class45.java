package deob;

@ObfuscatedName("an")
public class class45 extends class205 {

    @ObfuscatedName("an.s")
    public static class194 field1004 = new class194(64);

    @ObfuscatedName("an.p")
    public int field1005 = -1;

    @ObfuscatedName("an.h")
    public int[] field1012;

    @ObfuscatedName("an.g")
    public short[] field1014;

    @ObfuscatedName("an.a")
    public short[] field1002;

    @ObfuscatedName("an.r")
    public short[] field1009;

    @ObfuscatedName("an.k")
    public short[] field1010;

    @ObfuscatedName("an.m")
    public int[] field1011 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("an.n")
    public boolean field1007 = false;

    @ObfuscatedName("s.e(IB)Lan;")
    public static class45 method43(int arg0) {
        class45 var1 = (class45) field1004.method3473((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1006.method3048(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method895(new class120(var2));
        }
        field1004.method3475(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.w(Ldq;B)V")
    public void method895(class120 arg0) {
        while (true) {
            int var2 = arg0.method2355();
            if (var2 == 0) {
                return;
            }
            this.method897(arg0, var2);
        }
    }

    @ObfuscatedName("an.f(Ldq;IS)V")
    public void method897(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1005 = arg0.method2355();
        } else if (arg1 == 2) {
            int var3 = arg0.method2355();
            this.field1012 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1012[var4] = arg0.method2532();
            }
        } else if (arg1 == 3) {
            this.field1007 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2355();
            this.field1014 = new short[var5];
            this.field1002 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1014[var6] = (short) arg0.method2532();
                this.field1002[var6] = (short) arg0.method2532();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2355();
            this.field1009 = new short[var7];
            this.field1010 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1009[var8] = (short) arg0.method2532();
                this.field1010[var8] = (short) arg0.method2532();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1011[arg1 - 60] = arg0.method2532();
        }
    }

    @ObfuscatedName("an.s(I)Z")
    public boolean method911() {
        if (this.field1012 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1012.length; var2++) {
            if (!Statics.field1008.method3032(this.field1012[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("an.p(B)Lcp;")
    public class101 method898() {
        if (this.field1012 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field1012.length];
        for (int var2 = 0; var2 < this.field1012.length; var2++) {
            var1[var2] = class101.method2063(Statics.field1008, this.field1012[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field1014 != null) {
            for (int var4 = 0; var4 < this.field1014.length; var4++) {
                var3.method2076(this.field1014[var4], this.field1002[var4]);
            }
        }
        if (this.field1009 != null) {
            for (int var5 = 0; var5 < this.field1009.length; var5++) {
                var3.method2077(this.field1009[var5], this.field1010[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("an.h(I)Z")
    public boolean method899() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1011[var2] != -1 && !Statics.field1008.method3032(this.field1011[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("an.g(I)Lcp;")
    public class101 method900() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1011[var3] != -1) {
                var1[var2++] = class101.method2063(Statics.field1008, this.field1011[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field1014 != null) {
            for (int var5 = 0; var5 < this.field1014.length; var5++) {
                var4.method2076(this.field1014[var5], this.field1002[var5]);
            }
        }
        if (this.field1009 != null) {
            for (int var6 = 0; var6 < this.field1009.length; var6++) {
                var4.method2077(this.field1009[var6], this.field1010[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ft.a(I)V")
    public static void method3088() {
        field1004.method3479();
    }
}
