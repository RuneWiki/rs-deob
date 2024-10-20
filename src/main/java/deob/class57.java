package deob;

@ObfuscatedName("bg")
public class class57 extends class208 {

    @ObfuscatedName("bg.j")
    public static class197 field1211 = new class197(64);

    @ObfuscatedName("bg.z")
    public int field1212 = 0;

    @ObfuscatedName("ai.x(Lfp;I)V")
    public static void method984(class171 arg0) {
        Statics.field1215 = arg0;
        Statics.field584 = Statics.field1215.method3088(16);
    }

    @ObfuscatedName("af.r(II)Lbg;")
    public static class57 method699(int arg0) {
        class57 var1 = (class57) field1211.method3533((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1215.method3079(16, arg0);
        class57 var3 = new class57();
        if (var2 != null) {
            var3.method1134(new class123(var2));
        }
        field1211.method3535(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bg.j(Ldp;I)V")
    public void method1134(class123 arg0) {
        while (true) {
            int var2 = arg0.method2408();
            if (var2 == 0) {
                return;
            }
            this.method1135(arg0, var2);
        }
    }

    @ObfuscatedName("bg.z(Ldp;IB)V")
    public void method1135(class123 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1212 = arg0.method2403();
        }
    }

    @ObfuscatedName("aa.i(I)V")
    public static void method917() {
        field1211.method3534();
    }
}
