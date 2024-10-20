package deob;

@ObfuscatedName("ae")
public class class41 extends class172 {

    @ObfuscatedName("ae.n")
    public static class168 field1028 = new class168(64);

    @ObfuscatedName("ae.j")
    public int field1029 = 0;

    @ObfuscatedName("ae.g(Ldu;I)V")
    public void method890(class126 arg0) {
        while (true) {
            int var2 = arg0.method2485();
            if (var2 == 0) {
                return;
            }
            this.method891(arg0, var2);
        }
    }

    @ObfuscatedName("ae.e(Ldu;IB)V")
    public void method891(class126 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1029 = arg0.method2487();
        }
    }
}
