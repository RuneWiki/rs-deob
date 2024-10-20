package deob;

@ObfuscatedName("q")
public abstract class class26 extends class93 {

    @ObfuscatedName("q.f")
    public int field427;

    @ObfuscatedName("q.a")
    public int field411;

    @ObfuscatedName("q.x")
    public int field412;

    @ObfuscatedName("q.r")
    public boolean field413 = false;

    @ObfuscatedName("q.t")
    public int field414 = 1;

    @ObfuscatedName("q.b")
    public int field410 = -1;

    @ObfuscatedName("q.q")
    public int field442 = -1;

    @ObfuscatedName("q.ae")
    public int field417 = -1;

    @ObfuscatedName("q.at")
    public int field467 = -1;

    @ObfuscatedName("q.aj")
    public int field419 = -1;

    @ObfuscatedName("q.aq")
    public int field420 = -1;

    @ObfuscatedName("q.ac")
    public int field446 = -1;

    @ObfuscatedName("q.az")
    public int field422 = -1;

    @ObfuscatedName("q.ao")
    public String field423 = null;

    @ObfuscatedName("q.am")
    public int field463 = 100;

    @ObfuscatedName("q.ad")
    public int field425 = 0;

    @ObfuscatedName("q.an")
    public int field416 = 0;

    @ObfuscatedName("q.ab")
    public int[] field457 = new int[4];

    @ObfuscatedName("q.af")
    public int[] field428 = new int[4];

    @ObfuscatedName("q.ap")
    public int[] field466 = new int[4];

    @ObfuscatedName("q.as")
    public int field448 = -1000;

    @ObfuscatedName("q.av")
    public int field431;

    @ObfuscatedName("q.ay")
    public int field424;

    @ObfuscatedName("q.ah")
    public int field433 = -1;

    @ObfuscatedName("q.aa")
    public int field434 = 0;

    @ObfuscatedName("q.ag")
    public int field435 = 0;

    @ObfuscatedName("q.au")
    public int field436 = -1;

    @ObfuscatedName("q.aw")
    public int field437 = 0;

    @ObfuscatedName("q.ar")
    public int field438 = 0;

    @ObfuscatedName("q.ai")
    public int field439 = -1;

    @ObfuscatedName("q.ak")
    public int field440 = 0;

    @ObfuscatedName("q.ax")
    public int field460 = 0;

    @ObfuscatedName("q.bs")
    public int field418 = 0;

    @ObfuscatedName("q.bf")
    public int field443 = 0;

    @ObfuscatedName("q.bz")
    public int field444 = -1;

    @ObfuscatedName("q.br")
    public int field445 = 0;

    @ObfuscatedName("q.ba")
    public int field426 = 0;

    @ObfuscatedName("q.bn")
    public int field465;

    @ObfuscatedName("q.bo")
    public int field455;

    @ObfuscatedName("q.bq")
    public int field449;

    @ObfuscatedName("q.bd")
    public int field450;

    @ObfuscatedName("q.bl")
    public int field451;

    @ObfuscatedName("q.bu")
    public int field452;

    @ObfuscatedName("q.bg")
    public int field453;

    @ObfuscatedName("q.bb")
    public int field454;

    @ObfuscatedName("q.bj")
    public int field421;

    @ObfuscatedName("q.bm")
    public int field471 = 0;

    @ObfuscatedName("q.bp")
    public int field430 = 200;

    @ObfuscatedName("q.bv")
    public int field458;

    @ObfuscatedName("q.bx")
    public int field459 = 0;

    @ObfuscatedName("q.be")
    public int field429 = 32;

    @ObfuscatedName("q.bh")
    public int field441 = 0;

    @ObfuscatedName("q.bt")
    public int[] field462 = new int[10];

    @ObfuscatedName("q.by")
    public int[] field447 = new int[10];

    @ObfuscatedName("q.bk")
    public boolean[] field464 = new boolean[10];

    @ObfuscatedName("q.bi")
    public int field415 = 0;

    @ObfuscatedName("q.bc")
    public int field432 = 0;

    @ObfuscatedName("q.e(IIZI)V")
    public final void method234(int arg0, int arg1, boolean arg2) {
        if (this.field439 != -1 && class33.method751(this.field439).field886 == 1) {
            this.field439 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field462[0];
            int var5 = arg1 - this.field447[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field441 < 9) {
                    this.field441++;
                }
                for (int var6 = this.field441; var6 > 0; var6--) {
                    this.field462[var6] = this.field462[var6 - 1];
                    this.field447[var6] = this.field447[var6 - 1];
                    this.field464[var6] = this.field464[var6 - 1];
                }
                this.field462[0] = arg0;
                this.field447[0] = arg1;
                this.field464[0] = false;
                return;
            }
        }
        this.field441 = 0;
        this.field432 = 0;
        this.field415 = 0;
        this.field462[0] = arg0;
        this.field447[0] = arg1;
        this.field427 = this.field462[0] * 128 + this.field414 * 64;
        this.field411 = this.field447[0] * 128 + this.field414 * 64;
    }

    @ObfuscatedName("q.l(IZI)V")
    public final void method240(int arg0, boolean arg1) {
        int var3 = this.field462[0];
        int var4 = this.field447[0];
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
        if (this.field439 != -1 && class33.method751(this.field439).field886 == 1) {
            this.field439 = -1;
        }
        if (this.field441 < 9) {
            this.field441++;
        }
        for (int var5 = this.field441; var5 > 0; var5--) {
            this.field462[var5] = this.field462[var5 - 1];
            this.field447[var5] = this.field447[var5 - 1];
            this.field464[var5] = this.field464[var5 - 1];
        }
        this.field462[0] = var3;
        this.field447[0] = var4;
        this.field464[0] = arg1;
    }

    @ObfuscatedName("q.m(I)V")
    public final void method232() {
        this.field441 = 0;
        this.field432 = 0;
    }

    @ObfuscatedName("q.w(B)Z")
    public boolean method18() {
        return false;
    }

    @ObfuscatedName("q.s(IIII)V")
    public final void method238(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field466[var4] <= arg2) {
                this.field457[var4] = arg0;
                this.field428[var4] = arg1;
                this.field466[var4] = arg2 + 70;
                return;
            }
        }
    }
}
