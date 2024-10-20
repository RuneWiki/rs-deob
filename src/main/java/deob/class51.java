package deob;

@ObfuscatedName("an")
public class class51 extends class204 {

    @ObfuscatedName("an.h")
    public static class193 field1092 = new class193(64);

    @ObfuscatedName("an.k")
    public int field1094 = 0;

    @ObfuscatedName("s.c(IB)Lan;")
    public static class51 method555(int arg0) {
        class51 var1 = (class51) field1092.method3485((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1093.method2994(5, arg0);
        class51 var3 = new class51();
        if (var2 != null) {
            var3.method973(new class119(var2));
        }
        field1092.method3487(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.h(Ldf;I)V")
    public void method973(class119 arg0) {
        while (true) {
            int var2 = arg0.method2291();
            if (var2 == 0) {
                return;
            }
            this.method976(arg0, var2);
        }
    }

    @ObfuscatedName("an.k(Ldf;IB)V")
    public void method976(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1094 = arg0.method2293();
        }
    }
}
