package deob;

@ObfuscatedName("ku")
public class class275 extends class492 {

    @ObfuscatedName("ku.as")
    public int field2838;

    @ObfuscatedName("ku.aa")
    public int field2842;

    @ObfuscatedName("ku.az")
    public int[] field2843;

    @ObfuscatedName("ku.ao")
    public int[][] field2844;

    @ObfuscatedName("ku.au")
    public class273 field2845;

    public class275(int arg0, byte[] arg1) {
        this.field2838 = arg0;
        class534 var3 = new class534(arg1);
        this.field2842 = var3.method8591();
        this.field2843 = new int[this.field2842];
        this.field2844 = new int[this.field2842][];
        for (int var4 = 0; var4 < this.field2842; var4++) {
            this.field2843[var4] = var3.method8591();
        }
        for (int var5 = 0; var5 < this.field2842; var5++) {
            this.field2844[var5] = new int[var3.method8591()];
        }
        for (int var6 = 0; var6 < this.field2842; var6++) {
            for (int var7 = 0; var7 < this.field2844[var6].length; var7++) {
                this.field2844[var6][var7] = var3.method8591();
            }
        }
        if (var3.field5200 < var3.field5199.length) {
            int var8 = var3.method8593();
            if (var8 > 0) {
                this.field2845 = new class273(var3, var8);
            }
        }
    }

    @ObfuscatedName("ku.aq(I)I")
    public int method4880() {
        return this.field2842;
    }

    @ObfuscatedName("ku.aw(I)Lkn;")
    public class273 method4883() {
        return this.field2845;
    }
}
