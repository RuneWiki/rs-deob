package deob;

@ObfuscatedName("at")
public class class48 extends class205 {

    @ObfuscatedName("at.w")
    public static class194 field1050 = new class194(64);

    @ObfuscatedName("at.f")
    public int field1044;

    @ObfuscatedName("at.s")
    public int field1045;

    @ObfuscatedName("at.p")
    public int field1047;

    @ObfuscatedName("at.e(Ldq;B)V")
    public void method951(class120 arg0) {
        while (true) {
            int var2 = arg0.method2355();
            if (var2 == 0) {
                return;
            }
            this.method956(arg0, var2);
        }
    }

    @ObfuscatedName("at.w(Ldq;II)V")
    public void method956(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1044 = arg0.method2532();
            this.field1045 = arg0.method2355();
            this.field1047 = arg0.method2355();
        }
    }
}
