package deob;

@ObfuscatedName("ar")
public abstract class class27 extends class94 {

    @ObfuscatedName("ar.s")
    public int field431;

    @ObfuscatedName("ar.g")
    public int field440;

    @ObfuscatedName("ar.m")
    public int field432;

    @ObfuscatedName("ar.a")
    public boolean field433 = false;

    @ObfuscatedName("ar.n")
    public int field460 = 1;

    @ObfuscatedName("ar.v")
    public int field443 = -1;

    @ObfuscatedName("ar.e")
    public int field436 = -1;

    @ObfuscatedName("ar.ar")
    public int field437 = -1;

    @ObfuscatedName("ar.ak")
    public int field484 = -1;

    @ObfuscatedName("ar.ap")
    public int field439 = -1;

    @ObfuscatedName("ar.aa")
    public int field461 = -1;

    @ObfuscatedName("ar.av")
    public int field441 = -1;

    @ObfuscatedName("ar.aq")
    public int field442 = -1;

    @ObfuscatedName("ar.an")
    public String field458 = null;

    @ObfuscatedName("ar.al")
    public int field444 = 100;

    @ObfuscatedName("ar.ax")
    public int field445 = 0;

    @ObfuscatedName("ar.as")
    public int field446 = 0;

    @ObfuscatedName("ar.ae")
    public int[] field447 = new int[4];

    @ObfuscatedName("ar.ac")
    public int[] field448 = new int[4];

    @ObfuscatedName("ar.af")
    public int[] field449 = new int[4];

    @ObfuscatedName("ar.aj")
    public int field450 = -1000;

    @ObfuscatedName("ar.ao")
    public int field451;

    @ObfuscatedName("ar.au")
    public int field465;

    @ObfuscatedName("ar.at")
    public int field453 = -1;

    @ObfuscatedName("ar.az")
    public int field454 = 0;

    @ObfuscatedName("ar.ag")
    public int field455 = 0;

    @ObfuscatedName("ar.am")
    public int field434 = -1;

    @ObfuscatedName("ar.ai")
    public int field464 = 0;

    @ObfuscatedName("ar.ab")
    public int field463 = 0;

    @ObfuscatedName("ar.ay")
    public int field459 = -1;

    @ObfuscatedName("ar.aw")
    public int field452 = 0;

    @ObfuscatedName("ar.ad")
    public int field490 = 0;

    @ObfuscatedName("ar.bs")
    public int field462 = 0;

    @ObfuscatedName("ar.bt")
    public int field456 = 0;

    @ObfuscatedName("ar.bn")
    public int field435 = -1;

    @ObfuscatedName("ar.bk")
    public int field486 = 0;

    @ObfuscatedName("ar.bl")
    public int field466 = 0;

    @ObfuscatedName("ar.bi")
    public int field467;

    @ObfuscatedName("ar.br")
    public int field468;

    @ObfuscatedName("ar.bb")
    public int field457;

    @ObfuscatedName("ar.bm")
    public int field470;

    @ObfuscatedName("ar.bw")
    public int field471;

    @ObfuscatedName("ar.bc")
    public int field438;

    @ObfuscatedName("ar.bo")
    public int field473;

    @ObfuscatedName("ar.bq")
    public int field474;

    @ObfuscatedName("ar.bh")
    public int field487;

    @ObfuscatedName("ar.bp")
    public int field476 = 0;

    @ObfuscatedName("ar.bf")
    public int field477 = 200;

    @ObfuscatedName("ar.bj")
    public int field478;

    @ObfuscatedName("ar.by")
    public int field479 = 0;

    @ObfuscatedName("ar.bz")
    public int field480 = 32;

    @ObfuscatedName("ar.bv")
    public int field481 = 0;

    @ObfuscatedName("ar.ba")
    public int[] field482 = new int[10];

    @ObfuscatedName("ar.bg")
    public int[] field472 = new int[10];

    @ObfuscatedName("ar.bu")
    public boolean[] field469 = new boolean[10];

    @ObfuscatedName("ar.bx")
    public int field485 = 0;

    @ObfuscatedName("ar.bd")
    public int field483 = 0;

    @ObfuscatedName("ar.x(IIZI)V")
    public final void method249(int arg0, int arg1, boolean arg2) {
        if (this.field459 != -1 && Statics.method31(this.field459).field904 == 1) {
            this.field459 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field482[0];
            int var5 = arg1 - this.field472[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field481 < 9) {
                    this.field481++;
                }
                for (int var6 = this.field481; var6 > 0; var6--) {
                    this.field482[var6] = this.field482[var6 - 1];
                    this.field472[var6] = this.field472[var6 - 1];
                    this.field469[var6] = this.field469[var6 - 1];
                }
                this.field482[0] = arg0;
                this.field472[0] = arg1;
                this.field469[0] = false;
                return;
            }
        }
        this.field481 = 0;
        this.field483 = 0;
        this.field485 = 0;
        this.field482[0] = arg0;
        this.field472[0] = arg1;
        this.field431 = this.field482[0] * 128 + this.field460 * 64;
        this.field440 = this.field472[0] * 128 + this.field460 * 64;
    }

    @ObfuscatedName("ar.q(IZI)V")
    public final void method262(int arg0, boolean arg1) {
        int var3 = this.field482[0];
        int var4 = this.field472[0];
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
        if (this.field459 != -1 && Statics.method31(this.field459).field904 == 1) {
            this.field459 = -1;
        }
        if (this.field481 < 9) {
            this.field481++;
        }
        for (int var5 = this.field481; var5 > 0; var5--) {
            this.field482[var5] = this.field482[var5 - 1];
            this.field472[var5] = this.field472[var5 - 1];
            this.field469[var5] = this.field469[var5 - 1];
        }
        this.field482[0] = var3;
        this.field472[0] = var4;
        this.field469[0] = arg1;
    }

    @ObfuscatedName("ar.w(I)V")
    public final void method255() {
        this.field481 = 0;
        this.field483 = 0;
    }

    @ObfuscatedName("ar.c(B)Z")
    public boolean method21() {
        return false;
    }

    @ObfuscatedName("ar.k(IIII)V")
    public final void method256(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field449[var4] <= arg2) {
                this.field447[var4] = arg0;
                this.field448[var4] = arg1;
                this.field449[var4] = arg2 + 70;
                return;
            }
        }
    }
}
