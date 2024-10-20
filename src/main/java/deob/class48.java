package deob;

@ObfuscatedName("ar")
public class class48 extends class204 {

    @ObfuscatedName("ar.b")
    public static class193 field1067 = new class193(64);

    @ObfuscatedName("ar.w")
    public int field1068;

    @ObfuscatedName("ar.d")
    public int field1076;

    @ObfuscatedName("ar.z")
    public int field1069;

    @ObfuscatedName("cq.g(Lfc;I)V")
    public static void method2078(class167 arg0) {
        Statics.field1075 = arg0;
    }

    @ObfuscatedName("aw.b(II)Lar;")
    public static class48 method733(int arg0) {
        class48 var1 = (class48) field1067.method3529((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1075.method3112(14, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method976(new class119(var2));
        }
        field1067.method3528(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.w(Ldm;I)V")
    public void method976(class119 arg0) {
        while (true) {
            int var2 = arg0.method2362();
            if (var2 == 0) {
                return;
            }
            this.method978(arg0, var2);
        }
    }

    @ObfuscatedName("ar.d(Ldm;IS)V")
    public void method978(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1068 = arg0.method2376();
            this.field1076 = arg0.method2362();
            this.field1069 = arg0.method2362();
        }
    }

    @ObfuscatedName("u.z(B)V")
    public static void method121() {
        field1067.method3532();
    }
}
