package deob;

@ObfuscatedName("gz")
public class class188 extends class130 {

    @ObfuscatedName("gz.o")
    public static class125 field2757 = new class125(64);

    @ObfuscatedName("gz.r")
    public int field2758 = 0;

    @ObfuscatedName("dd.k(II)Lgz;")
    public static class188 method1927(int arg0) {
        class188 var1 = (class188) field2757.method2159((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2760.method3065(16, arg0);
        class188 var3 = new class188();
        if (var2 != null) {
            var3.method3204(new class161(var2));
        }
        field2757.method2164(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gz.y(Lfm;I)V")
    public void method3204(class161 arg0) {
        while (true) {
            int var2 = arg0.method2733();
            if (var2 == 0) {
                return;
            }
            this.method3205(arg0, var2);
        }
    }

    @ObfuscatedName("gz.o(Lfm;IB)V")
    public void method3205(class161 arg0, int arg1) {
        if (arg1 == 5) {
            this.field2758 = arg0.method2735();
        }
    }
}
