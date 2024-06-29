import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!mapview")
public class mapview extends GameShell {

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "I")
    private int field164 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "I")
    private int field165 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "I")
    private int field166 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "I")
    private int field167 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "I")
    private int field168 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "I")
    private int field169 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "Z")
    private boolean field170 = true;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "[Li;")
    private Pix8[] field180 = new Pix8[50];

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "[Lh;")
    private Pix24[] field181 = new Pix24[50];

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "[I")
    private int[] field191 = new int[2000];

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "[I")
    private int[] field192 = new int[2000];

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "[I")
    private int[] field193 = new int[2000];

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "[I")
    private int[] field195 = new int[2000];

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "[I")
    private int[] field196 = new int[2000];

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "[I")
    private int[] field197 = new int[2000];

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "I")
    private int field198 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "I")
    private int field199 = 13;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "I")
    private int field200 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "I")
    private int field201 = 470;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "Z")
    private boolean field204 = false;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "I")
    private int field205 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "I")
    private int field206 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "I")
    private int field207 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "I")
    private int field209 = 200;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "I")
    private int field210 = this.field209 * 1280 / 1216;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "I")
    private int field211 = 635 - this.field210 - 5;

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "I")
    private int field212 = 503 - this.field209 - 20;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "Z")
    private boolean field213 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Jb", descriptor = "I")
    private int field220 = 1000;

    @OriginalMember(owner = "mapview!mapview", name = "Kb", descriptor = "[Ljava/lang/String;")
    private String[] field221 = new String[this.field220];

    @OriginalMember(owner = "mapview!mapview", name = "Lb", descriptor = "[I")
    private int[] field222 = new int[this.field220];

    @OriginalMember(owner = "mapview!mapview", name = "Mb", descriptor = "[I")
    private int[] field223 = new int[this.field220];

    @OriginalMember(owner = "mapview!mapview", name = "Nb", descriptor = "[I")
    private int[] field224 = new int[this.field220];

    @OriginalMember(owner = "mapview!mapview", name = "Ob", descriptor = "D")
    private double field225 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "Pb", descriptor = "D")
    private double field226 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "Qb", descriptor = "I")
    private int field227 = 896;

    @OriginalMember(owner = "mapview!mapview", name = "Rb", descriptor = "I")
    private int field228 = 832;

    @OriginalMember(owner = "mapview!mapview", name = "Sb", descriptor = "[Ljava/lang/String;")
    private String[] field229 = new String[] { "General Store", "Sword Shop", "Magic Shop", "Axe Shop", "Helmet Shop", "Bank", "Quest Start", "Amulet Shop", "Mining Site", "Furnace", "Anvil", "Combat Training", "Dungeon", "Staff Shop", "Platebody Shop", "Platelegs Shop", "Scimitar Shop", "Archery Shop", "Shield Shop", "Altar", "Herbalist", "Jewelery", "Gem Shop", "Crafting Shop", "Candle Shop", "Fishing Shop", "Fishing Spot", "Clothes Shop", "Apothecary", "Silk Trader", "Kebab Seller", "Pub/Bar", "Mace Shop", "Tannery", "Rare Trees", "Spinning Wheel", "Food Shop", "Cookery Shop", "???", "Water Source", "Cooking Range", "Skirt Shop", "Potters Wheel", "Windmill", "Mining Shop", "Chainmail Shop", "Silver Shop", "Fur Trader", "Spice Shop" };

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "I")
    private int field171;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "I")
    private int field216;

    @OriginalMember(owner = "mapview!mapview", name = "Gb", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "mapview!mapview", name = "Hb", descriptor = "I")
    private int field218;

    @OriginalMember(owner = "mapview!mapview", name = "Ib", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "Lh;")
    private Pix24 field214;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "Lj;")
    private PixFont field182;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "Lg;")
    private WorldMapFont field183;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "Lg;")
    private WorldMapFont field184;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "Lg;")
    private WorldMapFont field185;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "Lg;")
    private WorldMapFont field186;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "Lg;")
    private WorldMapFont field187;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "Lg;")
    private WorldMapFont field188;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "Lg;")
    private WorldMapFont field189;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "Lg;")
    private WorldMapFont field190;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "[I")
    private int[] field172;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "[I")
    private int[] field173;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "[[B")
    private byte[][] field176;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "[[B")
    private byte[][] field177;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "[[B")
    private byte[][] field178;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "[[B")
    private byte[][] field179;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "[[I")
    private int[][] field174;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "[[I")
    private int[][] field175;

    @OriginalMember(owner = "mapview!mapview", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        mapview var1 = new mapview();
        var1.method6(635, 503);
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V")
    public final void init() {
        this.method10(635, 503);
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "()V")
    public final void method5() {
        Jagfile var1 = this.method85();
        this.method2(100, "Please wait... Rendering Map");
        Packet var2 = new Packet(var1.method76("labels.dat", (byte[]) null));
        this.field219 = var2.method57();
        for (int var3 = 0; var3 < this.field219; ++var3) {
            this.field221[var3] = var2.method59();
            this.field222[var3] = var2.method57();
            this.field223[var3] = var2.method57();
            this.field224[var3] = var2.method55();
        }
        Packet var4 = new Packet(var1.method76("floorcol.dat", (byte[]) null));
        int var5 = var4.method57();
        this.field172 = new int[var5 + 1];
        this.field173 = new int[var5 + 1];
        for (int var6 = 0; var6 < var5; ++var6) {
            this.field172[var6 + 1] = var4.method54();
            this.field173[var6 + 1] = var4.method54();
        }
        byte[] var7 = var1.method76("underlay.dat", (byte[]) null);
        byte[][] var8 = new byte[1280][1216];
        this.method78(var7, var8);
        byte[] var9 = var1.method76("overlay.dat", (byte[]) null);
        this.field175 = new int[1280][1216];
        this.field176 = new byte[1280][1216];
        this.method79(var9, this.field175, this.field176);
        byte[] var10 = var1.method76("loc.dat", (byte[]) null);
        this.field177 = new byte[1280][1216];
        this.field179 = new byte[1280][1216];
        this.field178 = new byte[1280][1216];
        this.method77(var10, this.field177, this.field179, this.field178);
        try {
            for (int var11 = 0; var11 < 50; ++var11) {
                this.field180[var11] = new Pix8(var1, "mapscene", var11);
            }
        } catch (Exception var14) {
        }
        try {
            for (int var12 = 0; var12 < 50; ++var12) {
                this.field181[var12] = new Pix24(var1, "mapfunction", var12);
            }
        } catch (Exception var13) {
        }
        this.field182 = new PixFont(var1, "b12");
        this.field183 = new WorldMapFont(11, true, this);
        this.field184 = new WorldMapFont(12, true, this);
        this.field185 = new WorldMapFont(14, true, this);
        this.field186 = new WorldMapFont(17, true, this);
        this.field187 = new WorldMapFont(19, true, this);
        this.field188 = new WorldMapFont(22, true, this);
        this.field189 = new WorldMapFont(26, true, this);
        this.field190 = new WorldMapFont(30, true, this);
        this.field174 = new int[1280][1216];
        this.method80(var8, this.field174);
        this.field214 = new Pix24(this.field210, this.field209);
        this.field214.method42();
        this.method83(0, 0, 1280, 1216, 0, 0, this.field210, this.field209);
        Draw2D.method28(0, 0, this.field210, this.field209, 0);
        Draw2D.method28(1, 1, this.field210 - 2, this.field209 - 2, this.field164);
        super.field10.method64();
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([B[[B[[B[[B)V")
    private final void method77(byte[] arg0, byte[][] arg1, byte[][] arg2, byte[][] arg3) {
        int var5 = 0;
        while (true) {
            while (var5 < arg0.length) {
                int var6 = (arg0[var5++] & 255) * 64 - 2304;
                int var7 = (arg0[var5++] & 255) * 64 - 2816;
                if (var6 > 0 && var7 > 0 && var6 + 64 < 1280 && var7 + 64 < 1216) {
                    for (int var8 = 0; var8 < 64; ++var8) {
                        byte[] var9 = arg1[var6 + var8];
                        byte[] var10 = arg2[var6 + var8];
                        byte[] var11 = arg3[var6 + var8];
                        int var12 = 1216 - var7 - 1;
                        for (int var13 = -64; var13 < 0; ++var13) {
                            while (true) {
                                int var14 = arg0[var5++] & 255;
                                if (var14 == 0) {
                                    --var12;
                                    break;
                                }
                                if (var14 < 29) {
                                    var9[var12] = (byte) var14;
                                } else if (var14 < 160) {
                                    var10[var12] = (byte) (var14 - 28);
                                } else {
                                    var11[var12] = (byte) (var14 - 159);
                                    this.field195[this.field194] = var6 + var8;
                                    this.field196[this.field194] = var12;
                                    this.field197[this.field194] = var14 - 160;
                                    ++this.field194;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < 64; ++var15) {
                        byte var17;
                        for (int var16 = -64; var16 < 0; ++var16) {
                            do {
                                var17 = arg0[var5++];
                            } while (var17 != 0);
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([B[[B)V")
    private final void method78(byte[] arg0, byte[][] arg1) {
        int var3 = 0;
        while (true) {
            while (var3 < arg0.length) {
                int var4 = (arg0[var3++] & 255) * 64 - 2304;
                int var5 = (arg0[var3++] & 255) * 64 - 2816;
                if (var4 > 0 && var5 > 0 && var4 + 64 < 1280 && var5 + 64 < 1216) {
                    for (int var6 = 0; var6 < 64; ++var6) {
                        byte[] var7 = arg1[var4 + var6];
                        int var8 = 1216 - var5 - 1;
                        for (int var9 = -64; var9 < 0; ++var9) {
                            var7[var8--] = arg0[var3++];
                        }
                    }
                } else {
                    var3 += 4096;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([B[[I[[B)V")
    private final void method79(byte[] arg0, int[][] arg1, byte[][] arg2) {
        int var4 = 0;
        while (true) {
            while (var4 < arg0.length) {
                int var5 = (arg0[var4++] & 255) * 64 - 2304;
                int var6 = (arg0[var4++] & 255) * 64 - 2816;
                if (var5 > 0 && var6 > 0 && var5 + 64 < 1280 && var6 + 64 < 1216) {
                    for (int var7 = 0; var7 < 64; ++var7) {
                        int[] var8 = arg1[var5 + var7];
                        byte[] var9 = arg2[var5 + var7];
                        int var10 = 1216 - var6 - 1;
                        for (int var11 = -64; var11 < 0; ++var11) {
                            byte var12 = arg0[var4++];
                            if (var12 != 0) {
                                var9[var10] = arg0[var4++];
                                var8[var10--] = this.field173[var12];
                            } else {
                                var8[var10--] = 0;
                            }
                        }
                    }
                } else {
                    for (int var13 = -4096; var13 < 0; ++var13) {
                        byte var14 = arg0[var4++];
                        if (var14 != 0) {
                            ++var4;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([[B[[I)V")
    private final void method80(byte[][] arg0, int[][] arg1) {
        short var3 = 1280;
        short var4 = 1216;
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; ++var6) {
            var5[var6] = 0;
        }
        for (int var7 = 5; var7 < var3 - 5; ++var7) {
            byte[] var8 = arg0[var7 + 5];
            byte[] var9 = arg0[var7 - 5];
            for (int var10 = 0; var10 < var4; ++var10) {
                var5[var10] += this.field172[var8[var10] & 255] - this.field172[var9[var10] & 255];
            }
            if (var7 > 10 && var7 < var3 - 10) {
                int var11 = 0;
                int var12 = 0;
                int var13 = 0;
                int[] var14 = arg1[var7];
                for (int var15 = 5; var15 < var4 - 5; ++var15) {
                    int var16 = var5[var15 - 5];
                    int var17 = var5[var15 + 5];
                    var11 += (var17 >> 20) - (var16 >> 20);
                    var12 += (var17 >> 10 & 1023) - (var16 >> 10 & 1023);
                    var13 += (var17 & 1023) - (var16 & 1023);
                    if (var13 > 0) {
                        var14[var15] = this.method81((double) var11 / 8533.0D, (double) var12 / 8533.0D, (double) var13 / 8533.0D);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(DDD)I")
    private final int method81(double arg0, double arg1, double arg2) {
        double var7 = arg2;
        double var9 = arg2;
        double var11 = arg2;
        if (arg1 != 0.0D) {
            double var13;
            if (arg2 < 0.5D) {
                var13 = (arg1 + 1.0D) * arg2;
            } else {
                var13 = arg1 + arg2 - arg1 * arg2;
            }
            double var15 = arg2 * 2.0D - var13;
            double var17 = arg0 + 0.3333333333333333D;
            if (var17 > 1.0D) {
                --var17;
            }
            double var21 = arg0 - 0.3333333333333333D;
            if (var21 < 0.0D) {
                ++var21;
            }
            if (var17 * 6.0D < 1.0D) {
                var7 = (var13 - var15) * 6.0D * var17 + var15;
            } else if (var17 * 2.0D < 1.0D) {
                var7 = var13;
            } else if (var17 * 3.0D < 2.0D) {
                var7 = (var13 - var15) * (0.6666666666666666D - var17) * 6.0D + var15;
            } else {
                var7 = var15;
            }
            if (arg0 * 6.0D < 1.0D) {
                var9 = (var13 - var15) * 6.0D * arg0 + var15;
            } else if (arg0 * 2.0D < 1.0D) {
                var9 = var13;
            } else if (arg0 * 3.0D < 2.0D) {
                var9 = (var13 - var15) * (0.6666666666666666D - arg0) * 6.0D + var15;
            } else {
                var9 = var15;
            }
            if (var21 * 6.0D < 1.0D) {
                var11 = (var13 - var15) * 6.0D * var21 + var15;
            } else if (var21 * 2.0D < 1.0D) {
                var11 = var13;
            } else if (var21 * 3.0D < 2.0D) {
                var11 = (var13 - var15) * (0.6666666666666666D - var21) * 6.0D + var15;
            } else {
                var11 = var15;
            }
        }
        int var23 = (int) (var7 * 256.0D);
        int var24 = (int) (var9 * 256.0D);
        int var25 = (int) (var11 * 256.0D);
        return (var23 << 16) + (var24 << 8) + var25;
    }

    @OriginalMember(owner = "mapview!mapview", name = "g", descriptor = "()V")
    public final void method11() {
        try {
            this.field172 = null;
            this.field173 = null;
            this.field174 = null;
            this.field175 = null;
            this.field176 = null;
            this.field177 = null;
            this.field178 = null;
            this.field179 = null;
            this.field180 = null;
            this.field181 = null;
            this.field182 = null;
            this.field191 = null;
            this.field192 = null;
            this.field193 = null;
            this.field195 = null;
            this.field196 = null;
            this.field197 = null;
            this.field214 = null;
            this.field221 = null;
            this.field222 = null;
            this.field223 = null;
            this.field224 = null;
            this.field229 = null;
            System.gc();
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "()V")
    public final void method12() {
        if (super.field27[1] == 1) {
            this.field227 = (int) ((double) this.field227 - 16.0D / this.field225);
            this.field170 = true;
        }
        if (super.field27[2] == 1) {
            this.field227 = (int) ((double) this.field227 + 16.0D / this.field225);
            this.field170 = true;
        }
        if (super.field27[3] == 1) {
            this.field228 = (int) ((double) this.field228 - 16.0D / this.field225);
            this.field170 = true;
        }
        if (super.field27[4] == 1) {
            this.field228 = (int) ((double) this.field228 + 16.0D / this.field225);
            this.field170 = true;
        }
        int var1 = 1;
        while (true) {
            do {
                if (var1 <= 0) {
                    if (super.field23 == 1) {
                        this.field215 = super.field24;
                        this.field216 = super.field25;
                        this.field217 = this.field227;
                        this.field218 = this.field228;
                        if (super.field24 > 170 && super.field24 < 220 && super.field25 > 471 && super.field25 < 503) {
                            this.field226 = 3.0D;
                            this.field215 = -1;
                        }
                        if (super.field24 > 230 && super.field24 < 280 && super.field25 > 471 && super.field25 < 503) {
                            this.field226 = 4.0D;
                            this.field215 = -1;
                        }
                        if (super.field24 > 290 && super.field24 < 340 && super.field25 > 471 && super.field25 < 503) {
                            this.field226 = 6.0D;
                            this.field215 = -1;
                        }
                        if (super.field24 > 350 && super.field24 < 400 && super.field25 > 471 && super.field25 < 503) {
                            this.field226 = 8.0D;
                            this.field215 = -1;
                        }
                        if (super.field24 > this.field198 && super.field25 > this.field201 + this.field199 && super.field24 < this.field200 + this.field198 && super.field25 < 503) {
                            this.field204 = !this.field204;
                            this.field215 = -1;
                        }
                        if (super.field24 > this.field211 && super.field25 > this.field212 + this.field209 && super.field24 < this.field211 + this.field210 && super.field25 < 503) {
                            this.field213 = !this.field213;
                            this.field215 = -1;
                        }
                        if (this.field204) {
                            if (super.field24 > this.field198 && super.field25 > this.field199 && super.field24 < this.field200 + this.field198 && super.field25 < this.field201 + this.field199) {
                                this.field215 = -1;
                            }
                            if (super.field24 > this.field198 && super.field25 > this.field199 && super.field24 < this.field200 + this.field198 && super.field25 < this.field199 + 18) {
                                this.field203 = 0;
                            }
                            if (super.field24 > this.field198 && super.field25 > this.field201 + this.field199 - 18 && super.field24 < this.field200 + this.field198 && super.field25 < this.field201 + this.field199) {
                                this.field203 = 25;
                            }
                        }
                        this.field170 = true;
                    }
                    if (this.field204) {
                        this.field205 = -1;
                        if (super.field17 > this.field198 && super.field17 < this.field200 + this.field198) {
                            int var2 = this.field199 + 21 + 5;
                            for (int var3 = 0; var3 < 25; ++var3) {
                                if (this.field202 + var3 >= this.field229.length || !this.field229[this.field202 + var3].equals("???")) {
                                    if (super.field18 >= var2 && super.field18 < var2 + 17) {
                                        this.field205 = this.field202 + var3;
                                        if (super.field23 == 1) {
                                            this.field207 = this.field202 + var3;
                                            this.field208 = 50;
                                        }
                                    }
                                    var2 += 17;
                                }
                            }
                        }
                        if (this.field206 != this.field205) {
                            this.field206 = this.field205;
                            this.field170 = true;
                        }
                    }
                    if ((super.field16 == 1 || super.field23 == 1) && this.field213) {
                        int var4 = super.field24;
                        int var5 = super.field25;
                        if (super.field16 == 1) {
                            var4 = super.field17;
                            var5 = super.field18;
                        }
                        if (var4 > this.field211 && var5 > this.field212 && var4 < this.field211 + this.field210 && var5 < this.field212 + this.field209) {
                            this.field227 = (var4 - this.field211) * 1280 / this.field210;
                            this.field228 = (var5 - this.field212) * 1216 / this.field209;
                            this.field215 = -1;
                            this.field170 = true;
                        }
                    }
                    if (super.field16 == 1 && this.field215 != -1) {
                        this.field227 = (int) ((double) (this.field215 - super.field17) * 2.0D / this.field226) + this.field217;
                        this.field228 = (int) ((double) (this.field216 - super.field18) * 2.0D / this.field226) + this.field218;
                        this.field170 = true;
                    }
                    if (this.field225 < this.field226) {
                        this.field170 = true;
                        this.field225 /= 30.0D;
                        if (this.field225 > this.field226) {
                            this.field225 = this.field226;
                        }
                    }
                    if (this.field225 > this.field226) {
                        this.field170 = true;
                        this.field225 /= 30.0D;
                        if (this.field225 < this.field226) {
                            this.field225 = this.field226;
                        }
                    }
                    if (this.field202 < this.field203) {
                        this.field170 = true;
                        ++this.field202;
                    }
                    if (this.field202 > this.field203) {
                        this.field170 = true;
                        --this.field202;
                    }
                    if (this.field208 > 0) {
                        this.field170 = true;
                        --this.field208;
                    }
                    int var6 = this.field227 - (int) (635.0D / this.field225);
                    int var7 = this.field228 - (int) (503.0D / this.field225);
                    int var8 = (int) (635.0D / this.field225) + this.field227;
                    int var9 = (int) (503.0D / this.field225) + this.field228;
                    if (var6 < 48) {
                        this.field227 = (int) (635.0D / this.field225) + 48;
                    }
                    if (var7 < 48) {
                        this.field228 = (int) (503.0D / this.field225) + 48;
                    }
                    if (var8 > 1232) {
                        this.field227 = 1232 - (int) (635.0D / this.field225);
                    }
                    if (var9 > 1168) {
                        this.field228 = 1168 - (int) (503.0D / this.field225);
                    }
                    return;
                }
                var1 = this.method7();
                if (var1 == 49) {
                    this.field226 = 3.0D;
                    this.field170 = true;
                }
                if (var1 == 50) {
                    this.field226 = 4.0D;
                    this.field170 = true;
                }
                if (var1 == 51) {
                    this.field226 = 6.0D;
                    this.field170 = true;
                }
                if (var1 == 52) {
                    this.field226 = 8.0D;
                    this.field170 = true;
                }
                if (var1 == 107 || var1 == 75) {
                    this.field204 = !this.field204;
                    this.field170 = true;
                }
            } while (var1 != 111 && var1 != 79);
            this.field213 = !this.field213;
            this.field170 = true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "()V")
    public final void method8() {
        if (this.field170) {
            this.field170 = false;
            this.field171 = 0;
            Draw2D.method31();
            int var1 = this.field227 - (int) (635.0D / this.field225);
            int var2 = this.field228 - (int) (503.0D / this.field225);
            int var3 = (int) (635.0D / this.field225) + this.field227;
            int var4 = (int) (503.0D / this.field225) + this.field228;
            this.method83(var1, var2, var3, var4, 0, 0, 635, 503);
            if (this.field213) {
                this.field214.method45(this.field211, this.field212);
                Draw2D.method27(this.field210 * var1 / 1280 + this.field211, this.field209 * var2 / 1216 + this.field212, (var3 - var1) * this.field210 / 1280, (var4 - var2) * this.field209 / 1216, 16711680, 128);
                Draw2D.method28(this.field210 * var1 / 1280 + this.field211, this.field209 * var2 / 1216 + this.field212, (var3 - var1) * this.field210 / 1280, (var4 - var2) * this.field209 / 1216, 16711680);
                if (this.field208 > 0 && this.field208 % 10 < 5) {
                    for (int var5 = 0; var5 < this.field194; ++var5) {
                        if (this.field197[var5] == this.field207) {
                            int var6 = this.field195[var5] * this.field210 / 1280 + this.field211;
                            int var7 = this.field196[var5] * this.field209 / 1216 + this.field212;
                            Draw2D.method32(var6, var7, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field204) {
                this.method82(this.field198, this.field199, this.field200, 18, 10066329, 7829367, 5592405, "Prev page");
                this.method82(this.field198, this.field199 + 18, this.field200, this.field201 - 36, 10066329, 7829367, 5592405, "");
                this.method82(this.field198, this.field201 + this.field199 - 18, this.field200, 18, 10066329, 7829367, 5592405, "Next page");
                int var8 = this.field199 + 3 + 18;
                for (int var9 = 0; var9 < 25; ++var9) {
                    if (this.field202 + var9 < this.field181.length && this.field202 + var9 < this.field229.length) {
                        if (this.field229[this.field202 + var9].equals("???")) {
                            continue;
                        }
                        this.field181[this.field202 + var9].method43(this.field198 + 3, var8);
                        this.field182.method49(this.field229[this.field202 + var9], this.field198 + 21, var8 + 14, 0);
                        int var10 = 16777215;
                        if (this.field202 + var9 == this.field205) {
                            var10 = 12298922;
                        }
                        if (this.field208 > 0 && this.field208 % 10 < 5 && this.field202 + var9 == this.field207) {
                            var10 = 16776960;
                        }
                        this.field182.method49(this.field229[this.field202 + var9], this.field198 + 20, var8 + 13, var10);
                    }
                    var8 += 17;
                }
            }
            this.method82(this.field211, this.field212 + this.field209, this.field210, 18, this.field164, this.field165, this.field166, "Overview");
            this.method82(this.field198, this.field201 + this.field199, this.field200, 18, this.field164, this.field165, this.field166, "Key");
            if (this.field226 == 3.0D) {
                this.method82(170, 471, 50, 30, this.field167, this.field168, this.field169, "37%");
            } else {
                this.method82(170, 471, 50, 30, this.field164, this.field165, this.field166, "37%");
            }
            if (this.field226 == 4.0D) {
                this.method82(230, 471, 50, 30, this.field167, this.field168, this.field169, "50%");
            } else {
                this.method82(230, 471, 50, 30, this.field164, this.field165, this.field166, "50%");
            }
            if (this.field226 == 6.0D) {
                this.method82(290, 471, 50, 30, this.field167, this.field168, this.field169, "75%");
            } else {
                this.method82(290, 471, 50, 30, this.field164, this.field165, this.field166, "75%");
            }
            if (this.field226 == 8.0D) {
                this.method82(350, 471, 50, 30, this.field167, this.field168, this.field169, "100%");
            } else {
                this.method82(350, 471, 50, 30, this.field164, this.field165, this.field166, "100%");
            }
        }
        --this.field171;
        if (this.field171 <= 0) {
            super.field10.method65(super.field9, 0, 0);
            this.field171 = 50;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "()V")
    public final void method1() {
        this.field171 = 0;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
    private final void method82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        Draw2D.method28(arg0, arg1, arg2, arg3, 0);
        int var9 = arg0 + 1;
        int var10 = arg1 + 1;
        int var11 = arg2 - 2;
        int var12 = arg3 - 2;
        Draw2D.method30(var9, var10, var11, var12, arg5);
        Draw2D.method24(var9, var10, var11, arg4);
        Draw2D.method25(var9, var10, var12, arg4);
        Draw2D.method24(var9, var10 + var12 - 1, var11, arg6);
        Draw2D.method25(var9 + var11 - 1, var10, var12, arg6);
        this.field182.method50(arg7, var11 / 2 + var9 + 1, var12 / 2 + var10 + 1 + 4, 0);
        this.field182.method50(arg7, var11 / 2 + var9, var12 / 2 + var10 + 4, 16777215);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIII)V")
    private final void method83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg2 - arg0;
        int var10 = arg3 - arg1;
        int var11 = (arg6 - arg4 << 16) / var9;
        int var12 = (arg7 - arg5 << 16) / var10;
        for (int var13 = 0; var13 < var9; ++var13) {
            int var52 = var11 * var13 >> 16;
            int var53 = (var13 + 1) * var11 >> 16;
            int var54 = var53 - var52;
            if (var54 > 0) {
                int var55 = arg4 + var52;
                int var56 = arg4 + var53;
                int[] var57 = this.field174[arg0 + var13];
                int[] var58 = this.field175[arg0 + var13];
                byte[] var59 = this.field176[arg0 + var13];
                for (int var60 = 0; var60 < var10; ++var60) {
                    int var61 = var12 * var60 >> 16;
                    int var62 = (var60 + 1) * var12 >> 16;
                    int var63 = var62 - var61;
                    if (var63 > 0) {
                        int var64 = arg5 + var61;
                        int var65 = arg5 + var62;
                        int var66 = var58[arg1 + var60];
                        if (var66 == 0) {
                            Draw2D.method30(var55, var64, var56 - var55, var65 - var64, var57[arg1 + var60]);
                        } else {
                            byte var67 = var59[arg1 + var60];
                            int var68 = var67 & 252;
                            if (var68 != 0 && var54 > 1 && var63 > 1) {
                                this.method84(Draw2D.field45, Draw2D.field46 * var64 + var55, var57[arg1 + var60], var66, var54, var63, var68 >> 2, var67 & 3);
                            } else {
                                Draw2D.method30(var55, var64, var54, var63, var66);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 - arg0 <= arg6 - arg4) {
            int var14 = 0;
            for (int var15 = 0; var15 < var9; ++var15) {
                int var34 = var11 * var15 >> 16;
                int var35 = (var15 + 1) * var11 >> 16;
                int var36 = var35 - var34;
                if (var36 > 0) {
                    byte[] var37 = this.field177[arg0 + var15];
                    byte[] var38 = this.field179[arg0 + var15];
                    byte[] var39 = this.field178[arg0 + var15];
                    for (int var40 = 0; var40 < var10; ++var40) {
                        int var41 = var12 * var40 >> 16;
                        int var42 = (var40 + 1) * var12 >> 16;
                        int var43 = var42 - var41;
                        if (var43 > 0) {
                            int var44 = var37[arg1 + var40] & 255;
                            if (var44 != 0) {
                                int var45;
                                if (var36 == 1) {
                                    var45 = var34;
                                } else {
                                    var45 = var35 - 1;
                                }
                                int var46;
                                if (var43 == 1) {
                                    var46 = var41;
                                } else {
                                    var46 = var42 - 1;
                                }
                                int var47 = 13421772;
                                if (var44 >= 5 && var44 <= 8 || var44 >= 13 && var44 <= 16 || var44 >= 21 && var44 <= 24 || var44 == 27 || var44 == 28) {
                                    var47 = 13369344;
                                    var44 -= 4;
                                }
                                if (var44 == 1) {
                                    Draw2D.method25(var34, var41, var43, var47);
                                } else if (var44 == 2) {
                                    Draw2D.method24(var34, var41, var36, var47);
                                } else if (var44 == 3) {
                                    Draw2D.method25(var45, var41, var43, var47);
                                } else if (var44 == 4) {
                                    Draw2D.method24(var34, var46, var36, var47);
                                } else if (var44 == 9) {
                                    Draw2D.method25(var34, var41, var43, 16777215);
                                    Draw2D.method24(var34, var41, var36, var47);
                                } else if (var44 == 10) {
                                    Draw2D.method25(var45, var41, var43, 16777215);
                                    Draw2D.method24(var34, var41, var36, var47);
                                } else if (var44 == 11) {
                                    Draw2D.method25(var45, var41, var43, 16777215);
                                    Draw2D.method24(var34, var46, var36, var47);
                                } else if (var44 == 12) {
                                    Draw2D.method25(var34, var41, var43, 16777215);
                                    Draw2D.method24(var34, var46, var36, var47);
                                } else if (var44 == 17) {
                                    Draw2D.method24(var34, var41, 1, var47);
                                } else if (var44 == 18) {
                                    Draw2D.method24(var45, var41, 1, var47);
                                } else if (var44 == 19) {
                                    Draw2D.method24(var45, var46, 1, var47);
                                } else if (var44 == 20) {
                                    Draw2D.method24(var34, var46, 1, var47);
                                } else if (var44 == 25) {
                                    for (int var48 = 0; var48 < var43; ++var48) {
                                        Draw2D.method24(var34 + var48, var46 - var48, 1, var47);
                                    }
                                } else if (var44 == 26) {
                                    for (int var49 = 0; var49 < var43; ++var49) {
                                        Draw2D.method24(var34 + var49, var41 + var49, 1, var47);
                                    }
                                }
                            }
                            int var50 = var38[arg1 + var40] & 255;
                            if (var50 != 0) {
                                this.field180[var50 - 1].method47(var34 - var36 / 2, var41 - var43 / 2, var36 * 2, var43 * 2);
                            }
                            int var51 = var39[arg1 + var40] & 255;
                            if (var51 != 0) {
                                this.field193[var14] = var51 - 1;
                                this.field191[var14] = var36 / 2 + var34;
                                this.field192[var14] = var43 / 2 + var41;
                                ++var14;
                            }
                        }
                    }
                }
            }
            for (int var16 = 0; var16 < var14; ++var16) {
                this.field181[this.field193[var16]].method43(this.field191[var16] - 7, this.field192[var16] - 7);
            }
            if (this.field208 > 0) {
                for (int var17 = 0; var17 < var14; ++var17) {
                    if (this.field193[var17] == this.field207) {
                        this.field181[this.field193[var17]].method43(this.field191[var17] - 7, this.field192[var17] - 7);
                        if (this.field208 % 10 < 5) {
                            Draw2D.method32(this.field191[var17], this.field192[var17], 15, 16776960, 128);
                            Draw2D.method32(this.field191[var17], this.field192[var17], 7, 16777215, 256);
                        }
                    }
                }
            }
            if (this.field226 == this.field225) {
                for (int var18 = 0; var18 < this.field219; ++var18) {
                    int var19 = this.field222[var18];
                    int var20 = this.field223[var18];
                    int var69 = var19 - 2304;
                    int var21 = 4032 - var20;
                    int var22 = (var69 - arg0) * (arg6 - arg4) / (arg2 - arg0) + arg4;
                    int var23 = (var21 - arg1) * (arg7 - arg5) / (arg3 - arg1) + arg5;
                    int var24 = this.field224[var18];
                    int var25 = 16777215;
                    WorldMapFont var26 = null;
                    if (var24 == 0) {
                        if (this.field225 == 3.0D) {
                            var26 = this.field183;
                        }
                        if (this.field225 == 4.0D) {
                            var26 = this.field184;
                        }
                        if (this.field225 == 6.0D) {
                            var26 = this.field185;
                        }
                        if (this.field225 == 8.0D) {
                            var26 = this.field186;
                        }
                    }
                    if (var24 == 1) {
                        if (this.field225 == 3.0D) {
                            var26 = this.field185;
                        }
                        if (this.field225 == 4.0D) {
                            var26 = this.field186;
                        }
                        if (this.field225 == 6.0D) {
                            var26 = this.field187;
                        }
                        if (this.field225 == 8.0D) {
                            var26 = this.field188;
                        }
                    }
                    if (var24 == 2) {
                        var25 = 16755200;
                        if (this.field225 == 3.0D) {
                            var26 = this.field187;
                        }
                        if (this.field225 == 4.0D) {
                            var26 = this.field188;
                        }
                        if (this.field225 == 6.0D) {
                            var26 = this.field189;
                        }
                        if (this.field225 == 8.0D) {
                            var26 = this.field190;
                        }
                    }
                    if (var26 != null) {
                        String var27 = this.field221[var18];
                        int var28 = 1;
                        for (int var29 = 0; var29 < var27.length(); ++var29) {
                            if (var27.charAt(var29) == '/') {
                                ++var28;
                            }
                        }
                        int var30 = var23 - var26.method37() * (var28 - 1) / 2;
                        int var31 = var30 + var26.method41() / 2;
                        while (true) {
                            int var32 = var27.indexOf("/");
                            if (var32 == -1) {
                                var26.method35(var27, var22, var31, var25, true);
                                break;
                            }
                            String var33 = var27.substring(0, var32);
                            var26.method35(var33, var22, var31, var25, true);
                            var31 += var26.method37();
                            var27 = var27.substring(var32 + 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([IIIIIIII)V")
    private final void method84(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = Draw2D.field46 - arg4;
        if (arg6 == 9) {
            arg6 = 1;
            arg7 = arg7 + 1 & 3;
        }
        if (arg6 == 10) {
            arg6 = 1;
            arg7 = arg7 + 3 & 3;
        }
        if (arg6 == 11) {
            arg6 = 8;
            arg7 = arg7 + 3 & 3;
        }
        if (arg6 == 1) {
            if (arg7 == 0) {
                for (int var10 = 0; var10 < arg5; ++var10) {
                    for (int var11 = 0; var11 < arg4; ++var11) {
                        if (var11 <= var10) {
                            arg0[arg1++] = arg3;
                        } else {
                            arg0[arg1++] = arg2;
                        }
                    }
                    arg1 += var9;
                }
            } else if (arg7 == 1) {
                for (int var12 = arg5 - 1; var12 >= 0; --var12) {
                    for (int var13 = 0; var13 < arg4; ++var13) {
                        if (var13 <= var12) {
                            arg0[arg1++] = arg3;
                        } else {
                            arg0[arg1++] = arg2;
                        }
                    }
                    arg1 += var9;
                }
            } else if (arg7 == 2) {
                for (int var14 = 0; var14 < arg5; ++var14) {
                    for (int var15 = 0; var15 < arg4; ++var15) {
                        if (var15 >= var14) {
                            arg0[arg1++] = arg3;
                        } else {
                            arg0[arg1++] = arg2;
                        }
                    }
                    arg1 += var9;
                }
            } else if (arg7 == 3) {
                for (int var16 = arg5 - 1; var16 >= 0; --var16) {
                    for (int var17 = 0; var17 < arg4; ++var17) {
                        if (var17 >= var16) {
                            arg0[arg1++] = arg3;
                        } else {
                            arg0[arg1++] = arg2;
                        }
                    }
                    arg1 += var9;
                }
            }
        } else if (arg6 == 2) {
            if (arg7 == 0) {
                for (int var18 = arg5 - 1; var18 >= 0; --var18) {
                    for (int var19 = 0; var19 < arg4; ++var19) {
                        if (var19 <= var18 >> 1) {
                            arg0[arg1++] = arg3;
                        } else {
                            arg0[arg1++] = arg2;
                        }
                    }
                    arg1 += var9;
                }
            } else if (arg7 == 1) {
                for (int var20 = 0; var20 < arg5; ++var20) {
                    for (int var21 = 0; var21 < arg4; ++var21) {
                        if (var21 >= var20 << 1) {
                            arg0[arg1++] = arg3;
                        } else {
                            arg0[arg1++] = arg2;
                        }
                    }
                    arg1 += var9;
                }
            } else if (arg7 == 2) {
                for (int var22 = 0; var22 < arg5; ++var22) {
                    for (int var23 = arg4 - 1; var23 >= 0; --var23) {
                        if (var23 <= var22 >> 1) {
                            arg0[arg1++] = arg3;
                        } else {
                            arg0[arg1++] = arg2;
                        }
                    }
                    arg1 += var9;
                }
            } else if (arg7 == 3) {
                for (int var24 = arg5 - 1; var24 >= 0; --var24) {
                    for (int var25 = arg4 - 1; var25 >= 0; --var25) {
                        if (var25 >= var24 << 1) {
                            arg0[arg1++] = arg3;
                        } else {
                            arg0[arg1++] = arg2;
                        }
                    }
                    arg1 += var9;
                }
            }
        } else if (arg6 == 3) {
            if (arg7 == 0) {
                for (int var26 = arg5 - 1; var26 >= 0; --var26) {
                    for (int var27 = arg4 - 1; var27 >= 0; --var27) {
                        if (var27 <= var26 >> 1) {
                            arg0[arg1++] = arg3;
                        } else {
                            arg0[arg1++] = arg2;
                        }
                    }
                    arg1 += var9;
                }
            } else if (arg7 == 1) {
                for (int var28 = arg5 - 1; var28 >= 0; --var28) {
                    for (int var29 = 0; var29 < arg4; ++var29) {
                        if (var29 >= var28 << 1) {
                            arg0[arg1++] = arg3;
                        } else {
                            arg0[arg1++] = arg2;
                        }
                    }
                    arg1 += var9;
                }
            } else if (arg7 == 2) {
                for (int var30 = 0; var30 < arg5; ++var30) {
                    for (int var31 = 0; var31 < arg4; ++var31) {
                        if (var31 <= var30 >> 1) {
                            arg0[arg1++] = arg3;
                        } else {
                            arg0[arg1++] = arg2;
                        }
                    }
                    arg1 += var9;
                }
            } else if (arg7 == 3) {
                for (int var32 = 0; var32 < arg5; ++var32) {
                    for (int var33 = arg4 - 1; var33 >= 0; --var33) {
                        if (var33 >= var32 << 1) {
                            arg0[arg1++] = arg3;
                        } else {
                            arg0[arg1++] = arg2;
                        }
                    }
                    arg1 += var9;
                }
            }
        } else if (arg6 == 4) {
            if (arg7 == 0) {
                for (int var34 = arg5 - 1; var34 >= 0; --var34) {
                    for (int var35 = 0; var35 < arg4; ++var35) {
                        if (var35 >= var34 >> 1) {
                            arg0[arg1++] = arg3;
                        } else {
                            arg0[arg1++] = arg2;
                        }
                    }
                    arg1 += var9;
                }
            } else if (arg7 == 1) {
                for (int var36 = 0; var36 < arg5; ++var36) {
                    for (int var37 = 0; var37 < arg4; ++var37) {
                        if (var37 <= var36 << 1) {
                            arg0[arg1++] = arg3;
                        } else {
                            arg0[arg1++] = arg2;
                        }
                    }
                    arg1 += var9;
                }
            } else if (arg7 == 2) {
                for (int var38 = 0; var38 < arg5; ++var38) {
                    for (int var39 = arg4 - 1; var39 >= 0; --var39) {
                        if (var39 >= var38 >> 1) {
                            arg0[arg1++] = arg3;
                        } else {
                            arg0[arg1++] = arg2;
                        }
                    }
                    arg1 += var9;
                }
            } else if (arg7 == 3) {
                for (int var40 = arg5 - 1; var40 >= 0; --var40) {
                    for (int var41 = arg4 - 1; var41 >= 0; --var41) {
                        if (var41 <= var40 << 1) {
                            arg0[arg1++] = arg3;
                        } else {
                            arg0[arg1++] = arg2;
                        }
                    }
                    arg1 += var9;
                }
            }
        } else if (arg6 == 5) {
            if (arg7 == 0) {
                for (int var42 = arg5 - 1; var42 >= 0; --var42) {
                    for (int var43 = arg4 - 1; var43 >= 0; --var43) {
                        if (var43 >= var42 >> 1) {
                            arg0[arg1++] = arg3;
                        } else {
                            arg0[arg1++] = arg2;
                        }
                    }
                    arg1 += var9;
                }
            } else if (arg7 == 1) {
                for (int var44 = arg5 - 1; var44 >= 0; --var44) {
                    for (int var45 = 0; var45 < arg4; ++var45) {
                        if (var45 <= var44 << 1) {
                            arg0[arg1++] = arg3;
                        } else {
                            arg0[arg1++] = arg2;
                        }
                    }
                    arg1 += var9;
                }
            } else if (arg7 == 2) {
                for (int var46 = 0; var46 < arg5; ++var46) {
                    for (int var47 = 0; var47 < arg4; ++var47) {
                        if (var47 >= var46 >> 1) {
                            arg0[arg1++] = arg3;
                        } else {
                            arg0[arg1++] = arg2;
                        }
                    }
                    arg1 += var9;
                }
            } else if (arg7 == 3) {
                for (int var48 = 0; var48 < arg5; ++var48) {
                    for (int var49 = arg4 - 1; var49 >= 0; --var49) {
                        if (var49 <= var48 << 1) {
                            arg0[arg1++] = arg3;
                        } else {
                            arg0[arg1++] = arg2;
                        }
                    }
                    arg1 += var9;
                }
            }
        } else {
            if (arg6 == 6) {
                if (arg7 == 0) {
                    for (int var50 = 0; var50 < arg5; ++var50) {
                        for (int var51 = 0; var51 < arg4; ++var51) {
                            if (var51 <= arg4 / 2) {
                                arg0[arg1++] = arg3;
                            } else {
                                arg0[arg1++] = arg2;
                            }
                        }
                        arg1 += var9;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var52 = 0; var52 < arg5; ++var52) {
                        for (int var53 = 0; var53 < arg4; ++var53) {
                            if (var52 <= arg5 / 2) {
                                arg0[arg1++] = arg3;
                            } else {
                                arg0[arg1++] = arg2;
                            }
                        }
                        arg1 += var9;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var54 = 0; var54 < arg5; ++var54) {
                        for (int var55 = 0; var55 < arg4; ++var55) {
                            if (var55 >= arg4 / 2) {
                                arg0[arg1++] = arg3;
                            } else {
                                arg0[arg1++] = arg2;
                            }
                        }
                        arg1 += var9;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var56 = 0; var56 < arg5; ++var56) {
                        for (int var57 = 0; var57 < arg4; ++var57) {
                            if (var56 >= arg5 / 2) {
                                arg0[arg1++] = arg3;
                            } else {
                                arg0[arg1++] = arg2;
                            }
                        }
                        arg1 += var9;
                    }
                    return;
                }
            }
            if (arg6 == 7) {
                if (arg7 == 0) {
                    for (int var58 = 0; var58 < arg5; ++var58) {
                        for (int var59 = 0; var59 < arg4; ++var59) {
                            if (var59 <= var58 - arg5 / 2) {
                                arg0[arg1++] = arg3;
                            } else {
                                arg0[arg1++] = arg2;
                            }
                        }
                        arg1 += var9;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var60 = arg5 - 1; var60 >= 0; --var60) {
                        for (int var61 = 0; var61 < arg4; ++var61) {
                            if (var61 <= var60 - arg5 / 2) {
                                arg0[arg1++] = arg3;
                            } else {
                                arg0[arg1++] = arg2;
                            }
                        }
                        arg1 += var9;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var62 = arg5 - 1; var62 >= 0; --var62) {
                        for (int var63 = arg4 - 1; var63 >= 0; --var63) {
                            if (var63 <= var62 - arg5 / 2) {
                                arg0[arg1++] = arg3;
                            } else {
                                arg0[arg1++] = arg2;
                            }
                        }
                        arg1 += var9;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var64 = 0; var64 < arg5; ++var64) {
                        for (int var65 = arg4 - 1; var65 >= 0; --var65) {
                            if (var65 <= var64 - arg5 / 2) {
                                arg0[arg1++] = arg3;
                            } else {
                                arg0[arg1++] = arg2;
                            }
                        }
                        arg1 += var9;
                    }
                    return;
                }
            }
            if (arg6 == 8) {
                if (arg7 == 0) {
                    for (int var66 = 0; var66 < arg5; ++var66) {
                        for (int var67 = 0; var67 < arg4; ++var67) {
                            if (var67 >= var66 - arg5 / 2) {
                                arg0[arg1++] = arg3;
                            } else {
                                arg0[arg1++] = arg2;
                            }
                        }
                        arg1 += var9;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var68 = arg5 - 1; var68 >= 0; --var68) {
                        for (int var69 = 0; var69 < arg4; ++var69) {
                            if (var69 >= var68 - arg5 / 2) {
                                arg0[arg1++] = arg3;
                            } else {
                                arg0[arg1++] = arg2;
                            }
                        }
                        arg1 += var9;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var70 = arg5 - 1; var70 >= 0; --var70) {
                        for (int var71 = arg4 - 1; var71 >= 0; --var71) {
                            if (var71 >= var70 - arg5 / 2) {
                                arg0[arg1++] = arg3;
                            } else {
                                arg0[arg1++] = arg2;
                            }
                        }
                        arg1 += var9;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var72 = 0; var72 < arg5; ++var72) {
                        for (int var73 = arg4 - 1; var73 >= 0; --var73) {
                            if (var73 >= var72 - arg5 / 2) {
                                arg0[arg1++] = arg3;
                            } else {
                                arg0[arg1++] = arg2;
                            }
                        }
                        arg1 += var9;
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "()Lp;")
    private final Jagfile method85() {
        Object var1 = null;
        String var2 = null;
        try {
            var2 = this.method87();
            byte[] var3 = this.method88(var2 + "/worldmap.dat");
            if (!this.method90(var3)) {
                var3 = null;
            }
            if (var3 != null) {
                return new Jagfile(var3);
            }
        } catch (Throwable var6) {
        }
        byte[] var4 = this.method86();
        if (var2 != null && var4 != null) {
            try {
                this.method89(var2 + "/worldmap.dat", var4);
            } catch (Throwable var5) {
            }
        }
        return new Jagfile(var4);
    }

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "()[B")
    private final byte[] method86() {
        System.out.println("Updating");
        this.method2(0, "Requesting map");
        try {
            String var1 = "";
            for (int var2 = 0; var2 < 10; ++var2) {
                var1 = var1 + Version.field162[var2];
            }
            DataInputStream var3;
            if (super.field12 != null) {
                var3 = new DataInputStream(new FileInputStream("worldmap.jag"));
            } else {
                var3 = new DataInputStream((new URL(this.getCodeBase(), "worldmap" + var1 + ".jag")).openStream());
            }
            int var4 = 0;
            int var5 = 0;
            int var6 = 220637;
            byte[] var7 = new byte[var6];
            while (var5 < var6) {
                int var8 = var6 - var5;
                if (var8 > 1000) {
                    var8 = 1000;
                }
                int var9 = var3.read(var7, var5, var8);
                if (var9 < 0) {
                    throw new IOException("EOF");
                }
                var5 += var9;
                int var10 = var5 * 100 / var6;
                if (var4 != var10) {
                    this.method2(var10, "Loading map - " + var10 + "%");
                }
                var4 = var10;
            }
            var3.close();
            return var7;
        } catch (IOException var12) {
            System.out.println("Error loading");
            var12.printStackTrace();
            return null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "()Ljava/lang/String;")
    private final String method87() {
        String[] var1 = new String[] { "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "" };
        String var2 = ".file_store_32";
        for (int var3 = 0; var3 < var1.length; ++var3) {
            try {
                String var4 = var1[var3];
                if (var4.length() > 0) {
                    File var5 = new File(var4);
                    if (!var5.exists()) {
                        continue;
                    }
                }
                File var6 = new File(var4 + var2);
                if (var6.exists() || var6.mkdir()) {
                    return var4 + var2 + "/";
                }
            } catch (Exception var7) {
            }
        }
        return null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;)[B")
    private final byte[] method88(String arg0) throws IOException {
        File var2 = new File(arg0);
        if (!var2.exists()) {
            return null;
        } else {
            int var3 = (int) var2.length();
            byte[] var4 = new byte[var3];
            DataInputStream var5 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
            var5.readFully(var4, 0, var3);
            var5.close();
            return var4;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;[B)V")
    private final void method89(String arg0, byte[] arg1) throws IOException {
        FileOutputStream var3 = new FileOutputStream(arg0);
        var3.write(arg1, 0, arg1.length);
        var3.close();
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([B)Z")
    private final boolean method90(byte[] arg0) throws Exception {
        if (arg0 == null) {
            return false;
        } else {
            MessageDigest var2 = MessageDigest.getInstance("SHA");
            var2.reset();
            var2.update(arg0);
            byte[] var3 = var2.digest();
            for (int var4 = 0; var4 < 20; ++var4) {
                if (Version.field162[var4] != var3[var4]) {
                    return false;
                }
            }
            return true;
        }
    }
}
