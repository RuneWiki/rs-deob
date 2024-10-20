package deob;

@ObfuscatedName("ar")
public class class42 extends class182 {

    @ObfuscatedName("ar.v")
    public static class171 field965 = new class171(64);

    @ObfuscatedName("ar.i")
    public int field964;

    @ObfuscatedName("ar.g")
    public int field967;

    @ObfuscatedName("ar.x")
    public int field966;

    @ObfuscatedName("ec.e(Les;I)V")
    public static void method2874(class146 arg0) {
        Statics.field962 = arg0;
    }

    @ObfuscatedName("cl.v(IB)Lar;")
    public static class42 method2057(int arg0) {
        class42 var1 = (class42) field965.method3136((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field962.method2695(14, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method792(new class107(var2));
        }
        field965.method3127(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.i(Ldk;I)V")
    public void method792(class107 arg0) {
        while (true) {
            int var2 = arg0.method2226();
            if (var2 == 0) {
                return;
            }
            this.method797(arg0, var2);
        }
    }

    @ObfuscatedName("ar.g(Ldk;IS)V")
    public void method797(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field964 = arg0.method2152();
            this.field967 = arg0.method2226();
            this.field966 = arg0.method2226();
        }
    }

    @ObfuscatedName("e.x(I)V")
    public static void method6() {
        field965.method3128();
    }
}
