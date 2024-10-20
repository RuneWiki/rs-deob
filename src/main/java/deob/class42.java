package deob;

@ObfuscatedName("aw")
public class class42 extends class174 {

    @ObfuscatedName("aw.y")
    public static class170 field1053 = new class170(64);

    @ObfuscatedName("aw.v")
    public int field1056 = 0;

    @ObfuscatedName("ef.c(II)Law;")
    public static class42 method2637(int arg0) {
        class42 var1 = (class42) field1053.method3097((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1059.method2886(16, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method860(new class127(var2));
        }
        field1053.method3092(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.q(Ldg;B)V")
    public void method860(class127 arg0) {
        while (true) {
            int var2 = arg0.method2383();
            if (var2 == 0) {
                return;
            }
            this.method862(arg0, var2);
        }
    }

    @ObfuscatedName("aw.y(Ldg;II)V")
    public void method862(class127 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1056 = arg0.method2327();
        }
    }
}
