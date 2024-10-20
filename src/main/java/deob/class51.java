package deob;

@ObfuscatedName("aq")
public class class51 extends class208 {

    @ObfuscatedName("aq.z")
    public static class197 field1064 = new class197(64);

    @ObfuscatedName("aq.t")
    public int field1071;

    @ObfuscatedName("aq.y")
    public int field1067;

    @ObfuscatedName("aq.p")
    public int field1068;

    @ObfuscatedName("af.s(Lfu;I)V")
    public static void method1016(class171 arg0) {
        Statics.field1066 = arg0;
    }

    @ObfuscatedName("aq.z(Ldy;B)V")
    public void method985(class123 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method982(arg0, var2);
        }
    }

    @ObfuscatedName("aq.t(Ldy;IB)V")
    public void method982(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1071 = arg0.method2550();
            this.field1067 = arg0.method2363();
            this.field1068 = arg0.method2363();
        }
    }
}
