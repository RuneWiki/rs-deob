package deob;

@ObfuscatedName("ap")
public class class46 extends class204 {

    @ObfuscatedName("ap.e")
    public static class193 field1035 = new class193(64);

    @ObfuscatedName("ap.q")
    public boolean field1041 = false;

    @ObfuscatedName("ek.l(IB)Lap;")
    public static class46 method2789(int arg0) {
        class46 var1 = (class46) field1035.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1034.method3050(19, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method943(new class119(var2));
        }
        field1035.method3479(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.e(Ldl;I)V")
    public void method943(class119 arg0) {
        while (true) {
            int var2 = arg0.method2388();
            if (var2 == 0) {
                return;
            }
            this.method949(arg0, var2);
        }
    }

    @ObfuscatedName("ap.q(Ldl;II)V")
    public void method949(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1041 = true;
        }
    }
}
