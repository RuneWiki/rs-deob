package deob;

@ObfuscatedName("aw")
public class class38 extends class174 {

    @ObfuscatedName("aw.v")
    public static class170 field961 = new class170(64);

    @ObfuscatedName("aw.m")
    public int field964;

    @ObfuscatedName("aw.j")
    public int field963;

    @ObfuscatedName("aw.o")
    public int field969;

    @ObfuscatedName("t.i(IB)Law;")
    public static class38 method235(int arg0) {
        class38 var1 = (class38) field961.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field967.method3032(14, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method823(new class127(var2));
        }
        field961.method3307(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.v(Lda;B)V")
    public void method823(class127 arg0) {
        while (true) {
            int var2 = arg0.method2491();
            if (var2 == 0) {
                return;
            }
            this.method824(arg0, var2);
        }
    }

    @ObfuscatedName("aw.m(Lda;IB)V")
    public void method824(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field964 = arg0.method2493();
            this.field963 = arg0.method2491();
            this.field969 = arg0.method2491();
        }
    }

    @ObfuscatedName("h.j(I)V")
    public static void method144() {
        field961.method3311();
    }
}
