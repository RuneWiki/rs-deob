package deob;

@ObfuscatedName("ak")
public class class49 extends class204 {

    @ObfuscatedName("ak.f")
    public static class193 field1077 = new class193(64);

    @ObfuscatedName("ak.i")
    public char field1083;

    @ObfuscatedName("ak.h")
    public char field1070;

    @ObfuscatedName("ak.q")
    public String field1084 = "null";

    @ObfuscatedName("ak.u")
    public int field1075;

    @ObfuscatedName("ak.m")
    public int field1072 = 0;

    @ObfuscatedName("ak.y")
    public int[] field1073;

    @ObfuscatedName("ak.p")
    public int[] field1078;

    @ObfuscatedName("ak.t")
    public String[] field1079;

    @ObfuscatedName("ak.o(Ldc;I)V")
    public void method943(class119 arg0) {
        while (true) {
            int var2 = arg0.method2290();
            if (var2 == 0) {
                return;
            }
            this.method944(arg0, var2);
        }
    }

    @ObfuscatedName("ak.f(Ldc;II)V")
    public void method944(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1083 = (char) arg0.method2290();
        } else if (arg1 == 2) {
            this.field1070 = (char) arg0.method2290();
        } else if (arg1 == 3) {
            this.field1084 = arg0.method2344();
        } else if (arg1 == 4) {
            this.field1075 = arg0.method2295();
        } else if (arg1 == 5) {
            this.field1072 = arg0.method2292();
            this.field1073 = new int[this.field1072];
            this.field1079 = new String[this.field1072];
            for (int var3 = 0; var3 < this.field1072; var3++) {
                this.field1073[var3] = arg0.method2295();
                this.field1079[var3] = arg0.method2344();
            }
        } else if (arg1 == 6) {
            this.field1072 = arg0.method2292();
            this.field1073 = new int[this.field1072];
            this.field1078 = new int[this.field1072];
            for (int var4 = 0; var4 < this.field1072; var4++) {
                this.field1073[var4] = arg0.method2295();
                this.field1078[var4] = arg0.method2295();
            }
        }
    }
}
