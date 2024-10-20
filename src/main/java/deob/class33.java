package deob;

@ObfuscatedName("aj")
public abstract class class33 extends class78 {

    @ObfuscatedName("aj.k")
    public int field700;

    @ObfuscatedName("aj.e")
    public int field726;

    @ObfuscatedName("aj.v")
    public int field728;

    @ObfuscatedName("aj.n")
    public boolean field740 = false;

    @ObfuscatedName("aj.d")
    public int field701 = 1;

    @ObfuscatedName("aj.m")
    public int field733 = -1;

    @ObfuscatedName("aj.g")
    public int field703 = -1;

    @ObfuscatedName("aj.aq")
    public int field755 = -1;

    @ObfuscatedName("aj.ao")
    public int field705 = -1;

    @ObfuscatedName("aj.af")
    public int field706 = -1;

    @ObfuscatedName("aj.ag")
    public int field707 = -1;

    @ObfuscatedName("aj.ad")
    public int field722 = -1;

    @ObfuscatedName("aj.ak")
    public int field709 = -1;

    @ObfuscatedName("aj.aj")
    public String field710 = null;

    @ObfuscatedName("aj.as")
    public boolean field731;

    @ObfuscatedName("aj.al")
    public int field712 = 100;

    @ObfuscatedName("aj.ai")
    public int field713 = 0;

    @ObfuscatedName("aj.az")
    public int field714 = 0;

    @ObfuscatedName("aj.ay")
    public int[] field715 = new int[4];

    @ObfuscatedName("aj.au")
    public int[] field716 = new int[4];

    @ObfuscatedName("aj.ar")
    public int[] field717 = new int[4];

    @ObfuscatedName("aj.ap")
    public int field711 = -1000;

    @ObfuscatedName("aj.an")
    public int field719;

    @ObfuscatedName("aj.ae")
    public int field720;

    @ObfuscatedName("aj.aa")
    public int field698 = -1;

    @ObfuscatedName("aj.ax")
    public int field746 = 0;

    @ObfuscatedName("aj.am")
    public int field723 = 0;

    @ObfuscatedName("aj.ab")
    public int field724 = -1;

    @ObfuscatedName("aj.at")
    public int field725 = 0;

    @ObfuscatedName("aj.ah")
    public int field729 = 0;

    @ObfuscatedName("aj.ac")
    public int field697 = -1;

    @ObfuscatedName("aj.av")
    public int field702 = 0;

    @ObfuscatedName("aj.bp")
    public int field735 = 0;

    @ObfuscatedName("aj.bg")
    public int field730 = 0;

    @ObfuscatedName("aj.by")
    public int field738 = 0;

    @ObfuscatedName("aj.bi")
    public int field732 = -1;

    @ObfuscatedName("aj.bz")
    public int field727 = 0;

    @ObfuscatedName("aj.be")
    public int field734 = 0;

    @ObfuscatedName("aj.bm")
    public int field739;

    @ObfuscatedName("aj.bq")
    public int field736;

    @ObfuscatedName("aj.bu")
    public int field745;

    @ObfuscatedName("aj.bo")
    public int field699;

    @ObfuscatedName("aj.bh")
    public int field708;

    @ObfuscatedName("aj.bb")
    public int field742;

    @ObfuscatedName("aj.bs")
    public int field741;

    @ObfuscatedName("aj.bc")
    public int field737;

    @ObfuscatedName("aj.bk")
    public int field743;

    @ObfuscatedName("aj.ba")
    public int field704 = 0;

    @ObfuscatedName("aj.bd")
    public int field744 = 200;

    @ObfuscatedName("aj.bx")
    public int field721;

    @ObfuscatedName("aj.bl")
    public int field747 = 0;

    @ObfuscatedName("aj.bw")
    public int field748 = 32;

    @ObfuscatedName("aj.bv")
    public int field749 = 0;

    @ObfuscatedName("aj.bj")
    public int[] field750 = new int[10];

    @ObfuscatedName("aj.bn")
    public int[] field751 = new int[10];

    @ObfuscatedName("aj.bt")
    public boolean[] field752 = new boolean[10];

    @ObfuscatedName("aj.br")
    public int field753 = 0;

    @ObfuscatedName("aj.bf")
    public int field754 = 0;

    @ObfuscatedName("aj.h(IIZI)V")
    public final void method589(int arg0, int arg1, boolean arg2) {
        if (this.field697 != -1 && class38.method84(this.field697).field880 == 1) {
            this.field697 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field750[0];
            int var5 = arg1 - this.field751[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field749 < 9) {
                    this.field749++;
                }
                for (int var6 = this.field749; var6 > 0; var6--) {
                    this.field750[var6] = this.field750[var6 - 1];
                    this.field751[var6] = this.field751[var6 - 1];
                    this.field752[var6] = this.field752[var6 - 1];
                }
                this.field750[0] = arg0;
                this.field751[0] = arg1;
                this.field752[0] = false;
                return;
            }
        }
        this.field749 = 0;
        this.field754 = 0;
        this.field753 = 0;
        this.field750[0] = arg0;
        this.field751[0] = arg1;
        this.field700 = this.field750[0] * 128 + this.field701 * 64;
        this.field726 = this.field751[0] * 128 + this.field701 * 64;
    }

    @ObfuscatedName("aj.r(IZI)V")
    public final void method593(int arg0, boolean arg1) {
        int var3 = this.field750[0];
        int var4 = this.field751[0];
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
        if (this.field697 != -1 && class38.method84(this.field697).field880 == 1) {
            this.field697 = -1;
        }
        if (this.field749 < 9) {
            this.field749++;
        }
        for (int var5 = this.field749; var5 > 0; var5--) {
            this.field750[var5] = this.field750[var5 - 1];
            this.field751[var5] = this.field751[var5 - 1];
            this.field752[var5] = this.field752[var5 - 1];
        }
        this.field750[0] = var3;
        this.field751[0] = var4;
        this.field752[0] = arg1;
    }

    @ObfuscatedName("aj.o(I)V")
    public final void method586() {
        this.field749 = 0;
        this.field754 = 0;
    }

    @ObfuscatedName("aj.a(I)Z")
    public boolean method17() {
        return false;
    }

    @ObfuscatedName("aj.f(IIIB)V")
    public final void method588(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field717[var4] <= arg2) {
                this.field715[var4] = arg0;
                this.field716[var4] = arg1;
                this.field717[var4] = arg2 + 70;
                return;
            }
        }
    }
}
