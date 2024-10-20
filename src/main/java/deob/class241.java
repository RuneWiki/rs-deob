package deob;

@ObfuscatedName("ii")
public class class241 extends class195 {

    @ObfuscatedName("ii.q")
    public static class190 field3266 = new class190(64);

    @ObfuscatedName("ii.x")
    public int field3265 = 0;

    @ObfuscatedName("i.d(II)Lii;")
    public static class241 method38(int arg0) {
        class241 var1 = (class241) field3266.method3252((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2408.method3750(5, arg0);
        class241 var3 = new class241();
        if (var2 != null) {
            var3.method3873(new class174(var2));
        }
        field3266.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ii.q(Lfw;I)V")
    public void method3873(class174 arg0) {
        while (true) {
            int var2 = arg0.method2921();
            if (var2 == 0) {
                return;
            }
            this.method3875(arg0, var2);
        }
    }

    @ObfuscatedName("ii.x(Lfw;IB)V")
    public void method3875(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3265 = arg0.method2916();
        }
    }
}
