package deob;

@ObfuscatedName("ao")
public class class44 extends class182 {

    @ObfuscatedName("ao.b")
    public static class171 field1000 = new class171(64);

    @ObfuscatedName("ao.e")
    public int field1001 = 0;

    @ObfuscatedName("i.k(II)Lao;")
    public static class44 method26(int arg0) {
        class44 var1 = (class44) field1000.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1007.method2759(5, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method835(new class107(var2));
        }
        field1000.method3161(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.b(Ldi;I)V")
    public void method835(class107 arg0) {
        while (true) {
            int var2 = arg0.method2115();
            if (var2 == 0) {
                return;
            }
            this.method838(arg0, var2);
        }
    }

    @ObfuscatedName("ao.e(Ldi;II)V")
    public void method838(class107 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1001 = arg0.method2117();
        }
    }
}
