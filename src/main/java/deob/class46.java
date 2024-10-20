package deob;

@ObfuscatedName("ar")
public class class46 extends class183 {

    @ObfuscatedName("ar.x")
    public static class172 field1056 = new class172(64);

    @ObfuscatedName("ar.c")
    public int field1061 = 0;

    @ObfuscatedName("aj.p(II)Lar;")
    public static class46 method707(int arg0) {
        class46 var1 = (class46) field1056.method3225((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1055.method2855(16, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method948(new class107(var2));
        }
        field1056.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.g(Ldp;B)V")
    public void method948(class107 arg0) {
        while (true) {
            int var2 = arg0.method2173();
            if (var2 == 0) {
                return;
            }
            this.method939(arg0, var2);
        }
    }

    @ObfuscatedName("ar.x(Ldp;II)V")
    public void method939(class107 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1061 = arg0.method2175();
        }
    }

    @ObfuscatedName("z.c(I)V")
    public static void method156() {
        field1056.method3227();
    }
}
