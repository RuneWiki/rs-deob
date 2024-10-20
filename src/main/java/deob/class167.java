package deob;

@ObfuscatedName("ft")
public class class167 extends class365 {

    @ObfuscatedName("ft.w")
    public static class236 field1798 = new class236(64);

    @ObfuscatedName("ft.s")
    public class379 field1795;

    @ObfuscatedName("aq.i(Lko;B)V")
    public static void method397(class290 arg0) {
        Statics.field1796 = arg0;
    }

    @ObfuscatedName("jm.w(II)Lft;")
    public static class167 method4652(int arg0) {
        class167 var1 = (class167) field1798.method4205((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1796.method4743(34, arg0);
        class167 var3 = new class167();
        if (var2 != null) {
            var3.method2914(new class401(var2));
        }
        var3.method2913();
        field1798.method4206(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ft.s(B)V")
    public void method2913() {
    }

    @ObfuscatedName("ft.a(Lop;B)V")
    public void method2914(class401 arg0) {
        while (true) {
            int var2 = arg0.method6240();
            if (var2 == 0) {
                return;
            }
            this.method2915(arg0, var2);
        }
    }

    @ObfuscatedName("ft.o(Lop;IB)V")
    public void method2915(class401 arg0, int arg1) {
        if (arg1 == 249) {
            this.field1795 = class158.method164(arg0, this.field1795);
        }
    }

    @ObfuscatedName("ft.g(III)I")
    public int method2927(int arg0, int arg1) {
        return class158.method2133(this.field1795, arg0, arg1);
    }

    @ObfuscatedName("ft.e(ILjava/lang/String;B)Ljava/lang/String;")
    public String method2916(int arg0, String arg1) {
        return class158.method2887(this.field1795, arg0, arg1);
    }
}
