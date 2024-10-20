package deob;

@ObfuscatedName("aq")
public class class41 extends class174 {

    @ObfuscatedName("aq.q")
    public static class170 field1044 = new class170(64);

    @ObfuscatedName("aq.y")
    public int field1045 = 0;

    @ObfuscatedName("r.c(II)Laq;")
    public static class41 method178(int arg0) {
        class41 var1 = (class41) field1044.method3097((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1048.method2886(5, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method848(new class127(var2));
        }
        field1044.method3092(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.q(Ldg;B)V")
    public void method848(class127 arg0) {
        while (true) {
            int var2 = arg0.method2383();
            if (var2 == 0) {
                return;
            }
            this.method854(arg0, var2);
        }
    }

    @ObfuscatedName("aq.y(Ldg;II)V")
    public void method854(class127 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1045 = arg0.method2327();
        }
    }
}
