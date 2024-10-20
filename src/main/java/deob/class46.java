package deob;

@ObfuscatedName("al")
public class class46 extends class182 {

    @ObfuscatedName("al.e")
    public static class171 field1061 = new class171(64);

    @ObfuscatedName("al.i")
    public int field1060 = 0;

    @ObfuscatedName("cc.k(II)Lal;")
    public static class46 method1873(int arg0) {
        class46 var1 = (class46) field1061.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1065.method2759(16, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method889(new class107(var2));
        }
        field1061.method3161(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.b(Ldi;B)V")
    public void method889(class107 arg0) {
        while (true) {
            int var2 = arg0.method2115();
            if (var2 == 0) {
                return;
            }
            this.method890(arg0, var2);
        }
    }

    @ObfuscatedName("al.e(Ldi;II)V")
    public void method890(class107 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1060 = arg0.method2117();
        }
    }
}
