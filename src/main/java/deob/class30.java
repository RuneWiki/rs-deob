package deob;

@ObfuscatedName("ai")
public abstract class class30 extends class75 {

    @ObfuscatedName("ai.c")
    public int field717;

    @ObfuscatedName("ai.h")
    public int field747;

    @ObfuscatedName("ai.y")
    public int field705;

    @ObfuscatedName("ai.r")
    public boolean field721 = false;

    @ObfuscatedName("ai.w")
    public int field728 = 1;

    @ObfuscatedName("ai.p")
    public int field711 = -1;

    @ObfuscatedName("ai.s")
    public int field704 = -1;

    @ObfuscatedName("ai.ag")
    public int field710 = -1;

    @ObfuscatedName("ai.ad")
    public int field755 = -1;

    @ObfuscatedName("ai.ak")
    public int field712 = -1;

    @ObfuscatedName("ai.ai")
    public int field713 = -1;

    @ObfuscatedName("ai.ac")
    public int field714 = -1;

    @ObfuscatedName("ai.as")
    public int field706 = -1;

    @ObfuscatedName("ai.ar")
    public String field750 = null;

    @ObfuscatedName("ai.an")
    public int field741 = 100;

    @ObfuscatedName("ai.ah")
    public int field734 = 0;

    @ObfuscatedName("ai.ax")
    public int field719 = 0;

    @ObfuscatedName("ai.ao")
    public int[] field707 = new int[4];

    @ObfuscatedName("ai.aj")
    public int[] field722 = new int[4];

    @ObfuscatedName("ai.ap")
    public int[] field723 = new int[4];

    @ObfuscatedName("ai.am")
    public int field724 = -1000;

    @ObfuscatedName("ai.az")
    public int field709;

    @ObfuscatedName("ai.aa")
    public int field726;

    @ObfuscatedName("ai.ab")
    public int field708 = -1;

    @ObfuscatedName("ai.aw")
    public int field715 = 0;

    @ObfuscatedName("ai.av")
    public int field729 = 0;

    @ObfuscatedName("ai.al")
    public int field730 = -1;

    @ObfuscatedName("ai.aq")
    public int field731 = 0;

    @ObfuscatedName("ai.au")
    public int field732 = 0;

    @ObfuscatedName("ai.ay")
    public int field733 = -1;

    @ObfuscatedName("ai.at")
    public int field703 = 0;

    @ObfuscatedName("ai.af")
    public int field735 = 0;

    @ObfuscatedName("ai.bp")
    public int field736 = 0;

    @ObfuscatedName("ai.bx")
    public int field727 = 0;

    @ObfuscatedName("ai.by")
    public int field738 = -1;

    @ObfuscatedName("ai.bq")
    public int field739 = 0;

    @ObfuscatedName("ai.bt")
    public int field758 = 0;

    @ObfuscatedName("ai.br")
    public int field720;

    @ObfuscatedName("ai.bi")
    public int field742;

    @ObfuscatedName("ai.ba")
    public int field743;

    @ObfuscatedName("ai.bf")
    public int field744;

    @ObfuscatedName("ai.bh")
    public int field745;

    @ObfuscatedName("ai.bo")
    public int field746;

    @ObfuscatedName("ai.bn")
    public int field716;

    @ObfuscatedName("ai.bl")
    public int field748;

    @ObfuscatedName("ai.bz")
    public int field749;

    @ObfuscatedName("ai.bw")
    public int field756 = 0;

    @ObfuscatedName("ai.bg")
    public int field751 = 200;

    @ObfuscatedName("ai.bb")
    public int field752;

    @ObfuscatedName("ai.bj")
    public int field753 = 0;

    @ObfuscatedName("ai.bu")
    public int field754 = 32;

    @ObfuscatedName("ai.bk")
    public int field737 = 0;

    @ObfuscatedName("ai.bv")
    public int[] field740 = new int[10];

    @ObfuscatedName("ai.be")
    public int[] field757 = new int[10];

    @ObfuscatedName("ai.bm")
    public boolean[] field725 = new boolean[10];

    @ObfuscatedName("ai.bd")
    public int field759 = 0;

    @ObfuscatedName("ai.bc")
    public int field760 = 0;

    @ObfuscatedName("ai.b(IIZB)V")
    public final void method595(int arg0, int arg1, boolean arg2) {
        if (this.field733 != -1 && class35.method2065(this.field733).field893 == 1) {
            this.field733 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field740[0];
            int var5 = arg1 - this.field757[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field737 < 9) {
                    this.field737++;
                }
                for (int var6 = this.field737; var6 > 0; var6--) {
                    this.field740[var6] = this.field740[var6 - 1];
                    this.field757[var6] = this.field757[var6 - 1];
                    this.field725[var6] = this.field725[var6 - 1];
                }
                this.field740[0] = arg0;
                this.field757[0] = arg1;
                this.field725[0] = false;
                return;
            }
        }
        this.field737 = 0;
        this.field760 = 0;
        this.field759 = 0;
        this.field740[0] = arg0;
        this.field757[0] = arg1;
        this.field717 = this.field740[0] * 128 + this.field728 * 64;
        this.field747 = this.field757[0] * 128 + this.field728 * 64;
    }

    @ObfuscatedName("ai.i(IZI)V")
    public final void method605(int arg0, boolean arg1) {
        int var3 = this.field740[0];
        int var4 = this.field757[0];
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
        if (this.field733 != -1 && class35.method2065(this.field733).field893 == 1) {
            this.field733 = -1;
        }
        if (this.field737 < 9) {
            this.field737++;
        }
        for (int var5 = this.field737; var5 > 0; var5--) {
            this.field740[var5] = this.field740[var5 - 1];
            this.field757[var5] = this.field757[var5 - 1];
            this.field725[var5] = this.field725[var5 - 1];
        }
        this.field740[0] = var3;
        this.field757[0] = var4;
        this.field725[0] = arg1;
    }

    @ObfuscatedName("ai.o(I)V")
    public final void method597() {
        this.field737 = 0;
        this.field760 = 0;
    }

    @ObfuscatedName("ai.u(I)Z")
    public boolean method28() {
        return false;
    }

    @ObfuscatedName("ai.x(IIII)V")
    public final void method599(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field723[var4] <= arg2) {
                this.field707[var4] = arg0;
                this.field722[var4] = arg1;
                this.field723[var4] = arg2 + 70;
                return;
            }
        }
    }
}
