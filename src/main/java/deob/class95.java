package deob;

@ObfuscatedName("ci")
public class class95 extends class184 {

    @ObfuscatedName("ci.j")
    public int field1667;

    @ObfuscatedName("ci.z")
    public int field1669;

    @ObfuscatedName("ci.y")
    public int[] field1664;

    @ObfuscatedName("ci.h")
    public int[][] field1665;

    public class95(int arg0, byte[] arg1) {
        this.field1667 = arg0;
        class107 var3 = new class107(arg1);
        this.field1669 = var3.method2130();
        this.field1664 = new int[this.field1669];
        this.field1665 = new int[this.field1669][];
        for (int var4 = 0; var4 < this.field1669; var4++) {
            this.field1664[var4] = var3.method2130();
        }
        for (int var5 = 0; var5 < this.field1669; var5++) {
            this.field1665[var5] = new int[var3.method2130()];
        }
        for (int var6 = 0; var6 < this.field1669; var6++) {
            for (int var7 = 0; var7 < this.field1665[var6].length; var7++) {
                this.field1665[var6][var7] = var3.method2130();
            }
        }
    }
}
