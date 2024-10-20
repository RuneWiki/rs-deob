package deob;

@ObfuscatedName("aq")
public class class41 extends class187 {

    @ObfuscatedName("aq.k")
    public static class176 field950 = new class176(64);

    @ObfuscatedName("aq.h")
    public int field945 = -1;

    @ObfuscatedName("aq.p")
    public int[] field944;

    @ObfuscatedName("aq.n")
    public short[] field953;

    @ObfuscatedName("aq.o")
    public short[] field948;

    @ObfuscatedName("aq.g")
    public short[] field949;

    @ObfuscatedName("aq.z")
    public short[] field959;

    @ObfuscatedName("aq.t")
    public int[] field951 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aq.y")
    public boolean field952 = false;

    @ObfuscatedName("c.b(Lex;Lex;B)V")
    public static void method498(class151 arg0, class151 arg1) {
        Statics.field958 = arg0;
        Statics.field942 = arg1;
        Statics.field3027 = Statics.field958.method2772(3);
    }

    @ObfuscatedName("ak.e(IB)Laq;")
    public static class41 method635(int arg0) {
        class41 var1 = (class41) field950.method3218((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field958.method2761(3, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method774(new class110(var2));
        }
        field950.method3220(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.i(Ldc;I)V")
    public void method774(class110 arg0) {
        while (true) {
            int var2 = arg0.method2142();
            if (var2 == 0) {
                return;
            }
            this.method775(arg0, var2);
        }
    }

    @ObfuscatedName("aq.k(Ldc;IB)V")
    public void method775(class110 arg0, int arg1) {
        if (arg1 == 1) {
            this.field945 = arg0.method2142();
        } else if (arg1 == 2) {
            int var3 = arg0.method2142();
            this.field944 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field944[var4] = arg0.method2292();
            }
        } else if (arg1 == 3) {
            this.field952 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2142();
            this.field953 = new short[var5];
            this.field948 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field953[var6] = (short) arg0.method2292();
                this.field948[var6] = (short) arg0.method2292();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2142();
            this.field949 = new short[var7];
            this.field959 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field949[var8] = (short) arg0.method2292();
                this.field959[var8] = (short) arg0.method2292();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field951[arg1 - 60] = arg0.method2292();
        }
    }

    @ObfuscatedName("aq.h(B)Z")
    public boolean method794() {
        if (this.field944 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field944.length; var2++) {
            if (!Statics.field942.method2824(this.field944[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aq.p(I)Lcs;")
    public class94 method777() {
        if (this.field944 == null) {
            return null;
        }
        class94[] var1 = new class94[this.field944.length];
        for (int var2 = 0; var2 < this.field944.length; var2++) {
            var1[var2] = class94.method1874(Statics.field942, this.field944[var2], 0);
        }
        class94 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class94(var1, var1.length);
        }
        if (this.field953 != null) {
            for (int var4 = 0; var4 < this.field953.length; var4++) {
                var3.method1879(this.field953[var4], this.field948[var4]);
            }
        }
        if (this.field949 != null) {
            for (int var5 = 0; var5 < this.field949.length; var5++) {
                var3.method1892(this.field949[var5], this.field959[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aq.n(B)Z")
    public boolean method778() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field951[var2] != -1 && !Statics.field942.method2824(this.field951[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aq.o(I)Lcs;")
    public class94 method779() {
        class94[] var1 = new class94[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field951[var3] != -1) {
                var1[var2++] = class94.method1874(Statics.field942, this.field951[var3], 0);
            }
        }
        class94 var4 = new class94(var1, var2);
        if (this.field953 != null) {
            for (int var5 = 0; var5 < this.field953.length; var5++) {
                var4.method1879(this.field953[var5], this.field948[var5]);
            }
        }
        if (this.field949 != null) {
            for (int var6 = 0; var6 < this.field949.length; var6++) {
                var4.method1892(this.field949[var6], this.field959[var6]);
            }
        }
        return var4;
    }
}
