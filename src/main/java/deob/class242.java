package deob;

@ObfuscatedName("ii")
public class class242 extends class196 {

    @ObfuscatedName("ii.h")
    public static class191 field3267 = new class191(64);

    @ObfuscatedName("ii.f")
    public int field3268 = 0;

    @ObfuscatedName("an.j(Lia;I)V")
    public static void method240(class237 arg0) {
        Statics.field3269 = arg0;
    }

    @ObfuscatedName("h.h(IB)Lii;")
    public static class242 method3(int arg0) {
        class242 var1 = (class242) field3267.method3271((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3269.method3773(5, arg0);
        class242 var3 = new class242();
        if (var2 != null) {
            var3.method3922(new class175(var2));
        }
        field3267.method3270(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ii.f(Lfb;I)V")
    public void method3922(class175 arg0) {
        while (true) {
            int var2 = arg0.method2903();
            if (var2 == 0) {
                return;
            }
            this.method3921(arg0, var2);
        }
    }

    @ObfuscatedName("ii.p(Lfb;II)V")
    public void method3921(class175 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3268 = arg0.method3023();
        }
    }
}
