package deob;

@ObfuscatedName("am")
public class class41 extends class174 {

    @ObfuscatedName("am.n")
    public static class167 field975 = new class167(64);

    @ObfuscatedName("am.u")
    public int field976 = 0;

    @ObfuscatedName("a.z(Lel;B)V")
    public static void method64(class142 arg0) {
        Statics.field979 = arg0;
    }

    @ObfuscatedName("ad.n(II)Lam;")
    public static class41 method578(int arg0) {
        class41 var1 = (class41) field975.method3183((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field979.method2768(5, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method841(new class104(var2));
        }
        field975.method3185(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.u(Lcj;I)V")
    public void method841(class104 arg0) {
        while (true) {
            int var2 = arg0.method2257();
            if (var2 == 0) {
                return;
            }
            this.method844(arg0, var2);
        }
    }

    @ObfuscatedName("am.t(Lcj;IB)V")
    public void method844(class104 arg0, int arg1) {
        if (arg1 == 2) {
            this.field976 = arg0.method2206();
        }
    }
}
