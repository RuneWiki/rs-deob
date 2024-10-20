package deob;

@ObfuscatedName("am")
public class class42 extends class174 {

    @ObfuscatedName("am.s")
    public static class170 field1038 = new class170(64);

    @ObfuscatedName("am.o")
    public int field1039 = 0;

    @ObfuscatedName("g.g(Leu;I)V")
    public static void method5(class153 arg0) {
        Statics.field2736 = arg0;
        Statics.field1042 = Statics.field2736.method3100(16);
    }

    @ObfuscatedName("da.h(II)Lam;")
    public static class42 method2350(int arg0) {
        class42 var1 = (class42) field1038.method3303((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2736.method3080(16, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method901(new class127(var2));
        }
        field1038.method3313(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.s(Ldw;I)V")
    public void method901(class127 arg0) {
        while (true) {
            int var2 = arg0.method2499();
            if (var2 == 0) {
                return;
            }
            this.method902(arg0, var2);
        }
    }

    @ObfuscatedName("am.o(Ldw;IB)V")
    public void method902(class127 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1039 = arg0.method2501();
        }
    }
}
