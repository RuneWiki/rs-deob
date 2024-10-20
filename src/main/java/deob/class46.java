package deob;

@ObfuscatedName("ax")
public class class46 extends class181 {

    @ObfuscatedName("ax.a")
    public static class171 field1029 = new class171(64);

    @ObfuscatedName("ax.y")
    public int field1028 = 0;

    @ObfuscatedName("a.z(Ler;I)V")
    public static void method25(class146 arg0) {
        Statics.field1033 = arg0;
        Statics.field2953 = Statics.field1033.method2738(16);
    }

    @ObfuscatedName("ax.j(Ldq;I)V")
    public void method889(class107 arg0) {
        while (true) {
            int var2 = arg0.method2122();
            if (var2 == 0) {
                return;
            }
            this.method887(arg0, var2);
        }
    }

    @ObfuscatedName("ax.a(Ldq;II)V")
    public void method887(class107 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1028 = arg0.method2239();
        }
    }
}
