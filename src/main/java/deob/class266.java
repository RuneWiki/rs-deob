package deob;

@ObfuscatedName("ji")
public class class266 extends class207 {

    @ObfuscatedName("ji.w")
    public static class201 field3335 = new class201(64);

    @ObfuscatedName("ji.s")
    public class198 field3336;

    @ObfuscatedName("ji.z(S)V")
    public void method4570() {
    }

    @ObfuscatedName("ji.w(Lgk;I)V")
    public void method4569(class183 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4576(arg0, var2);
        }
    }

    @ObfuscatedName("ji.s(Lgk;IB)V")
    public void method4576(class183 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3336 = class263.method612(arg0, this.field3336);
        }
    }

    @ObfuscatedName("ji.l(III)I")
    public int method4571(int arg0, int arg1) {
        return class263.method1561(this.field3336, arg0, arg1);
    }

    @ObfuscatedName("ji.u(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4572(int arg0, String arg1) {
        return class263.method172(this.field3336, arg0, arg1);
    }
}
