package deob;

@ObfuscatedName("hk")
public class class200 extends class500 {

    @ObfuscatedName("hk.al")
    public static class312 field2040 = new class312(64);

    @ObfuscatedName("hk.aj")
    public boolean field2041 = false;

    @ObfuscatedName("ad.ak(Lor;S)V")
    public static void method268(class387 arg0) {
        Statics.field2042 = arg0;
    }

    @ObfuscatedName("fb.al(II)Lhk;")
    public static class200 method3055(int arg0) {
        class200 var1 = (class200) field2040.method5570((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2042.method6573(19, arg0);
        class200 var3 = new class200();
        if (var2 != null) {
            var3.method3553(new class546(var2));
        }
        field2040.method5564(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hk.aj(Lua;B)V")
    public void method3553(class546 arg0) {
        while (true) {
            int var2 = arg0.method8796();
            if (var2 == 0) {
                return;
            }
            this.method3563(arg0, var2);
        }
    }

    @ObfuscatedName("hk.az(Lua;II)V")
    public void method3563(class546 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2041 = true;
        }
    }

    @ObfuscatedName("et.af(I)V")
    public static void method2851() {
        field2040.method5572();
    }
}
