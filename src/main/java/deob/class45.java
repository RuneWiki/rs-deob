package deob;

@ObfuscatedName("ae")
public class class45 extends class195 {

    @ObfuscatedName("ae.g")
    public static class184 field1044 = new class184(64);

    @ObfuscatedName("ae.a")
    public char field1047;

    @ObfuscatedName("ae.m")
    public char field1043;

    @ObfuscatedName("ae.s")
    public String field1046 = "null";

    @ObfuscatedName("ae.j")
    public int field1048;

    @ObfuscatedName("ae.f")
    public int field1049 = 0;

    @ObfuscatedName("ae.b")
    public int[] field1052;

    @ObfuscatedName("ae.t")
    public int[] field1051;

    @ObfuscatedName("ae.i")
    public String[] field1050;

    @ObfuscatedName("ae.n(Ldp;B)V")
    public void method865(class111 arg0) {
        while (true) {
            int var2 = arg0.method2211();
            if (var2 == 0) {
                return;
            }
            this.method866(arg0, var2);
        }
    }

    @ObfuscatedName("ae.g(Ldp;II)V")
    public void method866(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1047 = (char) arg0.method2211();
        } else if (arg1 == 2) {
            this.field1043 = (char) arg0.method2211();
        } else if (arg1 == 3) {
            this.field1046 = arg0.method2223();
        } else if (arg1 == 4) {
            this.field1048 = arg0.method2366();
        } else if (arg1 == 5) {
            this.field1049 = arg0.method2395();
            this.field1052 = new int[this.field1049];
            this.field1050 = new String[this.field1049];
            for (int var3 = 0; var3 < this.field1049; var3++) {
                this.field1052[var3] = arg0.method2366();
                this.field1050[var3] = arg0.method2223();
            }
        } else if (arg1 == 6) {
            this.field1049 = arg0.method2395();
            this.field1052 = new int[this.field1049];
            this.field1051 = new int[this.field1049];
            for (int var4 = 0; var4 < this.field1049; var4++) {
                this.field1052[var4] = arg0.method2366();
                this.field1051[var4] = arg0.method2366();
            }
        }
    }
}
