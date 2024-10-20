package deob;

@ObfuscatedName("in")
public class class222 extends class444 {

    @ObfuscatedName("in.ao")
    public int field2502;

    @ObfuscatedName("in.av")
    public int field2503;

    @ObfuscatedName("in.aq")
    public int[] field2504;

    @ObfuscatedName("in.ap")
    public int[][] field2498;

    @ObfuscatedName("in.ar")
    public class221 field2505;

    public class222(int arg0, byte[] arg1) {
        this.field2502 = arg0;
        class478 var3 = new class478(arg1);
        this.field2503 = var3.method7909();
        this.field2504 = new int[this.field2503];
        this.field2498 = new int[this.field2503][];
        for (int var4 = 0; var4 < this.field2503; var4++) {
            this.field2504[var4] = var3.method7909();
        }
        for (int var5 = 0; var5 < this.field2503; var5++) {
            this.field2498[var5] = new int[var3.method7909()];
        }
        for (int var6 = 0; var6 < this.field2503; var6++) {
            for (int var7 = 0; var7 < this.field2498[var6].length; var7++) {
                this.field2498[var6][var7] = var3.method7909();
            }
        }
        if (var3.field4904 < var3.field4906.length) {
            int var8 = var3.method7905();
            if (var8 > 0) {
                this.field2505 = new class221(var3, var8);
            }
        }
    }

    @ObfuscatedName("in.aj(I)I")
    public int method4027() {
        return this.field2503;
    }

    @ObfuscatedName("in.al(I)Lik;")
    public class221 method4024() {
        return this.field2505;
    }
}
