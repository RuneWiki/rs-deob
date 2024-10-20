package deob;

@ObfuscatedName("ay")
public class class44 extends class195 {

    @ObfuscatedName("ay.w")
    public static class184 field1004 = new class184(64);

    @ObfuscatedName("ay.i")
    public int field1003;

    @ObfuscatedName("ay.e")
    public int field1005;

    @ObfuscatedName("ay.h")
    public int field1006;

    @ObfuscatedName("bo.n(Lfd;I)V")
    public static void method1365(class158 arg0) {
        Statics.field753 = arg0;
    }

    @ObfuscatedName("ay.w(Ldo;I)V")
    public void method855(class111 arg0) {
        while (true) {
            int var2 = arg0.method2155();
            if (var2 == 0) {
                return;
            }
            this.method861(arg0, var2);
        }
    }

    @ObfuscatedName("ay.i(Ldo;IB)V")
    public void method861(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1003 = arg0.method2157();
            this.field1005 = arg0.method2155();
            this.field1006 = arg0.method2155();
        }
    }

    @ObfuscatedName("x.e(B)V")
    public static void method518() {
        field1004.method3319();
    }
}
