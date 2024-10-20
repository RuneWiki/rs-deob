package deob;

@ObfuscatedName("hn")
public class class186 extends class457 {

    @ObfuscatedName("hn.av")
    public static class287 field1908 = new class287(64);

    @ObfuscatedName("hn.as")
    public int field1905 = 0;

    @ObfuscatedName("du.at(II)Lhn;")
    public static class186 method2498(int arg0) {
        class186 var1 = (class186) field1908.method5121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3401.method6080(16, arg0);
        class186 var3 = new class186();
        if (var2 != null) {
            var3.method3259(new class501(var2));
        }
        field1908.method5123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hn.an(Ltz;B)V")
    public void method3259(class501 arg0) {
        while (true) {
            int var2 = arg0.method8129();
            if (var2 == 0) {
                return;
            }
            this.method3260(arg0, var2);
        }
    }

    @ObfuscatedName("hn.av(Ltz;IB)V")
    public void method3260(class501 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1905 = arg0.method8195();
        }
    }

    @ObfuscatedName("fd.as(I)V")
    public static void method2940() {
        field1908.method5124();
    }
}
