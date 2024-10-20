package deob;

@ObfuscatedName("js")
public class class278 extends class346 {

    @ObfuscatedName("js.o")
    public static class199 field3396 = new class199(64);

    @ObfuscatedName("js.u")
    public int field3397 = 0;

    @ObfuscatedName("js.o(Lnu;B)V")
    public void method4319(class382 arg0) {
        while (true) {
            int var2 = arg0.method5856();
            if (var2 == 0) {
                return;
            }
            this.method4320(arg0, var2);
        }
    }

    @ObfuscatedName("js.u(Lnu;IB)V")
    public void method4320(class382 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3397 = arg0.method5858();
        }
    }
}
