package deob;

@ObfuscatedName("ai")
public class class46 extends class204 {

    @ObfuscatedName("ai.h")
    public static class193 field1021 = new class193(64);

    @ObfuscatedName("ai.o")
    public boolean field1023 = false;

    @ObfuscatedName("fk.k(Lfo;B)V")
    public static void method3181(class167 arg0) {
        Statics.field1022 = arg0;
    }

    @ObfuscatedName("ae.h(II)Lai;")
    public static class46 method607(int arg0) {
        class46 var1 = (class46) field1021.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1022.method3118(19, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method887(new class119(var2));
        }
        field1021.method3512(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.o(Ldk;B)V")
    public void method887(class119 arg0) {
        while (true) {
            int var2 = arg0.method2330();
            if (var2 == 0) {
                return;
            }
            this.method900(arg0, var2);
        }
    }

    @ObfuscatedName("ai.z(Ldk;II)V")
    public void method900(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1023 = true;
        }
    }
}
