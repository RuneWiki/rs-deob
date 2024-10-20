package deob;

@ObfuscatedName("bf")
public class class53 extends class208 {

    @ObfuscatedName("bf.r")
    public static class197 field1120 = new class197(64);

    @ObfuscatedName("bf.j")
    public char field1121;

    @ObfuscatedName("bf.z")
    public char field1122;

    @ObfuscatedName("bf.i")
    public String field1133 = "null";

    @ObfuscatedName("bf.b")
    public int field1124;

    @ObfuscatedName("bf.l")
    public int field1119 = 0;

    @ObfuscatedName("bf.m")
    public int[] field1126;

    @ObfuscatedName("bf.p")
    public int[] field1129;

    @ObfuscatedName("bf.f")
    public String[] field1123;

    @ObfuscatedName("y.x(Lfp;I)V")
    public static void method550(class171 arg0) {
        Statics.field1128 = arg0;
    }

    @ObfuscatedName("dh.r(II)Lbf;")
    public static class53 method2328(int arg0) {
        class53 var1 = (class53) field1120.method3533((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1128.method3079(8, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1026(new class123(var2));
        }
        field1120.method3535(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bf.j(Ldp;I)V")
    public void method1026(class123 arg0) {
        while (true) {
            int var2 = arg0.method2408();
            if (var2 == 0) {
                return;
            }
            this.method1027(arg0, var2);
        }
    }

    @ObfuscatedName("bf.z(Ldp;II)V")
    public void method1027(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1121 = (char) arg0.method2408();
        } else if (arg1 == 2) {
            this.field1122 = (char) arg0.method2408();
        } else if (arg1 == 3) {
            this.field1133 = arg0.method2626();
        } else if (arg1 == 4) {
            this.field1124 = arg0.method2413();
        } else if (arg1 == 5) {
            this.field1119 = arg0.method2403();
            this.field1126 = new int[this.field1119];
            this.field1123 = new String[this.field1119];
            for (int var3 = 0; var3 < this.field1119; var3++) {
                this.field1126[var3] = arg0.method2413();
                this.field1123[var3] = arg0.method2626();
            }
        } else if (arg1 == 6) {
            this.field1119 = arg0.method2403();
            this.field1126 = new int[this.field1119];
            this.field1129 = new int[this.field1119];
            for (int var4 = 0; var4 < this.field1119; var4++) {
                this.field1126[var4] = arg0.method2413();
                this.field1129[var4] = arg0.method2413();
            }
        }
    }
}
