package deob;

@ObfuscatedName("jn")
public class class252 extends class504 {

    @ObfuscatedName("jn.aa")
    public int field2697;

    @ObfuscatedName("jn.at")
    public int field2701;

    @ObfuscatedName("jn.ab")
    public int[] field2702;

    @ObfuscatedName("jn.ac")
    public int[][] field2703;

    @ObfuscatedName("jn.ao")
    public class250 field2704;

    public class252(int arg0, byte[] arg1) {
        this.field2697 = arg0;
        class546 var3 = new class546(arg1);
        this.field2701 = var3.method8796();
        this.field2702 = new int[this.field2701];
        this.field2703 = new int[this.field2701][];
        for (int var4 = 0; var4 < this.field2701; var4++) {
            this.field2702[var4] = var3.method8796();
        }
        for (int var5 = 0; var5 < this.field2701; var5++) {
            this.field2703[var5] = new int[var3.method8796()];
        }
        for (int var6 = 0; var6 < this.field2701; var6++) {
            for (int var7 = 0; var7 < this.field2703[var6].length; var7++) {
                this.field2703[var6][var7] = var3.method8796();
            }
        }
        if (var3.field5344 < var3.field5346.length) {
            int var8 = var3.method8798();
            if (var8 > 0) {
                this.field2704 = new class250(var3, var8);
            }
        }
    }

    @ObfuscatedName("jn.ak(I)I")
    public int method4496() {
        return this.field2701;
    }

    @ObfuscatedName("jn.al(I)Lje;")
    public class250 method4494() {
        return this.field2704;
    }
}
