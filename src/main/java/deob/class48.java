package deob;

@ObfuscatedName("ay")
public class class48 extends class198 {

    @ObfuscatedName("ay.y")
    public static class187 field1062 = new class187(64);

    @ObfuscatedName("ay.z")
    public boolean field1063 = false;

    @ObfuscatedName("q.j(Lfh;I)V")
    public static void method594(class161 arg0) {
        Statics.field1067 = arg0;
    }

    @ObfuscatedName("an.y(II)Lay;")
    public static class48 method687(int arg0) {
        class48 var1 = (class48) field1062.method3432((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1067.method2995(15, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method998(new class114(var2));
        }
        field1062.method3434(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.z(Lde;B)V")
    public void method998(class114 arg0) {
        while (true) {
            int var2 = arg0.method2322();
            if (var2 == 0) {
                return;
            }
            this.method1000(arg0, var2);
        }
    }

    @ObfuscatedName("ay.l(Lde;II)V")
    public void method1000(class114 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1063 = true;
        }
    }
}
