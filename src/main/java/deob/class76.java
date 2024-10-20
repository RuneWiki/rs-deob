package deob;

@ObfuscatedName("bw")
public abstract class class76 extends class140 {

    @ObfuscatedName("bw.aj")
    public int field1175;

    @ObfuscatedName("bw.ae")
    public int field1138;

    @ObfuscatedName("bw.am")
    public int field1139;

    @ObfuscatedName("bw.az")
    public boolean field1166 = false;

    @ObfuscatedName("bw.ap")
    public int field1140 = 1;

    @ObfuscatedName("bw.ah")
    public int field1142;

    @ObfuscatedName("bw.au")
    public int field1181 = -1;

    @ObfuscatedName("bw.ax")
    public int field1144 = -1;

    @ObfuscatedName("bw.ar")
    public int field1165 = -1;

    @ObfuscatedName("bw.an")
    public int field1146 = -1;

    @ObfuscatedName("bw.ai")
    public int field1159 = -1;

    @ObfuscatedName("bw.al")
    public int field1148 = -1;

    @ObfuscatedName("bw.at")
    public int field1149 = -1;

    @ObfuscatedName("bw.ag")
    public int field1195 = -1;

    @ObfuscatedName("bw.as")
    public String field1188 = null;

    @ObfuscatedName("bw.aw")
    public boolean field1152;

    @ObfuscatedName("bw.aq")
    public boolean field1153 = false;

    @ObfuscatedName("bw.aa")
    public int field1154 = 100;

    @ObfuscatedName("bw.af")
    public int field1150 = 0;

    @ObfuscatedName("bw.ak")
    public int field1156 = 0;

    @ObfuscatedName("bw.ac")
    public byte field1157 = 0;

    @ObfuscatedName("bw.ad")
    public int[] field1158 = new int[4];

    @ObfuscatedName("bw.bg")
    public int[] field1137 = new int[4];

    @ObfuscatedName("bw.br")
    public int[] field1145 = new int[4];

    @ObfuscatedName("bw.ba")
    public int[] field1161 = new int[4];

    @ObfuscatedName("bw.bk")
    public int[] field1162 = new int[4];

    @ObfuscatedName("bw.be")
    public class216 field1163 = new class216();

    @ObfuscatedName("bw.bc")
    public int field1164 = -1;

    @ObfuscatedName("bw.bm")
    public boolean field1189 = false;

    @ObfuscatedName("bw.bh")
    public int field1143 = -1;

    @ObfuscatedName("bw.bs")
    public int field1172 = -1;

    @ObfuscatedName("bw.bj")
    public int field1168 = 0;

    @ObfuscatedName("bw.bt")
    public int field1169 = 0;

    @ObfuscatedName("bw.by")
    public int field1170 = -1;

    @ObfuscatedName("bw.bn")
    public int field1171 = 0;

    @ObfuscatedName("bw.bb")
    public int field1141 = 0;

    @ObfuscatedName("bw.bq")
    public int field1173 = 0;

    @ObfuscatedName("bw.bz")
    public int field1187 = 0;

    @ObfuscatedName("bw.bx")
    public int field1190 = -1;

    @ObfuscatedName("bw.bf")
    public int field1176 = 0;

    @ObfuscatedName("bw.bo")
    public int field1177 = 0;

    @ObfuscatedName("bw.bv")
    public int field1178;

    @ObfuscatedName("bw.bi")
    public int field1179;

    @ObfuscatedName("bw.bu")
    public int field1160;

    @ObfuscatedName("bw.bl")
    public int field1147;

    @ObfuscatedName("bw.bw")
    public int field1182;

    @ObfuscatedName("bw.bp")
    public int field1183;

    @ObfuscatedName("bw.bd")
    public int field1184;

    @ObfuscatedName("bw.cb")
    public int field1185;

    @ObfuscatedName("bw.cm")
    public int field1186;

    @ObfuscatedName("bw.cu")
    public int field1167 = 0;

    @ObfuscatedName("bw.cs")
    public int field1174 = 200;

    @ObfuscatedName("bw.ct")
    public int field1155;

    @ObfuscatedName("bw.cw")
    public int field1151 = 0;

    @ObfuscatedName("bw.ch")
    public int field1191 = 32;

    @ObfuscatedName("bw.cr")
    public int field1192 = 0;

    @ObfuscatedName("bw.co")
    public int[] field1193 = new int[10];

    @ObfuscatedName("bw.cv")
    public int[] field1194 = new int[10];

    @ObfuscatedName("bw.cd")
    public byte[] field1180 = new byte[10];

    @ObfuscatedName("bw.cq")
    public int field1196 = 0;

    @ObfuscatedName("bw.ci")
    public int field1197 = 0;

    @ObfuscatedName("bw.ac(B)V")
    public final void method1513() {
        this.field1192 = 0;
        this.field1197 = 0;
    }

    @ObfuscatedName("bw.k(I)Z")
    public boolean method1102() {
        return false;
    }

    @ObfuscatedName("bw.ad(IIIIIII)V")
    public final void method1515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1145[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class282 var13 = class282.method1511(arg0);
            var11 = var13.field3576;
            var12 = var13.field3581;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1145[0];
            } else if (var11 == 1) {
                var14 = this.field1137[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1145[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1145[var15];
                    }
                } else if (var11 == 1 && this.field1137[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1137[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1157 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1157;
                this.field1157 = (byte) ((this.field1157 + 1) % 4);
                if (this.field1145[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1158[var10] = arg0;
        this.field1137[var10] = arg1;
        this.field1161[var10] = arg2;
        this.field1162[var10] = arg3;
        this.field1145[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bw.bg(IIIIIII)V")
    public final void method1516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class276 var7 = (class276) class276.field3528.method3625((long) arg0);
        class276 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3526.method4265(33, arg0);
            class276 var10 = new class276();
            if (var9 != null) {
                var10.method4469(new class195(var9));
            }
            class276.field3528.method3627(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class276 var11 = var8;
        class84 var12 = null;
        class84 var13 = null;
        int var14 = var8.field3530;
        int var15 = 0;
        for (class84 var16 = (class84) this.field1163.method3683(); var16 != null; var16 = (class84) this.field1163.method3702()) {
            var15++;
            if (var16.field1279.field3537 == var11.field3537) {
                var16.method1744(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1279.field3529 <= var11.field3529) {
                var12 = var16;
            }
            if (var16.field1279.field3530 > var14) {
                var13 = var16;
                var14 = var16.field1279.field3530;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class84 var17 = new class84(var11);
        if (var12 == null) {
            this.field1163.method3680(var17);
        } else {
            class216.method3681(var17, var12);
        }
        var17.method1744(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3721();
        }
    }

    @ObfuscatedName("bw.br(II)V")
    public final void method1517(int arg0) {
        class276 var2 = (class276) class276.field3528.method3625((long) arg0);
        class276 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3526.method4265(33, arg0);
            class276 var5 = new class276();
            if (var4 != null) {
                var5.method4469(new class195(var4));
            }
            class276.field3528.method3627(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class276 var6 = var3;
        for (class84 var7 = (class84) this.field1163.method3683(); var7 != null; var7 = (class84) this.field1163.method3702()) {
            if (var7.field1279 == var6) {
                var7.method3721();
                return;
            }
        }
    }
}
