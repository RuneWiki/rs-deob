package deob;

@ObfuscatedName("gl")
public class class191 extends class151 {

    @ObfuscatedName("gl.c")
    public static class146 field2794 = new class146(64);

    @ObfuscatedName("gl.n")
    public boolean field2791 = false;

    @ObfuscatedName("dj.d(II)Lgl;")
    public static class191 method2129(int arg0) {
        class191 var1 = (class191) field2794.method2598((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2790.method3129(19, arg0);
        class191 var3 = new class191();
        if (var2 != null) {
            var3.method3241(new class130(var2));
        }
        field2794.method2607(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gl.c(Ldu;I)V")
    public void method3241(class130 arg0) {
        while (true) {
            int var2 = arg0.method2379();
            if (var2 == 0) {
                return;
            }
            this.method3242(arg0, var2);
        }
    }

    @ObfuscatedName("gl.n(Ldu;II)V")
    public void method3242(class130 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2791 = true;
        }
    }
}
