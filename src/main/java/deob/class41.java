package deob;

@ObfuscatedName("ap")
public class class41 extends class174 {

    @ObfuscatedName("ap.t")
    public static class170 field1016 = new class170(64);

    @ObfuscatedName("ap.n")
    public int field1019 = 0;

    @ObfuscatedName("i.f(Leo;I)V")
    public static void method238(class153 arg0) {
        Statics.field1015 = arg0;
    }

    @ObfuscatedName("aq.t(II)Lap;")
    public static class41 method872(int arg0) {
        class41 var1 = (class41) field1016.method3276((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1015.method3035(5, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method877(new class127(var2));
        }
        field1016.method3275(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.n(Ldq;I)V")
    public void method877(class127 arg0) {
        while (true) {
            int var2 = arg0.method2458();
            if (var2 == 0) {
                return;
            }
            this.method881(arg0, var2);
        }
    }

    @ObfuscatedName("ap.e(Ldq;II)V")
    public void method881(class127 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1019 = arg0.method2460();
        }
    }
}
