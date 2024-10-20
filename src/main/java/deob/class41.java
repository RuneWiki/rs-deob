package deob;

@ObfuscatedName("au")
public class class41 extends class174 {

    @ObfuscatedName("au.c")
    public static class170 field1022 = new class170(64);

    @ObfuscatedName("au.p")
    public int field1027 = 0;

    @ObfuscatedName("au.q(Ldo;B)V")
    public void method878(class127 arg0) {
        while (true) {
            int var2 = arg0.method2534();
            if (var2 == 0) {
                return;
            }
            this.method879(arg0, var2);
        }
    }

    @ObfuscatedName("au.c(Ldo;IB)V")
    public void method879(class127 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1027 = arg0.method2427();
        }
    }
}
