package deob;

@ObfuscatedName("bj")
public abstract class class65 extends class130 {

    @ObfuscatedName("bj.an")
    public boolean field926 = false;

    @ObfuscatedName("bj.ay")
    public int field933;

    @ObfuscatedName("bj.av")
    public int field964;

    @ObfuscatedName("bj.af")
    public int field921;

    @ObfuscatedName("bj.ar")
    public int field911 = 1;

    @ObfuscatedName("bj.am")
    public int field912;

    @ObfuscatedName("bj.aj")
    public int field913 = -1;

    @ObfuscatedName("bj.aq")
    public int field914 = -1;

    @ObfuscatedName("bj.ak")
    public int field915 = -1;

    @ObfuscatedName("bj.ax")
    public int field916 = -1;

    @ObfuscatedName("bj.aw")
    public int field917 = -1;

    @ObfuscatedName("bj.au")
    public int field945 = -1;

    @ObfuscatedName("bj.ad")
    public int field919 = -1;

    @ObfuscatedName("bj.ah")
    public int field920 = -1;

    @ObfuscatedName("bj.as")
    public String field955 = null;

    @ObfuscatedName("bj.ag")
    public boolean field922;

    @ObfuscatedName("bj.at")
    public boolean field923 = false;

    @ObfuscatedName("bj.ae")
    public int field924 = 100;

    @ObfuscatedName("bj.ap")
    public int field925 = 0;

    @ObfuscatedName("bj.ai")
    public int field939 = 0;

    @ObfuscatedName("bj.az")
    public byte field946 = 0;

    @ObfuscatedName("bj.al")
    public int[] field928 = new int[4];

    @ObfuscatedName("bj.be")
    public int[] field929 = new int[4];

    @ObfuscatedName("bj.br")
    public int[] field930 = new int[4];

    @ObfuscatedName("bj.bi")
    public int[] field963 = new int[4];

    @ObfuscatedName("bj.bg")
    public int[] field960 = new int[4];

    @ObfuscatedName("bj.ba")
    public class206 field908 = new class206();

    @ObfuscatedName("bj.bw")
    public int field934 = -1;

    @ObfuscatedName("bj.bx")
    public boolean field935 = false;

    @ObfuscatedName("bj.bh")
    public int field936 = -1;

    @ObfuscatedName("bj.bk")
    public int field937 = -1;

    @ObfuscatedName("bj.bp")
    public int field938 = 0;

    @ObfuscatedName("bj.bf")
    public int field909 = 0;

    @ObfuscatedName("bj.bb")
    public int field944 = -1;

    @ObfuscatedName("bj.bj")
    public int field932 = 0;

    @ObfuscatedName("bj.by")
    public int field942 = 0;

    @ObfuscatedName("bj.bv")
    public int field943 = 0;

    @ObfuscatedName("bj.bn")
    public int field951 = 0;

    @ObfuscatedName("bj.bq")
    public int field941 = -1;

    @ObfuscatedName("bj.bt")
    public int field931 = 0;

    @ObfuscatedName("bj.bm")
    public int field947 = 0;

    @ObfuscatedName("bj.bz")
    public int field948;

    @ObfuscatedName("bj.bd")
    public int field949;

    @ObfuscatedName("bj.bo")
    public int field950;

    @ObfuscatedName("bj.bl")
    public int field918;

    @ObfuscatedName("bj.bs")
    public int field952;

    @ObfuscatedName("bj.bc")
    public int field953;

    @ObfuscatedName("bj.bu")
    public int field954;

    @ObfuscatedName("bj.cd")
    public int field907;

    @ObfuscatedName("bj.ci")
    public int field956;

    @ObfuscatedName("bj.cu")
    public int field957 = 0;

    @ObfuscatedName("bj.ck")
    public int field958 = 200;

    @ObfuscatedName("bj.ch")
    public int field961;

    @ObfuscatedName("bj.cs")
    public int field910 = 0;

    @ObfuscatedName("bj.cx")
    public int field959 = 32;

    @ObfuscatedName("bj.cp")
    public int field962 = 0;

    @ObfuscatedName("bj.ce")
    public int[] field927 = new int[10];

    @ObfuscatedName("bj.cb")
    public int[] field940 = new int[10];

    @ObfuscatedName("bj.cz")
    public byte[] field965 = new byte[10];

    @ObfuscatedName("bj.cn")
    public int field966 = 0;

    @ObfuscatedName("bj.cg")
    public int field967 = 0;

    @ObfuscatedName("bj.ae(I)V")
    public final void method1452() {
        this.field962 = 0;
        this.field967 = 0;
    }

    @ObfuscatedName("bj.q(B)Z")
    public boolean method1040() {
        return false;
    }

    @ObfuscatedName("bj.ap(IIIIIII)V")
    public final void method1453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field930[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class270 var13 = class270.method938(arg0);
            var11 = var13.field3394;
            var12 = var13.field3385;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field930[0];
            } else if (var11 == 1) {
                var14 = this.field929[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field930[var15] < var14) {
                        var10 = var15;
                        var14 = this.field930[var15];
                    }
                } else if (var11 == 1 && this.field929[var15] < var14) {
                    var10 = var15;
                    var14 = this.field929[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field946 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field946;
                this.field946 = (byte) ((this.field946 + 1) % 4);
                if (this.field930[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field928[var10] = arg0;
        this.field929[var10] = arg1;
        this.field963[var10] = arg2;
        this.field960[var10] = arg3;
        this.field930[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bj.ai(IIIIIII)V")
    public final void method1454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class264 var7 = class264.method947(arg0);
        class73 var8 = null;
        class73 var9 = null;
        int var10 = var7.field3336;
        int var11 = 0;
        for (class73 var12 = (class73) this.field908.method3757(); var12 != null; var12 = (class73) this.field908.method3779()) {
            var11++;
            if (var12.field1069.field3334 == var7.field3334) {
                var12.method1683(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1069.field3335 <= var7.field3335) {
                var8 = var12;
            }
            if (var12.field1069.field3336 > var10) {
                var9 = var12;
                var10 = var12.field1069.field3336;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class73 var13 = new class73(var7);
        if (var8 == null) {
            this.field908.method3776(var13);
        } else {
            class206.method3756(var13, var8);
        }
        var13.method1683(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3787();
        }
    }

    @ObfuscatedName("bj.aa(II)V")
    public final void method1455(int arg0) {
        class264 var2 = class264.method947(arg0);
        for (class73 var3 = (class73) this.field908.method3757(); var3 != null; var3 = (class73) this.field908.method3779()) {
            if (var3.field1069 == var2) {
                var3.method3787();
                return;
            }
        }
    }
}
