package deob;

@ObfuscatedName("im")
public class class226 {

    @ObfuscatedName("im.aw")
    public static int[] field2471 = new int[500];

    @ObfuscatedName("im.ay")
    public static int[] field2478 = new int[500];

    @ObfuscatedName("im.ar")
    public static int[] field2472 = new int[500];

    @ObfuscatedName("im.am")
    public static int[] field2473 = new int[500];

    @ObfuscatedName("im.as")
    public class231 field2474 = null;

    @ObfuscatedName("im.aj")
    public int field2475 = -1;

    @ObfuscatedName("im.ag")
    public int[] field2470;

    @ObfuscatedName("im.az")
    public int[] field2477;

    @ObfuscatedName("im.av")
    public int[] field2476;

    @ObfuscatedName("im.ap")
    public int[] field2479;

    @ObfuscatedName("im.aq")
    public boolean field2480 = false;

    public class226(byte[] arg0, class231 arg1) {
        this.field2474 = arg1;
        class514 var3 = new class514(arg0);
        class514 var4 = new class514(arg0);
        var3.field5072 = 2;
        int var5 = var3.method8244();
        int var6 = -1;
        int var7 = 0;
        var4.field5072 = var3.field5072 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method8244();
            if (var9 > 0) {
                if (this.field2474.field2535[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2474.field2535[var10] == 0) {
                            field2471[var7] = var10;
                            field2478[var7] = 0;
                            field2472[var7] = 0;
                            field2473[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2471[var7] = var8;
                short var11 = 0;
                if (this.field2474.field2535[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2478[var7] = var11;
                } else {
                    field2478[var7] = var4.method8259();
                }
                if ((var9 & 0x2) == 0) {
                    field2472[var7] = var11;
                } else {
                    field2472[var7] = var4.method8259();
                }
                if ((var9 & 0x4) == 0) {
                    field2473[var7] = var11;
                } else {
                    field2473[var7] = var4.method8259();
                }
                var6 = var8;
                var7++;
                if (this.field2474.field2535[var8] == 5) {
                    this.field2480 = true;
                }
            }
        }
        if (var4.field5072 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2475 = var7;
        this.field2470 = new int[var7];
        this.field2477 = new int[var7];
        this.field2476 = new int[var7];
        this.field2479 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2470[var12] = field2471[var12];
            this.field2477[var12] = field2478[var12];
            this.field2476[var12] = field2472[var12];
            this.field2479[var12] = field2473[var12];
        }
    }
}
