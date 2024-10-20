package deob;

@ObfuscatedName("ab")
public class class47 extends class208 {

    @ObfuscatedName("ab.g")
    public static class197 field1048 = new class197(64);

    @ObfuscatedName("ab.n")
    public int field1049 = -1;

    @ObfuscatedName("ab.u")
    public int[] field1050;

    @ObfuscatedName("ab.d")
    public short[] field1051;

    @ObfuscatedName("ab.l")
    public short[] field1052;

    @ObfuscatedName("ab.m")
    public short[] field1057;

    @ObfuscatedName("ab.j")
    public short[] field1054;

    @ObfuscatedName("ab.y")
    public int[] field1046 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ab.s")
    public boolean field1061 = false;

    @ObfuscatedName("h.i(IB)Lab;")
    public static class47 method12(int arg0) {
        class47 var1 = (class47) field1048.method3541((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1055.method3086(3, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method924(new class123(var2));
        }
        field1048.method3532(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.h(Ldn;I)V")
    public void method924(class123 arg0) {
        while (true) {
            int var2 = arg0.method2404();
            if (var2 == 0) {
                return;
            }
            this.method925(arg0, var2);
        }
    }

    @ObfuscatedName("ab.e(Ldn;II)V")
    public void method925(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1049 = arg0.method2404();
        } else if (arg1 == 2) {
            int var3 = arg0.method2404();
            this.field1050 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1050[var4] = arg0.method2406();
            }
        } else if (arg1 == 3) {
            this.field1061 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2404();
            this.field1051 = new short[var5];
            this.field1052 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1051[var6] = (short) arg0.method2406();
                this.field1052[var6] = (short) arg0.method2406();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2404();
            this.field1057 = new short[var7];
            this.field1054 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1057[var8] = (short) arg0.method2406();
                this.field1054[var8] = (short) arg0.method2406();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1046[arg1 - 60] = arg0.method2406();
        }
    }

    @ObfuscatedName("ab.g(I)Z")
    public boolean method931() {
        if (this.field1050 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1050.length; var2++) {
            if (!Statics.field1047.method3085(this.field1050[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ab.n(I)Lco;")
    public class104 method917() {
        if (this.field1050 == null) {
            return null;
        }
        class104[] var1 = new class104[this.field1050.length];
        for (int var2 = 0; var2 < this.field1050.length; var2++) {
            var1[var2] = class104.method2115(Statics.field1047, this.field1050[var2], 0);
        }
        class104 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class104(var1, var1.length);
        }
        if (this.field1051 != null) {
            for (int var4 = 0; var4 < this.field1051.length; var4++) {
                var3.method2185(this.field1051[var4], this.field1052[var4]);
            }
        }
        if (this.field1057 != null) {
            for (int var5 = 0; var5 < this.field1057.length; var5++) {
                var3.method2128(this.field1057[var5], this.field1054[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ab.u(B)Z")
    public boolean method934() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1046[var2] != -1 && !Statics.field1047.method3085(this.field1046[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ab.d(B)Lco;")
    public class104 method919() {
        class104[] var1 = new class104[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1046[var3] != -1) {
                var1[var2++] = class104.method2115(Statics.field1047, this.field1046[var3], 0);
            }
        }
        class104 var4 = new class104(var1, var2);
        if (this.field1051 != null) {
            for (int var5 = 0; var5 < this.field1051.length; var5++) {
                var4.method2185(this.field1051[var5], this.field1052[var5]);
            }
        }
        if (this.field1057 != null) {
            for (int var6 = 0; var6 < this.field1057.length; var6++) {
                var4.method2128(this.field1057[var6], this.field1054[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ar.l(B)V")
    public static void method729() {
        field1048.method3533();
    }
}
