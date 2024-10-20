package deob;

@ObfuscatedName("ap")
public class class48 extends class204 {

    @ObfuscatedName("ap.d")
    public static class193 field1067 = new class193(64);

    @ObfuscatedName("ap.g")
    public int field1068;

    @ObfuscatedName("ap.w")
    public int field1070;

    @ObfuscatedName("ap.e")
    public int field1066;

    @ObfuscatedName("ap.y(Ldd;B)V")
    public void method953(class119 arg0) {
        while (true) {
            int var2 = arg0.method2326();
            if (var2 == 0) {
                return;
            }
            this.method948(arg0, var2);
        }
    }

    @ObfuscatedName("ap.d(Ldd;II)V")
    public void method948(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1068 = arg0.method2525();
            this.field1070 = arg0.method2326();
            this.field1066 = arg0.method2326();
        }
    }
}
