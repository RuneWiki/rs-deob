package deob;

@ObfuscatedName("cj")
public abstract class class79 extends class142 {

    @ObfuscatedName("cj.ac")
    public int field1232;

    @ObfuscatedName("cj.ax")
    public int field1191;

    @ObfuscatedName("cj.at")
    public int field1192;

    @ObfuscatedName("cj.ag")
    public boolean field1193 = false;

    @ObfuscatedName("cj.ar")
    public int field1217 = 1;

    @ObfuscatedName("cj.ae")
    public int field1195 = -1;

    @ObfuscatedName("cj.ai")
    public int field1196 = -1;

    @ObfuscatedName("cj.au")
    public int field1197 = -1;

    @ObfuscatedName("cj.ad")
    public int field1198 = -1;

    @ObfuscatedName("cj.ah")
    public int field1206 = -1;

    @ObfuscatedName("cj.ao")
    public int field1250 = -1;

    @ObfuscatedName("cj.av")
    public int field1201 = -1;

    @ObfuscatedName("cj.az")
    public int field1218 = -1;

    @ObfuscatedName("cj.aq")
    public String field1226 = null;

    @ObfuscatedName("cj.ay")
    public boolean field1204;

    @ObfuscatedName("cj.an")
    public boolean field1194 = false;

    @ObfuscatedName("cj.af")
    public int field1214 = 100;

    @ObfuscatedName("cj.aa")
    public int field1207 = 0;

    @ObfuscatedName("cj.ak")
    public int field1212 = 0;

    @ObfuscatedName("cj.ap")
    public byte field1190 = 0;

    @ObfuscatedName("cj.aw")
    public int[] field1203 = new int[4];

    @ObfuscatedName("cj.al")
    public int[] field1200 = new int[4];

    @ObfuscatedName("cj.ab")
    public int[] field1244 = new int[4];

    @ObfuscatedName("cj.aj")
    public int[] field1213 = new int[4];

    @ObfuscatedName("cj.bz")
    public int[] field1238 = new int[4];

    @ObfuscatedName("cj.bi")
    public class192 field1215 = new class192();

    @ObfuscatedName("cj.bu")
    public int field1216 = -1;

    @ObfuscatedName("cj.bq")
    public boolean field1220 = false;

    @ObfuscatedName("cj.bs")
    public int field1210 = -1;

    @ObfuscatedName("cj.bv")
    public int field1211 = -1;

    @ObfuscatedName("cj.bh")
    public int field1223 = 0;

    @ObfuscatedName("cj.bx")
    public int field1221 = 0;

    @ObfuscatedName("cj.bn")
    public int field1222 = -1;

    @ObfuscatedName("cj.bl")
    public int field1237 = 0;

    @ObfuscatedName("cj.bf")
    public int field1224 = 0;

    @ObfuscatedName("cj.bd")
    public int field1225 = 0;

    @ObfuscatedName("cj.bw")
    public int field1219 = 0;

    @ObfuscatedName("cj.br")
    public int field1227 = -1;

    @ObfuscatedName("cj.bt")
    public int field1228 = 0;

    @ObfuscatedName("cj.bp")
    public int field1229 = 0;

    @ObfuscatedName("cj.ba")
    public int field1230;

    @ObfuscatedName("cj.bc")
    public int field1231;

    @ObfuscatedName("cj.bm")
    public int field1205;

    @ObfuscatedName("cj.bb")
    public int field1233;

    @ObfuscatedName("cj.bj")
    public int field1234;

    @ObfuscatedName("cj.bk")
    public int field1202;

    @ObfuscatedName("cj.bg")
    public int field1236;

    @ObfuscatedName("cj.bo")
    public int field1208;

    @ObfuscatedName("cj.be")
    public int field1209;

    @ObfuscatedName("cj.by")
    public int field1239 = 0;

    @ObfuscatedName("cj.cj")
    public int field1240 = 200;

    @ObfuscatedName("cj.cl")
    public int field1241;

    @ObfuscatedName("cj.cc")
    public int field1242 = 0;

    @ObfuscatedName("cj.ci")
    public int field1243 = 32;

    @ObfuscatedName("cj.cu")
    public int field1235 = 0;

    @ObfuscatedName("cj.cg")
    public int[] field1245 = new int[10];

    @ObfuscatedName("cj.ch")
    public int[] field1246 = new int[10];

    @ObfuscatedName("cj.ct")
    public byte[] field1247 = new byte[10];

    @ObfuscatedName("cj.cf")
    public int field1248 = 0;

    @ObfuscatedName("cj.cm")
    public int field1249 = 0;

    @ObfuscatedName("cj.ac(B)V")
    public final void method1393() {
        this.field1235 = 0;
        this.field1249 = 0;
    }

    @ObfuscatedName("cj.v(B)Z")
    public boolean method1037() {
        return false;
    }

    @ObfuscatedName("cj.ax(IIIIIIB)V")
    public final void method1404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1244[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class255 var13 = class255.method3747(arg0);
            var11 = var13.field3412;
            var12 = var13.field3414;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1244[0];
            } else if (var11 == 1) {
                var14 = this.field1200[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1244[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1244[var15];
                    }
                } else if (var11 == 1 && this.field1200[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1200[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1190 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1190;
                this.field1190 = (byte) ((this.field1190 + 1) % 4);
                if (this.field1244[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1203[var10] = arg0;
        this.field1200[var10] = arg1;
        this.field1213[var10] = arg2;
        this.field1238[var10] = arg3;
        this.field1244[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("cj.at(IIIIIII)V")
    public final void method1395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class249 var7 = (class249) class249.field3347.method3252((long) arg0);
        class249 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3357.method3750(33, arg0);
            class249 var10 = new class249();
            if (var9 != null) {
                var10.method3990(new class174(var9));
            }
            class249.field3347.method3256(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class249 var11 = var8;
        class86 var12 = null;
        class86 var13 = null;
        int var14 = var8.field3349;
        int var15 = 0;
        for (class86 var16 = (class86) this.field1215.method3282(); var16 != null; var16 = (class86) this.field1215.method3277()) {
            var15++;
            if (var16.field1331.field3352 == var11.field3352) {
                var16.method1541(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1331.field3348 <= var11.field3348) {
                var12 = var16;
            }
            if (var16.field1331.field3349 > var14) {
                var13 = var16;
                var14 = var16.field1331.field3349;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class86 var17 = new class86(var11);
        if (var12 == null) {
            this.field1215.method3291(var17);
        } else {
            class192.method3280(var17, var12);
        }
        var17.method1541(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3312();
        }
    }

    @ObfuscatedName("cj.ag(II)V")
    public final void method1396(int arg0) {
        class249 var2 = (class249) class249.field3347.method3252((long) arg0);
        class249 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3357.method3750(33, arg0);
            class249 var5 = new class249();
            if (var4 != null) {
                var5.method3990(new class174(var4));
            }
            class249.field3347.method3256(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class249 var6 = var3;
        for (class86 var7 = (class86) this.field1215.method3282(); var7 != null; var7 = (class86) this.field1215.method3277()) {
            if (var7.field1331 == var6) {
                var7.method3312();
                return;
            }
        }
    }
}
