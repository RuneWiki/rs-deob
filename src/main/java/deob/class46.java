package deob;

@ObfuscatedName("aa")
public class class46 extends class204 {

    @ObfuscatedName("aa.v")
    public static class193 field1056 = new class193(64);

    @ObfuscatedName("aa.f")
    public boolean field1055 = false;

    @ObfuscatedName("co.i(Lfn;I)V")
    public static void method1909(class167 arg0) {
        Statics.field1060 = arg0;
    }

    @ObfuscatedName("aa.v(Ldj;S)V")
    public void method878(class119 arg0) {
        while (true) {
            int var2 = arg0.method2310();
            if (var2 == 0) {
                return;
            }
            this.method880(arg0, var2);
        }
    }

    @ObfuscatedName("aa.f(Ldj;IB)V")
    public void method880(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1055 = true;
        }
    }
}
