package deob;

@ObfuscatedName("hb")
public class class183 extends class439 {

    @ObfuscatedName("hb.al")
    public static class276 field1883 = new class276(64);

    @ObfuscatedName("hb.ac")
    public int field1884 = 0;

    @ObfuscatedName("de.al(II)Lhb;")
    public static class183 method2156(int arg0) {
        class183 var1 = (class183) field1883.method4921((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1890.method5860(5, arg0);
        class183 var3 = new class183();
        if (var2 != null) {
            var3.method3232(new class478(var2));
        }
        field1883.method4923(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hb.ac(Lsy;I)V")
    public void method3232(class478 arg0) {
        while (true) {
            int var2 = arg0.method7909();
            if (var2 == 0) {
                return;
            }
            this.method3236(arg0, var2);
        }
    }

    @ObfuscatedName("hb.ab(Lsy;II)V")
    public void method3236(class478 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1884 = arg0.method7905();
        }
    }
}
