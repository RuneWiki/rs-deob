package deob;

@ObfuscatedName("iy")
public class class245 extends class196 {

    @ObfuscatedName("iy.h")
    public static class191 field3305 = new class191(64);

    @ObfuscatedName("iy.f")
    public boolean field3306 = false;

    @ObfuscatedName("cv.j(Lia;S)V")
    public static void method1571(class237 arg0) {
        Statics.field2306 = arg0;
    }

    @ObfuscatedName("t.h(IB)Liy;")
    public static class245 method133(int arg0) {
        class245 var1 = (class245) field3305.method3271((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2306.method3773(19, arg0);
        class245 var3 = new class245();
        if (var2 != null) {
            var3.method3979(new class175(var2));
        }
        field3305.method3270(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iy.f(Lfb;B)V")
    public void method3979(class175 arg0) {
        while (true) {
            int var2 = arg0.method2903();
            if (var2 == 0) {
                return;
            }
            this.method3992(arg0, var2);
        }
    }

    @ObfuscatedName("iy.p(Lfb;IB)V")
    public void method3992(class175 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3306 = true;
        }
    }
}
