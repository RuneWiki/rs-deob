package deob;

@ObfuscatedName("ao")
public abstract class class28 extends class95 {

    @ObfuscatedName("ao.s")
    public int field443;

    @ObfuscatedName("ao.y")
    public int field439;

    @ObfuscatedName("ao.r")
    public int field440;

    @ObfuscatedName("ao.l")
    public boolean field441 = false;

    @ObfuscatedName("ao.n")
    public int field442 = 1;

    @ObfuscatedName("ao.h")
    public int field475 = -1;

    @ObfuscatedName("ao.v")
    public int field444 = -1;

    @ObfuscatedName("ao.ax")
    public int field445 = -1;

    @ObfuscatedName("ao.ao")
    public int field446 = -1;

    @ObfuscatedName("ao.al")
    public int field447 = -1;

    @ObfuscatedName("ao.ap")
    public int field484 = -1;

    @ObfuscatedName("ao.ak")
    public int field449 = -1;

    @ObfuscatedName("ao.aw")
    public int field483 = -1;

    @ObfuscatedName("ao.av")
    public String field451 = null;

    @ObfuscatedName("ao.ah")
    public int field452 = 100;

    @ObfuscatedName("ao.ae")
    public int field480 = 0;

    @ObfuscatedName("ao.am")
    public int field454 = 0;

    @ObfuscatedName("ao.ai")
    public int[] field455 = new int[4];

    @ObfuscatedName("ao.an")
    public int[] field465 = new int[4];

    @ObfuscatedName("ao.aa")
    public int[] field457 = new int[4];

    @ObfuscatedName("ao.ad")
    public int field458 = -1000;

    @ObfuscatedName("ao.az")
    public int field459;

    @ObfuscatedName("ao.ar")
    public int field460;

    @ObfuscatedName("ao.at")
    public int field461 = -1;

    @ObfuscatedName("ao.af")
    public int field462 = 0;

    @ObfuscatedName("ao.ay")
    public int field463 = 0;

    @ObfuscatedName("ao.as")
    public int field468 = -1;

    @ObfuscatedName("ao.ag")
    public int field453 = 0;

    @ObfuscatedName("ao.ac")
    public int field466 = 0;

    @ObfuscatedName("ao.aj")
    public int field450 = -1;

    @ObfuscatedName("ao.ab")
    public int field479 = 0;

    @ObfuscatedName("ao.au")
    public int field469 = 0;

    @ObfuscatedName("ao.bg")
    public int field464 = 0;

    @ObfuscatedName("ao.bw")
    public int field471 = 0;

    @ObfuscatedName("ao.bm")
    public int field472 = -1;

    @ObfuscatedName("ao.bp")
    public int field473 = 0;

    @ObfuscatedName("ao.bl")
    public int field474 = 0;

    @ObfuscatedName("ao.bv")
    public int field448;

    @ObfuscatedName("ao.bk")
    public int field456;

    @ObfuscatedName("ao.bd")
    public int field477;

    @ObfuscatedName("ao.bj")
    public int field478;

    @ObfuscatedName("ao.bt")
    public int field481;

    @ObfuscatedName("ao.by")
    public int field476;

    @ObfuscatedName("ao.bs")
    public int field470;

    @ObfuscatedName("ao.bx")
    public int field482;

    @ObfuscatedName("ao.br")
    public int field467;

    @ObfuscatedName("ao.bq")
    public int field495 = 0;

    @ObfuscatedName("ao.be")
    public int field485 = 200;

    @ObfuscatedName("ao.bn")
    public int field486;

    @ObfuscatedName("ao.bh")
    public int field487 = 0;

    @ObfuscatedName("ao.bz")
    public int field488 = 32;

    @ObfuscatedName("ao.bu")
    public int field489 = 0;

    @ObfuscatedName("ao.bb")
    public int[] field490 = new int[10];

    @ObfuscatedName("ao.bc")
    public int[] field491 = new int[10];

    @ObfuscatedName("ao.bf")
    public boolean[] field492 = new boolean[10];

    @ObfuscatedName("ao.ba")
    public int field493 = 0;

    @ObfuscatedName("ao.bi")
    public int field494 = 0;

    @ObfuscatedName("ao.u(IIZI)V")
    public final void method269(int arg0, int arg1, boolean arg2) {
        if (this.field450 != -1 && class35.method28(this.field450).field912 == 1) {
            this.field450 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field490[0];
            int var5 = arg1 - this.field491[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field489 < 9) {
                    this.field489++;
                }
                for (int var6 = this.field489; var6 > 0; var6--) {
                    this.field490[var6] = this.field490[var6 - 1];
                    this.field491[var6] = this.field491[var6 - 1];
                    this.field492[var6] = this.field492[var6 - 1];
                }
                this.field490[0] = arg0;
                this.field491[0] = arg1;
                this.field492[0] = false;
                return;
            }
        }
        this.field489 = 0;
        this.field494 = 0;
        this.field493 = 0;
        this.field490[0] = arg0;
        this.field491[0] = arg1;
        this.field443 = this.field490[0] * 128 + this.field442 * 64;
        this.field439 = this.field491[0] * 128 + this.field442 * 64;
    }

    @ObfuscatedName("ao.p(IZI)V")
    public final void method285(int arg0, boolean arg1) {
        int var3 = this.field490[0];
        int var4 = this.field491[0];
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
        if (this.field450 != -1 && class35.method28(this.field450).field912 == 1) {
            this.field450 = -1;
        }
        if (this.field489 < 9) {
            this.field489++;
        }
        for (int var5 = this.field489; var5 > 0; var5--) {
            this.field490[var5] = this.field490[var5 - 1];
            this.field491[var5] = this.field491[var5 - 1];
            this.field492[var5] = this.field492[var5 - 1];
        }
        this.field490[0] = var3;
        this.field491[0] = var4;
        this.field492[0] = arg1;
    }

    @ObfuscatedName("ao.t(B)V")
    public final void method270() {
        this.field489 = 0;
        this.field494 = 0;
    }

    @ObfuscatedName("ao.k(B)Z")
    public boolean method17() {
        return false;
    }

    @ObfuscatedName("ao.g(IIIB)V")
    public final void method271(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field457[var4] <= arg2) {
                this.field455[var4] = arg0;
                this.field465[var4] = arg1;
                this.field457[var4] = arg2 + 70;
                return;
            }
        }
    }
}
