package deob;

@ObfuscatedName("ao")
public class class41 extends class175 {

    @ObfuscatedName("ao.b")
    public static class171 field1020 = new class171(64);

    @ObfuscatedName("ao.o")
    public int field1021 = 0;

    @ObfuscatedName("ao.l(Ldm;B)V")
    public void method883(class127 arg0) {
        while (true) {
            int var2 = arg0.method2440();
            if (var2 == 0) {
                return;
            }
            this.method881(arg0, var2);
        }
    }

    @ObfuscatedName("ao.b(Ldm;IB)V")
    public void method881(class127 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1021 = arg0.method2442();
        }
    }
}
