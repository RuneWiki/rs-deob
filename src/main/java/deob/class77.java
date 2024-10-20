package deob;

@ObfuscatedName("by")
public abstract class class77 extends class140 {

    @ObfuscatedName("by.af")
    public int field1225;

    @ObfuscatedName("by.aa")
    public int field1211;

    @ObfuscatedName("by.ay")
    public int field1210;

    @ObfuscatedName("by.aw")
    public boolean field1213 = false;

    @ObfuscatedName("by.az")
    public int field1222 = 1;

    @ObfuscatedName("by.at")
    public int field1267 = -1;

    @ObfuscatedName("by.ao")
    public int field1254 = -1;

    @ObfuscatedName("by.aq")
    public int field1228 = -1;

    @ObfuscatedName("by.ax")
    public int field1218 = -1;

    @ObfuscatedName("by.av")
    public int field1219 = -1;

    @ObfuscatedName("by.al")
    public int field1220 = -1;

    @ObfuscatedName("by.ae")
    public int field1221 = -1;

    @ObfuscatedName("by.ab")
    public int field1217 = -1;

    @ObfuscatedName("by.aj")
    public String field1223 = null;

    @ObfuscatedName("by.ac")
    public boolean field1224;

    @ObfuscatedName("by.ad")
    public boolean field1233 = false;

    @ObfuscatedName("by.am")
    public int field1226 = 100;

    @ObfuscatedName("by.ah")
    public int field1227 = 0;

    @ObfuscatedName("by.ak")
    public int field1248 = 0;

    @ObfuscatedName("by.ag")
    public byte field1238 = 0;

    @ObfuscatedName("by.ai")
    public int[] field1230 = new int[4];

    @ObfuscatedName("by.au")
    public int[] field1231 = new int[4];

    @ObfuscatedName("by.an")
    public int[] field1232 = new int[4];

    @ObfuscatedName("by.as")
    public int[] field1260 = new int[4];

    @ObfuscatedName("by.br")
    public int[] field1234 = new int[4];

    @ObfuscatedName("by.bj")
    public class192 field1270 = new class192();

    @ObfuscatedName("by.bf")
    public int field1236 = -1;

    @ObfuscatedName("by.bw")
    public boolean field1237 = false;

    @ObfuscatedName("by.bs")
    public int field1250 = -1;

    @ObfuscatedName("by.bp")
    public int field1239 = -1;

    @ObfuscatedName("by.bv")
    public int field1240 = 0;

    @ObfuscatedName("by.bi")
    public int field1235 = 0;

    @ObfuscatedName("by.bz")
    public int field1242 = -1;

    @ObfuscatedName("by.bn")
    public int field1243 = 0;

    @ObfuscatedName("by.bx")
    public int field1244 = 0;

    @ObfuscatedName("by.bt")
    public int field1269 = 0;

    @ObfuscatedName("by.bc")
    public int field1246 = 0;

    @ObfuscatedName("by.bd")
    public int field1215 = -1;

    @ObfuscatedName("by.bo")
    public int field1216 = 0;

    @ObfuscatedName("by.bq")
    public int field1249 = 0;

    @ObfuscatedName("by.bl")
    public int field1247;

    @ObfuscatedName("by.bg")
    public int field1251;

    @ObfuscatedName("by.bm")
    public int field1252;

    @ObfuscatedName("by.bb")
    public int field1253;

    @ObfuscatedName("by.ba")
    public int field1212;

    @ObfuscatedName("by.bk")
    public int field1255;

    @ObfuscatedName("by.bh")
    public int field1241;

    @ObfuscatedName("by.be")
    public int field1257;

    @ObfuscatedName("by.by")
    public int field1258;

    @ObfuscatedName("by.bu")
    public int field1256 = 0;

    @ObfuscatedName("by.co")
    public int field1229 = 200;

    @ObfuscatedName("by.cl")
    public int field1261;

    @ObfuscatedName("by.cp")
    public int field1262 = 0;

    @ObfuscatedName("by.ce")
    public int field1263 = 32;

    @ObfuscatedName("by.cj")
    public int field1264 = 0;

    @ObfuscatedName("by.cg")
    public int[] field1265 = new int[10];

    @ObfuscatedName("by.cm")
    public int[] field1266 = new int[10];

    @ObfuscatedName("by.cr")
    public byte[] field1259 = new byte[10];

    @ObfuscatedName("by.cn")
    public int field1268 = 0;

    @ObfuscatedName("by.ck")
    public int field1214 = 0;

    @ObfuscatedName("by.af(B)V")
    public final void method1413() {
        this.field1264 = 0;
        this.field1214 = 0;
    }

    @ObfuscatedName("by.p(I)Z")
    public boolean method1034() {
        return false;
    }

    @ObfuscatedName("by.aa(IIIIIIB)V")
    public final void method1415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1232[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class255 var13 = class255.method3627(arg0);
            var11 = var13.field3429;
            var12 = var13.field3420;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1232[0];
            } else if (var11 == 1) {
                var14 = this.field1231[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1232[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1232[var15];
                    }
                } else if (var11 == 1 && this.field1231[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1231[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1238 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1238;
                this.field1238 = (byte) ((this.field1238 + 1) % 4);
                if (this.field1232[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1230[var10] = arg0;
        this.field1231[var10] = arg1;
        this.field1260[var10] = arg2;
        this.field1234[var10] = arg3;
        this.field1232[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("by.ay(IIIIIII)V")
    public final void method1416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class249 var7 = class249.method3871(arg0);
        class84 var8 = null;
        class84 var9 = null;
        int var10 = var7.field3366;
        int var11 = 0;
        for (class84 var12 = (class84) this.field1270.method3395(); var12 != null; var12 = (class84) this.field1270.method3417()) {
            var11++;
            if (var12.field1358.field3363 == var7.field3363) {
                var12.method1562(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1358.field3362 <= var7.field3362) {
                var8 = var12;
            }
            if (var12.field1358.field3366 > var10) {
                var9 = var12;
                var10 = var12.field1358.field3366;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class84 var13 = new class84(var7);
        if (var8 == null) {
            this.field1270.method3392(var13);
        } else {
            class192.method3420(var13, var8);
        }
        var13.method1562(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3425();
        }
    }

    @ObfuscatedName("by.aw(II)V")
    public final void method1418(int arg0) {
        class249 var2 = class249.method3871(arg0);
        for (class84 var3 = (class84) this.field1270.method3395(); var3 != null; var3 = (class84) this.field1270.method3417()) {
            if (var3.field1358 == var2) {
                var3.method3425();
                return;
            }
        }
    }
}
