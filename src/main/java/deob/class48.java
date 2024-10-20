package deob;

@ObfuscatedName("af")
public class class48 extends class195 {

    @ObfuscatedName("af.p")
    public static class184 field1078 = new class184(64);

    @ObfuscatedName("af.e")
    public int field1077 = 0;

    @ObfuscatedName("aw.t(IB)Laf;")
    public static class48 method683(int arg0) {
        class48 var1 = (class48) field1078.method3339((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1075.method2881(16, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method976(new class111(var2));
        }
        field1078.method3341(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.b(Ldc;I)V")
    public void method976(class111 arg0) {
        while (true) {
            int var2 = arg0.method2172();
            if (var2 == 0) {
                return;
            }
            this.method977(arg0, var2);
        }
    }

    @ObfuscatedName("af.p(Ldc;II)V")
    public void method977(class111 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1077 = arg0.method2255();
        }
    }

    @ObfuscatedName("e.e(I)V")
    public static void method29() {
        field1078.method3342();
    }
}
