package deob;

@ObfuscatedName("ac")
public class class39 extends class174 {

    @ObfuscatedName("ac.r")
    public static class170 field954 = new class170(64);

    @ObfuscatedName("ac.u")
    public int field947;

    @ObfuscatedName("ac.t")
    public char field953;

    @ObfuscatedName("ac.k")
    public String field946 = "null";

    @ObfuscatedName("ac.x")
    public int field958;

    @ObfuscatedName("ac.v")
    public int field950 = 0;

    @ObfuscatedName("ac.g")
    public int[] field951;

    @ObfuscatedName("ac.n")
    public int[] field952;

    @ObfuscatedName("ac.q")
    public String[] field945;

    @ObfuscatedName("x.a(Lev;I)V")
    public static void method38(class152 arg0) {
        Statics.field949 = arg0;
    }

    @ObfuscatedName("a.r(IB)Lac;")
    public static class39 method6(int arg0) {
        class39 var1 = (class39) field954.method3208((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field949.method2943(8, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method761(new class126(var2));
        }
        field954.method3210(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.u(Ldf;I)V")
    public void method761(class126 arg0) {
        while (true) {
            int var2 = arg0.method2481();
            if (var2 == 0) {
                return;
            }
            this.method763(arg0, var2);
        }
    }

    @ObfuscatedName("ac.t(Ldf;IB)V")
    public void method763(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field947 = arg0.method2481();
        } else if (arg1 == 2) {
            this.field953 = (char) arg0.method2481();
        } else if (arg1 == 3) {
            this.field946 = arg0.method2386();
        } else if (arg1 == 4) {
            this.field958 = arg0.method2383();
        } else if (arg1 == 5) {
            this.field950 = arg0.method2373();
            this.field951 = new int[this.field950];
            this.field945 = new String[this.field950];
            for (int var3 = 0; var3 < this.field950; var3++) {
                this.field951[var3] = arg0.method2383();
                this.field945[var3] = arg0.method2386();
            }
        } else if (arg1 == 6) {
            this.field950 = arg0.method2373();
            this.field951 = new int[this.field950];
            this.field952 = new int[this.field950];
            for (int var4 = 0; var4 < this.field950; var4++) {
                this.field951[var4] = arg0.method2383();
                this.field952[var4] = arg0.method2383();
            }
        }
    }
}
