package deob;

@ObfuscatedName("ab")
public class class42 extends class182 {

    @ObfuscatedName("ab.v")
    public static class171 field977 = new class171(64);

    @ObfuscatedName("ab.z")
    public int field979;

    @ObfuscatedName("ab.h")
    public int field972;

    @ObfuscatedName("ab.k")
    public int field971;

    @ObfuscatedName("j.g(Lec;B)V")
    public static void method91(class146 arg0) {
        Statics.field973 = arg0;
    }

    @ObfuscatedName("c.v(II)Lab;")
    public static class42 method514(int arg0) {
        class42 var1 = (class42) field977.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field973.method2708(14, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method831(new class107(var2));
        }
        field977.method3167(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.z(Ldm;S)V")
    public void method831(class107 arg0) {
        while (true) {
            int var2 = arg0.method2139();
            if (var2 == 0) {
                return;
            }
            this.method829(arg0, var2);
        }
    }

    @ObfuscatedName("ab.h(Ldm;II)V")
    public void method829(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field979 = arg0.method2141();
            this.field972 = arg0.method2139();
            this.field971 = arg0.method2139();
        }
    }

    @ObfuscatedName("aq.k(I)V")
    public static void method588() {
        field977.method3176();
    }
}
