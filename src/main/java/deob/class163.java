package deob;

@ObfuscatedName("fi")
public class class163 extends class142 {

    @ObfuscatedName("fi.i")
    public static class100 field2473 = new class100(64);

    @ObfuscatedName("fi.e")
    public int field2475 = 0;

    @ObfuscatedName("cf.i(Lcy;B)V")
    public static void method1201(class86 arg0) {
        Statics.field2474 = arg0;
        Statics.field687 = Statics.field2474.method1025(16);
    }

    @ObfuscatedName("eg.e(IB)Lfi;")
    public static class163 method1762(int arg0) {
        class163 var1 = (class163) field2473.method1231((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2474.method1015(16, arg0);
        class163 var3 = new class163();
        if (var2 != null) {
            var3.method2560(new class135(var2));
        }
        field2473.method1232(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fi.a(Lec;I)V")
    public void method2560(class135 arg0) {
        while (true) {
            int var2 = arg0.method1571();
            if (var2 == 0) {
                return;
            }
            this.method2570(arg0, var2);
        }
    }

    @ObfuscatedName("fi.g(Lec;II)V")
    public void method2570(class135 arg0, int arg1) {
        if (arg1 == 5) {
            this.field2475 = arg0.method1725();
        }
    }
}
