package deob;

@ObfuscatedName("bg")
public class class53 extends class208 {

    @ObfuscatedName("bg.d")
    public static class197 field1150 = new class197(64);

    @ObfuscatedName("bg.v")
    public char field1145;

    @ObfuscatedName("bg.r")
    public char field1148;

    @ObfuscatedName("bg.z")
    public String field1149 = "null";

    @ObfuscatedName("bg.t")
    public int field1154;

    @ObfuscatedName("bg.n")
    public int field1151 = 0;

    @ObfuscatedName("bg.i")
    public int[] field1152;

    @ObfuscatedName("bg.g")
    public int[] field1153;

    @ObfuscatedName("bg.m")
    public String[] field1146;

    @ObfuscatedName("bg.a(Ldb;B)V")
    public void method1068(class123 arg0) {
        while (true) {
            int var2 = arg0.method2395();
            if (var2 == 0) {
                return;
            }
            this.method1069(arg0, var2);
        }
    }

    @ObfuscatedName("bg.d(Ldb;II)V")
    public void method1069(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1145 = (char) arg0.method2395();
        } else if (arg1 == 2) {
            this.field1148 = (char) arg0.method2395();
        } else if (arg1 == 3) {
            this.field1149 = arg0.method2397();
        } else if (arg1 == 4) {
            this.field1154 = arg0.method2400();
        } else if (arg1 == 5) {
            this.field1151 = arg0.method2584();
            this.field1152 = new int[this.field1151];
            this.field1146 = new String[this.field1151];
            for (int var3 = 0; var3 < this.field1151; var3++) {
                this.field1152[var3] = arg0.method2400();
                this.field1146[var3] = arg0.method2397();
            }
        } else if (arg1 == 6) {
            this.field1151 = arg0.method2584();
            this.field1152 = new int[this.field1151];
            this.field1153 = new int[this.field1151];
            for (int var4 = 0; var4 < this.field1151; var4++) {
                this.field1152[var4] = arg0.method2400();
                this.field1153[var4] = arg0.method2400();
            }
        }
    }
}
