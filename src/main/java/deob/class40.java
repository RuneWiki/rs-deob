package deob;

@ObfuscatedName("ap")
public abstract class class40 extends class89 {

    @ObfuscatedName("ap.al")
    public int field880;

    @ObfuscatedName("ap.av")
    public int field827;

    @ObfuscatedName("ap.ad")
    public int field857;

    @ObfuscatedName("ap.at")
    public boolean field829 = false;

    @ObfuscatedName("ap.aj")
    public int field842 = 1;

    @ObfuscatedName("ap.am")
    public int field831 = -1;

    @ObfuscatedName("ap.ay")
    public int field832 = -1;

    @ObfuscatedName("ap.ag")
    public int field833 = -1;

    @ObfuscatedName("ap.aa")
    public int field834 = -1;

    @ObfuscatedName("ap.ak")
    public int field835 = -1;

    @ObfuscatedName("ap.ar")
    public int field836 = -1;

    @ObfuscatedName("ap.ax")
    public int field837 = -1;

    @ObfuscatedName("ap.ap")
    public int field873 = -1;

    @ObfuscatedName("ap.ao")
    public String field839 = null;

    @ObfuscatedName("ap.aw")
    public boolean field869;

    @ObfuscatedName("ap.ai")
    public boolean field841 = false;

    @ObfuscatedName("ap.af")
    public int field885 = 100;

    @ObfuscatedName("ap.an")
    public int field843 = 0;

    @ObfuscatedName("ap.au")
    public int field844 = 0;

    @ObfuscatedName("ap.ae")
    public byte field845 = 0;

    @ObfuscatedName("ap.az")
    public int[] field838 = new int[4];

    @ObfuscatedName("ap.ah")
    public int[] field847 = new int[4];

    @ObfuscatedName("ap.as")
    public int[] field848 = new int[4];

    @ObfuscatedName("ap.ab")
    public int[] field887 = new int[4];

    @ObfuscatedName("ap.bn")
    public int[] field850 = new int[4];

    @ObfuscatedName("ap.bl")
    public class206 field849 = new class206();

    @ObfuscatedName("ap.bq")
    public int field876 = -1;

    @ObfuscatedName("ap.bg")
    public boolean field853 = false;

    @ObfuscatedName("ap.bk")
    public int field846 = -1;

    @ObfuscatedName("ap.bz")
    public int field826 = -1;

    @ObfuscatedName("ap.bm")
    public int field855 = 0;

    @ObfuscatedName("ap.bi")
    public int field854 = 0;

    @ObfuscatedName("ap.bt")
    public int field851 = -1;

    @ObfuscatedName("ap.bu")
    public int field860 = 0;

    @ObfuscatedName("ap.bc")
    public int field840 = 0;

    @ObfuscatedName("ap.bw")
    public int field861 = 0;

    @ObfuscatedName("ap.br")
    public int field862 = 0;

    @ObfuscatedName("ap.be")
    public int field863 = -1;

    @ObfuscatedName("ap.bx")
    public int field828 = 0;

    @ObfuscatedName("ap.bs")
    public int field865 = 0;

    @ObfuscatedName("ap.bd")
    public int field866;

    @ObfuscatedName("ap.bf")
    public int field867;

    @ObfuscatedName("ap.bb")
    public int field868;

    @ObfuscatedName("ap.bp")
    public int field830;

    @ObfuscatedName("ap.ba")
    public int field870;

    @ObfuscatedName("ap.by")
    public int field871;

    @ObfuscatedName("ap.bo")
    public int field872;

    @ObfuscatedName("ap.bv")
    public int field856;

    @ObfuscatedName("ap.bh")
    public int field874;

    @ObfuscatedName("ap.bj")
    public int field859 = 0;

    @ObfuscatedName("ap.cv")
    public int field858 = 200;

    @ObfuscatedName("ap.cs")
    public int field877;

    @ObfuscatedName("ap.ca")
    public int field878 = 0;

    @ObfuscatedName("ap.cn")
    public int field879 = 32;

    @ObfuscatedName("ap.cx")
    public int field852 = 0;

    @ObfuscatedName("ap.cu")
    public int[] field881 = new int[10];

    @ObfuscatedName("ap.cc")
    public int[] field882 = new int[10];

    @ObfuscatedName("ap.ci")
    public byte[] field883 = new byte[10];

    @ObfuscatedName("ap.ce")
    public int field884 = 0;

    @ObfuscatedName("ap.cm")
    public int field864 = 0;

    @ObfuscatedName("ap.ay(I)V")
    public final void method744() {
        this.field852 = 0;
        this.field864 = 0;
    }

    @ObfuscatedName("ap.m(I)Z")
    public boolean method18() {
        return false;
    }

    @ObfuscatedName("ap.ag(IIIIIII)V")
    public final void method745(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field848[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class52 var13 = class52.method858(arg0);
            var11 = var13.field1131;
            var12 = var13.field1122;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field848[0];
            } else if (var11 == 1) {
                var14 = this.field847[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field848[var15] < var14) {
                        var10 = var15;
                        var14 = this.field848[var15];
                    }
                } else if (var11 == 1 && this.field847[var15] < var14) {
                    var10 = var15;
                    var14 = this.field847[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field845 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field845;
                this.field845 = (byte) ((this.field845 + 1) % 4);
                if (this.field848[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field838[var10] = arg0;
        this.field847[var10] = arg1;
        this.field887[var10] = arg2;
        this.field850[var10] = arg3;
        this.field848[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("ap.aa(IIIIIIB)V")
    public final void method753(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class50 var7 = class50.method2725(arg0);
        class27 var8 = null;
        class27 var9 = null;
        int var10 = var7.field1092;
        int var11 = 0;
        for (class27 var12 = (class27) this.field849.method3645(); var12 != null; var12 = (class27) this.field849.method3665()) {
            var11++;
            if (var12.field630.field1089 == var7.field1089) {
                var12.method606(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field630.field1100 <= var7.field1100) {
                var8 = var12;
            }
            if (var12.field630.field1092 > var10) {
                var9 = var12;
                var10 = var12.field630.field1092;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class27 var13 = new class27(var7);
        if (var8 == null) {
            this.field849.method3654(var13);
        } else {
            class206.method3639(var13, var8);
        }
        var13.method606(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3703();
        }
    }

    @ObfuscatedName("ap.ak(II)V")
    public final void method748(int arg0) {
        class50 var2 = class50.method2725(arg0);
        for (class27 var3 = (class27) this.field849.method3645(); var3 != null; var3 = (class27) this.field849.method3665()) {
            if (var3.field630 == var2) {
                var3.method3703();
                return;
            }
        }
    }
}
