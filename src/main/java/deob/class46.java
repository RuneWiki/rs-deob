package deob;

@ObfuscatedName("at")
public class class46 extends class183 {

    @ObfuscatedName("at.v")
    public static class172 field1056 = new class172(64);

    @ObfuscatedName("at.o")
    public int field1060 = 0;

    @ObfuscatedName("bq.g(Let;B)V")
    public static void method1037(class147 arg0) {
        Statics.field1057 = arg0;
        Statics.field1055 = Statics.field1057.method2722(16);
    }

    @ObfuscatedName("at.s(Lde;I)V")
    public void method882(class107 arg0) {
        while (true) {
            int var2 = arg0.method2116();
            if (var2 == 0) {
                return;
            }
            this.method891(arg0, var2);
        }
    }

    @ObfuscatedName("at.v(Lde;II)V")
    public void method891(class107 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1060 = arg0.method2094();
        }
    }
}
