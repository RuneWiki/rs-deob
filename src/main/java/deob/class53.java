package deob;

@ObfuscatedName("bc")
public class class53 extends class208 {

    @ObfuscatedName("bc.g")
    public static class197 field1158 = new class197(64);

    @ObfuscatedName("bc.r")
    public char field1156;

    @ObfuscatedName("bc.e")
    public char field1155;

    @ObfuscatedName("bc.h")
    public String field1152 = "null";

    @ObfuscatedName("bc.s")
    public int field1157;

    @ObfuscatedName("bc.k")
    public int field1160 = 0;

    @ObfuscatedName("bc.u")
    public int[] field1159;

    @ObfuscatedName("bc.n")
    public int[] field1161;

    @ObfuscatedName("bc.b")
    public String[] field1164;

    @ObfuscatedName("el.l(Lfp;B)V")
    public static void method2868(class171 arg0) {
        Statics.field1153 = arg0;
    }

    @ObfuscatedName("aj.g(II)Lbc;")
    public static class53 method818(int arg0) {
        class53 var1 = (class53) field1158.method3653((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1153.method3210(8, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1099(new class123(var2));
        }
        field1158.method3655(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bc.r(Ldc;I)V")
    public void method1099(class123 arg0) {
        while (true) {
            int var2 = arg0.method2490();
            if (var2 == 0) {
                return;
            }
            this.method1094(arg0, var2);
        }
    }

    @ObfuscatedName("bc.e(Ldc;II)V")
    public void method1094(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1156 = (char) arg0.method2490();
        } else if (arg1 == 2) {
            this.field1155 = (char) arg0.method2490();
        } else if (arg1 == 3) {
            this.field1152 = arg0.method2520();
        } else if (arg1 == 4) {
            this.field1157 = arg0.method2477();
        } else if (arg1 == 5) {
            this.field1160 = arg0.method2492();
            this.field1159 = new int[this.field1160];
            this.field1164 = new String[this.field1160];
            for (int var3 = 0; var3 < this.field1160; var3++) {
                this.field1159[var3] = arg0.method2477();
                this.field1164[var3] = arg0.method2520();
            }
        } else if (arg1 == 6) {
            this.field1160 = arg0.method2492();
            this.field1159 = new int[this.field1160];
            this.field1161 = new int[this.field1160];
            for (int var4 = 0; var4 < this.field1160; var4++) {
                this.field1159[var4] = arg0.method2477();
                this.field1161[var4] = arg0.method2477();
            }
        }
    }
}
