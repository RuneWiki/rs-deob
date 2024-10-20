package deob;

@ObfuscatedName("ae")
public class class51 extends class208 {

    @ObfuscatedName("ae.h")
    public static class197 field1099 = new class197(64);

    @ObfuscatedName("ae.e")
    public int field1096;

    @ObfuscatedName("ae.g")
    public int field1095;

    @ObfuscatedName("ae.n")
    public int field1098;

    @ObfuscatedName("x.i(Lfu;S)V")
    public static void method186(class171 arg0) {
        Statics.field1097 = arg0;
    }

    @ObfuscatedName("gd.h(II)Lae;")
    public static class51 method3522(int arg0) {
        class51 var1 = (class51) field1099.method3541((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1097.method3086(14, arg0);
        class51 var3 = new class51();
        if (var2 != null) {
            var3.method988(new class123(var2));
        }
        field1099.method3532(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.e(Ldn;I)V")
    public void method988(class123 arg0) {
        while (true) {
            int var2 = arg0.method2404();
            if (var2 == 0) {
                return;
            }
            this.method989(arg0, var2);
        }
    }

    @ObfuscatedName("ae.g(Ldn;II)V")
    public void method989(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1096 = arg0.method2406();
            this.field1095 = arg0.method2404();
            this.field1098 = arg0.method2404();
        }
    }

    @ObfuscatedName("i.n(I)V")
    public static void method2() {
        field1099.method3533();
    }
}
