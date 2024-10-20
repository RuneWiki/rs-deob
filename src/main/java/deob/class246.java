package deob;

@ObfuscatedName("iu")
public class class246 extends class196 {

    @ObfuscatedName("iu.n")
    public static class191 field3315 = new class191(64);

    @ObfuscatedName("iu.g")
    public boolean field3309 = false;

    @ObfuscatedName("eu.e(II)Liu;")
    public static class246 method2713(int arg0) {
        class246 var1 = (class246) field3315.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field339.method3817(15, arg0);
        class246 var3 = new class246();
        if (var2 != null) {
            var3.method4013(new class175(var2));
        }
        field3315.method3278(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iu.n(Lfh;B)V")
    public void method4013(class175 arg0) {
        while (true) {
            int var2 = arg0.method2928();
            if (var2 == 0) {
                return;
            }
            this.method4009(arg0, var2);
        }
    }

    @ObfuscatedName("iu.g(Lfh;IB)V")
    public void method4009(class175 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3309 = true;
        }
    }
}
