package deob;

@ObfuscatedName("bx")
public class class54 extends class208 {

    @ObfuscatedName("bx.r")
    public static class197 field1135 = new class197(64);

    @ObfuscatedName("bx.j")
    public boolean field1136 = false;

    @ObfuscatedName("da.x(Lfp;B)V")
    public static void method2204(class171 arg0) {
        Statics.field1134 = arg0;
    }

    @ObfuscatedName("bx.r(Ldp;I)V")
    public void method1041(class123 arg0) {
        while (true) {
            int var2 = arg0.method2408();
            if (var2 == 0) {
                return;
            }
            this.method1047(arg0, var2);
        }
    }

    @ObfuscatedName("bx.j(Ldp;IB)V")
    public void method1047(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1136 = true;
        }
    }
}
