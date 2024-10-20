package deob;

@ObfuscatedName("ab")
public class class39 extends class174 {

    @ObfuscatedName("ab.t")
    public static class170 field964 = new class170(64);

    @ObfuscatedName("ab.n")
    public char field954;

    @ObfuscatedName("ab.e")
    public char field953;

    @ObfuscatedName("ab.l")
    public String field957 = "null";

    @ObfuscatedName("ab.d")
    public int field958;

    @ObfuscatedName("ab.r")
    public int field959 = 0;

    @ObfuscatedName("ab.k")
    public int[] field956;

    @ObfuscatedName("ab.u")
    public int[] field961;

    @ObfuscatedName("ab.o")
    public String[] field962;

    @ObfuscatedName("x.f(Leo;I)V")
    public static void method231(class153 arg0) {
        Statics.field955 = arg0;
    }

    @ObfuscatedName("ak.t(IB)Lab;")
    public static class39 method1150(int arg0) {
        class39 var1 = (class39) field964.method3276((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field955.method3035(8, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method807(new class127(var2));
        }
        field964.method3275(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.n(Ldq;I)V")
    public void method807(class127 arg0) {
        while (true) {
            int var2 = arg0.method2458();
            if (var2 == 0) {
                return;
            }
            this.method808(arg0, var2);
        }
    }

    @ObfuscatedName("ab.e(Ldq;II)V")
    public void method808(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field954 = (char) arg0.method2458();
        } else if (arg1 == 2) {
            this.field953 = (char) arg0.method2458();
        } else if (arg1 == 3) {
            this.field957 = arg0.method2636();
        } else if (arg1 == 4) {
            this.field958 = arg0.method2463();
        } else if (arg1 == 5) {
            this.field959 = arg0.method2460();
            this.field956 = new int[this.field959];
            this.field962 = new String[this.field959];
            for (int var3 = 0; var3 < this.field959; var3++) {
                this.field956[var3] = arg0.method2463();
                this.field962[var3] = arg0.method2636();
            }
        } else if (arg1 == 6) {
            this.field959 = arg0.method2460();
            this.field956 = new int[this.field959];
            this.field961 = new int[this.field959];
            for (int var4 = 0; var4 < this.field959; var4++) {
                this.field956[var4] = arg0.method2463();
                this.field961[var4] = arg0.method2463();
            }
        }
    }
}
