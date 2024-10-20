package deob;

@ObfuscatedName("ag")
public abstract class class40 extends class89 {

    @ObfuscatedName("ag.ak")
    public int field897;

    @ObfuscatedName("ag.as")
    public int field880;

    @ObfuscatedName("ag.ae")
    public int field906;

    @ObfuscatedName("ag.ao")
    public boolean field854 = false;

    @ObfuscatedName("ag.av")
    public int field852 = 1;

    @ObfuscatedName("ag.al")
    public int field855 = -1;

    @ObfuscatedName("ag.ap")
    public int field857 = -1;

    @ObfuscatedName("ag.an")
    public int field858 = -1;

    @ObfuscatedName("ag.aw")
    public int field859 = -1;

    @ObfuscatedName("ag.ad")
    public int field851 = -1;

    @ObfuscatedName("ag.aa")
    public int field861 = -1;

    @ObfuscatedName("ag.at")
    public int field862 = -1;

    @ObfuscatedName("ag.ag")
    public int field899 = -1;

    @ObfuscatedName("ag.aq")
    public String field874 = null;

    @ObfuscatedName("ag.af")
    public boolean field865;

    @ObfuscatedName("ag.ax")
    public boolean field898 = false;

    @ObfuscatedName("ag.ai")
    public int field867 = 100;

    @ObfuscatedName("ag.ar")
    public int field868 = 0;

    @ObfuscatedName("ag.ab")
    public int field869 = 0;

    @ObfuscatedName("ag.au")
    public byte field864 = 0;

    @ObfuscatedName("ag.am")
    public int[] field871 = new int[4];

    @ObfuscatedName("ag.az")
    public int[] field872 = new int[4];

    @ObfuscatedName("ag.ay")
    public int[] field873 = new int[4];

    @ObfuscatedName("ag.ac")
    public int[] field902 = new int[4];

    @ObfuscatedName("ag.bw")
    public int[] field875 = new int[4];

    @ObfuscatedName("ag.bu")
    public class206 field876 = new class206();

    @ObfuscatedName("ag.bl")
    public int field877 = -1;

    @ObfuscatedName("ag.bp")
    public boolean field878 = false;

    @ObfuscatedName("ag.bq")
    public int field879 = -1;

    @ObfuscatedName("ag.bt")
    public int field901 = -1;

    @ObfuscatedName("ag.by")
    public int field881 = 0;

    @ObfuscatedName("ag.ba")
    public int field882 = 0;

    @ObfuscatedName("ag.bg")
    public int field891 = -1;

    @ObfuscatedName("ag.bh")
    public int field866 = 0;

    @ObfuscatedName("ag.bc")
    public int field885 = 0;

    @ObfuscatedName("ag.bb")
    public int field905 = 0;

    @ObfuscatedName("ag.bo")
    public int field887 = 0;

    @ObfuscatedName("ag.bf")
    public int field888 = -1;

    @ObfuscatedName("ag.bv")
    public int field889 = 0;

    @ObfuscatedName("ag.bk")
    public int field883 = 0;

    @ObfuscatedName("ag.bm")
    public int field870;

    @ObfuscatedName("ag.bj")
    public int field892;

    @ObfuscatedName("ag.be")
    public int field893;

    @ObfuscatedName("ag.br")
    public int field894;

    @ObfuscatedName("ag.bi")
    public int field895;

    @ObfuscatedName("ag.bx")
    public int field896;

    @ObfuscatedName("ag.bs")
    public int field884;

    @ObfuscatedName("ag.bz")
    public int field860;

    @ObfuscatedName("ag.bn")
    public int field863;

    @ObfuscatedName("ag.bd")
    public int field900 = 0;

    @ObfuscatedName("ag.ck")
    public int field856 = 200;

    @ObfuscatedName("ag.cb")
    public int field890;

    @ObfuscatedName("ag.cl")
    public int field903 = 0;

    @ObfuscatedName("ag.cf")
    public int field904 = 32;

    @ObfuscatedName("ag.ca")
    public int field853 = 0;

    @ObfuscatedName("ag.cc")
    public int[] field886 = new int[10];

    @ObfuscatedName("ag.cs")
    public int[] field907 = new int[10];

    @ObfuscatedName("ag.cn")
    public byte[] field908 = new byte[10];

    @ObfuscatedName("ag.ct")
    public int field909 = 0;

    @ObfuscatedName("ag.cp")
    public int field910 = 0;

    @ObfuscatedName("ag.ae(B)V")
    public final void method760() {
        this.field853 = 0;
        this.field910 = 0;
    }

    @ObfuscatedName("ag.b(I)Z")
    public boolean method16() {
        return false;
    }

    @ObfuscatedName("ag.ao(IIIIIII)V")
    public final void method764(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field873[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class52 var13 = class52.method1191(arg0);
            var11 = var13.field1144;
            var12 = var13.field1130;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field873[0];
            } else if (var11 == 1) {
                var14 = this.field872[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field873[var15] < var14) {
                        var10 = var15;
                        var14 = this.field873[var15];
                    }
                } else if (var11 == 1 && this.field872[var15] < var14) {
                    var10 = var15;
                    var14 = this.field872[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field864 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field864;
                this.field864 = (byte) ((this.field864 + 1) % 4);
                if (this.field873[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field871[var10] = arg0;
        this.field872[var10] = arg1;
        this.field902[var10] = arg2;
        this.field875[var10] = arg3;
        this.field873[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("ag.av(IIIIIIB)V")
    public final void method757(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class50 var7 = class50.method773(arg0);
        class27 var8 = null;
        class27 var9 = null;
        int var10 = var7.field1108;
        int var11 = 0;
        for (class27 var12 = (class27) this.field876.method3693(); var12 != null; var12 = (class27) this.field876.method3695()) {
            var11++;
            if (var12.field668.field1101 == var7.field1101) {
                var12.method581(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field668.field1096 <= var7.field1096) {
                var8 = var12;
            }
            if (var12.field668.field1108 > var10) {
                var9 = var12;
                var10 = var12.field668.field1108;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class27 var13 = new class27(var7);
        if (var8 == null) {
            this.field876.method3700(var13);
        } else {
            class206.method3692(var13, var8);
        }
        var13.method581(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3755();
        }
    }

    @ObfuscatedName("ag.al(II)V")
    public final void method762(int arg0) {
        class50 var2 = class50.method773(arg0);
        for (class27 var3 = (class27) this.field876.method3693(); var3 != null; var3 = (class27) this.field876.method3695()) {
            if (var3.field668 == var2) {
                var3.method3755();
                return;
            }
        }
    }
}
