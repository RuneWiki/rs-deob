package deob;

@ObfuscatedName("aq")
public class class51 extends class204 {

    @ObfuscatedName("aq.q")
    public static class193 field1102 = new class193(64);

    @ObfuscatedName("aq.c")
    public int field1098 = 0;

    @ObfuscatedName("t.n(Lfm;B)V")
    public static void method578(class167 arg0) {
        Statics.field1097 = arg0;
    }

    @ObfuscatedName("y.q(II)Laq;")
    public static class51 method117(int arg0) {
        class51 var1 = (class51) field1102.method3475((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1097.method3094(5, arg0);
        class51 var3 = new class51();
        if (var2 != null) {
            var3.method1009(new class119(var2));
        }
        field1102.method3488(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.c(Ldc;I)V")
    public void method1009(class119 arg0) {
        while (true) {
            int var2 = arg0.method2360();
            if (var2 == 0) {
                return;
            }
            this.method1010(arg0, var2);
        }
    }

    @ObfuscatedName("aq.l(Ldc;IB)V")
    public void method1010(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1098 = arg0.method2430();
        }
    }
}
