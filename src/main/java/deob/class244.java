package deob;

@ObfuscatedName("ju")
public class class244 extends class488 {

    @ObfuscatedName("ju.ah")
    public int field2578;

    @ObfuscatedName("ju.ar")
    public int field2583;

    @ObfuscatedName("ju.ab")
    public int[] field2580;

    @ObfuscatedName("ju.am")
    public int[][] field2576;

    @ObfuscatedName("ju.av")
    public class242 field2582;

    public class244(int arg0, byte[] arg1) {
        this.field2578 = arg0;
        class530 var3 = new class530(arg1);
        this.field2583 = var3.method8365();
        this.field2580 = new int[this.field2583];
        this.field2576 = new int[this.field2583][];
        for (int var4 = 0; var4 < this.field2583; var4++) {
            this.field2580[var4] = var3.method8365();
        }
        for (int var5 = 0; var5 < this.field2583; var5++) {
            this.field2576[var5] = new int[var3.method8365()];
        }
        for (int var6 = 0; var6 < this.field2583; var6++) {
            for (int var7 = 0; var7 < this.field2576[var6].length; var7++) {
                this.field2576[var6][var7] = var3.method8365();
            }
        }
        if (var3.field5140 < var3.field5139.length) {
            int var8 = var3.method8598();
            if (var8 > 0) {
                this.field2582 = new class242(var3, var8);
            }
        }
    }

    @ObfuscatedName("ju.ac(I)I")
    public int method4289() {
        return this.field2583;
    }

    @ObfuscatedName("ju.al(B)Ljr;")
    public class242 method4292() {
        return this.field2582;
    }
}
