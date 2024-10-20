package deob;

@ObfuscatedName("gz")
public class class187 extends class130 {

    @ObfuscatedName("gz.j")
    public static class125 field2765 = new class125(64);

    @ObfuscatedName("gz.c")
    public int field2762 = 0;

    @ObfuscatedName("fn.x(Lgk;I)V")
    public static void method2918(class183 arg0) {
        Statics.field2763 = arg0;
    }

    @ObfuscatedName("ec.j(IB)Lgz;")
    public static class187 method2620(int arg0) {
        class187 var1 = (class187) field2765.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2763.method3121(5, arg0);
        class187 var3 = new class187();
        if (var2 != null) {
            var3.method3229(new class154(var2));
        }
        field2765.method2223(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gz.c(Lek;B)V")
    public void method3229(class154 arg0) {
        while (true) {
            int var2 = arg0.method2701();
            if (var2 == 0) {
                return;
            }
            this.method3231(arg0, var2);
        }
    }

    @ObfuscatedName("gz.d(Lek;II)V")
    public void method3231(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2762 = arg0.method2745();
        }
    }
}
