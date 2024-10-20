package deob;

@ObfuscatedName("as")
public class class41 extends class174 {

    @ObfuscatedName("as.m")
    public static class170 field1029 = new class170(64);

    @ObfuscatedName("as.v")
    public int field1024 = 0;

    @ObfuscatedName("by.g(Leo;I)V")
    public static void method1326(class152 arg0) {
        Statics.field2698 = arg0;
    }

    @ObfuscatedName("ak.m(II)Las;")
    public static class41 method733(int arg0) {
        class41 var1 = (class41) field1029.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2698.method2968(5, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method870(new class127(var2));
        }
        field1029.method3249(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.v(Ldr;I)V")
    public void method870(class127 arg0) {
        while (true) {
            int var2 = arg0.method2414();
            if (var2 == 0) {
                return;
            }
            this.method861(arg0, var2);
        }
    }

    @ObfuscatedName("as.r(Ldr;IS)V")
    public void method861(class127 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1024 = arg0.method2416();
        }
    }
}
