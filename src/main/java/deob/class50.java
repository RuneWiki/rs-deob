package deob;

@ObfuscatedName("al")
public class class50 extends class204 {

    @ObfuscatedName("al.e")
    public static class193 field1086 = new class193(64);

    @ObfuscatedName("al.u")
    public boolean field1083 = false;

    @ObfuscatedName("cn.o(Lfq;I)V")
    public static void method2113(class167 arg0) {
        Statics.field1082 = arg0;
    }

    @ObfuscatedName("al.e(Ldi;B)V")
    public void method969(class119 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method970(arg0, var2);
        }
    }

    @ObfuscatedName("al.u(Ldi;IB)V")
    public void method970(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1083 = true;
        }
    }
}
