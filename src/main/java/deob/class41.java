package deob;

@ObfuscatedName("ac")
public class class41 extends class172 {

    @ObfuscatedName("ac.c")
    public static class168 field1039 = new class168(64);

    @ObfuscatedName("ac.p")
    public int field1041 = 0;

    @ObfuscatedName("fq.z(Len;I)V")
    public static void method3140(class150 arg0) {
        Statics.field1043 = arg0;
        Statics.field1037 = Statics.field1043.method2961(16);
    }

    @ObfuscatedName("ad.h(II)Lac;")
    public static class41 method681(int arg0) {
        class41 var1 = (class41) field1039.method3240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1043.method2951(16, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method892(new class126(var2));
        }
        field1039.method3237(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.c(Ldq;I)V")
    public void method892(class126 arg0) {
        while (true) {
            int var2 = arg0.method2450();
            if (var2 == 0) {
                return;
            }
            this.method885(arg0, var2);
        }
    }

    @ObfuscatedName("ac.p(Ldq;IB)V")
    public void method885(class126 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1041 = arg0.method2627();
        }
    }
}
