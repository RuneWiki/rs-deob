package deob;

@ObfuscatedName("aj")
public abstract class class28 extends class90 {

    @ObfuscatedName("aj.aj")
    public int field658;

    @ObfuscatedName("aj.ab")
    public int field632;

    @ObfuscatedName("aj.af")
    public int field604;

    @ObfuscatedName("aj.aw")
    public boolean field633 = false;

    @ObfuscatedName("aj.ac")
    public int field635 = 1;

    @ObfuscatedName("aj.an")
    public int field606 = -1;

    @ObfuscatedName("aj.ae")
    public int field608 = -1;

    @ObfuscatedName("aj.au")
    public int field609 = -1;

    @ObfuscatedName("aj.am")
    public int field628 = -1;

    @ObfuscatedName("aj.as")
    public int field625 = -1;

    @ObfuscatedName("aj.ay")
    public int field612 = -1;

    @ObfuscatedName("aj.at")
    public int field613 = -1;

    @ObfuscatedName("aj.ai")
    public int field614 = -1;

    @ObfuscatedName("aj.aa")
    public String field615 = null;

    @ObfuscatedName("aj.ar")
    public boolean field616;

    @ObfuscatedName("aj.ag")
    public boolean field617 = false;

    @ObfuscatedName("aj.ad")
    public int field607 = 100;

    @ObfuscatedName("aj.al")
    public int field649 = 0;

    @ObfuscatedName("aj.ah")
    public int field620 = 0;

    @ObfuscatedName("aj.ax")
    public byte field621 = 0;

    @ObfuscatedName("aj.av")
    public int[] field622 = new int[4];

    @ObfuscatedName("aj.az")
    public int[] field623 = new int[4];

    @ObfuscatedName("aj.ao")
    public int[] field624 = new int[4];

    @ObfuscatedName("aj.aq")
    public int[] field652 = new int[4];

    @ObfuscatedName("aj.by")
    public int[] field626 = new int[4];

    @ObfuscatedName("aj.bj")
    public class127 field627 = new class127();

    @ObfuscatedName("aj.bg")
    public int field603 = -1;

    @ObfuscatedName("aj.bl")
    public boolean field651 = false;

    @ObfuscatedName("aj.ba")
    public int field611 = -1;

    @ObfuscatedName("aj.bi")
    public int field631 = -1;

    @ObfuscatedName("aj.bf")
    public int field654 = 0;

    @ObfuscatedName("aj.bd")
    public int field630 = 0;

    @ObfuscatedName("aj.bk")
    public int field605 = -1;

    @ObfuscatedName("aj.bm")
    public int field619 = 0;

    @ObfuscatedName("aj.bv")
    public int field636 = 0;

    @ObfuscatedName("aj.be")
    public int field637 = 0;

    @ObfuscatedName("aj.bc")
    public int field638 = 0;

    @ObfuscatedName("aj.bb")
    public int field639 = -1;

    @ObfuscatedName("aj.bx")
    public int field640 = 0;

    @ObfuscatedName("aj.bo")
    public int field629 = 0;

    @ObfuscatedName("aj.bq")
    public int field642;

    @ObfuscatedName("aj.bw")
    public int field643;

    @ObfuscatedName("aj.bt")
    public int field644;

    @ObfuscatedName("aj.bn")
    public int field645;

    @ObfuscatedName("aj.bp")
    public int field646;

    @ObfuscatedName("aj.bz")
    public int field647;

    @ObfuscatedName("aj.bs")
    public int field648;

    @ObfuscatedName("aj.bu")
    public int field634;

    @ObfuscatedName("aj.bh")
    public int field650;

    @ObfuscatedName("aj.br")
    public int field618 = 0;

    @ObfuscatedName("aj.cm")
    public int field610 = 200;

    @ObfuscatedName("aj.cr")
    public int field653;

    @ObfuscatedName("aj.ck")
    public int field660 = 0;

    @ObfuscatedName("aj.cu")
    public int field655 = 32;

    @ObfuscatedName("aj.cs")
    public int field656 = 0;

    @ObfuscatedName("aj.ci")
    public int[] field657 = new int[10];

    @ObfuscatedName("aj.cw")
    public int[] field641 = new int[10];

    @ObfuscatedName("aj.cz")
    public byte[] field659 = new byte[10];

    @ObfuscatedName("aj.ce")
    public int field602 = 0;

    @ObfuscatedName("aj.cn")
    public int field661 = 0;

    @ObfuscatedName("aj.an(I)V")
    public final void method623() {
        this.field656 = 0;
        this.field661 = 0;
    }

    @ObfuscatedName("aj.z(I)Z")
    public boolean method230() {
        return false;
    }

    @ObfuscatedName("aj.ae(IIIIIII)V")
    public final void method637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field624[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class197 var13 = class197.method3627(arg0);
            var11 = var13.field2887;
            var12 = var13.field2883;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field624[0];
            } else if (var11 == 1) {
                var14 = this.field623[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field624[var15] < var14) {
                        var10 = var15;
                        var14 = this.field624[var15];
                    }
                } else if (var11 == 1 && this.field623[var15] < var14) {
                    var10 = var15;
                    var14 = this.field623[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field621 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field621;
                this.field621 = (byte) ((this.field621 + 1) % 4);
                if (this.field624[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field622[var10] = arg0;
        this.field623[var10] = arg1;
        this.field652[var10] = arg2;
        this.field626[var10] = arg3;
        this.field624[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("aj.au(IIIIIII)V")
    public final void method625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class194 var7 = class194.method943(arg0);
        class35 var8 = null;
        class35 var9 = null;
        int var10 = var7.field2842;
        int var11 = 0;
        for (class35 var12 = (class35) this.field627.method2307(); var12 != null; var12 = (class35) this.field627.method2289()) {
            var11++;
            if (var12.field752.field2843 == var7.field2843) {
                var12.method767(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field752.field2837 <= var7.field2837) {
                var8 = var12;
            }
            if (var12.field752.field2842 > var10) {
                var9 = var12;
                var10 = var12.field752.field2842;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class35 var13 = new class35(var7);
        if (var8 == null) {
            this.field627.method2285(var13);
        } else {
            class127.method2286(var13, var8);
        }
        var13.method767(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method2313();
        }
    }

    @ObfuscatedName("aj.am(II)V")
    public final void method626(int arg0) {
        class194 var2 = class194.method943(arg0);
        for (class35 var3 = (class35) this.field627.method2307(); var3 != null; var3 = (class35) this.field627.method2289()) {
            if (var3.field752 == var2) {
                var3.method2313();
                return;
            }
        }
    }
}
