package deob;

@ObfuscatedName("kr")
public class class265 {

    @ObfuscatedName("kr.at")
    public static int[] field2739 = new int[500];

    @ObfuscatedName("kr.ah")
    public static int[] field2732 = new int[500];

    @ObfuscatedName("kr.ar")
    public static int[] field2737 = new int[500];

    @ObfuscatedName("kr.ao")
    public static int[] field2734 = new int[500];

    @ObfuscatedName("kr.ab")
    public class270 field2735 = null;

    @ObfuscatedName("kr.au")
    public int field2736 = -1;

    @ObfuscatedName("kr.aa")
    public int[] field2740;

    @ObfuscatedName("kr.ac")
    public int[] field2738;

    @ObfuscatedName("kr.al")
    public int[] field2741;

    @ObfuscatedName("kr.az")
    public int[] field2733;

    @ObfuscatedName("kr.ap")
    public boolean field2731 = false;

    public class265(byte[] arg0, class270 arg1) {
        this.field2735 = arg1;
        class527 var3 = new class527(arg0);
        class527 var4 = new class527(arg0);
        var3.field5137 = 2;
        int var5 = var3.method8410();
        int var6 = -1;
        int var7 = 0;
        var4.field5137 = var3.field5137 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method8410();
            if (var9 > 0) {
                if (this.field2735.field2797[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2735.field2797[var10] == 0) {
                            field2739[var7] = var10;
                            field2732[var7] = 0;
                            field2737[var7] = 0;
                            field2734[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2739[var7] = var8;
                short var11 = 0;
                if (this.field2735.field2797[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2732[var7] = var11;
                } else {
                    field2732[var7] = var4.method8675();
                }
                if ((var9 & 0x2) == 0) {
                    field2737[var7] = var11;
                } else {
                    field2737[var7] = var4.method8675();
                }
                if ((var9 & 0x4) == 0) {
                    field2734[var7] = var11;
                } else {
                    field2734[var7] = var4.method8675();
                }
                var6 = var8;
                var7++;
                if (this.field2735.field2797[var8] == 5) {
                    this.field2731 = true;
                }
            }
        }
        if (var4.field5137 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2736 = var7;
        this.field2740 = new int[var7];
        this.field2738 = new int[var7];
        this.field2741 = new int[var7];
        this.field2733 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2740[var12] = field2739[var12];
            this.field2738[var12] = field2732[var12];
            this.field2741[var12] = field2737[var12];
            this.field2733[var12] = field2734[var12];
        }
    }
}
