package deob;

@ObfuscatedName("aj")
public class class39 extends class174 {

    @ObfuscatedName("aj.r")
    public static class170 field964 = new class170(64);

    @ObfuscatedName("aj.v")
    public int field965;

    @ObfuscatedName("aj.p")
    public char field972;

    @ObfuscatedName("aj.e")
    public String field966 = "null";

    @ObfuscatedName("aj.d")
    public int field963;

    @ObfuscatedName("aj.y")
    public int field969 = 0;

    @ObfuscatedName("aj.x")
    public int[] field970;

    @ObfuscatedName("aj.t")
    public int[] field971;

    @ObfuscatedName("aj.i")
    public String[] field973;

    @ObfuscatedName("aj.j(Ldn;I)V")
    public void method809(class127 arg0) {
        while (true) {
            int var2 = arg0.method2441();
            if (var2 == 0) {
                return;
            }
            this.method811(arg0, var2);
        }
    }

    @ObfuscatedName("aj.r(Ldn;II)V")
    public void method811(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field965 = arg0.method2441();
        } else if (arg1 == 2) {
            this.field972 = (char) arg0.method2441();
        } else if (arg1 == 3) {
            this.field966 = arg0.method2449();
        } else if (arg1 == 4) {
            this.field963 = arg0.method2446();
        } else if (arg1 == 5) {
            this.field969 = arg0.method2609();
            this.field970 = new int[this.field969];
            this.field973 = new String[this.field969];
            for (int var3 = 0; var3 < this.field969; var3++) {
                this.field970[var3] = arg0.method2446();
                this.field973[var3] = arg0.method2449();
            }
        } else if (arg1 == 6) {
            this.field969 = arg0.method2609();
            this.field970 = new int[this.field969];
            this.field971 = new int[this.field969];
            for (int var4 = 0; var4 < this.field969; var4++) {
                this.field970[var4] = arg0.method2446();
                this.field971[var4] = arg0.method2446();
            }
        }
    }
}
