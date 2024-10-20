package deob;

@ObfuscatedName("aj")
public class class39 extends class174 {

    @ObfuscatedName("aj.n")
    public static class167 field950 = new class167(64);

    @ObfuscatedName("aj.u")
    public int field954;

    @ObfuscatedName("aj.t")
    public int field948;

    @ObfuscatedName("aj.e")
    public int field952;

    @ObfuscatedName("dq.z(Lel;B)V")
    public static void method2413(class142 arg0) {
        Statics.field949 = arg0;
    }

    @ObfuscatedName("fg.n(II)Laj;")
    public static class39 method3172(int arg0) {
        class39 var1 = (class39) field950.method3183((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field949.method2768(14, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method811(new class104(var2));
        }
        field950.method3185(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.u(Lcj;I)V")
    public void method811(class104 arg0) {
        while (true) {
            int var2 = arg0.method2257();
            if (var2 == 0) {
                return;
            }
            this.method822(arg0, var2);
        }
    }

    @ObfuscatedName("aj.t(Lcj;IB)V")
    public void method822(class104 arg0, int arg1) {
        if (arg1 == 1) {
            this.field954 = arg0.method2206();
            this.field948 = arg0.method2257();
            this.field952 = arg0.method2257();
        }
    }

    @ObfuscatedName("fn.e(I)V")
    public static void method3059() {
        field950.method3193();
    }
}
