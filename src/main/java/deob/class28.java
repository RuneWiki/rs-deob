package deob;

@ObfuscatedName("ax")
public abstract class class28 extends class90 {

    @ObfuscatedName("ax.ax")
    public int field629;

    @ObfuscatedName("ax.ac")
    public int field601;

    @ObfuscatedName("ax.az")
    public int field602;

    @ObfuscatedName("ax.ao")
    public boolean field603 = false;

    @ObfuscatedName("ax.ak")
    public int field604 = 1;

    @ObfuscatedName("ax.aa")
    public int field605 = -1;

    @ObfuscatedName("ax.aj")
    public int field606 = -1;

    @ObfuscatedName("ax.ay")
    public int field607 = -1;

    @ObfuscatedName("ax.ae")
    public int field660 = -1;

    @ObfuscatedName("ax.aq")
    public int field609 = -1;

    @ObfuscatedName("ax.av")
    public int field610 = -1;

    @ObfuscatedName("ax.aw")
    public int field611 = -1;

    @ObfuscatedName("ax.ag")
    public int field650 = -1;

    @ObfuscatedName("ax.af")
    public String field613 = null;

    @ObfuscatedName("ax.ar")
    public boolean field614;

    @ObfuscatedName("ax.ab")
    public boolean field655 = false;

    @ObfuscatedName("ax.as")
    public int field616 = 100;

    @ObfuscatedName("ax.ai")
    public int field617 = 0;

    @ObfuscatedName("ax.ad")
    public int field618 = 0;

    @ObfuscatedName("ax.al")
    public byte field641 = 0;

    @ObfuscatedName("ax.at")
    public int[] field631 = new int[4];

    @ObfuscatedName("ax.ah")
    public int[] field630 = new int[4];

    @ObfuscatedName("ax.ap")
    public int[] field622 = new int[4];

    @ObfuscatedName("ax.au")
    public int[] field646 = new int[4];

    @ObfuscatedName("ax.bu")
    public int[] field624 = new int[4];

    @ObfuscatedName("ax.br")
    public class148 field600 = new class148();

    @ObfuscatedName("ax.bk")
    public int field626 = -1;

    @ObfuscatedName("ax.bo")
    public boolean field615 = false;

    @ObfuscatedName("ax.bw")
    public int field628 = -1;

    @ObfuscatedName("ax.bi")
    public int field625 = -1;

    @ObfuscatedName("ax.bl")
    public int field621 = 0;

    @ObfuscatedName("ax.by")
    public int field612 = 0;

    @ObfuscatedName("ax.bv")
    public int field627 = -1;

    @ObfuscatedName("ax.bf")
    public int field633 = 0;

    @ObfuscatedName("ax.be")
    public int field634 = 0;

    @ObfuscatedName("ax.bm")
    public int field635 = 0;

    @ObfuscatedName("ax.bx")
    public int field636 = 0;

    @ObfuscatedName("ax.bb")
    public int field637 = -1;

    @ObfuscatedName("ax.bj")
    public int field638 = 0;

    @ObfuscatedName("ax.bp")
    public int field632 = 0;

    @ObfuscatedName("ax.bc")
    public int field640;

    @ObfuscatedName("ax.bh")
    public int field623;

    @ObfuscatedName("ax.bs")
    public int field661;

    @ObfuscatedName("ax.bq")
    public int field643;

    @ObfuscatedName("ax.bg")
    public int field644;

    @ObfuscatedName("ax.ba")
    public int field645;

    @ObfuscatedName("ax.bn")
    public int field639;

    @ObfuscatedName("ax.bz")
    public int field647;

    @ObfuscatedName("ax.bd")
    public int field648;

    @ObfuscatedName("ax.bt")
    public int field649 = 0;

    @ObfuscatedName("ax.cx")
    public int field608 = 200;

    @ObfuscatedName("ax.cb")
    public int field651;

    @ObfuscatedName("ax.cm")
    public int field652 = 0;

    @ObfuscatedName("ax.ck")
    public int field653 = 32;

    @ObfuscatedName("ax.cf")
    public int field654 = 0;

    @ObfuscatedName("ax.cj")
    public int[] field662 = new int[10];

    @ObfuscatedName("ax.cu")
    public int[] field656 = new int[10];

    @ObfuscatedName("ax.cz")
    public byte[] field619 = new byte[10];

    @ObfuscatedName("ax.ct")
    public int field658 = 0;

    @ObfuscatedName("ax.cq")
    public int field659 = 0;

    @ObfuscatedName("ax.ac(I)V")
    public final void method584() {
        this.field654 = 0;
        this.field659 = 0;
    }

    @ObfuscatedName("ax.u(I)Z")
    public boolean method233() {
        return false;
    }

    @ObfuscatedName("ax.az(IIIIIIB)V")
    public final void method583(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field622[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class202 var13 = class202.method3173(arg0);
            var11 = var13.field2916;
            var12 = var13.field2907;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field622[0];
            } else if (var11 == 1) {
                var14 = this.field630[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field622[var15] < var14) {
                        var10 = var15;
                        var14 = this.field622[var15];
                    }
                } else if (var11 == 1 && this.field630[var15] < var14) {
                    var10 = var15;
                    var14 = this.field630[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field641 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field641;
                this.field641 = (byte) ((this.field641 + 1) % 4);
                if (this.field622[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field631[var10] = arg0;
        this.field630[var10] = arg1;
        this.field646[var10] = arg2;
        this.field624[var10] = arg3;
        this.field622[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("ax.ao(IIIIIII)V")
    public final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class196 var7 = (class196) class196.field2849.method2598((long) arg0);
        class196 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field2853.method3129(33, arg0);
            class196 var10 = new class196();
            if (var9 != null) {
                var10.method3338(new class130(var9));
            }
            class196.field2849.method2607(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class196 var11 = var8;
        class35 var12 = null;
        class35 var13 = null;
        int var14 = var8.field2854;
        int var15 = 0;
        for (class35 var16 = (class35) this.field600.method2628(); var16 != null; var16 = (class35) this.field600.method2629()) {
            var15++;
            if (var16.field750.field2857 == var11.field2857) {
                var16.method716(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field750.field2852 <= var11.field2852) {
                var12 = var16;
            }
            if (var16.field750.field2854 > var14) {
                var13 = var16;
                var14 = var16.field750.field2854;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class35 var17 = new class35(var11);
        if (var12 == null) {
            this.field600.method2626(var17);
        } else {
            class148.method2627(var17, var12);
        }
        var17.method716(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method2652();
        }
    }

    @ObfuscatedName("ax.ak(II)V")
    public final void method586(int arg0) {
        class196 var2 = (class196) class196.field2849.method2598((long) arg0);
        class196 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2853.method3129(33, arg0);
            class196 var5 = new class196();
            if (var4 != null) {
                var5.method3338(new class130(var4));
            }
            class196.field2849.method2607(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class196 var6 = var3;
        for (class35 var7 = (class35) this.field600.method2628(); var7 != null; var7 = (class35) this.field600.method2629()) {
            if (var7.field750 == var6) {
                var7.method2652();
                return;
            }
        }
    }
}
