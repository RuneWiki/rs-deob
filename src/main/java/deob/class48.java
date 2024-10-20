package deob;

@ObfuscatedName("at")
public class class48 extends class195 {

    @ObfuscatedName("at.e")
    public static class184 field1106 = new class184(64);

    @ObfuscatedName("at.f")
    public int field1107 = 0;

    @ObfuscatedName("ae.k(II)Lat;")
    public static class48 method843(int arg0) {
        class48 var1 = (class48) field1106.method3371((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1109.method2896(16, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method936(new class111(var2));
        }
        field1106.method3370(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.e(Lde;I)V")
    public void method936(class111 arg0) {
        while (true) {
            int var2 = arg0.method2314();
            if (var2 == 0) {
                return;
            }
            this.method933(arg0, var2);
        }
    }

    @ObfuscatedName("at.f(Lde;II)V")
    public void method933(class111 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1107 = arg0.method2177();
        }
    }
}
