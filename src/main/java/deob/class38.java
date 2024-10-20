package deob;

@ObfuscatedName("an")
public class class38 extends class174 {

    @ObfuscatedName("an.i")
    public static class170 field960 = new class170(64);

    @ObfuscatedName("an.o")
    public int field963;

    @ObfuscatedName("an.n")
    public int field962;

    @ObfuscatedName("an.l")
    public int field969;

    @ObfuscatedName("d.p(II)Lan;")
    public static class38 method137(int arg0) {
        class38 var1 = (class38) field960.method3264((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field961.method3049(14, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method836(new class127(var2));
        }
        field960.method3269(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.i(Ldt;B)V")
    public void method836(class127 arg0) {
        while (true) {
            int var2 = arg0.method2659();
            if (var2 == 0) {
                return;
            }
            this.method837(arg0, var2);
        }
    }

    @ObfuscatedName("an.o(Ldt;IB)V")
    public void method837(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field963 = arg0.method2652();
            this.field962 = arg0.method2659();
            this.field969 = arg0.method2659();
        }
    }
}
