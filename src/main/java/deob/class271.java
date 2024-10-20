package deob;

@ObfuscatedName("jr")
public class class271 extends class219 {

    @ObfuscatedName("jr.z")
    public static class213 field3475 = new class213(64);

    @ObfuscatedName("jr.n")
    public boolean field3473 = false;

    @ObfuscatedName("cx.d(II)Ljr;")
    public static class271 method1795(int arg0) {
        class271 var1 = (class271) field3475.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3472.method4273(19, arg0);
        class271 var3 = new class271();
        if (var2 != null) {
            var3.method4504(new class195(var2));
        }
        field3475.method3697(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jr.z(Lgy;I)V")
    public void method4504(class195 arg0) {
        while (true) {
            int var2 = arg0.method3330();
            if (var2 == 0) {
                return;
            }
            this.method4500(arg0, var2);
        }
    }

    @ObfuscatedName("jr.n(Lgy;II)V")
    public void method4500(class195 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3473 = true;
        }
    }
}
