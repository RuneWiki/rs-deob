package deob;

@ObfuscatedName("ay")
public class class46 extends class195 {

    @ObfuscatedName("ay.e")
    public static class184 field1018 = new class184(64);

    @ObfuscatedName("ay.a")
    public int field1027 = 0;

    @ObfuscatedName("t.b(II)Lay;")
    public static class46 method182(int arg0) {
        class46 var1 = (class46) field1018.method3254((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1020.method2819(5, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method855(new class111(var2));
        }
        field1018.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.e(Ldj;B)V")
    public void method855(class111 arg0) {
        while (true) {
            int var2 = arg0.method2127();
            if (var2 == 0) {
                return;
            }
            this.method866(arg0, var2);
        }
    }

    @ObfuscatedName("ay.a(Ldj;II)V")
    public void method866(class111 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1027 = arg0.method2129();
        }
    }
}
