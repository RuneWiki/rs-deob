package deob;

@ObfuscatedName("an")
public class class48 extends class204 {

    @ObfuscatedName("an.v")
    public static class193 field1076 = new class193(64);

    @ObfuscatedName("an.f")
    public int field1075;

    @ObfuscatedName("an.h")
    public int field1078;

    @ObfuscatedName("an.a")
    public int field1079;

    @ObfuscatedName("by.i(Lfn;I)V")
    public static void method1151(class167 arg0) {
        Statics.field1082 = arg0;
    }

    @ObfuscatedName("cc.v(II)Lan;")
    public static class48 method1915(int arg0) {
        class48 var1 = (class48) field1076.method3467((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1082.method3080(14, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method926(new class119(var2));
        }
        field1076.method3466(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.f(Ldj;I)V")
    public void method926(class119 arg0) {
        while (true) {
            int var2 = arg0.method2310();
            if (var2 == 0) {
                return;
            }
            this.method912(arg0, var2);
        }
    }

    @ObfuscatedName("an.h(Ldj;IB)V")
    public void method912(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1075 = arg0.method2312();
            this.field1078 = arg0.method2310();
            this.field1079 = arg0.method2310();
        }
    }

    @ObfuscatedName("cv.a(I)V")
    public static void method2098() {
        field1076.method3464();
    }
}
