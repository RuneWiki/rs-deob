package deob;

@ObfuscatedName("at")
public abstract class class27 extends class94 {

    @ObfuscatedName("at.j")
    public int field455;

    @ObfuscatedName("at.h")
    public int field411;

    @ObfuscatedName("at.m")
    public int field429;

    @ObfuscatedName("at.y")
    public boolean field423 = false;

    @ObfuscatedName("at.t")
    public int field443 = 1;

    @ObfuscatedName("at.k")
    public int field449 = -1;

    @ObfuscatedName("at.z")
    public int field416 = -1;

    @ObfuscatedName("at.at")
    public int field417 = -1;

    @ObfuscatedName("at.ay")
    public int field418 = -1;

    @ObfuscatedName("at.ae")
    public int field419 = -1;

    @ObfuscatedName("at.af")
    public int field420 = -1;

    @ObfuscatedName("at.ao")
    public int field421 = -1;

    @ObfuscatedName("at.ad")
    public int field422 = -1;

    @ObfuscatedName("at.aj")
    public String field410 = null;

    @ObfuscatedName("at.ah")
    public int field424 = 100;

    @ObfuscatedName("at.aq")
    public int field425 = 0;

    @ObfuscatedName("at.ar")
    public int field426 = 0;

    @ObfuscatedName("at.an")
    public int[] field434 = new int[4];

    @ObfuscatedName("at.ab")
    public int[] field428 = new int[4];

    @ObfuscatedName("at.ai")
    public int[] field438 = new int[4];

    @ObfuscatedName("at.ac")
    public int field431 = -1000;

    @ObfuscatedName("at.ak")
    public int field415;

    @ObfuscatedName("at.au")
    public int field432;

    @ObfuscatedName("at.am")
    public int field433 = -1;

    @ObfuscatedName("at.ag")
    public int field450 = 0;

    @ObfuscatedName("at.al")
    public int field467 = 0;

    @ObfuscatedName("at.av")
    public int field436 = -1;

    @ObfuscatedName("at.aw")
    public int field437 = 0;

    @ObfuscatedName("at.ax")
    public int field435 = 0;

    @ObfuscatedName("at.az")
    public int field439 = -1;

    @ObfuscatedName("at.ap")
    public int field440 = 0;

    @ObfuscatedName("at.as")
    public int field412 = 0;

    @ObfuscatedName("at.bp")
    public int field414 = 0;

    @ObfuscatedName("at.bs")
    public int field462 = 0;

    @ObfuscatedName("at.be")
    public int field444 = -1;

    @ObfuscatedName("at.ba")
    public int field465 = 0;

    @ObfuscatedName("at.bd")
    public int field446 = 0;

    @ObfuscatedName("at.bb")
    public int field447;

    @ObfuscatedName("at.bk")
    public int field448;

    @ObfuscatedName("at.bx")
    public int field456;

    @ObfuscatedName("at.bv")
    public int field469;

    @ObfuscatedName("at.bq")
    public int field451;

    @ObfuscatedName("at.bj")
    public int field452;

    @ObfuscatedName("at.bg")
    public int field453;

    @ObfuscatedName("at.bf")
    public int field454;

    @ObfuscatedName("at.bi")
    public int field427;

    @ObfuscatedName("at.br")
    public int field459 = 0;

    @ObfuscatedName("at.by")
    public int field457 = 200;

    @ObfuscatedName("at.bh")
    public int field458;

    @ObfuscatedName("at.bm")
    public int field441 = 0;

    @ObfuscatedName("at.bu")
    public int field460 = 32;

    @ObfuscatedName("at.bn")
    public int field461 = 0;

    @ObfuscatedName("at.bt")
    public int[] field430 = new int[10];

    @ObfuscatedName("at.bl")
    public int[] field463 = new int[10];

    @ObfuscatedName("at.bo")
    public boolean[] field464 = new boolean[10];

    @ObfuscatedName("at.bw")
    public int field445 = 0;

    @ObfuscatedName("at.bz")
    public int field466 = 0;

    @ObfuscatedName("at.d(IIZI)V")
    public final void method230(int arg0, int arg1, boolean arg2) {
        if (this.field439 != -1 && class34.method160(this.field439).field893 == 1) {
            this.field439 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field430[0];
            int var5 = arg1 - this.field463[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field461 < 9) {
                    this.field461++;
                }
                for (int var6 = this.field461; var6 > 0; var6--) {
                    this.field430[var6] = this.field430[var6 - 1];
                    this.field463[var6] = this.field463[var6 - 1];
                    this.field464[var6] = this.field464[var6 - 1];
                }
                this.field430[0] = arg0;
                this.field463[0] = arg1;
                this.field464[0] = false;
                return;
            }
        }
        this.field461 = 0;
        this.field466 = 0;
        this.field445 = 0;
        this.field430[0] = arg0;
        this.field463[0] = arg1;
        this.field455 = this.field430[0] * 128 + this.field443 * 64;
        this.field411 = this.field463[0] * 128 + this.field443 * 64;
    }

    @ObfuscatedName("at.a(IZB)V")
    public final void method231(int arg0, boolean arg1) {
        int var3 = this.field430[0];
        int var4 = this.field463[0];
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
        if (this.field439 != -1 && class34.method160(this.field439).field893 == 1) {
            this.field439 = -1;
        }
        if (this.field461 < 9) {
            this.field461++;
        }
        for (int var5 = this.field461; var5 > 0; var5--) {
            this.field430[var5] = this.field430[var5 - 1];
            this.field463[var5] = this.field463[var5 - 1];
            this.field464[var5] = this.field464[var5 - 1];
        }
        this.field430[0] = var3;
        this.field463[0] = var4;
        this.field464[0] = arg1;
    }

    @ObfuscatedName("at.q(I)V")
    public final void method234() {
        this.field461 = 0;
        this.field466 = 0;
    }

    @ObfuscatedName("at.o(I)Z")
    public boolean method36() {
        return false;
    }

    @ObfuscatedName("at.u(IIII)V")
    public final void method232(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field438[var4] <= arg2) {
                this.field434[var4] = arg0;
                this.field428[var4] = arg1;
                this.field438[var4] = arg2 + 70;
                return;
            }
        }
    }
}
