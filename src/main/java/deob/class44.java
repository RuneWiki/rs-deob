package deob;

@ObfuscatedName("ae")
public class class44 extends class182 {

    @ObfuscatedName("ae.v")
    public static class171 field995 = new class171(64);

    @ObfuscatedName("ae.z")
    public int field996 = 0;

    @ObfuscatedName("du.g(II)Lae;")
    public static class44 method2512(int arg0) {
        class44 var1 = (class44) field995.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field999.method2708(5, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method850(new class107(var2));
        }
        field995.method3167(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.v(Ldm;S)V")
    public void method850(class107 arg0) {
        while (true) {
            int var2 = arg0.method2139();
            if (var2 == 0) {
                return;
            }
            this.method852(arg0, var2);
        }
    }

    @ObfuscatedName("ae.z(Ldm;II)V")
    public void method852(class107 arg0, int arg1) {
        if (arg1 == 2) {
            this.field996 = arg0.method2141();
        }
    }
}
