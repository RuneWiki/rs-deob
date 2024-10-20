package deob;

@ObfuscatedName("an")
public class class48 extends class195 {

    @ObfuscatedName("an.g")
    public static class184 field1083 = new class184(64);

    @ObfuscatedName("an.u")
    public int field1084 = 0;

    @ObfuscatedName("h.o(Lfg;I)V")
    public static void method181(class158 arg0) {
        Statics.field1082 = arg0;
        Statics.field1090 = Statics.field1082.method2950(16);
    }

    @ObfuscatedName("ev.l(II)Lan;")
    public static class48 method2695(int arg0) {
        class48 var1 = (class48) field1083.method3401((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1082.method2940(16, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method980(new class111(var2));
        }
        field1083.method3403(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.g(Ldk;B)V")
    public void method980(class111 arg0) {
        while (true) {
            int var2 = arg0.method2219();
            if (var2 == 0) {
                return;
            }
            this.method981(arg0, var2);
        }
    }

    @ObfuscatedName("an.u(Ldk;II)V")
    public void method981(class111 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1084 = arg0.method2397();
        }
    }
}
