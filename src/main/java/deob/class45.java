package deob;

@ObfuscatedName("am")
public class class45 extends class204 {

    @ObfuscatedName("am.h")
    public static class193 field1054 = new class193(64);

    @ObfuscatedName("am.a")
    public int field1044 = -1;

    @ObfuscatedName("am.s")
    public int[] field1045;

    @ObfuscatedName("am.p")
    public short[] field1046;

    @ObfuscatedName("am.r")
    public short[] field1047;

    @ObfuscatedName("am.k")
    public short[] field1042;

    @ObfuscatedName("am.d")
    public short[] field1049;

    @ObfuscatedName("am.n")
    public int[] field1050 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("am.z")
    public boolean field1043 = false;

    @ObfuscatedName("client.i(II)Lam;")
    public static class45 method515(int arg0) {
        class45 var1 = (class45) field1054.method3467((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1052.method3080(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method851(new class119(var2));
        }
        field1054.method3466(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.v(Ldj;B)V")
    public void method851(class119 arg0) {
        while (true) {
            int var2 = arg0.method2310();
            if (var2 == 0) {
                return;
            }
            this.method852(arg0, var2);
        }
    }

    @ObfuscatedName("am.f(Ldj;IB)V")
    public void method852(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1044 = arg0.method2310();
        } else if (arg1 == 2) {
            int var3 = arg0.method2310();
            this.field1045 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1045[var4] = arg0.method2312();
            }
        } else if (arg1 == 3) {
            this.field1043 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2310();
            this.field1046 = new short[var5];
            this.field1047 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1046[var6] = (short) arg0.method2312();
                this.field1047[var6] = (short) arg0.method2312();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2310();
            this.field1042 = new short[var7];
            this.field1049 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1042[var8] = (short) arg0.method2312();
                this.field1049[var8] = (short) arg0.method2312();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1050[arg1 - 60] = arg0.method2312();
        }
    }

    @ObfuscatedName("am.h(B)Z")
    public boolean method861() {
        if (this.field1045 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1045.length; var2++) {
            if (!Statics.field1041.method3057(this.field1045[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("am.a(B)Lcg;")
    public class100 method854() {
        if (this.field1045 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field1045.length];
        for (int var2 = 0; var2 < this.field1045.length; var2++) {
            var1[var2] = class100.method2014(Statics.field1041, this.field1045[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field1046 != null) {
            for (int var4 = 0; var4 < this.field1046.length; var4++) {
                var3.method2019(this.field1046[var4], this.field1047[var4]);
            }
        }
        if (this.field1042 != null) {
            for (int var5 = 0; var5 < this.field1042.length; var5++) {
                var3.method2029(this.field1042[var5], this.field1049[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("am.s(I)Z")
    public boolean method855() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1050[var2] != -1 && !Statics.field1041.method3057(this.field1050[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("am.p(B)Lcg;")
    public class100 method857() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1050[var3] != -1) {
                var1[var2++] = class100.method2014(Statics.field1041, this.field1050[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field1046 != null) {
            for (int var5 = 0; var5 < this.field1046.length; var5++) {
                var4.method2019(this.field1046[var5], this.field1047[var5]);
            }
        }
        if (this.field1042 != null) {
            for (int var6 = 0; var6 < this.field1042.length; var6++) {
                var4.method2029(this.field1042[var6], this.field1049[var6]);
            }
        }
        return var4;
    }
}
