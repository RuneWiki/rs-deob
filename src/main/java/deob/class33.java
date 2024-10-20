package deob;

@ObfuscatedName("aj")
public abstract class class33 extends class78 {

    @ObfuscatedName("aj.b")
    public int field760;

    @ObfuscatedName("aj.x")
    public int field716;

    @ObfuscatedName("aj.q")
    public int field715;

    @ObfuscatedName("aj.o")
    public boolean field718 = false;

    @ObfuscatedName("aj.m")
    public int field747 = 1;

    @ObfuscatedName("aj.f")
    public int field720 = -1;

    @ObfuscatedName("aj.ab")
    public int field721 = -1;

    @ObfuscatedName("aj.al")
    public int field722 = -1;

    @ObfuscatedName("aj.an")
    public int field723 = -1;

    @ObfuscatedName("aj.aw")
    public int field724 = -1;

    @ObfuscatedName("aj.ar")
    public int field725 = -1;

    @ObfuscatedName("aj.ai")
    public int field726 = -1;

    @ObfuscatedName("aj.aj")
    public int field727 = -1;

    @ObfuscatedName("aj.ao")
    public String field728 = null;

    @ObfuscatedName("aj.ap")
    public boolean field759;

    @ObfuscatedName("aj.as")
    public int field730 = 100;

    @ObfuscatedName("aj.au")
    public int field763 = 0;

    @ObfuscatedName("aj.ac")
    public int field768 = 0;

    @ObfuscatedName("aj.av")
    public int[] field729 = new int[4];

    @ObfuscatedName("aj.ak")
    public int[] field734 = new int[4];

    @ObfuscatedName("aj.ae")
    public int[] field735 = new int[4];

    @ObfuscatedName("aj.at")
    public int field736 = -1000;

    @ObfuscatedName("aj.az")
    public int field737;

    @ObfuscatedName("aj.ag")
    public int field738;

    @ObfuscatedName("aj.af")
    public int field739 = -1;

    @ObfuscatedName("aj.am")
    public int field740 = 0;

    @ObfuscatedName("aj.ah")
    public int field754 = 0;

    @ObfuscatedName("aj.aq")
    public int field742 = -1;

    @ObfuscatedName("aj.ax")
    public int field749 = 0;

    @ObfuscatedName("aj.ad")
    public int field744 = 0;

    @ObfuscatedName("aj.aa")
    public int field745 = -1;

    @ObfuscatedName("aj.bm")
    public int field746 = 0;

    @ObfuscatedName("aj.bg")
    public int field731 = 0;

    @ObfuscatedName("aj.bf")
    public int field748 = 0;

    @ObfuscatedName("aj.bo")
    public int field767 = 0;

    @ObfuscatedName("aj.bk")
    public int field750 = -1;

    @ObfuscatedName("aj.br")
    public int field743 = 0;

    @ObfuscatedName("aj.bd")
    public int field752 = 0;

    @ObfuscatedName("aj.bl")
    public int field753;

    @ObfuscatedName("aj.bj")
    public int field751;

    @ObfuscatedName("aj.bn")
    public int field755;

    @ObfuscatedName("aj.bs")
    public int field756;

    @ObfuscatedName("aj.be")
    public int field717;

    @ObfuscatedName("aj.bp")
    public int field758;

    @ObfuscatedName("aj.bv")
    public int field772;

    @ObfuscatedName("aj.bx")
    public int field770;

    @ObfuscatedName("aj.ba")
    public int field761;

    @ObfuscatedName("aj.by")
    public int field762 = 0;

    @ObfuscatedName("aj.bq")
    public int field719 = 200;

    @ObfuscatedName("aj.bi")
    public int field764;

    @ObfuscatedName("aj.bb")
    public int field757 = 0;

    @ObfuscatedName("aj.bt")
    public int field766 = 32;

    @ObfuscatedName("aj.bz")
    public int field741 = 0;

    @ObfuscatedName("aj.bc")
    public int[] field765 = new int[10];

    @ObfuscatedName("aj.bh")
    public int[] field769 = new int[10];

    @ObfuscatedName("aj.bu")
    public boolean[] field732 = new boolean[10];

    @ObfuscatedName("aj.bw")
    public int field771 = 0;

    @ObfuscatedName("aj.cz")
    public int field733 = 0;

    @ObfuscatedName("aj.c(IIZI)V")
    public final void method569(int arg0, int arg1, boolean arg2) {
        if (this.field745 != -1 && class38.method29(this.field745).field899 == 1) {
            this.field745 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field765[0];
            int var5 = arg1 - this.field769[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field741 < 9) {
                    this.field741++;
                }
                for (int var6 = this.field741; var6 > 0; var6--) {
                    this.field765[var6] = this.field765[var6 - 1];
                    this.field769[var6] = this.field769[var6 - 1];
                    this.field732[var6] = this.field732[var6 - 1];
                }
                this.field765[0] = arg0;
                this.field769[0] = arg1;
                this.field732[0] = false;
                return;
            }
        }
        this.field741 = 0;
        this.field733 = 0;
        this.field771 = 0;
        this.field765[0] = arg0;
        this.field769[0] = arg1;
        this.field760 = this.field765[0] * 128 + this.field747 * 64;
        this.field716 = this.field769[0] * 128 + this.field747 * 64;
    }

    @ObfuscatedName("aj.d(IZI)V")
    public final void method550(int arg0, boolean arg1) {
        int var3 = this.field765[0];
        int var4 = this.field769[0];
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
        if (this.field745 != -1 && class38.method29(this.field745).field899 == 1) {
            this.field745 = -1;
        }
        if (this.field741 < 9) {
            this.field741++;
        }
        for (int var5 = this.field741; var5 > 0; var5--) {
            this.field765[var5] = this.field765[var5 - 1];
            this.field769[var5] = this.field769[var5 - 1];
            this.field732[var5] = this.field732[var5 - 1];
        }
        this.field765[0] = var3;
        this.field769[0] = var4;
        this.field732[0] = arg1;
    }

    @ObfuscatedName("aj.v(I)V")
    public final void method551() {
        this.field741 = 0;
        this.field733 = 0;
    }

    @ObfuscatedName("aj.s(B)Z")
    public boolean method20() {
        return false;
    }

    @ObfuscatedName("aj.n(IIII)V")
    public final void method553(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field735[var4] <= arg2) {
                this.field729[var4] = arg0;
                this.field734[var4] = arg1;
                this.field735[var4] = arg2 + 70;
                return;
            }
        }
    }
}
