package deob;

@ObfuscatedName("ac")
public class class179 extends class77 {

    @ObfuscatedName("ac.o")
    public static class67 field2655 = new class67(64);

    @ObfuscatedName("ac.t")
    public int field2664 = 0;

    @ObfuscatedName("ac.o(Ldy;II)V")
    public void method3395(class31 arg0, int arg1) {
        if (arg1 == 5) {
            this.field2664 = arg0.method373();
        }
    }

    @ObfuscatedName("ac.p(Ldy;I)V")
    public void method3408(class31 arg0) {
        while (true) {
            int var2 = arg0.method512();
            if (var2 == 0) {
                return;
            }
            this.method3395(arg0, var2);
        }
    }

    @ObfuscatedName("by.t(B)V")
    public static void method1931() {
        field2655.method910();
    }

    @ObfuscatedName("ar.j(II)Lac;")
    public static class179 method3127(int arg0) {
        class179 var1 = (class179) field2655.method908((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2654.method1083(16, arg0);
        class179 var3 = new class179();
        if (var2 != null) {
            var3.method3408(new class31(var2));
        }
        field2655.method907(var3, (long) arg0);
        return var3;
    }
}
