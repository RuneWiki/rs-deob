package deob;

@ObfuscatedName("ag")
public class class48 extends class205 {

    @ObfuscatedName("ag.j")
    public static class194 field1066 = new class194(64);

    @ObfuscatedName("ag.p")
    public int field1067;

    @ObfuscatedName("ag.x")
    public int field1065;

    @ObfuscatedName("ag.d")
    public int field1069;

    @ObfuscatedName("ag.s(Lds;B)V")
    public void method935(class120 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method941(arg0, var2);
        }
    }

    @ObfuscatedName("ag.j(Lds;II)V")
    public void method941(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1067 = arg0.method2430();
            this.field1065 = arg0.method2338();
            this.field1069 = arg0.method2338();
        }
    }
}
