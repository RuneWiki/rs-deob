package deob;

@ObfuscatedName("cx")
public abstract class class79 extends class142 {

    @ObfuscatedName("cx.ax")
    public int field1234;

    @ObfuscatedName("cx.af")
    public int field1210;

    @ObfuscatedName("cx.ae")
    public int field1258;

    @ObfuscatedName("cx.ap")
    public boolean field1212 = false;

    @ObfuscatedName("cx.ak")
    public int field1213 = 1;

    @ObfuscatedName("cx.al")
    public int field1244 = -1;

    @ObfuscatedName("cx.ab")
    public int field1215 = -1;

    @ObfuscatedName("cx.am")
    public int field1216 = -1;

    @ObfuscatedName("cx.ar")
    public int field1217 = -1;

    @ObfuscatedName("cx.ao")
    public int field1218 = -1;

    @ObfuscatedName("cx.ac")
    public int field1219 = -1;

    @ObfuscatedName("cx.aa")
    public int field1220 = -1;

    @ObfuscatedName("cx.ay")
    public int field1221 = -1;

    @ObfuscatedName("cx.aj")
    public String field1236 = null;

    @ObfuscatedName("cx.ag")
    public boolean field1223;

    @ObfuscatedName("cx.aq")
    public boolean field1224 = false;

    @ObfuscatedName("cx.as")
    public int field1235 = 100;

    @ObfuscatedName("cx.an")
    public int field1226 = 0;

    @ObfuscatedName("cx.az")
    public int field1263 = 0;

    @ObfuscatedName("cx.aw")
    public byte field1225 = 0;

    @ObfuscatedName("cx.au")
    public int[] field1229 = new int[4];

    @ObfuscatedName("cx.ah")
    public int[] field1230 = new int[4];

    @ObfuscatedName("cx.ad")
    public int[] field1252 = new int[4];

    @ObfuscatedName("cx.at")
    public int[] field1242 = new int[4];

    @ObfuscatedName("cx.bg")
    public int[] field1233 = new int[4];

    @ObfuscatedName("cx.bf")
    public class192 field1247 = new class192();

    @ObfuscatedName("cx.bi")
    public int field1209 = -1;

    @ObfuscatedName("cx.bv")
    public boolean field1227 = false;

    @ObfuscatedName("cx.bz")
    public int field1237 = -1;

    @ObfuscatedName("cx.ba")
    public int field1238 = -1;

    @ObfuscatedName("cx.bp")
    public int field1239 = 0;

    @ObfuscatedName("cx.bn")
    public int field1232 = 0;

    @ObfuscatedName("cx.br")
    public int field1261 = -1;

    @ObfuscatedName("cx.bc")
    public int field1253 = 0;

    @ObfuscatedName("cx.bw")
    public int field1243 = 0;

    @ObfuscatedName("cx.bx")
    public int field1256 = 0;

    @ObfuscatedName("cx.bq")
    public int field1245 = 0;

    @ObfuscatedName("cx.bd")
    public int field1246 = -1;

    @ObfuscatedName("cx.bo")
    public int field1222 = 0;

    @ObfuscatedName("cx.bm")
    public int field1248 = 0;

    @ObfuscatedName("cx.bs")
    public int field1249;

    @ObfuscatedName("cx.bt")
    public int field1240;

    @ObfuscatedName("cx.bk")
    public int field1251;

    @ObfuscatedName("cx.bl")
    public int field1257;

    @ObfuscatedName("cx.be")
    public int field1214;

    @ObfuscatedName("cx.by")
    public int field1254;

    @ObfuscatedName("cx.bh")
    public int field1255;

    @ObfuscatedName("cx.bj")
    public int field1260;

    @ObfuscatedName("cx.bu")
    public int field1262;

    @ObfuscatedName("cx.bb")
    public int field1241 = 0;

    @ObfuscatedName("cx.cx")
    public int field1259 = 200;

    @ObfuscatedName("cx.cw")
    public int field1250;

    @ObfuscatedName("cx.ch")
    public int field1231 = 0;

    @ObfuscatedName("cx.ca")
    public int field1228 = 32;

    @ObfuscatedName("cx.ci")
    public int field1211 = 0;

    @ObfuscatedName("cx.co")
    public int[] field1264 = new int[10];

    @ObfuscatedName("cx.cz")
    public int[] field1265 = new int[10];

    @ObfuscatedName("cx.cj")
    public byte[] field1266 = new byte[10];

    @ObfuscatedName("cx.cp")
    public int field1267 = 0;

    @ObfuscatedName("cx.cn")
    public int field1268 = 0;

    @ObfuscatedName("cx.ax(I)V")
    public final void method1350() {
        this.field1211 = 0;
        this.field1268 = 0;
    }

    @ObfuscatedName("cx.j(S)Z")
    public boolean method1011() {
        return false;
    }

    @ObfuscatedName("cx.af(IIIIIII)V")
    public final void method1352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1252[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class255 var13 = class255.method191(arg0);
            var11 = var13.field3436;
            var12 = var13.field3419;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1252[0];
            } else if (var11 == 1) {
                var14 = this.field1230[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1252[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1252[var15];
                    }
                } else if (var11 == 1 && this.field1230[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1230[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1225 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1225;
                this.field1225 = (byte) ((this.field1225 + 1) % 4);
                if (this.field1252[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1229[var10] = arg0;
        this.field1230[var10] = arg1;
        this.field1242[var10] = arg2;
        this.field1233[var10] = arg3;
        this.field1252[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("cx.ae(IIIIIII)V")
    public final void method1354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class249 var7 = (class249) class249.field3378.method3182((long) arg0);
        class249 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3373.method3720(33, arg0);
            class249 var10 = new class249();
            if (var9 != null) {
                var10.method3973(new class174(var9));
            }
            class249.field3378.method3179(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class249 var11 = var8;
        class86 var12 = null;
        class86 var13 = null;
        int var14 = var8.field3377;
        int var15 = 0;
        for (class86 var16 = (class86) this.field1247.method3222(); var16 != null; var16 = (class86) this.field1247.method3213()) {
            var15++;
            if (var16.field1356.field3375 == var11.field3375) {
                var16.method1471(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1356.field3376 <= var11.field3376) {
                var12 = var16;
            }
            if (var16.field1356.field3377 > var14) {
                var13 = var16;
                var14 = var16.field1356.field3377;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class86 var17 = new class86(var11);
        if (var12 == null) {
            this.field1247.method3207(var17);
        } else {
            class192.method3208(var17, var12);
        }
        var17.method1471(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3234();
        }
    }

    @ObfuscatedName("cx.ap(II)V")
    public final void method1355(int arg0) {
        class249 var2 = (class249) class249.field3378.method3182((long) arg0);
        class249 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3373.method3720(33, arg0);
            class249 var5 = new class249();
            if (var4 != null) {
                var5.method3973(new class174(var4));
            }
            class249.field3378.method3179(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class249 var6 = var3;
        for (class86 var7 = (class86) this.field1247.method3222(); var7 != null; var7 = (class86) this.field1247.method3213()) {
            if (var7.field1356 == var6) {
                var7.method3234();
                return;
            }
        }
    }
}
