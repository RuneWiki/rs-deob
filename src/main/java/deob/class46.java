package deob;

@ObfuscatedName("ax")
public class class46 extends class205 {

    @ObfuscatedName("ax.w")
    public static class194 field1018 = new class194(64);

    @ObfuscatedName("ax.f")
    public boolean field1020 = false;

    @ObfuscatedName("aj.e(Lft;B)V")
    public static void method704(class168 arg0) {
        Statics.field1025 = arg0;
    }

    @ObfuscatedName("cj.w(IB)Lax;")
    public static class46 method2053(int arg0) {
        class46 var1 = (class46) field1018.method3473((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1025.method3048(19, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method922(new class120(var2));
        }
        field1018.method3475(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.f(Ldq;B)V")
    public void method922(class120 arg0) {
        while (true) {
            int var2 = arg0.method2355();
            if (var2 == 0) {
                return;
            }
            this.method931(arg0, var2);
        }
    }

    @ObfuscatedName("ax.s(Ldq;II)V")
    public void method931(class120 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1020 = true;
        }
    }
}
