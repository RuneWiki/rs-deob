package deob;

@ObfuscatedName("ao")
public class class38 extends class174 {

    @ObfuscatedName("ao.r")
    public static class170 field956 = new class170(64);

    @ObfuscatedName("ao.v")
    public int field961;

    @ObfuscatedName("ao.p")
    public int field958;

    @ObfuscatedName("ao.e")
    public int field959;

    @ObfuscatedName("ao.j(Ldn;B)V")
    public void method794(class127 arg0) {
        while (true) {
            int var2 = arg0.method2441();
            if (var2 == 0) {
                return;
            }
            this.method793(arg0, var2);
        }
    }

    @ObfuscatedName("ao.r(Ldn;II)V")
    public void method793(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field961 = arg0.method2609();
            this.field958 = arg0.method2441();
            this.field959 = arg0.method2441();
        }
    }
}
