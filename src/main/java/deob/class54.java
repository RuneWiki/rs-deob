package deob;

@ObfuscatedName("bi")
public class class54 extends class208 {

    @ObfuscatedName("bi.w")
    public static class197 field1164 = new class197(64);

    @ObfuscatedName("bi.e")
    public boolean field1157 = false;

    @ObfuscatedName("ae.m(Lfa;I)V")
    public static void method1057(class171 arg0) {
        Statics.field584 = arg0;
    }

    @ObfuscatedName("bi.w(Ldj;B)V")
    public void method1079(class123 arg0) {
        while (true) {
            int var2 = arg0.method2398();
            if (var2 == 0) {
                return;
            }
            this.method1080(arg0, var2);
        }
    }

    @ObfuscatedName("bi.e(Ldj;II)V")
    public void method1080(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1157 = true;
        }
    }
}
