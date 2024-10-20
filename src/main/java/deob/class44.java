package deob;

@ObfuscatedName("al")
public class class44 extends class198 {

    @ObfuscatedName("al.y")
    public static class187 field1020 = new class187(64);

    @ObfuscatedName("al.z")
    public boolean field1021 = false;

    @ObfuscatedName("w.j(Lfh;I)V")
    public static void method36(class161 arg0) {
        Statics.field1026 = arg0;
    }

    @ObfuscatedName("l.y(IB)Lal;")
    public static class44 method31(int arg0) {
        class44 var1 = (class44) field1020.method3432((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1026.method2995(19, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method935(new class114(var2));
        }
        field1020.method3434(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.z(Lde;I)V")
    public void method935(class114 arg0) {
        while (true) {
            int var2 = arg0.method2322();
            if (var2 == 0) {
                return;
            }
            this.method937(arg0, var2);
        }
    }

    @ObfuscatedName("al.l(Lde;II)V")
    public void method937(class114 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1021 = true;
        }
    }
}
