package deob;

@ObfuscatedName("an")
public abstract class class33 extends class78 {

    @ObfuscatedName("an.e")
    public int field730;

    @ObfuscatedName("an.a")
    public int field780;

    @ObfuscatedName("an.c")
    public int field732;

    @ObfuscatedName("an.f")
    public boolean field733 = false;

    @ObfuscatedName("an.q")
    public int field734 = 1;

    @ObfuscatedName("an.z")
    public int field745 = -1;

    @ObfuscatedName("an.aa")
    public int field768 = -1;

    @ObfuscatedName("an.ak")
    public int field737 = -1;

    @ObfuscatedName("an.al")
    public int field738 = -1;

    @ObfuscatedName("an.aw")
    public int field739 = -1;

    @ObfuscatedName("an.ai")
    public int field740 = -1;

    @ObfuscatedName("an.av")
    public int field741 = -1;

    @ObfuscatedName("an.an")
    public int field736 = -1;

    @ObfuscatedName("an.aq")
    public String field743 = null;

    @ObfuscatedName("an.aj")
    public boolean field744;

    @ObfuscatedName("an.az")
    public int field731 = 100;

    @ObfuscatedName("an.ax")
    public int field747 = 0;

    @ObfuscatedName("an.ap")
    public int field764 = 0;

    @ObfuscatedName("an.am")
    public int[] field748 = new int[4];

    @ObfuscatedName("an.ae")
    public int[] field749 = new int[4];

    @ObfuscatedName("an.as")
    public int[] field735 = new int[4];

    @ObfuscatedName("an.ad")
    public int field751 = -1000;

    @ObfuscatedName("an.af")
    public int field752;

    @ObfuscatedName("an.ab")
    public int field753;

    @ObfuscatedName("an.at")
    public int field754 = -1;

    @ObfuscatedName("an.ag")
    public int field750 = 0;

    @ObfuscatedName("an.ah")
    public int field758 = 0;

    @ObfuscatedName("an.ac")
    public int field757 = -1;

    @ObfuscatedName("an.ay")
    public int field769 = 0;

    @ObfuscatedName("an.au")
    public int field759 = 0;

    @ObfuscatedName("an.ao")
    public int field760 = -1;

    @ObfuscatedName("an.bh")
    public int field761 = 0;

    @ObfuscatedName("an.bf")
    public int field762 = 0;

    @ObfuscatedName("an.bn")
    public int field763 = 0;

    @ObfuscatedName("an.bw")
    public int field787 = 0;

    @ObfuscatedName("an.be")
    public int field765 = -1;

    @ObfuscatedName("an.bd")
    public int field766 = 0;

    @ObfuscatedName("an.bo")
    public int field756 = 0;

    @ObfuscatedName("an.bz")
    public int field773;

    @ObfuscatedName("an.bq")
    public int field774;

    @ObfuscatedName("an.bu")
    public int field777;

    @ObfuscatedName("an.bk")
    public int field771;

    @ObfuscatedName("an.bc")
    public int field772;

    @ObfuscatedName("an.ba")
    public int field767;

    @ObfuscatedName("an.bb")
    public int field742;

    @ObfuscatedName("an.bv")
    public int field775;

    @ObfuscatedName("an.bl")
    public int field776;

    @ObfuscatedName("an.br")
    public int field770 = 0;

    @ObfuscatedName("an.bi")
    public int field778 = 200;

    @ObfuscatedName("an.bj")
    public int field779;

    @ObfuscatedName("an.bp")
    public int field746 = 0;

    @ObfuscatedName("an.bs")
    public int field781 = 32;

    @ObfuscatedName("an.by")
    public int field782 = 0;

    @ObfuscatedName("an.bg")
    public int[] field783 = new int[10];

    @ObfuscatedName("an.bm")
    public int[] field784 = new int[10];

    @ObfuscatedName("an.bt")
    public boolean[] field785 = new boolean[10];

    @ObfuscatedName("an.bx")
    public int field786 = 0;

    @ObfuscatedName("an.cn")
    public int field755 = 0;

    @ObfuscatedName("an.x(IIZI)V")
    public final void method591(int arg0, int arg1, boolean arg2) {
        if (this.field760 != -1 && class38.method102(this.field760).field917 == 1) {
            this.field760 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field783[0];
            int var5 = arg1 - this.field784[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field782 < 9) {
                    this.field782++;
                }
                for (int var6 = this.field782; var6 > 0; var6--) {
                    this.field783[var6] = this.field783[var6 - 1];
                    this.field784[var6] = this.field784[var6 - 1];
                    this.field785[var6] = this.field785[var6 - 1];
                }
                this.field783[0] = arg0;
                this.field784[0] = arg1;
                this.field785[0] = false;
                return;
            }
        }
        this.field782 = 0;
        this.field755 = 0;
        this.field786 = 0;
        this.field783[0] = arg0;
        this.field784[0] = arg1;
        this.field730 = this.field783[0] * 128 + this.field734 * 64;
        this.field780 = this.field784[0] * 128 + this.field734 * 64;
    }

    @ObfuscatedName("an.n(IZI)V")
    public final void method585(int arg0, boolean arg1) {
        int var3 = this.field783[0];
        int var4 = this.field784[0];
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
        if (this.field760 != -1 && class38.method102(this.field760).field917 == 1) {
            this.field760 = -1;
        }
        if (this.field782 < 9) {
            this.field782++;
        }
        for (int var5 = this.field782; var5 > 0; var5--) {
            this.field783[var5] = this.field783[var5 - 1];
            this.field784[var5] = this.field784[var5 - 1];
            this.field785[var5] = this.field785[var5 - 1];
        }
        this.field783[0] = var3;
        this.field784[0] = var4;
        this.field785[0] = arg1;
    }

    @ObfuscatedName("an.d(I)V")
    public final void method586() {
        this.field782 = 0;
        this.field755 = 0;
    }

    @ObfuscatedName("an.y(I)Z")
    public boolean method12() {
        return false;
    }

    @ObfuscatedName("an.s(IIII)V")
    public final void method587(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field735[var4] <= arg2) {
                this.field748[var4] = arg0;
                this.field749[var4] = arg1;
                this.field735[var4] = arg2 + 70;
                return;
            }
        }
    }
}
