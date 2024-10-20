package deob;

@ObfuscatedName("ab")
public class class47 extends class185 {

    @ObfuscatedName("ab.g")
    public static class174 field1059 = new class174(64);

    @ObfuscatedName("ab.j")
    public int field1056 = 0;

    @ObfuscatedName("dj.l(II)Lab;")
    public static class47 method2419(int arg0) {
        class47 var1 = (class47) field1059.method3225((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1055.method2752(16, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method894(new class108(var2));
        }
        field1059.method3211(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.y(Ldk;I)V")
    public void method894(class108 arg0) {
        while (true) {
            int var2 = arg0.method2291();
            if (var2 == 0) {
                return;
            }
            this.method895(arg0, var2);
        }
    }

    @ObfuscatedName("ab.g(Ldk;II)V")
    public void method895(class108 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1056 = arg0.method2163();
        }
    }
}
