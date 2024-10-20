package deob;

@ObfuscatedName("aa")
public class class50 extends class205 {

    @ObfuscatedName("aa.w")
    public static class194 field1099 = new class194(64);

    @ObfuscatedName("aa.d")
    public boolean field1100 = false;

    @ObfuscatedName("o.a(Lft;I)V")
    public static void method670(class168 arg0) {
        Statics.field1102 = arg0;
    }

    @ObfuscatedName("aa.w(Ldx;S)V")
    public void method1088(class120 arg0) {
        while (true) {
            int var2 = arg0.method2462();
            if (var2 == 0) {
                return;
            }
            this.method1083(arg0, var2);
        }
    }

    @ObfuscatedName("aa.d(Ldx;II)V")
    public void method1083(class120 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1100 = true;
        }
    }
}
