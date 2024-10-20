package deob;

@ObfuscatedName("av")
public class class48 extends class208 {

    @ObfuscatedName("av.r")
    public static class197 field1049 = new class197(64);

    @ObfuscatedName("av.j")
    public boolean field1048 = false;

    @ObfuscatedName("dz.x(Lfp;I)V")
    public static void method2360(class171 arg0) {
        Statics.field1047 = arg0;
    }

    @ObfuscatedName("dh.r(IB)Lav;")
    public static class48 method2331(int arg0) {
        class48 var1 = (class48) field1049.method3533((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1047.method3079(19, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method922(new class123(var2));
        }
        field1049.method3535(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.j(Ldp;I)V")
    public void method922(class123 arg0) {
        while (true) {
            int var2 = arg0.method2408();
            if (var2 == 0) {
                return;
            }
            this.method923(arg0, var2);
        }
    }

    @ObfuscatedName("av.z(Ldp;II)V")
    public void method923(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1048 = true;
        }
    }
}
