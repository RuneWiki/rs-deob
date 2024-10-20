package deob;

@ObfuscatedName("ak")
public class class42 extends class174 {

    @ObfuscatedName("ak.o")
    public static class170 field1041 = new class170(64);

    @ObfuscatedName("ak.n")
    public int field1042 = 0;

    @ObfuscatedName("ar.p(Lep;I)V")
    public static void method815(class152 arg0) {
        Statics.field1039 = arg0;
        Statics.field1040 = Statics.field1039.method3008(16);
    }

    @ObfuscatedName("bu.i(II)Lak;")
    public static class42 method1439(int arg0) {
        class42 var1 = (class42) field1041.method3264((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1039.method3049(16, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method910(new class127(var2));
        }
        field1041.method3269(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.o(Ldt;I)V")
    public void method910(class127 arg0) {
        while (true) {
            int var2 = arg0.method2659();
            if (var2 == 0) {
                return;
            }
            this.method912(arg0, var2);
        }
    }

    @ObfuscatedName("ak.n(Ldt;II)V")
    public void method912(class127 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1042 = arg0.method2652();
        }
    }

    @ObfuscatedName("bn.l(I)V")
    public static void method1441() {
        field1041.method3265();
    }
}
