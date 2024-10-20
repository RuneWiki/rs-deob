package deob;

@ObfuscatedName("it")
public class class251 extends class185 {

    @ObfuscatedName("it.b")
    public static class155 field3230 = new class155(64);

    @ObfuscatedName("it.l")
    public int field3229 = 0;

    @ObfuscatedName("w.f(Liw;B)V")
    public static void method179(class245 arg0) {
        Statics.field3231 = arg0;
    }

    @ObfuscatedName("bd.b(II)Lit;")
    public static class251 method1117(int arg0) {
        class251 var1 = (class251) field3230.method3155((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3231.method3905(5, arg0);
        class251 var3 = new class251();
        if (var2 != null) {
            var3.method4081(new class311(var2));
        }
        field3230.method3157(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("it.l(Lkb;I)V")
    public void method4081(class311 arg0) {
        while (true) {
            int var2 = arg0.method5276();
            if (var2 == 0) {
                return;
            }
            this.method4082(arg0, var2);
        }
    }

    @ObfuscatedName("it.m(Lkb;IS)V")
    public void method4082(class311 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3229 = arg0.method5163();
        }
    }
}
