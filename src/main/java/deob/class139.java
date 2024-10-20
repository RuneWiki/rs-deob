package deob;

@ObfuscatedName("eb")
public class class139 extends class348 {

    @ObfuscatedName("eb.v")
    public static class222 field1554 = new class222(64);

    @ObfuscatedName("eb.y")
    public int field1555 = 0;

    @ObfuscatedName("dw.f(Ljp;I)V")
    public static void method2309(class276 arg0) {
        Statics.field1553 = arg0;
        Statics.field431 = Statics.field1553.method4514(16);
    }

    @ObfuscatedName("e.e(II)Leb;")
    public static class139 method14(int arg0) {
        class139 var1 = (class139) field1554.method3987((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1553.method4504(16, arg0);
        class139 var3 = new class139();
        if (var2 != null) {
            var3.method2404(new class384(var2));
        }
        field1554.method3988(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("eb.v(Lnt;I)V")
    public void method2404(class384 arg0) {
        while (true) {
            int var2 = arg0.method5902();
            if (var2 == 0) {
                return;
            }
            this.method2405(arg0, var2);
        }
    }

    @ObfuscatedName("eb.y(Lnt;IB)V")
    public void method2405(class384 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1555 = arg0.method5899();
        }
    }

    @ObfuscatedName("bo.j(B)V")
    public static void method995() {
        field1554.method3989();
    }
}
