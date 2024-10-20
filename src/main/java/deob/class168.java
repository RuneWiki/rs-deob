package deob;

@ObfuscatedName("aw")
public class class168 extends class7 {

    @ObfuscatedName("aw.b")
    public int field2559 = 0;

    @ObfuscatedName("aw.c")
    public static class75 field2554 = new class75(64);

    @ObfuscatedName("aw.c(Ldv;II)V")
    public void method3030(class28 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2559 = arg0.method349();
        }
    }

    @ObfuscatedName("aw.v(Ldv;S)V")
    public void method3038(class28 arg0) {
        while (true) {
            int var2 = arg0.method450();
            if (var2 == 0) {
                return;
            }
            this.method3030(arg0, var2);
        }
    }
}
