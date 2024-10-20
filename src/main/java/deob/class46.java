package deob;

@ObfuscatedName("as")
public class class46 extends class195 {

    @ObfuscatedName("as.l")
    public static class184 field1022 = new class184(64);

    @ObfuscatedName("as.g")
    public int field1026 = 0;

    @ObfuscatedName("i.o(IB)Las;")
    public static class46 method165(int arg0) {
        class46 var1 = (class46) field1022.method3401((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1021.method2940(5, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method917(new class111(var2));
        }
        field1022.method3403(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.l(Ldk;I)V")
    public void method917(class111 arg0) {
        while (true) {
            int var2 = arg0.method2219();
            if (var2 == 0) {
                return;
            }
            this.method907(arg0, var2);
        }
    }

    @ObfuscatedName("as.g(Ldk;IB)V")
    public void method907(class111 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1026 = arg0.method2397();
        }
    }
}
