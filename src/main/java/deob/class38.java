package deob;

@ObfuscatedName("aj")
public class class38 extends class173 {

    @ObfuscatedName("aj.k")
    public static class169 field950 = new class169(64);

    @ObfuscatedName("aj.x")
    public int field948;

    @ObfuscatedName("aj.m")
    public char field949;

    @ObfuscatedName("aj.n")
    public String field952 = "null";

    @ObfuscatedName("aj.q")
    public int field953;

    @ObfuscatedName("aj.a")
    public int field954 = 0;

    @ObfuscatedName("aj.g")
    public int[] field955;

    @ObfuscatedName("aj.j")
    public int[] field956;

    @ObfuscatedName("aj.l")
    public String[] field957;

    @ObfuscatedName("bs.u(Leb;I)V")
    public static void method1366(class151 arg0) {
        Statics.field960 = arg0;
    }

    @ObfuscatedName("aj.x(Ldl;S)V")
    public void method809(class126 arg0) {
        while (true) {
            int var2 = arg0.method2559();
            if (var2 == 0) {
                return;
            }
            this.method799(arg0, var2);
        }
    }

    @ObfuscatedName("aj.m(Ldl;IB)V")
    public void method799(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field948 = arg0.method2559();
        } else if (arg1 == 2) {
            this.field949 = (char) arg0.method2559();
        } else if (arg1 == 3) {
            this.field952 = arg0.method2630();
        } else if (arg1 == 4) {
            this.field953 = arg0.method2526();
        } else if (arg1 == 5) {
            this.field954 = arg0.method2450();
            this.field955 = new int[this.field954];
            this.field957 = new String[this.field954];
            for (int var3 = 0; var3 < this.field954; var3++) {
                this.field955[var3] = arg0.method2526();
                this.field957[var3] = arg0.method2630();
            }
        } else if (arg1 == 6) {
            this.field954 = arg0.method2450();
            this.field955 = new int[this.field954];
            this.field956 = new int[this.field954];
            for (int var4 = 0; var4 < this.field954; var4++) {
                this.field955[var4] = arg0.method2526();
                this.field956[var4] = arg0.method2526();
            }
        }
    }
}
