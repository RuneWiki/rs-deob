package deob;

@ObfuscatedName("gh")
public class class187 extends class130 {

    @ObfuscatedName("gh.l")
    public static class125 field2764 = new class125(64);

    @ObfuscatedName("gh.i")
    public int field2763 = 0;

    @ObfuscatedName("fw.b(Lgj;B)V")
    public static void method2987(class183 arg0) {
        Statics.field2765 = arg0;
    }

    @ObfuscatedName("dn.l(II)Lgh;")
    public static class187 method2074(int arg0) {
        class187 var1 = (class187) field2764.method2256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2765.method3226(5, arg0);
        class187 var3 = new class187();
        if (var2 != null) {
            var3.method3285(new class154(var2));
        }
        field2764.method2258(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gh.i(Leg;I)V")
    public void method3285(class154 arg0) {
        while (true) {
            int var2 = arg0.method2678();
            if (var2 == 0) {
                return;
            }
            this.method3286(arg0, var2);
        }
    }

    @ObfuscatedName("gh.t(Leg;IB)V")
    public void method3286(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2763 = arg0.method2801();
        }
    }
}
