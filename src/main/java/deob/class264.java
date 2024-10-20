package deob;

@ObfuscatedName("jt")
public class class264 extends class206 {

    @ObfuscatedName("jt.w")
    public static class201 field3473 = new class201(64);

    @ObfuscatedName("jt.e")
    public class198 field3474;

    @ObfuscatedName("jt.a(I)V")
    public void method4218() {
    }

    @ObfuscatedName("jt.w(Lgh;I)V")
    public void method4226(class185 arg0) {
        while (true) {
            int var2 = arg0.method2962();
            if (var2 == 0) {
                return;
            }
            this.method4220(arg0, var2);
        }
    }

    @ObfuscatedName("jt.e(Lgh;II)V")
    public void method4220(class185 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3474 = class261.method933(arg0, this.field3474);
        }
    }

    @ObfuscatedName("jt.k(III)I")
    public int method4221(int arg0, int arg1) {
        return class261.method1485(this.field3474, arg0, arg1);
    }

    @ObfuscatedName("jt.u(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4217(int arg0, String arg1) {
        return class261.method3290(this.field3474, arg0, arg1);
    }
}
