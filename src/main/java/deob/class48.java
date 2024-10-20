package deob;

@ObfuscatedName("aw")
public class class48 extends class204 {

    @ObfuscatedName("aw.e")
    public static class193 field1063 = new class193(64);

    @ObfuscatedName("aw.u")
    public int field1060;

    @ObfuscatedName("aw.b")
    public int field1064;

    @ObfuscatedName("aw.p")
    public int field1062;

    @ObfuscatedName("l.o(Lfq;I)V")
    public static void method155(class167 arg0) {
        Statics.field1059 = arg0;
    }

    @ObfuscatedName("aw.e(Ldi;B)V")
    public void method957(class119 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method953(arg0, var2);
        }
    }

    @ObfuscatedName("aw.u(Ldi;II)V")
    public void method953(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1060 = arg0.method2339();
            this.field1064 = arg0.method2427();
            this.field1062 = arg0.method2427();
        }
    }

    @ObfuscatedName("dt.b(I)V")
    public static void method2616() {
        field1063.method3522();
    }
}
