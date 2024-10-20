package deob;

@ObfuscatedName("iw")
public class class255 extends class207 {

    @ObfuscatedName("iw.q")
    public static class201 field3253 = new class201(64);

    @ObfuscatedName("iw.b")
    public int field3254 = 0;

    @ObfuscatedName("iw.w(Lgy;I)V")
    public void method4434(class183 arg0) {
        while (true) {
            int var2 = arg0.method3436();
            if (var2 == 0) {
                return;
            }
            this.method4436(arg0, var2);
        }
    }

    @ObfuscatedName("iw.m(Lgy;IS)V")
    public void method4436(class183 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3254 = arg0.method3268();
        }
    }
}
