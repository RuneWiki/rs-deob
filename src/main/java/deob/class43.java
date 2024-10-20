package deob;

@ObfuscatedName("al")
public class class43 extends class182 {

    @ObfuscatedName("al.v")
    public static class171 field981 = new class171(64);

    @ObfuscatedName("al.z")
    public char field982;

    @ObfuscatedName("al.h")
    public char field984;

    @ObfuscatedName("al.k")
    public String field986 = "null";

    @ObfuscatedName("al.l")
    public int field980;

    @ObfuscatedName("al.e")
    public int field988 = 0;

    @ObfuscatedName("al.j")
    public int[] field987;

    @ObfuscatedName("al.n")
    public int[] field993;

    @ObfuscatedName("al.f")
    public String[] field989;

    @ObfuscatedName("al.v(Ldm;S)V")
    public void method839(class107 arg0) {
        while (true) {
            int var2 = arg0.method2139();
            if (var2 == 0) {
                return;
            }
            this.method840(arg0, var2);
        }
    }

    @ObfuscatedName("al.z(Ldm;II)V")
    public void method840(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field982 = (char) arg0.method2139();
        } else if (arg1 == 2) {
            this.field984 = (char) arg0.method2139();
        } else if (arg1 == 3) {
            this.field986 = arg0.method2147();
        } else if (arg1 == 4) {
            this.field980 = arg0.method2144();
        } else if (arg1 == 5) {
            this.field988 = arg0.method2141();
            this.field987 = new int[this.field988];
            this.field989 = new String[this.field988];
            for (int var3 = 0; var3 < this.field988; var3++) {
                this.field987[var3] = arg0.method2144();
                this.field989[var3] = arg0.method2147();
            }
        } else if (arg1 == 6) {
            this.field988 = arg0.method2141();
            this.field987 = new int[this.field988];
            this.field993 = new int[this.field988];
            for (int var4 = 0; var4 < this.field988; var4++) {
                this.field987[var4] = arg0.method2144();
                this.field993[var4] = arg0.method2144();
            }
        }
    }
}
