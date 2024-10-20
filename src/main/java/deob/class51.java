package deob;

@ObfuscatedName("av")
public class class51 extends class205 {

    @ObfuscatedName("av.w")
    public static class194 field1107 = new class194(64);

    @ObfuscatedName("av.d")
    public int field1112 = 0;

    @ObfuscatedName("i.a(Lft;I)V")
    public static void method191(class168 arg0) {
        Statics.field3169 = arg0;
    }

    @ObfuscatedName("by.w(II)Lav;")
    public static class51 method1307(int arg0) {
        class51 var1 = (class51) field1107.method3579((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3169.method3188(5, arg0);
        class51 var3 = new class51();
        if (var2 != null) {
            var3.method1091(new class120(var2));
        }
        field1107.method3581(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.d(Ldx;B)V")
    public void method1091(class120 arg0) {
        while (true) {
            int var2 = arg0.method2462();
            if (var2 == 0) {
                return;
            }
            this.method1100(arg0, var2);
        }
    }

    @ObfuscatedName("av.c(Ldx;IB)V")
    public void method1100(class120 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1112 = arg0.method2464();
        }
    }
}
