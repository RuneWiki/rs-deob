package deob;

@ObfuscatedName("ao")
public class class44 extends class185 {

    @ObfuscatedName("ao.j")
    public static class174 field1001 = new class174(64);

    @ObfuscatedName("ao.z")
    public char field993;

    @ObfuscatedName("ao.b")
    public char field995;

    @ObfuscatedName("ao.k")
    public String field992 = "null";

    @ObfuscatedName("ao.c")
    public int field997;

    @ObfuscatedName("ao.w")
    public int field994 = 0;

    @ObfuscatedName("ao.l")
    public int[] field996;

    @ObfuscatedName("ao.n")
    public int[] field1000;

    @ObfuscatedName("ao.d")
    public String[] field999;

    @ObfuscatedName("ao.g(Ldf;B)V")
    public void method781(class108 arg0) {
        while (true) {
            int var2 = arg0.method2083();
            if (var2 == 0) {
                return;
            }
            this.method782(arg0, var2);
        }
    }

    @ObfuscatedName("ao.j(Ldf;IB)V")
    public void method782(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field993 = (char) arg0.method2083();
        } else if (arg1 == 2) {
            this.field995 = (char) arg0.method2083();
        } else if (arg1 == 3) {
            this.field992 = arg0.method2091();
        } else if (arg1 == 4) {
            this.field997 = arg0.method2117();
        } else if (arg1 == 5) {
            this.field994 = arg0.method2263();
            this.field996 = new int[this.field994];
            this.field999 = new String[this.field994];
            for (int var3 = 0; var3 < this.field994; var3++) {
                this.field996[var3] = arg0.method2117();
                this.field999[var3] = arg0.method2091();
            }
        } else if (arg1 == 6) {
            this.field994 = arg0.method2263();
            this.field996 = new int[this.field994];
            this.field1000 = new int[this.field994];
            for (int var4 = 0; var4 < this.field994; var4++) {
                this.field996[var4] = arg0.method2117();
                this.field1000[var4] = arg0.method2117();
            }
        }
    }
}
