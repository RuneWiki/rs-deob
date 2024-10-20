package deob;

@ObfuscatedName("cr")
public abstract class class79 extends class143 {

    @ObfuscatedName("cr.ao")
    public int field1262;

    @ObfuscatedName("cr.an")
    public boolean field1222 = false;

    @ObfuscatedName("cr.ar")
    public int field1259;

    @ObfuscatedName("cr.ag")
    public int field1221;

    @ObfuscatedName("cr.av")
    public int field1220 = 1;

    @ObfuscatedName("cr.ab")
    public int field1224 = -1;

    @ObfuscatedName("cr.aj")
    public int field1242 = -1;

    @ObfuscatedName("cr.ae")
    public int field1226 = -1;

    @ObfuscatedName("cr.at")
    public int field1227 = -1;

    @ObfuscatedName("cr.as")
    public int field1219 = -1;

    @ObfuscatedName("cr.af")
    public int field1229 = -1;

    @ObfuscatedName("cr.au")
    public int field1230 = -1;

    @ObfuscatedName("cr.az")
    public int field1223 = -1;

    @ObfuscatedName("cr.al")
    public String field1238 = null;

    @ObfuscatedName("cr.am")
    public boolean field1274;

    @ObfuscatedName("cr.ah")
    public boolean field1271 = false;

    @ObfuscatedName("cr.ap")
    public int field1275 = 100;

    @ObfuscatedName("cr.ad")
    public int field1236 = 0;

    @ObfuscatedName("cr.aa")
    public int field1237 = 0;

    @ObfuscatedName("cr.aq")
    public byte field1233 = 0;

    @ObfuscatedName("cr.ai")
    public int[] field1239 = new int[4];

    @ObfuscatedName("cr.ak")
    public int[] field1240 = new int[4];

    @ObfuscatedName("cr.ac")
    public int[] field1241 = new int[4];

    @ObfuscatedName("cr.ay")
    public int[] field1273 = new int[4];

    @ObfuscatedName("cr.bk")
    public int[] field1253 = new int[4];

    @ObfuscatedName("cr.bi")
    public class193 field1244 = new class193();

    @ObfuscatedName("cr.ba")
    public int field1245 = -1;

    @ObfuscatedName("cr.bn")
    public boolean field1246 = false;

    @ObfuscatedName("cr.by")
    public int field1247 = -1;

    @ObfuscatedName("cr.bc")
    public int field1235 = -1;

    @ObfuscatedName("cr.bh")
    public int field1249 = 0;

    @ObfuscatedName("cr.bw")
    public int field1250 = 0;

    @ObfuscatedName("cr.bj")
    public int field1251 = -1;

    @ObfuscatedName("cr.bp")
    public int field1243 = 0;

    @ObfuscatedName("cr.bu")
    public int field1268 = 0;

    @ObfuscatedName("cr.bg")
    public int field1254 = 0;

    @ObfuscatedName("cr.bb")
    public int field1255 = 0;

    @ObfuscatedName("cr.bd")
    public int field1256 = -1;

    @ObfuscatedName("cr.bq")
    public int field1257 = 0;

    @ObfuscatedName("cr.be")
    public int field1258 = 0;

    @ObfuscatedName("cr.bl")
    public int field1225;

    @ObfuscatedName("cr.bt")
    public int field1260;

    @ObfuscatedName("cr.bm")
    public int field1261;

    @ObfuscatedName("cr.bo")
    public int field1272;

    @ObfuscatedName("cr.bf")
    public int field1263;

    @ObfuscatedName("cr.bv")
    public int field1264;

    @ObfuscatedName("cr.bx")
    public int field1265;

    @ObfuscatedName("cr.bz")
    public int field1266;

    @ObfuscatedName("cr.br")
    public int field1267;

    @ObfuscatedName("cr.bs")
    public int field1276 = 0;

    @ObfuscatedName("cr.cr")
    public int field1232 = 200;

    @ObfuscatedName("cr.cf")
    public int field1270;

    @ObfuscatedName("cr.ch")
    public int field1248 = 0;

    @ObfuscatedName("cr.cn")
    public int field1231 = 32;

    @ObfuscatedName("cr.ct")
    public int field1269 = 0;

    @ObfuscatedName("cr.cm")
    public int[] field1228 = new int[10];

    @ObfuscatedName("cr.cg")
    public int[] field1234 = new int[10];

    @ObfuscatedName("cr.cp")
    public byte[] field1252 = new byte[10];

    @ObfuscatedName("cr.ci")
    public int field1277 = 0;

    @ObfuscatedName("cr.cs")
    public int field1278 = 0;

    @ObfuscatedName("cr.an(I)V")
    public final void method1392() {
        this.field1269 = 0;
        this.field1278 = 0;
    }

    @ObfuscatedName("cr.c(I)Z")
    public boolean method1094() {
        return false;
    }

    @ObfuscatedName("cr.ar(IIIIIII)V")
    public final void method1395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1241[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class256 var13 = Statics.method3763(arg0);
            var11 = var13.field3400;
            var12 = var13.field3411;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1241[0];
            } else if (var11 == 1) {
                var14 = this.field1240[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1241[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1241[var15];
                    }
                } else if (var11 == 1 && this.field1240[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1240[var15];
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
                if (this.field1241[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1239[var10] = arg0;
        this.field1240[var10] = arg1;
        this.field1273[var10] = arg2;
        this.field1253[var10] = arg3;
        this.field1241[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("cr.ag(IIIIIIS)V")
    public final void method1396(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class250 var7 = (class250) class250.field3351.method3271((long) arg0);
        class250 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3350.method3773(33, arg0);
            class250 var10 = new class250();
            if (var9 != null) {
                var10.method4065(new class175(var9));
            }
            class250.field3351.method3270(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class250 var11 = var8;
        class87 var12 = null;
        class87 var13 = null;
        int var14 = var8.field3354;
        int var15 = 0;
        for (class87 var16 = (class87) this.field1244.method3290(); var16 != null; var16 = (class87) this.field1244.method3307()) {
            var15++;
            if (var16.field1377.field3353 == var11.field3353) {
                var16.method1538(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1377.field3349 <= var11.field3349) {
                var12 = var16;
            }
            if (var16.field1377.field3354 > var14) {
                var13 = var16;
                var14 = var16.field1377.field3354;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class87 var17 = new class87(var11);
        if (var12 == null) {
            this.field1244.method3287(var17);
        } else {
            class193.method3297(var17, var12);
        }
        var17.method1538(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3314();
        }
    }

    @ObfuscatedName("cr.av(IB)V")
    public final void method1397(int arg0) {
        class250 var2 = (class250) class250.field3351.method3271((long) arg0);
        class250 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3350.method3773(33, arg0);
            class250 var5 = new class250();
            if (var4 != null) {
                var5.method4065(new class175(var4));
            }
            class250.field3351.method3270(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class250 var6 = var3;
        for (class87 var7 = (class87) this.field1244.method3290(); var7 != null; var7 = (class87) this.field1244.method3307()) {
            if (var7.field1377 == var6) {
                var7.method3314();
                return;
            }
        }
    }
}
