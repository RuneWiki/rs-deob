package deob;

@ObfuscatedName("am")
public class class48 extends class205 {

    @ObfuscatedName("am.i")
    public static class194 field1073 = new class194(64);

    @ObfuscatedName("am.g")
    public int field1074;

    @ObfuscatedName("am.h")
    public int field1075;

    @ObfuscatedName("am.z")
    public int field1079;

    @ObfuscatedName("at.t(Lfp;I)V")
    public static void method935(class168 arg0) {
        Statics.field1077 = arg0;
    }

    @ObfuscatedName("am.i(Ldr;B)V")
    public void method918(class120 arg0) {
        while (true) {
            int var2 = arg0.method2334();
            if (var2 == 0) {
                return;
            }
            this.method919(arg0, var2);
        }
    }

    @ObfuscatedName("am.g(Ldr;II)V")
    public void method919(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1074 = arg0.method2310();
            this.field1075 = arg0.method2334();
            this.field1079 = arg0.method2334();
        }
    }

    @ObfuscatedName("hr.h(I)V")
    public static void method3632() {
        field1073.method3454();
    }
}
