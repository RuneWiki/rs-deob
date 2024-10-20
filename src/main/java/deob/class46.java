package deob;

@ObfuscatedName("al")
public class class46 extends class204 {

    @ObfuscatedName("al.m")
    public static class193 field1046 = new class193(64);

    @ObfuscatedName("al.i")
    public boolean field1045 = false;

    @ObfuscatedName("ec.h(Lfv;B)V")
    public static void method2889(class167 arg0) {
        Statics.field1052 = arg0;
    }

    @ObfuscatedName("al.m(Ldp;I)V")
    public void method903(class119 arg0) {
        while (true) {
            int var2 = arg0.method2320();
            if (var2 == 0) {
                return;
            }
            this.method902(arg0, var2);
        }
    }

    @ObfuscatedName("al.i(Ldp;II)V")
    public void method902(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1045 = true;
        }
    }
}
