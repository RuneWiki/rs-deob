package deob;

@ObfuscatedName("o")
public abstract class class26 extends class93 {

    @ObfuscatedName("o.s")
    public int field433;

    @ObfuscatedName("o.f")
    public int field407;

    @ObfuscatedName("o.y")
    public int field440;

    @ObfuscatedName("o.t")
    public boolean field409 = false;

    @ObfuscatedName("o.r")
    public int field410 = 1;

    @ObfuscatedName("o.p")
    public int field445 = -1;

    @ObfuscatedName("o.o")
    public int field412 = -1;

    @ObfuscatedName("o.ax")
    public int field413 = -1;

    @ObfuscatedName("o.aa")
    public int field414 = -1;

    @ObfuscatedName("o.af")
    public int field459 = -1;

    @ObfuscatedName("o.al")
    public int field452 = -1;

    @ObfuscatedName("o.av")
    public int field406 = -1;

    @ObfuscatedName("o.ab")
    public int field418 = -1;

    @ObfuscatedName("o.ad")
    public String field419 = null;

    @ObfuscatedName("o.ai")
    public int field423 = 100;

    @ObfuscatedName("o.ak")
    public int field420 = 0;

    @ObfuscatedName("o.ao")
    public int field411 = 0;

    @ObfuscatedName("o.aj")
    public int[] field439 = new int[4];

    @ObfuscatedName("o.ag")
    public int[] field417 = new int[4];

    @ObfuscatedName("o.ap")
    public int[] field425 = new int[4];

    @ObfuscatedName("o.an")
    public int field426 = -1000;

    @ObfuscatedName("o.as")
    public int field427;

    @ObfuscatedName("o.au")
    public int field428;

    @ObfuscatedName("o.ay")
    public int field429 = -1;

    @ObfuscatedName("o.ah")
    public int field416 = 0;

    @ObfuscatedName("o.aw")
    public int field431 = 0;

    @ObfuscatedName("o.ac")
    public int field432 = -1;

    @ObfuscatedName("o.az")
    public int field444 = 0;

    @ObfuscatedName("o.am")
    public int field434 = 0;

    @ObfuscatedName("o.ae")
    public int field456 = -1;

    @ObfuscatedName("o.at")
    public int field436 = 0;

    @ObfuscatedName("o.ar")
    public int field435 = 0;

    @ObfuscatedName("o.bj")
    public int field438 = 0;

    @ObfuscatedName("o.bu")
    public int field424 = 0;

    @ObfuscatedName("o.bh")
    public int field415 = -1;

    @ObfuscatedName("o.bt")
    public int field441 = 0;

    @ObfuscatedName("o.bl")
    public int field442 = 0;

    @ObfuscatedName("o.bw")
    public int field443;

    @ObfuscatedName("o.bi")
    public int field450;

    @ObfuscatedName("o.bn")
    public int field422;

    @ObfuscatedName("o.bq")
    public int field446;

    @ObfuscatedName("o.bp")
    public int field447;

    @ObfuscatedName("o.bb")
    public int field448;

    @ObfuscatedName("o.bg")
    public int field449;

    @ObfuscatedName("o.br")
    public int field437;

    @ObfuscatedName("o.by")
    public int field451;

    @ObfuscatedName("o.ba")
    public int field453 = 0;

    @ObfuscatedName("o.bs")
    public int field408 = 200;

    @ObfuscatedName("o.bf")
    public int field454;

    @ObfuscatedName("o.bk")
    public int field455 = 0;

    @ObfuscatedName("o.bv")
    public int field463 = 32;

    @ObfuscatedName("o.bx")
    public int field457 = 0;

    @ObfuscatedName("o.bz")
    public int[] field458 = new int[10];

    @ObfuscatedName("o.bm")
    public int[] field421 = new int[10];

    @ObfuscatedName("o.bc")
    public boolean[] field460 = new boolean[10];

    @ObfuscatedName("o.bd")
    public int field461 = 0;

    @ObfuscatedName("o.be")
    public int field462 = 0;

    @ObfuscatedName("o.b(IIZB)V")
    public final void method228(int arg0, int arg1, boolean arg2) {
        if (this.field456 != -1 && Statics.method147(this.field456).field888 == 1) {
            this.field456 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field458[0];
            int var5 = arg1 - this.field421[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field457 < 9) {
                    this.field457++;
                }
                for (int var6 = this.field457; var6 > 0; var6--) {
                    this.field458[var6] = this.field458[var6 - 1];
                    this.field421[var6] = this.field421[var6 - 1];
                    this.field460[var6] = this.field460[var6 - 1];
                }
                this.field458[0] = arg0;
                this.field421[0] = arg1;
                this.field460[0] = false;
                return;
            }
        }
        this.field457 = 0;
        this.field462 = 0;
        this.field461 = 0;
        this.field458[0] = arg0;
        this.field421[0] = arg1;
        this.field433 = this.field458[0] * 128 + this.field410 * 64;
        this.field407 = this.field421[0] * 128 + this.field410 * 64;
    }

    @ObfuscatedName("o.c(IZI)V")
    public final void method229(int arg0, boolean arg1) {
        int var3 = this.field458[0];
        int var4 = this.field421[0];
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
        if (this.field456 != -1 && Statics.method147(this.field456).field888 == 1) {
            this.field456 = -1;
        }
        if (this.field457 < 9) {
            this.field457++;
        }
        for (int var5 = this.field457; var5 > 0; var5--) {
            this.field458[var5] = this.field458[var5 - 1];
            this.field421[var5] = this.field421[var5 - 1];
            this.field460[var5] = this.field460[var5 - 1];
        }
        this.field458[0] = var3;
        this.field421[0] = var4;
        this.field460[0] = arg1;
    }

    @ObfuscatedName("o.d(I)V")
    public final void method227() {
        this.field457 = 0;
        this.field462 = 0;
    }

    @ObfuscatedName("o.x(I)Z")
    public boolean method26() {
        return false;
    }

    @ObfuscatedName("o.h(IIII)V")
    public final void method231(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field425[var4] <= arg2) {
                this.field439[var4] = arg0;
                this.field417[var4] = arg1;
                this.field425[var4] = arg2 + 70;
                return;
            }
        }
    }
}
