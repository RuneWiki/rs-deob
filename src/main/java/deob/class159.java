package deob;

@ObfuscatedName("fh")
public class class159 extends class142 {

    @ObfuscatedName("fh.l")
    public static class100 field2410 = new class100(64);

    @ObfuscatedName("fh.i")
    public int field2412;

    @ObfuscatedName("fh.e")
    public int field2415;

    @ObfuscatedName("fh.a")
    public int field2414;

    @ObfuscatedName("w.i(Lcy;I)V")
    public static void method113(class86 arg0) {
        Statics.field2411 = arg0;
    }

    @ObfuscatedName("fh.e(Lec;B)V")
    public void method2477(class135 arg0) {
        while (true) {
            int var2 = arg0.method1571();
            if (var2 == 0) {
                return;
            }
            this.method2478(arg0, var2);
        }
    }

    @ObfuscatedName("fh.a(Lec;IB)V")
    public void method2478(class135 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2412 = arg0.method1725();
            this.field2415 = arg0.method1571();
            this.field2414 = arg0.method1571();
        }
    }
}
