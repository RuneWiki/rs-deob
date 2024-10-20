package deob;

@ObfuscatedName("ax")
public class class48 extends class204 {

    @ObfuscatedName("ax.e")
    public static class193 field1059 = new class193(64);

    @ObfuscatedName("ax.q")
    public int field1057;

    @ObfuscatedName("ax.o")
    public int field1058;

    @ObfuscatedName("ax.g")
    public int field1056;

    @ObfuscatedName("eh.l(IB)Lax;")
    public static class48 method2746(int arg0) {
        class48 var1 = (class48) field1059.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2635.method3050(14, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method976(new class119(var2));
        }
        field1059.method3479(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.e(Ldl;I)V")
    public void method976(class119 arg0) {
        while (true) {
            int var2 = arg0.method2388();
            if (var2 == 0) {
                return;
            }
            this.method977(arg0, var2);
        }
    }

    @ObfuscatedName("ax.q(Ldl;II)V")
    public void method977(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1057 = arg0.method2440();
            this.field1058 = arg0.method2388();
            this.field1056 = arg0.method2388();
        }
    }

    @ObfuscatedName("ap.o(B)V")
    public static void method942() {
        field1059.method3481();
    }
}
