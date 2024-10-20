package deob;

@ObfuscatedName("ax")
public class class41 extends class174 {

    @ObfuscatedName("ax.x")
    public static class170 field1048 = new class170(64);

    @ObfuscatedName("ax.e")
    public int field1049 = 0;

    @ObfuscatedName("ae.a(Leb;I)V")
    public static void method811(class152 arg0) {
        Statics.field1047 = arg0;
    }

    @ObfuscatedName("da.x(II)Lax;")
    public static class41 method2176(int arg0) {
        class41 var1 = (class41) field1048.method3196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1047.method2961(5, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method887(new class127(var2));
        }
        field1048.method3193(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.e(Ldy;B)V")
    public void method887(class127 arg0) {
        while (true) {
            int var2 = arg0.method2411();
            if (var2 == 0) {
                return;
            }
            this.method886(arg0, var2);
        }
    }

    @ObfuscatedName("ax.r(Ldy;II)V")
    public void method886(class127 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1049 = arg0.method2413();
        }
    }
}
