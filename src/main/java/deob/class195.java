package deob;

@ObfuscatedName("gh")
public class class195 extends class130 {

    @ObfuscatedName("gh.d")
    public static class125 field2853 = new class125(64);

    @ObfuscatedName("gh.h")
    public int field2849;

    @ObfuscatedName("gh.p")
    public int field2851;

    @ObfuscatedName("gh.j")
    public int field2848;

    @ObfuscatedName("am.q(Lgj;I)V")
    public static void method684(class183 arg0) {
        Statics.field785 = arg0;
    }

    @ObfuscatedName("fi.d(II)Lgh;")
    public static class195 method2980(int arg0) {
        class195 var1 = (class195) field2853.method2258((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field785.method3133(14, arg0);
        class195 var3 = new class195();
        if (var2 != null) {
            var3.method3356(new class154(var2));
        }
        field2853.method2248(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gh.h(Lel;B)V")
    public void method3356(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3357(arg0, var2);
        }
    }

    @ObfuscatedName("gh.p(Lel;II)V")
    public void method3357(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2849 = arg0.method2668();
            this.field2851 = arg0.method2666();
            this.field2848 = arg0.method2666();
        }
    }
}
