package deob;

@ObfuscatedName("ap")
public class class45 extends class194 {

    @ObfuscatedName("ap.s")
    public static class183 field997 = new class183(64);

    @ObfuscatedName("ap.h")
    public char field994;

    @ObfuscatedName("ap.e")
    public char field1006;

    @ObfuscatedName("ap.n")
    public String field996 = "null";

    @ObfuscatedName("ap.t")
    public int field1002;

    @ObfuscatedName("ap.l")
    public int field1004 = 0;

    @ObfuscatedName("ap.m")
    public int[] field993;

    @ObfuscatedName("ap.o")
    public int[] field1000;

    @ObfuscatedName("ap.k")
    public String[] field1001;

    @ObfuscatedName("ap.q(Ldx;B)V")
    public void method839(class111 arg0) {
        while (true) {
            int var2 = arg0.method2231();
            if (var2 == 0) {
                return;
            }
            this.method841(arg0, var2);
        }
    }

    @ObfuscatedName("ap.s(Ldx;II)V")
    public void method841(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field994 = (char) arg0.method2231();
        } else if (arg1 == 2) {
            this.field1006 = (char) arg0.method2231();
        } else if (arg1 == 3) {
            this.field996 = arg0.method2156();
        } else if (arg1 == 4) {
            this.field1002 = arg0.method2153();
        } else if (arg1 == 5) {
            this.field1004 = arg0.method2307();
            this.field993 = new int[this.field1004];
            this.field1001 = new String[this.field1004];
            for (int var3 = 0; var3 < this.field1004; var3++) {
                this.field993[var3] = arg0.method2153();
                this.field1001[var3] = arg0.method2156();
            }
        } else if (arg1 == 6) {
            this.field1004 = arg0.method2307();
            this.field993 = new int[this.field1004];
            this.field1000 = new int[this.field1004];
            for (int var4 = 0; var4 < this.field1004; var4++) {
                this.field993[var4] = arg0.method2153();
                this.field1000[var4] = arg0.method2153();
            }
        }
    }
}
