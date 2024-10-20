package deob;

@ObfuscatedName("bt")
public class class57 extends class208 {

    @ObfuscatedName("bt.e")
    public static class197 field1234 = new class197(64);

    @ObfuscatedName("bt.o")
    public int field1235 = 0;

    @ObfuscatedName("at.m(Lfa;I)V")
    public static void method733(class171 arg0) {
        Statics.field1236 = arg0;
        Statics.field1240 = Statics.field1236.method3099(16);
    }

    @ObfuscatedName("g.w(II)Lbt;")
    public static class57 method42(int arg0) {
        class57 var1 = (class57) field1234.method3556((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1236.method3086(16, arg0);
        class57 var3 = new class57();
        if (var2 != null) {
            var3.method1159(new class123(var2));
        }
        field1234.method3562(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bt.e(Ldj;B)V")
    public void method1159(class123 arg0) {
        while (true) {
            int var2 = arg0.method2398();
            if (var2 == 0) {
                return;
            }
            this.method1160(arg0, var2);
        }
    }

    @ObfuscatedName("bt.o(Ldj;II)V")
    public void method1160(class123 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1235 = arg0.method2548();
        }
    }
}
