package deob;

@ObfuscatedName("ai")
public abstract class class28 extends class90 {

    @ObfuscatedName("ai.ai")
    public int field609;

    @ObfuscatedName("ai.ad")
    public int field606;

    @ObfuscatedName("ai.aa")
    public int field624;

    @ObfuscatedName("ai.ao")
    public boolean field608 = false;

    @ObfuscatedName("ai.ax")
    public int field646 = 1;

    @ObfuscatedName("ai.ae")
    public int field610 = -1;

    @ObfuscatedName("ai.al")
    public int field611 = -1;

    @ObfuscatedName("ai.an")
    public int field612 = -1;

    @ObfuscatedName("ai.aw")
    public int field637 = -1;

    @ObfuscatedName("ai.ah")
    public int field614 = -1;

    @ObfuscatedName("ai.ar")
    public int field615 = -1;

    @ObfuscatedName("ai.ay")
    public int field616 = -1;

    @ObfuscatedName("ai.as")
    public int field640 = -1;

    @ObfuscatedName("ai.aq")
    public String field618 = null;

    @ObfuscatedName("ai.af")
    public boolean field626;

    @ObfuscatedName("ai.aj")
    public boolean field620 = false;

    @ObfuscatedName("ai.ap")
    public int field650 = 100;

    @ObfuscatedName("ai.ac")
    public int field622 = 0;

    @ObfuscatedName("ai.at")
    public int field623 = 0;

    @ObfuscatedName("ai.am")
    public byte field660 = 0;

    @ObfuscatedName("ai.ak")
    public int[] field642 = new int[4];

    @ObfuscatedName("ai.au")
    public int[] field619 = new int[4];

    @ObfuscatedName("ai.ag")
    public int[] field627 = new int[4];

    @ObfuscatedName("ai.ab")
    public int[] field628 = new int[4];

    @ObfuscatedName("ai.bt")
    public int[] field629 = new int[4];

    @ObfuscatedName("ai.bw")
    public class127 field630 = new class127();

    @ObfuscatedName("ai.bd")
    public int field645 = -1;

    @ObfuscatedName("ai.bs")
    public boolean field665 = false;

    @ObfuscatedName("ai.bm")
    public int field633 = -1;

    @ObfuscatedName("ai.bb")
    public int field634 = -1;

    @ObfuscatedName("ai.bl")
    public int field635 = 0;

    @ObfuscatedName("ai.bp")
    public int field636 = 0;

    @ObfuscatedName("ai.bh")
    public int field631 = -1;

    @ObfuscatedName("ai.bo")
    public int field638 = 0;

    @ObfuscatedName("ai.bx")
    public int field639 = 0;

    @ObfuscatedName("ai.bj")
    public int field617 = 0;

    @ObfuscatedName("ai.bq")
    public int field641 = 0;

    @ObfuscatedName("ai.ba")
    public int field613 = -1;

    @ObfuscatedName("ai.bi")
    public int field643 = 0;

    @ObfuscatedName("ai.bc")
    public int field644 = 0;

    @ObfuscatedName("ai.by")
    public int field605;

    @ObfuscatedName("ai.bz")
    public int field632;

    @ObfuscatedName("ai.bg")
    public int field607;

    @ObfuscatedName("ai.br")
    public int field658;

    @ObfuscatedName("ai.be")
    public int field651;

    @ObfuscatedName("ai.bf")
    public int field621;

    @ObfuscatedName("ai.bk")
    public int field662;

    @ObfuscatedName("ai.bn")
    public int field652;

    @ObfuscatedName("ai.bu")
    public int field653;

    @ObfuscatedName("ai.bv")
    public int field654 = 0;

    @ObfuscatedName("ai.cy")
    public int field655 = 200;

    @ObfuscatedName("ai.cg")
    public int field656;

    @ObfuscatedName("ai.cc")
    public int field657 = 0;

    @ObfuscatedName("ai.cb")
    public int field647 = 32;

    @ObfuscatedName("ai.cz")
    public int field659 = 0;

    @ObfuscatedName("ai.ca")
    public int[] field663 = new int[10];

    @ObfuscatedName("ai.ch")
    public int[] field661 = new int[10];

    @ObfuscatedName("ai.ct")
    public byte[] field625 = new byte[10];

    @ObfuscatedName("ai.cn")
    public int field648 = 0;

    @ObfuscatedName("ai.cs")
    public int field664 = 0;

    @ObfuscatedName("ai.ai(I)V")
    public final void method576() {
        this.field659 = 0;
        this.field664 = 0;
    }

    @ObfuscatedName("ai.b(I)Z")
    public boolean method201() {
        return false;
    }

    @ObfuscatedName("ai.ad(IIIIIII)V")
    public final void method577(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field627[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class197 var13 = class197.method1772(arg0);
            var11 = var13.field2892;
            var12 = var13.field2883;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field627[0];
            } else if (var11 == 1) {
                var14 = this.field619[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field627[var15] < var14) {
                        var10 = var15;
                        var14 = this.field627[var15];
                    }
                } else if (var11 == 1 && this.field619[var15] < var14) {
                    var10 = var15;
                    var14 = this.field619[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field660 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field660;
                this.field660 = (byte) ((this.field660 + 1) % 4);
                if (this.field627[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field642[var10] = arg0;
        this.field619[var10] = arg1;
        this.field628[var10] = arg2;
        this.field629[var10] = arg3;
        this.field627[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("ai.aa(IIIIIIB)V")
    public final void method578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class194 var7 = class194.method2767(arg0);
        class35 var8 = null;
        class35 var9 = null;
        int var10 = var7.field2837;
        int var11 = 0;
        for (class35 var12 = (class35) this.field630.method2152(); var12 != null; var12 = (class35) this.field630.method2148()) {
            var11++;
            if (var12.field755.field2839 == var7.field2839) {
                var12.method674(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field755.field2841 <= var7.field2841) {
                var8 = var12;
            }
            if (var12.field755.field2837 > var10) {
                var9 = var12;
                var10 = var12.field755.field2837;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class35 var13 = new class35(var7);
        if (var8 == null) {
            this.field630.method2161(var13);
        } else {
            class127.method2151(var13, var8);
        }
        var13.method674(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method2179();
        }
    }

    @ObfuscatedName("ai.ao(IB)V")
    public final void method580(int arg0) {
        class194 var2 = class194.method2767(arg0);
        for (class35 var3 = (class35) this.field630.method2152(); var3 != null; var3 = (class35) this.field630.method2148()) {
            if (var3.field755 == var2) {
                var3.method2179();
                return;
            }
        }
    }
}
