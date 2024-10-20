package deob;

@ObfuscatedName("ex")
public class class138 extends class348 {

    @ObfuscatedName("ex.e")
    public static class222 field1551 = new class222(64);

    @ObfuscatedName("ex.v")
    public int field1547 = 0;

    @ObfuscatedName("jj.f(II)Lex;")
    public static class138 method4422(int arg0) {
        class138 var1 = (class138) field1551.method3987((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1548.method4504(5, arg0);
        class138 var3 = new class138();
        if (var2 != null) {
            var3.method2395(new class384(var2));
        }
        field1551.method3988(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ex.e(Lnt;I)V")
    public void method2395(class384 arg0) {
        while (true) {
            int var2 = arg0.method5902();
            if (var2 == 0) {
                return;
            }
            this.method2398(arg0, var2);
        }
    }

    @ObfuscatedName("ex.v(Lnt;IS)V")
    public void method2398(class384 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1547 = arg0.method5899();
        }
    }
}
