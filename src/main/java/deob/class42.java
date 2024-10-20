package deob;

@ObfuscatedName("as")
public class class42 extends class174 {

    @ObfuscatedName("as.a")
    public static class170 field1037 = new class170(64);

    @ObfuscatedName("as.t")
    public int field1035 = 0;

    @ObfuscatedName("t.d(IB)Las;")
    public static class42 method35(int arg0) {
        class42 var1 = (class42) field1037.method3210((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1042.method2958(16, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method873(new class127(var2));
        }
        field1037.method3221(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.g(Ldo;I)V")
    public void method873(class127 arg0) {
        while (true) {
            int var2 = arg0.method2509();
            if (var2 == 0) {
                return;
            }
            this.method876(arg0, var2);
        }
    }

    @ObfuscatedName("as.a(Ldo;II)V")
    public void method876(class127 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1035 = arg0.method2512();
        }
    }

    @ObfuscatedName("au.t(I)V")
    public static void method777() {
        field1037.method3209();
    }
}
