package deob;

@ObfuscatedName("ao")
public class class42 extends class174 {

    @ObfuscatedName("ao.v")
    public static class170 field1033 = new class170(64);

    @ObfuscatedName("ao.r")
    public int field1036 = 0;

    @ObfuscatedName("bv.g(IB)Lao;")
    public static class42 method1543(int arg0) {
        class42 var1 = (class42) field1033.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1035.method2968(16, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method884(new class127(var2));
        }
        field1033.method3249(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.m(Ldr;I)V")
    public void method884(class127 arg0) {
        while (true) {
            int var2 = arg0.method2414();
            if (var2 == 0) {
                return;
            }
            this.method877(arg0, var2);
        }
    }

    @ObfuscatedName("ao.v(Ldr;II)V")
    public void method877(class127 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1036 = arg0.method2416();
        }
    }

    @ObfuscatedName("aa.r(I)V")
    public static void method622() {
        field1033.method3251();
    }
}
