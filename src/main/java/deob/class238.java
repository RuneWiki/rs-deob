package deob;

@ObfuscatedName("jf")
public class class238 {

    @ObfuscatedName("jf.aq")
    public final int[][] field2505;

    @ObfuscatedName("jf.ad")
    public final int[][] field2506;

    @ObfuscatedName("jf.ag")
    public int field2500;

    @ObfuscatedName("jf.ak")
    public int field2502;

    @ObfuscatedName("jf.ap")
    public final int[] field2503;

    @ObfuscatedName("jf.an")
    public final int[] field2504;

    @ObfuscatedName("jf.aj")
    public final int field2499;

    public class238(int arg0, int arg1) {
        this.field2505 = new int[arg0][arg1];
        this.field2506 = new int[arg0][arg1];
        int var3 = arg0 * arg1;
        int var4 = class329.method6778(var3 / 4);
        this.field2503 = new int[var4];
        this.field2504 = new int[var4];
        this.field2499 = var4 - 1;
    }

    @ObfuscatedName("jf.aq(B)V")
    public void method4100() {
        for (int var1 = 0; var1 < this.field2505.length; var1++) {
            for (int var2 = 0; var2 < this.field2505[var1].length; var2++) {
                this.field2505[var1][var2] = 0;
                this.field2506[var1][var2] = 99999999;
            }
        }
    }

    @ObfuscatedName("jf.ad(III)V")
    public void method4125(int arg0, int arg1) {
        this.field2500 = arg0;
        this.field2502 = arg1;
    }

    @ObfuscatedName("jf.ag(I)I")
    public int method4136() {
        return this.field2500;
    }

    @ObfuscatedName("jf.ak(I)I")
    public int method4103() {
        return this.field2502;
    }

    @ObfuscatedName("jf.ap(I)I")
    public int method4104() {
        return this.field2505.length;
    }

    @ObfuscatedName("jf.an(I)I")
    public int method4105() {
        return this.field2505[0].length;
    }

    @ObfuscatedName("jf.aj(I)[[I")
    public int[][] method4106() {
        return this.field2505;
    }

    @ObfuscatedName("jf.av(I)[[I")
    public int[][] method4107() {
        return this.field2506;
    }

    @ObfuscatedName("jf.ab(B)[I")
    public int[] method4108() {
        return this.field2503;
    }

    @ObfuscatedName("jf.ai(B)[I")
    public int[] method4109() {
        return this.field2504;
    }

    @ObfuscatedName("jf.ae(I)I")
    public int method4110() {
        return this.field2499;
    }
}
