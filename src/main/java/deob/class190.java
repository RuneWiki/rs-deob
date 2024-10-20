package deob;

@ObfuscatedName("gn")
public class class190 extends class130 {

    @ObfuscatedName("gn.c")
    public static class125 field2789 = new class125(64);

    @ObfuscatedName("gn.f")
    public boolean field2790 = false;

    @ObfuscatedName("gn.s(Lea;I)V")
    public void method3145(class154 arg0) {
        while (true) {
            int var2 = arg0.method2545();
            if (var2 == 0) {
                return;
            }
            this.method3146(arg0, var2);
        }
    }

    @ObfuscatedName("gn.c(Lea;IB)V")
    public void method3146(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2790 = true;
        }
    }
}
