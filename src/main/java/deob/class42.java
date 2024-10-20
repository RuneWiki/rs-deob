package deob;

@ObfuscatedName("af")
public class class42 extends class174 {

    @ObfuscatedName("af.g")
    public static class170 field1021 = new class170(64);

    @ObfuscatedName("af.o")
    public int field1022 = 0;

    @ObfuscatedName("da.b(Lej;I)V")
    public static void method2624(class153 arg0) {
        Statics.field1029 = arg0;
        Statics.field2739 = Statics.field1029.method3006(16);
    }

    @ObfuscatedName("dd.e(II)Laf;")
    public static class42 method2179(int arg0) {
        class42 var1 = (class42) field1021.method3248((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1029.method3026(16, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method866(new class126(var2));
        }
        field1021.method3252(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.g(Ldv;B)V")
    public void method866(class126 arg0) {
        while (true) {
            int var2 = arg0.method2436();
            if (var2 == 0) {
                return;
            }
            this.method867(arg0, var2);
        }
    }

    @ObfuscatedName("af.o(Ldv;II)V")
    public void method867(class126 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1022 = arg0.method2572();
        }
    }
}
