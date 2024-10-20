package deob;

@ObfuscatedName("gf")
public class class189 extends class130 {

    @ObfuscatedName("gf.e")
    public static class125 field2791 = new class125(64);

    @ObfuscatedName("gf.c")
    public boolean field2789 = false;

    @ObfuscatedName("client.b(II)Lgf;")
    public static class189 method572(int arg0) {
        class189 var1 = (class189) field2791.method2246((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2790.method3126(19, arg0);
        class189 var3 = new class189();
        if (var2 != null) {
            var3.method3285(new class154(var2));
        }
        field2791.method2250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gf.e(Lec;I)V")
    public void method3285(class154 arg0) {
        while (true) {
            int var2 = arg0.method2669();
            if (var2 == 0) {
                return;
            }
            this.method3284(arg0, var2);
        }
    }

    @ObfuscatedName("gf.c(Lec;IB)V")
    public void method3284(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2789 = true;
        }
    }
}
