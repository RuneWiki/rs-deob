package deob;

@ObfuscatedName("bc")
public class class53 extends class208 {

    @ObfuscatedName("bc.e")
    public static class197 field1128 = new class197(64);

    @ObfuscatedName("bc.n")
    public char field1130;

    @ObfuscatedName("bc.t")
    public char field1127;

    @ObfuscatedName("bc.v")
    public String field1126 = "null";

    @ObfuscatedName("bc.b")
    public int field1131;

    @ObfuscatedName("bc.m")
    public int field1136 = 0;

    @ObfuscatedName("bc.k")
    public int[] field1133;

    @ObfuscatedName("bc.c")
    public int[] field1134;

    @ObfuscatedName("bc.w")
    public String[] field1135;

    @ObfuscatedName("az.f(Lfj;I)V")
    public static void method900(class171 arg0) {
        Statics.field1132 = arg0;
    }

    @ObfuscatedName("u.e(IS)Lbc;")
    public static class53 method145(int arg0) {
        class53 var1 = (class53) field1128.method3569((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1132.method3107(8, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1051(new class123(var2));
        }
        field1128.method3571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bc.n(Ldx;B)V")
    public void method1051(class123 arg0) {
        while (true) {
            int var2 = arg0.method2522();
            if (var2 == 0) {
                return;
            }
            this.method1053(arg0, var2);
        }
    }

    @ObfuscatedName("bc.t(Ldx;II)V")
    public void method1053(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1130 = (char) arg0.method2522();
        } else if (arg1 == 2) {
            this.field1127 = (char) arg0.method2522();
        } else if (arg1 == 3) {
            this.field1126 = arg0.method2407();
        } else if (arg1 == 4) {
            this.field1131 = arg0.method2404();
        } else if (arg1 == 5) {
            this.field1136 = arg0.method2401();
            this.field1133 = new int[this.field1136];
            this.field1135 = new String[this.field1136];
            for (int var3 = 0; var3 < this.field1136; var3++) {
                this.field1133[var3] = arg0.method2404();
                this.field1135[var3] = arg0.method2407();
            }
        } else if (arg1 == 6) {
            this.field1136 = arg0.method2401();
            this.field1133 = new int[this.field1136];
            this.field1134 = new int[this.field1136];
            for (int var4 = 0; var4 < this.field1136; var4++) {
                this.field1133[var4] = arg0.method2404();
                this.field1134[var4] = arg0.method2404();
            }
        }
    }
}
