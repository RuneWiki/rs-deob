package deob;

@ObfuscatedName("at")
public abstract class class27 extends class94 {

    @ObfuscatedName("at.k")
    public int field443;

    @ObfuscatedName("at.p")
    public int field408;

    @ObfuscatedName("at.s")
    public int field453;

    @ObfuscatedName("at.m")
    public boolean field410 = false;

    @ObfuscatedName("at.c")
    public int field411 = 1;

    @ObfuscatedName("at.i")
    public int field444 = -1;

    @ObfuscatedName("at.u")
    public int field434 = -1;

    @ObfuscatedName("at.at")
    public int field409 = -1;

    @ObfuscatedName("at.as")
    public int field415 = -1;

    @ObfuscatedName("at.ax")
    public int field413 = -1;

    @ObfuscatedName("at.ao")
    public int field422 = -1;

    @ObfuscatedName("at.aq")
    public int field418 = -1;

    @ObfuscatedName("at.am")
    public int field419 = -1;

    @ObfuscatedName("at.al")
    public String field420 = null;

    @ObfuscatedName("at.ab")
    public int field455 = 100;

    @ObfuscatedName("at.aw")
    public int field463 = 0;

    @ObfuscatedName("at.ah")
    public int field423 = 0;

    @ObfuscatedName("at.ay")
    public int[] field425 = new int[4];

    @ObfuscatedName("at.ak")
    public int[] field442 = new int[4];

    @ObfuscatedName("at.az")
    public int[] field426 = new int[4];

    @ObfuscatedName("at.ap")
    public int field428 = -1000;

    @ObfuscatedName("at.af")
    public int field429;

    @ObfuscatedName("at.au")
    public int field407;

    @ObfuscatedName("at.an")
    public int field431 = -1;

    @ObfuscatedName("at.av")
    public int field432 = 0;

    @ObfuscatedName("at.ac")
    public int field433 = 0;

    @ObfuscatedName("at.ae")
    public int field448 = -1;

    @ObfuscatedName("at.ai")
    public int field435 = 0;

    @ObfuscatedName("at.ag")
    public int field436 = 0;

    @ObfuscatedName("at.aj")
    public int field437 = -1;

    @ObfuscatedName("at.ad")
    public int field438 = 0;

    @ObfuscatedName("at.ar")
    public int field439 = 0;

    @ObfuscatedName("at.bu")
    public int field440 = 0;

    @ObfuscatedName("at.bl")
    public int field441 = 0;

    @ObfuscatedName("at.bj")
    public int field414 = -1;

    @ObfuscatedName("at.bi")
    public int field416 = 0;

    @ObfuscatedName("at.bx")
    public int field450 = 0;

    @ObfuscatedName("at.bh")
    public int field445;

    @ObfuscatedName("at.br")
    public int field427;

    @ObfuscatedName("at.bn")
    public int field447;

    @ObfuscatedName("at.bo")
    public int field446;

    @ObfuscatedName("at.bf")
    public int field417;

    @ObfuscatedName("at.bv")
    public int field449;

    @ObfuscatedName("at.bd")
    public int field451;

    @ObfuscatedName("at.bt")
    public int field452;

    @ObfuscatedName("at.be")
    public int field421;

    @ObfuscatedName("at.bq")
    public int field454 = 0;

    @ObfuscatedName("at.ba")
    public int field412 = 200;

    @ObfuscatedName("at.bp")
    public int field456;

    @ObfuscatedName("at.bm")
    public int field457 = 0;

    @ObfuscatedName("at.bg")
    public int field458 = 32;

    @ObfuscatedName("at.bw")
    public int field459 = 0;

    @ObfuscatedName("at.bc")
    public int[] field460 = new int[10];

    @ObfuscatedName("at.bs")
    public int[] field461 = new int[10];

    @ObfuscatedName("at.by")
    public boolean[] field462 = new boolean[10];

    @ObfuscatedName("at.bk")
    public int field430 = 0;

    @ObfuscatedName("at.bz")
    public int field464 = 0;

    @ObfuscatedName("at.q(IIZI)V")
    public final void method245(int arg0, int arg1, boolean arg2) {
        if (this.field437 != -1 && class34.method215(this.field437).field865 == 1) {
            this.field437 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field460[0];
            int var5 = arg1 - this.field461[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field459 < 9) {
                    this.field459++;
                }
                for (int var6 = this.field459; var6 > 0; var6--) {
                    this.field460[var6] = this.field460[var6 - 1];
                    this.field461[var6] = this.field461[var6 - 1];
                    this.field462[var6] = this.field462[var6 - 1];
                }
                this.field460[0] = arg0;
                this.field461[0] = arg1;
                this.field462[0] = false;
                return;
            }
        }
        this.field459 = 0;
        this.field464 = 0;
        this.field430 = 0;
        this.field460[0] = arg0;
        this.field461[0] = arg1;
        this.field443 = this.field460[0] * 128 + this.field411 * 64;
        this.field408 = this.field461[0] * 128 + this.field411 * 64;
    }

    @ObfuscatedName("at.l(IZB)V")
    public final void method247(int arg0, boolean arg1) {
        int var3 = this.field460[0];
        int var4 = this.field461[0];
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
        if (this.field437 != -1 && class34.method215(this.field437).field865 == 1) {
            this.field437 = -1;
        }
        if (this.field459 < 9) {
            this.field459++;
        }
        for (int var5 = this.field459; var5 > 0; var5--) {
            this.field460[var5] = this.field460[var5 - 1];
            this.field461[var5] = this.field461[var5 - 1];
            this.field462[var5] = this.field462[var5 - 1];
        }
        this.field460[0] = var3;
        this.field461[0] = var4;
        this.field462[0] = arg1;
    }

    @ObfuscatedName("at.d(B)V")
    public final void method240() {
        this.field459 = 0;
        this.field464 = 0;
    }

    @ObfuscatedName("at.g(B)Z")
    public boolean method16() {
        return false;
    }

    @ObfuscatedName("at.z(IIIS)V")
    public final void method244(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field426[var4] <= arg2) {
                this.field425[var4] = arg0;
                this.field442[var4] = arg1;
                this.field426[var4] = arg2 + 70;
                return;
            }
        }
    }
}
