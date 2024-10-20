package deob;

@ObfuscatedName("ar")
public abstract class class28 extends class90 {

    @ObfuscatedName("ar.an")
    public boolean field629 = false;

    @ObfuscatedName("ar.aa")
    public int field675;

    @ObfuscatedName("ar.af")
    public int field627;

    @ObfuscatedName("ar.ax")
    public int field628;

    @ObfuscatedName("ar.ah")
    public int field673 = 1;

    @ObfuscatedName("ar.az")
    public int field631 = -1;

    @ObfuscatedName("ar.at")
    public int field685 = -1;

    @ObfuscatedName("ar.ab")
    public int field633 = -1;

    @ObfuscatedName("ar.ae")
    public int field668 = -1;

    @ObfuscatedName("ar.ao")
    public int field635 = -1;

    @ObfuscatedName("ar.am")
    public int field636 = -1;

    @ObfuscatedName("ar.ak")
    public int field669 = -1;

    @ObfuscatedName("ar.ay")
    public int field652 = -1;

    @ObfuscatedName("ar.aq")
    public String field639 = null;

    @ObfuscatedName("ar.aj")
    public boolean field640;

    @ObfuscatedName("ar.ap")
    public boolean field662 = false;

    @ObfuscatedName("ar.ai")
    public int field642 = 100;

    @ObfuscatedName("ar.ac")
    public int field643 = 0;

    @ObfuscatedName("ar.av")
    public int field644 = 0;

    @ObfuscatedName("ar.al")
    public byte field645 = 0;

    @ObfuscatedName("ar.ag")
    public int[] field646 = new int[4];

    @ObfuscatedName("ar.aw")
    public int[] field647 = new int[4];

    @ObfuscatedName("ar.ad")
    public int[] field678 = new int[4];

    @ObfuscatedName("ar.au")
    public int[] field682 = new int[4];

    @ObfuscatedName("ar.bj")
    public int[] field650 = new int[4];

    @ObfuscatedName("ar.bd")
    public class127 field638 = new class127();

    @ObfuscatedName("ar.bb")
    public int field641 = -1;

    @ObfuscatedName("ar.bt")
    public boolean field653 = false;

    @ObfuscatedName("ar.bl")
    public int field654 = -1;

    @ObfuscatedName("ar.bv")
    public int field626 = -1;

    @ObfuscatedName("ar.bm")
    public int field656 = 0;

    @ObfuscatedName("ar.bc")
    public int field657 = 0;

    @ObfuscatedName("ar.be")
    public int field658 = -1;

    @ObfuscatedName("ar.bk")
    public int field659 = 0;

    @ObfuscatedName("ar.bq")
    public int field660 = 0;

    @ObfuscatedName("ar.bp")
    public int field661 = 0;

    @ObfuscatedName("ar.by")
    public int field630 = 0;

    @ObfuscatedName("ar.bw")
    public int field634 = -1;

    @ObfuscatedName("ar.bf")
    public int field663 = 0;

    @ObfuscatedName("ar.bu")
    public int field665 = 0;

    @ObfuscatedName("ar.bo")
    public int field666;

    @ObfuscatedName("ar.bx")
    public int field667;

    @ObfuscatedName("ar.bs")
    public int field651;

    @ObfuscatedName("ar.bi")
    public int field664;

    @ObfuscatedName("ar.bn")
    public int field670;

    @ObfuscatedName("ar.bz")
    public int field671;

    @ObfuscatedName("ar.bh")
    public int field672;

    @ObfuscatedName("ar.br")
    public int field648;

    @ObfuscatedName("ar.bg")
    public int field674;

    @ObfuscatedName("ar.ba")
    public int field649 = 0;

    @ObfuscatedName("ar.cw")
    public int field655 = 200;

    @ObfuscatedName("ar.cg")
    public int field677;

    @ObfuscatedName("ar.cb")
    public int field676 = 0;

    @ObfuscatedName("ar.cs")
    public int field679 = 32;

    @ObfuscatedName("ar.cj")
    public int field680 = 0;

    @ObfuscatedName("ar.cf")
    public int[] field681 = new int[10];

    @ObfuscatedName("ar.cv")
    public int[] field632 = new int[10];

    @ObfuscatedName("ar.ce")
    public byte[] field683 = new byte[10];

    @ObfuscatedName("ar.ck")
    public int field684 = 0;

    @ObfuscatedName("ar.cc")
    public int field637 = 0;

    @ObfuscatedName("ar.aa(B)V")
    public final void method615() {
        this.field680 = 0;
        this.field637 = 0;
    }

    @ObfuscatedName("ar.y(B)Z")
    public boolean method251() {
        return false;
    }

    @ObfuscatedName("ar.af(IIIIIII)V")
    public final void method609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field678[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class197 var13 = class197.method3064(arg0);
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
                var14 = this.field678[0];
            } else if (var11 == 1) {
                var14 = this.field647[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field678[var15] < var14) {
                        var10 = var15;
                        var14 = this.field678[var15];
                    }
                } else if (var11 == 1 && this.field647[var15] < var14) {
                    var10 = var15;
                    var14 = this.field647[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field645 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field645;
                this.field645 = (byte) ((this.field645 + 1) % 4);
                if (this.field678[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field646[var10] = arg0;
        this.field647[var10] = arg1;
        this.field682[var10] = arg2;
        this.field650[var10] = arg3;
        this.field678[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("ar.ax(IIIIIII)V")
    public final void method608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class194 var7 = class194.method3316(arg0);
        class35 var8 = null;
        class35 var9 = null;
        int var10 = var7.field2835;
        int var11 = 0;
        for (class35 var12 = (class35) this.field638.method2253(); var12 != null; var12 = (class35) this.field638.method2265()) {
            var11++;
            if (var12.field790.field2838 == var7.field2838) {
                var12.method760(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field790.field2834 <= var7.field2834) {
                var8 = var12;
            }
            if (var12.field790.field2835 > var10) {
                var9 = var12;
                var10 = var12.field790.field2835;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class35 var13 = new class35(var7);
        if (var8 == null) {
            this.field638.method2257(var13);
        } else {
            class127.method2251(var13, var8);
        }
        var13.method760(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method2278();
        }
    }

    @ObfuscatedName("ar.ah(IB)V")
    public final void method607(int arg0) {
        class194 var2 = class194.method3316(arg0);
        for (class35 var3 = (class35) this.field638.method2253(); var3 != null; var3 = (class35) this.field638.method2265()) {
            if (var3.field790 == var2) {
                var3.method2278();
                return;
            }
        }
    }
}
