package deob;

@ObfuscatedName("as")
public class class46 extends class182 {

    @ObfuscatedName("as.y")
    public static class171 field1071 = new class171(64);

    @ObfuscatedName("as.b")
    public int field1070 = 0;

    @ObfuscatedName("am.e(II)Las;")
    public static class46 method817(int arg0) {
        class46 var1 = (class46) field1071.method3058((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1074.method2709(16, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method885(new class107(var2));
        }
        field1071.method3057(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.o(Ldl;I)V")
    public void method885(class107 arg0) {
        while (true) {
            int var2 = arg0.method2123();
            if (var2 == 0) {
                return;
            }
            this.method883(arg0, var2);
        }
    }

    @ObfuscatedName("as.y(Ldl;II)V")
    public void method883(class107 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1070 = arg0.method2232();
        }
    }
}
