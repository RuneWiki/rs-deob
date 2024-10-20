package deob;

@ObfuscatedName("ag")
public abstract class class28 extends class90 {

    @ObfuscatedName("ag.ag")
    public int field612;

    @ObfuscatedName("ag.al")
    public int field601;

    @ObfuscatedName("ag.an")
    public boolean field603 = false;

    @ObfuscatedName("ag.af")
    public int field656;

    @ObfuscatedName("ag.aa")
    public int field604 = 1;

    @ObfuscatedName("ag.ax")
    public int field605 = -1;

    @ObfuscatedName("ag.ai")
    public int field606 = -1;

    @ObfuscatedName("ag.ah")
    public int field627 = -1;

    @ObfuscatedName("ag.av")
    public int field608 = -1;

    @ObfuscatedName("ag.at")
    public int field609 = -1;

    @ObfuscatedName("ag.az")
    public int field640 = -1;

    @ObfuscatedName("ag.ad")
    public int field615 = -1;

    @ObfuscatedName("ag.aw")
    public int field623 = -1;

    @ObfuscatedName("ag.ak")
    public String field613 = null;

    @ObfuscatedName("ag.aq")
    public boolean field646;

    @ObfuscatedName("ag.ac")
    public boolean field622 = false;

    @ObfuscatedName("ag.am")
    public int field616 = 100;

    @ObfuscatedName("ag.ay")
    public int field600 = 0;

    @ObfuscatedName("ag.ar")
    public int field618 = 0;

    @ObfuscatedName("ag.as")
    public byte field621 = 0;

    @ObfuscatedName("ag.ap")
    public int[] field620 = new int[4];

    @ObfuscatedName("ag.ae")
    public int[] field652 = new int[4];

    @ObfuscatedName("ag.ao")
    public int[] field602 = new int[4];

    @ObfuscatedName("ag.au")
    public int[] field645 = new int[4];

    @ObfuscatedName("ag.bw")
    public int[] field624 = new int[4];

    @ObfuscatedName("ag.bv")
    public class127 field638 = new class127();

    @ObfuscatedName("ag.bz")
    public int field626 = -1;

    @ObfuscatedName("ag.be")
    public boolean field614 = false;

    @ObfuscatedName("ag.bt")
    public int field628 = -1;

    @ObfuscatedName("ag.bm")
    public int field629 = -1;

    @ObfuscatedName("ag.bb")
    public int field630 = 0;

    @ObfuscatedName("ag.bu")
    public int field607 = 0;

    @ObfuscatedName("ag.bn")
    public int field632 = -1;

    @ObfuscatedName("ag.by")
    public int field633 = 0;

    @ObfuscatedName("ag.bl")
    public int field634 = 0;

    @ObfuscatedName("ag.bi")
    public int field653 = 0;

    @ObfuscatedName("ag.bo")
    public int field636 = 0;

    @ObfuscatedName("ag.br")
    public int field637 = -1;

    @ObfuscatedName("ag.bd")
    public int field635 = 0;

    @ObfuscatedName("ag.bs")
    public int field639 = 0;

    @ObfuscatedName("ag.bx")
    public int field649;

    @ObfuscatedName("ag.bp")
    public int field641;

    @ObfuscatedName("ag.bk")
    public int field642;

    @ObfuscatedName("ag.ba")
    public int field619;

    @ObfuscatedName("ag.bh")
    public int field644;

    @ObfuscatedName("ag.bj")
    public int field643;

    @ObfuscatedName("ag.bq")
    public int field611;

    @ObfuscatedName("ag.bf")
    public int field647;

    @ObfuscatedName("ag.bc")
    public int field648;

    @ObfuscatedName("ag.bg")
    public int field631 = 0;

    @ObfuscatedName("ag.cd")
    public int field650 = 200;

    @ObfuscatedName("ag.ci")
    public int field651;

    @ObfuscatedName("ag.co")
    public int field625 = 0;

    @ObfuscatedName("ag.cr")
    public int field617 = 32;

    @ObfuscatedName("ag.cs")
    public int field654 = 0;

    @ObfuscatedName("ag.cl")
    public int[] field655 = new int[10];

    @ObfuscatedName("ag.cy")
    public int[] field610 = new int[10];

    @ObfuscatedName("ag.cp")
    public byte[] field657 = new byte[10];

    @ObfuscatedName("ag.cj")
    public int field658 = 0;

    @ObfuscatedName("ag.cb")
    public int field659 = 0;

    @ObfuscatedName("ag.al(I)V")
    public final void method603() {
        this.field654 = 0;
        this.field659 = 0;
    }

    @ObfuscatedName("ag.z(I)Z")
    public boolean method221() {
        return false;
    }

    @ObfuscatedName("ag.an(IIIIIIS)V")
    public final void method612(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field602[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class197 var13 = class197.method1089(arg0);
            var11 = var13.field2868;
            var12 = var13.field2874;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field602[0];
            } else if (var11 == 1) {
                var14 = this.field652[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field602[var15] < var14) {
                        var10 = var15;
                        var14 = this.field602[var15];
                    }
                } else if (var11 == 1 && this.field652[var15] < var14) {
                    var10 = var15;
                    var14 = this.field652[var15];
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
                if (this.field602[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field620[var10] = arg0;
        this.field652[var10] = arg1;
        this.field645[var10] = arg2;
        this.field624[var10] = arg3;
        this.field602[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("ag.af(IIIIIII)V")
    public final void method605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class194 var7 = class194.method1784(arg0);
        class35 var8 = null;
        class35 var9 = null;
        int var10 = var7.field2820;
        int var11 = 0;
        for (class35 var12 = (class35) this.field638.method2209(); var12 != null; var12 = (class35) this.field638.method2211()) {
            var11++;
            if (var12.field748.field2818 == var7.field2818) {
                var12.method698(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field748.field2814 <= var7.field2814) {
                var8 = var12;
            }
            if (var12.field748.field2820 > var10) {
                var9 = var12;
                var10 = var12.field748.field2820;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class35 var13 = new class35(var7);
        if (var8 == null) {
            this.field638.method2207(var13);
        } else {
            class127.method2208(var13, var8);
        }
        var13.method698(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method2228();
        }
    }

    @ObfuscatedName("ag.aa(II)V")
    public final void method606(int arg0) {
        class194 var2 = class194.method1784(arg0);
        for (class35 var3 = (class35) this.field638.method2209(); var3 != null; var3 = (class35) this.field638.method2211()) {
            if (var3.field748 == var2) {
                var3.method2228();
                return;
            }
        }
    }
}
