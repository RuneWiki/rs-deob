package deob;

@ObfuscatedName("aj")
public class class38 extends class174 {

    @ObfuscatedName("aj.g")
    public static class170 field952 = new class170(64);

    @ObfuscatedName("aj.a")
    public int field953;

    @ObfuscatedName("aj.t")
    public int field954;

    @ObfuscatedName("aj.f")
    public int field955;

    @ObfuscatedName("ch.d(II)Laj;")
    public static class38 method2001(int arg0) {
        class38 var1 = (class38) field952.method3210((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field956.method2958(14, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method783(new class127(var2));
        }
        field952.method3221(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.g(Ldo;I)V")
    public void method783(class127 arg0) {
        while (true) {
            int var2 = arg0.method2509();
            if (var2 == 0) {
                return;
            }
            this.method784(arg0, var2);
        }
    }

    @ObfuscatedName("aj.a(Ldo;IB)V")
    public void method784(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field953 = arg0.method2512();
            this.field954 = arg0.method2509();
            this.field955 = arg0.method2509();
        }
    }

    @ObfuscatedName("t.t(I)V")
    public static void method33() {
        field952.method3209();
    }
}
