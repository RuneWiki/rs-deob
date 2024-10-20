package deob;

@ObfuscatedName("at")
public class class44 extends class182 {

    @ObfuscatedName("at.o")
    public static class171 field993 = new class171(64);

    @ObfuscatedName("at.i")
    public int field1001 = 0;

    @ObfuscatedName("at.t(Ldg;I)V")
    public void method821(class107 arg0) {
        while (true) {
            int var2 = arg0.method2118();
            if (var2 == 0) {
                return;
            }
            this.method820(arg0, var2);
        }
    }

    @ObfuscatedName("at.o(Ldg;II)V")
    public void method820(class107 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1001 = arg0.method2120();
        }
    }
}
