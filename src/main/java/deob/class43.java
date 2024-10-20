package deob;

@ObfuscatedName("ag")
public class class43 extends class187 {

    @ObfuscatedName("ag.y")
    public static class176 field963 = new class176(64);

    @ObfuscatedName("ag.d")
    public int field955;

    @ObfuscatedName("ag.c")
    public int field964;

    @ObfuscatedName("ag.r")
    public int field957;

    @ObfuscatedName("cj.p(Len;B)V")
    public static void method1900(class151 arg0) {
        Statics.field954 = arg0;
    }

    @ObfuscatedName("es.y(IB)Lag;")
    public static class43 method2849(int arg0) {
        class43 var1 = (class43) field963.method3198((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field954.method2811(14, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method840(new class110(var2));
        }
        field963.method3193(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.d(Ldg;I)V")
    public void method840(class110 arg0) {
        while (true) {
            int var2 = arg0.method2309();
            if (var2 == 0) {
                return;
            }
            this.method835(arg0, var2);
        }
    }

    @ObfuscatedName("ag.c(Ldg;IB)V")
    public void method835(class110 arg0, int arg1) {
        if (arg1 == 1) {
            this.field955 = arg0.method2243();
            this.field964 = arg0.method2309();
            this.field957 = arg0.method2309();
        }
    }
}
