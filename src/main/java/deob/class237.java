package deob;

@ObfuscatedName("ji")
public class class237 {

    @ObfuscatedName("ji.ak")
    public final int[][] field2515;

    @ObfuscatedName("ji.al")
    public final int[][] field2514;

    @ObfuscatedName("ji.aj")
    public int field2522;

    @ObfuscatedName("ji.az")
    public int field2517;

    @ObfuscatedName("ji.af")
    public final int[] field2518;

    @ObfuscatedName("ji.aa")
    public final int[] field2519;

    @ObfuscatedName("ji.at")
    public final int field2520;

    public class237(int arg0, int arg1) {
        this.field2515 = new int[arg0][arg1];
        this.field2514 = new int[arg0][arg1];
        int var3 = arg0 * arg1;
        int var4 = Statics.method4498(var3 / 4);
        this.field2518 = new int[var4];
        this.field2519 = new int[var4];
        this.field2520 = var4 - 1;
    }

    @ObfuscatedName("ji.ak(I)V")
    public void method4159() {
        for (int var1 = 0; var1 < this.field2515.length; var1++) {
            for (int var2 = 0; var2 < this.field2515[var1].length; var2++) {
                this.field2515[var1][var2] = 0;
                this.field2514[var1][var2] = 99999999;
            }
        }
    }

    @ObfuscatedName("ji.al(III)V")
    public void method4160(int arg0, int arg1) {
        this.field2522 = arg0;
        this.field2517 = arg1;
    }

    @ObfuscatedName("ji.aj(B)I")
    public int method4161() {
        return this.field2522;
    }

    @ObfuscatedName("ji.az(I)I")
    public int method4183() {
        return this.field2517;
    }

    @ObfuscatedName("ji.af(I)I")
    public int method4163() {
        return this.field2515.length;
    }

    @ObfuscatedName("ji.aa(I)I")
    public int method4172() {
        return this.field2515[0].length;
    }

    @ObfuscatedName("ji.at(I)[[I")
    public int[][] method4182() {
        return this.field2515;
    }

    @ObfuscatedName("ji.ab(I)[[I")
    public int[][] method4166() {
        return this.field2514;
    }

    @ObfuscatedName("ji.ac(I)[I")
    public int[] method4174() {
        return this.field2518;
    }

    @ObfuscatedName("ji.ao(I)[I")
    public int[] method4168() {
        return this.field2519;
    }

    @ObfuscatedName("ji.ah(I)I")
    public int method4169() {
        return this.field2520;
    }
}
