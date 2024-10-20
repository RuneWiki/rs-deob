package deob;

@ObfuscatedName("av")
public class class41 extends class174 {

    @ObfuscatedName("av.r")
    public static class170 field1014 = new class170(64);

    @ObfuscatedName("av.u")
    public int field1017 = 0;

    @ObfuscatedName("av.a(Ldf;I)V")
    public void method824(class126 arg0) {
        while (true) {
            int var2 = arg0.method2481();
            if (var2 == 0) {
                return;
            }
            this.method823(arg0, var2);
        }
    }

    @ObfuscatedName("av.r(Ldf;IB)V")
    public void method823(class126 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1017 = arg0.method2373();
        }
    }
}
