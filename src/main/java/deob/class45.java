package deob;

@ObfuscatedName("al")
public class class45 extends class185 {

    @ObfuscatedName("al.v")
    public static class174 field1019 = new class174(64);

    @ObfuscatedName("al.m")
    public int field1012 = 0;

    @ObfuscatedName("ar.x(Ley;I)V")
    public static void method737(class149 arg0) {
        Statics.field1013 = arg0;
    }

    @ObfuscatedName("j.v(IB)Lal;")
    public static class45 method79(int arg0) {
        class45 var1 = (class45) field1019.method3186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1013.method2751(5, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method852(new class108(var2));
        }
        field1019.method3183(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.m(Ldm;B)V")
    public void method852(class108 arg0) {
        while (true) {
            int var2 = arg0.method2299();
            if (var2 == 0) {
                return;
            }
            this.method855(arg0, var2);
        }
    }

    @ObfuscatedName("al.e(Ldm;IB)V")
    public void method855(class108 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1012 = arg0.method2129();
        }
    }
}
