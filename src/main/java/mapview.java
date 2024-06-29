import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "I")
    private int field155 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "I")
    private int field156 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "I")
    private int field157 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "I")
    private int field158 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "I")
    private int field159 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "I")
    private int field160 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "Z")
    private boolean field161 = true;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "[Lh;")
    private Pix8[] field175 = new Pix8[100];

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "[Lg;")
    private Pix24[] field176 = new Pix24[100];

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "[I")
    private int[] field186 = new int[2000];

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "[I")
    private int[] field187 = new int[2000];

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "[I")
    private int[] field188 = new int[2000];

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "[I")
    private int[] field190 = new int[2000];

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "[I")
    private int[] field191 = new int[2000];

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "[I")
    private int[] field192 = new int[2000];

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "I")
    private int field193 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "I")
    private int field194 = 13;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "I")
    private int field195 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "I")
    private int field196 = 470;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "Z")
    private boolean field199 = false;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "I")
    private int field200 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "I")
    private int field201 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "I")
    private int field202 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "Hb", descriptor = "Z")
    private boolean field208 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Pb", descriptor = "I")
    private int field216 = 1000;

    @OriginalMember(owner = "mapview!mapview", name = "Qb", descriptor = "[Ljava/lang/String;")
    private String[] field217 = new String[this.field216];

    @OriginalMember(owner = "mapview!mapview", name = "Rb", descriptor = "[I")
    private int[] field218 = new int[this.field216];

    @OriginalMember(owner = "mapview!mapview", name = "Sb", descriptor = "[I")
    private int[] field219 = new int[this.field216];

    @OriginalMember(owner = "mapview!mapview", name = "Tb", descriptor = "[I")
    private int[] field220 = new int[this.field216];

    @OriginalMember(owner = "mapview!mapview", name = "Ub", descriptor = "D")
    private double field221 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "Vb", descriptor = "D")
    private double field222 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "Yb", descriptor = "[Ljava/lang/String;")
    private String[] field225 = new String[] { "General Store", "Sword Shop", "Magic Shop", "Axe Shop", "Helmet Shop", "Bank", "Quest Start", "Amulet Shop", "Mining Site", "Furnace", "Anvil", "Combat Training", "Dungeon", "Staff Shop", "Platebody Shop", "Platelegs Shop", "Scimitar Shop", "Archery Shop", "Shield Shop", "Altar", "Herbalist", "Jewelery", "Gem Shop", "Crafting Shop", "Candle Shop", "Fishing Shop", "Fishing Spot", "Clothes Shop", "Apothecary", "Silk Trader", "Kebab Seller", "Pub/Bar", "Mace Shop", "Tannery", "Rare Trees", "Spinning Wheel", "Food Shop", "Cookery Shop", "Mini-Game", "Water Source", "Cooking Range", "Skirt Shop", "Potters Wheel", "Windmill", "Mining Shop", "Chainmail Shop", "Silver Shop", "Fur Trader", "Spice Shop", "Agility Training", "Vegetable Store", "Slayer Master", "Hair Dressers", "Farming patch", "Makeover Mage", "Guide", "Transportation", "???", "Farming shop", "Loom", "Brewery" };

    @OriginalMember(owner = "mapview!mapview", name = "Nb", descriptor = "Z")
    private static boolean field214 = true;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "I")
    private static int field163;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "I")
    private static int field164;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "I")
    private static int field165;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "I")
    private static int field166;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "I")
    private int field189;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "I")
    private int field204;

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "mapview!mapview", name = "Gb", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "mapview!mapview", name = "Jb", descriptor = "I")
    private int field210;

    @OriginalMember(owner = "mapview!mapview", name = "Kb", descriptor = "I")
    private int field211;

    @OriginalMember(owner = "mapview!mapview", name = "Lb", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "mapview!mapview", name = "Mb", descriptor = "I")
    private int field213;

    @OriginalMember(owner = "mapview!mapview", name = "Ob", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "mapview!mapview", name = "Wb", descriptor = "I")
    private static int field223;

    @OriginalMember(owner = "mapview!mapview", name = "Xb", descriptor = "I")
    private static int field224;

    @OriginalMember(owner = "mapview!mapview", name = "Ib", descriptor = "Lg;")
    private Pix24 field209;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "Li;")
    private PixFont field177;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "Lf;")
    private WorldMapFont field178;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "Lf;")
    private WorldMapFont field179;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "Lf;")
    private WorldMapFont field180;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "Lf;")
    private WorldMapFont field181;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "Lf;")
    private WorldMapFont field182;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "Lf;")
    private WorldMapFont field183;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "Lf;")
    private WorldMapFont field184;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "Lf;")
    private WorldMapFont field185;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "Z")
    private static boolean field154;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "[I")
    private int[] field167;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "[I")
    private int[] field168;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "[[B")
    private byte[][] field171;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "[[B")
    private byte[][] field172;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "[[B")
    private byte[][] field173;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "[[B")
    private byte[][] field174;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "[[I")
    private int[][] field169;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "[[I")
    private int[][] field170;

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
        Jagfile var1 = this.method71();
        this.method2(100, "Please wait... Rendering Map");
        Packet var2 = new Packet(var1.method62("size.dat", (byte[]) null));
        field163 = var2.method47();
        field164 = var2.method47();
        field165 = var2.method47();
        field166 = var2.method47();
        field223 = 3200 - field163;
        field224 = field166 + field164 - 3200;
        this.field204 = 180;
        this.field205 = field165 * this.field204 / field166;
        this.field206 = 635 - this.field205 - 5;
        this.field207 = 503 - this.field204 - 20;
        Packet var3 = new Packet(var1.method62("labels.dat", (byte[]) null));
        this.field215 = var3.method47();
        for (int var4 = 0; var4 < this.field215; ++var4) {
            this.field217[var4] = var3.method48();
            this.field218[var4] = var3.method47();
            this.field219[var4] = var3.method47();
            this.field220[var4] = var3.method45();
        }
        Packet var5 = new Packet(var1.method62("floorcol.dat", (byte[]) null));
        int var6 = var5.method47();
        this.field167 = new int[var6 + 1];
        this.field168 = new int[var6 + 1];
        for (int var7 = 0; var7 < var6; ++var7) {
            this.field167[var7 + 1] = var5.method44();
            this.field168[var7 + 1] = var5.method44();
        }
        byte[] var8 = var1.method62("underlay.dat", (byte[]) null);
        byte[][] var9 = new byte[field165][field166];
        this.method64(var8, var9);
        byte[] var10 = var1.method62("overlay.dat", (byte[]) null);
        this.field170 = new int[field165][field166];
        this.field171 = new byte[field165][field166];
        this.method65(var10, this.field170, this.field171);
        byte[] var11 = var1.method62("loc.dat", (byte[]) null);
        this.field172 = new byte[field165][field166];
        this.field174 = new byte[field165][field166];
        this.field173 = new byte[field165][field166];
        this.method63(var11, this.field172, this.field174, this.field173);
        try {
            for (int var12 = 0; var12 < 100; ++var12) {
                this.field175[var12] = new Pix8(var1, "mapscene", var12);
            }
        } catch (Exception var15) {
        }
        try {
            for (int var13 = 0; var13 < 100; ++var13) {
                this.field176[var13] = new Pix24(var1, "mapfunction", var13);
            }
        } catch (Exception var14) {
        }
        this.field177 = new PixFont(var1, "b12_full", false);
        this.field178 = new WorldMapFont(11, true, this);
        this.field179 = new WorldMapFont(12, true, this);
        this.field180 = new WorldMapFont(14, true, this);
        this.field181 = new WorldMapFont(17, true, this);
        this.field182 = new WorldMapFont(19, true, this);
        this.field183 = new WorldMapFont(22, true, this);
        this.field184 = new WorldMapFont(26, true, this);
        this.field185 = new WorldMapFont(30, true, this);
        this.field169 = new int[field165][field166];
        this.method66(var9, this.field169);
        this.field209 = new Pix24(this.field205, this.field204);
        this.field209.method31();
        this.method69(0, 0, field165, field166, 0, 0, this.field205, this.field204);
        Draw2D.method17(0, 0, this.field205, this.field204, 0);
        Draw2D.method17(1, 1, this.field205 - 2, this.field204 - 2, this.field155);
        super.field10.method50();
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([B[[B[[B[[B)V")
    private final void method63(byte[] arg0, byte[][] arg1, byte[][] arg2, byte[][] arg3) {
        int var5 = 0;
        while (true) {
            while (var5 < arg0.length) {
                int var6 = (arg0[var5++] & 255) * 64 - field163;
                int var7 = (arg0[var5++] & 255) * 64 - field164;
                if (var6 > 0 && var7 > 0 && var6 + 64 < field165 && var7 + 64 < field166) {
                    for (int var8 = 0; var8 < 64; ++var8) {
                        byte[] var9 = arg1[var6 + var8];
                        byte[] var10 = arg2[var6 + var8];
                        byte[] var11 = arg3[var6 + var8];
                        int var12 = field166 - var7 - 1;
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
                                    this.field190[this.field189] = var6 + var8;
                                    this.field191[this.field189] = var12;
                                    this.field192[this.field189] = var14 - 160;
                                    ++this.field189;
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
    private final void method64(byte[] arg0, byte[][] arg1) {
        int var3 = 0;
        while (true) {
            while (var3 < arg0.length) {
                int var4 = (arg0[var3++] & 255) * 64 - field163;
                int var5 = (arg0[var3++] & 255) * 64 - field164;
                if (var4 > 0 && var5 > 0 && var4 + 64 < field165 && var5 + 64 < field166) {
                    for (int var6 = 0; var6 < 64; ++var6) {
                        byte[] var7 = arg1[var4 + var6];
                        int var8 = field166 - var5 - 1;
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
    private final void method65(byte[] arg0, int[][] arg1, byte[][] arg2) {
        int var4 = 0;
        while (true) {
            while (var4 < arg0.length) {
                int var5 = (arg0[var4++] & 255) * 64 - field163;
                int var6 = (arg0[var4++] & 255) * 64 - field164;
                if (var5 > 0 && var6 > 0 && var5 + 64 < field165 && var6 + 64 < field166) {
                    for (int var7 = 0; var7 < 64; ++var7) {
                        int[] var8 = arg1[var5 + var7];
                        byte[] var9 = arg2[var5 + var7];
                        int var10 = field166 - var6 - 1;
                        for (int var11 = -64; var11 < 0; ++var11) {
                            byte var12 = arg0[var4++];
                            if (var12 != 0) {
                                var9[var10] = arg0[var4++];
                                int var13 = 0;
                                if (var12 > 0) {
                                    var13 = this.field168[var12];
                                }
                                var8[var10--] = var13;
                            } else {
                                var8[var10--] = 0;
                            }
                        }
                    }
                } else {
                    for (int var14 = -4096; var14 < 0; ++var14) {
                        byte var15 = arg0[var4++];
                        if (var15 != 0) {
                            ++var4;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([[B[[I)V")
    private final void method66(byte[][] arg0, int[][] arg1) {
        int var3 = field165;
        int var4 = field166;
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; ++var6) {
            var5[var6] = 0;
        }
        for (int var7 = 5; var7 < var3 - 5; ++var7) {
            byte[] var8 = arg0[var7 + 5];
            byte[] var9 = arg0[var7 - 5];
            for (int var10 = 0; var10 < var4; ++var10) {
                var5[var10] += this.field167[var8[var10] & 255] - this.field167[var9[var10] & 255];
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
                        var14[var15] = this.method67((double) var11 / 8533.0D, (double) var12 / 8533.0D, (double) var13 / 8533.0D);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(DDD)I")
    private final int method67(double arg0, double arg1, double arg2) {
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
            this.field167 = null;
            this.field168 = null;
            this.field169 = null;
            this.field170 = null;
            this.field171 = null;
            this.field172 = null;
            this.field173 = null;
            this.field174 = null;
            this.field175 = null;
            this.field176 = null;
            this.field177 = null;
            this.field186 = null;
            this.field187 = null;
            this.field188 = null;
            this.field190 = null;
            this.field191 = null;
            this.field192 = null;
            this.field209 = null;
            this.field217 = null;
            this.field218 = null;
            this.field219 = null;
            this.field220 = null;
            this.field225 = null;
            System.gc();
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "()V")
    public final void method12() {
        if (super.field27[1] == 1) {
            field223 = (int) ((double) field223 - 16.0D / this.field221);
            this.field161 = true;
        }
        if (super.field27[2] == 1) {
            field223 = (int) (16.0D / this.field221 + (double) field223);
            this.field161 = true;
        }
        if (super.field27[3] == 1) {
            field224 = (int) ((double) field224 - 16.0D / this.field221);
            this.field161 = true;
        }
        if (super.field27[4] == 1) {
            field224 = (int) (16.0D / this.field221 + (double) field224);
            this.field161 = true;
        }
        int var1 = 1;
        while (true) {
            do {
                do {
                    if (var1 <= 0) {
                        if (super.field23 == 1) {
                            this.field210 = super.field24;
                            this.field211 = super.field25;
                            this.field212 = field223;
                            this.field213 = field224;
                            if (super.field24 > 170 && super.field24 < 220 && super.field25 > 471 && super.field25 < 503) {
                                this.field222 = 3.0D;
                                this.field210 = -1;
                            }
                            if (super.field24 > 230 && super.field24 < 280 && super.field25 > 471 && super.field25 < 503) {
                                this.field222 = 4.0D;
                                this.field210 = -1;
                            }
                            if (super.field24 > 290 && super.field24 < 340 && super.field25 > 471 && super.field25 < 503) {
                                this.field222 = 6.0D;
                                this.field210 = -1;
                            }
                            if (super.field24 > 350 && super.field24 < 400 && super.field25 > 471 && super.field25 < 503) {
                                this.field222 = 8.0D;
                                this.field210 = -1;
                            }
                            if (super.field24 > this.field193 && super.field25 > this.field196 + this.field194 && super.field24 < this.field195 + this.field193 && super.field25 < 503) {
                                this.field199 = !this.field199;
                                this.field210 = -1;
                            }
                            if (super.field24 > this.field206 && super.field25 > this.field207 + this.field204 && super.field24 < this.field206 + this.field205 && super.field25 < 503) {
                                this.field208 = !this.field208;
                                this.field210 = -1;
                            }
                            if (this.field199) {
                                if (super.field24 > this.field193 && super.field25 > this.field194 && super.field24 < this.field195 + this.field193 && super.field25 < this.field196 + this.field194) {
                                    this.field210 = -1;
                                }
                                if (super.field24 > this.field193 && super.field25 > this.field194 && super.field24 < this.field195 + this.field193 && super.field25 < this.field194 + 18 && this.field198 > 0) {
                                    this.field198 -= 25;
                                }
                                if (super.field24 > this.field193 && super.field25 > this.field196 + this.field194 - 18 && super.field24 < this.field195 + this.field193 && super.field25 < this.field196 + this.field194 && this.field198 < 50) {
                                    this.field198 += 25;
                                }
                            }
                            this.field161 = true;
                        }
                        if (this.field199) {
                            this.field200 = -1;
                            if (super.field17 > this.field193 && super.field17 < this.field195 + this.field193) {
                                int var10 = this.field194 + 21 + 5;
                                for (int var11 = 0; var11 < 25; ++var11) {
                                    if (this.field197 + var11 >= this.field225.length || !this.field225[this.field197 + var11].equals("???")) {
                                        if (super.field18 >= var10 && super.field18 < var10 + 17) {
                                            this.field200 = this.field197 + var11;
                                            if (super.field23 == 1) {
                                                this.field202 = this.field197 + var11;
                                                this.field203 = 50;
                                            }
                                        }
                                        var10 += 17;
                                    }
                                }
                            }
                            if (this.field201 != this.field200) {
                                this.field201 = this.field200;
                                this.field161 = true;
                            }
                        }
                        if ((super.field16 == 1 || super.field23 == 1) && this.field208) {
                            int var12 = super.field24;
                            int var13 = super.field25;
                            if (super.field16 == 1) {
                                var12 = super.field17;
                                var13 = super.field18;
                            }
                            if (var12 > this.field206 && var13 > this.field207 && var12 < this.field206 + this.field205 && var13 < this.field207 + this.field204) {
                                field223 = (var12 - this.field206) * field165 / this.field205;
                                field224 = (var13 - this.field207) * field166 / this.field204;
                                this.field210 = -1;
                                this.field161 = true;
                            }
                        }
                        if (super.field16 == 1 && this.field210 != -1) {
                            field223 = (int) ((double) (this.field210 - super.field17) * 2.0D / this.field222) + this.field212;
                            field224 = (int) ((double) (this.field211 - super.field18) * 2.0D / this.field222) + this.field213;
                            this.field161 = true;
                        }
                        if (this.field221 < this.field222) {
                            this.field161 = true;
                            this.field221 /= 30.0D;
                            if (this.field221 > this.field222) {
                                this.field221 = this.field222;
                            }
                        }
                        if (this.field221 > this.field222) {
                            this.field161 = true;
                            this.field221 /= 30.0D;
                            if (this.field221 < this.field222) {
                                this.field221 = this.field222;
                            }
                        }
                        if (this.field197 < this.field198) {
                            this.field161 = true;
                            ++this.field197;
                        }
                        if (this.field197 > this.field198) {
                            this.field161 = true;
                            --this.field197;
                        }
                        if (this.field203 > 0) {
                            this.field161 = true;
                            --this.field203;
                        }
                        int var14 = field223 - (int) (635.0D / this.field221);
                        int var15 = field224 - (int) (503.0D / this.field221);
                        int var16 = (int) (635.0D / this.field221) + field223;
                        int var17 = (int) (503.0D / this.field221) + field224;
                        if (var14 < 48) {
                            field223 = (int) (635.0D / this.field221) + 48;
                        }
                        if (var15 < 48) {
                            field224 = (int) (503.0D / this.field221) + 48;
                        }
                        if (var16 > field165 - 48) {
                            field223 = field165 - 48 - (int) (635.0D / this.field221);
                        }
                        if (var17 > field166 - 48) {
                            field224 = field166 - 48 - (int) (503.0D / this.field221);
                        }
                        return;
                    }
                    var1 = this.method7();
                    if (var1 == 49) {
                        this.field222 = 3.0D;
                        this.field161 = true;
                    }
                    if (var1 == 50) {
                        this.field222 = 4.0D;
                        this.field161 = true;
                    }
                    if (var1 == 51) {
                        this.field222 = 6.0D;
                        this.field161 = true;
                    }
                    if (var1 == 52) {
                        this.field222 = 8.0D;
                        this.field161 = true;
                    }
                    if (var1 == 107 || var1 == 75) {
                        this.field199 = !this.field199;
                        this.field161 = true;
                    }
                    if (var1 == 111 || var1 == 79) {
                        this.field208 = !this.field208;
                        this.field161 = true;
                    }
                } while (super.field12 == null);
            } while (var1 != 101);
            System.out.println("Starting export...");
            Pix24 var2 = new Pix24(field165 * 2, field166 * 2);
            var2.method31();
            this.method69(0, 0, field165, field166, 0, 0, field165 * 2, field166 * 2);
            super.field10.method50();
            int var3 = var2.field52.length;
            byte[] var4 = new byte[var3 * 3];
            int var5 = 0;
            for (int var6 = 0; var6 < var3; ++var6) {
                int var7 = var2.field52[var6];
                var4[var5++] = (byte) (var7 >> 16);
                var4[var5++] = (byte) (var7 >> 8);
                var4[var5++] = (byte) var7;
            }
            System.out.println("Saving to disk");
            try {
                BufferedOutputStream var8 = new BufferedOutputStream(new FileOutputStream("map-" + field165 * 2 + "-" + field166 * 2 + "-rgb.raw"));
                var8.write(var4);
                var8.close();
            } catch (Exception var18) {
                var18.printStackTrace();
            }
            System.out.println("Done export: " + field165 * 2 + "," + field166 * 2);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "()V")
    public final void method8() {
        if (this.field161) {
            this.field161 = false;
            this.field162 = 0;
            Draw2D.method20();
            int var1 = field223 - (int) (635.0D / this.field221);
            int var2 = field224 - (int) (503.0D / this.field221);
            int var3 = (int) (635.0D / this.field221) + field223;
            int var4 = (int) (503.0D / this.field221) + field224;
            this.method69(var1, var2, var3, var4, 0, 0, 635, 503);
            if (this.field208) {
                this.field209.method34(this.field206, this.field207);
                Draw2D.method16(this.field205 * var1 / field165 + this.field206, this.field204 * var2 / field166 + this.field207, (var3 - var1) * this.field205 / field165, (var4 - var2) * this.field204 / field166, 16711680, 128);
                Draw2D.method17(this.field205 * var1 / field165 + this.field206, this.field204 * var2 / field166 + this.field207, (var3 - var1) * this.field205 / field165, (var4 - var2) * this.field204 / field166, 16711680);
                if (this.field203 > 0 && this.field203 % 10 < 5) {
                    for (int var5 = 0; var5 < this.field189; ++var5) {
                        if (this.field192[var5] == this.field202) {
                            int var6 = this.field190[var5] * this.field205 / field165 + this.field206;
                            int var7 = this.field191[var5] * this.field204 / field166 + this.field207;
                            Draw2D.method21(var6, var7, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field199) {
                this.method68(this.field193, this.field194, this.field195, 18, 10066329, 7829367, 5592405, "Prev page");
                this.method68(this.field193, this.field194 + 18, this.field195, this.field196 - 36, 10066329, 7829367, 5592405, "");
                this.method68(this.field193, this.field196 + this.field194 - 18, this.field195, 18, 10066329, 7829367, 5592405, "Next page");
                int var8 = this.field194 + 3 + 18;
                for (int var9 = 0; var9 < 25; ++var9) {
                    if (this.field197 + var9 < this.field176.length && this.field197 + var9 < this.field225.length) {
                        if (this.field225[this.field197 + var9].equals("???")) {
                            continue;
                        }
                        this.field176[this.field197 + var9].method32(this.field193 + 3, var8);
                        this.field177.method39(this.field225[this.field197 + var9], this.field193 + 21, var8 + 14, 0);
                        int var10 = 16777215;
                        if (this.field197 + var9 == this.field200) {
                            var10 = 12298922;
                        }
                        if (this.field203 > 0 && this.field203 % 10 < 5 && this.field197 + var9 == this.field202) {
                            var10 = 16776960;
                        }
                        this.field177.method39(this.field225[this.field197 + var9], this.field193 + 20, var8 + 13, var10);
                    }
                    var8 += 17;
                }
            }
            this.method68(this.field206, this.field207 + this.field204, this.field205, 18, this.field155, this.field156, this.field157, "Overview");
            this.method68(this.field193, this.field196 + this.field194, this.field195, 18, this.field155, this.field156, this.field157, "Key");
            if (this.field222 == 3.0D) {
                this.method68(170, 471, 50, 30, this.field158, this.field159, this.field160, "37%");
            } else {
                this.method68(170, 471, 50, 30, this.field155, this.field156, this.field157, "37%");
            }
            if (this.field222 == 4.0D) {
                this.method68(230, 471, 50, 30, this.field158, this.field159, this.field160, "50%");
            } else {
                this.method68(230, 471, 50, 30, this.field155, this.field156, this.field157, "50%");
            }
            if (this.field222 == 6.0D) {
                this.method68(290, 471, 50, 30, this.field158, this.field159, this.field160, "75%");
            } else {
                this.method68(290, 471, 50, 30, this.field155, this.field156, this.field157, "75%");
            }
            if (this.field222 == 8.0D) {
                this.method68(350, 471, 50, 30, this.field158, this.field159, this.field160, "100%");
            } else {
                this.method68(350, 471, 50, 30, this.field155, this.field156, this.field157, "100%");
            }
        }
        --this.field162;
        if (this.field162 <= 0) {
            super.field10.method51(super.field9, 0, 0);
            this.field162 = 50;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "()V")
    public final void method1() {
        this.field162 = 0;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
    private final void method68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        Draw2D.method17(arg0, arg1, arg2, arg3, 0);
        int var9 = arg0 + 1;
        int var10 = arg1 + 1;
        int var11 = arg2 - 2;
        int var12 = arg3 - 2;
        Draw2D.method19(var9, var10, var11, var12, arg5);
        Draw2D.method13(var9, var10, var11, arg4);
        Draw2D.method14(var9, var10, var12, arg4);
        Draw2D.method13(var9, var10 + var12 - 1, var11, arg6);
        Draw2D.method14(var9 + var11 - 1, var10, var12, arg6);
        this.field177.method41(arg7, var11 / 2 + var9 + 1, var12 / 2 + var10 + 1 + 4, 0);
        this.field177.method41(arg7, var11 / 2 + var9, var12 / 2 + var10 + 4, 16777215);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIII)V")
    private final void method69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg2 - arg0;
        int var10 = arg3 - arg1;
        int var11 = (arg6 - arg4 << 16) / var9;
        int var12 = (arg7 - arg5 << 16) / var10;
        for (int var13 = 0; var13 < var9; ++var13) {
            int var63 = var11 * var13 >> 16;
            int var64 = (var13 + 1) * var11 >> 16;
            int var65 = var64 - var63;
            if (var65 > 0) {
                int var66 = arg4 + var63;
                int var67 = arg4 + var64;
                int[] var68 = this.field169[arg0 + var13];
                int[] var69 = this.field170[arg0 + var13];
                byte[] var70 = this.field171[arg0 + var13];
                for (int var71 = 0; var71 < var10; ++var71) {
                    int var72 = var12 * var71 >> 16;
                    int var73 = (var71 + 1) * var12 >> 16;
                    int var74 = var73 - var72;
                    if (var74 > 0) {
                        int var75 = arg5 + var72;
                        int var76 = arg5 + var73;
                        int var77 = var69[arg1 + var71];
                        if (var77 == 0) {
                            Draw2D.method19(var66, var75, var67 - var66, var76 - var75, var68[arg1 + var71]);
                        } else {
                            byte var78 = var70[arg1 + var71];
                            int var79 = var78 & 252;
                            if (var79 != 0 && var65 > 1 && var74 > 1) {
                                this.method70(Draw2D.field37, Draw2D.field38 * var75 + var66, var68[arg1 + var71], var77, var65, var74, var79 >> 2, var78 & 3);
                            } else {
                                Draw2D.method19(var66, var75, var65, var74, var77);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 - arg0 <= arg6 - arg4) {
            int var14 = 0;
            for (int var15 = 0; var15 < var9; ++var15) {
                int var45 = var11 * var15 >> 16;
                int var46 = (var15 + 1) * var11 >> 16;
                int var47 = var46 - var45;
                if (var47 > 0) {
                    byte[] var48 = this.field172[arg0 + var15];
                    byte[] var49 = this.field174[arg0 + var15];
                    byte[] var50 = this.field173[arg0 + var15];
                    for (int var51 = 0; var51 < var10; ++var51) {
                        int var52 = var12 * var51 >> 16;
                        int var53 = (var51 + 1) * var12 >> 16;
                        int var54 = var53 - var52;
                        if (var54 > 0) {
                            int var55 = var48[arg1 + var51] & 255;
                            if (var55 != 0) {
                                int var56;
                                if (var47 == 1) {
                                    var56 = var45;
                                } else {
                                    var56 = var46 - 1;
                                }
                                int var57;
                                if (var54 == 1) {
                                    var57 = var52;
                                } else {
                                    var57 = var53 - 1;
                                }
                                int var58 = 13421772;
                                if (var55 >= 5 && var55 <= 8 || var55 >= 13 && var55 <= 16 || var55 >= 21 && var55 <= 24 || var55 == 27 || var55 == 28) {
                                    var58 = 13369344;
                                    var55 -= 4;
                                }
                                if (var55 == 1) {
                                    Draw2D.method14(var45, var52, var54, var58);
                                } else if (var55 == 2) {
                                    Draw2D.method13(var45, var52, var47, var58);
                                } else if (var55 == 3) {
                                    Draw2D.method14(var56, var52, var54, var58);
                                } else if (var55 == 4) {
                                    Draw2D.method13(var45, var57, var47, var58);
                                } else if (var55 == 9) {
                                    Draw2D.method14(var45, var52, var54, 16777215);
                                    Draw2D.method13(var45, var52, var47, var58);
                                } else if (var55 == 10) {
                                    Draw2D.method14(var56, var52, var54, 16777215);
                                    Draw2D.method13(var45, var52, var47, var58);
                                } else if (var55 == 11) {
                                    Draw2D.method14(var56, var52, var54, 16777215);
                                    Draw2D.method13(var45, var57, var47, var58);
                                } else if (var55 == 12) {
                                    Draw2D.method14(var45, var52, var54, 16777215);
                                    Draw2D.method13(var45, var57, var47, var58);
                                } else if (var55 == 17) {
                                    Draw2D.method13(var45, var52, 1, var58);
                                } else if (var55 == 18) {
                                    Draw2D.method13(var56, var52, 1, var58);
                                } else if (var55 == 19) {
                                    Draw2D.method13(var56, var57, 1, var58);
                                } else if (var55 == 20) {
                                    Draw2D.method13(var45, var57, 1, var58);
                                } else if (var55 == 25) {
                                    for (int var59 = 0; var59 < var54; ++var59) {
                                        Draw2D.method13(var45 + var59, var57 - var59, 1, var58);
                                    }
                                } else if (var55 == 26) {
                                    for (int var60 = 0; var60 < var54; ++var60) {
                                        Draw2D.method13(var45 + var60, var52 + var60, 1, var58);
                                    }
                                }
                            }
                            int var61 = var49[arg1 + var51] & 255;
                            if (var61 != 0) {
                                this.field175[var61 - 1].method36(var45 - var47 / 2, var52 - var54 / 2, var47 * 2, var54 * 2);
                            }
                            int var62 = var50[arg1 + var51] & 255;
                            if (var62 != 0) {
                                this.field188[var14] = var62 - 1;
                                this.field186[var14] = var47 / 2 + var45;
                                this.field187[var14] = var54 / 2 + var52;
                                ++var14;
                            }
                        }
                    }
                }
            }
            for (int var16 = 0; var16 < var14; ++var16) {
                if (this.field176[this.field188[var16]] != null) {
                    this.field176[this.field188[var16]].method32(this.field186[var16] - 7, this.field187[var16] - 7);
                }
            }
            if (this.field203 > 0) {
                for (int var17 = 0; var17 < var14; ++var17) {
                    if (this.field188[var17] == this.field202) {
                        this.field176[this.field188[var17]].method32(this.field186[var17] - 7, this.field187[var17] - 7);
                        if (this.field203 % 10 < 5) {
                            Draw2D.method21(this.field186[var17], this.field187[var17], 15, 16776960, 128);
                            Draw2D.method21(this.field186[var17], this.field187[var17], 7, 16777215, 256);
                        }
                    }
                }
            }
            if (this.field222 == this.field221 && field214) {
                for (int var18 = 0; var18 < this.field215; ++var18) {
                    int var19 = this.field218[var18];
                    int var20 = this.field219[var18];
                    int var21 = var19 - field163;
                    int var22 = field166 + field164 - var20;
                    int var23 = (var21 - arg0) * (arg6 - arg4) / (arg2 - arg0) + arg4;
                    int var24 = (var22 - arg1) * (arg7 - arg5) / (arg3 - arg1) + arg5;
                    int var25 = this.field220[var18];
                    int var26 = 16777215;
                    WorldMapFont var27 = null;
                    if (var25 == 0) {
                        if (this.field221 == 3.0D) {
                            var27 = this.field178;
                        }
                        if (this.field221 == 4.0D) {
                            var27 = this.field179;
                        }
                        if (this.field221 == 6.0D) {
                            var27 = this.field180;
                        }
                        if (this.field221 == 8.0D) {
                            var27 = this.field181;
                        }
                    }
                    if (var25 == 1) {
                        if (this.field221 == 3.0D) {
                            var27 = this.field180;
                        }
                        if (this.field221 == 4.0D) {
                            var27 = this.field181;
                        }
                        if (this.field221 == 6.0D) {
                            var27 = this.field182;
                        }
                        if (this.field221 == 8.0D) {
                            var27 = this.field183;
                        }
                    }
                    if (var25 == 2) {
                        var26 = 16755200;
                        if (this.field221 == 3.0D) {
                            var27 = this.field182;
                        }
                        if (this.field221 == 4.0D) {
                            var27 = this.field183;
                        }
                        if (this.field221 == 6.0D) {
                            var27 = this.field184;
                        }
                        if (this.field221 == 8.0D) {
                            var27 = this.field185;
                        }
                    }
                    if (var27 != null) {
                        String var28 = this.field217[var18];
                        int var29 = 1;
                        for (int var30 = 0; var30 < var28.length(); ++var30) {
                            if (var28.charAt(var30) == '/') {
                                ++var29;
                            }
                        }
                        int var31 = var24 - var27.method26() * (var29 - 1) / 2;
                        int var32 = var31 + var27.method30() / 2;
                        while (true) {
                            int var33 = var28.indexOf("/");
                            if (var33 == -1) {
                                var27.method24(var28, var23, var32, var26, true);
                                break;
                            }
                            String var34 = var28.substring(0, var33);
                            var27.method24(var34, var23, var32, var26, true);
                            var32 += var27.method26();
                            var28 = var28.substring(var33 + 1);
                        }
                    }
                }
            }
            if (field154) {
                for (int var35 = field163 / 64; var35 < (field165 + field163) / 64; ++var35) {
                    for (int var36 = field164 / 64; var36 < (field166 + field164) / 64; ++var36) {
                        int var37 = var35 * 64;
                        int var38 = var36 * 64;
                        int var39 = var37 - field163;
                        int var40 = field166 + field164 - var38;
                        int var41 = (var39 - arg0) * (arg6 - arg4) / (arg2 - arg0) + arg4;
                        int var42 = (var40 - 64 - arg1) * (arg7 - arg5) / (arg3 - arg1) + arg5;
                        int var43 = (var39 + 64 - arg0) * (arg6 - arg4) / (arg2 - arg0) + arg4;
                        int var44 = (var40 - arg1) * (arg7 - arg5) / (arg3 - arg1) + arg5;
                        Draw2D.method17(var41, var42, var43 - var41, var44 - var42, 16777215);
                        this.field177.method40(var35 + "_" + var36, var43 - 5, var44 - 5, 16777215);
                        if (var35 == 33 && var36 >= 71 && var36 <= 73) {
                            this.field177.method41("u_pass", (var41 + var43) / 2, (var42 + var44) / 2, 16711680);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([IIIIIIII)V")
    private final void method70(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = Draw2D.field38 - arg4;
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

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "()Lo;")
    private final Jagfile method71() {
        Object var1 = null;
        String var2 = null;
        try {
            var2 = this.method73();
            byte[] var3 = this.method74(var2 + "/worldmap.dat");
            if (!this.method76(var3)) {
                var3 = null;
            }
            if (var3 != null) {
                return new Jagfile(var3);
            }
        } catch (Throwable var6) {
        }
        byte[] var4 = this.method72();
        if (var2 != null && var4 != null) {
            try {
                this.method75(var2 + "/worldmap.dat", var4);
            } catch (Throwable var5) {
            }
        }
        return new Jagfile(var4);
    }

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "()[B")
    private final byte[] method72() {
        System.out.println("Updating");
        this.method2(0, "Requesting map");
        try {
            String var1 = "";
            for (int var2 = 0; var2 < 10; ++var2) {
                var1 = var1 + Version.field152[var2];
            }
            DataInputStream var3;
            if (super.field12 != null) {
                var3 = new DataInputStream(new FileInputStream("worldmap.jag"));
            } else {
                var3 = new DataInputStream((new URL(this.getCodeBase(), "worldmap" + var1 + ".jag")).openStream());
            }
            int var4 = 0;
            int var5 = 0;
            int var6 = 342273;
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
    private final String method73() {
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
    private final byte[] method74(String arg0) throws IOException {
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
    private final void method75(String arg0, byte[] arg1) throws IOException {
        FileOutputStream var3 = new FileOutputStream(arg0);
        var3.write(arg1, 0, arg1.length);
        var3.close();
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([B)Z")
    private final boolean method76(byte[] arg0) throws Exception {
        if (arg0 == null) {
            return false;
        } else {
            MessageDigest var2 = MessageDigest.getInstance("SHA");
            var2.reset();
            var2.update(arg0);
            byte[] var3 = var2.digest();
            for (int var4 = 0; var4 < 20; ++var4) {
                if (Version.field152[var4] != var3[var4]) {
                    return false;
                }
            }
            return true;
        }
    }
}
