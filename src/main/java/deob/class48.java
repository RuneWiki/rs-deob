package deob;

@ObfuscatedName("ay")
public class class48 extends class195 {

    @ObfuscatedName("ay.a")
    public static class184 field1120 = new class184(64);

    @ObfuscatedName("ay.m")
    public int field1122 = 0;

    @ObfuscatedName("ez.n(IB)Lay;")
    public static class48 method2707(int arg0) {
        class48 var1 = (class48) field1120.method3388((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1123.method2929(16, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method936(new class111(var2));
        }
        field1120.method3396(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.g(Ldp;I)V")
    public void method936(class111 arg0) {
        while (true) {
            int var2 = arg0.method2211();
            if (var2 == 0) {
                return;
            }
            this.method935(arg0, var2);
        }
    }

    @ObfuscatedName("ay.a(Ldp;IB)V")
    public void method935(class111 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1122 = arg0.method2395();
        }
    }
}
