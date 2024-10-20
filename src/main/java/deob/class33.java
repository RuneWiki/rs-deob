package deob;

@ObfuscatedName("av")
public abstract class class33 extends class78 {

    @ObfuscatedName("av.g")
    public int field772;

    @ObfuscatedName("av.s")
    public int field732;

    @ObfuscatedName("av.y")
    public int field733;

    @ObfuscatedName("av.p")
    public boolean field786 = false;

    @ObfuscatedName("av.b")
    public int field735 = 1;

    @ObfuscatedName("av.l")
    public int field736 = -1;

    @ObfuscatedName("av.al")
    public int field788 = -1;

    @ObfuscatedName("av.aa")
    public int field738 = -1;

    @ObfuscatedName("av.ar")
    public int field768 = -1;

    @ObfuscatedName("av.ak")
    public int field740 = -1;

    @ObfuscatedName("av.ay")
    public int field741 = -1;

    @ObfuscatedName("av.aw")
    public int field742 = -1;

    @ObfuscatedName("av.av")
    public int field743 = -1;

    @ObfuscatedName("av.at")
    public String field744 = null;

    @ObfuscatedName("av.af")
    public boolean field745;

    @ObfuscatedName("av.ae")
    public boolean field746 = false;

    @ObfuscatedName("av.ai")
    public int field760 = 100;

    @ObfuscatedName("av.as")
    public int field748 = 0;

    @ObfuscatedName("av.aj")
    public int field761 = 0;

    @ObfuscatedName("av.az")
    public int[] field750 = new int[4];

    @ObfuscatedName("av.ao")
    public int[] field751 = new int[4];

    @ObfuscatedName("av.ag")
    public int[] field767 = new int[4];

    @ObfuscatedName("av.aq")
    public int field749 = -1000;

    @ObfuscatedName("av.an")
    public int field754;

    @ObfuscatedName("av.ax")
    public int field755;

    @ObfuscatedName("av.ap")
    public int field784 = -1;

    @ObfuscatedName("av.ac")
    public int field757 = 0;

    @ObfuscatedName("av.ab")
    public int field753 = 0;

    @ObfuscatedName("av.am")
    public int field759 = -1;

    @ObfuscatedName("av.ad")
    public int field752 = 0;

    @ObfuscatedName("av.ah")
    public int field789 = 0;

    @ObfuscatedName("av.bf")
    public int field762 = -1;

    @ObfuscatedName("av.bx")
    public int field763 = 0;

    @ObfuscatedName("av.bb")
    public int field764 = 0;

    @ObfuscatedName("av.bv")
    public int field747 = 0;

    @ObfuscatedName("av.bi")
    public int field766 = 0;

    @ObfuscatedName("av.bd")
    public int field765 = -1;

    @ObfuscatedName("av.bh")
    public int field756 = 0;

    @ObfuscatedName("av.bn")
    public int field769 = 0;

    @ObfuscatedName("av.bo")
    public int field770;

    @ObfuscatedName("av.br")
    public int field771;

    @ObfuscatedName("av.bg")
    public int field776;

    @ObfuscatedName("av.bs")
    public int field773;

    @ObfuscatedName("av.be")
    public int field774;

    @ObfuscatedName("av.bt")
    public int field775;

    @ObfuscatedName("av.bu")
    public int field790;

    @ObfuscatedName("av.bl")
    public int field737;

    @ObfuscatedName("av.ba")
    public int field778;

    @ObfuscatedName("av.bw")
    public int field779 = 0;

    @ObfuscatedName("av.bj")
    public int field739 = 200;

    @ObfuscatedName("av.bq")
    public int field781;

    @ObfuscatedName("av.bk")
    public int field782 = 0;

    @ObfuscatedName("av.by")
    public int field783 = 32;

    @ObfuscatedName("av.bc")
    public int field777 = 0;

    @ObfuscatedName("av.bp")
    public int[] field785 = new int[10];

    @ObfuscatedName("av.bz")
    public int[] field780 = new int[10];

    @ObfuscatedName("av.bm")
    public boolean[] field787 = new boolean[10];

    @ObfuscatedName("av.cr")
    public int field734 = 0;

    @ObfuscatedName("av.cg")
    public int field731 = 0;

    @ObfuscatedName("av.z(IIZI)V")
    public final void method614(int arg0, int arg1, boolean arg2) {
        if (this.field762 != -1 && class38.method658(this.field762).field901 == 1) {
            this.field762 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field785[0];
            int var5 = arg1 - this.field780[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field777 < 9) {
                    this.field777++;
                }
                for (int var6 = this.field777; var6 > 0; var6--) {
                    this.field785[var6] = this.field785[var6 - 1];
                    this.field780[var6] = this.field780[var6 - 1];
                    this.field787[var6] = this.field787[var6 - 1];
                }
                this.field785[0] = arg0;
                this.field780[0] = arg1;
                this.field787[0] = false;
                return;
            }
        }
        this.field777 = 0;
        this.field731 = 0;
        this.field734 = 0;
        this.field785[0] = arg0;
        this.field780[0] = arg1;
        this.field772 = this.field785[0] * 128 + this.field735 * 64;
        this.field732 = this.field780[0] * 128 + this.field735 * 64;
    }

    @ObfuscatedName("av.j(IZI)V")
    public final void method602(int arg0, boolean arg1) {
        int var3 = this.field785[0];
        int var4 = this.field780[0];
        if (arg0 == 0) {
            var3--;
            var4++;
        }
        if (arg0 == 1) {
            var4++;
        }
        if (arg0 == 2) {
            var3++;
            var4++;
        }
        if (arg0 == 3) {
            var3--;
        }
        if (arg0 == 4) {
            var3++;
        }
        if (arg0 == 5) {
            var3--;
            var4--;
        }
        if (arg0 == 6) {
            var4--;
        }
        if (arg0 == 7) {
            var3++;
            var4--;
        }
        if (this.field762 != -1 && class38.method658(this.field762).field901 == 1) {
            this.field762 = -1;
        }
        if (this.field777 < 9) {
            this.field777++;
        }
        for (int var5 = this.field777; var5 > 0; var5--) {
            this.field785[var5] = this.field785[var5 - 1];
            this.field780[var5] = this.field780[var5 - 1];
            this.field787[var5] = this.field787[var5 - 1];
        }
        this.field785[0] = var3;
        this.field780[0] = var4;
        this.field787[0] = arg1;
    }

    @ObfuscatedName("av.r(I)V")
    public final void method612() {
        this.field777 = 0;
        this.field731 = 0;
    }

    @ObfuscatedName("av.k(S)Z")
    public boolean method14() {
        return false;
    }

    @ObfuscatedName("av.c(IIIB)V")
    public final void method605(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field767[var4] <= arg2) {
                this.field750[var4] = arg0;
                this.field751[var4] = arg1;
                this.field767[var4] = arg2 + 70;
                return;
            }
        }
    }
}
