package deob;

@ObfuscatedName("ac")
public class class45 extends class195 {

    @ObfuscatedName("ac.k")
    public static class184 field1016 = new class184(64);

    @ObfuscatedName("ac.g")
    public char field1029;

    @ObfuscatedName("ac.n")
    public char field1018;

    @ObfuscatedName("ac.t")
    public String field1017 = "null";

    @ObfuscatedName("ac.e")
    public int field1015;

    @ObfuscatedName("ac.q")
    public int field1021 = 0;

    @ObfuscatedName("ac.z")
    public int[] field1022;

    @ObfuscatedName("ac.v")
    public int[] field1023;

    @ObfuscatedName("ac.b")
    public String[] field1024;

    @ObfuscatedName("ac.k(Ldw;S)V")
    public void method880(class111 arg0) {
        while (true) {
            int var2 = arg0.method2205();
            if (var2 == 0) {
                return;
            }
            this.method881(arg0, var2);
        }
    }

    @ObfuscatedName("ac.g(Ldw;II)V")
    public void method881(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1029 = (char) arg0.method2205();
        } else if (arg1 == 2) {
            this.field1018 = (char) arg0.method2205();
        } else if (arg1 == 3) {
            this.field1017 = arg0.method2170();
        } else if (arg1 == 4) {
            this.field1015 = arg0.method2165();
        } else if (arg1 == 5) {
            this.field1021 = arg0.method2339();
            this.field1022 = new int[this.field1021];
            this.field1024 = new String[this.field1021];
            for (int var3 = 0; var3 < this.field1021; var3++) {
                this.field1022[var3] = arg0.method2165();
                this.field1024[var3] = arg0.method2170();
            }
        } else if (arg1 == 6) {
            this.field1021 = arg0.method2339();
            this.field1022 = new int[this.field1021];
            this.field1023 = new int[this.field1021];
            for (int var4 = 0; var4 < this.field1021; var4++) {
                this.field1022[var4] = arg0.method2165();
                this.field1023[var4] = arg0.method2165();
            }
        }
    }
}
