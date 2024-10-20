package deob;

@ObfuscatedName("il")
public class class242 extends class195 {

    @ObfuscatedName("il.q")
    public static class190 field3282 = new class190(64);

    @ObfuscatedName("il.o")
    public int field3280 = 0;

    @ObfuscatedName("bd.w(II)Lil;")
    public static class242 method997(int arg0) {
        class242 var1 = (class242) field3282.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3284.method3876(16, arg0);
        class242 var3 = new class242();
        if (var2 != null) {
            var3.method4024(new class174(var2));
        }
        field3282.method3371(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("il.s(Lfz;I)V")
    public void method4024(class174 arg0) {
        while (true) {
            int var2 = arg0.method2971();
            if (var2 == 0) {
                return;
            }
            this.method4023(arg0, var2);
        }
    }

    @ObfuscatedName("il.q(Lfz;II)V")
    public void method4023(class174 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3280 = arg0.method3178();
        }
    }

    @ObfuscatedName("el.o(I)V")
    public static void method2702() {
        field3282.method3361();
    }
}
