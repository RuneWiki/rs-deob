package deob;

@ObfuscatedName("ai")
public class class48 extends class205 {

    @ObfuscatedName("ai.g")
    public static class194 field1043 = new class194(64);

    @ObfuscatedName("ai.j")
    public int field1044;

    @ObfuscatedName("ai.d")
    public int field1046;

    @ObfuscatedName("ai.x")
    public int field1048;

    @ObfuscatedName("ai.b(Lds;B)V")
    public void method957(class120 arg0) {
        while (true) {
            int var2 = arg0.method2344();
            if (var2 == 0) {
                return;
            }
            this.method964(arg0, var2);
        }
    }

    @ObfuscatedName("ai.g(Lds;IB)V")
    public void method964(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1044 = arg0.method2346();
            this.field1046 = arg0.method2344();
            this.field1048 = arg0.method2344();
        }
    }

    @ObfuscatedName("ed.j(I)V")
    public static void method2765() {
        field1043.method3486();
    }
}
