package deob;

@ObfuscatedName("as")
public abstract class class33 extends class78 {

    @ObfuscatedName("as.d")
    public int field743;

    @ObfuscatedName("as.j")
    public int field717;

    @ObfuscatedName("as.s")
    public int field718;

    @ObfuscatedName("as.f")
    public boolean field770 = false;

    @ObfuscatedName("as.e")
    public int field720 = 1;

    @ObfuscatedName("as.q")
    public int field754 = -1;

    @ObfuscatedName("as.al")
    public int field716 = -1;

    @ObfuscatedName("as.ao")
    public int field752 = -1;

    @ObfuscatedName("as.ap")
    public int field725 = -1;

    @ObfuscatedName("as.aa")
    public int field748 = -1;

    @ObfuscatedName("as.ak")
    public int field726 = -1;

    @ObfuscatedName("as.ah")
    public int field727 = -1;

    @ObfuscatedName("as.as")
    public int field728 = -1;

    @ObfuscatedName("as.aw")
    public String field729 = null;

    @ObfuscatedName("as.aj")
    public boolean field735;

    @ObfuscatedName("as.af")
    public int field731 = 100;

    @ObfuscatedName("as.am")
    public int field774 = 0;

    @ObfuscatedName("as.ab")
    public int field733 = 0;

    @ObfuscatedName("as.an")
    public int[] field734 = new int[4];

    @ObfuscatedName("as.ac")
    public int[] field723 = new int[4];

    @ObfuscatedName("as.au")
    public int[] field736 = new int[4];

    @ObfuscatedName("as.av")
    public int field730 = -1000;

    @ObfuscatedName("as.at")
    public int field738;

    @ObfuscatedName("as.ax")
    public int field739;

    @ObfuscatedName("as.ae")
    public int field746 = -1;

    @ObfuscatedName("as.az")
    public int field741 = 0;

    @ObfuscatedName("as.ar")
    public int field742 = 0;

    @ObfuscatedName("as.aq")
    public int field762 = -1;

    @ObfuscatedName("as.ag")
    public int field737 = 0;

    @ObfuscatedName("as.ay")
    public int field745 = 0;

    @ObfuscatedName("as.ad")
    public int field740 = -1;

    @ObfuscatedName("as.bd")
    public int field747 = 0;

    @ObfuscatedName("as.bl")
    public int field721 = 0;

    @ObfuscatedName("as.bi")
    public int field749 = 0;

    @ObfuscatedName("as.bc")
    public int field744 = 0;

    @ObfuscatedName("as.bn")
    public int field751 = -1;

    @ObfuscatedName("as.bb")
    public int field773 = 0;

    @ObfuscatedName("as.bu")
    public int field753 = 0;

    @ObfuscatedName("as.bq")
    public int field724;

    @ObfuscatedName("as.bk")
    public int field755;

    @ObfuscatedName("as.bv")
    public int field722;

    @ObfuscatedName("as.bj")
    public int field757;

    @ObfuscatedName("as.bh")
    public int field758;

    @ObfuscatedName("as.bw")
    public int field732;

    @ObfuscatedName("as.bz")
    public int field760;

    @ObfuscatedName("as.by")
    public int field761;

    @ObfuscatedName("as.bp")
    public int field719;

    @ObfuscatedName("as.bx")
    public int field763 = 0;

    @ObfuscatedName("as.be")
    public int field764 = 200;

    @ObfuscatedName("as.bt")
    public int field765;

    @ObfuscatedName("as.br")
    public int field766 = 0;

    @ObfuscatedName("as.bm")
    public int field767 = 32;

    @ObfuscatedName("as.bg")
    public int field768 = 0;

    @ObfuscatedName("as.ba")
    public int[] field769 = new int[10];

    @ObfuscatedName("as.bo")
    public int[] field759 = new int[10];

    @ObfuscatedName("as.bs")
    public boolean[] field771 = new boolean[10];

    @ObfuscatedName("as.bf")
    public int field772 = 0;

    @ObfuscatedName("as.cu")
    public int field750 = 0;

    @ObfuscatedName("as.b(IIZI)V")
    public final void method584(int arg0, int arg1, boolean arg2) {
        if (this.field740 != -1 && class38.method1579(this.field740).field907 == 1) {
            this.field740 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field769[0];
            int var5 = arg1 - this.field759[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field768 < 9) {
                    this.field768++;
                }
                for (int var6 = this.field768; var6 > 0; var6--) {
                    this.field769[var6] = this.field769[var6 - 1];
                    this.field759[var6] = this.field759[var6 - 1];
                    this.field771[var6] = this.field771[var6 - 1];
                }
                this.field769[0] = arg0;
                this.field759[0] = arg1;
                this.field771[0] = false;
                return;
            }
        }
        this.field768 = 0;
        this.field750 = 0;
        this.field772 = 0;
        this.field769[0] = arg0;
        this.field759[0] = arg1;
        this.field743 = this.field769[0] * 128 + this.field720 * 64;
        this.field717 = this.field759[0] * 128 + this.field720 * 64;
    }

    @ObfuscatedName("as.u(IZI)V")
    public final void method585(int arg0, boolean arg1) {
        int var3 = this.field769[0];
        int var4 = this.field759[0];
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
        if (this.field740 != -1 && class38.method1579(this.field740).field907 == 1) {
            this.field740 = -1;
        }
        if (this.field768 < 9) {
            this.field768++;
        }
        for (int var5 = this.field768; var5 > 0; var5--) {
            this.field769[var5] = this.field769[var5 - 1];
            this.field759[var5] = this.field759[var5 - 1];
            this.field771[var5] = this.field771[var5 - 1];
        }
        this.field769[0] = var3;
        this.field759[0] = var4;
        this.field771[0] = arg1;
    }

    @ObfuscatedName("as.r(B)V")
    public final void method586() {
        this.field768 = 0;
        this.field750 = 0;
    }

    @ObfuscatedName("as.i(I)Z")
    public boolean method16() {
        return false;
    }

    @ObfuscatedName("as.z(IIIB)V")
    public final void method595(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field736[var4] <= arg2) {
                this.field734[var4] = arg0;
                this.field723[var4] = arg1;
                this.field736[var4] = arg2 + 70;
                return;
            }
        }
    }
}
