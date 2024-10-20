package deob;

@ObfuscatedName("ag")
public class class48 extends class195 {

    @ObfuscatedName("ag.z")
    public static class184 field1095 = new class184(64);

    @ObfuscatedName("ag.y")
    public int field1094 = 0;

    @ObfuscatedName("aj.n(Lfs;I)V")
    public static void method920(class158 arg0) {
        Statics.field1097 = arg0;
        Statics.field3057 = Statics.field1097.method2978(16);
    }

    @ObfuscatedName("an.d(II)Lag;")
    public static class48 method804(int arg0) {
        class48 var1 = (class48) field1095.method3411((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1097.method2948(16, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method950(new class111(var2));
        }
        field1095.method3420(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.z(Ldl;I)V")
    public void method950(class111 arg0) {
        while (true) {
            int var2 = arg0.method2228();
            if (var2 == 0) {
                return;
            }
            this.method951(arg0, var2);
        }
    }

    @ObfuscatedName("ag.y(Ldl;II)V")
    public void method951(class111 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1094 = arg0.method2231();
        }
    }
}
