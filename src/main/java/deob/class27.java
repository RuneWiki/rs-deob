package deob;

@ObfuscatedName("ap")
public abstract class class27 extends class94 {

    @ObfuscatedName("ap.o")
    public int field468;

    @ObfuscatedName("ap.r")
    public int field435;

    @ObfuscatedName("ap.k")
    public int field480;

    @ObfuscatedName("ap.w")
    public boolean field474 = false;

    @ObfuscatedName("ap.e")
    public int field470 = 1;

    @ObfuscatedName("ap.p")
    public int field437 = -1;

    @ObfuscatedName("ap.i")
    public int field438 = -1;

    @ObfuscatedName("ap.ap")
    public int field439 = -1;

    @ObfuscatedName("ap.as")
    public int field436 = -1;

    @ObfuscatedName("ap.ak")
    public int field441 = -1;

    @ObfuscatedName("ap.af")
    public int field442 = -1;

    @ObfuscatedName("ap.ag")
    public int field443 = -1;

    @ObfuscatedName("ap.aj")
    public int field444 = -1;

    @ObfuscatedName("ap.ac")
    public String field445 = null;

    @ObfuscatedName("ap.an")
    public int field446 = 100;

    @ObfuscatedName("ap.ad")
    public int field447 = 0;

    @ObfuscatedName("ap.ai")
    public int field448 = 0;

    @ObfuscatedName("ap.au")
    public int[] field449 = new int[4];

    @ObfuscatedName("ap.at")
    public int[] field450 = new int[4];

    @ObfuscatedName("ap.ax")
    public int[] field454 = new int[4];

    @ObfuscatedName("ap.aq")
    public int field432 = -1000;

    @ObfuscatedName("ap.aw")
    public int field453;

    @ObfuscatedName("ap.ao")
    public int field456;

    @ObfuscatedName("ap.aa")
    public int field455 = -1;

    @ObfuscatedName("ap.ah")
    public int field451 = 0;

    @ObfuscatedName("ap.av")
    public int field457 = 0;

    @ObfuscatedName("ap.am")
    public int field458 = -1;

    @ObfuscatedName("ap.ab")
    public int field459 = 0;

    @ObfuscatedName("ap.az")
    public int field471 = 0;

    @ObfuscatedName("ap.al")
    public int field461 = -1;

    @ObfuscatedName("ap.ar")
    public int field462 = 0;

    @ObfuscatedName("ap.ay")
    public int field463 = 0;

    @ObfuscatedName("ap.bi")
    public int field464 = 0;

    @ObfuscatedName("ap.bf")
    public int field465 = 0;

    @ObfuscatedName("ap.be")
    public int field484 = -1;

    @ObfuscatedName("ap.bl")
    public int field467 = 0;

    @ObfuscatedName("ap.bd")
    public int field479 = 0;

    @ObfuscatedName("ap.bm")
    public int field466;

    @ObfuscatedName("ap.ba")
    public int field460;

    @ObfuscatedName("ap.bu")
    public int field473;

    @ObfuscatedName("ap.bb")
    public int field472;

    @ObfuscatedName("ap.by")
    public int field482;

    @ObfuscatedName("ap.bo")
    public int field433;

    @ObfuscatedName("ap.bg")
    public int field475;

    @ObfuscatedName("ap.bs")
    public int field476;

    @ObfuscatedName("ap.bc")
    public int field477;

    @ObfuscatedName("ap.bv")
    public int field478 = 0;

    @ObfuscatedName("ap.bx")
    public int field440 = 200;

    @ObfuscatedName("ap.bt")
    public int field489;

    @ObfuscatedName("ap.bk")
    public int field452 = 0;

    @ObfuscatedName("ap.bn")
    public int field434 = 32;

    @ObfuscatedName("ap.bp")
    public int field483 = 0;

    @ObfuscatedName("ap.bw")
    public int[] field469 = new int[10];

    @ObfuscatedName("ap.bz")
    public int[] field481 = new int[10];

    @ObfuscatedName("ap.br")
    public boolean[] field486 = new boolean[10];

    @ObfuscatedName("ap.bh")
    public int field487 = 0;

    @ObfuscatedName("ap.bq")
    public int field488 = 0;

    @ObfuscatedName("ap.m(IIZI)V")
    public final void method229(int arg0, int arg1, boolean arg2) {
        if (this.field461 != -1 && Statics.method1425(this.field461).field907 == 1) {
            this.field461 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field469[0];
            int var5 = arg1 - this.field481[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field483 < 9) {
                    this.field483++;
                }
                for (int var6 = this.field483; var6 > 0; var6--) {
                    this.field469[var6] = this.field469[var6 - 1];
                    this.field481[var6] = this.field481[var6 - 1];
                    this.field486[var6] = this.field486[var6 - 1];
                }
                this.field469[0] = arg0;
                this.field481[0] = arg1;
                this.field486[0] = false;
                return;
            }
        }
        this.field483 = 0;
        this.field488 = 0;
        this.field487 = 0;
        this.field469[0] = arg0;
        this.field481[0] = arg1;
        this.field468 = this.field469[0] * 128 + this.field470 * 64;
        this.field435 = this.field481[0] * 128 + this.field470 * 64;
    }

    @ObfuscatedName("ap.s(IZB)V")
    public final void method237(int arg0, boolean arg1) {
        int var3 = this.field469[0];
        int var4 = this.field481[0];
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
        if (this.field461 != -1 && Statics.method1425(this.field461).field907 == 1) {
            this.field461 = -1;
        }
        if (this.field483 < 9) {
            this.field483++;
        }
        for (int var5 = this.field483; var5 > 0; var5--) {
            this.field469[var5] = this.field469[var5 - 1];
            this.field481[var5] = this.field481[var5 - 1];
            this.field486[var5] = this.field486[var5 - 1];
        }
        this.field469[0] = var3;
        this.field481[0] = var4;
        this.field486[0] = arg1;
    }

    @ObfuscatedName("ap.j(I)V")
    public final void method230() {
        this.field483 = 0;
        this.field488 = 0;
    }

    @ObfuscatedName("ap.y(I)Z")
    public boolean method14() {
        return false;
    }

    @ObfuscatedName("ap.b(IIIB)V")
    public final void method233(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field454[var4] <= arg2) {
                this.field449[var4] = arg0;
                this.field450[var4] = arg1;
                this.field454[var4] = arg2 + 70;
                return;
            }
        }
    }
}
