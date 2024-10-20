package deob;

@ObfuscatedName("bd")
public class class53 extends class205 {

    @ObfuscatedName("bd.p")
    public static class194 field1163 = new class194(64);

    @ObfuscatedName("bd.x")
    public int field1164 = 0;

    @ObfuscatedName("x.s(II)Lbd;")
    public static class53 method39(int arg0) {
        class53 var1 = (class53) field1163.method3484((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1168.method3014(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1031(new class120(var2));
        }
        field1163.method3486(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bd.j(Lds;I)V")
    public void method1031(class120 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method1032(arg0, var2);
        }
    }

    @ObfuscatedName("bd.p(Lds;II)V")
    public void method1032(class120 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1164 = arg0.method2430();
        }
    }

    @ObfuscatedName("ac.x(I)V")
    public static void method952() {
        field1163.method3491();
    }
}
