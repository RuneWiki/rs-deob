package deob;

@ObfuscatedName("cs")
public abstract class class79 extends class142 {

    @ObfuscatedName("cs.ao")
    public int field1234;

    @ObfuscatedName("cs.ad")
    public int field1276;

    @ObfuscatedName("cs.aa")
    public int field1248;

    @ObfuscatedName("cs.aw")
    public boolean field1230 = false;

    @ObfuscatedName("cs.an")
    public int field1231 = 1;

    @ObfuscatedName("cs.al")
    public int field1232 = -1;

    @ObfuscatedName("cs.at")
    public int field1233 = -1;

    @ObfuscatedName("cs.au")
    public int field1249 = -1;

    @ObfuscatedName("cs.ak")
    public int field1235 = -1;

    @ObfuscatedName("cs.as")
    public int field1236 = -1;

    @ObfuscatedName("cs.ah")
    public int field1266 = -1;

    @ObfuscatedName("cs.ab")
    public int field1238 = -1;

    @ObfuscatedName("cs.am")
    public int field1239 = -1;

    @ObfuscatedName("cs.ac")
    public String field1271 = null;

    @ObfuscatedName("cs.ax")
    public boolean field1241;

    @ObfuscatedName("cs.av")
    public boolean field1242 = false;

    @ObfuscatedName("cs.aq")
    public int field1267 = 100;

    @ObfuscatedName("cs.af")
    public int field1244 = 0;

    @ObfuscatedName("cs.ag")
    public int field1245 = 0;

    @ObfuscatedName("cs.aj")
    public byte field1227 = 0;

    @ObfuscatedName("cs.ay")
    public int[] field1247 = new int[4];

    @ObfuscatedName("cs.ap")
    public int[] field1252 = new int[4];

    @ObfuscatedName("cs.ai")
    public int[] field1264 = new int[4];

    @ObfuscatedName("cs.az")
    public int[] field1263 = new int[4];

    @ObfuscatedName("cs.bv")
    public int[] field1251 = new int[4];

    @ObfuscatedName("cs.bd")
    public class192 field1237 = new class192();

    @ObfuscatedName("cs.bc")
    public int field1285 = -1;

    @ObfuscatedName("cs.bj")
    public boolean field1254 = false;

    @ObfuscatedName("cs.bx")
    public int field1255 = -1;

    @ObfuscatedName("cs.bf")
    public int field1256 = -1;

    @ObfuscatedName("cs.bn")
    public int field1240 = 0;

    @ObfuscatedName("cs.bh")
    public int field1258 = 0;

    @ObfuscatedName("cs.bm")
    public int field1228 = -1;

    @ObfuscatedName("cs.bs")
    public int field1260 = 0;

    @ObfuscatedName("cs.bo")
    public int field1261 = 0;

    @ObfuscatedName("cs.bl")
    public int field1278 = 0;

    @ObfuscatedName("cs.bp")
    public int field1229 = 0;

    @ObfuscatedName("cs.bt")
    public int field1246 = -1;

    @ObfuscatedName("cs.be")
    public int field1265 = 0;

    @ObfuscatedName("cs.bz")
    public int field1250 = 0;

    @ObfuscatedName("cs.by")
    public int field1257;

    @ObfuscatedName("cs.bi")
    public int field1280;

    @ObfuscatedName("cs.br")
    public int field1269;

    @ObfuscatedName("cs.bg")
    public int field1270;

    @ObfuscatedName("cs.bb")
    public int field1287;

    @ObfuscatedName("cs.bk")
    public int field1272;

    @ObfuscatedName("cs.bw")
    public int field1273;

    @ObfuscatedName("cs.bu")
    public int field1274;

    @ObfuscatedName("cs.bq")
    public int field1275;

    @ObfuscatedName("cs.ba")
    public int field1262 = 0;

    @ObfuscatedName("cs.cs")
    public int field1277 = 200;

    @ObfuscatedName("cs.cy")
    public int field1253;

    @ObfuscatedName("cs.cw")
    public int field1279 = 0;

    @ObfuscatedName("cs.ct")
    public int field1243 = 32;

    @ObfuscatedName("cs.cg")
    public int field1281 = 0;

    @ObfuscatedName("cs.cv")
    public int[] field1282 = new int[10];

    @ObfuscatedName("cs.cl")
    public int[] field1283 = new int[10];

    @ObfuscatedName("cs.cb")
    public byte[] field1284 = new byte[10];

    @ObfuscatedName("cs.cp")
    public int field1259 = 0;

    @ObfuscatedName("cs.cn")
    public int field1286 = 0;

    @ObfuscatedName("cs.at(I)V")
    public final void method1387() {
        this.field1281 = 0;
        this.field1286 = 0;
    }

    @ObfuscatedName("cs.c(B)Z")
    public boolean method1015() {
        return false;
    }

    @ObfuscatedName("cs.au(IIIIIIS)V")
    public final void method1392(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1264[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class255 var13 = class255.method4618(arg0);
            var11 = var13.field3436;
            var12 = var13.field3427;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1264[0];
            } else if (var11 == 1) {
                var14 = this.field1252[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1264[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1264[var15];
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
                this.field1227 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1227;
                this.field1227 = (byte) ((this.field1227 + 1) % 4);
                if (this.field1264[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1247[var10] = arg0;
        this.field1252[var10] = arg1;
        this.field1263[var10] = arg2;
        this.field1251[var10] = arg3;
        this.field1264[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("cs.ak(IIIIIII)V")
    public final void method1389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class249 var7 = class249.method177(arg0);
        class86 var8 = null;
        class86 var9 = null;
        int var10 = var7.field3370;
        int var11 = 0;
        for (class86 var12 = (class86) this.field1237.method3321(); var12 != null; var12 = (class86) this.field1237.method3323()) {
            var11++;
            if (var12.field1374.field3368 == var7.field3368) {
                var12.method1545(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1374.field3369 <= var7.field3369) {
                var8 = var12;
            }
            if (var12.field1374.field3370 > var10) {
                var9 = var12;
                var10 = var12.field1374.field3370;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class86 var13 = new class86(var7);
        if (var8 == null) {
            this.field1237.method3326(var13);
        } else {
            class192.method3335(var13, var8);
        }
        var13.method1545(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3347();
        }
    }

    @ObfuscatedName("cs.as(II)V")
    public final void method1396(int arg0) {
        class249 var2 = (class249) class249.field3366.method3280((long) arg0);
        class249 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3374.method3880(33, arg0);
            class249 var5 = new class249();
            if (var4 != null) {
                var5.method4104(new class174(var4));
            }
            class249.field3366.method3282(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class249 var6 = var3;
        for (class86 var7 = (class86) this.field1237.method3321(); var7 != null; var7 = (class86) this.field1237.method3323()) {
            if (var7.field1374 == var6) {
                var7.method3347();
                return;
            }
        }
    }
}
