package deob;

@ObfuscatedName("ik")
public class class254 extends class196 {

    @ObfuscatedName("ik.h")
    public static class191 field3383 = new class191(64);

    @ObfuscatedName("ik.f")
    public class188 field3384;

    @ObfuscatedName("ar.j(Lia;B)V")
    public static void method245(class237 arg0) {
        Statics.field3386 = arg0;
    }

    @ObfuscatedName("aq.h(II)Lik;")
    public static class254 method651(int arg0) {
        class254 var1 = (class254) field3383.method3271((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3386.method3773(34, arg0);
        class254 var3 = new class254();
        if (var2 != null) {
            var3.method4118(new class175(var2));
        }
        var3.method4120();
        field3383.method3270(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ik.f(I)V")
    public void method4120() {
    }

    @ObfuscatedName("ik.p(Lfb;I)V")
    public void method4118(class175 arg0) {
        while (true) {
            int var2 = arg0.method2903();
            if (var2 == 0) {
                return;
            }
            this.method4119(arg0, var2);
        }
    }

    @ObfuscatedName("ik.x(Lfb;II)V")
    public void method4119(class175 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3384 = class251.method3769(arg0, this.field3384);
        }
    }

    @ObfuscatedName("ik.g(III)I")
    public int method4124(int arg0, int arg1) {
        return class251.method1735(this.field3384, arg0, arg1);
    }

    @ObfuscatedName("ik.c(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4117(int arg0, String arg1) {
        return class251.method246(this.field3384, arg0, arg1);
    }
}
