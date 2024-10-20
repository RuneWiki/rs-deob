package deob;

@ObfuscatedName("je")
public class class266 extends class207 {

    @ObfuscatedName("je.m")
    public static class201 field3353 = new class201(64);

    @ObfuscatedName("je.q")
    public class198 field3354;

    @ObfuscatedName("lt.w(Liv;I)V")
    public static void method5317(class248 arg0) {
        Statics.field3352 = arg0;
    }

    @ObfuscatedName("je.m(I)V")
    public void method4589() {
    }

    @ObfuscatedName("je.q(Lgy;I)V")
    public void method4603(class183 arg0) {
        while (true) {
            int var2 = arg0.method3436();
            if (var2 == 0) {
                return;
            }
            this.method4591(arg0, var2);
        }
    }

    @ObfuscatedName("je.x(Lgy;II)V")
    public void method4591(class183 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3354 = Statics.method2312(arg0, this.field3354);
        }
    }

    @ObfuscatedName("je.j(III)I")
    public int method4595(int arg0, int arg1) {
        class198 var3 = this.field3354;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class212 var5 = (class212) var3.method3675((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2465;
            }
        }
        return var4;
    }

    @ObfuscatedName("je.a(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4593(int arg0, String arg1) {
        return class263.method1701(this.field3354, arg0, arg1);
    }
}
