package deob;

@ObfuscatedName("cx")
public abstract class class79 extends class142 {

    @ObfuscatedName("cx.ay")
    public int field1243;

    @ObfuscatedName("cx.am")
    public int field1229;

    @ObfuscatedName("cx.ae")
    public int field1230;

    @ObfuscatedName("cx.az")
    public boolean field1228 = false;

    @ObfuscatedName("cx.ar")
    public int field1232 = 1;

    @ObfuscatedName("cx.ai")
    public int field1276 = -1;

    @ObfuscatedName("cx.ap")
    public int field1278 = -1;

    @ObfuscatedName("cx.al")
    public int field1235 = -1;

    @ObfuscatedName("cx.aw")
    public int field1236 = -1;

    @ObfuscatedName("cx.ak")
    public int field1274 = -1;

    @ObfuscatedName("cx.ax")
    public int field1238 = -1;

    @ObfuscatedName("cx.at")
    public int field1239 = -1;

    @ObfuscatedName("cx.ao")
    public int field1255 = -1;

    @ObfuscatedName("cx.aq")
    public String field1241 = null;

    @ObfuscatedName("cx.ab")
    public boolean field1257;

    @ObfuscatedName("cx.as")
    public boolean field1234 = false;

    @ObfuscatedName("cx.av")
    public int field1240 = 100;

    @ObfuscatedName("cx.ac")
    public int field1266 = 0;

    @ObfuscatedName("cx.ag")
    public int field1246 = 0;

    @ObfuscatedName("cx.aa")
    public byte field1233 = 0;

    @ObfuscatedName("cx.an")
    public int[] field1231 = new int[4];

    @ObfuscatedName("cx.aj")
    public int[] field1242 = new int[4];

    @ObfuscatedName("cx.af")
    public int[] field1250 = new int[4];

    @ObfuscatedName("cx.ah")
    public int[] field1251 = new int[4];

    @ObfuscatedName("cx.bz")
    public int[] field1252 = new int[4];

    @ObfuscatedName("cx.bo")
    public class192 field1253 = new class192();

    @ObfuscatedName("cx.bp")
    public int field1254 = -1;

    @ObfuscatedName("cx.bh")
    public boolean field1279 = false;

    @ObfuscatedName("cx.bs")
    public int field1256 = -1;

    @ObfuscatedName("cx.bq")
    public int field1237 = -1;

    @ObfuscatedName("cx.bd")
    public int field1269 = 0;

    @ObfuscatedName("cx.bn")
    public int field1259 = 0;

    @ObfuscatedName("cx.bf")
    public int field1260 = -1;

    @ObfuscatedName("cx.bb")
    public int field1261 = 0;

    @ObfuscatedName("cx.bl")
    public int field1262 = 0;

    @ObfuscatedName("cx.bu")
    public int field1263 = 0;

    @ObfuscatedName("cx.bt")
    public int field1264 = 0;

    @ObfuscatedName("cx.bw")
    public int field1265 = -1;

    @ObfuscatedName("cx.bc")
    public int field1273 = 0;

    @ObfuscatedName("cx.by")
    public int field1267 = 0;

    @ObfuscatedName("cx.br")
    public int field1268;

    @ObfuscatedName("cx.bg")
    public int field1275;

    @ObfuscatedName("cx.bk")
    public int field1270;

    @ObfuscatedName("cx.bj")
    public int field1271;

    @ObfuscatedName("cx.bx")
    public int field1272;

    @ObfuscatedName("cx.ba")
    public int field1249;

    @ObfuscatedName("cx.bm")
    public int field1248;

    @ObfuscatedName("cx.bv")
    public int field1281;

    @ObfuscatedName("cx.be")
    public int field1258;

    @ObfuscatedName("cx.bi")
    public int field1244 = 0;

    @ObfuscatedName("cx.cx")
    public int field1282 = 200;

    @ObfuscatedName("cx.cy")
    public int field1247;

    @ObfuscatedName("cx.cf")
    public int field1280 = 0;

    @ObfuscatedName("cx.cq")
    public int field1277 = 32;

    @ObfuscatedName("cx.co")
    public int field1245 = 0;

    @ObfuscatedName("cx.ch")
    public int[] field1283 = new int[10];

    @ObfuscatedName("cx.cd")
    public int[] field1284 = new int[10];

    @ObfuscatedName("cx.ci")
    public byte[] field1285 = new byte[10];

    @ObfuscatedName("cx.cb")
    public int field1286 = 0;

    @ObfuscatedName("cx.cs")
    public int field1287 = 0;

    @ObfuscatedName("cx.ai(I)V")
    public final void method1380() {
        this.field1245 = 0;
        this.field1287 = 0;
    }

    @ObfuscatedName("cx.k(B)Z")
    public boolean method1031() {
        return false;
    }

    @ObfuscatedName("cx.ap(IIIIIIB)V")
    public final void method1381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1250[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class255 var13 = class255.method224(arg0);
            var11 = var13.field3407;
            var12 = var13.field3391;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1250[0];
            } else if (var11 == 1) {
                var14 = this.field1242[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1250[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1250[var15];
                    }
                } else if (var11 == 1 && this.field1242[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1242[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1233 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1233;
                this.field1233 = (byte) ((this.field1233 + 1) % 4);
                if (this.field1250[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1231[var10] = arg0;
        this.field1242[var10] = arg1;
        this.field1251[var10] = arg2;
        this.field1252[var10] = arg3;
        this.field1250[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("cx.al(IIIIIII)V")
    public final void method1382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class249 var7 = (class249) class249.field3338.method3248((long) arg0);
        class249 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3352.method3760(33, arg0);
            class249 var10 = new class249();
            if (var9 != null) {
                var10.method4035(new class174(var9));
            }
            class249.field3338.method3250(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class249 var11 = var8;
        class86 var12 = null;
        class86 var13 = null;
        int var14 = var8.field3344;
        int var15 = 0;
        for (class86 var16 = (class86) this.field1253.method3280(); var16 != null; var16 = (class86) this.field1253.method3278()) {
            var15++;
            if (var16.field1370.field3340 == var11.field3340) {
                var16.method1530(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1370.field3343 <= var11.field3343) {
                var12 = var16;
            }
            if (var16.field1370.field3344 > var14) {
                var13 = var16;
                var14 = var16.field1370.field3344;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class86 var17 = new class86(var11);
        if (var12 == null) {
            this.field1253.method3283(var17);
        } else {
            class192.method3302(var17, var12);
        }
        var17.method1530(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3304();
        }
    }

    @ObfuscatedName("cx.aw(II)V")
    public final void method1383(int arg0) {
        class249 var2 = (class249) class249.field3338.method3248((long) arg0);
        class249 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3352.method3760(33, arg0);
            class249 var5 = new class249();
            if (var4 != null) {
                var5.method4035(new class174(var4));
            }
            class249.field3338.method3250(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class249 var6 = var3;
        for (class86 var7 = (class86) this.field1253.method3280(); var7 != null; var7 = (class86) this.field1253.method3278()) {
            if (var7.field1370 == var6) {
                var7.method3304();
                return;
            }
        }
    }
}
