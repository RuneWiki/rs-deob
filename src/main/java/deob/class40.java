package deob;

@ObfuscatedName("ay")
public abstract class class40 extends class89 {

    @ObfuscatedName("ay.an")
    public boolean field821 = false;

    @ObfuscatedName("ay.ag")
    public int field852;

    @ObfuscatedName("ay.as")
    public int field869;

    @ObfuscatedName("ay.aq")
    public int field820;

    @ObfuscatedName("ay.ax")
    public int field822 = 1;

    @ObfuscatedName("ay.az")
    public int field818 = -1;

    @ObfuscatedName("ay.ap")
    public int field840 = -1;

    @ObfuscatedName("ay.ao")
    public int field853 = -1;

    @ObfuscatedName("ay.af")
    public int field826 = -1;

    @ObfuscatedName("ay.au")
    public int field827 = -1;

    @ObfuscatedName("ay.ab")
    public int field828 = -1;

    @ObfuscatedName("ay.at")
    public int field870 = -1;

    @ObfuscatedName("ay.ay")
    public int field830 = -1;

    @ObfuscatedName("ay.ad")
    public String field867 = null;

    @ObfuscatedName("ay.am")
    public boolean field829;

    @ObfuscatedName("ay.ac")
    public boolean field833 = false;

    @ObfuscatedName("ay.aw")
    public int field839 = 100;

    @ObfuscatedName("ay.ak")
    public int field835 = 0;

    @ObfuscatedName("ay.ar")
    public int field863 = 0;

    @ObfuscatedName("ay.av")
    public byte field837 = 0;

    @ObfuscatedName("ay.aj")
    public int[] field838 = new int[4];

    @ObfuscatedName("ay.al")
    public int[] field834 = new int[4];

    @ObfuscatedName("ay.ai")
    public int[] field877 = new int[4];

    @ObfuscatedName("ay.ae")
    public int[] field841 = new int[4];

    @ObfuscatedName("ay.bf")
    public int[] field842 = new int[4];

    @ObfuscatedName("ay.bx")
    public class206 field819 = new class206();

    @ObfuscatedName("ay.bh")
    public int field844 = -1;

    @ObfuscatedName("ay.bw")
    public boolean field845 = false;

    @ObfuscatedName("ay.bg")
    public int field846 = -1;

    @ObfuscatedName("ay.bu")
    public int field847 = -1;

    @ObfuscatedName("ay.bq")
    public int field848 = 0;

    @ObfuscatedName("ay.bb")
    public int field849 = 0;

    @ObfuscatedName("ay.bz")
    public int field850 = -1;

    @ObfuscatedName("ay.bk")
    public int field851 = 0;

    @ObfuscatedName("ay.bl")
    public int field843 = 0;

    @ObfuscatedName("ay.be")
    public int field832 = 0;

    @ObfuscatedName("ay.bp")
    public int field854 = 0;

    @ObfuscatedName("ay.bn")
    public int field855 = -1;

    @ObfuscatedName("ay.bc")
    public int field856 = 0;

    @ObfuscatedName("ay.bo")
    public int field857 = 0;

    @ObfuscatedName("ay.ba")
    public int field858;

    @ObfuscatedName("ay.bd")
    public int field859;

    @ObfuscatedName("ay.bs")
    public int field824;

    @ObfuscatedName("ay.bt")
    public int field861;

    @ObfuscatedName("ay.bi")
    public int field862;

    @ObfuscatedName("ay.bv")
    public int field875;

    @ObfuscatedName("ay.by")
    public int field864;

    @ObfuscatedName("ay.bm")
    public int field865;

    @ObfuscatedName("ay.bj")
    public int field866;

    @ObfuscatedName("ay.br")
    public int field860 = 0;

    @ObfuscatedName("ay.cm")
    public int field868 = 200;

    @ObfuscatedName("ay.ca")
    public int field836;

    @ObfuscatedName("ay.cg")
    public int field825 = 0;

    @ObfuscatedName("ay.cd")
    public int field871 = 32;

    @ObfuscatedName("ay.ck")
    public int field872 = 0;

    @ObfuscatedName("ay.cj")
    public int[] field873 = new int[10];

    @ObfuscatedName("ay.cb")
    public int[] field874 = new int[10];

    @ObfuscatedName("ay.cq")
    public byte[] field831 = new byte[10];

    @ObfuscatedName("ay.cw")
    public int field876 = 0;

    @ObfuscatedName("ay.cx")
    public int field823 = 0;

    @ObfuscatedName("ay.ah(B)V")
    public final void method724() {
        this.field872 = 0;
        this.field823 = 0;
    }

    @ObfuscatedName("ay.l(I)Z")
    public boolean method23() {
        return false;
    }

    @ObfuscatedName("ay.an(IIIIIII)V")
    public final void method725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
            class52 var13 = class52.method921(arg0);
            var11 = var13.field1108;
            var12 = var13.field1107;
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
                var14 = this.field834[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field877[var15] < var14) {
                        var10 = var15;
                        var14 = this.field877[var15];
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
                this.field837 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field837;
                this.field837 = (byte) ((this.field837 + 1) % 4);
                if (this.field877[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field838[var10] = arg0;
        this.field834[var10] = arg1;
        this.field841[var10] = arg2;
        this.field842[var10] = arg3;
        this.field877[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("ay.ag(IIIIIII)V")
    public final void method726(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class50 var7 = Statics.method2117(arg0);
        class27 var8 = null;
        class27 var9 = null;
        int var10 = var7.field1078;
        int var11 = 0;
        for (class27 var12 = (class27) this.field819.method3647(); var12 != null; var12 = (class27) this.field819.method3632()) {
            var11++;
            if (var12.field635.field1076 == var7.field1076) {
                var12.method574(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field635.field1082 <= var7.field1082) {
                var8 = var12;
            }
            if (var12.field635.field1078 > var10) {
                var9 = var12;
                var10 = var12.field635.field1078;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class27 var13 = new class27(var7);
        if (var8 == null) {
            this.field819.method3634(var13);
        } else {
            class206.method3635(var13, var8);
        }
        var13.method574(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3695();
        }
    }

    @ObfuscatedName("ay.as(II)V")
    public final void method727(int arg0) {
        class50 var2 = Statics.method2117(arg0);
        for (class27 var3 = (class27) this.field819.method3647(); var3 != null; var3 = (class27) this.field819.method3632()) {
            if (var3.field635 == var2) {
                var3.method3695();
                return;
            }
        }
    }
}
