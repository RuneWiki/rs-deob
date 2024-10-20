package deob;

@ObfuscatedName("gh")
public class class188 extends class130 {

    @ObfuscatedName("gh.c")
    public static class125 field2781 = new class125(64);

    @ObfuscatedName("gh.l")
    public int field2782 = 0;

    @ObfuscatedName("ae.b(II)Lgh;")
    public static class188 method601(int arg0) {
        class188 var1 = (class188) field2781.method2246((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2783.method3126(16, arg0);
        class188 var3 = new class188();
        if (var2 != null) {
            var3.method3273(new class154(var2));
        }
        field2781.method2250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gh.e(Lec;B)V")
    public void method3273(class154 arg0) {
        while (true) {
            int var2 = arg0.method2669();
            if (var2 == 0) {
                return;
            }
            this.method3274(arg0, var2);
        }
    }

    @ObfuscatedName("gh.c(Lec;II)V")
    public void method3274(class154 arg0, int arg1) {
        if (arg1 == 5) {
            this.field2782 = arg0.method2671();
        }
    }
}
