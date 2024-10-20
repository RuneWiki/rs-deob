package deob;

@ObfuscatedName("aj")
public class class48 extends class204 {

    @ObfuscatedName("aj.m")
    public static class193 field1071 = new class193(64);

    @ObfuscatedName("aj.i")
    public int field1073;

    @ObfuscatedName("aj.q")
    public int field1084;

    @ObfuscatedName("aj.p")
    public int field1080;

    @ObfuscatedName("aj.h(Ldp;I)V")
    public void method935(class119 arg0) {
        while (true) {
            int var2 = arg0.method2320();
            if (var2 == 0) {
                return;
            }
            this.method939(arg0, var2);
        }
    }

    @ObfuscatedName("aj.m(Ldp;II)V")
    public void method939(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1073 = arg0.method2322();
            this.field1084 = arg0.method2320();
            this.field1080 = arg0.method2320();
        }
    }
}
