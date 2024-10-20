package deob;

@ObfuscatedName("ar")
public class class48 extends class204 {

    @ObfuscatedName("ar.q")
    public static class193 field1055 = new class193(64);

    @ObfuscatedName("ar.k")
    public int field1056;

    @ObfuscatedName("ar.f")
    public int field1058;

    @ObfuscatedName("ar.d")
    public int field1062;

    @ObfuscatedName("client.z(II)Lar;")
    public static class48 method533(int arg0) {
        class48 var1 = (class48) field1055.method3439((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1054.method2986(14, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method930(new class119(var2));
        }
        field1055.method3429(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.q(Lda;I)V")
    public void method930(class119 arg0) {
        while (true) {
            int var2 = arg0.method2457();
            if (var2 == 0) {
                return;
            }
            this.method933(arg0, var2);
        }
    }

    @ObfuscatedName("ar.k(Lda;IB)V")
    public void method933(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1056 = arg0.method2415();
            this.field1058 = arg0.method2457();
            this.field1062 = arg0.method2457();
        }
    }

    @ObfuscatedName("cv.f(B)V")
    public static void method1994() {
        field1055.method3430();
    }
}
