package deob;

@ObfuscatedName("ak")
public class class39 extends class174 {

    @ObfuscatedName("ak.e")
    public static class170 field944 = new class170(64);

    @ObfuscatedName("ak.g")
    public char field945;

    @ObfuscatedName("ak.o")
    public char field946;

    @ObfuscatedName("ak.a")
    public String field947 = "null";

    @ObfuscatedName("ak.h")
    public int field943;

    @ObfuscatedName("ak.j")
    public int field949 = 0;

    @ObfuscatedName("ak.f")
    public int[] field950;

    @ObfuscatedName("ak.q")
    public int[] field951;

    @ObfuscatedName("ak.l")
    public String[] field955;

    @ObfuscatedName("ak.b(Ldv;B)V")
    public void method806(class126 arg0) {
        while (true) {
            int var2 = arg0.method2436();
            if (var2 == 0) {
                return;
            }
            this.method807(arg0, var2);
        }
    }

    @ObfuscatedName("ak.e(Ldv;II)V")
    public void method807(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field945 = (char) arg0.method2436();
        } else if (arg1 == 2) {
            this.field946 = (char) arg0.method2436();
        } else if (arg1 == 3) {
            this.field947 = arg0.method2444();
        } else if (arg1 == 4) {
            this.field943 = arg0.method2439();
        } else if (arg1 == 5) {
            this.field949 = arg0.method2572();
            this.field950 = new int[this.field949];
            this.field955 = new String[this.field949];
            for (int var3 = 0; var3 < this.field949; var3++) {
                this.field950[var3] = arg0.method2439();
                this.field955[var3] = arg0.method2444();
            }
        } else if (arg1 == 6) {
            this.field949 = arg0.method2572();
            this.field950 = new int[this.field949];
            this.field951 = new int[this.field949];
            for (int var4 = 0; var4 < this.field949; var4++) {
                this.field950[var4] = arg0.method2439();
                this.field951[var4] = arg0.method2439();
            }
        }
    }
}
