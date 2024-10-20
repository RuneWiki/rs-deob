package deob;

@ObfuscatedName("aj")
public abstract class class28 extends class90 {

    @ObfuscatedName("aj.aj")
    public int field610;

    @ObfuscatedName("aj.ae")
    public int field609;

    @ObfuscatedName("aj.au")
    public int field602;

    @ObfuscatedName("aj.aa")
    public boolean field603 = false;

    @ObfuscatedName("aj.af")
    public int field605 = 1;

    @ObfuscatedName("aj.at")
    public int field604 = -1;

    @ObfuscatedName("aj.ap")
    public int field621 = -1;

    @ObfuscatedName("aj.aw")
    public int field608 = -1;

    @ObfuscatedName("aj.ah")
    public int field622 = -1;

    @ObfuscatedName("aj.ao")
    public int field634 = -1;

    @ObfuscatedName("aj.ag")
    public int field611 = -1;

    @ObfuscatedName("aj.az")
    public int field612 = -1;

    @ObfuscatedName("aj.ai")
    public int field613 = -1;

    @ObfuscatedName("aj.as")
    public String field614 = null;

    @ObfuscatedName("aj.ak")
    public boolean field646;

    @ObfuscatedName("aj.an")
    public boolean field616 = false;

    @ObfuscatedName("aj.av")
    public int field627 = 100;

    @ObfuscatedName("aj.ab")
    public int field618 = 0;

    @ObfuscatedName("aj.ay")
    public int field631 = 0;

    @ObfuscatedName("aj.ar")
    public byte field620 = 0;

    @ObfuscatedName("aj.ad")
    public int[] field654 = new int[4];

    @ObfuscatedName("aj.ax")
    public int[] field607 = new int[4];

    @ObfuscatedName("aj.ac")
    public int[] field623 = new int[4];

    @ObfuscatedName("aj.al")
    public int[] field606 = new int[4];

    @ObfuscatedName("aj.bu")
    public int[] field625 = new int[4];

    @ObfuscatedName("aj.bd")
    public class127 field626 = new class127();

    @ObfuscatedName("aj.bz")
    public int field647 = -1;

    @ObfuscatedName("aj.bo")
    public boolean field628 = false;

    @ObfuscatedName("aj.ba")
    public int field629 = -1;

    @ObfuscatedName("aj.bf")
    public int field630 = -1;

    @ObfuscatedName("aj.be")
    public int field615 = 0;

    @ObfuscatedName("aj.bq")
    public int field619 = 0;

    @ObfuscatedName("aj.bv")
    public int field633 = -1;

    @ObfuscatedName("aj.bc")
    public int field650 = 0;

    @ObfuscatedName("aj.bh")
    public int field624 = 0;

    @ObfuscatedName("aj.bg")
    public int field636 = 0;

    @ObfuscatedName("aj.bi")
    public int field632 = 0;

    @ObfuscatedName("aj.bp")
    public int field638 = -1;

    @ObfuscatedName("aj.bb")
    public int field639 = 0;

    @ObfuscatedName("aj.bl")
    public int field601 = 0;

    @ObfuscatedName("aj.bm")
    public int field640;

    @ObfuscatedName("aj.bw")
    public int field642;

    @ObfuscatedName("aj.bs")
    public int field643;

    @ObfuscatedName("aj.bt")
    public int field644;

    @ObfuscatedName("aj.bj")
    public int field645;

    @ObfuscatedName("aj.by")
    public int field635;

    @ObfuscatedName("aj.bx")
    public int field641;

    @ObfuscatedName("aj.bn")
    public int field648;

    @ObfuscatedName("aj.br")
    public int field649;

    @ObfuscatedName("aj.bk")
    public int field637 = 0;

    @ObfuscatedName("aj.ch")
    public int field651 = 200;

    @ObfuscatedName("aj.cp")
    public int field652;

    @ObfuscatedName("aj.cf")
    public int field653 = 0;

    @ObfuscatedName("aj.ct")
    public int field617 = 32;

    @ObfuscatedName("aj.co")
    public int field655 = 0;

    @ObfuscatedName("aj.cl")
    public int[] field656 = new int[10];

    @ObfuscatedName("aj.cn")
    public int[] field657 = new int[10];

    @ObfuscatedName("aj.ca")
    public byte[] field658 = new byte[10];

    @ObfuscatedName("aj.cb")
    public int field659 = 0;

    @ObfuscatedName("aj.ci")
    public int field660 = 0;

    @ObfuscatedName("aj.aq(I)V")
    public final void method584() {
        this.field655 = 0;
        this.field660 = 0;
    }

    @ObfuscatedName("aj.t(I)Z")
    public boolean method245() {
        return false;
    }

    @ObfuscatedName("aj.aj(IIIIIIB)V")
    public final void method597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field623[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class197 var13 = class197.method2512(arg0);
            var11 = var13.field2895;
            var12 = var13.field2886;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field623[0];
            } else if (var11 == 1) {
                var14 = this.field607[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field623[var15] < var14) {
                        var10 = var15;
                        var14 = this.field623[var15];
                    }
                } else if (var11 == 1 && this.field607[var15] < var14) {
                    var10 = var15;
                    var14 = this.field607[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field620 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field620;
                this.field620 = (byte) ((this.field620 + 1) % 4);
                if (this.field623[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field654[var10] = arg0;
        this.field607[var10] = arg1;
        this.field606[var10] = arg2;
        this.field625[var10] = arg3;
        this.field623[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("aj.ae(IIIIIII)V")
    public final void method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class194 var7 = class194.method3794(arg0);
        class35 var8 = null;
        class35 var9 = null;
        int var10 = var7.field2844;
        int var11 = 0;
        for (class35 var12 = (class35) this.field626.method2277(); var12 != null; var12 = (class35) this.field626.method2280()) {
            var11++;
            if (var12.field747.field2841 == var7.field2841) {
                var12.method734(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field747.field2854 <= var7.field2854) {
                var8 = var12;
            }
            if (var12.field747.field2844 > var10) {
                var9 = var12;
                var10 = var12.field747.field2844;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class35 var13 = new class35(var7);
        if (var8 == null) {
            this.field626.method2276(var13);
        } else {
            class127.method2279(var13, var8);
        }
        var13.method734(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method2298();
        }
    }

    @ObfuscatedName("aj.au(II)V")
    public final void method587(int arg0) {
        class194 var2 = class194.method3794(arg0);
        for (class35 var3 = (class35) this.field626.method2277(); var3 != null; var3 = (class35) this.field626.method2280()) {
            if (var3.field747 == var2) {
                var3.method2298();
                return;
            }
        }
    }
}
