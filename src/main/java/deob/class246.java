package deob;

@ObfuscatedName("in")
public class class246 extends class196 {

    @ObfuscatedName("in.h")
    public static class191 field3307 = new class191(64);

    @ObfuscatedName("in.f")
    public boolean field3309 = false;

    @ObfuscatedName("ao.j(Lia;B)V")
    public static void method220(class237 arg0) {
        Statics.field3308 = arg0;
    }

    @ObfuscatedName("in.h(Lfb;I)V")
    public void method4002(class175 arg0) {
        while (true) {
            int var2 = arg0.method2903();
            if (var2 == 0) {
                return;
            }
            this.method3999(arg0, var2);
        }
    }

    @ObfuscatedName("in.f(Lfb;II)V")
    public void method3999(class175 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3309 = true;
        }
    }
}
