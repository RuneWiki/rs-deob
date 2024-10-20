package deob;

@ObfuscatedName("ai")
public abstract class class28 extends class90 {

    @ObfuscatedName("ai.ai")
    public int field629;

    @ObfuscatedName("ai.aq")
    public int field600;

    @ObfuscatedName("ai.an")
    public boolean field606 = false;

    @ObfuscatedName("ai.ay")
    public int field658;

    @ObfuscatedName("ai.ap")
    public int field641 = 1;

    @ObfuscatedName("ai.aj")
    public int field599 = -1;

    @ObfuscatedName("ai.aw")
    public int field657 = -1;

    @ObfuscatedName("ai.am")
    public int field605 = -1;

    @ObfuscatedName("ai.av")
    public int field623 = -1;

    @ObfuscatedName("ai.af")
    public int field647 = -1;

    @ObfuscatedName("ai.az")
    public int field624 = -1;

    @ObfuscatedName("ai.aa")
    public int field610 = -1;

    @ObfuscatedName("ai.ad")
    public int field601 = -1;

    @ObfuscatedName("ai.ab")
    public String field649 = null;

    @ObfuscatedName("ai.al")
    public boolean field613;

    @ObfuscatedName("ai.as")
    public boolean field614 = false;

    @ObfuscatedName("ai.ar")
    public int field615 = 100;

    @ObfuscatedName("ai.at")
    public int field616 = 0;

    @ObfuscatedName("ai.ax")
    public int field617 = 0;

    @ObfuscatedName("ai.ah")
    public byte field618 = 0;

    @ObfuscatedName("ai.ac")
    public int[] field619 = new int[4];

    @ObfuscatedName("ai.ae")
    public int[] field620 = new int[4];

    @ObfuscatedName("ai.au")
    public int[] field621 = new int[4];

    @ObfuscatedName("ai.ag")
    public int[] field622 = new int[4];

    @ObfuscatedName("ai.bq")
    public int[] field645 = new int[4];

    @ObfuscatedName("ai.bh")
    public class127 field612 = new class127();

    @ObfuscatedName("ai.bw")
    public int field625 = -1;

    @ObfuscatedName("ai.ba")
    public boolean field626 = false;

    @ObfuscatedName("ai.be")
    public int field627 = -1;

    @ObfuscatedName("ai.bx")
    public int field628 = -1;

    @ObfuscatedName("ai.bs")
    public int field609 = 0;

    @ObfuscatedName("ai.bd")
    public int field630 = 0;

    @ObfuscatedName("ai.bm")
    public int field631 = -1;

    @ObfuscatedName("ai.bk")
    public int field611 = 0;

    @ObfuscatedName("ai.br")
    public int field633 = 0;

    @ObfuscatedName("ai.bp")
    public int field634 = 0;

    @ObfuscatedName("ai.bl")
    public int field636 = 0;

    @ObfuscatedName("ai.bn")
    public int field635 = -1;

    @ObfuscatedName("ai.bf")
    public int field637 = 0;

    @ObfuscatedName("ai.bb")
    public int field638 = 0;

    @ObfuscatedName("ai.bg")
    public int field639;

    @ObfuscatedName("ai.bu")
    public int field640;

    @ObfuscatedName("ai.bj")
    public int field607;

    @ObfuscatedName("ai.by")
    public int field642;

    @ObfuscatedName("ai.bc")
    public int field643;

    @ObfuscatedName("ai.bz")
    public int field644;

    @ObfuscatedName("ai.bo")
    public int field603;

    @ObfuscatedName("ai.bt")
    public int field646;

    @ObfuscatedName("ai.bv")
    public int field654;

    @ObfuscatedName("ai.bi")
    public int field648 = 0;

    @ObfuscatedName("ai.cn")
    public int field602 = 200;

    @ObfuscatedName("ai.ca")
    public int field650;

    @ObfuscatedName("ai.cz")
    public int field651 = 0;

    @ObfuscatedName("ai.co")
    public int field652 = 32;

    @ObfuscatedName("ai.ch")
    public int field653 = 0;

    @ObfuscatedName("ai.cd")
    public int[] field632 = new int[10];

    @ObfuscatedName("ai.ci")
    public int[] field655 = new int[10];

    @ObfuscatedName("ai.ck")
    public byte[] field656 = new byte[10];

    @ObfuscatedName("ai.cy")
    public int field604 = 0;

    @ObfuscatedName("ai.cr")
    public int field608 = 0;

    @ObfuscatedName("ai.an(I)V")
    public final void method577() {
        this.field653 = 0;
        this.field608 = 0;
    }

    @ObfuscatedName("ai.w(I)Z")
    public boolean method215() {
        return false;
    }

    @ObfuscatedName("ai.ay(IIIIIIB)V")
    public final void method565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field621[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class197 var13 = class197.method2106(arg0);
            var11 = var13.field2890;
            var12 = var13.field2876;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field621[0];
            } else if (var11 == 1) {
                var14 = this.field620[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field621[var15] < var14) {
                        var10 = var15;
                        var14 = this.field621[var15];
                    }
                } else if (var11 == 1 && this.field620[var15] < var14) {
                    var10 = var15;
                    var14 = this.field620[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field618 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field618;
                this.field618 = (byte) ((this.field618 + 1) % 4);
                if (this.field621[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field619[var10] = arg0;
        this.field620[var10] = arg1;
        this.field622[var10] = arg2;
        this.field645[var10] = arg3;
        this.field621[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("ai.ap(IIIIIIB)V")
    public final void method566(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class194 var7 = class194.method169(arg0);
        class35 var8 = null;
        class35 var9 = null;
        int var10 = var7.field2840;
        int var11 = 0;
        for (class35 var12 = (class35) this.field612.method2176(); var12 != null; var12 = (class35) this.field612.method2177()) {
            var11++;
            if (var12.field752.field2835 == var7.field2835) {
                var12.method661(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field752.field2845 <= var7.field2845) {
                var8 = var12;
            }
            if (var12.field752.field2840 > var10) {
                var9 = var12;
                var10 = var12.field752.field2840;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class35 var13 = new class35(var7);
        if (var8 == null) {
            this.field612.method2179(var13);
        } else {
            class127.method2182(var13, var8);
        }
        var13.method661(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method2200();
        }
    }

    @ObfuscatedName("ai.aj(II)V")
    public final void method567(int arg0) {
        class194 var2 = class194.method169(arg0);
        for (class35 var3 = (class35) this.field612.method2176(); var3 != null; var3 = (class35) this.field612.method2177()) {
            if (var3.field752 == var2) {
                var3.method2200();
                return;
            }
        }
    }
}
