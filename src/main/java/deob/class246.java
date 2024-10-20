package deob;

@ObfuscatedName("jy")
public class class246 extends class493 {

    @ObfuscatedName("jy.ao")
    public int field2635;

    @ObfuscatedName("jy.ab")
    public int field2633;

    @ObfuscatedName("jy.aw")
    public int[] field2630;

    @ObfuscatedName("jy.ad")
    public int[][] field2636;

    @ObfuscatedName("jy.al")
    public class244 field2637;

    public class246(int arg0, byte[] arg1) {
        this.field2635 = arg0;
        class535 var3 = new class535(arg1);
        this.field2633 = var3.method8462();
        this.field2630 = new int[this.field2633];
        this.field2636 = new int[this.field2633][];
        for (int var4 = 0; var4 < this.field2633; var4++) {
            this.field2630[var4] = var3.method8462();
        }
        for (int var5 = 0; var5 < this.field2633; var5++) {
            this.field2636[var5] = new int[var3.method8462()];
        }
        for (int var6 = 0; var6 < this.field2633; var6++) {
            for (int var7 = 0; var7 < this.field2636[var6].length; var7++) {
                this.field2636[var6][var7] = var3.method8462();
            }
        }
        if (var3.field5233 < var3.field5231.length) {
            int var8 = var3.method8670();
            if (var8 > 0) {
                this.field2637 = new class244(var3, var8);
            }
        }
    }

    @ObfuscatedName("jy.az(I)I")
    public int method4333() {
        return this.field2633;
    }

    @ObfuscatedName("jy.ah(I)Ljr;")
    public class244 method4335() {
        return this.field2637;
    }
}
