package deob;

@ObfuscatedName("aj")
public class class46 extends class182 {

    @ObfuscatedName("aj.z")
    public static class171 field1055 = new class171(64);

    @ObfuscatedName("aj.h")
    public int field1056 = 0;

    @ObfuscatedName("ai.g(Lec;I)V")
    public static void method560(class146 arg0) {
        Statics.field1762 = arg0;
        Statics.field1060 = Statics.field1762.method2718(16);
    }

    @ObfuscatedName("ag.v(IB)Laj;")
    public static class46 method769(int arg0) {
        class46 var1 = (class46) field1055.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1762.method2708(16, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method919(new class107(var2));
        }
        field1055.method3167(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.z(Ldm;I)V")
    public void method919(class107 arg0) {
        while (true) {
            int var2 = arg0.method2139();
            if (var2 == 0) {
                return;
            }
            this.method927(arg0, var2);
        }
    }

    @ObfuscatedName("aj.h(Ldm;IB)V")
    public void method927(class107 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1056 = arg0.method2141();
        }
    }
}
