package deob;

@ObfuscatedName("jm")
public class class271 extends class219 {

    @ObfuscatedName("jm.k")
    public static class213 field3476 = new class213(64);

    @ObfuscatedName("jm.t")
    public boolean field3475 = false;

    @ObfuscatedName("db.o(Ljf;B)V")
    public static void method2365(class262 arg0) {
        Statics.field3477 = arg0;
    }

    @ObfuscatedName("it.k(II)Ljm;")
    public static class271 method4053(int arg0) {
        class271 var1 = (class271) field3476.method3601((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3477.method4241(19, arg0);
        class271 var3 = new class271();
        if (var2 != null) {
            var3.method4387(new class195(var2));
        }
        field3476.method3603(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jm.t(Lgc;I)V")
    public void method4387(class195 arg0) {
        while (true) {
            int var2 = arg0.method3205();
            if (var2 == 0) {
                return;
            }
            this.method4388(arg0, var2);
        }
    }

    @ObfuscatedName("jm.d(Lgc;II)V")
    public void method4388(class195 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3475 = true;
        }
    }
}
