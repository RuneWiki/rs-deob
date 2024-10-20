package deob;

@ObfuscatedName("ao")
public abstract class class27 extends class94 {

    @ObfuscatedName("ao.n")
    public int field429;

    @ObfuscatedName("ao.q")
    public int field423;

    @ObfuscatedName("ao.c")
    public int field433;

    @ObfuscatedName("ao.h")
    public boolean field425 = false;

    @ObfuscatedName("ao.b")
    public int field462 = 1;

    @ObfuscatedName("ao.y")
    public int field427 = -1;

    @ObfuscatedName("ao.x")
    public int field428 = -1;

    @ObfuscatedName("ao.ao")
    public int field438 = -1;

    @ObfuscatedName("ao.ae")
    public int field430 = -1;

    @ObfuscatedName("ao.aa")
    public int field478 = -1;

    @ObfuscatedName("ao.ah")
    public int field424 = -1;

    @ObfuscatedName("ao.aw")
    public int field434 = -1;

    @ObfuscatedName("ao.an")
    public int field455 = -1;

    @ObfuscatedName("ao.av")
    public String field435 = null;

    @ObfuscatedName("ao.ak")
    public int field436 = 100;

    @ObfuscatedName("ao.ax")
    public int field437 = 0;

    @ObfuscatedName("ao.ab")
    public int field446 = 0;

    @ObfuscatedName("ao.ai")
    public int[] field439 = new int[4];

    @ObfuscatedName("ao.at")
    public int[] field444 = new int[4];

    @ObfuscatedName("ao.aq")
    public int[] field441 = new int[4];

    @ObfuscatedName("ao.ac")
    public int field442 = -1000;

    @ObfuscatedName("ao.al")
    public int field432;

    @ObfuscatedName("ao.ag")
    public int field426;

    @ObfuscatedName("ao.ap")
    public int field445 = -1;

    @ObfuscatedName("ao.am")
    public int field476 = 0;

    @ObfuscatedName("ao.as")
    public int field447 = 0;

    @ObfuscatedName("ao.aj")
    public int field474 = -1;

    @ObfuscatedName("ao.ar")
    public int field465 = 0;

    @ObfuscatedName("ao.au")
    public int field450 = 0;

    @ObfuscatedName("ao.ad")
    public int field451 = -1;

    @ObfuscatedName("ao.az")
    public int field452 = 0;

    @ObfuscatedName("ao.ay")
    public int field453 = 0;

    @ObfuscatedName("ao.bh")
    public int field454 = 0;

    @ObfuscatedName("ao.ba")
    public int field422 = 0;

    @ObfuscatedName("ao.bn")
    public int field456 = -1;

    @ObfuscatedName("ao.bj")
    public int field475 = 0;

    @ObfuscatedName("ao.bu")
    public int field458 = 0;

    @ObfuscatedName("ao.br")
    public int field459;

    @ObfuscatedName("ao.bd")
    public int field431;

    @ObfuscatedName("ao.bf")
    public int field461;

    @ObfuscatedName("ao.bg")
    public int field440;

    @ObfuscatedName("ao.bp")
    public int field463;

    @ObfuscatedName("ao.bb")
    public int field464;

    @ObfuscatedName("ao.bc")
    public int field457;

    @ObfuscatedName("ao.by")
    public int field466;

    @ObfuscatedName("ao.bw")
    public int field467;

    @ObfuscatedName("ao.bm")
    public int field468 = 0;

    @ObfuscatedName("ao.bz")
    public int field469 = 200;

    @ObfuscatedName("ao.bv")
    public int field470;

    @ObfuscatedName("ao.bq")
    public int field471 = 0;

    @ObfuscatedName("ao.bk")
    public int field472 = 32;

    @ObfuscatedName("ao.bo")
    public int field448 = 0;

    @ObfuscatedName("ao.bs")
    public int[] field443 = new int[10];

    @ObfuscatedName("ao.bx")
    public int[] field449 = new int[10];

    @ObfuscatedName("ao.bl")
    public boolean[] field460 = new boolean[10];

    @ObfuscatedName("ao.be")
    public int field477 = 0;

    @ObfuscatedName("ao.bi")
    public int field473 = 0;

    @ObfuscatedName("ao.a(IIZB)V")
    public final void method267(int arg0, int arg1, boolean arg2) {
        if (this.field451 != -1 && class34.method235(this.field451).field901 == 1) {
            this.field451 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field443[0];
            int var5 = arg1 - this.field449[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field448 < 9) {
                    this.field448++;
                }
                for (int var6 = this.field448; var6 > 0; var6--) {
                    this.field443[var6] = this.field443[var6 - 1];
                    this.field449[var6] = this.field449[var6 - 1];
                    this.field460[var6] = this.field460[var6 - 1];
                }
                this.field443[0] = arg0;
                this.field449[0] = arg1;
                this.field460[0] = false;
                return;
            }
        }
        this.field448 = 0;
        this.field473 = 0;
        this.field477 = 0;
        this.field443[0] = arg0;
        this.field449[0] = arg1;
        this.field429 = this.field443[0] * 128 + this.field462 * 64;
        this.field423 = this.field449[0] * 128 + this.field462 * 64;
    }

    @ObfuscatedName("ao.z(IZI)V")
    public final void method258(int arg0, boolean arg1) {
        int var3 = this.field443[0];
        int var4 = this.field449[0];
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
        if (this.field451 != -1 && class34.method235(this.field451).field901 == 1) {
            this.field451 = -1;
        }
        if (this.field448 < 9) {
            this.field448++;
        }
        for (int var5 = this.field448; var5 > 0; var5--) {
            this.field443[var5] = this.field443[var5 - 1];
            this.field449[var5] = this.field449[var5 - 1];
            this.field460[var5] = this.field460[var5 - 1];
        }
        this.field443[0] = var3;
        this.field449[0] = var4;
        this.field460[0] = arg1;
    }

    @ObfuscatedName("ao.s(B)V")
    public final void method259() {
        this.field448 = 0;
        this.field473 = 0;
    }

    @ObfuscatedName("ao.f(B)Z")
    public boolean method26() {
        return false;
    }

    @ObfuscatedName("ao.m(IIII)V")
    public final void method256(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field441[var4] <= arg2) {
                this.field439[var4] = arg0;
                this.field444[var4] = arg1;
                this.field441[var4] = arg2 + 70;
                return;
            }
        }
    }
}
