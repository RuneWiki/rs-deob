package deob;

@ObfuscatedName("fg")
public class class162 extends class142 {

    @ObfuscatedName("fg.l")
    public static class100 field2472 = new class100(64);

    @ObfuscatedName("fg.i")
    public int field2470 = 0;

    @ObfuscatedName("fu.i(Lcy;I)V")
    public static void method2456(class86 arg0) {
        Statics.field2471 = arg0;
    }

    @ObfuscatedName("fj.e(II)Lfg;")
    public static class162 method2543(int arg0) {
        class162 var1 = (class162) field2472.method1231((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2471.method1015(5, arg0);
        class162 var3 = new class162();
        if (var2 != null) {
            var3.method2556(new class135(var2));
        }
        field2472.method1232(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fg.a(Lec;I)V")
    public void method2556(class135 arg0) {
        while (true) {
            int var2 = arg0.method1571();
            if (var2 == 0) {
                return;
            }
            this.method2546(arg0, var2);
        }
    }

    @ObfuscatedName("fg.g(Lec;II)V")
    public void method2546(class135 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2470 = arg0.method1725();
        }
    }
}
