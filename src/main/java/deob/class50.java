package deob;

@ObfuscatedName("au")
public class class50 extends class204 {

    @ObfuscatedName("au.r")
    public static class193 field1090 = new class193(64);

    @ObfuscatedName("au.f")
    public boolean field1091 = false;

    @ObfuscatedName("en.a(Lfz;I)V")
    public static void method2807(class167 arg0) {
        Statics.field1092 = arg0;
    }

    @ObfuscatedName("f.r(IB)Lau;")
    public static class50 method29(int arg0) {
        class50 var1 = (class50) field1090.method3507((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1092.method3025(15, arg0);
        class50 var3 = new class50();
        if (var2 != null) {
            var3.method996(new class119(var2));
        }
        field1090.method3509(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.f(Lds;B)V")
    public void method996(class119 arg0) {
        while (true) {
            int var2 = arg0.method2412();
            if (var2 == 0) {
                return;
            }
            this.method995(arg0, var2);
        }
    }

    @ObfuscatedName("au.s(Lds;IB)V")
    public void method995(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1091 = true;
        }
    }
}
