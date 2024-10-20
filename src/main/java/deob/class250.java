package deob;

@ObfuscatedName("il")
public class class250 extends class185 {

    @ObfuscatedName("il.o")
    public static class155 field3235 = new class155(64);

    @ObfuscatedName("il.q")
    public int field3233 = 0;

    @ObfuscatedName("ix.m(II)Lil;")
    public static class250 method4088(int arg0) {
        class250 var1 = (class250) field3235.method3127((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3234.method3891(5, arg0);
        class250 var3 = new class250();
        if (var2 != null) {
            var3.method4093(new class310(var2));
        }
        field3235.method3137(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("il.o(Lkn;B)V")
    public void method4093(class310 arg0) {
        while (true) {
            int var2 = arg0.method5227();
            if (var2 == 0) {
                return;
            }
            this.method4094(arg0, var2);
        }
    }

    @ObfuscatedName("il.q(Lkn;II)V")
    public void method4094(class310 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3233 = arg0.method5283();
        }
    }
}
