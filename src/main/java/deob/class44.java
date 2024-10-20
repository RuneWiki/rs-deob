package deob;

@ObfuscatedName("an")
public class class44 extends class183 {

    @ObfuscatedName("an.s")
    public static class172 field994 = new class172(64);

    @ObfuscatedName("an.h")
    public int field995 = 0;

    @ObfuscatedName("bz.g(II)Lan;")
    public static class44 method1600(int arg0) {
        class44 var1 = (class44) field994.method3130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1000.method2667(5, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method820(new class107(var2));
        }
        field994.method3126(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.s(Ldi;I)V")
    public void method820(class107 arg0) {
        while (true) {
            int var2 = arg0.method2101();
            if (var2 == 0) {
                return;
            }
            this.method821(arg0, var2);
        }
    }

    @ObfuscatedName("an.h(Ldi;II)V")
    public void method821(class107 arg0, int arg1) {
        if (arg1 == 2) {
            this.field995 = arg0.method2166();
        }
    }
}
