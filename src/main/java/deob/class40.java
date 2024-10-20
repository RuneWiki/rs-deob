package deob;

@ObfuscatedName("ab")
public abstract class class40 extends class89 {

    @ObfuscatedName("ab.as")
    public int field847;

    @ObfuscatedName("ab.af")
    public int field849;

    @ObfuscatedName("ab.am")
    public int field842;

    @ObfuscatedName("ab.ap")
    public boolean field843 = false;

    @ObfuscatedName("ab.aa")
    public int field844 = 1;

    @ObfuscatedName("ab.ar")
    public int field859 = -1;

    @ObfuscatedName("ab.av")
    public int field850 = -1;

    @ObfuscatedName("ab.ao")
    public int field891 = -1;

    @ObfuscatedName("ab.aq")
    public int field848 = -1;

    @ObfuscatedName("ab.ax")
    public int field888 = -1;

    @ObfuscatedName("ab.at")
    public int field864 = -1;

    @ObfuscatedName("ab.aw")
    public int field851 = -1;

    @ObfuscatedName("ab.ab")
    public int field852 = -1;

    @ObfuscatedName("ab.al")
    public String field853 = null;

    @ObfuscatedName("ab.ad")
    public boolean field854;

    @ObfuscatedName("ab.ah")
    public boolean field873 = false;

    @ObfuscatedName("ab.ak")
    public int field856 = 100;

    @ObfuscatedName("ab.ai")
    public int field857 = 0;

    @ObfuscatedName("ab.az")
    public int field858 = 0;

    @ObfuscatedName("ab.ay")
    public byte field862 = 0;

    @ObfuscatedName("ab.ag")
    public int[] field868 = new int[4];

    @ObfuscatedName("ab.ae")
    public int[] field861 = new int[4];

    @ObfuscatedName("ab.an")
    public int[] field877 = new int[4];

    @ObfuscatedName("ab.aj")
    public int[] field863 = new int[4];

    @ObfuscatedName("ab.bg")
    public int[] field889 = new int[4];

    @ObfuscatedName("ab.bf")
    public class206 field865 = new class206();

    @ObfuscatedName("ab.bl")
    public int field866 = -1;

    @ObfuscatedName("ab.bn")
    public boolean field867 = false;

    @ObfuscatedName("ab.bs")
    public int field886 = -1;

    @ObfuscatedName("ab.bc")
    public int field869 = -1;

    @ObfuscatedName("ab.bq")
    public int field870 = 0;

    @ObfuscatedName("ab.bp")
    public int field871 = 0;

    @ObfuscatedName("ab.bo")
    public int field872 = -1;

    @ObfuscatedName("ab.bd")
    public int field890 = 0;

    @ObfuscatedName("ab.bj")
    public int field882 = 0;

    @ObfuscatedName("ab.bh")
    public int field875 = 0;

    @ObfuscatedName("ab.bt")
    public int field876 = 0;

    @ObfuscatedName("ab.bx")
    public int field874 = -1;

    @ObfuscatedName("ab.bv")
    public int field878 = 0;

    @ObfuscatedName("ab.bm")
    public int field879 = 0;

    @ObfuscatedName("ab.bk")
    public int field880;

    @ObfuscatedName("ab.bu")
    public int field881;

    @ObfuscatedName("ab.be")
    public int field883;

    @ObfuscatedName("ab.bw")
    public int field855;

    @ObfuscatedName("ab.ba")
    public int field884;

    @ObfuscatedName("ab.by")
    public int field885;

    @ObfuscatedName("ab.bb")
    public int field860;

    @ObfuscatedName("ab.bi")
    public int field846;

    @ObfuscatedName("ab.bz")
    public int field840;

    @ObfuscatedName("ab.br")
    public int field887 = 0;

    @ObfuscatedName("ab.cb")
    public int field841 = 200;

    @ObfuscatedName("ab.ch")
    public int field892;

    @ObfuscatedName("ab.cw")
    public int field845 = 0;

    @ObfuscatedName("ab.cr")
    public int field893 = 32;

    @ObfuscatedName("ab.ci")
    public int field894 = 0;

    @ObfuscatedName("ab.cq")
    public int[] field895 = new int[10];

    @ObfuscatedName("ab.ce")
    public int[] field896 = new int[10];

    @ObfuscatedName("ab.co")
    public byte[] field897 = new byte[10];

    @ObfuscatedName("ab.cz")
    public int field898 = 0;

    @ObfuscatedName("ab.cm")
    public int field899 = 0;

    @ObfuscatedName("ab.l(B)V")
    public final void method765() {
        this.field894 = 0;
        this.field899 = 0;
    }

    @ObfuscatedName("ab.n(I)Z")
    public boolean method17() {
        return false;
    }

    @ObfuscatedName("ab.c(IIIIIII)V")
    public final void method773(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field877[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class52 var13 = class52.method219(arg0);
            var11 = var13.field1142;
            var12 = var13.field1133;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field877[0];
            } else if (var11 == 1) {
                var14 = this.field861[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field877[var15] < var14) {
                        var10 = var15;
                        var14 = this.field877[var15];
                    }
                } else if (var11 == 1 && this.field861[var15] < var14) {
                    var10 = var15;
                    var14 = this.field861[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field862 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field862;
                this.field862 = (byte) ((this.field862 + 1) % 4);
                if (this.field877[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field868[var10] = arg0;
        this.field861[var10] = arg1;
        this.field863[var10] = arg2;
        this.field889[var10] = arg3;
        this.field877[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("ab.f(IIIIIIB)V")
    public final void method767(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class50 var7 = class50.method2274(arg0);
        class27 var8 = null;
        class27 var9 = null;
        int var10 = var7.field1092;
        int var11 = 0;
        for (class27 var12 = (class27) this.field865.method3664(); var12 != null; var12 = (class27) this.field865.method3666()) {
            var11++;
            if (var12.field646.field1095 == var7.field1095) {
                var12.method604(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field646.field1097 <= var7.field1097) {
                var8 = var12;
            }
            if (var12.field646.field1092 > var10) {
                var9 = var12;
                var10 = var12.field646.field1092;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class27 var13 = new class27(var7);
        if (var8 == null) {
            this.field865.method3680(var13);
        } else {
            class206.method3663(var13, var8);
        }
        var13.method604(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3729();
        }
    }

    @ObfuscatedName("ab.ac(II)V")
    public final void method768(int arg0) {
        class50 var2 = class50.method2274(arg0);
        for (class27 var3 = (class27) this.field865.method3664(); var3 != null; var3 = (class27) this.field865.method3666()) {
            if (var3.field646 == var2) {
                var3.method3729();
                return;
            }
        }
    }
}
