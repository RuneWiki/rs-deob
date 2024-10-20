package deob;

@ObfuscatedName("af")
public abstract class class27 extends class94 {

    @ObfuscatedName("af.f")
    public int field421;

    @ObfuscatedName("af.y")
    public int field422;

    @ObfuscatedName("af.v")
    public int field423;

    @ObfuscatedName("af.w")
    public boolean field451 = false;

    @ObfuscatedName("af.d")
    public int field458 = 1;

    @ObfuscatedName("af.i")
    public int field426 = -1;

    @ObfuscatedName("af.c")
    public int field427 = -1;

    @ObfuscatedName("af.af")
    public int field428 = -1;

    @ObfuscatedName("af.aq")
    public int field429 = -1;

    @ObfuscatedName("af.at")
    public int field434 = -1;

    @ObfuscatedName("af.aw")
    public int field431 = -1;

    @ObfuscatedName("af.ax")
    public int field444 = -1;

    @ObfuscatedName("af.ak")
    public int field433 = -1;

    @ObfuscatedName("af.ar")
    public String field462 = null;

    @ObfuscatedName("af.az")
    public int field424 = 100;

    @ObfuscatedName("af.ai")
    public int field436 = 0;

    @ObfuscatedName("af.aj")
    public int field437 = 0;

    @ObfuscatedName("af.av")
    public int[] field438 = new int[4];

    @ObfuscatedName("af.ad")
    public int[] field439 = new int[4];

    @ObfuscatedName("af.ae")
    public int[] field440 = new int[4];

    @ObfuscatedName("af.ah")
    public int field435 = -1000;

    @ObfuscatedName("af.am")
    public int field442;

    @ObfuscatedName("af.ay")
    public int field443;

    @ObfuscatedName("af.ag")
    public int field457 = -1;

    @ObfuscatedName("af.al")
    public int field478 = 0;

    @ObfuscatedName("af.an")
    public int field446 = 0;

    @ObfuscatedName("af.aa")
    public int field447 = -1;

    @ObfuscatedName("af.ao")
    public int field448 = 0;

    @ObfuscatedName("af.au")
    public int field449 = 0;

    @ObfuscatedName("af.ab")
    public int field450 = -1;

    @ObfuscatedName("af.ac")
    public int field430 = 0;

    @ObfuscatedName("af.as")
    public int field452 = 0;

    @ObfuscatedName("af.bn")
    public int field453 = 0;

    @ObfuscatedName("af.bl")
    public int field454 = 0;

    @ObfuscatedName("af.ba")
    public int field455 = -1;

    @ObfuscatedName("af.bq")
    public int field456 = 0;

    @ObfuscatedName("af.bu")
    public int field477 = 0;

    @ObfuscatedName("af.bg")
    public int field464;

    @ObfuscatedName("af.bh")
    public int field441;

    @ObfuscatedName("af.bz")
    public int field460;

    @ObfuscatedName("af.bo")
    public int field467;

    @ObfuscatedName("af.bd")
    public int field445;

    @ObfuscatedName("af.bk")
    public int field463;

    @ObfuscatedName("af.bs")
    public int field425;

    @ObfuscatedName("af.br")
    public int field465;

    @ObfuscatedName("af.bm")
    public int field466;

    @ObfuscatedName("af.be")
    public int field471 = 0;

    @ObfuscatedName("af.bx")
    public int field468 = 200;

    @ObfuscatedName("af.bb")
    public int field469;

    @ObfuscatedName("af.bj")
    public int field470 = 0;

    @ObfuscatedName("af.bc")
    public int field459 = 32;

    @ObfuscatedName("af.bt")
    public int field472 = 0;

    @ObfuscatedName("af.bi")
    public int[] field473 = new int[10];

    @ObfuscatedName("af.bf")
    public int[] field474 = new int[10];

    @ObfuscatedName("af.bw")
    public boolean[] field432 = new boolean[10];

    @ObfuscatedName("af.bp")
    public int field476 = 0;

    @ObfuscatedName("af.bv")
    public int field475 = 0;

    @ObfuscatedName("af.j(IIZB)V")
    public final void method255(int arg0, int arg1, boolean arg2) {
        if (this.field450 != -1 && class34.method152(this.field450).field896 == 1) {
            this.field450 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field473[0];
            int var5 = arg1 - this.field474[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field472 < 9) {
                    this.field472++;
                }
                for (int var6 = this.field472; var6 > 0; var6--) {
                    this.field473[var6] = this.field473[var6 - 1];
                    this.field474[var6] = this.field474[var6 - 1];
                    this.field432[var6] = this.field432[var6 - 1];
                }
                this.field473[0] = arg0;
                this.field474[0] = arg1;
                this.field432[0] = false;
                return;
            }
        }
        this.field472 = 0;
        this.field475 = 0;
        this.field476 = 0;
        this.field473[0] = arg0;
        this.field474[0] = arg1;
        this.field421 = this.field473[0] * 128 + this.field458 * 64;
        this.field422 = this.field474[0] * 128 + this.field458 * 64;
    }

    @ObfuscatedName("af.b(IZI)V")
    public final void method256(int arg0, boolean arg1) {
        int var3 = this.field473[0];
        int var4 = this.field474[0];
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
        if (this.field450 != -1 && class34.method152(this.field450).field896 == 1) {
            this.field450 = -1;
        }
        if (this.field472 < 9) {
            this.field472++;
        }
        for (int var5 = this.field472; var5 > 0; var5--) {
            this.field473[var5] = this.field473[var5 - 1];
            this.field474[var5] = this.field474[var5 - 1];
            this.field432[var5] = this.field432[var5 - 1];
        }
        this.field473[0] = var3;
        this.field474[0] = var4;
        this.field432[0] = arg1;
    }

    @ObfuscatedName("af.t(I)V")
    public final void method259() {
        this.field472 = 0;
        this.field475 = 0;
    }

    @ObfuscatedName("af.s(B)Z")
    public boolean method21() {
        return false;
    }

    @ObfuscatedName("af.q(IIII)V")
    public final void method258(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field440[var4] <= arg2) {
                this.field438[var4] = arg0;
                this.field439[var4] = arg1;
                this.field440[var4] = arg2 + 70;
                return;
            }
        }
    }
}
