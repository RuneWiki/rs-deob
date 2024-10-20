package deob;

@ObfuscatedName("hk")
public class class189 extends class469 {

    @ObfuscatedName("hk.ae")
    public static class288 field1968 = new class288(64);

    @ObfuscatedName("hk.ao")
    public boolean field1971 = false;

    @ObfuscatedName("im.au(II)Lhk;")
    public static class189 method4147(int arg0) {
        class189 var1 = (class189) field1968.method5182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1975.method6128(19, arg0);
        class189 var3 = new class189();
        if (var2 != null) {
            var3.method3325(new class515(var2));
        }
        field1968.method5177(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hk.ae(Ltm;I)V")
    public void method3325(class515 arg0) {
        while (true) {
            int var2 = arg0.method8300();
            if (var2 == 0) {
                return;
            }
            this.method3323(arg0, var2);
        }
    }

    @ObfuscatedName("hk.ao(Ltm;IB)V")
    public void method3323(class515 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1971 = true;
        }
    }
}
