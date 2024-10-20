package deob;

@ObfuscatedName("aq")
public class class46 extends class195 {

    @ObfuscatedName("aq.b")
    public static class184 field1016 = new class184(64);

    @ObfuscatedName("aq.p")
    public int field1012 = 0;

    @ObfuscatedName("al.t(Lfj;I)V")
    public static void method737(class158 arg0) {
        Statics.field1014 = arg0;
    }

    @ObfuscatedName("cn.b(II)Laq;")
    public static class46 method2005(int arg0) {
        class46 var1 = (class46) field1016.method3339((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1014.method2881(5, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method919(new class111(var2));
        }
        field1016.method3341(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.p(Ldc;I)V")
    public void method919(class111 arg0) {
        while (true) {
            int var2 = arg0.method2172();
            if (var2 == 0) {
                return;
            }
            this.method920(arg0, var2);
        }
    }

    @ObfuscatedName("aq.e(Ldc;II)V")
    public void method920(class111 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1012 = arg0.method2255();
        }
    }
}
