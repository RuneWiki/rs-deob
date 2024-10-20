package deob;

@ObfuscatedName("hi")
public class class187 extends class469 {

    @ObfuscatedName("hi.ao")
    public static class288 field1935 = new class288(64);

    @ObfuscatedName("hi.at")
    public int field1933 = 0;

    @ObfuscatedName("ga.au(Lnu;I)V")
    public static void method3244(class359 arg0) {
        Statics.field1936 = arg0;
        Statics.field1934 = Statics.field1936.method6173(16);
    }

    @ObfuscatedName("cl.ae(II)Lhi;")
    public static class187 method1165(int arg0) {
        class187 var1 = (class187) field1935.method5182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1936.method6128(16, arg0);
        class187 var3 = new class187();
        if (var2 != null) {
            var3.method3287(new class515(var2));
        }
        field1935.method5177(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hi.ao(Ltm;B)V")
    public void method3287(class515 arg0) {
        while (true) {
            int var2 = arg0.method8300();
            if (var2 == 0) {
                return;
            }
            this.method3286(arg0, var2);
        }
    }

    @ObfuscatedName("hi.at(Ltm;II)V")
    public void method3286(class515 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1933 = arg0.method8448();
        }
    }
}
