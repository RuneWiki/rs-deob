package deob;

@ObfuscatedName("bw")
public class class53 extends class208 {

    @ObfuscatedName("bw.l")
    public static class197 field1146 = new class197(64);

    @ObfuscatedName("bw.c")
    public char field1156;

    @ObfuscatedName("bw.h")
    public char field1148;

    @ObfuscatedName("bw.r")
    public String field1149 = "null";

    @ObfuscatedName("bw.a")
    public int field1147;

    @ObfuscatedName("bw.b")
    public int field1151 = 0;

    @ObfuscatedName("bw.u")
    public int[] field1154;

    @ObfuscatedName("bw.o")
    public int[] field1145;

    @ObfuscatedName("bw.p")
    public String[] field1158;

    @ObfuscatedName("bw.e(Ldd;B)V")
    public void method1093(class123 arg0) {
        while (true) {
            int var2 = arg0.method2464();
            if (var2 == 0) {
                return;
            }
            this.method1094(arg0, var2);
        }
    }

    @ObfuscatedName("bw.l(Ldd;IB)V")
    public void method1094(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1156 = (char) arg0.method2464();
        } else if (arg1 == 2) {
            this.field1148 = (char) arg0.method2464();
        } else if (arg1 == 3) {
            this.field1149 = arg0.method2471();
        } else if (arg1 == 4) {
            this.field1147 = arg0.method2468();
        } else if (arg1 == 5) {
            this.field1151 = arg0.method2466();
            this.field1154 = new int[this.field1151];
            this.field1158 = new String[this.field1151];
            for (int var3 = 0; var3 < this.field1151; var3++) {
                this.field1154[var3] = arg0.method2468();
                this.field1158[var3] = arg0.method2471();
            }
        } else if (arg1 == 6) {
            this.field1151 = arg0.method2466();
            this.field1154 = new int[this.field1151];
            this.field1145 = new int[this.field1151];
            for (int var4 = 0; var4 < this.field1151; var4++) {
                this.field1154[var4] = arg0.method2468();
                this.field1145[var4] = arg0.method2468();
            }
        }
    }
}
