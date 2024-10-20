package deob;

@ObfuscatedName("fd")
public class class161 extends class143 {

    @ObfuscatedName("fd.r")
    public static class101 field2422 = new class101(64);

    @ObfuscatedName("fd.d")
    public int field2423;

    @ObfuscatedName("fd.k")
    public char field2427;

    @ObfuscatedName("fd.u")
    public String field2430 = "null";

    @ObfuscatedName("fd.v")
    public int field2426;

    @ObfuscatedName("fd.f")
    public int field2425 = 0;

    @ObfuscatedName("fd.s")
    public int[] field2428;

    @ObfuscatedName("fd.j")
    public int[] field2429;

    @ObfuscatedName("fd.e")
    public String[] field2421;

    @ObfuscatedName("fd.u(Let;B)V")
    public void method2514(class136 arg0) {
        while (true) {
            int var2 = arg0.method1602();
            if (var2 == 0) {
                return;
            }
            this.method2515(arg0, var2);
        }
    }

    @ObfuscatedName("fd.v(Let;IB)V")
    public void method2515(class136 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2423 = arg0.method1602();
        } else if (arg1 == 2) {
            this.field2427 = (char) arg0.method1602();
        } else if (arg1 == 3) {
            this.field2430 = arg0.method1610();
        } else if (arg1 == 4) {
            this.field2426 = arg0.method1607();
        } else if (arg1 == 5) {
            this.field2425 = arg0.method1712();
            this.field2428 = new int[this.field2425];
            this.field2421 = new String[this.field2425];
            for (int var3 = 0; var3 < this.field2425; var3++) {
                this.field2428[var3] = arg0.method1607();
                this.field2421[var3] = arg0.method1610();
            }
        } else if (arg1 == 6) {
            this.field2425 = arg0.method1712();
            this.field2428 = new int[this.field2425];
            this.field2429 = new int[this.field2425];
            for (int var4 = 0; var4 < this.field2425; var4++) {
                this.field2428[var4] = arg0.method1607();
                this.field2429[var4] = arg0.method1607();
            }
        }
    }
}
