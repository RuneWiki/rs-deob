package deob;

@ObfuscatedName("s")
public abstract class class26 extends class93 {

    @ObfuscatedName("s.y")
    public int field448;

    @ObfuscatedName("s.a")
    public int field410;

    @ObfuscatedName("s.r")
    public int field411;

    @ObfuscatedName("s.x")
    public boolean field437 = false;

    @ObfuscatedName("s.w")
    public int field413 = 1;

    @ObfuscatedName("s.j")
    public int field430 = -1;

    @ObfuscatedName("s.s")
    public int field415 = -1;

    @ObfuscatedName("s.au")
    public int field416 = -1;

    @ObfuscatedName("s.ay")
    public int field417 = -1;

    @ObfuscatedName("s.ar")
    public int field449 = -1;

    @ObfuscatedName("s.aj")
    public int field419 = -1;

    @ObfuscatedName("s.ad")
    public int field420 = -1;

    @ObfuscatedName("s.at")
    public int field421 = -1;

    @ObfuscatedName("s.as")
    public String field422 = null;

    @ObfuscatedName("s.aw")
    public int field409 = 100;

    @ObfuscatedName("s.ax")
    public int field424 = 0;

    @ObfuscatedName("s.am")
    public int field418 = 0;

    @ObfuscatedName("s.ap")
    public int[] field426 = new int[4];

    @ObfuscatedName("s.ae")
    public int[] field427 = new int[4];

    @ObfuscatedName("s.av")
    public int[] field428 = new int[4];

    @ObfuscatedName("s.ac")
    public int field429 = -1000;

    @ObfuscatedName("s.ai")
    public int field457;

    @ObfuscatedName("s.ak")
    public int field431;

    @ObfuscatedName("s.ag")
    public int field432 = -1;

    @ObfuscatedName("s.ah")
    public int field425 = 0;

    @ObfuscatedName("s.af")
    public int field434 = 0;

    @ObfuscatedName("s.aa")
    public int field435 = -1;

    @ObfuscatedName("s.ab")
    public int field436 = 0;

    @ObfuscatedName("s.ao")
    public int field412 = 0;

    @ObfuscatedName("s.al")
    public int field438 = -1;

    @ObfuscatedName("s.aq")
    public int field439 = 0;

    @ObfuscatedName("s.az")
    public int field447 = 0;

    @ObfuscatedName("s.bv")
    public int field440 = 0;

    @ObfuscatedName("s.bh")
    public int field442 = 0;

    @ObfuscatedName("s.bp")
    public int field443 = -1;

    @ObfuscatedName("s.bt")
    public int field464 = 0;

    @ObfuscatedName("s.bu")
    public int field445 = 0;

    @ObfuscatedName("s.bc")
    public int field446;

    @ObfuscatedName("s.bw")
    public int field414;

    @ObfuscatedName("s.bj")
    public int field441;

    @ObfuscatedName("s.bl")
    public int field423;

    @ObfuscatedName("s.be")
    public int field465;

    @ObfuscatedName("s.bz")
    public int field451;

    @ObfuscatedName("s.bm")
    public int field461;

    @ObfuscatedName("s.bs")
    public int field453;

    @ObfuscatedName("s.br")
    public int field452;

    @ObfuscatedName("s.bi")
    public int field455 = 0;

    @ObfuscatedName("s.bd")
    public int field456 = 200;

    @ObfuscatedName("s.bg")
    public int field462;

    @ObfuscatedName("s.ba")
    public int field458 = 0;

    @ObfuscatedName("s.bo")
    public int field459 = 32;

    @ObfuscatedName("s.bn")
    public int field460 = 0;

    @ObfuscatedName("s.bb")
    public int[] field444 = new int[10];

    @ObfuscatedName("s.bx")
    public int[] field450 = new int[10];

    @ObfuscatedName("s.bq")
    public boolean[] field463 = new boolean[10];

    @ObfuscatedName("s.bf")
    public int field433 = 0;

    @ObfuscatedName("s.by")
    public int field454 = 0;

    @ObfuscatedName("s.o(IIZB)V")
    public final void method236(int arg0, int arg1, boolean arg2) {
        if (this.field438 != -1 && class33.method2674(this.field438).field896 == 1) {
            this.field438 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field444[0];
            int var5 = arg1 - this.field450[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field460 < 9) {
                    this.field460++;
                }
                for (int var6 = this.field460; var6 > 0; var6--) {
                    this.field444[var6] = this.field444[var6 - 1];
                    this.field450[var6] = this.field450[var6 - 1];
                    this.field463[var6] = this.field463[var6 - 1];
                }
                this.field444[0] = arg0;
                this.field450[0] = arg1;
                this.field463[0] = false;
                return;
            }
        }
        this.field460 = 0;
        this.field454 = 0;
        this.field433 = 0;
        this.field444[0] = arg0;
        this.field450[0] = arg1;
        this.field448 = this.field444[0] * 128 + this.field413 * 64;
        this.field410 = this.field450[0] * 128 + this.field413 * 64;
    }

    @ObfuscatedName("s.b(IZB)V")
    public final void method251(int arg0, boolean arg1) {
        int var3 = this.field444[0];
        int var4 = this.field450[0];
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
        if (this.field438 != -1 && class33.method2674(this.field438).field896 == 1) {
            this.field438 = -1;
        }
        if (this.field460 < 9) {
            this.field460++;
        }
        for (int var5 = this.field460; var5 > 0; var5--) {
            this.field444[var5] = this.field444[var5 - 1];
            this.field450[var5] = this.field450[var5 - 1];
            this.field463[var5] = this.field463[var5 - 1];
        }
        this.field444[0] = var3;
        this.field450[0] = var4;
        this.field463[0] = arg1;
    }

    @ObfuscatedName("s.d(B)V")
    public final void method238() {
        this.field460 = 0;
        this.field454 = 0;
    }

    @ObfuscatedName("s.c(B)Z")
    public boolean method16() {
        return false;
    }

    @ObfuscatedName("s.k(IIIB)V")
    public final void method239(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field428[var4] <= arg2) {
                this.field426[var4] = arg0;
                this.field427[var4] = arg1;
                this.field428[var4] = arg2 + 70;
                return;
            }
        }
    }
}
