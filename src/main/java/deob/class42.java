package deob;

@ObfuscatedName("ao")
public class class42 extends class174 {

    @ObfuscatedName("ao.c")
    public static class170 field1064 = new class170(64);

    @ObfuscatedName("ao.d")
    public int field1063 = 0;

    @ObfuscatedName("ao.t(Ldo;B)V")
    public void method930(class127 arg0) {
        while (true) {
            int var2 = arg0.method2438();
            if (var2 == 0) {
                return;
            }
            this.method924(arg0, var2);
        }
    }

    @ObfuscatedName("ao.l(Ldo;II)V")
    public void method924(class127 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1063 = arg0.method2440();
        }
    }
}
