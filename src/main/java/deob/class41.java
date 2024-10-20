package deob;

@ObfuscatedName("ac")
public class class41 extends class174 {

    @ObfuscatedName("ac.i")
    public static class170 field1033 = new class170(64);

    @ObfuscatedName("ac.o")
    public int field1034 = 0;

    @ObfuscatedName("l.p(II)Lac;")
    public static class41 method44(int arg0) {
        class41 var1 = (class41) field1033.method3264((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1036.method3049(5, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method902(new class127(var2));
        }
        field1033.method3269(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.i(Ldt;B)V")
    public void method902(class127 arg0) {
        while (true) {
            int var2 = arg0.method2659();
            if (var2 == 0) {
                return;
            }
            this.method903(arg0, var2);
        }
    }

    @ObfuscatedName("ac.o(Ldt;IB)V")
    public void method903(class127 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1034 = arg0.method2652();
        }
    }
}
