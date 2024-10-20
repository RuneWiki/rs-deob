package deob;

@ObfuscatedName("ir")
public class class229 extends class461 {

    @ObfuscatedName("ir.ap")
    public int field2536;

    @ObfuscatedName("ir.ab")
    public int field2541;

    @ObfuscatedName("ir.ak")
    public int[] field2537;

    @ObfuscatedName("ir.ae")
    public int[][] field2543;

    @ObfuscatedName("ir.af")
    public class227 field2544;

    public class229(int arg0, byte[] arg1) {
        this.field2536 = arg0;
        class501 var3 = new class501(arg1);
        this.field2541 = var3.method8129();
        this.field2537 = new int[this.field2541];
        this.field2543 = new int[this.field2541][];
        for (int var4 = 0; var4 < this.field2541; var4++) {
            this.field2537[var4] = var3.method8129();
        }
        for (int var5 = 0; var5 < this.field2541; var5++) {
            this.field2543[var5] = new int[var3.method8129()];
        }
        for (int var6 = 0; var6 < this.field2541; var6++) {
            for (int var7 = 0; var7 < this.field2543[var6].length; var7++) {
                this.field2543[var6][var7] = var3.method8129();
            }
        }
        if (var3.field5017 < var3.field5016.length) {
            int var8 = var3.method8195();
            if (var8 > 0) {
                this.field2544 = new class227(var3, var8);
            }
        }
    }

    @ObfuscatedName("ir.at(B)I")
    public int method4149() {
        return this.field2541;
    }

    @ObfuscatedName("ir.an(I)Lid;")
    public class227 method4147() {
        return this.field2544;
    }
}
