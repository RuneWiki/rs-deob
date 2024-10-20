package deob;

@ObfuscatedName("au")
public class class47 extends class208 {

    @ObfuscatedName("au.r")
    public static class197 field1052 = new class197(64);

    @ObfuscatedName("au.z")
    public int field1058 = -1;

    @ObfuscatedName("au.t")
    public int[] field1053;

    @ObfuscatedName("au.n")
    public short[] field1054;

    @ObfuscatedName("au.i")
    public short[] field1056;

    @ObfuscatedName("au.g")
    public short[] field1062;

    @ObfuscatedName("au.m")
    public short[] field1057;

    @ObfuscatedName("au.k")
    public int[] field1059 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("au.x")
    public boolean field1049 = false;

    @ObfuscatedName("dq.a(II)Lau;")
    public static class47 method2689(int arg0) {
        class47 var1 = (class47) field1052.method3544((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1060.method3117(3, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method930(new class123(var2));
        }
        field1052.method3546(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.d(Ldb;B)V")
    public void method930(class123 arg0) {
        while (true) {
            int var2 = arg0.method2395();
            if (var2 == 0) {
                return;
            }
            this.method941(arg0, var2);
        }
    }

    @ObfuscatedName("au.v(Ldb;II)V")
    public void method941(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1058 = arg0.method2395();
        } else if (arg1 == 2) {
            int var3 = arg0.method2395();
            this.field1053 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1053[var4] = arg0.method2584();
            }
        } else if (arg1 == 3) {
            this.field1049 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2395();
            this.field1054 = new short[var5];
            this.field1056 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1054[var6] = (short) arg0.method2584();
                this.field1056[var6] = (short) arg0.method2584();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2395();
            this.field1062 = new short[var7];
            this.field1057 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1062[var8] = (short) arg0.method2584();
                this.field1057[var8] = (short) arg0.method2584();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1059[arg1 - 60] = arg0.method2584();
        }
    }

    @ObfuscatedName("au.r(B)Z")
    public boolean method932() {
        if (this.field1053 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1053.length; var2++) {
            if (!Statics.field1050.method3159(this.field1053[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("au.z(S)Lcd;")
    public class104 method933() {
        if (this.field1053 == null) {
            return null;
        }
        class104[] var1 = new class104[this.field1053.length];
        for (int var2 = 0; var2 < this.field1053.length; var2++) {
            var1[var2] = class104.method2159(Statics.field1050, this.field1053[var2], 0);
        }
        class104 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class104(var1, var1.length);
        }
        if (this.field1054 != null) {
            for (int var4 = 0; var4 < this.field1054.length; var4++) {
                var3.method2114(this.field1054[var4], this.field1056[var4]);
            }
        }
        if (this.field1062 != null) {
            for (int var5 = 0; var5 < this.field1062.length; var5++) {
                var3.method2115(this.field1062[var5], this.field1057[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("au.t(I)Z")
    public boolean method948() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1059[var2] != -1 && !Statics.field1050.method3159(this.field1059[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("au.n(I)Lcd;")
    public class104 method950() {
        class104[] var1 = new class104[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1059[var3] != -1) {
                var1[var2++] = class104.method2159(Statics.field1050, this.field1059[var3], 0);
            }
        }
        class104 var4 = new class104(var1, var2);
        if (this.field1054 != null) {
            for (int var5 = 0; var5 < this.field1054.length; var5++) {
                var4.method2114(this.field1054[var5], this.field1056[var5]);
            }
        }
        if (this.field1062 != null) {
            for (int var6 = 0; var6 < this.field1062.length; var6++) {
                var4.method2115(this.field1062[var6], this.field1057[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ai.i(I)V")
    public static void method906() {
        field1052.method3552();
    }
}
