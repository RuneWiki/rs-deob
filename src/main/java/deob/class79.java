package deob;

@ObfuscatedName("cd")
public abstract class class79 extends class142 {

    @ObfuscatedName("cd.ab")
    public int field1273;

    @ObfuscatedName("cd.aw")
    public int field1240;

    @ObfuscatedName("cd.ai")
    public int field1241;

    @ObfuscatedName("cd.an")
    public boolean field1268 = false;

    @ObfuscatedName("cd.au")
    public int field1243 = 1;

    @ObfuscatedName("cd.ar")
    public int field1244 = -1;

    @ObfuscatedName("cd.ay")
    public int field1291 = -1;

    @ObfuscatedName("cd.ao")
    public int field1246 = -1;

    @ObfuscatedName("cd.as")
    public int field1247 = -1;

    @ObfuscatedName("cd.ak")
    public int field1284 = -1;

    @ObfuscatedName("cd.aq")
    public int field1271 = -1;

    @ObfuscatedName("cd.ax")
    public int field1250 = -1;

    @ObfuscatedName("cd.ac")
    public int field1251 = -1;

    @ObfuscatedName("cd.at")
    public String field1252 = null;

    @ObfuscatedName("cd.av")
    public boolean field1285;

    @ObfuscatedName("cd.aa")
    public boolean field1254 = false;

    @ObfuscatedName("cd.am")
    public int field1265 = 100;

    @ObfuscatedName("cd.az")
    public int field1256 = 0;

    @ObfuscatedName("cd.al")
    public int field1257 = 0;

    @ObfuscatedName("cd.ae")
    public byte field1258 = 0;

    @ObfuscatedName("cd.ag")
    public int[] field1295 = new int[4];

    @ObfuscatedName("cd.ap")
    public int[] field1260 = new int[4];

    @ObfuscatedName("cd.af")
    public int[] field1261 = new int[4];

    @ObfuscatedName("cd.aj")
    public int[] field1262 = new int[4];

    @ObfuscatedName("cd.bb")
    public int[] field1274 = new int[4];

    @ObfuscatedName("cd.bc")
    public class192 field1264 = new class192();

    @ObfuscatedName("cd.be")
    public int field1277 = -1;

    @ObfuscatedName("cd.bv")
    public boolean field1266 = false;

    @ObfuscatedName("cd.bt")
    public int field1267 = -1;

    @ObfuscatedName("cd.bl")
    public int field1269 = -1;

    @ObfuscatedName("cd.bp")
    public int field1280 = 0;

    @ObfuscatedName("cd.br")
    public int field1255 = 0;

    @ObfuscatedName("cd.bg")
    public int field1259 = -1;

    @ObfuscatedName("cd.bo")
    public int field1272 = 0;

    @ObfuscatedName("cd.bw")
    public int field1248 = 0;

    @ObfuscatedName("cd.bm")
    public int field1282 = 0;

    @ObfuscatedName("cd.bj")
    public int field1263 = 0;

    @ObfuscatedName("cd.bx")
    public int field1249 = -1;

    @ObfuscatedName("cd.bz")
    public int field1245 = 0;

    @ObfuscatedName("cd.bh")
    public int field1278 = 0;

    @ObfuscatedName("cd.bs")
    public int field1279;

    @ObfuscatedName("cd.bu")
    public int field1239;

    @ObfuscatedName("cd.bn")
    public int field1281;

    @ObfuscatedName("cd.bf")
    public int field1297;

    @ObfuscatedName("cd.bd")
    public int field1283;

    @ObfuscatedName("cd.by")
    public int field1242;

    @ObfuscatedName("cd.bq")
    public int field1275;

    @ObfuscatedName("cd.ba")
    public int field1286;

    @ObfuscatedName("cd.bk")
    public int field1287;

    @ObfuscatedName("cd.bi")
    public int field1288 = 0;

    @ObfuscatedName("cd.cd")
    public int field1289 = 200;

    @ObfuscatedName("cd.cg")
    public int field1290;

    @ObfuscatedName("cd.cw")
    public int field1253 = 0;

    @ObfuscatedName("cd.cl")
    public int field1292 = 32;

    @ObfuscatedName("cd.cq")
    public int field1293 = 0;

    @ObfuscatedName("cd.ck")
    public int[] field1294 = new int[10];

    @ObfuscatedName("cd.ch")
    public int[] field1296 = new int[10];

    @ObfuscatedName("cd.cn")
    public byte[] field1298 = new byte[10];

    @ObfuscatedName("cd.ca")
    public int field1276 = 0;

    @ObfuscatedName("cd.cm")
    public int field1270 = 0;

    @ObfuscatedName("cd.x(I)V")
    public final void method1405() {
        this.field1293 = 0;
        this.field1270 = 0;
    }

    @ObfuscatedName("cd.v(I)Z")
    public boolean method1046() {
        return false;
    }

    @ObfuscatedName("cd.ai(IIIIIIB)V")
    public final void method1406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1261[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class255 var13 = class255.method2793(arg0);
            var11 = var13.field3438;
            var12 = var13.field3429;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1261[0];
            } else if (var11 == 1) {
                var14 = this.field1260[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1261[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1261[var15];
                    }
                } else if (var11 == 1 && this.field1260[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1260[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1258 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1258;
                this.field1258 = (byte) ((this.field1258 + 1) % 4);
                if (this.field1261[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1295[var10] = arg0;
        this.field1260[var10] = arg1;
        this.field1262[var10] = arg2;
        this.field1274[var10] = arg3;
        this.field1261[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("cd.an(IIIIIIB)V")
    public final void method1407(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class249 var7 = (class249) class249.field3376.method3235((long) arg0);
        class249 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3381.method3768(33, arg0);
            class249 var10 = new class249();
            if (var9 != null) {
                var10.method4059(new class174(var9));
            }
            class249.field3376.method3234(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class249 var11 = var8;
        class86 var12 = null;
        class86 var13 = null;
        int var14 = var8.field3380;
        int var15 = 0;
        for (class86 var16 = (class86) this.field1264.method3266(); var16 != null; var16 = (class86) this.field1264.method3277()) {
            var15++;
            if (var16.field1389.field3377 == var11.field3377) {
                var16.method1549(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1389.field3373 <= var11.field3373) {
                var12 = var16;
            }
            if (var16.field1389.field3380 > var14) {
                var13 = var16;
                var14 = var16.field1389.field3380;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class86 var17 = new class86(var11);
        if (var12 == null) {
            this.field1264.method3263(var17);
        } else {
            class192.method3264(var17, var12);
        }
        var17.method1549(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3290();
        }
    }

    @ObfuscatedName("cd.au(IB)V")
    public final void method1417(int arg0) {
        class249 var2 = (class249) class249.field3376.method3235((long) arg0);
        class249 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3381.method3768(33, arg0);
            class249 var5 = new class249();
            if (var4 != null) {
                var5.method4059(new class174(var4));
            }
            class249.field3376.method3234(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class249 var6 = var3;
        for (class86 var7 = (class86) this.field1264.method3266(); var7 != null; var7 = (class86) this.field1264.method3277()) {
            if (var7.field1389 == var6) {
                var7.method3290();
                return;
            }
        }
    }
}
