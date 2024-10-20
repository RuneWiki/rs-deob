package deob;

@ObfuscatedName("ge")
public class class187 extends class130 {

    @ObfuscatedName("ge.y")
    public static class125 field2750 = new class125(64);

    @ObfuscatedName("ge.o")
    public int field2752 = 0;

    @ObfuscatedName("ge.k(Lfm;I)V")
    public void method3193(class161 arg0) {
        while (true) {
            int var2 = arg0.method2733();
            if (var2 == 0) {
                return;
            }
            this.method3194(arg0, var2);
        }
    }

    @ObfuscatedName("ge.y(Lfm;II)V")
    public void method3194(class161 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2752 = arg0.method2735();
        }
    }
}
