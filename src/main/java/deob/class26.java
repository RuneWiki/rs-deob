package deob;

@ObfuscatedName("h")
public abstract class class26 extends class93 {

    @ObfuscatedName("h.b")
    public int field396;

    @ObfuscatedName("h.p")
    public int field394;

    @ObfuscatedName("h.t")
    public int field427;

    @ObfuscatedName("h.l")
    public boolean field436 = false;

    @ObfuscatedName("h.a")
    public int field408 = 1;

    @ObfuscatedName("h.f")
    public int field398 = -1;

    @ObfuscatedName("h.h")
    public int field399 = -1;

    @ObfuscatedName("h.az")
    public int field442 = -1;

    @ObfuscatedName("h.ao")
    public int field401 = -1;

    @ObfuscatedName("h.au")
    public int field402 = -1;

    @ObfuscatedName("h.aw")
    public int field403 = -1;

    @ObfuscatedName("h.ad")
    public int field404 = -1;

    @ObfuscatedName("h.av")
    public int field405 = -1;

    @ObfuscatedName("h.am")
    public String field406 = null;

    @ObfuscatedName("h.an")
    public int field407 = 100;

    @ObfuscatedName("h.ac")
    public int field397 = 0;

    @ObfuscatedName("h.at")
    public int field419 = 0;

    @ObfuscatedName("h.aj")
    public int[] field410 = new int[4];

    @ObfuscatedName("h.ai")
    public int[] field454 = new int[4];

    @ObfuscatedName("h.ay")
    public int[] field412 = new int[4];

    @ObfuscatedName("h.ag")
    public int field413 = -1000;

    @ObfuscatedName("h.ar")
    public int field414;

    @ObfuscatedName("h.ae")
    public int field445;

    @ObfuscatedName("h.ah")
    public int field411 = -1;

    @ObfuscatedName("h.aa")
    public int field417 = 0;

    @ObfuscatedName("h.ab")
    public int field438 = 0;

    @ObfuscatedName("h.ak")
    public int field443 = -1;

    @ObfuscatedName("h.al")
    public int field420 = 0;

    @ObfuscatedName("h.as")
    public int field421 = 0;

    @ObfuscatedName("h.ap")
    public int field422 = -1;

    @ObfuscatedName("h.aq")
    public int field423 = 0;

    @ObfuscatedName("h.af")
    public int field424 = 0;

    @ObfuscatedName("h.bv")
    public int field437 = 0;

    @ObfuscatedName("h.bz")
    public int field426 = 0;

    @ObfuscatedName("h.ba")
    public int field425 = -1;

    @ObfuscatedName("h.br")
    public int field428 = 0;

    @ObfuscatedName("h.by")
    public int field429 = 0;

    @ObfuscatedName("h.bt")
    public int field430;

    @ObfuscatedName("h.bs")
    public int field431;

    @ObfuscatedName("h.bi")
    public int field444;

    @ObfuscatedName("h.bg")
    public int field433;

    @ObfuscatedName("h.bb")
    public int field434;

    @ObfuscatedName("h.bj")
    public int field435;

    @ObfuscatedName("h.bl")
    public int field415;

    @ObfuscatedName("h.bm")
    public int field393;

    @ObfuscatedName("h.bw")
    public int field416;

    @ObfuscatedName("h.bh")
    public int field439 = 0;

    @ObfuscatedName("h.bp")
    public int field440 = 200;

    @ObfuscatedName("h.bn")
    public int field441;

    @ObfuscatedName("h.bd")
    public int field395 = 0;

    @ObfuscatedName("h.bq")
    public int field432 = 32;

    @ObfuscatedName("h.bc")
    public int field400 = 0;

    @ObfuscatedName("h.bo")
    public int[] field409 = new int[10];

    @ObfuscatedName("h.bk")
    public int[] field446 = new int[10];

    @ObfuscatedName("h.bu")
    public boolean[] field418 = new boolean[10];

    @ObfuscatedName("h.be")
    public int field448 = 0;

    @ObfuscatedName("h.bx")
    public int field449 = 0;

    @ObfuscatedName("h.g(IIZS)V")
    public final void method233(int arg0, int arg1, boolean arg2) {
        if (this.field422 != -1 && class33.method2614(this.field422).field864 == 1) {
            this.field422 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field409[0];
            int var5 = arg1 - this.field446[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field400 < 9) {
                    this.field400++;
                }
                for (int var6 = this.field400; var6 > 0; var6--) {
                    this.field409[var6] = this.field409[var6 - 1];
                    this.field446[var6] = this.field446[var6 - 1];
                    this.field418[var6] = this.field418[var6 - 1];
                }
                this.field409[0] = arg0;
                this.field446[0] = arg1;
                this.field418[0] = false;
                return;
            }
        }
        this.field400 = 0;
        this.field449 = 0;
        this.field448 = 0;
        this.field409[0] = arg0;
        this.field446[0] = arg1;
        this.field396 = this.field409[0] * 128 + this.field408 * 64;
        this.field394 = this.field446[0] * 128 + this.field408 * 64;
    }

    @ObfuscatedName("h.q(IZB)V")
    public final void method234(int arg0, boolean arg1) {
        int var3 = this.field409[0];
        int var4 = this.field446[0];
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
        if (this.field422 != -1 && class33.method2614(this.field422).field864 == 1) {
            this.field422 = -1;
        }
        if (this.field400 < 9) {
            this.field400++;
        }
        for (int var5 = this.field400; var5 > 0; var5--) {
            this.field409[var5] = this.field409[var5 - 1];
            this.field446[var5] = this.field446[var5 - 1];
            this.field418[var5] = this.field418[var5 - 1];
        }
        this.field409[0] = var3;
        this.field446[0] = var4;
        this.field418[0] = arg1;
    }

    @ObfuscatedName("h.w(I)V")
    public final void method239() {
        this.field400 = 0;
        this.field449 = 0;
    }

    @ObfuscatedName("h.x(B)Z")
    public boolean method11() {
        return false;
    }

    @ObfuscatedName("h.k(IIII)V")
    public final void method232(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field412[var4] <= arg2) {
                this.field410[var4] = arg0;
                this.field454[var4] = arg1;
                this.field412[var4] = arg2 + 70;
                return;
            }
        }
    }
}
