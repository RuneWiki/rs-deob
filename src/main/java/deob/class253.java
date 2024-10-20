package deob;

@ObfuscatedName("in")
public class class253 extends class206 {

    @ObfuscatedName("in.m")
    public static class201 field3368 = new class201(64);

    @ObfuscatedName("in.h")
    public int field3370 = 0;

    @ObfuscatedName("fz.s(II)Lin;")
    public static class253 method3037(int arg0) {
        class253 var1 = (class253) field3368.method3673((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field290.method4231(16, arg0);
        class253 var3 = new class253();
        if (var2 != null) {
            var3.method4339(new class185(var2));
        }
        field3368.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("in.g(Lgy;B)V")
    public void method4339(class185 arg0) {
        while (true) {
            int var2 = arg0.method3239();
            if (var2 == 0) {
                return;
            }
            this.method4340(arg0, var2);
        }
    }

    @ObfuscatedName("in.m(Lgy;II)V")
    public void method4340(class185 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3370 = arg0.method3241();
        }
    }

    @ObfuscatedName("co.h(I)V")
    public static void method1710() {
        field3368.method3674();
    }
}
