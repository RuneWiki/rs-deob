package deob;

@ObfuscatedName("am")
public class class48 extends class208 {

    @ObfuscatedName("am.w")
    public static class197 field1066 = new class197(64);

    @ObfuscatedName("am.e")
    public boolean field1067 = false;

    @ObfuscatedName("am.m(Ldj;B)V")
    public void method954(class123 arg0) {
        while (true) {
            int var2 = arg0.method2398();
            if (var2 == 0) {
                return;
            }
            this.method955(arg0, var2);
        }
    }

    @ObfuscatedName("am.w(Ldj;IS)V")
    public void method955(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1067 = true;
        }
    }
}
