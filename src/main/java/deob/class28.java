package deob;

@ObfuscatedName("ag")
public abstract class class28 extends class90 {

    @ObfuscatedName("ag.ag")
    public int field608;

    @ObfuscatedName("ag.au")
    public int field605;

    @ObfuscatedName("ag.aa")
    public int field606;

    @ObfuscatedName("ag.ae")
    public boolean field607 = false;

    @ObfuscatedName("ag.av")
    public int field613 = 1;

    @ObfuscatedName("ag.ao")
    public int field644 = -1;

    @ObfuscatedName("ag.ah")
    public int field647 = -1;

    @ObfuscatedName("ag.ak")
    public int field611 = -1;

    @ObfuscatedName("ag.ab")
    public int field625 = -1;

    @ObfuscatedName("ag.ay")
    public int field641 = -1;

    @ObfuscatedName("ag.an")
    public int field616 = -1;

    @ObfuscatedName("ag.aw")
    public int field649 = -1;

    @ObfuscatedName("ag.af")
    public int field612 = -1;

    @ObfuscatedName("ag.ac")
    public String field617 = null;

    @ObfuscatedName("ag.ar")
    public boolean field618;

    @ObfuscatedName("ag.at")
    public boolean field619 = false;

    @ObfuscatedName("ag.al")
    public int field620 = 100;

    @ObfuscatedName("ag.ax")
    public int field609 = 0;

    @ObfuscatedName("ag.az")
    public int field622 = 0;

    @ObfuscatedName("ag.ap")
    public byte field624 = 0;

    @ObfuscatedName("ag.aj")
    public int[] field639 = new int[4];

    @ObfuscatedName("ag.aq")
    public int[] field626 = new int[4];

    @ObfuscatedName("ag.as")
    public int[] field610 = new int[4];

    @ObfuscatedName("ag.ad")
    public int[] field628 = new int[4];

    @ObfuscatedName("ag.bm")
    public int[] field629 = new int[4];

    @ObfuscatedName("ag.bd")
    public class127 field630 = new class127();

    @ObfuscatedName("ag.br")
    public int field614 = -1;

    @ObfuscatedName("ag.bh")
    public boolean field632 = false;

    @ObfuscatedName("ag.bv")
    public int field615 = -1;

    @ObfuscatedName("ag.bf")
    public int field634 = -1;

    @ObfuscatedName("ag.bu")
    public int field631 = 0;

    @ObfuscatedName("ag.bp")
    public int field636 = 0;

    @ObfuscatedName("ag.be")
    public int field637 = -1;

    @ObfuscatedName("ag.bo")
    public int field638 = 0;

    @ObfuscatedName("ag.bk")
    public int field640 = 0;

    @ObfuscatedName("ag.ba")
    public int field646 = 0;

    @ObfuscatedName("ag.bl")
    public int field627 = 0;

    @ObfuscatedName("ag.bq")
    public int field642 = -1;

    @ObfuscatedName("ag.bc")
    public int field643 = 0;

    @ObfuscatedName("ag.bs")
    public int field665 = 0;

    @ObfuscatedName("ag.bi")
    public int field645;

    @ObfuscatedName("ag.bx")
    public int field655;

    @ObfuscatedName("ag.bw")
    public int field659;

    @ObfuscatedName("ag.bt")
    public int field648;

    @ObfuscatedName("ag.by")
    public int field633;

    @ObfuscatedName("ag.bn")
    public int field650;

    @ObfuscatedName("ag.bj")
    public int field651;

    @ObfuscatedName("ag.bz")
    public int field652;

    @ObfuscatedName("ag.bg")
    public int field653;

    @ObfuscatedName("ag.bb")
    public int field654 = 0;

    @ObfuscatedName("ag.ct")
    public int field635 = 200;

    @ObfuscatedName("ag.ce")
    public int field656;

    @ObfuscatedName("ag.ca")
    public int field604 = 0;

    @ObfuscatedName("ag.cp")
    public int field658 = 32;

    @ObfuscatedName("ag.cy")
    public int field657 = 0;

    @ObfuscatedName("ag.ch")
    public int[] field660 = new int[10];

    @ObfuscatedName("ag.cu")
    public int[] field661 = new int[10];

    @ObfuscatedName("ag.cx")
    public byte[] field662 = new byte[10];

    @ObfuscatedName("ag.co")
    public int field663 = 0;

    @ObfuscatedName("ag.cl")
    public int field664 = 0;

    @ObfuscatedName("ag.t(B)V")
    public final void method573() {
        this.field657 = 0;
        this.field664 = 0;
    }

    @ObfuscatedName("ag.u(I)Z")
    public boolean method216() {
        return false;
    }

    @ObfuscatedName("ag.r(IIIIIIS)V")
    public final void method576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field610[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class197 var13 = class197.method2869(arg0);
            var11 = var13.field2885;
            var12 = var13.field2876;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field610[0];
            } else if (var11 == 1) {
                var14 = this.field626[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field610[var15] < var14) {
                        var10 = var15;
                        var14 = this.field610[var15];
                    }
                } else if (var11 == 1 && this.field626[var15] < var14) {
                    var10 = var15;
                    var14 = this.field626[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field624 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field624;
                this.field624 = (byte) ((this.field624 + 1) % 4);
                if (this.field610[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field639[var10] = arg0;
        this.field626[var10] = arg1;
        this.field628[var10] = arg2;
        this.field629[var10] = arg3;
        this.field610[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("ag.a(IIIIIII)V")
    public final void method574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class194 var7 = class194.method2086(arg0);
        class35 var8 = null;
        class35 var9 = null;
        int var10 = var7.field2837;
        int var11 = 0;
        for (class35 var12 = (class35) this.field630.method2163(); var12 != null; var12 = (class35) this.field630.method2161()) {
            var11++;
            if (var12.field764.field2835 == var7.field2835) {
                var12.method680(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field764.field2840 <= var7.field2840) {
                var8 = var12;
            }
            if (var12.field764.field2837 > var10) {
                var9 = var12;
                var10 = var12.field764.field2837;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class35 var13 = new class35(var7);
        if (var8 == null) {
            this.field630.method2165(var13);
        } else {
            class127.method2162(var13, var8);
        }
        var13.method680(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method2189();
        }
    }

    @ObfuscatedName("ag.e(II)V")
    public final void method572(int arg0) {
        class194 var2 = class194.method2086(arg0);
        for (class35 var3 = (class35) this.field630.method2163(); var3 != null; var3 = (class35) this.field630.method2161()) {
            if (var3.field764 == var2) {
                var3.method2189();
                return;
            }
        }
    }
}
