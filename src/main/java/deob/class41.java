package deob;

@ObfuscatedName("ab")
public class class41 extends class174 {

    @ObfuscatedName("ab.c")
    public static class170 field1029 = new class170(64);

    @ObfuscatedName("ab.j")
    public int field1030 = 0;

    @ObfuscatedName("ab.b(Ldv;B)V")
    public void method871(class127 arg0) {
        while (true) {
            int var2 = arg0.method2416();
            if (var2 == 0) {
                return;
            }
            this.method881(arg0, var2);
        }
    }

    @ObfuscatedName("ab.c(Ldv;IB)V")
    public void method881(class127 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1030 = arg0.method2394();
        }
    }
}
