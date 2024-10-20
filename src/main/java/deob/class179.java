package deob;

@ObfuscatedName("gk")
public class class179 extends class481 {

    @ObfuscatedName("gk.ah")
    public static class299 field1853 = new class299(64);

    @ObfuscatedName("gk.ar")
    public boolean field1850 = false;

    @ObfuscatedName("fw.at(II)Lgk;")
    public static class179 method3036(int arg0) {
        class179 var1 = (class179) field1853.method5289((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field153.method6284(19, arg0);
        class179 var3 = new class179();
        if (var2 != null) {
            var3.method3282(new class527(var2));
        }
        field1853.method5303(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gk.ah(Luj;S)V")
    public void method3282(class527 arg0) {
        while (true) {
            int var2 = arg0.method8410();
            if (var2 == 0) {
                return;
            }
            this.method3281(arg0, var2);
        }
    }

    @ObfuscatedName("gk.ar(Luj;IB)V")
    public void method3281(class527 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1850 = true;
        }
    }
}
