package deob;

@ObfuscatedName("ik")
public class class242 extends class195 {

    @ObfuscatedName("ik.n")
    public static class190 field3285 = new class190(64);

    @ObfuscatedName("ik.r")
    public int field3286 = 0;

    @ObfuscatedName("fx.a(Lif;I)V")
    public static void method3098(class236 arg0) {
        Statics.field12 = arg0;
        Statics.field3284 = Statics.field12.method3793(16);
    }

    @ObfuscatedName("fw.j(II)Lik;")
    public static class242 method2842(int arg0) {
        class242 var1 = (class242) field3285.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field12.method3787(16, arg0);
        class242 var3 = new class242();
        if (var2 != null) {
            var3.method3903(new class174(var2));
        }
        field3285.method3247(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ik.n(Lfe;B)V")
    public void method3903(class174 arg0) {
        while (true) {
            int var2 = arg0.method2871();
            if (var2 == 0) {
                return;
            }
            this.method3913(arg0, var2);
        }
    }

    @ObfuscatedName("ik.r(Lfe;II)V")
    public void method3913(class174 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3286 = arg0.method2873();
        }
    }

    @ObfuscatedName("f.v(I)V")
    public static void method121() {
        field3285.method3244();
    }
}
