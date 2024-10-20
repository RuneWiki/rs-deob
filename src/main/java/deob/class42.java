package deob;

@ObfuscatedName("an")
public class class42 extends class195 {

    @ObfuscatedName("an.m")
    public static class184 field1006 = new class184(64);

    @ObfuscatedName("an.s")
    public int field1013 = -1;

    @ObfuscatedName("an.j")
    public int[] field1007;

    @ObfuscatedName("an.f")
    public short[] field1008;

    @ObfuscatedName("an.b")
    public short[] field1009;

    @ObfuscatedName("an.t")
    public short[] field1010;

    @ObfuscatedName("an.i")
    public short[] field1011;

    @ObfuscatedName("an.c")
    public int[] field1012 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("an.k")
    public boolean field1016 = false;

    @ObfuscatedName("ds.n(IB)Lan;")
    public static class42 method2514(int arg0) {
        class42 var1 = (class42) field1006.method3388((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1004.method2929(3, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method800(new class111(var2));
        }
        field1006.method3396(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.g(Ldp;I)V")
    public void method800(class111 arg0) {
        while (true) {
            int var2 = arg0.method2211();
            if (var2 == 0) {
                return;
            }
            this.method801(arg0, var2);
        }
    }

    @ObfuscatedName("an.a(Ldp;IB)V")
    public void method801(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1013 = arg0.method2211();
        } else if (arg1 == 2) {
            int var3 = arg0.method2211();
            this.field1007 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1007[var4] = arg0.method2395();
            }
        } else if (arg1 == 3) {
            this.field1016 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2211();
            this.field1008 = new short[var5];
            this.field1009 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1008[var6] = (short) arg0.method2395();
                this.field1009[var6] = (short) arg0.method2395();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2211();
            this.field1010 = new short[var7];
            this.field1011 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1010[var8] = (short) arg0.method2395();
                this.field1011[var8] = (short) arg0.method2395();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1012[arg1 - 60] = arg0.method2395();
        }
    }

    @ObfuscatedName("an.m(B)Z")
    public boolean method802() {
        if (this.field1007 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1007.length; var2++) {
            if (!Statics.field1003.method2987(this.field1007[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("an.s(B)Lci;")
    public class95 method823() {
        if (this.field1007 == null) {
            return null;
        }
        class95[] var1 = new class95[this.field1007.length];
        for (int var2 = 0; var2 < this.field1007.length; var2++) {
            var1[var2] = class95.method2011(Statics.field1003, this.field1007[var2], 0);
        }
        class95 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class95(var1, var1.length);
        }
        if (this.field1008 != null) {
            for (int var4 = 0; var4 < this.field1008.length; var4++) {
                var3.method1991(this.field1008[var4], this.field1009[var4]);
            }
        }
        if (this.field1010 != null) {
            for (int var5 = 0; var5 < this.field1010.length; var5++) {
                var3.method2030(this.field1010[var5], this.field1011[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("an.j(I)Z")
    public boolean method803() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1012[var2] != -1 && !Statics.field1003.method2987(this.field1012[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("an.f(B)Lci;")
    public class95 method804() {
        class95[] var1 = new class95[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1012[var3] != -1) {
                var1[var2++] = class95.method2011(Statics.field1003, this.field1012[var3], 0);
            }
        }
        class95 var4 = new class95(var1, var2);
        if (this.field1008 != null) {
            for (int var5 = 0; var5 < this.field1008.length; var5++) {
                var4.method1991(this.field1008[var5], this.field1009[var5]);
            }
        }
        if (this.field1010 != null) {
            for (int var6 = 0; var6 < this.field1010.length; var6++) {
                var4.method2030(this.field1010[var6], this.field1011[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("bl.b(B)V")
    public static void method1125() {
        field1006.method3398();
    }
}
