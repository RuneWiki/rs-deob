package deob;

@ObfuscatedName("ap")
public class class46 extends class204 {

    @ObfuscatedName("ap.r")
    public static class193 field1039 = new class193(64);

    @ObfuscatedName("ap.f")
    public boolean field1041 = false;

    @ObfuscatedName("ap.a(Lds;I)V")
    public void method932(class119 arg0) {
        while (true) {
            int var2 = arg0.method2412();
            if (var2 == 0) {
                return;
            }
            this.method933(arg0, var2);
        }
    }

    @ObfuscatedName("ap.r(Lds;II)V")
    public void method933(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1041 = true;
        }
    }
}
