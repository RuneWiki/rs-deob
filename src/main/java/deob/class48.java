package deob;

@ObfuscatedName("an")
public class class48 extends class194 {

    @ObfuscatedName("an.l")
    public static class183 field1044 = new class183(64);

    @ObfuscatedName("an.c")
    public int field1047 = 0;

    @ObfuscatedName("da.e(II)Lan;")
    public static class48 method2540(int arg0) {
        class48 var1 = (class48) field1044.method3302((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1046.method2843(16, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method937(new class111(var2));
        }
        field1044.method3304(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.a(Ldh;B)V")
    public void method937(class111 arg0) {
        while (true) {
            int var2 = arg0.method2176();
            if (var2 == 0) {
                return;
            }
            this.method939(arg0, var2);
        }
    }

    @ObfuscatedName("an.l(Ldh;IS)V")
    public void method939(class111 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1047 = arg0.method2178();
        }
    }
}
