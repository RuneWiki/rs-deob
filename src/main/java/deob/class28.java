package deob;

@ObfuscatedName("aq")
public abstract class class28 extends class90 {

    @ObfuscatedName("aq.aq")
    public int field638;

    @ObfuscatedName("aq.at")
    public int field625;

    @ObfuscatedName("aq.au")
    public int field626;

    @ObfuscatedName("aq.am")
    public boolean field628 = false;

    @ObfuscatedName("aq.ad")
    public int field658 = 1;

    @ObfuscatedName("aq.ai")
    public int field660 = -1;

    @ObfuscatedName("aq.ac")
    public int field677 = -1;

    @ObfuscatedName("aq.ao")
    public int field631 = -1;

    @ObfuscatedName("aq.as")
    public int field632 = -1;

    @ObfuscatedName("aq.aa")
    public int field653 = -1;

    @ObfuscatedName("aq.ah")
    public int field634 = -1;

    @ObfuscatedName("aq.aj")
    public int field635 = -1;

    @ObfuscatedName("aq.aw")
    public int field680 = -1;

    @ObfuscatedName("aq.ap")
    public String field664 = null;

    @ObfuscatedName("aq.ak")
    public boolean field627;

    @ObfuscatedName("aq.ag")
    public boolean field624 = false;

    @ObfuscatedName("aq.al")
    public int field639 = 100;

    @ObfuscatedName("aq.an")
    public int field641 = 0;

    @ObfuscatedName("aq.ar")
    public int field642 = 0;

    @ObfuscatedName("aq.az")
    public byte field661 = 0;

    @ObfuscatedName("aq.ay")
    public int[] field644 = new int[4];

    @ObfuscatedName("aq.av")
    public int[] field645 = new int[4];

    @ObfuscatedName("aq.af")
    public int[] field646 = new int[4];

    @ObfuscatedName("aq.ax")
    public int[] field647 = new int[4];

    @ObfuscatedName("aq.bn")
    public int[] field648 = new int[4];

    @ObfuscatedName("aq.bp")
    public class127 field649 = new class127();

    @ObfuscatedName("aq.bt")
    public int field650 = -1;

    @ObfuscatedName("aq.bj")
    public boolean field651 = false;

    @ObfuscatedName("aq.bw")
    public int field652 = -1;

    @ObfuscatedName("aq.bd")
    public int field633 = -1;

    @ObfuscatedName("aq.bu")
    public int field654 = 0;

    @ObfuscatedName("aq.bo")
    public int field636 = 0;

    @ObfuscatedName("aq.bc")
    public int field656 = -1;

    @ObfuscatedName("aq.bm")
    public int field657 = 0;

    @ObfuscatedName("aq.be")
    public int field643 = 0;

    @ObfuscatedName("aq.bb")
    public int field637 = 0;

    @ObfuscatedName("aq.bl")
    public int field678 = 0;

    @ObfuscatedName("aq.bk")
    public int field659 = -1;

    @ObfuscatedName("aq.bg")
    public int field662 = 0;

    @ObfuscatedName("aq.bh")
    public int field663 = 0;

    @ObfuscatedName("aq.bs")
    public int field640;

    @ObfuscatedName("aq.bq")
    public int field665;

    @ObfuscatedName("aq.ba")
    public int field666;

    @ObfuscatedName("aq.by")
    public int field667;

    @ObfuscatedName("aq.br")
    public int field668;

    @ObfuscatedName("aq.bf")
    public int field669;

    @ObfuscatedName("aq.bi")
    public int field670;

    @ObfuscatedName("aq.bv")
    public int field671;

    @ObfuscatedName("aq.bx")
    public int field672;

    @ObfuscatedName("aq.bz")
    public int field673 = 0;

    @ObfuscatedName("aq.cq")
    public int field630 = 200;

    @ObfuscatedName("aq.cx")
    public int field675;

    @ObfuscatedName("aq.cy")
    public int field676 = 0;

    @ObfuscatedName("aq.ct")
    public int field655 = 32;

    @ObfuscatedName("aq.cf")
    public int field674 = 0;

    @ObfuscatedName("aq.cw")
    public int[] field679 = new int[10];

    @ObfuscatedName("aq.cz")
    public int[] field629 = new int[10];

    @ObfuscatedName("aq.ch")
    public byte[] field681 = new byte[10];

    @ObfuscatedName("aq.cj")
    public int field682 = 0;

    @ObfuscatedName("aq.cn")
    public int field683 = 0;

    @ObfuscatedName("aq.g(I)V")
    public final void method622() {
        this.field674 = 0;
        this.field683 = 0;
    }

    @ObfuscatedName("aq.c(I)Z")
    public boolean method233() {
        return false;
    }

    @ObfuscatedName("aq.e(IIIIIII)V")
    public final void method616(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field646[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class197 var13 = class197.method955(arg0);
            var11 = var13.field2886;
            var12 = var13.field2877;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field646[0];
            } else if (var11 == 1) {
                var14 = this.field645[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field646[var15] < var14) {
                        var10 = var15;
                        var14 = this.field646[var15];
                    }
                } else if (var11 == 1 && this.field645[var15] < var14) {
                    var10 = var15;
                    var14 = this.field645[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field661 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field661;
                this.field661 = (byte) ((this.field661 + 1) % 4);
                if (this.field646[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field644[var10] = arg0;
        this.field645[var10] = arg1;
        this.field647[var10] = arg2;
        this.field648[var10] = arg3;
        this.field646[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("aq.ae(IIIIIII)V")
    public final void method628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class194 var7 = class194.method777(arg0);
        class35 var8 = null;
        class35 var9 = null;
        int var10 = var7.field2845;
        int var11 = 0;
        for (class35 var12 = (class35) this.field649.method2281(); var12 != null; var12 = (class35) this.field649.method2276()) {
            var11++;
            if (var12.field781.field2842 == var7.field2842) {
                var12.method784(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field781.field2844 <= var7.field2844) {
                var8 = var12;
            }
            if (var12.field781.field2845 > var10) {
                var9 = var12;
                var10 = var12.field781.field2845;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class35 var13 = new class35(var7);
        if (var8 == null) {
            this.field649.method2283(var13);
        } else {
            class127.method2290(var13, var8);
        }
        var13.method784(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method2310();
        }
    }

    @ObfuscatedName("aq.aq(II)V")
    public final void method620(int arg0) {
        class194 var2 = class194.method777(arg0);
        for (class35 var3 = (class35) this.field649.method2281(); var3 != null; var3 = (class35) this.field649.method2276()) {
            if (var3.field781 == var2) {
                var3.method2310();
                return;
            }
        }
    }
}
