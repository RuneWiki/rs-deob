package deob;

@ObfuscatedName("aa")
public class class47 extends class185 {

    @ObfuscatedName("aa.k")
    public static class174 field1078 = new class174(64);

    @ObfuscatedName("aa.g")
    public int field1076 = 0;

    @ObfuscatedName("aa.e(II)Laa;")
    public static class47 method890(int arg0) {
        class47 var1 = (class47) field1078.method3154((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1081.method2721(16, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method889(new class108(var2));
        }
        field1078.method3156(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.v(Ldd;I)V")
    public void method889(class108 arg0) {
        while (true) {
            int var2 = arg0.method2122();
            if (var2 == 0) {
                return;
            }
            this.method888(arg0, var2);
        }
    }

    @ObfuscatedName("aa.k(Ldd;II)V")
    public void method888(class108 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1076 = arg0.method2124();
        }
    }

    @ObfuscatedName("ao.g(I)V")
    public static void method586() {
        field1078.method3157();
    }
}
