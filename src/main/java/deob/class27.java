package deob;

@ObfuscatedName("aw")
public abstract class class27 extends class94 {

    @ObfuscatedName("aw.w")
    public int field418;

    @ObfuscatedName("aw.z")
    public int field412;

    @ObfuscatedName("aw.p")
    public int field413;

    @ObfuscatedName("aw.v")
    public boolean field414 = false;

    @ObfuscatedName("aw.d")
    public int field458 = 1;

    @ObfuscatedName("aw.e")
    public int field416 = -1;

    @ObfuscatedName("aw.y")
    public int field437 = -1;

    @ObfuscatedName("aw.aw")
    public int field415 = -1;

    @ObfuscatedName("aw.ai")
    public int field439 = -1;

    @ObfuscatedName("aw.ah")
    public int field420 = -1;

    @ObfuscatedName("aw.ad")
    public int field450 = -1;

    @ObfuscatedName("aw.ak")
    public int field422 = -1;

    @ObfuscatedName("aw.ap")
    public int field456 = -1;

    @ObfuscatedName("aw.al")
    public String field451 = null;

    @ObfuscatedName("aw.am")
    public int field426 = 100;

    @ObfuscatedName("aw.ab")
    public int field424 = 0;

    @ObfuscatedName("aw.ax")
    public int field427 = 0;

    @ObfuscatedName("aw.at")
    public int[] field417 = new int[4];

    @ObfuscatedName("aw.as")
    public int[] field429 = new int[4];

    @ObfuscatedName("aw.aj")
    public int[] field430 = new int[4];

    @ObfuscatedName("aw.aa")
    public int field431 = -1000;

    @ObfuscatedName("aw.au")
    public int field432;

    @ObfuscatedName("aw.ae")
    public int field433;

    @ObfuscatedName("aw.ao")
    public int field434 = -1;

    @ObfuscatedName("aw.af")
    public int field435 = 0;

    @ObfuscatedName("aw.ar")
    public int field436 = 0;

    @ObfuscatedName("aw.ay")
    public int field419 = -1;

    @ObfuscatedName("aw.av")
    public int field438 = 0;

    @ObfuscatedName("aw.ac")
    public int field421 = 0;

    @ObfuscatedName("aw.aq")
    public int field440 = -1;

    @ObfuscatedName("aw.ag")
    public int field441 = 0;

    @ObfuscatedName("aw.an")
    public int field442 = 0;

    @ObfuscatedName("aw.by")
    public int field443 = 0;

    @ObfuscatedName("aw.ba")
    public int field444 = 0;

    @ObfuscatedName("aw.bb")
    public int field445 = -1;

    @ObfuscatedName("aw.br")
    public int field446 = 0;

    @ObfuscatedName("aw.bz")
    public int field447 = 0;

    @ObfuscatedName("aw.bl")
    public int field448;

    @ObfuscatedName("aw.bo")
    public int field449;

    @ObfuscatedName("aw.bm")
    public int field425;

    @ObfuscatedName("aw.bh")
    public int field453;

    @ObfuscatedName("aw.bu")
    public int field452;

    @ObfuscatedName("aw.bx")
    public int field457;

    @ObfuscatedName("aw.bv")
    public int field454;

    @ObfuscatedName("aw.bt")
    public int field423;

    @ObfuscatedName("aw.be")
    public int field411;

    @ObfuscatedName("aw.bi")
    public int field468 = 0;

    @ObfuscatedName("aw.bw")
    public int field455 = 200;

    @ObfuscatedName("aw.bd")
    public int field459;

    @ObfuscatedName("aw.bp")
    public int field460 = 0;

    @ObfuscatedName("aw.bk")
    public int field461 = 32;

    @ObfuscatedName("aw.bj")
    public int field462 = 0;

    @ObfuscatedName("aw.bc")
    public int[] field463 = new int[10];

    @ObfuscatedName("aw.bn")
    public int[] field464 = new int[10];

    @ObfuscatedName("aw.bg")
    public boolean[] field465 = new boolean[10];

    @ObfuscatedName("aw.bs")
    public int field466 = 0;

    @ObfuscatedName("aw.bf")
    public int field467 = 0;

    @ObfuscatedName("aw.b(IIZS)V")
    public final void method229(int arg0, int arg1, boolean arg2) {
        if (this.field440 != -1 && class34.method612(this.field440).field883 == 1) {
            this.field440 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field463[0];
            int var5 = arg1 - this.field464[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field462 < 9) {
                    this.field462++;
                }
                for (int var6 = this.field462; var6 > 0; var6--) {
                    this.field463[var6] = this.field463[var6 - 1];
                    this.field464[var6] = this.field464[var6 - 1];
                    this.field465[var6] = this.field465[var6 - 1];
                }
                this.field463[0] = arg0;
                this.field464[0] = arg1;
                this.field465[0] = false;
                return;
            }
        }
        this.field462 = 0;
        this.field467 = 0;
        this.field466 = 0;
        this.field463[0] = arg0;
        this.field464[0] = arg1;
        this.field418 = this.field463[0] * 128 + this.field458 * 64;
        this.field412 = this.field464[0] * 128 + this.field458 * 64;
    }

    @ObfuscatedName("aw.m(IZB)V")
    public final void method230(int arg0, boolean arg1) {
        int var3 = this.field463[0];
        int var4 = this.field464[0];
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
        if (this.field440 != -1 && class34.method612(this.field440).field883 == 1) {
            this.field440 = -1;
        }
        if (this.field462 < 9) {
            this.field462++;
        }
        for (int var5 = this.field462; var5 > 0; var5--) {
            this.field463[var5] = this.field463[var5 - 1];
            this.field464[var5] = this.field464[var5 - 1];
            this.field465[var5] = this.field465[var5 - 1];
        }
        this.field463[0] = var3;
        this.field464[0] = var4;
        this.field465[0] = arg1;
    }

    @ObfuscatedName("aw.g(I)V")
    public final void method248() {
        this.field462 = 0;
        this.field467 = 0;
    }

    @ObfuscatedName("aw.o(I)Z")
    public boolean method18() {
        return false;
    }

    @ObfuscatedName("aw.x(IIII)V")
    public final void method232(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field430[var4] <= arg2) {
                this.field417[var4] = arg0;
                this.field429[var4] = arg1;
                this.field430[var4] = arg2 + 70;
                return;
            }
        }
    }
}
