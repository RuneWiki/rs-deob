package deob;

@ObfuscatedName("bi")
public class class53 extends class204 {

    @ObfuscatedName("bi.f")
    public static class193 field1165 = new class193(64);

    @ObfuscatedName("bi.h")
    public int field1163 = 0;

    @ObfuscatedName("ap.i(Lfn;B)V")
    public static void method594(class167 arg0) {
        Statics.field1164 = arg0;
        Statics.field1162 = Statics.field1164.method3078(16);
    }

    @ObfuscatedName("bi.v(Ldj;I)V")
    public void method1028(class119 arg0) {
        while (true) {
            int var2 = arg0.method2310();
            if (var2 == 0) {
                return;
            }
            this.method1029(arg0, var2);
        }
    }

    @ObfuscatedName("bi.f(Ldj;IB)V")
    public void method1029(class119 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1163 = arg0.method2312();
        }
    }

    @ObfuscatedName("cj.h(B)V")
    public static void method2010() {
        field1165.method3464();
    }
}
