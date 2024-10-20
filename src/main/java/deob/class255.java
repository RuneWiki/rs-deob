package deob;

@ObfuscatedName("is")
public class class255 extends class206 {

    @ObfuscatedName("is.g")
    public static class201 field3400 = new class201(64);

    @ObfuscatedName("is.m")
    public boolean field3399 = false;

    @ObfuscatedName("gk.s(Lir;B)V")
    public static void method3220(class247 arg0) {
        Statics.field3401 = arg0;
    }

    @ObfuscatedName("if.g(II)Lis;")
    public static class255 method4327(int arg0) {
        class255 var1 = (class255) field3400.method3673((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3401.method4231(19, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4389(new class185(var2));
        }
        field3400.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("is.m(Lgy;I)V")
    public void method4389(class185 arg0) {
        while (true) {
            int var2 = arg0.method3239();
            if (var2 == 0) {
                return;
            }
            this.method4380(arg0, var2);
        }
    }

    @ObfuscatedName("is.h(Lgy;II)V")
    public void method4380(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3399 = true;
        }
    }
}
