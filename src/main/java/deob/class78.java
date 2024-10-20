package deob;

@ObfuscatedName("bg")
public abstract class class78 extends class141 {

    @ObfuscatedName("bg.ax")
    public int field1233;

    @ObfuscatedName("bg.al")
    public int field1232;

    @ObfuscatedName("bg.ag")
    public int field1236;

    @ObfuscatedName("bg.ad")
    public boolean field1285 = false;

    @ObfuscatedName("bg.ab")
    public int field1234 = 1;

    @ObfuscatedName("bg.am")
    public int field1235 = -1;

    @ObfuscatedName("bg.aq")
    public int field1254 = -1;

    @ObfuscatedName("bg.at")
    public int field1252 = -1;

    @ObfuscatedName("bg.az")
    public int field1269 = -1;

    @ObfuscatedName("bg.ac")
    public int field1239 = -1;

    @ObfuscatedName("bg.aa")
    public int field1289 = -1;

    @ObfuscatedName("bg.aj")
    public int field1231 = -1;

    @ObfuscatedName("bg.ay")
    public int field1273 = -1;

    @ObfuscatedName("bg.av")
    public String field1243 = null;

    @ObfuscatedName("bg.ao")
    public boolean field1244;

    @ObfuscatedName("bg.aw")
    public boolean field1245 = false;

    @ObfuscatedName("bg.ah")
    public int field1246 = 100;

    @ObfuscatedName("bg.an")
    public int field1247 = 0;

    @ObfuscatedName("bg.af")
    public int field1238 = 0;

    @ObfuscatedName("bg.as")
    public byte field1249 = 0;

    @ObfuscatedName("bg.ap")
    public int[] field1237 = new int[4];

    @ObfuscatedName("bg.ae")
    public int[] field1251 = new int[4];

    @ObfuscatedName("bg.ai")
    public int[] field1286 = new int[4];

    @ObfuscatedName("bg.au")
    public int[] field1253 = new int[4];

    @ObfuscatedName("bg.bp")
    public int[] field1279 = new int[4];

    @ObfuscatedName("bg.bd")
    public class193 field1255 = new class193();

    @ObfuscatedName("bg.bs")
    public int field1256 = -1;

    @ObfuscatedName("bg.bc")
    public boolean field1265 = false;

    @ObfuscatedName("bg.bv")
    public int field1258 = -1;

    @ObfuscatedName("bg.bw")
    public int field1259 = -1;

    @ObfuscatedName("bg.bx")
    public int field1260 = 0;

    @ObfuscatedName("bg.br")
    public int field1274 = 0;

    @ObfuscatedName("bg.by")
    public int field1257 = -1;

    @ObfuscatedName("bg.bz")
    public int field1263 = 0;

    @ObfuscatedName("bg.ba")
    public int field1264 = 0;

    @ObfuscatedName("bg.bh")
    public int field1262 = 0;

    @ObfuscatedName("bg.bi")
    public int field1266 = 0;

    @ObfuscatedName("bg.bf")
    public int field1267 = -1;

    @ObfuscatedName("bg.bn")
    public int field1268 = 0;

    @ObfuscatedName("bg.be")
    public int field1241 = 0;

    @ObfuscatedName("bg.bq")
    public int field1270;

    @ObfuscatedName("bg.bm")
    public int field1271;

    @ObfuscatedName("bg.bl")
    public int field1272;

    @ObfuscatedName("bg.bb")
    public int field1240;

    @ObfuscatedName("bg.bt")
    public int field1230;

    @ObfuscatedName("bg.bu")
    public int field1275;

    @ObfuscatedName("bg.bo")
    public int field1276;

    @ObfuscatedName("bg.bj")
    public int field1277;

    @ObfuscatedName("bg.bk")
    public int field1278;

    @ObfuscatedName("bg.bg")
    public int field1261 = 0;

    @ObfuscatedName("bg.cj")
    public int field1280 = 200;

    @ObfuscatedName("bg.cp")
    public int field1281;

    @ObfuscatedName("bg.cq")
    public int field1282 = 0;

    @ObfuscatedName("bg.cz")
    public int field1283 = 32;

    @ObfuscatedName("bg.cc")
    public int field1284 = 0;

    @ObfuscatedName("bg.cf")
    public int[] field1248 = new int[10];

    @ObfuscatedName("bg.ca")
    public int[] field1242 = new int[10];

    @ObfuscatedName("bg.cw")
    public byte[] field1287 = new byte[10];

    @ObfuscatedName("bg.ct")
    public int field1288 = 0;

    @ObfuscatedName("bg.ch")
    public int field1250 = 0;

    @ObfuscatedName("bg.g(I)V")
    public final void method1390() {
        this.field1284 = 0;
        this.field1250 = 0;
    }

    @ObfuscatedName("bg.q(I)Z")
    public boolean method1050() {
        return false;
    }

    @ObfuscatedName("bg.w(IIIIIIB)V")
    public final void method1387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1286[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class256 var13 = class256.method977(arg0);
            var11 = var13.field3417;
            var12 = var13.field3421;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1286[0];
            } else if (var11 == 1) {
                var14 = this.field1251[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1286[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1286[var15];
                    }
                } else if (var11 == 1 && this.field1251[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1251[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1249 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1249;
                this.field1249 = (byte) ((this.field1249 + 1) % 4);
                if (this.field1286[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1237[var10] = arg0;
        this.field1251[var10] = arg1;
        this.field1253[var10] = arg2;
        this.field1279[var10] = arg3;
        this.field1286[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bg.ar(IIIIIIS)V")
    public final void method1386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class250 var7 = class250.method4007(arg0);
        class85 var8 = null;
        class85 var9 = null;
        int var10 = var7.field3369;
        int var11 = 0;
        for (class85 var12 = (class85) this.field1255.method3379(); var12 != null; var12 = (class85) this.field1255.method3381()) {
            var11++;
            if (var12.field1376.field3370 == var7.field3370) {
                var12.method1548(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1376.field3365 <= var7.field3365) {
                var8 = var12;
            }
            if (var12.field1376.field3369 > var10) {
                var9 = var12;
                var10 = var12.field1376.field3369;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class85 var13 = new class85(var7);
        if (var8 == null) {
            this.field1255.method3376(var13);
        } else {
            class193.method3377(var13, var8);
        }
        var13.method1548(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3397();
        }
    }

    @ObfuscatedName("bg.ax(IS)V")
    public final void method1389(int arg0) {
        class250 var2 = (class250) class250.field3367.method3347((long) arg0);
        class250 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3371.method3824(33, arg0);
            class250 var5 = new class250();
            if (var4 != null) {
                var5.method4075(new class175(var4));
            }
            class250.field3367.method3346(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class250 var6 = var3;
        for (class85 var7 = (class85) this.field1255.method3379(); var7 != null; var7 = (class85) this.field1255.method3381()) {
            if (var7.field1376 == var6) {
                var7.method3397();
                return;
            }
        }
    }
}
