package deob;

@ObfuscatedName("ba")
public class class53 extends class204 {

    @ObfuscatedName("ba.o")
    public static class193 field1136 = new class193(64);

    @ObfuscatedName("ba.z")
    public int field1137 = 0;

    @ObfuscatedName("ab.k(IB)Lba;")
    public static class53 method932(int arg0) {
        class53 var1 = (class53) field1136.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2149.method3118(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1041(new class119(var2));
        }
        field1136.method3512(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ba.h(Ldk;I)V")
    public void method1041(class119 arg0) {
        while (true) {
            int var2 = arg0.method2330();
            if (var2 == 0) {
                return;
            }
            this.method1032(arg0, var2);
        }
    }

    @ObfuscatedName("ba.o(Ldk;II)V")
    public void method1032(class119 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1137 = arg0.method2332();
        }
    }
}
