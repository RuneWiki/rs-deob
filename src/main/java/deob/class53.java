package deob;

@ObfuscatedName("bn")
public class class53 extends class208 {

    @ObfuscatedName("bn.q")
    public static class197 field1139 = new class197(64);

    @ObfuscatedName("bn.f")
    public char field1140;

    @ObfuscatedName("bn.c")
    public char field1141;

    @ObfuscatedName("bn.v")
    public String field1146 = "null";

    @ObfuscatedName("bn.j")
    public int field1144;

    @ObfuscatedName("bn.m")
    public int field1145 = 0;

    @ObfuscatedName("bn.y")
    public int[] field1151;

    @ObfuscatedName("bn.u")
    public int[] field1138;

    @ObfuscatedName("bn.h")
    public String[] field1147;

    @ObfuscatedName("bn.k(Lde;I)V")
    public void method1043(class123 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method1045(arg0, var2);
        }
    }

    @ObfuscatedName("bn.q(Lde;II)V")
    public void method1045(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1140 = (char) arg0.method2427();
        } else if (arg1 == 2) {
            this.field1141 = (char) arg0.method2427();
        } else if (arg1 == 3) {
            this.field1146 = arg0.method2435();
        } else if (arg1 == 4) {
            this.field1144 = arg0.method2432();
        } else if (arg1 == 5) {
            this.field1145 = arg0.method2547();
            this.field1151 = new int[this.field1145];
            this.field1147 = new String[this.field1145];
            for (int var3 = 0; var3 < this.field1145; var3++) {
                this.field1151[var3] = arg0.method2432();
                this.field1147[var3] = arg0.method2435();
            }
        } else if (arg1 == 6) {
            this.field1145 = arg0.method2547();
            this.field1151 = new int[this.field1145];
            this.field1138 = new int[this.field1145];
            for (int var4 = 0; var4 < this.field1145; var4++) {
                this.field1151[var4] = arg0.method2432();
                this.field1138[var4] = arg0.method2432();
            }
        }
    }
}
