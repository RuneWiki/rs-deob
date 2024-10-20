package deob;

@ObfuscatedName("jd")
public class class246 {

    @ObfuscatedName("jd.ak")
    public static int[] field2634 = new int[500];

    @ObfuscatedName("jd.al")
    public static int[] field2630 = new int[500];

    @ObfuscatedName("jd.aj")
    public static int[] field2629 = new int[500];

    @ObfuscatedName("jd.az")
    public static int[] field2633 = new int[500];

    @ObfuscatedName("jd.af")
    public class252 field2631 = null;

    @ObfuscatedName("jd.aa")
    public int field2632 = -1;

    @ObfuscatedName("jd.at")
    public int[] field2627;

    @ObfuscatedName("jd.ab")
    public int[] field2628;

    @ObfuscatedName("jd.ac")
    public int[] field2635;

    @ObfuscatedName("jd.ao")
    public int[] field2636;

    @ObfuscatedName("jd.ah")
    public boolean field2637 = false;

    public class246(byte[] arg0, class252 arg1) {
        this.field2631 = arg1;
        class546 var3 = new class546(arg0);
        class546 var4 = new class546(arg0);
        var3.field5344 = 2;
        int var5 = var3.method8796();
        int var6 = -1;
        int var7 = 0;
        var4.field5344 = var3.field5344 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method8796();
            if (var9 > 0) {
                if (this.field2631.field2702[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2631.field2702[var10] == 0) {
                            field2634[var7] = var10;
                            field2630[var7] = 0;
                            field2629[var7] = 0;
                            field2633[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2634[var7] = var8;
                short var11 = 0;
                if (this.field2631.field2702[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2630[var7] = var11;
                } else {
                    field2630[var7] = var4.method8848();
                }
                if ((var9 & 0x2) == 0) {
                    field2629[var7] = var11;
                } else {
                    field2629[var7] = var4.method8848();
                }
                if ((var9 & 0x4) == 0) {
                    field2633[var7] = var11;
                } else {
                    field2633[var7] = var4.method8848();
                }
                var6 = var8;
                var7++;
                if (this.field2631.field2702[var8] == 5) {
                    this.field2637 = true;
                }
            }
        }
        if (var4.field5344 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2632 = var7;
        this.field2627 = new int[var7];
        this.field2628 = new int[var7];
        this.field2635 = new int[var7];
        this.field2636 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2627[var12] = field2634[var12];
            this.field2628[var12] = field2630[var12];
            this.field2635[var12] = field2629[var12];
            this.field2636[var12] = field2633[var12];
        }
    }
}
