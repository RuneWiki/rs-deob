package deob;

@ObfuscatedName("am")
public class class43 extends class182 {

    @ObfuscatedName("am.o")
    public static class171 field1000 = new class171(64);

    @ObfuscatedName("am.y")
    public char field1001;

    @ObfuscatedName("am.b")
    public char field1002;

    @ObfuscatedName("am.w")
    public String field1006 = "null";

    @ObfuscatedName("am.r")
    public int field1003;

    @ObfuscatedName("am.l")
    public int field1005 = 0;

    @ObfuscatedName("am.s")
    public int[] field1011;

    @ObfuscatedName("am.f")
    public int[] field1007;

    @ObfuscatedName("am.x")
    public String[] field1008;

    @ObfuscatedName("h.e(II)Lam;")
    public static class43 method125(int arg0) {
        class43 var1 = (class43) field1000.method3058((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1012.method2709(8, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method814(new class107(var2));
        }
        field1000.method3057(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.o(Ldl;B)V")
    public void method814(class107 arg0) {
        while (true) {
            int var2 = arg0.method2123();
            if (var2 == 0) {
                return;
            }
            this.method811(arg0, var2);
        }
    }

    @ObfuscatedName("am.y(Ldl;II)V")
    public void method811(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1001 = (char) arg0.method2123();
        } else if (arg1 == 2) {
            this.field1002 = (char) arg0.method2123();
        } else if (arg1 == 3) {
            this.field1006 = arg0.method2073();
        } else if (arg1 == 4) {
            this.field1003 = arg0.method2207();
        } else if (arg1 == 5) {
            this.field1005 = arg0.method2232();
            this.field1011 = new int[this.field1005];
            this.field1008 = new String[this.field1005];
            for (int var3 = 0; var3 < this.field1005; var3++) {
                this.field1011[var3] = arg0.method2207();
                this.field1008[var3] = arg0.method2073();
            }
        } else if (arg1 == 6) {
            this.field1005 = arg0.method2232();
            this.field1011 = new int[this.field1005];
            this.field1007 = new int[this.field1005];
            for (int var4 = 0; var4 < this.field1005; var4++) {
                this.field1011[var4] = arg0.method2207();
                this.field1007[var4] = arg0.method2207();
            }
        }
    }
}
