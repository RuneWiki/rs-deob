package deob;

@ObfuscatedName("jj")
public class class261 extends class185 {

    @ObfuscatedName("jj.k")
    public static class155 field3333 = new class155(64);

    @ObfuscatedName("jj.s")
    public class326 field3334;

    @ObfuscatedName("cy.z(Lic;I)V")
    public static void method2139(class244 arg0) {
        Statics.field3335 = arg0;
    }

    @ObfuscatedName("fh.k(II)Ljj;")
    public static class261 method3336(int arg0) {
        class261 var1 = (class261) field3333.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3335.method3873(34, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4235(new class310(var2));
        }
        var3.method4236();
        field3333.method3169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jj.s(I)V")
    public void method4236() {
    }

    @ObfuscatedName("jj.t(Lkf;I)V")
    public void method4235(class310 arg0) {
        while (true) {
            int var2 = arg0.method5193();
            if (var2 == 0) {
                return;
            }
            this.method4244(arg0, var2);
        }
    }

    @ObfuscatedName("jj.i(Lkf;II)V")
    public void method4244(class310 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3334 = class258.method2185(arg0, this.field3334);
        }
    }

    @ObfuscatedName("jj.o(IIB)I")
    public int method4239(int arg0, int arg1) {
        return class258.method4902(this.field3334, arg0, arg1);
    }

    @ObfuscatedName("jj.x(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4257(int arg0, String arg1) {
        class326 var3 = this.field3334;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class186 var5 = (class186) var3.method5582((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2150;
            }
        }
        return var4;
    }

    @ObfuscatedName("ig.w(I)V")
    public static void method3869() {
        field3333.method3172();
    }
}
