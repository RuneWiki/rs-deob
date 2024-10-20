package deob;

@ObfuscatedName("c")
public abstract class class26 extends class93 {

    @ObfuscatedName("c.b")
    public int field441;

    @ObfuscatedName("c.h")
    public int field433;

    @ObfuscatedName("c.f")
    public int field417;

    @ObfuscatedName("c.v")
    public boolean field406 = false;

    @ObfuscatedName("c.u")
    public int field454 = 1;

    @ObfuscatedName("c.k")
    public int field429 = -1;

    @ObfuscatedName("c.c")
    public int field445 = -1;

    @ObfuscatedName("c.al")
    public int field410 = -1;

    @ObfuscatedName("c.ai")
    public int field407 = -1;

    @ObfuscatedName("c.ad")
    public int field412 = -1;

    @ObfuscatedName("c.aw")
    public int field413 = -1;

    @ObfuscatedName("c.af")
    public int field414 = -1;

    @ObfuscatedName("c.an")
    public int field438 = -1;

    @ObfuscatedName("c.ao")
    public String field416 = null;

    @ObfuscatedName("c.ak")
    public int field411 = 100;

    @ObfuscatedName("c.ah")
    public int field448 = 0;

    @ObfuscatedName("c.aq")
    public int field419 = 0;

    @ObfuscatedName("c.ag")
    public int[] field420 = new int[4];

    @ObfuscatedName("c.am")
    public int[] field421 = new int[4];

    @ObfuscatedName("c.at")
    public int[] field422 = new int[4];

    @ObfuscatedName("c.ae")
    public int field423 = -1000;

    @ObfuscatedName("c.ay")
    public int field424;

    @ObfuscatedName("c.as")
    public int field462;

    @ObfuscatedName("c.ar")
    public int field426 = -1;

    @ObfuscatedName("c.aj")
    public int field408 = 0;

    @ObfuscatedName("c.av")
    public int field428 = 0;

    @ObfuscatedName("c.az")
    public int field409 = -1;

    @ObfuscatedName("c.aa")
    public int field430 = 0;

    @ObfuscatedName("c.au")
    public int field431 = 0;

    @ObfuscatedName("c.ac")
    public int field432 = -1;

    @ObfuscatedName("c.ap")
    public int field435 = 0;

    @ObfuscatedName("c.ab")
    public int field434 = 0;

    @ObfuscatedName("c.bu")
    public int field418 = 0;

    @ObfuscatedName("c.bc")
    public int field436 = 0;

    @ObfuscatedName("c.br")
    public int field437 = -1;

    @ObfuscatedName("c.bo")
    public int field459 = 0;

    @ObfuscatedName("c.bb")
    public int field439 = 0;

    @ObfuscatedName("c.bt")
    public int field440;

    @ObfuscatedName("c.bw")
    public int field444;

    @ObfuscatedName("c.bk")
    public int field442;

    @ObfuscatedName("c.bx")
    public int field443;

    @ObfuscatedName("c.bf")
    public int field404;

    @ObfuscatedName("c.bl")
    public int field458;

    @ObfuscatedName("c.bv")
    public int field446;

    @ObfuscatedName("c.ba")
    public int field447;

    @ObfuscatedName("c.bp")
    public int field403;

    @ObfuscatedName("c.be")
    public int field449 = 0;

    @ObfuscatedName("c.bs")
    public int field427 = 200;

    @ObfuscatedName("c.bh")
    public int field451;

    @ObfuscatedName("c.by")
    public int field452 = 0;

    @ObfuscatedName("c.bz")
    public int field453 = 32;

    @ObfuscatedName("c.bj")
    public int field450 = 0;

    @ObfuscatedName("c.bg")
    public int[] field405 = new int[10];

    @ObfuscatedName("c.bq")
    public int[] field456 = new int[10];

    @ObfuscatedName("c.bm")
    public boolean[] field457 = new boolean[10];

    @ObfuscatedName("c.bn")
    public int field425 = 0;

    @ObfuscatedName("c.bi")
    public int field415 = 0;

    @ObfuscatedName("c.t(IIZI)V")
    public final void method226(int arg0, int arg1, boolean arg2) {
        if (this.field432 != -1 && class33.method224(this.field432).field880 == 1) {
            this.field432 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field405[0];
            int var5 = arg1 - this.field456[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field450 < 9) {
                    this.field450++;
                }
                for (int var6 = this.field450; var6 > 0; var6--) {
                    this.field405[var6] = this.field405[var6 - 1];
                    this.field456[var6] = this.field456[var6 - 1];
                    this.field457[var6] = this.field457[var6 - 1];
                }
                this.field405[0] = arg0;
                this.field456[0] = arg1;
                this.field457[0] = false;
                return;
            }
        }
        this.field450 = 0;
        this.field415 = 0;
        this.field425 = 0;
        this.field405[0] = arg0;
        this.field456[0] = arg1;
        this.field441 = this.field405[0] * 128 + this.field454 * 64;
        this.field433 = this.field456[0] * 128 + this.field454 * 64;
    }

    @ObfuscatedName("c.w(IZI)V")
    public final void method246(int arg0, boolean arg1) {
        int var3 = this.field405[0];
        int var4 = this.field456[0];
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
        if (this.field432 != -1 && class33.method224(this.field432).field880 == 1) {
            this.field432 = -1;
        }
        if (this.field450 < 9) {
            this.field450++;
        }
        for (int var5 = this.field450; var5 > 0; var5--) {
            this.field405[var5] = this.field405[var5 - 1];
            this.field456[var5] = this.field456[var5 - 1];
            this.field457[var5] = this.field457[var5 - 1];
        }
        this.field405[0] = var3;
        this.field456[0] = var4;
        this.field457[0] = arg1;
    }

    @ObfuscatedName("c.r(I)V")
    public final void method228() {
        this.field450 = 0;
        this.field415 = 0;
    }

    @ObfuscatedName("c.n(I)Z")
    public boolean method18() {
        return false;
    }

    @ObfuscatedName("c.a(IIII)V")
    public final void method230(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field422[var4] <= arg2) {
                this.field420[var4] = arg0;
                this.field421[var4] = arg1;
                this.field422[var4] = arg2 + 70;
                return;
            }
        }
    }
}
