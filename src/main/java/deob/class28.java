package deob;

@ObfuscatedName("an")
public abstract class class28 extends class90 {

    @ObfuscatedName("an.an")
    public boolean field622 = false;

    @ObfuscatedName("an.aq")
    public int field625;

    @ObfuscatedName("an.ah")
    public int field620;

    @ObfuscatedName("an.ag")
    public int field671;

    @ObfuscatedName("an.ab")
    public int field623 = 1;

    @ObfuscatedName("an.aw")
    public int field624 = -1;

    @ObfuscatedName("an.ax")
    public int field634 = -1;

    @ObfuscatedName("an.ar")
    public int field626 = -1;

    @ObfuscatedName("an.ak")
    public int field627 = -1;

    @ObfuscatedName("an.ai")
    public int field628 = -1;

    @ObfuscatedName("an.ap")
    public int field646 = -1;

    @ObfuscatedName("an.au")
    public int field630 = -1;

    @ObfuscatedName("an.aj")
    public int field631 = -1;

    @ObfuscatedName("an.at")
    public String field632 = null;

    @ObfuscatedName("an.ad")
    public boolean field633;

    @ObfuscatedName("an.av")
    public boolean field649 = false;

    @ObfuscatedName("an.ao")
    public int field657 = 100;

    @ObfuscatedName("an.ae")
    public int field636 = 0;

    @ObfuscatedName("an.aa")
    public int field619 = 0;

    @ObfuscatedName("an.al")
    public byte field635 = 0;

    @ObfuscatedName("an.az")
    public int[] field658 = new int[4];

    @ObfuscatedName("an.ay")
    public int[] field640 = new int[4];

    @ObfuscatedName("an.ac")
    public int[] field645 = new int[4];

    @ObfuscatedName("an.af")
    public int[] field642 = new int[4];

    @ObfuscatedName("an.bc")
    public int[] field643 = new int[4];

    @ObfuscatedName("an.bh")
    public class127 field637 = new class127();

    @ObfuscatedName("an.bj")
    public int field629 = -1;

    @ObfuscatedName("an.br")
    public boolean field678 = false;

    @ObfuscatedName("an.bk")
    public int field647 = -1;

    @ObfuscatedName("an.bu")
    public int field648 = -1;

    @ObfuscatedName("an.by")
    public int field655 = 0;

    @ObfuscatedName("an.bl")
    public int field650 = 0;

    @ObfuscatedName("an.bv")
    public int field651 = -1;

    @ObfuscatedName("an.bb")
    public int field654 = 0;

    @ObfuscatedName("an.bq")
    public int field653 = 0;

    @ObfuscatedName("an.bf")
    public int field621 = 0;

    @ObfuscatedName("an.bw")
    public int field638 = 0;

    @ObfuscatedName("an.be")
    public int field669 = -1;

    @ObfuscatedName("an.bg")
    public int field679 = 0;

    @ObfuscatedName("an.bz")
    public int field639 = 0;

    @ObfuscatedName("an.bm")
    public int field659;

    @ObfuscatedName("an.bo")
    public int field660;

    @ObfuscatedName("an.bd")
    public int field661;

    @ObfuscatedName("an.ba")
    public int field662;

    @ObfuscatedName("an.bi")
    public int field663;

    @ObfuscatedName("an.bx")
    public int field644;

    @ObfuscatedName("an.bs")
    public int field665;

    @ObfuscatedName("an.bt")
    public int field666;

    @ObfuscatedName("an.bp")
    public int field641;

    @ObfuscatedName("an.bn")
    public int field668 = 0;

    @ObfuscatedName("an.cl")
    public int field677 = 200;

    @ObfuscatedName("an.cs")
    public int field670;

    @ObfuscatedName("an.cx")
    public int field667 = 0;

    @ObfuscatedName("an.cv")
    public int field672 = 32;

    @ObfuscatedName("an.ce")
    public int field673 = 0;

    @ObfuscatedName("an.cg")
    public int[] field674 = new int[10];

    @ObfuscatedName("an.ck")
    public int[] field675 = new int[10];

    @ObfuscatedName("an.cn")
    public byte[] field676 = new byte[10];

    @ObfuscatedName("an.cr")
    public int field652 = 0;

    @ObfuscatedName("an.cf")
    public int field656 = 0;

    @ObfuscatedName("an.aq(I)V")
    public final void method567() {
        this.field673 = 0;
        this.field656 = 0;
    }

    @ObfuscatedName("an.n(I)Z")
    public boolean method213() {
        return false;
    }

    @ObfuscatedName("an.ah(IIIIIII)V")
    public final void method583(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field645[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class197 var13 = class197.method2099(arg0);
            var11 = var13.field2891;
            var12 = var13.field2882;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field645[0];
            } else if (var11 == 1) {
                var14 = this.field640[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field645[var15] < var14) {
                        var10 = var15;
                        var14 = this.field645[var15];
                    }
                } else if (var11 == 1 && this.field640[var15] < var14) {
                    var10 = var15;
                    var14 = this.field640[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field635 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field635;
                this.field635 = (byte) ((this.field635 + 1) % 4);
                if (this.field645[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field658[var10] = arg0;
        this.field640[var10] = arg1;
        this.field642[var10] = arg2;
        this.field643[var10] = arg3;
        this.field645[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("an.ag(IIIIIIB)V")
    public final void method570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class194 var7 = (class194) class194.field2842.method2240((long) arg0);
        class194 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field2853.method3163(33, arg0);
            class194 var10 = new class194();
            if (var9 != null) {
                var10.method3348(new class154(var9));
            }
            class194.field2842.method2246(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class194 var11 = var8;
        class35 var12 = null;
        class35 var13 = null;
        int var14 = var8.field2850;
        int var15 = 0;
        for (class35 var16 = (class35) this.field637.method2279(); var16 != null; var16 = (class35) this.field637.method2270()) {
            var15++;
            if (var16.field775.field2846 == var11.field2846) {
                var16.method714(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field775.field2840 <= var11.field2840) {
                var12 = var16;
            }
            if (var16.field775.field2850 > var14) {
                var13 = var16;
                var14 = var16.field775.field2850;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class35 var17 = new class35(var11);
        if (var12 == null) {
            this.field637.method2280(var17);
        } else {
            class127.method2269(var17, var12);
        }
        var17.method714(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method2289();
        }
    }

    @ObfuscatedName("an.ab(II)V")
    public final void method569(int arg0) {
        class194 var2 = (class194) class194.field2842.method2240((long) arg0);
        class194 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2853.method3163(33, arg0);
            class194 var5 = new class194();
            if (var4 != null) {
                var5.method3348(new class154(var4));
            }
            class194.field2842.method2246(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class194 var6 = var3;
        for (class35 var7 = (class35) this.field637.method2279(); var7 != null; var7 = (class35) this.field637.method2270()) {
            if (var7.field775 == var6) {
                var7.method2289();
                return;
            }
        }
    }
}
