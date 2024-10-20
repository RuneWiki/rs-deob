package deob;

@ObfuscatedName("al")
public class class42 extends class174 {

    @ObfuscatedName("al.u")
    public static class170 field1023 = new class170(64);

    @ObfuscatedName("al.t")
    public int field1024 = 0;

    @ObfuscatedName("ad.a(Lev;I)V")
    public static void method506(class152 arg0) {
        Statics.field1030 = arg0;
        Statics.field1022 = Statics.field1030.method2962(16);
    }

    @ObfuscatedName("r.r(II)Lal;")
    public static class42 method11(int arg0) {
        class42 var1 = (class42) field1023.method3208((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1030.method2943(16, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method831(new class126(var2));
        }
        field1023.method3210(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.u(Ldf;B)V")
    public void method831(class126 arg0) {
        while (true) {
            int var2 = arg0.method2481();
            if (var2 == 0) {
                return;
            }
            this.method832(arg0, var2);
        }
    }

    @ObfuscatedName("al.t(Ldf;II)V")
    public void method832(class126 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1024 = arg0.method2373();
        }
    }

    @ObfuscatedName("e.k(I)V")
    public static void method108() {
        field1023.method3216();
    }
}
