package deob;

@ObfuscatedName("az")
public abstract class class27 extends class94 {

    @ObfuscatedName("az.s")
    public int field462;

    @ObfuscatedName("az.t")
    public int field470;

    @ObfuscatedName("az.r")
    public int field476;

    @ObfuscatedName("az.w")
    public boolean field422 = false;

    @ObfuscatedName("az.x")
    public int field423 = 1;

    @ObfuscatedName("az.n")
    public int field424 = -1;

    @ObfuscatedName("az.c")
    public int field469 = -1;

    @ObfuscatedName("az.az")
    public int field421 = -1;

    @ObfuscatedName("az.ax")
    public int field427 = -1;

    @ObfuscatedName("az.aq")
    public int field428 = -1;

    @ObfuscatedName("az.ap")
    public int field425 = -1;

    @ObfuscatedName("az.aa")
    public int field419 = -1;

    @ObfuscatedName("az.ai")
    public int field431 = -1;

    @ObfuscatedName("az.ar")
    public String field460 = null;

    @ObfuscatedName("az.ag")
    public int field420 = 100;

    @ObfuscatedName("az.as")
    public int field434 = 0;

    @ObfuscatedName("az.ak")
    public int field426 = 0;

    @ObfuscatedName("az.am")
    public int[] field436 = new int[4];

    @ObfuscatedName("az.ao")
    public int[] field438 = new int[4];

    @ObfuscatedName("az.ah")
    public int[] field435 = new int[4];

    @ObfuscatedName("az.aw")
    public int field439 = -1000;

    @ObfuscatedName("az.av")
    public int field477;

    @ObfuscatedName("az.au")
    public int field432;

    @ObfuscatedName("az.af")
    public int field442 = -1;

    @ObfuscatedName("az.ab")
    public int field443 = 0;

    @ObfuscatedName("az.aj")
    public int field444 = 0;

    @ObfuscatedName("az.ac")
    public int field445 = -1;

    @ObfuscatedName("az.ay")
    public int field433 = 0;

    @ObfuscatedName("az.ae")
    public int field447 = 0;

    @ObfuscatedName("az.ad")
    public int field452 = -1;

    @ObfuscatedName("az.an")
    public int field449 = 0;

    @ObfuscatedName("az.at")
    public int field450 = 0;

    @ObfuscatedName("az.bu")
    public int field451 = 0;

    @ObfuscatedName("az.bt")
    public int field441 = 0;

    @ObfuscatedName("az.bm")
    public int field453 = -1;

    @ObfuscatedName("az.bf")
    public int field454 = 0;

    @ObfuscatedName("az.bn")
    public int field463 = 0;

    @ObfuscatedName("az.bw")
    public int field456;

    @ObfuscatedName("az.bd")
    public int field457;

    @ObfuscatedName("az.ba")
    public int field458;

    @ObfuscatedName("az.bk")
    public int field459;

    @ObfuscatedName("az.bz")
    public int field429;

    @ObfuscatedName("az.bh")
    public int field461;

    @ObfuscatedName("az.bp")
    public int field466;

    @ObfuscatedName("az.bg")
    public int field448;

    @ObfuscatedName("az.bx")
    public int field464;

    @ObfuscatedName("az.bi")
    public int field465 = 0;

    @ObfuscatedName("az.bq")
    public int field473 = 200;

    @ObfuscatedName("az.bc")
    public int field467;

    @ObfuscatedName("az.bs")
    public int field468 = 0;

    @ObfuscatedName("az.bb")
    public int field440 = 32;

    @ObfuscatedName("az.be")
    public int field455 = 0;

    @ObfuscatedName("az.by")
    public int[] field471 = new int[10];

    @ObfuscatedName("az.bl")
    public int[] field472 = new int[10];

    @ObfuscatedName("az.bo")
    public boolean[] field437 = new boolean[10];

    @ObfuscatedName("az.bv")
    public int field474 = 0;

    @ObfuscatedName("az.bj")
    public int field475 = 0;

    @ObfuscatedName("az.m(IIZB)V")
    public final void method262(int arg0, int arg1, boolean arg2) {
        if (this.field452 != -1 && class34.method763(this.field452).field896 == 1) {
            this.field452 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field471[0];
            int var5 = arg1 - this.field472[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field455 < 9) {
                    this.field455++;
                }
                for (int var6 = this.field455; var6 > 0; var6--) {
                    this.field471[var6] = this.field471[var6 - 1];
                    this.field472[var6] = this.field472[var6 - 1];
                    this.field437[var6] = this.field437[var6 - 1];
                }
                this.field471[0] = arg0;
                this.field472[0] = arg1;
                this.field437[0] = false;
                return;
            }
        }
        this.field455 = 0;
        this.field475 = 0;
        this.field474 = 0;
        this.field471[0] = arg0;
        this.field472[0] = arg1;
        this.field462 = this.field471[0] * 128 + this.field423 * 64;
        this.field470 = this.field472[0] * 128 + this.field423 * 64;
    }

    @ObfuscatedName("az.v(IZB)V")
    public final void method256(int arg0, boolean arg1) {
        int var3 = this.field471[0];
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
        if (this.field452 != -1 && class34.method763(this.field452).field896 == 1) {
            this.field452 = -1;
        }
        if (this.field455 < 9) {
            this.field455++;
        }
        for (int var5 = this.field455; var5 > 0; var5--) {
            this.field471[var5] = this.field471[var5 - 1];
            this.field472[var5] = this.field472[var5 - 1];
            this.field437[var5] = this.field437[var5 - 1];
        }
        this.field471[0] = var3;
        this.field472[0] = var4;
        this.field437[0] = arg1;
    }

    @ObfuscatedName("az.j(I)V")
    public final void method270() {
        this.field455 = 0;
        this.field475 = 0;
    }

    @ObfuscatedName("az.a(I)Z")
    public boolean method18() {
        return false;
    }

    @ObfuscatedName("az.f(IIII)V")
    public final void method271(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field435[var4] <= arg2) {
                this.field436[var4] = arg0;
                this.field438[var4] = arg1;
                this.field435[var4] = arg2 + 70;
                return;
            }
        }
    }
}
