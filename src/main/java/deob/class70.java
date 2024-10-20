package deob;

@ObfuscatedName("bw")
public abstract class class70 extends class135 {

    @ObfuscatedName("bw.at")
    public int field949;

    @ObfuscatedName("bw.ad")
    public int field922;

    @ObfuscatedName("bw.as")
    public int field923;

    @ObfuscatedName("bw.ac")
    public boolean field924 = false;

    @ObfuscatedName("bw.an")
    public int field950 = 1;

    @ObfuscatedName("bw.ak")
    public int field926;

    @ObfuscatedName("bw.ah")
    public int field927 = -1;

    @ObfuscatedName("bw.al")
    public int field928 = -1;

    @ObfuscatedName("bw.am")
    public int field962 = -1;

    @ObfuscatedName("bw.ao")
    public int field937 = -1;

    @ObfuscatedName("bw.aq")
    public int field931 = -1;

    @ObfuscatedName("bw.aw")
    public int field948 = -1;

    @ObfuscatedName("bw.ab")
    public int field980 = -1;

    @ObfuscatedName("bw.ae")
    public int field934 = -1;

    @ObfuscatedName("bw.au")
    public String field935 = null;

    @ObfuscatedName("bw.ay")
    public boolean field936;

    @ObfuscatedName("bw.az")
    public boolean field938 = false;

    @ObfuscatedName("bw.aj")
    public int field978 = 100;

    @ObfuscatedName("bw.ar")
    public int field939 = 0;

    @ObfuscatedName("bw.ax")
    public int field940 = 0;

    @ObfuscatedName("bw.av")
    public byte field929 = 0;

    @ObfuscatedName("bw.af")
    public int[] field942 = new int[4];

    @ObfuscatedName("bw.bf")
    public int[] field946 = new int[4];

    @ObfuscatedName("bw.bi")
    public int[] field944 = new int[4];

    @ObfuscatedName("bw.bx")
    public int[] field945 = new int[4];

    @ObfuscatedName("bw.bu")
    public int[] field963 = new int[4];

    @ObfuscatedName("bw.bq")
    public class211 field947 = new class211();

    @ObfuscatedName("bw.be")
    public int field930 = -1;

    @ObfuscatedName("bw.bj")
    public boolean field983 = false;

    @ObfuscatedName("bw.bm")
    public int field932 = -1;

    @ObfuscatedName("bw.bv")
    public int field951 = -1;

    @ObfuscatedName("bw.bc")
    public int field952 = 0;

    @ObfuscatedName("bw.bh")
    public int field953 = 0;

    @ObfuscatedName("bw.bo")
    public int field954 = -1;

    @ObfuscatedName("bw.bk")
    public int field955 = 0;

    @ObfuscatedName("bw.bt")
    public int field956 = 0;

    @ObfuscatedName("bw.bs")
    public int field969 = 0;

    @ObfuscatedName("bw.ba")
    public int field958 = 0;

    @ObfuscatedName("bw.br")
    public int field959 = -1;

    @ObfuscatedName("bw.bw")
    public int field960 = 0;

    @ObfuscatedName("bw.bb")
    public int field961 = 0;

    @ObfuscatedName("bw.bl")
    public int field981;

    @ObfuscatedName("bw.bn")
    public int field966;

    @ObfuscatedName("bw.bd")
    public int field964;

    @ObfuscatedName("bw.bp")
    public int field965;

    @ObfuscatedName("bw.by")
    public int field943;

    @ObfuscatedName("bw.bg")
    public int field967;

    @ObfuscatedName("bw.bz")
    public int field968;

    @ObfuscatedName("bw.ch")
    public int field933;

    @ObfuscatedName("bw.cf")
    public int field970;

    @ObfuscatedName("bw.cm")
    public int field971 = 0;

    @ObfuscatedName("bw.cy")
    public int field972 = 200;

    @ObfuscatedName("bw.cx")
    public int field973;

    @ObfuscatedName("bw.cw")
    public int field976 = 0;

    @ObfuscatedName("bw.cu")
    public int field975 = 32;

    @ObfuscatedName("bw.cr")
    public int field957 = 0;

    @ObfuscatedName("bw.ca")
    public int[] field977 = new int[10];

    @ObfuscatedName("bw.ce")
    public int[] field982 = new int[10];

    @ObfuscatedName("bw.co")
    public byte[] field979 = new byte[10];

    @ObfuscatedName("bw.cz")
    public int field925 = 0;

    @ObfuscatedName("bw.cd")
    public int field921 = 0;

    @ObfuscatedName("bw.ar(I)V")
    public final void method1574() {
        this.field957 = 0;
        this.field921 = 0;
    }

    @ObfuscatedName("bw.v(B)Z")
    public boolean method1105() {
        return false;
    }

    @ObfuscatedName("bw.ax(IIIIIIB)V")
    public final void method1573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field944[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class273 var13 = class273.method4290(arg0);
            var11 = var13.field3438;
            var12 = var13.field3426;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field944[0];
            } else if (var11 == 1) {
                var14 = this.field946[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field944[var15] < var14) {
                        var10 = var15;
                        var14 = this.field944[var15];
                    }
                } else if (var11 == 1 && this.field946[var15] < var14) {
                    var10 = var15;
                    var14 = this.field946[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field929 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field929;
                this.field929 = (byte) ((this.field929 + 1) % 4);
                if (this.field944[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field942[var10] = arg0;
        this.field946[var10] = arg1;
        this.field945[var10] = arg2;
        this.field963[var10] = arg3;
        this.field944[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bw.ap(IIIIIII)V")
    public final void method1576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class267 var7 = class267.method4210(arg0);
        class78 var8 = null;
        class78 var9 = null;
        int var10 = var7.field3374;
        int var11 = 0;
        for (class78 var12 = (class78) this.field947.method3953(); var12 != null; var12 = (class78) this.field947.method3955()) {
            var11++;
            if (var12.field1080.field3378 == var7.field3378) {
                var12.method1825(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1080.field3376 <= var7.field3376) {
                var8 = var12;
            }
            if (var12.field1080.field3374 > var10) {
                var9 = var12;
                var10 = var12.field1080.field3374;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class78 var13 = new class78(var7);
        if (var8 == null) {
            this.field947.method3965(var13);
        } else {
            class211.method3952(var13, var8);
        }
        var13.method1825(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3973();
        }
    }

    @ObfuscatedName("bw.av(II)V")
    public final void method1577(int arg0) {
        class267 var2 = class267.method4210(arg0);
        for (class78 var3 = (class78) this.field947.method3953(); var3 != null; var3 = (class78) this.field947.method3955()) {
            if (var3.field1080 == var2) {
                var3.method3973();
                return;
            }
        }
    }
}
