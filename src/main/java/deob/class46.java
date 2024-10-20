package deob;

@ObfuscatedName("ae")
public class class46 extends class182 {

    @ObfuscatedName("ae.i")
    public static class171 field1058 = new class171(64);

    @ObfuscatedName("ae.p")
    public int field1056 = 0;

    @ObfuscatedName("ae.t(Ldg;I)V")
    public void method880(class107 arg0) {
        while (true) {
            int var2 = arg0.method2118();
            if (var2 == 0) {
                return;
            }
            this.method885(arg0, var2);
        }
    }

    @ObfuscatedName("ae.o(Ldg;II)V")
    public void method885(class107 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1056 = arg0.method2120();
        }
    }

    @ObfuscatedName("co.i(S)V")
    public static void method1859() {
        field1058.method3104();
    }
}
