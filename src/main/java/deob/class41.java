package deob;

@ObfuscatedName("an")
public class class41 extends class173 {

    @ObfuscatedName("an.x")
    public static class169 field1027 = new class169(64);

    @ObfuscatedName("an.m")
    public int field1028 = 0;

    @ObfuscatedName("eq.u(II)Lan;")
    public static class41 method2682(int arg0) {
        class41 var1 = (class41) field1027.method3263((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1033.method2965(16, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method895(new class126(var2));
        }
        field1027.method3260(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.k(Ldl;I)V")
    public void method895(class126 arg0) {
        while (true) {
            int var2 = arg0.method2559();
            if (var2 == 0) {
                return;
            }
            this.method882(arg0, var2);
        }
    }

    @ObfuscatedName("an.x(Ldl;IB)V")
    public void method882(class126 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1028 = arg0.method2450();
        }
    }
}
