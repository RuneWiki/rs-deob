package deob;

@ObfuscatedName("aq")
public abstract class class34 extends class79 {

    @ObfuscatedName("aq.i")
    public int field766;

    @ObfuscatedName("aq.w")
    public int field759;

    @ObfuscatedName("aq.x")
    public int field735;

    @ObfuscatedName("aq.h")
    public boolean field773 = false;

    @ObfuscatedName("aq.z")
    public int field737 = 1;

    @ObfuscatedName("aq.u")
    public int field772 = -1;

    @ObfuscatedName("aq.ad")
    public int field739 = -1;

    @ObfuscatedName("aq.ah")
    public int field740 = -1;

    @ObfuscatedName("aq.ao")
    public int field741 = -1;

    @ObfuscatedName("aq.as")
    public int field742 = -1;

    @ObfuscatedName("aq.at")
    public int field743 = -1;

    @ObfuscatedName("aq.ai")
    public int field780 = -1;

    @ObfuscatedName("aq.aj")
    public int field745 = -1;

    @ObfuscatedName("aq.aq")
    public String field746 = null;

    @ObfuscatedName("aq.an")
    public boolean field747;

    @ObfuscatedName("aq.ac")
    public boolean field733 = false;

    @ObfuscatedName("aq.ap")
    public int field738 = 100;

    @ObfuscatedName("aq.az")
    public int field744 = 0;

    @ObfuscatedName("aq.ax")
    public int field751 = 0;

    @ObfuscatedName("aq.am")
    public int[] field752 = new int[4];

    @ObfuscatedName("aq.av")
    public int[] field749 = new int[4];

    @ObfuscatedName("aq.ar")
    public int[] field754 = new int[4];

    @ObfuscatedName("aq.ak")
    public int field755 = -1000;

    @ObfuscatedName("aq.aw")
    public int field756;

    @ObfuscatedName("aq.ag")
    public int field757;

    @ObfuscatedName("aq.ay")
    public int field758 = -1;

    @ObfuscatedName("aq.af")
    public int field778 = 0;

    @ObfuscatedName("aq.au")
    public int field779 = 0;

    @ObfuscatedName("aq.aa")
    public int field734 = -1;

    @ObfuscatedName("aq.ab")
    public int field762 = 0;

    @ObfuscatedName("aq.ae")
    public int field763 = 0;

    @ObfuscatedName("aq.bx")
    public int field764 = -1;

    @ObfuscatedName("aq.bj")
    public int field765 = 0;

    @ObfuscatedName("aq.ba")
    public int field761 = 0;

    @ObfuscatedName("aq.bi")
    public int field736 = 0;

    @ObfuscatedName("aq.bb")
    public int field768 = 0;

    @ObfuscatedName("aq.bk")
    public int field769 = -1;

    @ObfuscatedName("aq.bl")
    public int field750 = 0;

    @ObfuscatedName("aq.bt")
    public int field771 = 0;

    @ObfuscatedName("aq.bc")
    public int field792;

    @ObfuscatedName("aq.bn")
    public int field787;

    @ObfuscatedName("aq.bu")
    public int field774;

    @ObfuscatedName("aq.bo")
    public int field775;

    @ObfuscatedName("aq.br")
    public int field788;

    @ObfuscatedName("aq.bd")
    public int field777;

    @ObfuscatedName("aq.bm")
    public int field748;

    @ObfuscatedName("aq.bz")
    public int field770;

    @ObfuscatedName("aq.bv")
    public int field791;

    @ObfuscatedName("aq.bf")
    public int field781 = 0;

    @ObfuscatedName("aq.be")
    public int field782 = 200;

    @ObfuscatedName("aq.bs")
    public int field783;

    @ObfuscatedName("aq.bw")
    public int field760 = 0;

    @ObfuscatedName("aq.bp")
    public int field785 = 32;

    @ObfuscatedName("aq.bh")
    public int field786 = 0;

    @ObfuscatedName("aq.bg")
    public int[] field753 = new int[10];

    @ObfuscatedName("aq.bq")
    public int[] field776 = new int[10];

    @ObfuscatedName("aq.by")
    public boolean[] field789 = new boolean[10];

    @ObfuscatedName("aq.cg")
    public int field790 = 0;

    @ObfuscatedName("aq.cf")
    public int field767 = 0;

    @ObfuscatedName("aq.o(IIZB)V")
    public final void method611(int arg0, int arg1, boolean arg2) {
        if (this.field764 != -1 && class39.method682(this.field764).field912 == 1) {
            this.field764 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field753[0];
            int var5 = arg1 - this.field776[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field786 < 9) {
                    this.field786++;
                }
                for (int var6 = this.field786; var6 > 0; var6--) {
                    this.field753[var6] = this.field753[var6 - 1];
                    this.field776[var6] = this.field776[var6 - 1];
                    this.field789[var6] = this.field789[var6 - 1];
                }
                this.field753[0] = arg0;
                this.field776[0] = arg1;
                this.field789[0] = false;
                return;
            }
        }
        this.field786 = 0;
        this.field767 = 0;
        this.field790 = 0;
        this.field753[0] = arg0;
        this.field776[0] = arg1;
        this.field766 = this.field753[0] * 128 + this.field737 * 64;
        this.field759 = this.field776[0] * 128 + this.field737 * 64;
    }

    @ObfuscatedName("aq.c(IZI)V")
    public final void method618(int arg0, boolean arg1) {
        int var3 = this.field753[0];
        int var4 = this.field776[0];
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
        if (this.field764 != -1 && class39.method682(this.field764).field912 == 1) {
            this.field764 = -1;
        }
        if (this.field786 < 9) {
            this.field786++;
        }
        for (int var5 = this.field786; var5 > 0; var5--) {
            this.field753[var5] = this.field753[var5 - 1];
            this.field776[var5] = this.field776[var5 - 1];
            this.field789[var5] = this.field789[var5 - 1];
        }
        this.field753[0] = var3;
        this.field776[0] = var4;
        this.field789[0] = arg1;
    }

    @ObfuscatedName("aq.r(B)V")
    public final void method612() {
        this.field786 = 0;
        this.field767 = 0;
    }

    @ObfuscatedName("aq.f(I)Z")
    public boolean method12() {
        return false;
    }

    @ObfuscatedName("aq.s(IIIB)V")
    public final void method620(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field754[var4] <= arg2) {
                this.field752[var4] = arg0;
                this.field749[var4] = arg1;
                this.field754[var4] = arg2 + 70;
                return;
            }
        }
    }
}
