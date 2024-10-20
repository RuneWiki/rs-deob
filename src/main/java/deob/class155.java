package deob;

@ObfuscatedName("eq")
public class class155 extends class365 {

    @ObfuscatedName("eq.w")
    public static class236 field1643 = new class236(64);

    @ObfuscatedName("eq.s")
    public boolean field1645 = false;

    @ObfuscatedName("eq.w(Lop;I)V")
    public void method2716(class401 arg0) {
        while (true) {
            int var2 = arg0.method6240();
            if (var2 == 0) {
                return;
            }
            this.method2717(arg0, var2);
        }
    }

    @ObfuscatedName("eq.s(Lop;II)V")
    public void method2717(class401 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1645 = true;
        }
    }
}
