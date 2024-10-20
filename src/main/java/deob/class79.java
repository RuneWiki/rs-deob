package deob;

@ObfuscatedName("cb")
public abstract class class79 extends class142 {

    @ObfuscatedName("cb.ac")
    public int field1264;

    @ObfuscatedName("cb.af")
    public int field1236;

    @ObfuscatedName("cb.ai")
    public int field1237;

    @ObfuscatedName("cb.ad")
    public boolean field1239 = false;

    @ObfuscatedName("cb.ar")
    public int field1243 = 1;

    @ObfuscatedName("cb.aq")
    public int field1246 = -1;

    @ObfuscatedName("cb.ag")
    public int field1241 = -1;

    @ObfuscatedName("cb.ak")
    public int field1235 = -1;

    @ObfuscatedName("cb.ae")
    public int field1268 = -1;

    @ObfuscatedName("cb.am")
    public int field1244 = -1;

    @ObfuscatedName("cb.az")
    public int field1245 = -1;

    @ObfuscatedName("cb.ay")
    public int field1288 = -1;

    @ObfuscatedName("cb.as")
    public int field1247 = -1;

    @ObfuscatedName("cb.aw")
    public String field1274 = null;

    @ObfuscatedName("cb.at")
    public boolean field1249;

    @ObfuscatedName("cb.aj")
    public boolean field1250 = false;

    @ObfuscatedName("cb.ax")
    public int field1240 = 100;

    @ObfuscatedName("cb.an")
    public int field1252 = 0;

    @ObfuscatedName("cb.ab")
    public int field1253 = 0;

    @ObfuscatedName("cb.al")
    public byte field1254 = 0;

    @ObfuscatedName("cb.ah")
    public int[] field1269 = new int[4];

    @ObfuscatedName("cb.au")
    public int[] field1256 = new int[4];

    @ObfuscatedName("cb.aa")
    public int[] field1272 = new int[4];

    @ObfuscatedName("cb.ao")
    public int[] field1258 = new int[4];

    @ObfuscatedName("cb.bm")
    public int[] field1260 = new int[4];

    @ObfuscatedName("cb.bd")
    public class195 field1290 = new class195();

    @ObfuscatedName("cb.bn")
    public int field1261 = -1;

    @ObfuscatedName("cb.by")
    public boolean field1262 = false;

    @ObfuscatedName("cb.bo")
    public int field1263 = -1;

    @ObfuscatedName("cb.ba")
    public int field1242 = -1;

    @ObfuscatedName("cb.bv")
    public int field1265 = 0;

    @ObfuscatedName("cb.bq")
    public int field1266 = 0;

    @ObfuscatedName("cb.bt")
    public int field1267 = -1;

    @ObfuscatedName("cb.bg")
    public int field1279 = 0;

    @ObfuscatedName("cb.bl")
    public int field1275 = 0;

    @ObfuscatedName("cb.bb")
    public int field1270 = 0;

    @ObfuscatedName("cb.bp")
    public int field1238 = 0;

    @ObfuscatedName("cb.bu")
    public int field1292 = -1;

    @ObfuscatedName("cb.bf")
    public int field1273 = 0;

    @ObfuscatedName("cb.br")
    public int field1271 = 0;

    @ObfuscatedName("cb.bk")
    public int field1257;

    @ObfuscatedName("cb.bs")
    public int field1276;

    @ObfuscatedName("cb.bj")
    public int field1277;

    @ObfuscatedName("cb.be")
    public int field1278;

    @ObfuscatedName("cb.bw")
    public int field1251;

    @ObfuscatedName("cb.bc")
    public int field1280;

    @ObfuscatedName("cb.bx")
    public int field1281;

    @ObfuscatedName("cb.bz")
    public int field1282;

    @ObfuscatedName("cb.bh")
    public int field1283;

    @ObfuscatedName("cb.bi")
    public int field1284 = 0;

    @ObfuscatedName("cb.cb")
    public int field1285 = 200;

    @ObfuscatedName("cb.ck")
    public int field1286;

    @ObfuscatedName("cb.cg")
    public int field1287 = 0;

    @ObfuscatedName("cb.cf")
    public int field1248 = 32;

    @ObfuscatedName("cb.cl")
    public int field1289 = 0;

    @ObfuscatedName("cb.cd")
    public int[] field1255 = new int[10];

    @ObfuscatedName("cb.ca")
    public int[] field1291 = new int[10];

    @ObfuscatedName("cb.cq")
    public byte[] field1259 = new byte[10];

    @ObfuscatedName("cb.ce")
    public int field1293 = 0;

    @ObfuscatedName("cb.cz")
    public int field1294 = 0;

    @ObfuscatedName("cb.t(I)V")
    public final void method1391() {
        this.field1289 = 0;
        this.field1294 = 0;
    }

    @ObfuscatedName("cb.j(I)Z")
    public boolean method1020() {
        return false;
    }

    @ObfuscatedName("cb.b(IIIIIIB)V")
    public final void method1394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1272[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class258 var13 = class258.method16(arg0);
            var11 = var13.field3443;
            var12 = var13.field3434;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1272[0];
            } else if (var11 == 1) {
                var14 = this.field1256[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1272[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1272[var15];
                    }
                } else if (var11 == 1 && this.field1256[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1256[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1254 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1254;
                this.field1254 = (byte) ((this.field1254 + 1) % 4);
                if (this.field1272[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1269[var10] = arg0;
        this.field1256[var10] = arg1;
        this.field1258[var10] = arg2;
        this.field1260[var10] = arg3;
        this.field1272[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("cb.s(IIIIIII)V")
    public final void method1395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class252 var7 = class252.method1013(arg0);
        class86 var8 = null;
        class86 var9 = null;
        int var10 = var7.field3376;
        int var11 = 0;
        for (class86 var12 = (class86) this.field1290.method3273(); var12 != null; var12 = (class86) this.field1290.method3275()) {
            var11++;
            if (var12.field1386.field3382 == var7.field3382) {
                var12.method1518(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1386.field3375 <= var7.field3375) {
                var8 = var12;
            }
            if (var12.field1386.field3376 > var10) {
                var9 = var12;
                var10 = var12.field1386.field3376;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class86 var13 = new class86(var7);
        if (var8 == null) {
            this.field1290.method3289(var13);
        } else {
            class195.method3272(var13, var8);
        }
        var13.method1518(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3294();
        }
    }

    @ObfuscatedName("cb.ap(II)V")
    public final void method1393(int arg0) {
        class252 var2 = class252.method1013(arg0);
        for (class86 var3 = (class86) this.field1290.method3273(); var3 != null; var3 = (class86) this.field1290.method3275()) {
            if (var3.field1386 == var2) {
                var3.method3294();
                return;
            }
        }
    }
}
