package deob;

@ObfuscatedName("cs")
public abstract class class79 extends class142 {

    @ObfuscatedName("cs.ar")
    public int field1275;

    @ObfuscatedName("cs.an")
    public boolean field1263 = false;

    @ObfuscatedName("cs.af")
    public int field1244;

    @ObfuscatedName("cs.at")
    public int field1245;

    @ObfuscatedName("cs.ah")
    public int field1269 = 1;

    @ObfuscatedName("cs.ai")
    public int field1284 = -1;

    @ObfuscatedName("cs.aw")
    public int field1249 = -1;

    @ObfuscatedName("cs.al")
    public int field1250 = -1;

    @ObfuscatedName("cs.ab")
    public int field1243 = -1;

    @ObfuscatedName("cs.aa")
    public int field1300 = -1;

    @ObfuscatedName("cs.ap")
    public int field1289 = -1;

    @ObfuscatedName("cs.ae")
    public int field1254 = -1;

    @ObfuscatedName("cs.as")
    public int field1255 = -1;

    @ObfuscatedName("cs.av")
    public String field1256 = null;

    @ObfuscatedName("cs.ag")
    public boolean field1257;

    @ObfuscatedName("cs.az")
    public boolean field1248 = false;

    @ObfuscatedName("cs.ac")
    public int field1259 = 100;

    @ObfuscatedName("cs.ax")
    public int field1246 = 0;

    @ObfuscatedName("cs.au")
    public int field1295 = 0;

    @ObfuscatedName("cs.aq")
    public byte field1262 = 0;

    @ObfuscatedName("cs.ay")
    public int[] field1253 = new int[4];

    @ObfuscatedName("cs.ak")
    public int[] field1252 = new int[4];

    @ObfuscatedName("cs.ao")
    public int[] field1265 = new int[4];

    @ObfuscatedName("cs.am")
    public int[] field1266 = new int[4];

    @ObfuscatedName("cs.be")
    public int[] field1267 = new int[4];

    @ObfuscatedName("cs.bs")
    public class192 field1283 = new class192();

    @ObfuscatedName("cs.bu")
    public int field1294 = -1;

    @ObfuscatedName("cs.bo")
    public boolean field1270 = false;

    @ObfuscatedName("cs.bj")
    public int field1271 = -1;

    @ObfuscatedName("cs.bh")
    public int field1272 = -1;

    @ObfuscatedName("cs.bf")
    public int field1273 = 0;

    @ObfuscatedName("cs.bg")
    public int field1274 = 0;

    @ObfuscatedName("cs.bl")
    public int field1247 = -1;

    @ObfuscatedName("cs.bz")
    public int field1276 = 0;

    @ObfuscatedName("cs.bq")
    public int field1261 = 0;

    @ObfuscatedName("cs.bt")
    public int field1278 = 0;

    @ObfuscatedName("cs.bi")
    public int field1279 = 0;

    @ObfuscatedName("cs.by")
    public int field1280 = -1;

    @ObfuscatedName("cs.bb")
    public int field1281 = 0;

    @ObfuscatedName("cs.ba")
    public int field1282 = 0;

    @ObfuscatedName("cs.bw")
    public int field1297;

    @ObfuscatedName("cs.bk")
    public int field1303;

    @ObfuscatedName("cs.br")
    public int field1285;

    @ObfuscatedName("cs.bd")
    public int field1286;

    @ObfuscatedName("cs.bv")
    public int field1287;

    @ObfuscatedName("cs.bx")
    public int field1288;

    @ObfuscatedName("cs.bm")
    public int field1251;

    @ObfuscatedName("cs.bn")
    public int field1290;

    @ObfuscatedName("cs.bc")
    public int field1291;

    @ObfuscatedName("cs.bp")
    public int field1277 = 0;

    @ObfuscatedName("cs.cs")
    public int field1293 = 200;

    @ObfuscatedName("cs.ce")
    public int field1260;

    @ObfuscatedName("cs.ck")
    public int field1268 = 0;

    @ObfuscatedName("cs.cf")
    public int field1296 = 32;

    @ObfuscatedName("cs.cw")
    public int field1264 = 0;

    @ObfuscatedName("cs.ca")
    public int[] field1298 = new int[10];

    @ObfuscatedName("cs.cj")
    public int[] field1299 = new int[10];

    @ObfuscatedName("cs.cy")
    public byte[] field1258 = new byte[10];

    @ObfuscatedName("cs.co")
    public int field1301 = 0;

    @ObfuscatedName("cs.cn")
    public int field1302 = 0;

    @ObfuscatedName("cs.an(B)V")
    public final void method1385() {
        this.field1264 = 0;
        this.field1302 = 0;
    }

    @ObfuscatedName("cs.h(I)Z")
    public boolean method1006() {
        return false;
    }

    @ObfuscatedName("cs.af(IIIIIIB)V")
    public final void method1387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1265[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class255 var13 = class255.method194(arg0);
            var11 = var13.field3426;
            var12 = var13.field3417;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1265[0];
            } else if (var11 == 1) {
                var14 = this.field1252[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1265[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1265[var15];
                    }
                } else if (var11 == 1 && this.field1252[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1252[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1262 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1262;
                this.field1262 = (byte) ((this.field1262 + 1) % 4);
                if (this.field1265[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1253[var10] = arg0;
        this.field1252[var10] = arg1;
        this.field1266[var10] = arg2;
        this.field1267[var10] = arg3;
        this.field1265[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("cs.at(IIIIIII)V")
    public final void method1399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class249 var7 = class249.method1688(arg0);
        class86 var8 = null;
        class86 var9 = null;
        int var10 = var7.field3368;
        int var11 = 0;
        for (class86 var12 = (class86) this.field1283.method3248(); var12 != null; var12 = (class86) this.field1283.method3258()) {
            var11++;
            if (var12.field1389.field3365 == var7.field3365) {
                var12.method1548(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1389.field3367 <= var7.field3367) {
                var8 = var12;
            }
            if (var12.field1389.field3368 > var10) {
                var9 = var12;
                var10 = var12.field1389.field3368;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class86 var13 = new class86(var7);
        if (var8 == null) {
            this.field1283.method3250(var13);
        } else {
            class192.method3257(var13, var8);
        }
        var13.method1548(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3278();
        }
    }

    @ObfuscatedName("cs.ah(II)V")
    public final void method1394(int arg0) {
        class249 var2 = class249.method1688(arg0);
        for (class86 var3 = (class86) this.field1283.method3248(); var3 != null; var3 = (class86) this.field1283.method3258()) {
            if (var3.field1389 == var2) {
                var3.method3278();
                return;
            }
        }
    }
}
