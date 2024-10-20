package deob;

@ObfuscatedName("at")
public class class43 extends class180 {

    @ObfuscatedName("at.p")
    public static class170 field981 = new class170(64);

    @ObfuscatedName("at.a")
    public char field976;

    @ObfuscatedName("at.g")
    public char field983;

    @ObfuscatedName("at.u")
    public String field978 = "null";

    @ObfuscatedName("at.k")
    public int field979;

    @ObfuscatedName("at.m")
    public int field974 = 0;

    @ObfuscatedName("at.t")
    public int[] field988;

    @ObfuscatedName("at.l")
    public int[] field975;

    @ObfuscatedName("at.f")
    public String[] field980;

    @ObfuscatedName("at.e(Ldp;S)V")
    public void method837(class107 arg0) {
        while (true) {
            int var2 = arg0.method2125();
            if (var2 == 0) {
                return;
            }
            this.method847(arg0, var2);
        }
    }

    @ObfuscatedName("at.p(Ldp;II)V")
    public void method847(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field976 = (char) arg0.method2125();
        } else if (arg1 == 2) {
            this.field983 = (char) arg0.method2125();
        } else if (arg1 == 3) {
            this.field978 = arg0.method2149();
        } else if (arg1 == 4) {
            this.field979 = arg0.method2146();
        } else if (arg1 == 5) {
            this.field974 = arg0.method2182();
            this.field988 = new int[this.field974];
            this.field980 = new String[this.field974];
            for (int var3 = 0; var3 < this.field974; var3++) {
                this.field988[var3] = arg0.method2146();
                this.field980[var3] = arg0.method2149();
            }
        } else if (arg1 == 6) {
            this.field974 = arg0.method2182();
            this.field988 = new int[this.field974];
            this.field975 = new int[this.field974];
            for (int var4 = 0; var4 < this.field974; var4++) {
                this.field988[var4] = arg0.method2146();
                this.field975[var4] = arg0.method2146();
            }
        }
    }
}
