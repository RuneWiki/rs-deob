package deob;

@ObfuscatedName("tt")
public class class495 {

    @ObfuscatedName("tt.ap")
    public int field5110 = -1;

    @ObfuscatedName("tt.aw")
    public int field5101 = -1;

    @ObfuscatedName("tt.ak")
    public int field5102 = -1;

    @ObfuscatedName("tt.aj")
    public int field5103 = -1;

    @ObfuscatedName("tt.ai")
    public int field5104 = -1;

    @ObfuscatedName("tt.ay")
    public int field5105 = -1;

    @ObfuscatedName("tt.as")
    public int field5106 = -1;

    @ObfuscatedName("tt.ae")
    public int field5107 = -1;

    @ObfuscatedName("tt.am")
    public int field5115 = -1;

    @ObfuscatedName("tt.at")
    public int field5109 = -1;

    @ObfuscatedName("tt.au")
    public int field5108 = -1;

    @ObfuscatedName("tt.an")
    public final int field5100 = 1;

    @ObfuscatedName("tt.ao")
    public final int field5116 = 2;

    @ObfuscatedName("tt.af")
    public final int field5113 = 1;

    @ObfuscatedName("tt.ar")
    public final int field5114 = 1;

    @ObfuscatedName("tt.ab")
    public final int field5111 = 1;

    @ObfuscatedName("tt.az")
    public final int[][] field5112 = new int[3][5];

    @ObfuscatedName("tt.ap(Lpe;B)V")
    public void method8562(class392 arg0) {
        byte[] var2 = arg0.method7052(class494.field5097.field5098);
        class558 var3 = new class558(var2);
        while (true) {
            while (true) {
                int var4 = var3.method9258();
                if (var4 == 0) {
                    return;
                }
                switch(var4) {
                    case 1:
                        var3.method9380();
                        break;
                    case 2:
                        this.field5110 = var3.method9278();
                        this.field5101 = var3.method9278();
                        this.field5102 = var3.method9278();
                        this.field5103 = var3.method9278();
                        this.field5104 = var3.method9278();
                        this.field5105 = var3.method9278();
                        this.field5106 = var3.method9278();
                        this.field5107 = var3.method9278();
                        this.field5115 = var3.method9278();
                        this.field5109 = var3.method9278();
                        this.field5108 = var3.method9278();
                        break;
                    case 3:
                        for (int var5 = 0; var5 < this.field5112.length; var5++) {
                            for (int var6 = 0; var6 < this.field5112[var5].length; var6++) {
                                this.field5112[var5][var6] = var3.method9380();
                            }
                        }
                }
            }
        }
    }
}
