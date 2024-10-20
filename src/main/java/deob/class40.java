package deob;

@ObfuscatedName("au")
public class class40 extends class174 {

    @ObfuscatedName("au.k")
    public static class167 field957 = new class167(64);

    @ObfuscatedName("au.y")
    public char field958;

    @ObfuscatedName("au.g")
    public char field959;

    @ObfuscatedName("au.r")
    public String field960 = "null";

    @ObfuscatedName("au.i")
    public int field961;

    @ObfuscatedName("au.f")
    public int field962 = 0;

    @ObfuscatedName("au.a")
    public int[] field968;

    @ObfuscatedName("au.w")
    public int[] field964;

    @ObfuscatedName("au.u")
    public String[] field965;

    @ObfuscatedName("ev.m(Lek;I)V")
    public static void method2652(class142 arg0) {
        Statics.field963 = arg0;
    }

    @ObfuscatedName("au.k(Lcb;I)V")
    public void method772(class104 arg0) {
        while (true) {
            int var2 = arg0.method2190();
            if (var2 == 0) {
                return;
            }
            this.method773(arg0, var2);
        }
    }

    @ObfuscatedName("au.y(Lcb;IB)V")
    public void method773(class104 arg0, int arg1) {
        if (arg1 == 1) {
            this.field958 = (char) arg0.method2190();
        } else if (arg1 == 2) {
            this.field959 = (char) arg0.method2190();
        } else if (arg1 == 3) {
            this.field960 = arg0.method2138();
        } else if (arg1 == 4) {
            this.field961 = arg0.method2135();
        } else if (arg1 == 5) {
            this.field962 = arg0.method2132();
            this.field968 = new int[this.field962];
            this.field965 = new String[this.field962];
            for (int var3 = 0; var3 < this.field962; var3++) {
                this.field968[var3] = arg0.method2135();
                this.field965[var3] = arg0.method2138();
            }
        } else if (arg1 == 6) {
            this.field962 = arg0.method2132();
            this.field968 = new int[this.field962];
            this.field964 = new int[this.field962];
            for (int var4 = 0; var4 < this.field962; var4++) {
                this.field968[var4] = arg0.method2135();
                this.field964[var4] = arg0.method2135();
            }
        }
    }
}
