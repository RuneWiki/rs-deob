package deob;

@ObfuscatedName("bn")
public abstract class class65 extends class130 {

    @ObfuscatedName("bn.ax")
    public int field953;

    @ObfuscatedName("bn.ay")
    public int field919;

    @ObfuscatedName("bn.aa")
    public int field904;

    @ObfuscatedName("bn.ag")
    public boolean field955 = false;

    @ObfuscatedName("bn.aj")
    public int field964 = 1;

    @ObfuscatedName("bn.an")
    public int field907;

    @ObfuscatedName("bn.ap")
    public int field908 = -1;

    @ObfuscatedName("bn.am")
    public int field909 = -1;

    @ObfuscatedName("bn.ae")
    public int field916 = -1;

    @ObfuscatedName("bn.ac")
    public int field911 = -1;

    @ObfuscatedName("bn.ah")
    public int field910 = -1;

    @ObfuscatedName("bn.aq")
    public int field913 = -1;

    @ObfuscatedName("bn.af")
    public int field914 = -1;

    @ObfuscatedName("bn.ab")
    public int field915 = -1;

    @ObfuscatedName("bn.ar")
    public String field959 = null;

    @ObfuscatedName("bn.ao")
    public boolean field917;

    @ObfuscatedName("bn.at")
    public boolean field918 = false;

    @ObfuscatedName("bn.ad")
    public int field933 = 100;

    @ObfuscatedName("bn.ai")
    public int field920 = 0;

    @ObfuscatedName("bn.ak")
    public int field921 = 0;

    @ObfuscatedName("bn.az")
    public byte field922 = 0;

    @ObfuscatedName("bn.aw")
    public int[] field923 = new int[4];

    @ObfuscatedName("bn.bv")
    public int[] field932 = new int[4];

    @ObfuscatedName("bn.bh")
    public int[] field925 = new int[4];

    @ObfuscatedName("bn.bq")
    public int[] field926 = new int[4];

    @ObfuscatedName("bn.bm")
    public int[] field927 = new int[4];

    @ObfuscatedName("bn.bw")
    public class206 field942 = new class206();

    @ObfuscatedName("bn.bi")
    public int field929 = -1;

    @ObfuscatedName("bn.bb")
    public boolean field905 = false;

    @ObfuscatedName("bn.bd")
    public int field931 = -1;

    @ObfuscatedName("bn.bu")
    public int field906 = -1;

    @ObfuscatedName("bn.bo")
    public int field951 = 0;

    @ObfuscatedName("bn.bt")
    public int field934 = 0;

    @ObfuscatedName("bn.by")
    public int field935 = -1;

    @ObfuscatedName("bn.bn")
    public int field936 = 0;

    @ObfuscatedName("bn.be")
    public int field937 = 0;

    @ObfuscatedName("bn.bs")
    public int field938 = 0;

    @ObfuscatedName("bn.bc")
    public int field939 = 0;

    @ObfuscatedName("bn.bx")
    public int field940 = -1;

    @ObfuscatedName("bn.bg")
    public int field946 = 0;

    @ObfuscatedName("bn.bj")
    public int field950 = 0;

    @ObfuscatedName("bn.ba")
    public int field943;

    @ObfuscatedName("bn.bp")
    public int field941;

    @ObfuscatedName("bn.bf")
    public int field945;

    @ObfuscatedName("bn.br")
    public int field928;

    @ObfuscatedName("bn.bz")
    public int field912;

    @ObfuscatedName("bn.bl")
    public int field947;

    @ObfuscatedName("bn.bk")
    public int field930;

    @ObfuscatedName("bn.cn")
    public int field948;

    @ObfuscatedName("bn.co")
    public int field924;

    @ObfuscatedName("bn.cy")
    public int field952 = 0;

    @ObfuscatedName("bn.cf")
    public int field902 = 200;

    @ObfuscatedName("bn.cc")
    public int field954;

    @ObfuscatedName("bn.cl")
    public int field949 = 0;

    @ObfuscatedName("bn.cp")
    public int field956 = 32;

    @ObfuscatedName("bn.cq")
    public int field957 = 0;

    @ObfuscatedName("bn.cw")
    public int[] field958 = new int[10];

    @ObfuscatedName("bn.ch")
    public int[] field944 = new int[10];

    @ObfuscatedName("bn.cg")
    public byte[] field960 = new byte[10];

    @ObfuscatedName("bn.cu")
    public int field961 = 0;

    @ObfuscatedName("bn.cz")
    public int field962 = 0;

    @ObfuscatedName("bn.az(I)V")
    public final void method1465() {
        this.field957 = 0;
        this.field962 = 0;
    }

    @ObfuscatedName("bn.q(I)Z")
    public boolean method1030() {
        return false;
    }

    @ObfuscatedName("bn.aw(IIIIIIB)V")
    public final void method1467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field925[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class270 var13 = class270.method4489(arg0);
            var11 = var13.field3411;
            var12 = var13.field3426;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field925[0];
            } else if (var11 == 1) {
                var14 = this.field932[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field925[var15] < var14) {
                        var10 = var15;
                        var14 = this.field925[var15];
                    }
                } else if (var11 == 1 && this.field932[var15] < var14) {
                    var10 = var15;
                    var14 = this.field932[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field922 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field922;
                this.field922 = (byte) ((this.field922 + 1) % 4);
                if (this.field925[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field923[var10] = arg0;
        this.field932[var10] = arg1;
        this.field926[var10] = arg2;
        this.field927[var10] = arg3;
        this.field925[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bn.bv(IIIIIII)V")
    public final void method1469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class264 var7 = class264.method1906(arg0);
        class73 var8 = null;
        class73 var9 = null;
        int var10 = var7.field3361;
        int var11 = 0;
        for (class73 var12 = (class73) this.field942.method3779(); var12 != null; var12 = (class73) this.field942.method3780()) {
            var11++;
            if (var12.field1064.field3370 == var7.field3370) {
                var12.method1690(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1064.field3364 <= var7.field3364) {
                var8 = var12;
            }
            if (var12.field1064.field3361 > var10) {
                var9 = var12;
                var10 = var12.field1064.field3361;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class73 var13 = new class73(var7);
        if (var8 == null) {
            this.field942.method3777(var13);
        } else {
            class206.method3790(var13, var8);
        }
        var13.method1690(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3812();
        }
    }

    @ObfuscatedName("bn.bh(IB)V")
    public final void method1464(int arg0) {
        class264 var2 = class264.method1906(arg0);
        for (class73 var3 = (class73) this.field942.method3779(); var3 != null; var3 = (class73) this.field942.method3780()) {
            if (var3.field1064 == var2) {
                var3.method3812();
                return;
            }
        }
    }
}
