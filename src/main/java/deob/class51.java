package deob;

@ObfuscatedName("as")
public class class51 extends class204 {

    @ObfuscatedName("as.b")
    public static class193 field1100 = new class193(64);

    @ObfuscatedName("as.w")
    public int field1098 = 0;

    @ObfuscatedName("ak.g(IB)Las;")
    public static class51 method650(int arg0) {
        class51 var1 = (class51) field1100.method3529((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1103.method3112(5, arg0);
        class51 var3 = new class51();
        if (var2 != null) {
            var3.method1020(new class119(var2));
        }
        field1100.method3528(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.b(Ldm;I)V")
    public void method1020(class119 arg0) {
        while (true) {
            int var2 = arg0.method2362();
            if (var2 == 0) {
                return;
            }
            this.method1026(arg0, var2);
        }
    }

    @ObfuscatedName("as.w(Ldm;II)V")
    public void method1026(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1098 = arg0.method2376();
        }
    }
}
