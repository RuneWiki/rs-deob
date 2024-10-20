package deob;

@ObfuscatedName("kg")
public class class268 {

    @ObfuscatedName("kg.am")
    public static int[] field2777 = new int[500];

    @ObfuscatedName("kg.ap")
    public static int[] field2771 = new int[500];

    @ObfuscatedName("kg.af")
    public static int[] field2776 = new int[500];

    @ObfuscatedName("kg.aj")
    public static int[] field2769 = new int[500];

    @ObfuscatedName("kg.aq")
    public class273 field2772 = null;

    @ObfuscatedName("kg.ar")
    public int field2773 = -1;

    @ObfuscatedName("kg.ag")
    public int[] field2774;

    @ObfuscatedName("kg.ao")
    public int[] field2775;

    @ObfuscatedName("kg.ae")
    public int[] field2768;

    @ObfuscatedName("kg.aa")
    public int[] field2770;

    @ObfuscatedName("kg.au")
    public boolean field2778 = false;

    public class268(byte[] arg0, class273 arg1) {
        this.field2772 = arg1;
        class531 var3 = new class531(arg0);
        class531 var4 = new class531(arg0);
        var3.field5181 = 2;
        int var5 = var3.method8561();
        int var6 = -1;
        int var7 = 0;
        var4.field5181 = var3.field5181 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method8561();
            if (var9 > 0) {
                if (this.field2772.field2829[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2772.field2829[var10] == 0) {
                            field2777[var7] = var10;
                            field2771[var7] = 0;
                            field2776[var7] = 0;
                            field2769[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2777[var7] = var8;
                short var11 = 0;
                if (this.field2772.field2829[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2771[var7] = var11;
                } else {
                    field2771[var7] = var4.method8631();
                }
                if ((var9 & 0x2) == 0) {
                    field2776[var7] = var11;
                } else {
                    field2776[var7] = var4.method8631();
                }
                if ((var9 & 0x4) == 0) {
                    field2769[var7] = var11;
                } else {
                    field2769[var7] = var4.method8631();
                }
                var6 = var8;
                var7++;
                if (this.field2772.field2829[var8] == 5) {
                    this.field2778 = true;
                }
            }
        }
        if (var4.field5181 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2773 = var7;
        this.field2774 = new int[var7];
        this.field2775 = new int[var7];
        this.field2768 = new int[var7];
        this.field2770 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2774[var12] = field2777[var12];
            this.field2775[var12] = field2771[var12];
            this.field2768[var12] = field2776[var12];
            this.field2770[var12] = field2769[var12];
        }
    }
}
