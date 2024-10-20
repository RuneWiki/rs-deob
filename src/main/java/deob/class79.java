package deob;

@ObfuscatedName("cy")
public abstract class class79 extends class142 {

    @ObfuscatedName("cy.ar")
    public int field1282;

    @ObfuscatedName("cy.am")
    public int field1225;

    @ObfuscatedName("cy.ab")
    public int field1226;

    @ObfuscatedName("cy.af")
    public boolean field1227 = false;

    @ObfuscatedName("cy.aa")
    public int field1271 = 1;

    @ObfuscatedName("cy.aq")
    public int field1229 = -1;

    @ObfuscatedName("cy.aj")
    public int field1230 = -1;

    @ObfuscatedName("cy.as")
    public int field1242 = -1;

    @ObfuscatedName("cy.av")
    public int field1232 = -1;

    @ObfuscatedName("cy.ao")
    public int field1233 = -1;

    @ObfuscatedName("cy.ag")
    public int field1268 = -1;

    @ObfuscatedName("cy.ay")
    public int field1239 = -1;

    @ObfuscatedName("cy.ax")
    public int field1236 = -1;

    @ObfuscatedName("cy.ad")
    public String field1237 = null;

    @ObfuscatedName("cy.ae")
    public boolean field1238;

    @ObfuscatedName("cy.ac")
    public boolean field1245 = false;

    @ObfuscatedName("cy.az")
    public int field1251 = 100;

    @ObfuscatedName("cy.ah")
    public int field1263 = 0;

    @ObfuscatedName("cy.at")
    public int field1281 = 0;

    @ObfuscatedName("cy.au")
    public byte field1243 = 0;

    @ObfuscatedName("cy.ak")
    public int[] field1277 = new int[4];

    @ObfuscatedName("cy.aw")
    public int[] field1249 = new int[4];

    @ObfuscatedName("cy.an")
    public int[] field1246 = new int[4];

    @ObfuscatedName("cy.ai")
    public int[] field1247 = new int[4];

    @ObfuscatedName("cy.bk")
    public int[] field1259 = new int[4];

    @ObfuscatedName("cy.bh")
    public class195 field1244 = new class195();

    @ObfuscatedName("cy.bv")
    public int field1250 = -1;

    @ObfuscatedName("cy.bf")
    public boolean field1257 = false;

    @ObfuscatedName("cy.bl")
    public int field1234 = -1;

    @ObfuscatedName("cy.bp")
    public int field1253 = -1;

    @ObfuscatedName("cy.bc")
    public int field1252 = 0;

    @ObfuscatedName("cy.br")
    public int field1255 = 0;

    @ObfuscatedName("cy.bs")
    public int field1256 = -1;

    @ObfuscatedName("cy.by")
    public int field1241 = 0;

    @ObfuscatedName("cy.bw")
    public int field1258 = 0;

    @ObfuscatedName("cy.bz")
    public int field1266 = 0;

    @ObfuscatedName("cy.bn")
    public int field1260 = 0;

    @ObfuscatedName("cy.bd")
    public int field1254 = -1;

    @ObfuscatedName("cy.bm")
    public int field1262 = 0;

    @ObfuscatedName("cy.bi")
    public int field1231 = 0;

    @ObfuscatedName("cy.bu")
    public int field1264;

    @ObfuscatedName("cy.bg")
    public int field1265;

    @ObfuscatedName("cy.bj")
    public int field1261;

    @ObfuscatedName("cy.bb")
    public int field1267;

    @ObfuscatedName("cy.be")
    public int field1248;

    @ObfuscatedName("cy.bt")
    public int field1224;

    @ObfuscatedName("cy.bo")
    public int field1270;

    @ObfuscatedName("cy.bx")
    public int field1240;

    @ObfuscatedName("cy.ba")
    public int field1272;

    @ObfuscatedName("cy.bq")
    public int field1273 = 0;

    @ObfuscatedName("cy.cy")
    public int field1274 = 200;

    @ObfuscatedName("cy.cd")
    public int field1275;

    @ObfuscatedName("cy.ci")
    public int field1276 = 0;

    @ObfuscatedName("cy.cu")
    public int field1269 = 32;

    @ObfuscatedName("cy.co")
    public int field1278 = 0;

    @ObfuscatedName("cy.ct")
    public int[] field1279 = new int[10];

    @ObfuscatedName("cy.cg")
    public int[] field1280 = new int[10];

    @ObfuscatedName("cy.cr")
    public byte[] field1235 = new byte[10];

    @ObfuscatedName("cy.cz")
    public int field1228 = 0;

    @ObfuscatedName("cy.cc")
    public int field1283 = 0;

    @ObfuscatedName("cy.aq(B)V")
    public final void method1394() {
        this.field1278 = 0;
        this.field1283 = 0;
    }

    @ObfuscatedName("cy.p(B)Z")
    public boolean method1014() {
        return false;
    }

    @ObfuscatedName("cy.aj(IIIIIII)V")
    public final void method1397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1246[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class258 var13 = class258.method1406(arg0);
            var11 = var13.field3442;
            var12 = var13.field3430;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1246[0];
            } else if (var11 == 1) {
                var14 = this.field1249[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1246[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1246[var15];
                    }
                } else if (var11 == 1 && this.field1249[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1249[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1243 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1243;
                this.field1243 = (byte) ((this.field1243 + 1) % 4);
                if (this.field1246[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1277[var10] = arg0;
        this.field1249[var10] = arg1;
        this.field1247[var10] = arg2;
        this.field1259[var10] = arg3;
        this.field1246[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("cy.as(IIIIIII)V")
    public final void method1398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class252 var7 = (class252) class252.field3377.method3319((long) arg0);
        class252 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3385.method3840(33, arg0);
            class252 var10 = new class252();
            if (var9 != null) {
                var10.method4122(new class177(var9));
            }
            class252.field3377.method3315(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class252 var11 = var8;
        class86 var12 = null;
        class86 var13 = null;
        int var14 = var8.field3381;
        int var15 = 0;
        for (class86 var16 = (class86) this.field1244.method3352(); var16 != null; var16 = (class86) this.field1244.method3367()) {
            var15++;
            if (var16.field1366.field3378 == var11.field3378) {
                var16.method1557(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1366.field3389 <= var11.field3389) {
                var12 = var16;
            }
            if (var16.field1366.field3381 > var14) {
                var13 = var16;
                var14 = var16.field1366.field3381;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class86 var17 = new class86(var11);
        if (var12 == null) {
            this.field1244.method3361(var17);
        } else {
            class195.method3350(var17, var12);
        }
        var17.method1557(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3372();
        }
    }

    @ObfuscatedName("cy.av(II)V")
    public final void method1399(int arg0) {
        class252 var2 = (class252) class252.field3377.method3319((long) arg0);
        class252 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3385.method3840(33, arg0);
            class252 var5 = new class252();
            if (var4 != null) {
                var5.method4122(new class177(var4));
            }
            class252.field3377.method3315(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class252 var6 = var3;
        for (class86 var7 = (class86) this.field1244.method3352(); var7 != null; var7 = (class86) this.field1244.method3367()) {
            if (var7.field1366 == var6) {
                var7.method3372();
                return;
            }
        }
    }
}
