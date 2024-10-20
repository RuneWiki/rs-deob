package deob;

@ObfuscatedName("am")
public class class51 extends class204 {

    @ObfuscatedName("am.h")
    public static class193 field1079 = new class193(64);

    @ObfuscatedName("am.o")
    public int field1080 = 0;

    @ObfuscatedName("g.k(Lfo;I)V")
    public static void method132(class167 arg0) {
        Statics.field1081 = arg0;
    }

    @ObfuscatedName("aw.h(IB)Lam;")
    public static class51 method680(int arg0) {
        class51 var1 = (class51) field1079.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1081.method3118(5, arg0);
        class51 var3 = new class51();
        if (var2 != null) {
            var3.method958(new class119(var2));
        }
        field1079.method3512(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.o(Ldk;I)V")
    public void method958(class119 arg0) {
        while (true) {
            int var2 = arg0.method2330();
            if (var2 == 0) {
                return;
            }
            this.method959(arg0, var2);
        }
    }

    @ObfuscatedName("am.z(Ldk;II)V")
    public void method959(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1080 = arg0.method2332();
        }
    }
}
