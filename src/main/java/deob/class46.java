package deob;

@ObfuscatedName("av")
public class class46 extends class195 {

    @ObfuscatedName("av.k")
    public static class184 field1036 = new class184(64);

    @ObfuscatedName("av.e")
    public int field1037 = 0;

    @ObfuscatedName("aq.p(Lff;I)V")
    public static void method625(class158 arg0) {
        Statics.field1039 = arg0;
    }

    @ObfuscatedName("av.k(Lde;B)V")
    public void method872(class111 arg0) {
        while (true) {
            int var2 = arg0.method2314();
            if (var2 == 0) {
                return;
            }
            this.method873(arg0, var2);
        }
    }

    @ObfuscatedName("av.e(Lde;II)V")
    public void method873(class111 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1037 = arg0.method2177();
        }
    }
}
