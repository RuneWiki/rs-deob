package deob;

@ObfuscatedName("hq")
public class class192 extends class500 {

    @ObfuscatedName("hq.al")
    public static class312 field1982 = new class312(64);

    @ObfuscatedName("hq.aj")
    public int field1984 = 0;

    @ObfuscatedName("cy.ak(IB)Lhq;")
    public static class192 method1877(int arg0) {
        class192 var1 = (class192) field1982.method5570((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1987.method6573(5, arg0);
        class192 var3 = new class192();
        if (var2 != null) {
            var3.method3478(new class546(var2));
        }
        field1982.method5564(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hq.al(Lua;I)V")
    public void method3478(class546 arg0) {
        while (true) {
            int var2 = arg0.method8796();
            if (var2 == 0) {
                return;
            }
            this.method3480(arg0, var2);
        }
    }

    @ObfuscatedName("hq.aj(Lua;II)V")
    public void method3480(class546 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1984 = arg0.method8798();
        }
    }

    @ObfuscatedName("ea.az(I)V")
    public static void method2805() {
        field1982.method5572();
    }
}
