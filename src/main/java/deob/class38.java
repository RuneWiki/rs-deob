package deob;

@ObfuscatedName("aw")
public class class38 extends class174 {

    @ObfuscatedName("aw.m")
    public static class170 field944 = new class170(64);

    @ObfuscatedName("aw.v")
    public int field945;

    @ObfuscatedName("aw.r")
    public int field952;

    @ObfuscatedName("aw.n")
    public int field947;

    @ObfuscatedName("aw.g(Ldr;I)V")
    public void method802(class127 arg0) {
        while (true) {
            int var2 = arg0.method2414();
            if (var2 == 0) {
                return;
            }
            this.method801(arg0, var2);
        }
    }

    @ObfuscatedName("aw.m(Ldr;II)V")
    public void method801(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field945 = arg0.method2416();
            this.field952 = arg0.method2414();
            this.field947 = arg0.method2414();
        }
    }
}
