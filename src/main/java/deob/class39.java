package deob;

@ObfuscatedName("ar")
public class class39 extends class174 {

    @ObfuscatedName("ar.e")
    public static class170 field957 = new class170(64);

    @ObfuscatedName("ar.a")
    public char field958;

    @ObfuscatedName("ar.h")
    public char field959;

    @ObfuscatedName("ar.y")
    public String field963 = "null";

    @ObfuscatedName("ar.j")
    public int field960;

    @ObfuscatedName("ar.l")
    public int field962 = 0;

    @ObfuscatedName("ar.f")
    public int[] field964;

    @ObfuscatedName("ar.n")
    public int[] field967;

    @ObfuscatedName("ar.k")
    public String[] field965;

    @ObfuscatedName("client.p(II)Lar;")
    public static class39 method553(int arg0) {
        class39 var1 = (class39) field957.method3266((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field961.method3048(8, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method832(new class127(var2));
        }
        field957.method3268(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.e(Ldj;I)V")
    public void method832(class127 arg0) {
        while (true) {
            int var2 = arg0.method2494();
            if (var2 == 0) {
                return;
            }
            this.method833(arg0, var2);
        }
    }

    @ObfuscatedName("ar.a(Ldj;IB)V")
    public void method833(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field958 = (char) arg0.method2494();
        } else if (arg1 == 2) {
            this.field959 = (char) arg0.method2494();
        } else if (arg1 == 3) {
            this.field963 = arg0.method2502();
        } else if (arg1 == 4) {
            this.field960 = arg0.method2617();
        } else if (arg1 == 5) {
            this.field962 = arg0.method2496();
            this.field964 = new int[this.field962];
            this.field965 = new String[this.field962];
            for (int var3 = 0; var3 < this.field962; var3++) {
                this.field964[var3] = arg0.method2617();
                this.field965[var3] = arg0.method2502();
            }
        } else if (arg1 == 6) {
            this.field962 = arg0.method2496();
            this.field964 = new int[this.field962];
            this.field967 = new int[this.field962];
            for (int var4 = 0; var4 < this.field962; var4++) {
                this.field964[var4] = arg0.method2617();
                this.field967[var4] = arg0.method2617();
            }
        }
    }
}
