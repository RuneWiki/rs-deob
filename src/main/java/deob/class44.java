package deob;

@ObfuscatedName("ae")
public class class44 extends class181 {

    @ObfuscatedName("ae.j")
    public static class171 field974 = new class171(64);

    @ObfuscatedName("ae.a")
    public int field976 = 0;

    @ObfuscatedName("w.z(II)Lae;")
    public static class44 method169(int arg0) {
        class44 var1 = (class44) field974.method3162((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field975.method2705(5, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method814(new class107(var2));
        }
        field974.method3171(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.j(Ldq;B)V")
    public void method814(class107 arg0) {
        while (true) {
            int var2 = arg0.method2122();
            if (var2 == 0) {
                return;
            }
            this.method815(arg0, var2);
        }
    }

    @ObfuscatedName("ae.a(Ldq;II)V")
    public void method815(class107 arg0, int arg1) {
        if (arg1 == 2) {
            this.field976 = arg0.method2239();
        }
    }
}
