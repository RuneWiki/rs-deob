package deob;

@ObfuscatedName("bp")
public class class53 extends class204 {

    @ObfuscatedName("bp.u")
    public static class193 field1150 = new class193(64);

    @ObfuscatedName("bp.b")
    public int field1151 = 0;

    @ObfuscatedName("gj.o(II)Lbp;")
    public static class53 method3502(int arg0) {
        class53 var1 = (class53) field1150.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1155.method3057(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1031(new class119(var2));
        }
        field1150.method3512(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bp.e(Ldi;I)V")
    public void method1031(class119 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method1032(arg0, var2);
        }
    }

    @ObfuscatedName("bp.u(Ldi;IS)V")
    public void method1032(class119 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1151 = arg0.method2339();
        }
    }
}
