package deob;

@ObfuscatedName("aw")
public class class45 extends class205 {

    @ObfuscatedName("aw.b")
    public static class194 field1048 = new class194(64);

    @ObfuscatedName("aw.l")
    public int field1043 = -1;

    @ObfuscatedName("aw.d")
    public int[] field1041;

    @ObfuscatedName("aw.n")
    public short[] field1045;

    @ObfuscatedName("aw.m")
    public short[] field1046;

    @ObfuscatedName("aw.g")
    public short[] field1047;

    @ObfuscatedName("aw.s")
    public short[] field1042;

    @ObfuscatedName("aw.r")
    public int[] field1049 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aw.k")
    public boolean field1050 = false;

    @ObfuscatedName("cy.f(Lfl;Lfl;I)V")
    public static void method2104(class168 arg0, class168 arg1) {
        Statics.field1052 = arg0;
        Statics.field1044 = arg1;
        Statics.field3163 = Statics.field1052.method3096(3);
    }

    @ObfuscatedName("ao.u(IB)Law;")
    public static class45 method686(int arg0) {
        class45 var1 = (class45) field1048.method3530((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1052.method3061(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method929(new class120(var2));
        }
        field1048.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.x(Ldj;B)V")
    public void method929(class120 arg0) {
        while (true) {
            int var2 = arg0.method2385();
            if (var2 == 0) {
                return;
            }
            this.method930(arg0, var2);
        }
    }

    @ObfuscatedName("aw.b(Ldj;IB)V")
    public void method930(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1043 = arg0.method2385();
        } else if (arg1 == 2) {
            int var3 = arg0.method2385();
            this.field1041 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1041[var4] = arg0.method2387();
            }
        } else if (arg1 == 3) {
            this.field1050 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2385();
            this.field1045 = new short[var5];
            this.field1046 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1045[var6] = (short) arg0.method2387();
                this.field1046[var6] = (short) arg0.method2387();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2385();
            this.field1047 = new short[var7];
            this.field1042 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1047[var8] = (short) arg0.method2387();
                this.field1042[var8] = (short) arg0.method2387();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1049[arg1 - 60] = arg0.method2387();
        }
    }

    @ObfuscatedName("aw.l(S)Z")
    public boolean method954() {
        if (this.field1041 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1041.length; var2++) {
            if (!Statics.field1044.method3063(this.field1041[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aw.d(B)Lct;")
    public class101 method932() {
        if (this.field1041 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field1041.length];
        for (int var2 = 0; var2 < this.field1041.length; var2++) {
            var1[var2] = class101.method2118(Statics.field1044, this.field1041[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field1045 != null) {
            for (int var4 = 0; var4 < this.field1045.length; var4++) {
                var3.method2179(this.field1045[var4], this.field1046[var4]);
            }
        }
        if (this.field1047 != null) {
            for (int var5 = 0; var5 < this.field1047.length; var5++) {
                var3.method2138(this.field1047[var5], this.field1042[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aw.n(I)Z")
    public boolean method948() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1049[var2] != -1 && !Statics.field1044.method3063(this.field1049[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aw.m(I)Lct;")
    public class101 method934() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1049[var3] != -1) {
                var1[var2++] = class101.method2118(Statics.field1044, this.field1049[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field1045 != null) {
            for (int var5 = 0; var5 < this.field1045.length; var5++) {
                var4.method2179(this.field1045[var5], this.field1046[var5]);
            }
        }
        if (this.field1047 != null) {
            for (int var6 = 0; var6 < this.field1047.length; var6++) {
                var4.method2138(this.field1047[var6], this.field1042[var6]);
            }
        }
        return var4;
    }
}
