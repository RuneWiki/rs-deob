package deob;

@ObfuscatedName("bs")
public class class53 extends class204 {

    @ObfuscatedName("bs.a")
    public static class193 field1166 = new class193(64);

    @ObfuscatedName("bs.i")
    public int field1169 = 0;

    @ObfuscatedName("ek.j(Lff;I)V")
    public static void method2907(class167 arg0) {
        Statics.field1173 = arg0;
        Statics.field1167 = Statics.field1173.method3015(16);
    }

    @ObfuscatedName("h.l(II)Lbs;")
    public static class53 method96(int arg0) {
        class53 var1 = (class53) field1166.method3466((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1173.method3005(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1078(new class119(var2));
        }
        field1166.method3468(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bs.a(Ldc;I)V")
    public void method1078(class119 arg0) {
        while (true) {
            int var2 = arg0.method2316();
            if (var2 == 0) {
                return;
            }
            this.method1067(arg0, var2);
        }
    }

    @ObfuscatedName("bs.i(Ldc;II)V")
    public void method1067(class119 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1169 = arg0.method2318();
        }
    }
}
