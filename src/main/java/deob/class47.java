package deob;

@ObfuscatedName("ac")
public class class47 extends class208 {

    @ObfuscatedName("ac.c")
    public static class197 field1053 = new class197(64);

    @ObfuscatedName("ac.v")
    public int field1054 = -1;

    @ObfuscatedName("ac.j")
    public int[] field1063;

    @ObfuscatedName("ac.m")
    public short[] field1051;

    @ObfuscatedName("ac.y")
    public short[] field1057;

    @ObfuscatedName("ac.u")
    public short[] field1058;

    @ObfuscatedName("ac.h")
    public short[] field1056;

    @ObfuscatedName("ac.l")
    public int[] field1060 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ac.b")
    public boolean field1059 = false;

    @ObfuscatedName("ad.k(II)Lac;")
    public static class47 method659(int arg0) {
        class47 var1 = (class47) field1053.method3535((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1055.method3097(3, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method918(new class123(var2));
        }
        field1053.method3537(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.q(Lde;I)V")
    public void method918(class123 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method919(arg0, var2);
        }
    }

    @ObfuscatedName("ac.f(Lde;II)V")
    public void method919(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1054 = arg0.method2427();
        } else if (arg1 == 2) {
            int var3 = arg0.method2427();
            this.field1063 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1063[var4] = arg0.method2547();
            }
        } else if (arg1 == 3) {
            this.field1059 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2427();
            this.field1051 = new short[var5];
            this.field1057 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1051[var6] = (short) arg0.method2547();
                this.field1057[var6] = (short) arg0.method2547();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2427();
            this.field1058 = new short[var7];
            this.field1056 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1058[var8] = (short) arg0.method2547();
                this.field1056[var8] = (short) arg0.method2547();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1060[arg1 - 60] = arg0.method2547();
        }
    }

    @ObfuscatedName("ac.c(I)Z")
    public boolean method933() {
        if (this.field1063 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1063.length; var2++) {
            if (!Statics.field1052.method3074(this.field1063[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ac.v(I)Lcr;")
    public class104 method920() {
        if (this.field1063 == null) {
            return null;
        }
        class104[] var1 = new class104[this.field1063.length];
        for (int var2 = 0; var2 < this.field1063.length; var2++) {
            var1[var2] = class104.method2141(Statics.field1052, this.field1063[var2], 0);
        }
        class104 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class104(var1, var1.length);
        }
        if (this.field1051 != null) {
            for (int var4 = 0; var4 < this.field1051.length; var4++) {
                var3.method2152(this.field1051[var4], this.field1057[var4]);
            }
        }
        if (this.field1058 != null) {
            for (int var5 = 0; var5 < this.field1058.length; var5++) {
                var3.method2153(this.field1058[var5], this.field1056[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ac.j(B)Z")
    public boolean method922() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1060[var2] != -1 && !Statics.field1052.method3074(this.field1060[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ac.m(B)Lcr;")
    public class104 method923() {
        class104[] var1 = new class104[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1060[var3] != -1) {
                var1[var2++] = class104.method2141(Statics.field1052, this.field1060[var3], 0);
            }
        }
        class104 var4 = new class104(var1, var2);
        if (this.field1051 != null) {
            for (int var5 = 0; var5 < this.field1051.length; var5++) {
                var4.method2152(this.field1051[var5], this.field1057[var5]);
            }
        }
        if (this.field1058 != null) {
            for (int var6 = 0; var6 < this.field1058.length; var6++) {
                var4.method2153(this.field1058[var6], this.field1056[var6]);
            }
        }
        return var4;
    }
}
