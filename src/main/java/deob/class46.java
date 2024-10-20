package deob;

@ObfuscatedName("ad")
public class class46 extends class182 {

    @ObfuscatedName("ad.i")
    public static class171 field1049 = new class171(64);

    @ObfuscatedName("ad.g")
    public int field1052 = 0;

    @ObfuscatedName("ad.e(Ldk;B)V")
    public void method880(class107 arg0) {
        while (true) {
            int var2 = arg0.method2226();
            if (var2 == 0) {
                return;
            }
            this.method879(arg0, var2);
        }
    }

    @ObfuscatedName("ad.v(Ldk;II)V")
    public void method879(class107 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1052 = arg0.method2152();
        }
    }

    @ObfuscatedName("ck.i(I)V")
    public static void method1857() {
        field1049.method3128();
    }
}
