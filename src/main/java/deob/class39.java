package deob;

@ObfuscatedName("aa")
public class class39 extends class174 {

    @ObfuscatedName("aa.m")
    public static class170 field948 = new class170(64);

    @ObfuscatedName("aa.d")
    public int field949;

    @ObfuscatedName("aa.k")
    public char field950;

    @ObfuscatedName("aa.n")
    public String field962 = "null";

    @ObfuscatedName("aa.s")
    public int field952;

    @ObfuscatedName("aa.x")
    public int field953 = 0;

    @ObfuscatedName("aa.b")
    public int[] field956;

    @ObfuscatedName("aa.j")
    public int[] field947;

    @ObfuscatedName("aa.p")
    public String[] field951;

    @ObfuscatedName("at.y(Lel;I)V")
    public static void method750(class152 arg0) {
        Statics.field954 = arg0;
    }

    @ObfuscatedName("aa.m(Ldp;I)V")
    public void method829(class127 arg0) {
        while (true) {
            int var2 = arg0.method2534();
            if (var2 == 0) {
                return;
            }
            this.method833(arg0, var2);
        }
    }

    @ObfuscatedName("aa.d(Ldp;II)V")
    public void method833(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field949 = arg0.method2534();
        } else if (arg1 == 2) {
            this.field950 = (char) arg0.method2534();
        } else if (arg1 == 3) {
            this.field962 = arg0.method2466();
        } else if (arg1 == 4) {
            this.field952 = arg0.method2628();
        } else if (arg1 == 5) {
            this.field953 = arg0.method2460();
            this.field956 = new int[this.field953];
            this.field951 = new String[this.field953];
            for (int var3 = 0; var3 < this.field953; var3++) {
                this.field956[var3] = arg0.method2628();
                this.field951[var3] = arg0.method2466();
            }
        } else if (arg1 == 6) {
            this.field953 = arg0.method2460();
            this.field956 = new int[this.field953];
            this.field947 = new int[this.field953];
            for (int var4 = 0; var4 < this.field953; var4++) {
                this.field956[var4] = arg0.method2628();
                this.field947[var4] = arg0.method2628();
            }
        }
    }
}
