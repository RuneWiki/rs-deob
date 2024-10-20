package deob;

@ObfuscatedName("aw")
public abstract class class27 extends class94 {

    @ObfuscatedName("aw.s")
    public int field418;

    @ObfuscatedName("aw.o")
    public int field398;

    @ObfuscatedName("aw.g")
    public int field399;

    @ObfuscatedName("aw.d")
    public boolean field400 = false;

    @ObfuscatedName("aw.t")
    public int field416 = 1;

    @ObfuscatedName("aw.b")
    public int field402 = -1;

    @ObfuscatedName("aw.c")
    public int field403 = -1;

    @ObfuscatedName("aw.aw")
    public int field404 = -1;

    @ObfuscatedName("aw.ap")
    public int field405 = -1;

    @ObfuscatedName("aw.am")
    public int field406 = -1;

    @ObfuscatedName("aw.az")
    public int field407 = -1;

    @ObfuscatedName("aw.ax")
    public int field408 = -1;

    @ObfuscatedName("aw.af")
    public int field409 = -1;

    @ObfuscatedName("aw.aa")
    public String field410 = null;

    @ObfuscatedName("aw.ag")
    public int field412 = 100;

    @ObfuscatedName("aw.aj")
    public int field397 = 0;

    @ObfuscatedName("aw.aq")
    public int field413 = 0;

    @ObfuscatedName("aw.ae")
    public int[] field414 = new int[4];

    @ObfuscatedName("aw.ar")
    public int[] field450 = new int[4];

    @ObfuscatedName("aw.ab")
    public int[] field461 = new int[4];

    @ObfuscatedName("aw.ay")
    public int field417 = -1000;

    @ObfuscatedName("aw.ac")
    public int field451;

    @ObfuscatedName("aw.ad")
    public int field419;

    @ObfuscatedName("aw.al")
    public int field420 = -1;

    @ObfuscatedName("aw.an")
    public int field424 = 0;

    @ObfuscatedName("aw.at")
    public int field422 = 0;

    @ObfuscatedName("aw.ak")
    public int field423 = -1;

    @ObfuscatedName("aw.as")
    public int field401 = 0;

    @ObfuscatedName("aw.ai")
    public int field425 = 0;

    @ObfuscatedName("aw.ao")
    public int field456 = -1;

    @ObfuscatedName("aw.av")
    public int field427 = 0;

    @ObfuscatedName("aw.au")
    public int field428 = 0;

    @ObfuscatedName("aw.bg")
    public int field429 = 0;

    @ObfuscatedName("aw.bl")
    public int field446 = 0;

    @ObfuscatedName("aw.bn")
    public int field415 = -1;

    @ObfuscatedName("aw.bh")
    public int field432 = 0;

    @ObfuscatedName("aw.bi")
    public int field433 = 0;

    @ObfuscatedName("aw.ba")
    public int field411;

    @ObfuscatedName("aw.bf")
    public int field435;

    @ObfuscatedName("aw.bd")
    public int field453;

    @ObfuscatedName("aw.bw")
    public int field437;

    @ObfuscatedName("aw.bj")
    public int field426;

    @ObfuscatedName("aw.by")
    public int field439;

    @ObfuscatedName("aw.be")
    public int field440;

    @ObfuscatedName("aw.bv")
    public int field438;

    @ObfuscatedName("aw.bk")
    public int field442;

    @ObfuscatedName("aw.bu")
    public int field434 = 0;

    @ObfuscatedName("aw.bc")
    public int field444 = 200;

    @ObfuscatedName("aw.bq")
    public int field445;

    @ObfuscatedName("aw.bp")
    public int field436 = 0;

    @ObfuscatedName("aw.br")
    public int field447 = 32;

    @ObfuscatedName("aw.bm")
    public int field448 = 0;

    @ObfuscatedName("aw.bx")
    public int[] field449 = new int[10];

    @ObfuscatedName("aw.bb")
    public int[] field460 = new int[10];

    @ObfuscatedName("aw.bs")
    public boolean[] field452 = new boolean[10];

    @ObfuscatedName("aw.bz")
    public int field430 = 0;

    @ObfuscatedName("aw.bo")
    public int field421 = 0;

    @ObfuscatedName("aw.v(IIZI)V")
    public final void method248(int arg0, int arg1, boolean arg2) {
        if (this.field456 != -1 && Statics.method1204(this.field456).field887 == 1) {
            this.field456 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field449[0];
            int var5 = arg1 - this.field460[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field448 < 9) {
                    this.field448++;
                }
                for (int var6 = this.field448; var6 > 0; var6--) {
                    this.field449[var6] = this.field449[var6 - 1];
                    this.field460[var6] = this.field460[var6 - 1];
                    this.field452[var6] = this.field452[var6 - 1];
                }
                this.field449[0] = arg0;
                this.field460[0] = arg1;
                this.field452[0] = false;
                return;
            }
        }
        this.field448 = 0;
        this.field421 = 0;
        this.field430 = 0;
        this.field449[0] = arg0;
        this.field460[0] = arg1;
        this.field418 = this.field449[0] * 128 + this.field416 * 64;
        this.field398 = this.field460[0] * 128 + this.field416 * 64;
    }

    @ObfuscatedName("aw.z(IZI)V")
    public final void method243(int arg0, boolean arg1) {
        int var3 = this.field449[0];
        int var4 = this.field460[0];
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
        if (this.field456 != -1 && Statics.method1204(this.field456).field887 == 1) {
            this.field456 = -1;
        }
        if (this.field448 < 9) {
            this.field448++;
        }
        for (int var5 = this.field448; var5 > 0; var5--) {
            this.field449[var5] = this.field449[var5 - 1];
            this.field460[var5] = this.field460[var5 - 1];
            this.field452[var5] = this.field452[var5 - 1];
        }
        this.field449[0] = var3;
        this.field460[0] = var4;
        this.field452[0] = arg1;
    }

    @ObfuscatedName("aw.m(B)V")
    public final void method245() {
        this.field448 = 0;
        this.field421 = 0;
    }

    @ObfuscatedName("aw.a(B)Z")
    public boolean method20() {
        return false;
    }

    @ObfuscatedName("aw.r(IIIB)V")
    public final void method246(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field461[var4] <= arg2) {
                this.field414[var4] = arg0;
                this.field450[var4] = arg1;
                this.field461[var4] = arg2 + 70;
                return;
            }
        }
    }
}
