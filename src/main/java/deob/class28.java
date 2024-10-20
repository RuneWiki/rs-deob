package deob;

@ObfuscatedName("ar")
public abstract class class28 extends class95 {

    @ObfuscatedName("ar.k")
    public int field470;

    @ObfuscatedName("ar.n")
    public int field419;

    @ObfuscatedName("ar.t")
    public int field420;

    @ObfuscatedName("ar.y")
    public boolean field428 = false;

    @ObfuscatedName("ar.g")
    public int field452 = 1;

    @ObfuscatedName("ar.f")
    public int field423 = -1;

    @ObfuscatedName("ar.j")
    public int field424 = -1;

    @ObfuscatedName("ar.af")
    public int field426 = -1;

    @ObfuscatedName("ar.ar")
    public int field440 = -1;

    @ObfuscatedName("ar.ax")
    public int field432 = -1;

    @ObfuscatedName("ar.at")
    public int field472 = -1;

    @ObfuscatedName("ar.ah")
    public int field429 = -1;

    @ObfuscatedName("ar.ap")
    public int field430 = -1;

    @ObfuscatedName("ar.ay")
    public String field421 = null;

    @ObfuscatedName("ar.ag")
    public int field475 = 100;

    @ObfuscatedName("ar.ai")
    public int field433 = 0;

    @ObfuscatedName("ar.aw")
    public int field436 = 0;

    @ObfuscatedName("ar.an")
    public int[] field444 = new int[4];

    @ObfuscatedName("ar.as")
    public int[] field437 = new int[4];

    @ObfuscatedName("ar.au")
    public int[] field438 = new int[4];

    @ObfuscatedName("ar.aq")
    public int field439 = -1000;

    @ObfuscatedName("ar.ac")
    public int field427;

    @ObfuscatedName("ar.ae")
    public int field441;

    @ObfuscatedName("ar.ad")
    public int field442 = -1;

    @ObfuscatedName("ar.ao")
    public int field443 = 0;

    @ObfuscatedName("ar.aj")
    public int field435 = 0;

    @ObfuscatedName("ar.aa")
    public int field445 = -1;

    @ObfuscatedName("ar.al")
    public int field461 = 0;

    @ObfuscatedName("ar.az")
    public int field447 = 0;

    @ObfuscatedName("ar.av")
    public int field459 = -1;

    @ObfuscatedName("ar.ab")
    public int field449 = 0;

    @ObfuscatedName("ar.ak")
    public int field450 = 0;

    @ObfuscatedName("ar.bi")
    public int field451 = 0;

    @ObfuscatedName("ar.bp")
    public int field455 = 0;

    @ObfuscatedName("ar.bg")
    public int field453 = -1;

    @ObfuscatedName("ar.ba")
    public int field454 = 0;

    @ObfuscatedName("ar.by")
    public int field418 = 0;

    @ObfuscatedName("ar.bf")
    public int field456;

    @ObfuscatedName("ar.bo")
    public int field457;

    @ObfuscatedName("ar.bd")
    public int field458;

    @ObfuscatedName("ar.bn")
    public int field446;

    @ObfuscatedName("ar.bz")
    public int field460;

    @ObfuscatedName("ar.bl")
    public int field425;

    @ObfuscatedName("ar.bq")
    public int field462;

    @ObfuscatedName("ar.bc")
    public int field463;

    @ObfuscatedName("ar.bb")
    public int field464;

    @ObfuscatedName("ar.bt")
    public int field465 = 0;

    @ObfuscatedName("ar.br")
    public int field434 = 200;

    @ObfuscatedName("ar.bs")
    public int field467;

    @ObfuscatedName("ar.bu")
    public int field468 = 0;

    @ObfuscatedName("ar.bv")
    public int field469 = 32;

    @ObfuscatedName("ar.bh")
    public int field466 = 0;

    @ObfuscatedName("ar.be")
    public int[] field471 = new int[10];

    @ObfuscatedName("ar.bx")
    public int[] field431 = new int[10];

    @ObfuscatedName("ar.bm")
    public boolean[] field473 = new boolean[10];

    @ObfuscatedName("ar.bj")
    public int field474 = 0;

    @ObfuscatedName("ar.bk")
    public int field422 = 0;

    @ObfuscatedName("ar.x(IIZI)V")
    public final void method266(int arg0, int arg1, boolean arg2) {
        if (this.field459 != -1 && class35.method708(this.field459).field900 == 1) {
            this.field459 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field471[0];
            int var5 = arg1 - this.field431[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field466 < 9) {
                    this.field466++;
                }
                for (int var6 = this.field466; var6 > 0; var6--) {
                    this.field471[var6] = this.field471[var6 - 1];
                    this.field431[var6] = this.field431[var6 - 1];
                    this.field473[var6] = this.field473[var6 - 1];
                }
                this.field471[0] = arg0;
                this.field431[0] = arg1;
                this.field473[0] = false;
                return;
            }
        }
        this.field466 = 0;
        this.field422 = 0;
        this.field474 = 0;
        this.field471[0] = arg0;
        this.field431[0] = arg1;
        this.field470 = this.field471[0] * 128 + this.field452 * 64;
        this.field419 = this.field431[0] * 128 + this.field452 * 64;
    }

    @ObfuscatedName("ar.w(IZB)V")
    public final void method267(int arg0, boolean arg1) {
        int var3 = this.field471[0];
        int var4 = this.field431[0];
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
        if (this.field459 != -1 && class35.method708(this.field459).field900 == 1) {
            this.field459 = -1;
        }
        if (this.field466 < 9) {
            this.field466++;
        }
        for (int var5 = this.field466; var5 > 0; var5--) {
            this.field471[var5] = this.field471[var5 - 1];
            this.field431[var5] = this.field431[var5 - 1];
            this.field473[var5] = this.field473[var5 - 1];
        }
        this.field471[0] = var3;
        this.field431[0] = var4;
        this.field473[0] = arg1;
    }

    @ObfuscatedName("ar.p(I)V")
    public final void method274() {
        this.field466 = 0;
        this.field422 = 0;
    }

    @ObfuscatedName("ar.r(B)Z")
    public boolean method14() {
        return false;
    }

    @ObfuscatedName("ar.z(IIII)V")
    public final void method275(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field438[var4] <= arg2) {
                this.field444[var4] = arg0;
                this.field437[var4] = arg1;
                this.field438[var4] = arg2 + 70;
                return;
            }
        }
    }
}
