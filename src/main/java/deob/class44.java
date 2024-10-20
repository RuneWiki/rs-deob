package deob;

@ObfuscatedName("az")
public class class44 extends class181 {

    @ObfuscatedName("az.z")
    public static class171 field1003 = new class171(64);

    @ObfuscatedName("az.y")
    public int field1005 = 0;

    @ObfuscatedName("ee.j(II)Laz;")
    public static class44 method2698(int arg0) {
        class44 var1 = (class44) field1003.method3171((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1000.method2739(5, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method818(new class107(var2));
        }
        field1003.method3173(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.z(Lde;I)V")
    public void method818(class107 arg0) {
        while (true) {
            int var2 = arg0.method2130();
            if (var2 == 0) {
                return;
            }
            this.method819(arg0, var2);
        }
    }

    @ObfuscatedName("az.y(Lde;II)V")
    public void method819(class107 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1005 = arg0.method2132();
        }
    }
}
