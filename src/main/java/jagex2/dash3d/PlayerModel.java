package jagex2.dash3d;

import deob.ObfuscatedName;
import deob.Statics;
import jagex2.config.IdkType;
import jagex2.config.NpcType;
import jagex2.config.ObjType;
import jagex2.config.SeqType;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Model;
import jagex2.graphics.SoftwareModel;
import jagex2.io.Packet;

@ObfuscatedName("ct")
public class PlayerModel {

    @ObfuscatedName("ct.r")
    public int[] field1228;

    @ObfuscatedName("ct.d")
    public int[] field1223;

    @ObfuscatedName("ct.l")
    public boolean field1222;

    @ObfuscatedName("ct.m")
    public int field1225;

    @ObfuscatedName("ct.c")
    public long field1226;

    @ObfuscatedName("ct.n")
    public long field1227;

    @ObfuscatedName("ct.i")
    public static final int[] field1230 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ct.s")
    public static LruCache field1231 = new LruCache(260);

    @ObfuscatedName("ct.r([I[IZII)V")
    public void method1168(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1628; var6++) {
                    IdkType var7 = IdkType.method346(var6);
                    if (var7 != null && !var7.field2404 && var7.field2403 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field1230[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field1228 = arg0;
        this.field1223 = arg1;
        this.field1222 = arg2;
        this.field1225 = arg3;
        this.method1173();
    }

    @ObfuscatedName("ct.d(IZI)V")
    public void method1169(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field1222) {
            return;
        }
        int var3 = this.field1228[field1230[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        IdkType var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1628) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1628 - 1;
                }
            }
            var4 = IdkType.method346(var3);
        } while (var4 == null || var4.field2404 || var4.field2403 != (this.field1222 ? 7 : 0) + arg0);
        this.field1228[field1230[arg0]] = var3 + 256;
        this.method1173();
    }

    @ObfuscatedName("ct.l(IZI)V")
    public void method1170(int arg0, boolean arg1) {
        int var3 = this.field1223[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field800[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field800[arg0].length - 1;
            }
        }
        this.field1223[arg0] = var3;
        this.method1173();
    }

    @ObfuscatedName("ct.m(ZI)V")
    public void method1171(boolean arg0) {
        if (this.field1222 != arg0) {
            this.method1168((int[]) null, this.field1223, arg0, -1);
        }
    }

    @ObfuscatedName("ct.c(Lev;I)V")
    public void method1172(Packet arg0) {
        arg0.method1587(this.field1222 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field1228[field1230[var2]];
            if (var3 == 0) {
                arg0.method1587(-1);
            } else {
                arg0.method1587(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method1587(this.field1223[var4]);
        }
    }

    @ObfuscatedName("ct.n(I)V")
    public void method1173() {
        long var1 = this.field1226;
        int var3 = this.field1228[5];
        int var4 = this.field1228[9];
        this.field1228[5] = var4;
        this.field1228[9] = var3;
        this.field1226 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1226 <<= 0x4;
            if (this.field1228[var5] >= 256) {
                this.field1226 += (long) (this.field1228[var5] - 256);
            }
        }
        if (this.field1228[0] >= 256) {
            this.field1226 += (long) (this.field1228[0] - 256 >> 4);
        }
        if (this.field1228[1] >= 256) {
            this.field1226 += (long) (this.field1228[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field1226 <<= 0x3;
            this.field1226 += (long) this.field1223[var6];
        }
        this.field1226 <<= 0x1;
        this.field1226 += (long) (this.field1222 ? 1 : 0);
        this.field1228[5] = var3;
        this.field1228[9] = var4;
        if (var1 != 0L && this.field1226 != var1) {
            field1231.method1245(var1);
        }
    }

    @ObfuscatedName("ct.j(Leo;ILeo;IB)Lfo;")
    public SoftwareModel method1174(SeqType arg0, int arg1, SeqType arg2, int arg3) {
        if (this.field1225 != -1) {
            return NpcType.method275(this.field1225).method2330(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field1226;
        int[] var7 = this.field1228;
        if (arg0 != null && (arg0.field2372 >= 0 || arg0.field2373 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field1228[var8];
            }
            if (arg0.field2372 >= 0) {
                var5 += (long) (arg0.field2372 - this.field1228[5] << 40);
                var7[5] = arg0.field2372;
            }
            if (arg0.field2373 >= 0) {
                var5 += (long) (arg0.field2373 - this.field1228[3] << 48);
                var7[3] = arg0.field2373;
            }
        }
        SoftwareModel var9 = (SoftwareModel) field1231.method1244(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !IdkType.method346(var12 - 256).method2461()) {
                    var10 = true;
                }
                if (var12 >= 512 && !ObjType.method927(var12 - 512).method2547(this.field1222)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field1227 != -1L) {
                    var9 = (SoftwareModel) field1231.method1244(this.field1227);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                Model[] var13 = new Model[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        Model var17 = IdkType.method346(var16 - 256).method2465();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        Model var18 = ObjType.method927(var16 - 512).method2525(this.field1222);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                Model var19 = new Model(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field1223[var20] < Statics.field800[var20].length) {
                        var19.method2935(Statics.field51[var20], Statics.field800[var20][this.field1223[var20]]);
                    }
                    if (this.field1223[var20] < Statics.field1229[var20].length) {
                        var19.method2935(Statics.field1224[var20], Statics.field1229[var20][this.field1223[var20]]);
                    }
                }
                var9 = var19.method2942(64, 850, -30, -50, -30);
                field1231.method1246(var9, var5);
                this.field1227 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        SoftwareModel var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method2421(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method2436(var9, arg3);
        } else {
            var21 = arg0.method2436(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ct.z(I)Lfw;")
    public Model method1192() {
        if (this.field1225 != -1) {
            return NpcType.method275(this.field1225).method2331();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field1228[var2];
            if (var3 >= 256 && var3 < 512 && !IdkType.method346(var3 - 256).method2463()) {
                var1 = true;
            }
            if (var3 >= 512 && !ObjType.method927(var3 - 512).method2554(this.field1222)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        Model[] var4 = new Model[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field1228[var6];
            if (var7 >= 256 && var7 < 512) {
                Model var8 = IdkType.method346(var7 - 256).method2480();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                Model var9 = ObjType.method927(var7 - 512).method2527(this.field1222);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        Model var10 = new Model(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1223[var11] < Statics.field800[var11].length) {
                var10.method2935(Statics.field51[var11], Statics.field800[var11][this.field1223[var11]]);
            }
            if (this.field1223[var11] < Statics.field1229[var11].length) {
                var10.method2935(Statics.field1224[var11], Statics.field1229[var11][this.field1223[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ct.g(I)I")
    public int method1176() {
        return this.field1225 == -1 ? (this.field1228[11] << 5) + (this.field1228[8] << 10) + (this.field1228[0] << 15) + (this.field1223[4] << 20) + (this.field1223[0] << 25) + this.field1228[1] : 305419896 + NpcType.method275(this.field1225).field2271;
    }

    @ObfuscatedName("ba.q(I)V")
    public static void method912() {
        field1231.method1253();
    }
}
