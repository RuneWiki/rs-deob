package deob;

@ObfuscatedName("hq")
public class class185 extends class506 {

    @ObfuscatedName("hq.ao")
    public int field1975;

    @ObfuscatedName("hq.am")
    public int field1985;

    @ObfuscatedName("hq.ac")
    public int[] field1979;

    @ObfuscatedName("hq.ae")
    public int[][] field1980;

    @ObfuscatedName("hq.ad")
    public class183 field1973;

    public class185(int arg0, byte[] arg1) {
        this.field1975 = arg0;
        class549 var3 = new class549(arg1);
        this.field1985 = var3.method9025();
        this.field1979 = new int[this.field1985];
        this.field1980 = new int[this.field1985][];
        for (int var4 = 0; var4 < this.field1985; var4++) {
            this.field1979[var4] = var3.method9025();
        }
        for (int var5 = 0; var5 < this.field1985; var5++) {
            this.field1980[var5] = new int[var3.method9025()];
        }
        for (int var6 = 0; var6 < this.field1985; var6++) {
            for (int var7 = 0; var7 < this.field1980[var6].length; var7++) {
                this.field1980[var6][var7] = var3.method9025();
            }
        }
        if (var3.field5378 < var3.field5381.length) {
            int var8 = var3.method8968();
            if (var8 > 0) {
                this.field1973 = new class183(var3, var8);
            }
        }
    }

    @ObfuscatedName("hq.ab(I)I")
    public int method3588() {
        return this.field1985;
    }

    @ObfuscatedName("hq.ay(I)Lhh;")
    public class183 method3589() {
        return this.field1973;
    }
}
