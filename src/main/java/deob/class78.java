package deob;

@ObfuscatedName("bw")
public abstract class class78 extends class141 {

    @ObfuscatedName("bw.au")
    public int field1195;

    @ObfuscatedName("bw.ae")
    public int field1157;

    @ObfuscatedName("bw.ak")
    public int field1147;

    @ObfuscatedName("bw.aq")
    public boolean field1148 = false;

    @ObfuscatedName("bw.an")
    public int field1149 = 1;

    @ObfuscatedName("bw.am")
    public int field1150 = -1;

    @ObfuscatedName("bw.ar")
    public int field1151 = -1;

    @ObfuscatedName("bw.ao")
    public int field1172 = -1;

    @ObfuscatedName("bw.at")
    public int field1153 = -1;

    @ObfuscatedName("bw.ac")
    public int field1154 = -1;

    @ObfuscatedName("bw.as")
    public int field1155 = -1;

    @ObfuscatedName("bw.ah")
    public int field1156 = -1;

    @ObfuscatedName("bw.aw")
    public int field1167 = -1;

    @ObfuscatedName("bw.al")
    public String field1177 = null;

    @ObfuscatedName("bw.aj")
    public boolean field1159;

    @ObfuscatedName("bw.ap")
    public boolean field1160 = false;

    @ObfuscatedName("bw.ag")
    public int field1202 = 100;

    @ObfuscatedName("bw.af")
    public int field1162 = 0;

    @ObfuscatedName("bw.ay")
    public int field1146 = 0;

    @ObfuscatedName("bw.ax")
    public byte field1193 = 0;

    @ObfuscatedName("bw.ai")
    public int[] field1164 = new int[4];

    @ObfuscatedName("bw.az")
    public int[] field1166 = new int[4];

    @ObfuscatedName("bw.aa")
    public int[] field1197 = new int[4];

    @ObfuscatedName("bw.ad")
    public int[] field1168 = new int[4];

    @ObfuscatedName("bw.ba")
    public int[] field1169 = new int[4];

    @ObfuscatedName("bw.bi")
    public class199 field1170 = new class199();

    @ObfuscatedName("bw.bq")
    public int field1171 = -1;

    @ObfuscatedName("bw.bc")
    public boolean field1188 = false;

    @ObfuscatedName("bw.bb")
    public int field1173 = -1;

    @ObfuscatedName("bw.bl")
    public int field1174 = -1;

    @ObfuscatedName("bw.bt")
    public int field1181 = 0;

    @ObfuscatedName("bw.be")
    public int field1176 = 0;

    @ObfuscatedName("bw.by")
    public int field1158 = -1;

    @ObfuscatedName("bw.bk")
    public int field1178 = 0;

    @ObfuscatedName("bw.br")
    public int field1145 = 0;

    @ObfuscatedName("bw.bs")
    public int field1180 = 0;

    @ObfuscatedName("bw.bz")
    public int field1189 = 0;

    @ObfuscatedName("bw.bh")
    public int field1182 = -1;

    @ObfuscatedName("bw.bp")
    public int field1191 = 0;

    @ObfuscatedName("bw.bf")
    public int field1184 = 0;

    @ObfuscatedName("bw.bv")
    public int field1185;

    @ObfuscatedName("bw.bx")
    public int field1186;

    @ObfuscatedName("bw.bm")
    public int field1187;

    @ObfuscatedName("bw.bn")
    public int field1175;

    @ObfuscatedName("bw.bu")
    public int field1163;

    @ObfuscatedName("bw.bd")
    public int field1165;

    @ObfuscatedName("bw.bo")
    public int field1179;

    @ObfuscatedName("bw.bg")
    public int field1192;

    @ObfuscatedName("bw.bj")
    public int field1196;

    @ObfuscatedName("bw.bw")
    public int field1194 = 0;

    @ObfuscatedName("bw.ce")
    public int field1152 = 200;

    @ObfuscatedName("bw.cg")
    public int field1183;

    @ObfuscatedName("bw.cw")
    public int field1161 = 0;

    @ObfuscatedName("bw.ch")
    public int field1198 = 32;

    @ObfuscatedName("bw.cc")
    public int field1199 = 0;

    @ObfuscatedName("bw.cz")
    public int[] field1200 = new int[10];

    @ObfuscatedName("bw.cy")
    public int[] field1201 = new int[10];

    @ObfuscatedName("bw.cj")
    public byte[] field1190 = new byte[10];

    @ObfuscatedName("bw.cv")
    public int field1203 = 0;

    @ObfuscatedName("bw.cd")
    public int field1204 = 0;

    @ObfuscatedName("bw.am(B)V")
    public final void method1386() {
        this.field1199 = 0;
        this.field1204 = 0;
    }

    @ObfuscatedName("bw.u(B)Z")
    public boolean method987() {
        return false;
    }

    @ObfuscatedName("bw.ar(IIIIIIB)V")
    public final void method1390(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1197[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class262 var13 = class262.method852(arg0);
            var11 = var13.field3480;
            var12 = var13.field3471;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1197[0];
            } else if (var11 == 1) {
                var14 = this.field1166[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1197[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1197[var15];
                    }
                } else if (var11 == 1 && this.field1166[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1166[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1193 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1193;
                this.field1193 = (byte) ((this.field1193 + 1) % 4);
                if (this.field1197[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1164[var10] = arg0;
        this.field1166[var10] = arg1;
        this.field1168[var10] = arg2;
        this.field1169[var10] = arg3;
        this.field1197[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bw.ao(IIIIIII)V")
    public final void method1398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class256 var7 = class256.method2218(arg0);
        class85 var8 = null;
        class85 var9 = null;
        int var10 = var7.field3417;
        int var11 = 0;
        for (class85 var12 = (class85) this.field1170.method3362(); var12 != null; var12 = (class85) this.field1170.method3364()) {
            var11++;
            if (var12.field1284.field3415 == var7.field3415) {
                var12.method1526(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1284.field3416 <= var7.field3416) {
                var8 = var12;
            }
            if (var12.field1284.field3417 > var10) {
                var9 = var12;
                var10 = var12.field1284.field3417;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class85 var13 = new class85(var7);
        if (var8 == null) {
            this.field1170.method3359(var13);
        } else {
            class199.method3360(var13, var8);
        }
        var13.method1526(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3392();
        }
    }

    @ObfuscatedName("bw.at(II)V")
    public final void method1385(int arg0) {
        class256 var2 = class256.method2218(arg0);
        for (class85 var3 = (class85) this.field1170.method3362(); var3 != null; var3 = (class85) this.field1170.method3364()) {
            if (var3.field1284 == var2) {
                var3.method3392();
                return;
            }
        }
    }
}
