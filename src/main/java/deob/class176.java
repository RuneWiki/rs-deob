package deob;

@ObfuscatedName("ap")
public class class176 extends class77 {

    @ObfuscatedName("ap.o")
    public int field2639 = 0;

    @ObfuscatedName("ap.p")
    public static class67 field2638 = new class67(64);

    @ObfuscatedName("ap.o(Ldy;B)V")
    public void method3362(class31 arg0) {
        while (true) {
            int var2 = arg0.method512();
            if (var2 == 0) {
                return;
            }
            this.method3365(arg0, var2);
        }
    }

    @ObfuscatedName("ap.t(Ldy;II)V")
    public void method3365(class31 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2639 = arg0.method373();
        }
    }

    @ObfuscatedName("r.p(II)Lap;")
    public static class176 method1332(int arg0) {
        class176 var1 = (class176) field2638.method908((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2641.method1083(5, arg0);
        class176 var3 = new class176();
        if (var2 != null) {
            var3.method3362(new class31(var2));
        }
        field2638.method907(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bs.j(Leg;I)V")
    public static void method1942(class81 arg0) {
        Statics.field2641 = arg0;
    }
}
