package deob;

@ObfuscatedName("ab")
public class class48 extends class204 {

    @ObfuscatedName("ab.h")
    public static class193 field1045 = new class193(64);

    @ObfuscatedName("ab.o")
    public int field1052;

    @ObfuscatedName("ab.z")
    public int field1047;

    @ObfuscatedName("ab.c")
    public int field1048;

    @ObfuscatedName("ab.k(Ldk;B)V")
    public void method924(class119 arg0) {
        while (true) {
            int var2 = arg0.method2330();
            if (var2 == 0) {
                return;
            }
            this.method933(arg0, var2);
        }
    }

    @ObfuscatedName("ab.h(Ldk;IB)V")
    public void method933(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1052 = arg0.method2332();
            this.field1047 = arg0.method2330();
            this.field1048 = arg0.method2330();
        }
    }

    @ObfuscatedName("r.o(I)V")
    public static void method172() {
        field1045.method3518();
    }
}
