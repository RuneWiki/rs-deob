package deob;

@ObfuscatedName("an")
public class class51 extends class208 {

    @ObfuscatedName("an.d")
    public static class197 field1119 = new class197(64);

    @ObfuscatedName("an.v")
    public int field1112;

    @ObfuscatedName("an.r")
    public int field1111;

    @ObfuscatedName("an.z")
    public int field1114;

    @ObfuscatedName("ar.a(Lfu;I)V")
    public static void method682(class171 arg0) {
        Statics.field1028 = arg0;
    }

    @ObfuscatedName("f.d(IB)Lan;")
    public static class51 method599(int arg0) {
        class51 var1 = (class51) field1119.method3544((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1028.method3117(14, arg0);
        class51 var3 = new class51();
        if (var2 != null) {
            var3.method1010(new class123(var2));
        }
        field1119.method3546(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.v(Ldb;B)V")
    public void method1010(class123 arg0) {
        while (true) {
            int var2 = arg0.method2395();
            if (var2 == 0) {
                return;
            }
            this.method1020(arg0, var2);
        }
    }

    @ObfuscatedName("an.r(Ldb;IB)V")
    public void method1020(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1112 = arg0.method2584();
            this.field1111 = arg0.method2395();
            this.field1114 = arg0.method2395();
        }
    }

    @ObfuscatedName("r.z(B)V")
    public static void method45() {
        field1119.method3552();
    }
}
