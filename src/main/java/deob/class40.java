package deob;

@ObfuscatedName("ay")
public class class40 extends class172 {

    @ObfuscatedName("ay.y")
    public static class168 field1006 = new class168(64);

    @ObfuscatedName("ay.x")
    public int field1005 = 0;

    @ObfuscatedName("cy.j(IB)Lay;")
    public static class40 method1998(int arg0) {
        class40 var1 = (class40) field1006.method3191((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1911.method2903(5, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method865(new class126(var2));
        }
        field1006.method3181(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.y(Ldr;I)V")
    public void method865(class126 arg0) {
        while (true) {
            int var2 = arg0.method2399();
            if (var2 == 0) {
                return;
            }
            this.method866(arg0, var2);
        }
    }

    @ObfuscatedName("ay.x(Ldr;II)V")
    public void method866(class126 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1005 = arg0.method2405();
        }
    }
}
