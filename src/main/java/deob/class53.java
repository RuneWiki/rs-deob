package deob;

@ObfuscatedName("bc")
public class class53 extends class208 {

    @ObfuscatedName("bc.h")
    public static class197 field1130 = new class197(64);

    @ObfuscatedName("bc.e")
    public char field1135;

    @ObfuscatedName("bc.g")
    public char field1133;

    @ObfuscatedName("bc.n")
    public String field1131 = "null";

    @ObfuscatedName("bc.u")
    public int field1139;

    @ObfuscatedName("bc.d")
    public int field1136 = 0;

    @ObfuscatedName("bc.l")
    public int[] field1132;

    @ObfuscatedName("bc.m")
    public int[] field1138;

    @ObfuscatedName("bc.j")
    public String[] field1134;

    @ObfuscatedName("fe.i(Lfu;I)V")
    public static void method3255(class171 arg0) {
        Statics.field1137 = arg0;
    }

    @ObfuscatedName("bc.h(Ldn;I)V")
    public void method1042(class123 arg0) {
        while (true) {
            int var2 = arg0.method2404();
            if (var2 == 0) {
                return;
            }
            this.method1041(arg0, var2);
        }
    }

    @ObfuscatedName("bc.e(Ldn;II)V")
    public void method1041(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1135 = (char) arg0.method2404();
        } else if (arg1 == 2) {
            this.field1133 = (char) arg0.method2404();
        } else if (arg1 == 3) {
            this.field1131 = arg0.method2412();
        } else if (arg1 == 4) {
            this.field1139 = arg0.method2409();
        } else if (arg1 == 5) {
            this.field1136 = arg0.method2406();
            this.field1132 = new int[this.field1136];
            this.field1134 = new String[this.field1136];
            for (int var3 = 0; var3 < this.field1136; var3++) {
                this.field1132[var3] = arg0.method2409();
                this.field1134[var3] = arg0.method2412();
            }
        } else if (arg1 == 6) {
            this.field1136 = arg0.method2406();
            this.field1132 = new int[this.field1136];
            this.field1138 = new int[this.field1136];
            for (int var4 = 0; var4 < this.field1136; var4++) {
                this.field1132[var4] = arg0.method2409();
                this.field1138[var4] = arg0.method2409();
            }
        }
    }
}
