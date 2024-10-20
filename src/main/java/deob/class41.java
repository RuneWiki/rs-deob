package deob;

@ObfuscatedName("ab")
public class class41 extends class174 {

    @ObfuscatedName("ab.v")
    public static class170 field1031 = new class170(64);

    @ObfuscatedName("ab.m")
    public int field1033 = 0;

    @ObfuscatedName("cn.i(Ler;I)V")
    public static void method1884(class152 arg0) {
        Statics.field1032 = arg0;
    }

    @ObfuscatedName("dm.v(IB)Lab;")
    public static class41 method2420(int arg0) {
        class41 var1 = (class41) field1031.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1032.method3032(5, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method909(new class127(var2));
        }
        field1031.method3307(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.m(Lda;I)V")
    public void method909(class127 arg0) {
        while (true) {
            int var2 = arg0.method2491();
            if (var2 == 0) {
                return;
            }
            this.method902(arg0, var2);
        }
    }

    @ObfuscatedName("ab.j(Lda;IB)V")
    public void method902(class127 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1033 = arg0.method2493();
        }
    }
}
