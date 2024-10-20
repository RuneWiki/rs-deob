package deob;

@ObfuscatedName("ap")
public class class40 extends class173 {

    @ObfuscatedName("ap.j")
    public static class169 field1029 = new class169(64);

    @ObfuscatedName("ap.w")
    public int field1028 = 0;

    @ObfuscatedName("ap.p(Ldv;B)V")
    public void method845(class126 arg0) {
        while (true) {
            int var2 = arg0.method2544();
            if (var2 == 0) {
                return;
            }
            this.method846(arg0, var2);
        }
    }

    @ObfuscatedName("ap.j(Ldv;IB)V")
    public void method846(class126 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1028 = arg0.method2489();
        }
    }
}
