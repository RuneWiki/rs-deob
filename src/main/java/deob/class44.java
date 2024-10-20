package deob;

@ObfuscatedName("au")
public class class44 extends class180 {

    @ObfuscatedName("au.p")
    public static class170 field990 = new class170(64);

    @ObfuscatedName("au.a")
    public int field998 = 0;

    @ObfuscatedName("m.e(Lec;I)V")
    public static void method73(class145 arg0) {
        Statics.field994 = arg0;
    }

    @ObfuscatedName("s.p(II)Lau;")
    public static class44 method505(int arg0) {
        class44 var1 = (class44) field990.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field994.method2717(5, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method852(new class107(var2));
        }
        field990.method3161(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.a(Ldp;I)V")
    public void method852(class107 arg0) {
        while (true) {
            int var2 = arg0.method2125();
            if (var2 == 0) {
                return;
            }
            this.method865(arg0, var2);
        }
    }

    @ObfuscatedName("au.g(Ldp;II)V")
    public void method865(class107 arg0, int arg1) {
        if (arg1 == 2) {
            this.field998 = arg0.method2182();
        }
    }
}
