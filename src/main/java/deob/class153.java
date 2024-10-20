package deob;

@ObfuscatedName("ef")
public class class153 extends class365 {

    @ObfuscatedName("ef.s")
    public static class236 field1613 = new class236(64);

    @ObfuscatedName("ef.a")
    public int field1616 = 0;

    @ObfuscatedName("cc.i(Lko;I)V")
    public static void method2192(class290 arg0) {
        Statics.field1615 = arg0;
        Statics.field1617 = Statics.field1615.method4768(16);
    }

    @ObfuscatedName("ba.w(II)Lef;")
    public static class153 method1947(int arg0) {
        class153 var1 = (class153) field1613.method4205((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1615.method4743(16, arg0);
        class153 var3 = new class153();
        if (var2 != null) {
            var3.method2679(new class401(var2));
        }
        field1613.method4206(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ef.s(Lop;B)V")
    public void method2679(class401 arg0) {
        while (true) {
            int var2 = arg0.method6240();
            if (var2 == 0) {
                return;
            }
            this.method2680(arg0, var2);
        }
    }

    @ObfuscatedName("ef.a(Lop;II)V")
    public void method2680(class401 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1616 = arg0.method6242();
        }
    }
}
