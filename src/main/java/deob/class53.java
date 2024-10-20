package deob;

@ObfuscatedName("bc")
public class class53 extends class205 {

    @ObfuscatedName("bc.j")
    public static class194 field1131 = new class194(64);

    @ObfuscatedName("bc.d")
    public int field1133 = 0;

    @ObfuscatedName("f.b(II)Lbc;")
    public static class53 method550(int arg0) {
        class53 var1 = (class53) field1131.method3495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1132.method3037(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1048(new class120(var2));
        }
        field1131.method3490(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bc.g(Lds;B)V")
    public void method1048(class120 arg0) {
        while (true) {
            int var2 = arg0.method2344();
            if (var2 == 0) {
                return;
            }
            this.method1057(arg0, var2);
        }
    }

    @ObfuscatedName("bc.j(Lds;II)V")
    public void method1057(class120 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1133 = arg0.method2346();
        }
    }
}
