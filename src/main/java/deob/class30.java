package deob;

@ObfuscatedName("ah")
public abstract class class30 extends class75 {

    @ObfuscatedName("ah.b")
    public int field704;

    @ObfuscatedName("ah.s")
    public int field693;

    @ObfuscatedName("ah.o")
    public int field694;

    @ObfuscatedName("ah.h")
    public boolean field727 = false;

    @ObfuscatedName("ah.x")
    public int field696 = 1;

    @ObfuscatedName("ah.e")
    public int field731 = -1;

    @ObfuscatedName("ah.z")
    public int field698 = -1;

    @ObfuscatedName("ah.az")
    public int field728 = -1;

    @ObfuscatedName("ah.av")
    public int field726 = -1;

    @ObfuscatedName("ah.ay")
    public int field701 = -1;

    @ObfuscatedName("ah.ah")
    public int field702 = -1;

    @ObfuscatedName("ah.ao")
    public int field705 = -1;

    @ObfuscatedName("ah.aj")
    public int field737 = -1;

    @ObfuscatedName("ah.ad")
    public String field724 = null;

    @ObfuscatedName("ah.ai")
    public int field706 = 100;

    @ObfuscatedName("ah.af")
    public int field707 = 0;

    @ObfuscatedName("ah.am")
    public int field708 = 0;

    @ObfuscatedName("ah.ar")
    public int[] field699 = new int[4];

    @ObfuscatedName("ah.an")
    public int[] field709 = new int[4];

    @ObfuscatedName("ah.au")
    public int[] field711 = new int[4];

    @ObfuscatedName("ah.aa")
    public int field712 = -1000;

    @ObfuscatedName("ah.ag")
    public int field713;

    @ObfuscatedName("ah.al")
    public int field714;

    @ObfuscatedName("ah.ap")
    public int field715 = -1;

    @ObfuscatedName("ah.ac")
    public int field741 = 0;

    @ObfuscatedName("ah.ak")
    public int field717 = 0;

    @ObfuscatedName("ah.ax")
    public int field718 = -1;

    @ObfuscatedName("ah.ab")
    public int field719 = 0;

    @ObfuscatedName("ah.aw")
    public int field720 = 0;

    @ObfuscatedName("ah.at")
    public int field721 = -1;

    @ObfuscatedName("ah.as")
    public int field716 = 0;

    @ObfuscatedName("ah.ae")
    public int field700 = 0;

    @ObfuscatedName("ah.bw")
    public int field749 = 0;

    @ObfuscatedName("ah.ba")
    public int field740 = 0;

    @ObfuscatedName("ah.bk")
    public int field697 = -1;

    @ObfuscatedName("ah.bv")
    public int field722 = 0;

    @ObfuscatedName("ah.bm")
    public int field695 = 0;

    @ObfuscatedName("ah.bi")
    public int field729;

    @ObfuscatedName("ah.bd")
    public int field730;

    @ObfuscatedName("ah.bt")
    public int field703;

    @ObfuscatedName("ah.br")
    public int field723;

    @ObfuscatedName("ah.bq")
    public int field733;

    @ObfuscatedName("ah.bp")
    public int field734;

    @ObfuscatedName("ah.bo")
    public int field744;

    @ObfuscatedName("ah.be")
    public int field736;

    @ObfuscatedName("ah.bj")
    public int field748;

    @ObfuscatedName("ah.bx")
    public int field738 = 0;

    @ObfuscatedName("ah.bz")
    public int field739 = 200;

    @ObfuscatedName("ah.bb")
    public int field743;

    @ObfuscatedName("ah.bc")
    public int field692 = 0;

    @ObfuscatedName("ah.bu")
    public int field742 = 32;

    @ObfuscatedName("ah.bg")
    public int field710 = 0;

    @ObfuscatedName("ah.bh")
    public int[] field732 = new int[10];

    @ObfuscatedName("ah.bs")
    public int[] field745 = new int[10];

    @ObfuscatedName("ah.by")
    public boolean[] field746 = new boolean[10];

    @ObfuscatedName("ah.bf")
    public int field747 = 0;

    @ObfuscatedName("ah.bl")
    public int field725 = 0;

    @ObfuscatedName("ah.d(IIZB)V")
    public final void method561(int arg0, int arg1, boolean arg2) {
        if (this.field721 != -1 && class35.method162(this.field721).field866 == 1) {
            this.field721 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field732[0];
            int var5 = arg1 - this.field745[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field710 < 9) {
                    this.field710++;
                }
                for (int var6 = this.field710; var6 > 0; var6--) {
                    this.field732[var6] = this.field732[var6 - 1];
                    this.field745[var6] = this.field745[var6 - 1];
                    this.field746[var6] = this.field746[var6 - 1];
                }
                this.field732[0] = arg0;
                this.field745[0] = arg1;
                this.field746[0] = false;
                return;
            }
        }
        this.field710 = 0;
        this.field725 = 0;
        this.field747 = 0;
        this.field732[0] = arg0;
        this.field745[0] = arg1;
        this.field704 = this.field732[0] * 128 + this.field696 * 64;
        this.field693 = this.field745[0] * 128 + this.field696 * 64;
    }

    @ObfuscatedName("ah.t(IZI)V")
    public final void method568(int arg0, boolean arg1) {
        int var3 = this.field732[0];
        int var4 = this.field745[0];
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
        if (this.field721 != -1 && class35.method162(this.field721).field866 == 1) {
            this.field721 = -1;
        }
        if (this.field710 < 9) {
            this.field710++;
        }
        for (int var5 = this.field710; var5 > 0; var5--) {
            this.field732[var5] = this.field732[var5 - 1];
            this.field745[var5] = this.field745[var5 - 1];
            this.field746[var5] = this.field746[var5 - 1];
        }
        this.field732[0] = var3;
        this.field745[0] = var4;
        this.field746[0] = arg1;
    }

    @ObfuscatedName("ah.j(I)V")
    public final void method564() {
        this.field710 = 0;
        this.field725 = 0;
    }

    @ObfuscatedName("ah.y(B)Z")
    public boolean method18() {
        return false;
    }

    @ObfuscatedName("ah.q(IIIB)V")
    public final void method569(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field711[var4] <= arg2) {
                this.field699[var4] = arg0;
                this.field709[var4] = arg1;
                this.field711[var4] = arg2 + 70;
                return;
            }
        }
    }
}
