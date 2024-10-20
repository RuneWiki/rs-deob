package deob;

@ObfuscatedName("br")
public class class53 extends class208 {

    @ObfuscatedName("br.w")
    public static class197 field1144 = new class197(64);

    @ObfuscatedName("br.e")
    public char field1148;

    @ObfuscatedName("br.o")
    public char field1146;

    @ObfuscatedName("br.g")
    public String field1147 = "null";

    @ObfuscatedName("br.l")
    public int field1153;

    @ObfuscatedName("br.j")
    public int field1143 = 0;

    @ObfuscatedName("br.r")
    public int[] field1154;

    @ObfuscatedName("br.x")
    public int[] field1151;

    @ObfuscatedName("br.k")
    public String[] field1152;

    @ObfuscatedName("ax.m(Lfa;I)V")
    public static void method690(class171 arg0) {
        Statics.field1150 = arg0;
    }

    @ObfuscatedName("br.w(Ldj;B)V")
    public void method1065(class123 arg0) {
        while (true) {
            int var2 = arg0.method2398();
            if (var2 == 0) {
                return;
            }
            this.method1066(arg0, var2);
        }
    }

    @ObfuscatedName("br.e(Ldj;II)V")
    public void method1066(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1148 = (char) arg0.method2398();
        } else if (arg1 == 2) {
            this.field1146 = (char) arg0.method2398();
        } else if (arg1 == 3) {
            this.field1147 = arg0.method2422();
        } else if (arg1 == 4) {
            this.field1153 = arg0.method2419();
        } else if (arg1 == 5) {
            this.field1143 = arg0.method2548();
            this.field1154 = new int[this.field1143];
            this.field1152 = new String[this.field1143];
            for (int var3 = 0; var3 < this.field1143; var3++) {
                this.field1154[var3] = arg0.method2419();
                this.field1152[var3] = arg0.method2422();
            }
        } else if (arg1 == 6) {
            this.field1143 = arg0.method2548();
            this.field1154 = new int[this.field1143];
            this.field1151 = new int[this.field1143];
            for (int var4 = 0; var4 < this.field1143; var4++) {
                this.field1154[var4] = arg0.method2419();
                this.field1151[var4] = arg0.method2419();
            }
        }
    }
}
