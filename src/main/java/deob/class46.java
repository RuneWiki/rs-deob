package deob;

@ObfuscatedName("ap")
public class class46 extends class204 {

    @ObfuscatedName("ap.l")
    public static class193 field1050 = new class193(64);

    @ObfuscatedName("ap.a")
    public boolean field1041 = false;

    @ObfuscatedName("bo.j(Lff;I)V")
    public static void method1557(class167 arg0) {
        Statics.field1044 = arg0;
    }

    @ObfuscatedName("ap.a(Ldc;B)V")
    public void method928(class119 arg0) {
        while (true) {
            int var2 = arg0.method2316();
            if (var2 == 0) {
                return;
            }
            this.method929(arg0, var2);
        }
    }

    @ObfuscatedName("ap.i(Ldc;II)V")
    public void method929(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1041 = true;
        }
    }
}
