package deob;

@ObfuscatedName("ay")
public abstract class class40 extends class89 {

    @ObfuscatedName("ay.as")
    public int field876;

    @ObfuscatedName("ay.ac")
    public int field833;

    @ObfuscatedName("ay.ah")
    public int field858;

    @ObfuscatedName("ay.am")
    public boolean field835 = false;

    @ObfuscatedName("ay.aq")
    public int field878 = 1;

    @ObfuscatedName("ay.az")
    public int field839 = -1;

    @ObfuscatedName("ay.ak")
    public int field867 = -1;

    @ObfuscatedName("ay.ag")
    public int field854 = -1;

    @ObfuscatedName("ay.af")
    public int field880 = -1;

    @ObfuscatedName("ay.ab")
    public int field841 = -1;

    @ObfuscatedName("ay.ap")
    public int field842 = -1;

    @ObfuscatedName("ay.ao")
    public int field832 = -1;

    @ObfuscatedName("ay.ay")
    public int field844 = -1;

    @ObfuscatedName("ay.ai")
    public String field836 = null;

    @ObfuscatedName("ay.aj")
    public boolean field846;

    @ObfuscatedName("ay.ae")
    public boolean field853 = false;

    @ObfuscatedName("ay.ar")
    public int field848 = 100;

    @ObfuscatedName("ay.at")
    public int field886 = 0;

    @ObfuscatedName("ay.av")
    public int field882 = 0;

    @ObfuscatedName("ay.au")
    public byte field851 = 0;

    @ObfuscatedName("ay.ax")
    public int[] field852 = new int[4];

    @ObfuscatedName("ay.al")
    public int[] field834 = new int[4];

    @ObfuscatedName("ay.an")
    public int[] field843 = new int[4];

    @ObfuscatedName("ay.aa")
    public int[] field855 = new int[4];

    @ObfuscatedName("ay.bc")
    public int[] field856 = new int[4];

    @ObfuscatedName("ay.bq")
    public class206 field871 = new class206();

    @ObfuscatedName("ay.bj")
    public int field845 = -1;

    @ObfuscatedName("ay.bt")
    public boolean field866 = false;

    @ObfuscatedName("ay.bn")
    public int field860 = -1;

    @ObfuscatedName("ay.bo")
    public int field861 = -1;

    @ObfuscatedName("ay.bu")
    public int field862 = 0;

    @ObfuscatedName("ay.bs")
    public int field863 = 0;

    @ObfuscatedName("ay.be")
    public int field864 = -1;

    @ObfuscatedName("ay.by")
    public int field837 = 0;

    @ObfuscatedName("ay.bw")
    public int field849 = 0;

    @ObfuscatedName("ay.bm")
    public int field865 = 0;

    @ObfuscatedName("ay.bv")
    public int field868 = 0;

    @ObfuscatedName("ay.bz")
    public int field869 = -1;

    @ObfuscatedName("ay.bp")
    public int field891 = 0;

    @ObfuscatedName("ay.ba")
    public int field859 = 0;

    @ObfuscatedName("ay.bi")
    public int field872;

    @ObfuscatedName("ay.bh")
    public int field873;

    @ObfuscatedName("ay.bx")
    public int field874;

    @ObfuscatedName("ay.bb")
    public int field875;

    @ObfuscatedName("ay.bg")
    public int field857;

    @ObfuscatedName("ay.br")
    public int field877;

    @ObfuscatedName("ay.bf")
    public int field892;

    @ObfuscatedName("ay.bk")
    public int field879;

    @ObfuscatedName("ay.bd")
    public int field885;

    @ObfuscatedName("ay.bl")
    public int field881 = 0;

    @ObfuscatedName("ay.cw")
    public int field838 = 200;

    @ObfuscatedName("ay.ce")
    public int field883;

    @ObfuscatedName("ay.ca")
    public int field884 = 0;

    @ObfuscatedName("ay.cl")
    public int field847 = 32;

    @ObfuscatedName("ay.cg")
    public int field850 = 0;

    @ObfuscatedName("ay.cf")
    public int[] field887 = new int[10];

    @ObfuscatedName("ay.ch")
    public int[] field888 = new int[10];

    @ObfuscatedName("ay.cm")
    public byte[] field889 = new byte[10];

    @ObfuscatedName("ay.cy")
    public int field890 = 0;

    @ObfuscatedName("ay.ck")
    public int field840 = 0;

    @ObfuscatedName("ay.t(I)V")
    public final void method771() {
        this.field850 = 0;
        this.field840 = 0;
    }

    @ObfuscatedName("ay.k(B)Z")
    public boolean method38() {
        return false;
    }

    @ObfuscatedName("ay.y(IIIIIII)V")
    public final void method772(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field843[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class52 var13 = class52.method53(arg0);
            var11 = var13.field1145;
            var12 = var13.field1136;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field843[0];
            } else if (var11 == 1) {
                var14 = this.field834[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field843[var15] < var14) {
                        var10 = var15;
                        var14 = this.field843[var15];
                    }
                } else if (var11 == 1 && this.field834[var15] < var14) {
                    var10 = var15;
                    var14 = this.field834[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field851 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field851;
                this.field851 = (byte) ((this.field851 + 1) % 4);
                if (this.field843[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field852[var10] = arg0;
        this.field834[var10] = arg1;
        this.field855[var10] = arg2;
        this.field856[var10] = arg3;
        this.field843[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("ay.a(IIIIIIB)V")
    public final void method773(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class50 var7 = (class50) class50.field1101.method3653((long) arg0);
        class50 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field1107.method3210(33, arg0);
            class50 var10 = new class50();
            if (var9 != null) {
                var10.method1011(new class123(var9));
            }
            class50.field1101.method3655(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class50 var11 = var8;
        class27 var12 = null;
        class27 var13 = null;
        int var14 = var8.field1106;
        int var15 = 0;
        for (class27 var16 = (class27) this.field871.method3759(); var16 != null; var16 = (class27) this.field871.method3761()) {
            var15++;
            if (var16.field656.field1103 == var11.field1103) {
                var16.method611(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field656.field1105 <= var11.field1105) {
                var12 = var16;
            }
            if (var16.field656.field1106 > var14) {
                var13 = var16;
                var14 = var16.field656.field1106;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class27 var17 = new class27(var11);
        if (var12 == null) {
            this.field871.method3757(var17);
        } else {
            class206.method3758(var17, var12);
        }
        var17.method611(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3815();
        }
    }

    @ObfuscatedName("ay.c(IB)V")
    public final void method774(int arg0) {
        class50 var2 = (class50) class50.field1101.method3653((long) arg0);
        class50 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field1107.method3210(33, arg0);
            class50 var5 = new class50();
            if (var4 != null) {
                var5.method1011(new class123(var4));
            }
            class50.field1101.method3655(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class50 var6 = var3;
        for (class27 var7 = (class27) this.field871.method3759(); var7 != null; var7 = (class27) this.field871.method3761()) {
            if (var7.field656 == var6) {
                var7.method3815();
                return;
            }
        }
    }
}
