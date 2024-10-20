package deob;

@ObfuscatedName("av")
public abstract class class27 extends class94 {

    @ObfuscatedName("av.m")
    public int field444;

    @ObfuscatedName("av.f")
    public int field420;

    @ObfuscatedName("av.a")
    public int field431;

    @ObfuscatedName("av.h")
    public boolean field422 = false;

    @ObfuscatedName("av.p")
    public int field423 = 1;

    @ObfuscatedName("av.e")
    public int field424 = -1;

    @ObfuscatedName("av.r")
    public int field464 = -1;

    @ObfuscatedName("av.av")
    public int field426 = -1;

    @ObfuscatedName("av.an")
    public int field427 = -1;

    @ObfuscatedName("av.ae")
    public int field428 = -1;

    @ObfuscatedName("av.au")
    public int field449 = -1;

    @ObfuscatedName("av.ag")
    public int field442 = -1;

    @ObfuscatedName("av.at")
    public int field434 = -1;

    @ObfuscatedName("av.ac")
    public String field432 = null;

    @ObfuscatedName("av.aw")
    public int field433 = 100;

    @ObfuscatedName("av.ah")
    public int field421 = 0;

    @ObfuscatedName("av.ai")
    public int field435 = 0;

    @ObfuscatedName("av.ad")
    public int[] field436 = new int[4];

    @ObfuscatedName("av.ay")
    public int[] field430 = new int[4];

    @ObfuscatedName("av.az")
    public int[] field438 = new int[4];

    @ObfuscatedName("av.ab")
    public int field439 = -1000;

    @ObfuscatedName("av.am")
    public int field441;

    @ObfuscatedName("av.as")
    public int field456;

    @ObfuscatedName("av.aa")
    public int field452 = -1;

    @ObfuscatedName("av.af")
    public int field419 = 0;

    @ObfuscatedName("av.ax")
    public int field440 = 0;

    @ObfuscatedName("av.aq")
    public int field445 = -1;

    @ObfuscatedName("av.ao")
    public int field446 = 0;

    @ObfuscatedName("av.ar")
    public int field463 = 0;

    @ObfuscatedName("av.aj")
    public int field448 = -1;

    @ObfuscatedName("av.al")
    public int field425 = 0;

    @ObfuscatedName("av.ak")
    public int field450 = 0;

    @ObfuscatedName("av.bj")
    public int field451 = 0;

    @ObfuscatedName("av.bk")
    public int field470 = 0;

    @ObfuscatedName("av.bm")
    public int field453 = -1;

    @ObfuscatedName("av.bq")
    public int field454 = 0;

    @ObfuscatedName("av.bh")
    public int field455 = 0;

    @ObfuscatedName("av.bo")
    public int field429;

    @ObfuscatedName("av.bx")
    public int field457;

    @ObfuscatedName("av.bw")
    public int field458;

    @ObfuscatedName("av.bz")
    public int field459;

    @ObfuscatedName("av.bb")
    public int field460;

    @ObfuscatedName("av.bl")
    public int field461;

    @ObfuscatedName("av.bf")
    public int field462;

    @ObfuscatedName("av.ba")
    public int field437;

    @ObfuscatedName("av.br")
    public int field443;

    @ObfuscatedName("av.bc")
    public int field465 = 0;

    @ObfuscatedName("av.bd")
    public int field466 = 200;

    @ObfuscatedName("av.bu")
    public int field467;

    @ObfuscatedName("av.bi")
    public int field468 = 0;

    @ObfuscatedName("av.bv")
    public int field469 = 32;

    @ObfuscatedName("av.bp")
    public int field475 = 0;

    @ObfuscatedName("av.bt")
    public int[] field471 = new int[10];

    @ObfuscatedName("av.bg")
    public int[] field472 = new int[10];

    @ObfuscatedName("av.by")
    public boolean[] field473 = new boolean[10];

    @ObfuscatedName("av.bn")
    public int field474 = 0;

    @ObfuscatedName("av.bs")
    public int field447 = 0;

    @ObfuscatedName("av.y(IIZB)V")
    public final void method251(int arg0, int arg1, boolean arg2) {
        if (this.field448 != -1 && Statics.method61(this.field448).field898 == 1) {
            this.field448 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field471[0];
            int var5 = arg1 - this.field472[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field475 < 9) {
                    this.field475++;
                }
                for (int var6 = this.field475; var6 > 0; var6--) {
                    this.field471[var6] = this.field471[var6 - 1];
                    this.field472[var6] = this.field472[var6 - 1];
                    this.field473[var6] = this.field473[var6 - 1];
                }
                this.field471[0] = arg0;
                this.field472[0] = arg1;
                this.field473[0] = false;
                return;
            }
        }
        this.field475 = 0;
        this.field447 = 0;
        this.field474 = 0;
        this.field471[0] = arg0;
        this.field472[0] = arg1;
        this.field444 = this.field471[0] * 128 + this.field423 * 64;
        this.field420 = this.field472[0] * 128 + this.field423 * 64;
    }

    @ObfuscatedName("av.w(IZI)V")
    public final void method254(int arg0, boolean arg1) {
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
        if (this.field448 != -1 && Statics.method61(this.field448).field898 == 1) {
            this.field448 = -1;
        }
        if (this.field475 < 9) {
            this.field475++;
        }
        for (int var5 = this.field475; var5 > 0; var5--) {
            this.field471[var5] = this.field471[var5 - 1];
            this.field472[var5] = this.field472[var5 - 1];
            this.field473[var5] = this.field473[var5 - 1];
        }
        this.field471[0] = var3;
        this.field472[0] = var4;
        this.field473[0] = arg1;
    }

    @ObfuscatedName("av.g(I)V")
    public final void method259() {
        this.field475 = 0;
        this.field447 = 0;
    }

    @ObfuscatedName("av.j(I)Z")
    public boolean method14() {
        return false;
    }

    @ObfuscatedName("av.s(IIII)V")
    public final void method252(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field438[var4] <= arg2) {
                this.field436[var4] = arg0;
                this.field430[var4] = arg1;
                this.field438[var4] = arg2 + 70;
                return;
            }
        }
    }
}
