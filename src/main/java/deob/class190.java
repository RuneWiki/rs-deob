package deob;

@ObfuscatedName("hr")
public class class190 extends class489 {

    @ObfuscatedName("hr.ah")
    public static class304 field1968 = new class304(64);

    @ObfuscatedName("hr.af")
    public int field1969 = 0;

    @ObfuscatedName("rx.az(II)Lhr;")
    public static class190 method7400(int arg0) {
        class190 var1 = (class190) field1968.method5336((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1970.method6328(5, arg0);
        class190 var3 = new class190();
        if (var2 != null) {
            var3.method3380(new class535(var2));
        }
        field1968.method5346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hr.ah(Lur;I)V")
    public void method3380(class535 arg0) {
        while (true) {
            int var2 = arg0.method8462();
            if (var2 == 0) {
                return;
            }
            this.method3374(arg0, var2);
        }
    }

    @ObfuscatedName("hr.af(Lur;IB)V")
    public void method3374(class535 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1969 = arg0.method8670();
        }
    }

    @ObfuscatedName("dr.at(I)V")
    public static void method2208() {
        field1968.method5339();
    }
}
