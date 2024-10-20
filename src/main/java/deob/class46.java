package deob;

@ObfuscatedName("am")
public class class46 extends class195 {

    @ObfuscatedName("am.d")
    public static class184 field1035 = new class184(64);

    @ObfuscatedName("am.z")
    public int field1036 = 0;

    @ObfuscatedName("am.n(Ldl;I)V")
    public void method890(class111 arg0) {
        while (true) {
            int var2 = arg0.method2228();
            if (var2 == 0) {
                return;
            }
            this.method887(arg0, var2);
        }
    }

    @ObfuscatedName("am.d(Ldl;II)V")
    public void method887(class111 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1036 = arg0.method2231();
        }
    }
}
