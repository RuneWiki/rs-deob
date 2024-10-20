package deob;

@ObfuscatedName("ah")
public abstract class class27 extends class94 {

    @ObfuscatedName("ah.v")
    public int field473;

    @ObfuscatedName("ah.b")
    public int field442;

    @ObfuscatedName("ah.j")
    public int field419;

    @ObfuscatedName("ah.m")
    public boolean field420 = false;

    @ObfuscatedName("ah.k")
    public int field463 = 1;

    @ObfuscatedName("ah.u")
    public int field422 = -1;

    @ObfuscatedName("ah.i")
    public int field423 = -1;

    @ObfuscatedName("ah.ah")
    public int field424 = -1;

    @ObfuscatedName("ah.ag")
    public int field434 = -1;

    @ObfuscatedName("ah.ay")
    public int field426 = -1;

    @ObfuscatedName("ah.as")
    public int field427 = -1;

    @ObfuscatedName("ah.aq")
    public int field428 = -1;

    @ObfuscatedName("ah.am")
    public int field431 = -1;

    @ObfuscatedName("ah.an")
    public String field430 = null;

    @ObfuscatedName("ah.av")
    public int field445 = 100;

    @ObfuscatedName("ah.at")
    public int field432 = 0;

    @ObfuscatedName("ah.ap")
    public int field441 = 0;

    @ObfuscatedName("ah.af")
    public int[] field475 = new int[4];

    @ObfuscatedName("ah.ai")
    public int[] field474 = new int[4];

    @ObfuscatedName("ah.aj")
    public int[] field437 = new int[4];

    @ObfuscatedName("ah.ax")
    public int field438 = -1000;

    @ObfuscatedName("ah.ak")
    public int field464;

    @ObfuscatedName("ah.az")
    public int field440;

    @ObfuscatedName("ah.aa")
    public int field421 = -1;

    @ObfuscatedName("ah.au")
    public int field429 = 0;

    @ObfuscatedName("ah.ar")
    public int field443 = 0;

    @ObfuscatedName("ah.ao")
    public int field444 = -1;

    @ObfuscatedName("ah.aw")
    public int field425 = 0;

    @ObfuscatedName("ah.ab")
    public int field446 = 0;

    @ObfuscatedName("ah.ac")
    public int field447 = -1;

    @ObfuscatedName("ah.ad")
    public int field448 = 0;

    @ObfuscatedName("ah.al")
    public int field449 = 0;

    @ObfuscatedName("ah.bg")
    public int field418 = 0;

    @ObfuscatedName("ah.bt")
    public int field451 = 0;

    @ObfuscatedName("ah.bz")
    public int field433 = -1;

    @ObfuscatedName("ah.bn")
    public int field453 = 0;

    @ObfuscatedName("ah.bd")
    public int field454 = 0;

    @ObfuscatedName("ah.ba")
    public int field435;

    @ObfuscatedName("ah.bk")
    public int field450;

    @ObfuscatedName("ah.by")
    public int field469;

    @ObfuscatedName("ah.bf")
    public int field458;

    @ObfuscatedName("ah.bo")
    public int field417;

    @ObfuscatedName("ah.bu")
    public int field460;

    @ObfuscatedName("ah.bw")
    public int field461;

    @ObfuscatedName("ah.bs")
    public int field462;

    @ObfuscatedName("ah.bc")
    public int field459;

    @ObfuscatedName("ah.bj")
    public int field456 = 0;

    @ObfuscatedName("ah.bb")
    public int field465 = 200;

    @ObfuscatedName("ah.bx")
    public int field466;

    @ObfuscatedName("ah.be")
    public int field467 = 0;

    @ObfuscatedName("ah.bq")
    public int field468 = 32;

    @ObfuscatedName("ah.bi")
    public int field455 = 0;

    @ObfuscatedName("ah.bl")
    public int[] field470 = new int[10];

    @ObfuscatedName("ah.bh")
    public int[] field471 = new int[10];

    @ObfuscatedName("ah.bv")
    public boolean[] field439 = new boolean[10];

    @ObfuscatedName("ah.bm")
    public int field436 = 0;

    @ObfuscatedName("ah.bp")
    public int field472 = 0;

    @ObfuscatedName("ah.t(IIZI)V")
    public final void method267(int arg0, int arg1, boolean arg2) {
        if (this.field447 != -1 && class34.method57(this.field447).field910 == 1) {
            this.field447 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field470[0];
            int var5 = arg1 - this.field471[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field455 < 9) {
                    this.field455++;
                }
                for (int var6 = this.field455; var6 > 0; var6--) {
                    this.field470[var6] = this.field470[var6 - 1];
                    this.field471[var6] = this.field471[var6 - 1];
                    this.field439[var6] = this.field439[var6 - 1];
                }
                this.field470[0] = arg0;
                this.field471[0] = arg1;
                this.field439[0] = false;
                return;
            }
        }
        this.field455 = 0;
        this.field472 = 0;
        this.field436 = 0;
        this.field470[0] = arg0;
        this.field471[0] = arg1;
        this.field473 = this.field470[0] * 128 + this.field463 * 64;
        this.field442 = this.field471[0] * 128 + this.field463 * 64;
    }

    @ObfuscatedName("ah.q(IZI)V")
    public final void method259(int arg0, boolean arg1) {
        int var3 = this.field470[0];
        int var4 = this.field471[0];
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
        if (this.field447 != -1 && class34.method57(this.field447).field910 == 1) {
            this.field447 = -1;
        }
        if (this.field455 < 9) {
            this.field455++;
        }
        for (int var5 = this.field455; var5 > 0; var5--) {
            this.field470[var5] = this.field470[var5 - 1];
            this.field471[var5] = this.field471[var5 - 1];
            this.field439[var5] = this.field439[var5 - 1];
        }
        this.field470[0] = var3;
        this.field471[0] = var4;
        this.field439[0] = arg1;
    }

    @ObfuscatedName("ah.c(I)V")
    public final void method270() {
        this.field455 = 0;
        this.field472 = 0;
    }

    @ObfuscatedName("ah.e(B)Z")
    public boolean method24() {
        return false;
    }

    @ObfuscatedName("ah.z(IIII)V")
    public final void method261(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field437[var4] <= arg2) {
                this.field475[var4] = arg0;
                this.field474[var4] = arg1;
                this.field437[var4] = arg2 + 70;
                return;
            }
        }
    }
}
