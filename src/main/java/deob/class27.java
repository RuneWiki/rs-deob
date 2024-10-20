package deob;

@ObfuscatedName("ah")
public abstract class class27 extends class94 {

    @ObfuscatedName("ah.n")
    public int field471;

    @ObfuscatedName("ah.q")
    public int field420;

    @ObfuscatedName("ah.r")
    public int field419;

    @ObfuscatedName("ah.u")
    public boolean field422 = false;

    @ObfuscatedName("ah.p")
    public int field423 = 1;

    @ObfuscatedName("ah.t")
    public int field443 = -1;

    @ObfuscatedName("ah.s")
    public int field425 = -1;

    @ObfuscatedName("ah.ah")
    public int field426 = -1;

    @ObfuscatedName("ah.ar")
    public int field434 = -1;

    @ObfuscatedName("ah.ac")
    public int field428 = -1;

    @ObfuscatedName("ah.as")
    public int field429 = -1;

    @ObfuscatedName("ah.ag")
    public int field436 = -1;

    @ObfuscatedName("ah.ak")
    public int field431 = -1;

    @ObfuscatedName("ah.am")
    public String field432 = null;

    @ObfuscatedName("ah.ap")
    public int field427 = 100;

    @ObfuscatedName("ah.au")
    public int field430 = 0;

    @ObfuscatedName("ah.aq")
    public int field467 = 0;

    @ObfuscatedName("ah.aw")
    public int[] field433 = new int[4];

    @ObfuscatedName("ah.ai")
    public int[] field463 = new int[4];

    @ObfuscatedName("ah.ae")
    public int[] field438 = new int[4];

    @ObfuscatedName("ah.ab")
    public int field424 = -1000;

    @ObfuscatedName("ah.ay")
    public int field440;

    @ObfuscatedName("ah.ax")
    public int field441;

    @ObfuscatedName("ah.ao")
    public int field442 = -1;

    @ObfuscatedName("ah.al")
    public int field439 = 0;

    @ObfuscatedName("ah.az")
    public int field444 = 0;

    @ObfuscatedName("ah.aj")
    public int field445 = -1;

    @ObfuscatedName("ah.an")
    public int field446 = 0;

    @ObfuscatedName("ah.ad")
    public int field470 = 0;

    @ObfuscatedName("ah.af")
    public int field448 = -1;

    @ObfuscatedName("ah.av")
    public int field449 = 0;

    @ObfuscatedName("ah.aa")
    public int field469 = 0;

    @ObfuscatedName("ah.be")
    public int field451 = 0;

    @ObfuscatedName("ah.bc")
    public int field452 = 0;

    @ObfuscatedName("ah.br")
    public int field455 = -1;

    @ObfuscatedName("ah.bw")
    public int field468 = 0;

    @ObfuscatedName("ah.bj")
    public int field450 = 0;

    @ObfuscatedName("ah.bs")
    public int field456;

    @ObfuscatedName("ah.bi")
    public int field457;

    @ObfuscatedName("ah.bb")
    public int field458;

    @ObfuscatedName("ah.bk")
    public int field437;

    @ObfuscatedName("ah.bm")
    public int field460;

    @ObfuscatedName("ah.bd")
    public int field461;

    @ObfuscatedName("ah.bx")
    public int field462;

    @ObfuscatedName("ah.bl")
    public int field435;

    @ObfuscatedName("ah.bq")
    public int field472;

    @ObfuscatedName("ah.ba")
    public int field465 = 0;

    @ObfuscatedName("ah.bf")
    public int field421 = 200;

    @ObfuscatedName("ah.bg")
    public int field454;

    @ObfuscatedName("ah.bu")
    public int field447 = 0;

    @ObfuscatedName("ah.bt")
    public int field464 = 32;

    @ObfuscatedName("ah.bp")
    public int field466 = 0;

    @ObfuscatedName("ah.bz")
    public int[] field453 = new int[10];

    @ObfuscatedName("ah.by")
    public int[] field459 = new int[10];

    @ObfuscatedName("ah.bo")
    public boolean[] field473 = new boolean[10];

    @ObfuscatedName("ah.bv")
    public int field474 = 0;

    @ObfuscatedName("ah.bh")
    public int field475 = 0;

    @ObfuscatedName("ah.w(IIZI)V")
    public final void method251(int arg0, int arg1, boolean arg2) {
        if (this.field448 != -1 && class34.method1443(this.field448).field905 == 1) {
            this.field448 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field453[0];
            int var5 = arg1 - this.field459[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field466 < 9) {
                    this.field466++;
                }
                for (int var6 = this.field466; var6 > 0; var6--) {
                    this.field453[var6] = this.field453[var6 - 1];
                    this.field459[var6] = this.field459[var6 - 1];
                    this.field473[var6] = this.field473[var6 - 1];
                }
                this.field453[0] = arg0;
                this.field459[0] = arg1;
                this.field473[0] = false;
                return;
            }
        }
        this.field466 = 0;
        this.field475 = 0;
        this.field474 = 0;
        this.field453[0] = arg0;
        this.field459[0] = arg1;
        this.field471 = this.field453[0] * 128 + this.field423 * 64;
        this.field420 = this.field459[0] * 128 + this.field423 * 64;
    }

    @ObfuscatedName("ah.c(IZB)V")
    public final void method245(int arg0, boolean arg1) {
        int var3 = this.field453[0];
        int var4 = this.field459[0];
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
        if (this.field448 != -1 && class34.method1443(this.field448).field905 == 1) {
            this.field448 = -1;
        }
        if (this.field466 < 9) {
            this.field466++;
        }
        for (int var5 = this.field466; var5 > 0; var5--) {
            this.field453[var5] = this.field453[var5 - 1];
            this.field459[var5] = this.field459[var5 - 1];
            this.field473[var5] = this.field473[var5 - 1];
        }
        this.field453[0] = var3;
        this.field459[0] = var4;
        this.field473[0] = arg1;
    }

    @ObfuscatedName("ah.z(I)V")
    public final void method248() {
        this.field466 = 0;
        this.field475 = 0;
    }

    @ObfuscatedName("ah.m(B)Z")
    public boolean method16() {
        return false;
    }

    @ObfuscatedName("ah.f(IIII)V")
    public final void method249(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field438[var4] <= arg2) {
                this.field433[var4] = arg0;
                this.field463[var4] = arg1;
                this.field438[var4] = arg2 + 70;
                return;
            }
        }
    }
}
