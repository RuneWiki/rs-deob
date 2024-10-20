package deob;

@ObfuscatedName("ah")
public class class41 extends class174 {

    @ObfuscatedName("ah.h")
    public static class170 field1033 = new class170(64);

    @ObfuscatedName("ah.s")
    public int field1031 = 0;

    @ObfuscatedName("aj.g(II)Lah;")
    public static class41 method765(int arg0) {
        class41 var1 = (class41) field1033.method3303((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1032.method3080(5, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method885(new class127(var2));
        }
        field1033.method3313(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.h(Ldw;I)V")
    public void method885(class127 arg0) {
        while (true) {
            int var2 = arg0.method2499();
            if (var2 == 0) {
                return;
            }
            this.method886(arg0, var2);
        }
    }

    @ObfuscatedName("ah.s(Ldw;IB)V")
    public void method886(class127 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1031 = arg0.method2501();
        }
    }
}
