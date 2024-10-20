package deob;

@ObfuscatedName("sn")
public class class488 {

    @ObfuscatedName("sn.ac")
    public int field5058 = -1;

    @ObfuscatedName("sn.ae")
    public int field5056 = -1;

    @ObfuscatedName("sn.ag")
    public int field5057 = -1;

    @ObfuscatedName("sn.am")
    public int field5069 = -1;

    @ObfuscatedName("sn.ax")
    public int field5070 = -1;

    @ObfuscatedName("sn.aq")
    public int field5060 = -1;

    @ObfuscatedName("sn.af")
    public int field5061 = -1;

    @ObfuscatedName("sn.at")
    public int field5066 = -1;

    @ObfuscatedName("sn.au")
    public int field5063 = -1;

    @ObfuscatedName("sn.ar")
    public int field5064 = -1;

    @ObfuscatedName("sn.al")
    public int field5065 = -1;

    @ObfuscatedName("sn.ad")
    public final int field5059 = 1;

    @ObfuscatedName("sn.ah")
    public final int field5067 = 2;

    @ObfuscatedName("sn.ap")
    public final int field5062 = 1;

    @ObfuscatedName("sn.ab")
    public final int field5068 = 1;

    @ObfuscatedName("sn.az")
    public final int field5055 = 1;

    @ObfuscatedName("sn.aa")
    public final int[][] field5071 = new int[3][5];

    @ObfuscatedName("sn.ac(Lpo;I)V")
    public void method8269(class391 arg0) {
        byte[] var2 = arg0.method6788(class487.field5051.field5053);
        class551 var3 = new class551(var2);
        while (true) {
            while (true) {
                int var4 = var3.method8955();
                if (var4 == 0) {
                    return;
                }
                switch(var4) {
                    case 1:
                        var3.method8978();
                        break;
                    case 2:
                        this.field5058 = var3.method9205();
                        this.field5056 = var3.method9205();
                        this.field5057 = var3.method9205();
                        this.field5069 = var3.method9205();
                        this.field5070 = var3.method9205();
                        this.field5060 = var3.method9205();
                        this.field5061 = var3.method9205();
                        this.field5066 = var3.method9205();
                        this.field5063 = var3.method9205();
                        this.field5064 = var3.method9205();
                        this.field5065 = var3.method9205();
                        break;
                    case 3:
                        for (int var5 = 0; var5 < this.field5071.length; var5++) {
                            for (int var6 = 0; var6 < this.field5071[var5].length; var6++) {
                                this.field5071[var5][var6] = var3.method8978();
                            }
                        }
                }
            }
        }
    }
}
