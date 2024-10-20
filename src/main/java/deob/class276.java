package deob;

@ObfuscatedName("kt")
public class class276 {

    @ObfuscatedName("kt.ac")
    public final int[][] field3028;

    @ObfuscatedName("kt.ae")
    public final int[][] field3029;

    @ObfuscatedName("kt.ag")
    public int field3030;

    @ObfuscatedName("kt.am")
    public int field3031;

    @ObfuscatedName("kt.ax")
    public final int[] field3032;

    @ObfuscatedName("kt.aq")
    public final int[] field3033;

    @ObfuscatedName("kt.af")
    public final int field3034;

    public class276(int arg0, int arg1) {
        this.field3028 = new int[arg0][arg1];
        this.field3029 = new int[arg0][arg1];
        int var3 = arg0 * arg1;
        int var4 = class333.method44(var3 / 4);
        this.field3032 = new int[var4];
        this.field3033 = new int[var4];
        this.field3034 = var4 - 1;
    }

    @ObfuscatedName("kt.ac(I)V")
    public void method5178() {
        for (int var1 = 0; var1 < this.field3028.length; var1++) {
            for (int var2 = 0; var2 < this.field3028[var1].length; var2++) {
                this.field3028[var1][var2] = 0;
                this.field3029[var1][var2] = 99999999;
            }
        }
    }

    @ObfuscatedName("kt.ae(III)V")
    public void method5159(int arg0, int arg1) {
        this.field3030 = arg0;
        this.field3031 = arg1;
    }

    @ObfuscatedName("kt.ag(B)I")
    public int method5160() {
        return this.field3030;
    }

    @ObfuscatedName("kt.am(I)I")
    public int method5161() {
        return this.field3031;
    }

    @ObfuscatedName("kt.ax(I)I")
    public int method5164() {
        return this.field3028.length;
    }

    @ObfuscatedName("kt.aq(I)I")
    public int method5163() {
        return this.field3028[0].length;
    }

    @ObfuscatedName("kt.af(I)[[I")
    public int[][] method5180() {
        return this.field3028;
    }

    @ObfuscatedName("kt.at(I)[[I")
    public int[][] method5162() {
        return this.field3029;
    }

    @ObfuscatedName("kt.au(B)[I")
    public int[] method5186() {
        return this.field3032;
    }

    @ObfuscatedName("kt.ar(I)[I")
    public int[] method5166() {
        return this.field3033;
    }

    @ObfuscatedName("kt.al(I)I")
    public int method5157() {
        return this.field3034;
    }
}
