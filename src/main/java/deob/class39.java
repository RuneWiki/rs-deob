package deob;

@ObfuscatedName("am")
public class class39 extends class175 {

    @ObfuscatedName("am.b")
    public static class171 field956 = new class171(64);

    @ObfuscatedName("am.o")
    public char field957;

    @ObfuscatedName("am.w")
    public char field965;

    @ObfuscatedName("am.r")
    public String field968 = "null";

    @ObfuscatedName("am.k")
    public int field960;

    @ObfuscatedName("am.z")
    public int field961 = 0;

    @ObfuscatedName("am.g")
    public int[] field962;

    @ObfuscatedName("am.n")
    public int[] field963;

    @ObfuscatedName("am.j")
    public String[] field958;

    @ObfuscatedName("ae.l(II)Lam;")
    public static class39 method745(int arg0) {
        class39 var1 = (class39) field956.method3255((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field959.method3029(8, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method827(new class127(var2));
        }
        field956.method3253(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.b(Ldm;B)V")
    public void method827(class127 arg0) {
        while (true) {
            int var2 = arg0.method2440();
            if (var2 == 0) {
                return;
            }
            this.method828(arg0, var2);
        }
    }

    @ObfuscatedName("am.o(Ldm;IB)V")
    public void method828(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field957 = (char) arg0.method2440();
        } else if (arg1 == 2) {
            this.field965 = (char) arg0.method2440();
        } else if (arg1 == 3) {
            this.field968 = arg0.method2471();
        } else if (arg1 == 4) {
            this.field960 = arg0.method2586();
        } else if (arg1 == 5) {
            this.field961 = arg0.method2442();
            this.field962 = new int[this.field961];
            this.field958 = new String[this.field961];
            for (int var3 = 0; var3 < this.field961; var3++) {
                this.field962[var3] = arg0.method2586();
                this.field958[var3] = arg0.method2471();
            }
        } else if (arg1 == 6) {
            this.field961 = arg0.method2442();
            this.field962 = new int[this.field961];
            this.field963 = new int[this.field961];
            for (int var4 = 0; var4 < this.field961; var4++) {
                this.field962[var4] = arg0.method2586();
                this.field963[var4] = arg0.method2586();
            }
        }
    }
}
