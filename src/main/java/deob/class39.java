package deob;

@ObfuscatedName("ae")
public class class39 extends class174 {

    @ObfuscatedName("ae.p")
    public static class170 field942 = new class170(64);

    @ObfuscatedName("ae.k")
    public int field952;

    @ObfuscatedName("ae.a")
    public char field944;

    @ObfuscatedName("ae.q")
    public String field953 = "null";

    @ObfuscatedName("ae.j")
    public int field943;

    @ObfuscatedName("ae.v")
    public int field947 = 0;

    @ObfuscatedName("ae.w")
    public int[] field948;

    @ObfuscatedName("ae.l")
    public int[] field949;

    @ObfuscatedName("ae.s")
    public String[] field946;

    @ObfuscatedName("ae.x(Ldg;I)V")
    public void method795(class127 arg0) {
        while (true) {
            int var2 = arg0.method2484();
            if (var2 == 0) {
                return;
            }
            this.method796(arg0, var2);
        }
    }

    @ObfuscatedName("ae.p(Ldg;II)V")
    public void method796(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field952 = arg0.method2484();
        } else if (arg1 == 2) {
            this.field944 = (char) arg0.method2484();
        } else if (arg1 == 3) {
            this.field953 = arg0.method2571();
        } else if (arg1 == 4) {
            this.field943 = arg0.method2415();
        } else if (arg1 == 5) {
            this.field947 = arg0.method2539();
            this.field948 = new int[this.field947];
            this.field946 = new String[this.field947];
            for (int var3 = 0; var3 < this.field947; var3++) {
                this.field948[var3] = arg0.method2415();
                this.field946[var3] = arg0.method2571();
            }
        } else if (arg1 == 6) {
            this.field947 = arg0.method2539();
            this.field948 = new int[this.field947];
            this.field949 = new int[this.field947];
            for (int var4 = 0; var4 < this.field947; var4++) {
                this.field948[var4] = arg0.method2415();
                this.field949[var4] = arg0.method2415();
            }
        }
    }
}
