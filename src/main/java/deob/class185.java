package deob;

@ObfuscatedName("hk")
public class class185 extends class457 {

    @ObfuscatedName("hk.an")
    public static class287 field1899 = new class287(64);

    @ObfuscatedName("hk.av")
    public int field1900 = 0;

    @ObfuscatedName("kr.at(Lnq;B)V")
    public static void method5015(class357 arg0) {
        Statics.field1901 = arg0;
    }

    @ObfuscatedName("oa.an(II)Lhk;")
    public static class185 method6477(int arg0) {
        class185 var1 = (class185) field1899.method5121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1901.method6080(5, arg0);
        class185 var3 = new class185();
        if (var2 != null) {
            var3.method3252(new class501(var2));
        }
        field1899.method5123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hk.av(Ltz;B)V")
    public void method3252(class501 arg0) {
        while (true) {
            int var2 = arg0.method8129();
            if (var2 == 0) {
                return;
            }
            this.method3244(arg0, var2);
        }
    }

    @ObfuscatedName("hk.as(Ltz;II)V")
    public void method3244(class501 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1900 = arg0.method8195();
        }
    }
}
