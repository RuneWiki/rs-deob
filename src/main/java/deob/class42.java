package deob;

@ObfuscatedName("aq")
public class class42 extends class174 {

    @ObfuscatedName("aq.d")
    public static class170 field1027 = new class170(64);

    @ObfuscatedName("aq.x")
    public int field1030 = 0;

    @ObfuscatedName("bp.p(IB)Laq;")
    public static class42 method1457(int arg0) {
        class42 var1 = (class42) field1027.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1040.method3078(16, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method907(new class127(var2));
        }
        field1027.method3364(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.l(Lds;I)V")
    public void method907(class127 arg0) {
        while (true) {
            int var2 = arg0.method2498();
            if (var2 == 0) {
                return;
            }
            this.method908(arg0, var2);
        }
    }

    @ObfuscatedName("aq.d(Lds;II)V")
    public void method908(class127 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1030 = arg0.method2581();
        }
    }

    @ObfuscatedName("d.x(I)V")
    public static void method17() {
        field1027.method3360();
    }
}
