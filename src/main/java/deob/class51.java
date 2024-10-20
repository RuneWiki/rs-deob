package deob;

@ObfuscatedName("an")
public class class51 extends class208 {

    @ObfuscatedName("an.e")
    public static class197 field1098 = new class197(64);

    @ObfuscatedName("an.n")
    public int field1093;

    @ObfuscatedName("an.t")
    public int field1095;

    @ObfuscatedName("an.v")
    public int field1094;

    @ObfuscatedName("an.e(Ldx;B)V")
    public void method995(class123 arg0) {
        while (true) {
            int var2 = arg0.method2522();
            if (var2 == 0) {
                return;
            }
            this.method996(arg0, var2);
        }
    }

    @ObfuscatedName("an.n(Ldx;II)V")
    public void method996(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1093 = arg0.method2401();
            this.field1095 = arg0.method2522();
            this.field1094 = arg0.method2522();
        }
    }

    @ObfuscatedName("dn.t(I)V")
    public static void method2323() {
        field1098.method3572();
    }
}
