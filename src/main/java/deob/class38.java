package deob;

@ObfuscatedName("ae")
public class class38 extends class174 {

    @ObfuscatedName("ae.l")
    public static class170 field975 = new class170(64);

    @ObfuscatedName("ae.c")
    public int field980;

    @ObfuscatedName("ae.d")
    public int field974;

    @ObfuscatedName("ae.b")
    public int field978;

    @ObfuscatedName("d.t(II)Lae;")
    public static class38 method43(int arg0) {
        class38 var1 = (class38) field975.method3260((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field983.method2987(14, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method828(new class127(var2));
        }
        field975.method3261(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.l(Ldo;I)V")
    public void method828(class127 arg0) {
        while (true) {
            int var2 = arg0.method2438();
            if (var2 == 0) {
                return;
            }
            this.method829(arg0, var2);
        }
    }

    @ObfuscatedName("ae.c(Ldo;IB)V")
    public void method829(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field980 = arg0.method2440();
            this.field974 = arg0.method2438();
            this.field978 = arg0.method2438();
        }
    }

    @ObfuscatedName("b.d(I)V")
    public static void method47() {
        field975.method3264();
    }
}
