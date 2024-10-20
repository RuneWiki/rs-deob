package deob;

@ObfuscatedName("ai")
public class class46 extends class204 {

    @ObfuscatedName("ai.d")
    public static class193 field1023 = new class193(64);

    @ObfuscatedName("ai.s")
    public boolean field1024 = false;

    @ObfuscatedName("ar.n(II)Lai;")
    public static class46 method694(int arg0) {
        class46 var1 = (class46) field1023.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3141.method3010(19, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method905(new class119(var2));
        }
        field1023.method3481(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.d(Ldq;I)V")
    public void method905(class119 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method903(arg0, var2);
        }
    }

    @ObfuscatedName("ai.s(Ldq;II)V")
    public void method903(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1024 = true;
        }
    }
}
