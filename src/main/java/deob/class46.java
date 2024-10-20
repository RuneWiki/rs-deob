package deob;

@ObfuscatedName("ad")
public class class46 extends class204 {

    @ObfuscatedName("ad.e")
    public static class193 field1039 = new class193(64);

    @ObfuscatedName("ad.u")
    public boolean field1040 = false;

    @ObfuscatedName("ad.o(Ldi;I)V")
    public void method922(class119 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method923(arg0, var2);
        }
    }

    @ObfuscatedName("ad.e(Ldi;IB)V")
    public void method923(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1040 = true;
        }
    }
}
