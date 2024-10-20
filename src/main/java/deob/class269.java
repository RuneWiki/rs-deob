package deob;

@ObfuscatedName("js")
public class class269 extends class219 {

    @ObfuscatedName("js.t")
    public static class213 field3452 = new class213(64);

    @ObfuscatedName("js.d")
    public int field3453 = 0;

    @ObfuscatedName("ee.o(Ljf;I)V")
    public static void method2881(class262 arg0) {
        Statics.field3451 = arg0;
        Statics.field3778 = Statics.field3451.method4207(16);
    }

    @ObfuscatedName("er.k(IB)Ljs;")
    public static class269 method2870(int arg0) {
        class269 var1 = (class269) field3452.method3601((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3451.method4241(16, arg0);
        class269 var3 = new class269();
        if (var2 != null) {
            var3.method4341(new class195(var2));
        }
        field3452.method3603(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("js.t(Lgc;B)V")
    public void method4341(class195 arg0) {
        while (true) {
            int var2 = arg0.method3205();
            if (var2 == 0) {
                return;
            }
            this.method4340(arg0, var2);
        }
    }

    @ObfuscatedName("js.d(Lgc;II)V")
    public void method4340(class195 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3453 = arg0.method3207();
        }
    }

    @ObfuscatedName("ab.h(B)V")
    public static void method226() {
        field3452.method3604();
    }
}
