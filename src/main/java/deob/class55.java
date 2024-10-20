package deob;

@ObfuscatedName("bi")
public class class55 extends class208 {

    @ObfuscatedName("bi.h")
    public static class197 field1156 = new class197(64);

    @ObfuscatedName("bi.e")
    public int field1157 = 0;

    @ObfuscatedName("ac.i(Lfu;S)V")
    public static void method804(class171 arg0) {
        Statics.field1160 = arg0;
    }

    @ObfuscatedName("bh.h(II)Lbi;")
    public static class55 method1522(int arg0) {
        class55 var1 = (class55) field1156.method3541((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1160.method3086(5, arg0);
        class55 var3 = new class55();
        if (var2 != null) {
            var3.method1064(new class123(var2));
        }
        field1156.method3532(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bi.e(Ldn;I)V")
    public void method1064(class123 arg0) {
        while (true) {
            int var2 = arg0.method2404();
            if (var2 == 0) {
                return;
            }
            this.method1074(arg0, var2);
        }
    }

    @ObfuscatedName("bi.g(Ldn;IB)V")
    public void method1074(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1157 = arg0.method2406();
        }
    }
}
