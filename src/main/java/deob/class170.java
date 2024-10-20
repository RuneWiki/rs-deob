package deob;

@ObfuscatedName("ft")
public class class170 extends class406 {

    @ObfuscatedName("ft.q")
    public static class257 field1852 = new class257(64);

    @ObfuscatedName("ft.l")
    public int field1855 = 0;

    @ObfuscatedName("jl.o(IB)Lft;")
    public static class170 method4897(int arg0) {
        class170 var1 = (class170) field1852.method4566((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1853.method5249(5, arg0);
        class170 var3 = new class170();
        if (var2 != null) {
            var3.method2967(new class440(var2));
        }
        field1852.method4571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ft.q(Lpx;B)V")
    public void method2967(class440 arg0) {
        while (true) {
            int var2 = arg0.method7071();
            if (var2 == 0) {
                return;
            }
            this.method2968(arg0, var2);
        }
    }

    @ObfuscatedName("ft.l(Lpx;II)V")
    public void method2968(class440 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1855 = arg0.method7082();
        }
    }
}
