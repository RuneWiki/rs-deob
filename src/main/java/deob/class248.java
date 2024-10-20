package deob;

@ObfuscatedName("iz")
public class class248 extends class198 {

    @ObfuscatedName("iz.c")
    public static class193 field3333 = new class193(64);

    @ObfuscatedName("iz.f")
    public boolean field3334 = false;

    @ObfuscatedName("dc.s(Liw;B)V")
    public static void method2324(class239 arg0) {
        Statics.field3332 = arg0;
    }

    @ObfuscatedName("x.c(II)Liz;")
    public static class248 method162(int arg0) {
        class248 var1 = (class248) field3333.method3319((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3332.method3840(15, arg0);
        class248 var3 = new class248();
        if (var2 != null) {
            var3.method4038(new class177(var2));
        }
        field3333.method3315(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iz.f(Lfs;I)V")
    public void method4038(class177 arg0) {
        while (true) {
            int var2 = arg0.method2965();
            if (var2 == 0) {
                return;
            }
            this.method4037(arg0, var2);
        }
    }

    @ObfuscatedName("iz.m(Lfs;II)V")
    public void method4037(class177 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3334 = true;
        }
    }
}
