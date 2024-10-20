package deob;

@ObfuscatedName("ak")
public class class51 extends class208 {

    @ObfuscatedName("ak.w")
    public static class197 field1106 = new class197(64);

    @ObfuscatedName("ak.e")
    public int field1113;

    @ObfuscatedName("ak.o")
    public int field1108;

    @ObfuscatedName("ak.g")
    public int field1107;

    @ObfuscatedName("r.m(II)Lak;")
    public static class51 method99(int arg0) {
        class51 var1 = (class51) field1106.method3556((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1109.method3086(14, arg0);
        class51 var3 = new class51();
        if (var2 != null) {
            var3.method1015(new class123(var2));
        }
        field1106.method3562(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.w(Ldj;I)V")
    public void method1015(class123 arg0) {
        while (true) {
            int var2 = arg0.method2398();
            if (var2 == 0) {
                return;
            }
            this.method1014(arg0, var2);
        }
    }

    @ObfuscatedName("ak.e(Ldj;IB)V")
    public void method1014(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1113 = arg0.method2548();
            this.field1108 = arg0.method2398();
            this.field1107 = arg0.method2398();
        }
    }

    @ObfuscatedName("ev.o(I)V")
    public static void method2866() {
        field1106.method3553();
    }
}
