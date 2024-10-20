package deob;

@ObfuscatedName("ay")
public class class48 extends class208 {

    @ObfuscatedName("ay.d")
    public static class197 field1064 = new class197(64);

    @ObfuscatedName("ay.v")
    public boolean field1072 = false;

    @ObfuscatedName("an.a(Lfu;I)V")
    public static void method1011(class171 arg0) {
        Statics.field1065 = arg0;
    }

    @ObfuscatedName("ay.d(Ldb;S)V")
    public void method959(class123 arg0) {
        while (true) {
            int var2 = arg0.method2395();
            if (var2 == 0) {
                return;
            }
            this.method961(arg0, var2);
        }
    }

    @ObfuscatedName("ay.v(Ldb;II)V")
    public void method961(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1072 = true;
        }
    }
}
