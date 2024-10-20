package deob;

@ObfuscatedName("ge")
public class class196 extends class130 {

    @ObfuscatedName("ge.e")
    public static class125 field2869 = new class125(64);

    @ObfuscatedName("ge.c")
    public char field2866;

    @ObfuscatedName("ge.l")
    public char field2864;

    @ObfuscatedName("ge.y")
    public String field2868 = "null";

    @ObfuscatedName("ge.j")
    public int field2873;

    @ObfuscatedName("ge.g")
    public int field2865 = 0;

    @ObfuscatedName("ge.s")
    public int[] field2871;

    @ObfuscatedName("ge.r")
    public int[] field2872;

    @ObfuscatedName("ge.t")
    public String[] field2867;

    @ObfuscatedName("ge.b(Lec;I)V")
    public void method3389(class154 arg0) {
        while (true) {
            int var2 = arg0.method2669();
            if (var2 == 0) {
                return;
            }
            this.method3388(arg0, var2);
        }
    }

    @ObfuscatedName("ge.e(Lec;II)V")
    public void method3388(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2866 = (char) arg0.method2669();
        } else if (arg1 == 2) {
            this.field2864 = (char) arg0.method2669();
        } else if (arg1 == 3) {
            this.field2868 = arg0.method2677();
        } else if (arg1 == 4) {
            this.field2873 = arg0.method2815();
        } else if (arg1 == 5) {
            this.field2865 = arg0.method2671();
            this.field2871 = new int[this.field2865];
            this.field2867 = new String[this.field2865];
            for (int var3 = 0; var3 < this.field2865; var3++) {
                this.field2871[var3] = arg0.method2815();
                this.field2867[var3] = arg0.method2677();
            }
        } else if (arg1 == 6) {
            this.field2865 = arg0.method2671();
            this.field2871 = new int[this.field2865];
            this.field2872 = new int[this.field2865];
            for (int var4 = 0; var4 < this.field2865; var4++) {
                this.field2871[var4] = arg0.method2815();
                this.field2872[var4] = arg0.method2815();
            }
        }
    }
}
