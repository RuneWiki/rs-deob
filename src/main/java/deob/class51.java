package deob;

@ObfuscatedName("aa")
public class class51 extends class205 {

    @ObfuscatedName("aa.x")
    public static class194 field1109 = new class194(64);

    @ObfuscatedName("aa.t")
    public int field1110 = 0;

    @ObfuscatedName("q.w(II)Laa;")
    public static class51 method160(int arg0) {
        class51 var1 = (class51) field1109.method3520((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1111.method3127(5, arg0);
        class51 var3 = new class51();
        if (var2 != null) {
            var3.method1027(new class120(var2));
        }
        field1109.method3522(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.x(Lde;S)V")
    public void method1027(class120 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method1038(arg0, var2);
        }
    }

    @ObfuscatedName("aa.t(Lde;IB)V")
    public void method1038(class120 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1110 = arg0.method2365();
        }
    }
}
