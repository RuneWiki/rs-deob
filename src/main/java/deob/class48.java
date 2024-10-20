package deob;

@ObfuscatedName("af")
public class class48 extends class204 {

    @ObfuscatedName("af.r")
    public static class193 field1063 = new class193(64);

    @ObfuscatedName("af.f")
    public int field1064;

    @ObfuscatedName("af.s")
    public int field1066;

    @ObfuscatedName("af.y")
    public int field1067;

    @ObfuscatedName("a.a(Lfz;I)V")
    public static void method2(class167 arg0) {
        Statics.field1065 = arg0;
    }

    @ObfuscatedName("au.r(II)Laf;")
    public static class48 method1004(int arg0) {
        class48 var1 = (class48) field1063.method3507((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1065.method3025(14, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method970(new class119(var2));
        }
        field1063.method3509(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.f(Lds;B)V")
    public void method970(class119 arg0) {
        while (true) {
            int var2 = arg0.method2412();
            if (var2 == 0) {
                return;
            }
            this.method967(arg0, var2);
        }
    }

    @ObfuscatedName("af.s(Lds;II)V")
    public void method967(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1064 = arg0.method2347();
            this.field1066 = arg0.method2412();
            this.field1067 = arg0.method2412();
        }
    }

    @ObfuscatedName("r.y(I)V")
    public static void method14() {
        field1063.method3515();
    }
}
