package deob;

@ObfuscatedName("au")
public class class47 extends class208 {

    @ObfuscatedName("au.o")
    public static class197 field1048 = new class197(64);

    @ObfuscatedName("au.g")
    public int field1049 = -1;

    @ObfuscatedName("au.l")
    public int[] field1051;

    @ObfuscatedName("au.j")
    public short[] field1053;

    @ObfuscatedName("au.r")
    public short[] field1052;

    @ObfuscatedName("au.x")
    public short[] field1064;

    @ObfuscatedName("au.k")
    public short[] field1054;

    @ObfuscatedName("au.v")
    public int[] field1055 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("au.h")
    public boolean field1056 = false;

    @ObfuscatedName("fh.m(II)Lau;")
    public static class47 method3279(int arg0) {
        class47 var1 = (class47) field1048.method3556((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1050.method3086(3, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method937(new class123(var2));
        }
        field1048.method3562(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.w(Ldj;B)V")
    public void method937(class123 arg0) {
        while (true) {
            int var2 = arg0.method2398();
            if (var2 == 0) {
                return;
            }
            this.method927(arg0, var2);
        }
    }

    @ObfuscatedName("au.e(Ldj;II)V")
    public void method927(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1049 = arg0.method2398();
        } else if (arg1 == 2) {
            int var3 = arg0.method2398();
            this.field1051 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1051[var4] = arg0.method2548();
            }
        } else if (arg1 == 3) {
            this.field1056 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2398();
            this.field1053 = new short[var5];
            this.field1052 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1053[var6] = (short) arg0.method2548();
                this.field1052[var6] = (short) arg0.method2548();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2398();
            this.field1064 = new short[var7];
            this.field1054 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1064[var8] = (short) arg0.method2548();
                this.field1054[var8] = (short) arg0.method2548();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1055[arg1 - 60] = arg0.method2548();
        }
    }

    @ObfuscatedName("au.o(B)Z")
    public boolean method925() {
        if (this.field1051 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1051.length; var2++) {
            if (!Statics.field2723.method3141(this.field1051[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("au.g(B)Lcj;")
    public class104 method929() {
        if (this.field1051 == null) {
            return null;
        }
        class104[] var1 = new class104[this.field1051.length];
        for (int var2 = 0; var2 < this.field1051.length; var2++) {
            var1[var2] = class104.method2177(Statics.field2723, this.field1051[var2], 0);
        }
        class104 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class104(var1, var1.length);
        }
        if (this.field1053 != null) {
            for (int var4 = 0; var4 < this.field1053.length; var4++) {
                var3.method2171(this.field1053[var4], this.field1052[var4]);
            }
        }
        if (this.field1064 != null) {
            for (int var5 = 0; var5 < this.field1064.length; var5++) {
                var3.method2152(this.field1064[var5], this.field1054[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("au.l(I)Z")
    public boolean method931() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1055[var2] != -1 && !Statics.field2723.method3141(this.field1055[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("au.j(I)Lcj;")
    public class104 method933() {
        class104[] var1 = new class104[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1055[var3] != -1) {
                var1[var2++] = class104.method2177(Statics.field2723, this.field1055[var3], 0);
            }
        }
        class104 var4 = new class104(var1, var2);
        if (this.field1053 != null) {
            for (int var5 = 0; var5 < this.field1053.length; var5++) {
                var4.method2171(this.field1053[var5], this.field1052[var5]);
            }
        }
        if (this.field1064 != null) {
            for (int var6 = 0; var6 < this.field1064.length; var6++) {
                var4.method2152(this.field1064[var6], this.field1054[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aq.r(I)V")
    public static void method724() {
        field1048.method3553();
    }
}
