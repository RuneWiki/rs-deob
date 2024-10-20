package deob;

@ObfuscatedName("au")
public class class44 extends class182 {

    @ObfuscatedName("au.v")
    public static class171 field993 = new class171(64);

    @ObfuscatedName("au.i")
    public int field986 = 0;

    @ObfuscatedName("au.e(Ldk;I)V")
    public void method811(class107 arg0) {
        while (true) {
            int var2 = arg0.method2226();
            if (var2 == 0) {
                return;
            }
            this.method812(arg0, var2);
        }
    }

    @ObfuscatedName("au.v(Ldk;II)V")
    public void method812(class107 arg0, int arg1) {
        if (arg1 == 2) {
            this.field986 = arg0.method2152();
        }
    }
}
