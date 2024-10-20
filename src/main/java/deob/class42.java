package deob;

@ObfuscatedName("ay")
public class class42 extends class174 {

    @ObfuscatedName("ay.m")
    public static class170 field1043 = new class170(64);

    @ObfuscatedName("ay.j")
    public int field1044 = 0;

    @ObfuscatedName("h.i(Ler;B)V")
    public static void method141(class152 arg0) {
        Statics.field1041 = arg0;
        Statics.field1042 = Statics.field1041.method3088(16);
    }

    @ObfuscatedName("f.v(IB)Lay;")
    public static class42 method102(int arg0) {
        class42 var1 = (class42) field1043.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1041.method3032(16, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method914(new class127(var2));
        }
        field1043.method3307(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.m(Lda;B)V")
    public void method914(class127 arg0) {
        while (true) {
            int var2 = arg0.method2491();
            if (var2 == 0) {
                return;
            }
            this.method915(arg0, var2);
        }
    }

    @ObfuscatedName("ay.j(Lda;IB)V")
    public void method915(class127 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1044 = arg0.method2493();
        }
    }

    @ObfuscatedName("dh.o(I)V")
    public static void method2348() {
        field1043.method3311();
    }
}
