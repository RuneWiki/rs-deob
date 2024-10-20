package deob;

@ObfuscatedName("eq")
public class class139 extends class193 {

    @ObfuscatedName("eq.d")
    public int field2017;

    @ObfuscatedName("eq.q")
    public int field2018;

    @ObfuscatedName("eq.x")
    public int[] field2016;

    @ObfuscatedName("eq.y")
    public int[][] field2019;

    public class139(int arg0, byte[] arg1) {
        this.field2017 = arg0;
        class174 var3 = new class174(arg1);
        this.field2018 = var3.method2921();
        this.field2016 = new int[this.field2018];
        this.field2019 = new int[this.field2018][];
        for (int var4 = 0; var4 < this.field2018; var4++) {
            this.field2016[var4] = var3.method2921();
        }
        for (int var5 = 0; var5 < this.field2018; var5++) {
            this.field2019[var5] = new int[var3.method2921()];
        }
        for (int var6 = 0; var6 < this.field2018; var6++) {
            for (int var7 = 0; var7 < this.field2019[var6].length; var7++) {
                this.field2019[var6][var7] = var3.method2921();
            }
        }
    }
}
