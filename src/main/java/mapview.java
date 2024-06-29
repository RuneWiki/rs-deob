import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
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

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "I")
    private int field235 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "I")
    private int field249 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "I")
    private int field245 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "I")
    private int field262 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "I")
    private int field264 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "D")
    private double field227 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "I")
    private int field232 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "I")
    private int field241 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "I")
    private int field220 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "Z")
    private boolean field212 = false;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "I")
    private int field214 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "I")
    private int field225 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "I")
    private int field247 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "I")
    private int field277 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "I")
    private int field259 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "I")
    private int field265 = -20;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "I")
    private int field244 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "I")
    private int field211 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "I")
    private int field258 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "I")
    private int field224 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "Jb", descriptor = "[I")
    private int[] field288 = new int[this.field224];

    @OriginalMember(owner = "mapview!mapview", name = "Lb", descriptor = "I")
    private int field290 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "I")
    private int field243 = 30;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "Z")
    private boolean field233 = false;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "I")
    private int field239 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "[I")
    private int[] field263 = new int[this.field224];

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "I")
    private int field284 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "Pb", descriptor = "I")
    private int field294 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "I")
    private int field229 = 170;

    @OriginalMember(owner = "mapview!mapview", name = "Rb", descriptor = "I")
    private int field296 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "Z")
    private boolean field280 = false;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "[Lv;")
    private JagString[] field266 = new JagString[this.field224];

    @OriginalMember(owner = "mapview!mapview", name = "Ib", descriptor = "I")
    private int field287 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "Z")
    private boolean field282 = false;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "I")
    private int field270 = this.field280 ? 115 : 102;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "I")
    private int field221 = this.field280 ? 83 : 70;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "Z")
    private boolean field268 = true;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "Lv;")
    private JagString field223 = this.field280 ? class18.field160 : class18.field160;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "I")
    private int field242 = this.field280 ? 252 : 111;

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "I")
    private int field215 = 50;

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "I")
    private int field228 = 471;

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "I")
    private int field213 = this.field280 ? 220 : 79;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "I")
    private int field276 = 10;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "Lv;")
    private JagString field222 = this.field280 ? Packet.field346 : Packet.field346;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "Lv;")
    private JagString field237 = this.field280 ? BZip2State.field483 : BZip2State.field483;

    @OriginalMember(owner = "mapview!mapview", name = "Ub", descriptor = "I")
    private int field299 = 23;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "Lv;")
    private JagString field281 = this.field280 ? IntHashTable.field50 : IntHashTable.field50;

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "Lv;")
    private JagString field283 = this.field280 ? GameCanvas.field43 : PixMap.field306;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "Lv;")
    private JagString field267 = this.field280 ? HashTable.field64 : HashTable.field64;

    @OriginalMember(owner = "mapview!mapview", name = "Ob", descriptor = "I")
    private int field293 = this.field276 + this.field215;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "Lv;")
    private JagString field251 = this.field280 ? WorldmapOverlay.field376 : WorldmapOverlay.field376;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "I")
    private int field274 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "[I")
    private int[] field246 = new int[this.field224];

    @OriginalMember(owner = "mapview!mapview", name = "Hb", descriptor = "Lv;")
    private JagString field286 = this.field280 ? HashTable.field61 : HashTable.field61;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "Lv;")
    private JagString field257 = this.field280 ? GameCanvas.field32 : WorldmapOverlay.field380;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "I")
    private int field248 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "I")
    private int field230 = this.field280 ? 76 : 75;

    @OriginalMember(owner = "mapview!mapview", name = "Wb", descriptor = "I")
    private int field301 = this.field280 ? 108 : 107;

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "Lv;")
    private JagString field210 = this.field280 ? DoublyLinkable.field45 : GZip.field115;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "Lv;")
    private JagString field273 = this.field280 ? WorldmapOverlay.field373 : WorldmapOverlay.field373;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "Lv;")
    private JagString field272 = this.field280 ? StringNode.field91 : StringNode.field91;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "D")
    private double field278 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "Lv;")
    public static JagString field231;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "Lv;")
    private static JagString field260;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "mapview!mapview", name = "Mb", descriptor = "Lv;")
    public static JagString field291;

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "Lv;")
    public static JagString field209;

    @OriginalMember(owner = "mapview!mapview", name = "Xb", descriptor = "Lv;")
    private static JagString field302;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "I")
    private int field216;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "I")
    private int field253;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "I")
    private int field255;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "I")
    private int field261;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "I")
    private static int field275;

    @OriginalMember(owner = "mapview!mapview", name = "Qb", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "mapview!mapview", name = "Sb", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "mapview!mapview", name = "Vb", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "mapview!mapview", name = "Nb", descriptor = "J")
    public static long field292;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "Lv;")
    private JagString field250;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "Lb;")
    private Pix24 field279;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "Ls;")
    private PixFont field219;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "Loa;")
    private WorldmapFont field217;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "Loa;")
    private WorldmapFont field234;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "Loa;")
    private WorldmapFont field252;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "Loa;")
    private WorldmapFont field254;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "Loa;")
    private WorldmapFont field271;

    @OriginalMember(owner = "mapview!mapview", name = "Gb", descriptor = "Loa;")
    private WorldmapFont field285;

    @OriginalMember(owner = "mapview!mapview", name = "Kb", descriptor = "Loa;")
    private WorldmapFont field289;

    @OriginalMember(owner = "mapview!mapview", name = "Tb", descriptor = "Loa;")
    private WorldmapFont field298;

    @OriginalMember(owner = "mapview!mapview", name = "Yb", descriptor = "Z")
    public static boolean field303;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "[Lv;")
    private JagString[] field218;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "[Lv;")
    private JagString[] field256;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "[Lj;")
    private static Js5[] field236;

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IB)I", line = 19)
    private final int method93(int arg0, byte arg1) {
        if (arg1 != 65) {
            this.field250 = null;
        }
        if (arg0 == 196) {
            return 228;
        } else if (arg0 == 203) {
            return 235;
        } else if (arg0 == 207) {
            return 239;
        } else if (arg0 == 214) {
            return 246;
        } else if (arg0 == 220) {
            return 252;
        } else {
            return Timer.method191(arg0, (byte) 35);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 83)
    public final void init() {
        if (this.method84(21902)) {
            this.method88(1, 635, 32, 503, Integer.parseInt(this.getParameter("codeversion")));
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(B)V", line = 97)
    public final void method83(byte arg0) {
        DoublyLinkable.method24(-100);
        boolean var2 = false;
        JavaPixMap.method69((byte) 45, class18.field167);
        BZip2State.method253(class18.field167, 32);
        JavaKeyboard.field17 = this.field273;
        if (arg0 != 111) {
            this.method99((byte) 17, -42, -71, 35, 71, -63, 4, 109, 112);
        }
        boolean var3 = true;
        this.field218 = class18.method63(arg0 - 106);
        this.field256 = class4.method16(13628);
        if (var3) {
            byte var4 = 0;
            if (this.field256.length == 13) {
                byte var10002 = var4;
                int var5 = var4 + 1;
                this.field257 = this.field256[var10002];
                int var18 = var5;
                int var6 = var5 + 1;
                this.field210 = this.field256[var18];
                int var19 = var6;
                int var7 = var6 + 1;
                this.field283 = this.field256[var19];
                int var20 = var7;
                int var8 = var7 + 1;
                this.field223 = this.field256[var20];
                int var21 = var8;
                int var9 = var8 + 1;
                this.field222 = this.field256[var21];
                int var22 = var9;
                int var10 = var9 + 1;
                this.field273 = this.field256[var22];
                int var23 = var10;
                int var11 = var10 + 1;
                this.field267 = this.field256[var23];
                int var24 = var11;
                int var12 = var11 + 1;
                this.field237 = this.field256[var24];
                int var25 = var12;
                int var13 = var12 + 1;
                this.field286 = this.field256[var25];
                int var26 = var13;
                int var14 = var13 + 1;
                this.field272 = this.field256[var26];
                int var27 = var14;
                int var15 = var14 + 1;
                this.field251 = this.field256[var27];
                int var16 = var15 + 1;
                int var28 = var16;
                int var17 = var16 + 1;
                this.field281 = this.field256[var28];
                this.field213 = this.field257.method250((byte) 98, 0);
                this.field221 = this.field210.method250((byte) 98, 0);
                this.field230 = this.field283.method250((byte) 98, 0);
                this.field242 = this.method93(this.field213, (byte) 65);
                this.field270 = this.method93(this.field221, (byte) 65);
                this.field301 = this.method93(this.field230, (byte) 65);
            } else {
                Worldmap.method171((byte) -95, new JagString[] { field302 });
            }
        }
        this.field250 = ByteArrayPool.method67(50, arg0 ^ 0xFFFFF348);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IZ)V", line = 155)
    private final void method94(int arg0, boolean arg1) {
        if (!arg1) {
            this.field279 = null;
        }
        if (field236.length <= arg0) {
            return;
        }
        Js5 var3 = field236[arg0];
        Packet var4 = new Packet(var3.method130(Js5.field129, MonotonicTime.field197, (byte) -128));
        var4.gjstr((byte) -43);
        Packet var5 = new Packet(var3.method130(DoublyLinkable.field48, MonotonicTime.field197, (byte) -128));
        this.field211 = var5.g2((byte) 0);
        for (int var6 = 0; var6 < this.field211; var6++) {
            this.field266[var6] = var5.gjstr((byte) -43);
            this.field246[var6] = var5.g2((byte) 0);
            this.field288[var6] = var5.g2((byte) 0);
            this.field263[var6] = var5.g1(!arg1);
            JagString var7 = this.field266[var6].method240(47, 32, 74);
            int var8 = this.field219.stringWidth(var7);
            if (this.field300 < var8) {
                this.field300 = var8;
            }
            int var9 = this.field219.stringWidth(this.field237);
            if (this.field300 < var9) {
                this.field300 = var9;
            }
        }
        GameCanvas.field41 = new Worldmap();
        GameCanvas.field41.method164((byte) -106, field236[arg0]);
        this.field297 = 180;
        this.field253 = 503 - this.field297 - 20;
        field275 = JavaPixMap.field196;
        this.field261 = JavaKeyboard.field14 * this.field297 / GameCanvas.field42;
        StringNode.field80 = PixMap.field312;
        this.field255 = 630 - this.field261;
        this.field279 = new Pix24(this.field261, this.field297);
        this.field279.method11();
        this.method99((byte) 32, 0, 0, 0, 0, this.field297, JavaKeyboard.field14, this.field261, GameCanvas.field42);
        Draw2D.drawRect(0, 0, this.field261, this.field297, 0);
        Draw2D.drawRect(1, 1, this.field261 - 2, this.field297 - 2, this.field249);
        JagString.field466.bind(-114);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IILo;I)[Lb;", line = 243)
    public static final Pix24[] method95(int arg0, int arg1, Js5Index arg2, int arg3) {
        if (arg0 < 60) {
            field292 = 116L;
        }
        return HashTable.method31(arg3, arg2, -1, arg1) ? JavaKeyboard.method5((byte) -122) : null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(B)Z", line = 281)
    private final boolean method96(byte arg0) {
        if (GZip.field119 == 0) {
            this.method100(true);
            GZip.field119 = 1;
        }
        if (GZip.field119 == 1) {
            ByteArrayPool.field181 = 25;
            boolean var2 = this.method108(this.field272, true, "main_file_cache.idx0");
            if (!var2) {
                return false;
            }
            WorldmapOverlay.field370 = StringNode.field86;
            StringNode.field86 = null;
            if (WorldmapOverlay.field370 == null) {
                throw new RuntimeException("T1");
            }
            GZip.field119 = 2;
        }
        if (GZip.field119 == 2) {
            field236 = new Js5[1];
            GZip.field119 = 10;
        }
        if (GZip.field119 == 10) {
            ByteArrayPool.field181 = 50;
            boolean var3 = this.method108(this.field251, true, "main_file_cache.dat0");
            if (!var3) {
                return false;
            }
            field236[0] = StringNode.field86;
            StringNode.field86 = null;
            if (field236[0] == null) {
                throw new RuntimeException("T2");
            }
            GZip.field119 = 20;
        }
        if (arg0 != -47) {
            this.field285 = null;
        }
        if (GZip.field119 != 20) {
            return false;
        }
        StringNode.field89 = Timer.method196(IntHashTable.field57, WorldmapOverlay.field370, (byte) 82, JavaMouse.field384);
        class1.field8 = DoublyLinkable.method22(JavaMouse.field384, WorldmapOverlay.field370, JagString.field467, (byte) -53);
        this.field219 = DoublyLinkable.method23(JavaMouse.field384, WorldmapOverlay.field370, field260, 28);
        this.field271 = new WorldmapFont(11, true, this);
        this.field298 = new WorldmapFont(12, true, this);
        this.field252 = new WorldmapFont(14, true, this);
        this.field254 = new WorldmapFont(17, true, this);
        this.field234 = new WorldmapFont(19, true, this);
        this.field285 = new WorldmapFont(22, true, this);
        this.field217 = new WorldmapFont(26, true, this);
        this.field289 = new WorldmapFont(30, true, this);
        JavaKeyboard.field17 = this.field267;
        ByteArrayPool.field181 = 100;
        MonotonicTime.method76(ByteArrayPool.field181, null, -67, JavaKeyboard.field17);
        this.field220 = this.field219.stringWidth(this.field210) + 20;
        this.method98(arg0 ^ 0x6A67);
        JagString[] var4 = this.field218;
        for (int var5 = 0; var5 < var4.length; var5++) {
            JagString var6 = var4[var5];
            int var7 = this.field219.stringWidth(var6);
            if (this.field226 < var7) {
                this.field226 = var7;
            }
        }
        this.field259 = this.field226 + 34;
        if (this.field259 > 140) {
            int var8 = this.field255 - this.field239 - this.field259;
            this.field276 = var8 / 25;
            this.field215 = this.field276 * 5;
            this.field293 = this.field215 + this.field276;
            int var9 = var8 - this.field276 * 25;
            this.field229 = var9 / 2 + this.field239 + this.field276 + this.field259;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;[BZ)Z", line = 401)
    private final boolean method97(String arg0, byte[] arg1, boolean arg2) {
        if (arg1 == null) {
            return false;
        }
        try {
            if (arg2) {
                return true;
            }
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg1);
            byte[] var5 = var4.digest();
            if (arg0 == "main_file_cache.dat0") {
                if (var5[0] != -44 || var5[1] != -69 || var5[2] != -101 || var5[3] != 52 || var5[4] != -21 || var5[5] != 113 || var5[6] != 6 || var5[7] != -45 || var5[8] != 1 || var5[9] != 13 || var5[10] != 96 || var5[11] != 91 || var5[12] != -3 || var5[13] != 34 || var5[14] != -15 || var5[15] != 55 || var5[16] != -98 || var5[17] != -121 || var5[18] != 57 || var5[19] != -52) {
                    return false;
                }
            } else if (var5[0] != 89 || var5[1] != -90 || var5[2] != 24 || var5[3] != 104 || var5[4] != 2 || var5[5] != 20 || var5[6] != -25 || var5[7] != 42 || var5[8] != 2 || var5[9] != -76 || var5[10] != -82 || var5[11] != 5 || var5[12] != 0 || var5[13] != 41 || var5[14] != 117 || var5[15] != -108 || var5[16] != -105 || var5[17] != -37 || var5[18] != 56 || var5[19] != -5) {
                return false;
            }
            return true;
        } catch (Exception var7) {
            this.method82((byte) -122, "sha");
            return false;
        }
    }

    static {
        ByteArrayPool.maxCount = 0;
        field231 = class1.method2(255, "Silk Trader");
        field260 = class1.method2(255, "b12_full");
        field269 = 0;
        field291 = class1.method2(255, "floorcol)3dat");
        field209 = class1.method2(255, "Loading");
        field302 = class1.method2(255, "uitext has incorrect number of strings");
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(I)V", line = 460)
    private final void method98(int arg0) {
        if (field236.length == 1) {
            JavaMouse.field387 = 0;
        } else {
            if (GZip.field118 < 0) {
                JavaMouse.field387 = this.method104(JavaMouse.field387, arg0 + 27092);
            } else {
                JavaMouse.field387 = GZip.field118;
            }
            GZip.field118 = this.method104(JavaMouse.field387, -115);
        }
        this.method94(JavaMouse.field387, true);
        if (arg0 != -27210) {
            this.field233 = true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Z)V", line = 486)
    public final void method91(boolean arg0) {
        if (!JavaPixMap.field192) {
            JavaPixMap.field192 = this.method96((byte) -47);
            MonotonicTime.method76(ByteArrayPool.field181, null, -63, JavaKeyboard.field17);
            return;
        }
        if (this.field268) {
            this.field268 = false;
            class18.field162 = true;
            Draw2D.clear();
            int var2 = (int) (503.0D / this.field227) + field275;
            int var3 = StringNode.field80 + (int) (635.0D / this.field227);
            int var4 = StringNode.field80 - (int) (635.0D / this.field227);
            int var5 = field275 - (int) (503.0D / this.field227);
            this.method99((byte) -1, 0, 0, var4, var5, 503, var3, 635, var2);
            if (this.field233) {
                this.field279.method12(this.field255, this.field253);
                Draw2D.fillRectAlpha(this.field261 * var4 / JavaKeyboard.field14 + this.field255, this.field297 * var5 / GameCanvas.field42 + this.field253, (var3 - var4) * this.field261 / JavaKeyboard.field14, (var2 - var5) * this.field297 / GameCanvas.field42, 16711680, 128);
                Draw2D.drawRect(this.field261 * var4 / JavaKeyboard.field14 + this.field255, this.field297 * var5 / GameCanvas.field42 + this.field253, (var3 - var4) * this.field261 / JavaKeyboard.field14, (var2 - var5) * this.field297 / GameCanvas.field42, 16711680);
                if (this.field264 > 0 && this.field264 % 10 < 5) {
                    for (int var6 = 0; var6 < Packet.field344; var6++) {
                        if (GameCanvas.field41.field353[var6] == this.field225) {
                            int var7 = this.field253 + GameCanvas.field41.field356[var6] * this.field297 / GameCanvas.field42;
                            int var8 = GameCanvas.field41.field352[var6] * this.field261 / JavaKeyboard.field14 + this.field255;
                            Draw2D.fillCircle(var8, var7, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field282) {
                this.method107(this.field223, 10066329, this.field244, (byte) 48, this.field239, 18, this.field259, 5592405, 7829367);
                this.method107(JavaMouse.field384, 10066329, this.field244 + 18, (byte) 48, this.field239, this.field248 - 36, this.field259, 5592405, 7829367);
                this.method107(this.field222, 10066329, this.field248 + this.field244 - 18, (byte) 48, this.field239, 18, this.field259, 5592405, 7829367);
                int var9 = this.field244 + 21;
                int var10 = this.field214;
                for (int var11 = 0; var11 < 24; var11++) {
                    if (var10 < class1.field8.length && this.field218.length > var10) {
                        if (this.field218[var10].method245(class18.field170, -115)) {
                            var10++;
                            var11--;
                            continue;
                        }
                        class1.field8[var10].method10(this.field239 + 3, var9);
                        this.field219.drawString(this.field218[var10], this.field239 + 21, var9 + 14, 0);
                        int var12 = 16777215;
                        if (this.field294 == var10) {
                            var12 = 12298922;
                        }
                        if (this.field264 > 0 && this.field264 % 10 < 5 && this.field225 == var10) {
                            var12 = 16776960;
                        }
                        this.field219.drawString(this.field218[var10], this.field239 + 20, var9 + 13, var12);
                    }
                    var9 += 17;
                    var10++;
                }
            }
            if (field236.length == 1) {
                this.method107(this.field257, this.field249, this.field297 + this.field253, (byte) 48, this.field255, 18, this.field261, this.field245, this.field241);
                this.method107(this.field283, this.field249, this.field248 + this.field244, (byte) 48, this.field239, 18, this.field259, this.field245, this.field241);
                if (this.field278 == 3.0D) {
                    this.method107(class18.field159, this.field290, this.field228, (byte) 48, this.field229, this.field243, this.field215, this.field277, this.field296);
                } else {
                    this.method107(class18.field159, this.field249, this.field228, (byte) 48, this.field229, this.field243, this.field215, this.field245, this.field241);
                }
                if (this.field278 == 4.0D) {
                    this.method107(Js5.field137, this.field290, this.field228, (byte) 48, this.field293 + this.field229, this.field243, this.field215, this.field277, this.field296);
                } else {
                    this.method107(Js5.field137, this.field249, this.field228, (byte) 48, this.field293 + this.field229, this.field243, this.field215, this.field245, this.field241);
                }
                if (this.field278 == 6.0D) {
                    this.method107(ByteArrayPool.field177, this.field290, this.field228, (byte) 48, this.field293 * 2 + this.field229, this.field243, this.field215, this.field277, this.field296);
                } else {
                    this.method107(ByteArrayPool.field177, this.field249, this.field228, (byte) 48, this.field293 * 2 + this.field229, this.field243, this.field215, this.field245, this.field241);
                }
                if (this.field278 == 8.0D) {
                    this.method107(JavaPixMap.field193, this.field290, this.field228, (byte) 48, this.field229 + this.field293 * 3, this.field243, this.field215, this.field277, this.field296);
                } else {
                    this.method107(JavaPixMap.field193, this.field249, this.field228, (byte) 48, this.field293 * 3 + this.field229, this.field243, this.field215, this.field245, this.field241);
                }
            } else {
                this.method107(this.field257, this.field249, this.field297 + this.field253, (byte) 48, this.field255, 18, this.field261, this.field245, this.field241);
                this.method107(this.field283, this.field249, this.field244 + this.field248, (byte) 48, this.field239, 18, this.field259, this.field245, this.field241);
                this.method105(false, this.field241);
                int var13 = this.field228 + this.field265;
                if (this.field278 == 3.0D) {
                    this.method107(class18.field159, this.field290, var13, (byte) 48, this.field229, this.field243, this.field215, this.field277, this.field296);
                } else {
                    this.method107(class18.field159, this.field249, var13, (byte) 48, this.field229, this.field243, this.field215, this.field245, this.field241);
                }
                if (this.field278 == 4.0D) {
                    this.method107(Js5.field137, this.field290, var13, (byte) 48, this.field293 + this.field229, this.field243, this.field215, this.field277, this.field296);
                } else {
                    this.method107(Js5.field137, this.field249, var13, (byte) 48, this.field293 + this.field229, this.field243, this.field215, this.field245, this.field241);
                }
                if (this.field278 == 6.0D) {
                    this.method107(ByteArrayPool.field177, this.field290, var13, (byte) 48, this.field293 * 2 + this.field229, this.field243, this.field215, this.field277, this.field296);
                } else {
                    this.method107(ByteArrayPool.field177, this.field249, var13, (byte) 48, this.field293 * 2 + this.field229, this.field243, this.field215, this.field245, this.field241);
                }
                if (this.field278 == 8.0D) {
                    this.method107(JavaPixMap.field193, this.field290, var13, (byte) 48, this.field293 * 3 + this.field229, this.field243, this.field215, this.field277, this.field296);
                } else {
                    this.method107(JavaPixMap.field193, this.field249, var13, (byte) 48, this.field293 * 3 + this.field229, this.field243, this.field215, this.field245, this.field241);
                }
            }
            if (BZip2State.field511) {
                this.method107(this.field210, this.field249, this.field262, (byte) 48, this.field287, this.field299, this.field220, this.field245, this.field241);
                if (GZip.field112) {
                    Draw2D.fillRectAlpha(this.field287 + this.field220 + 2, this.field262, this.field300 + 10, this.field299, 8925952, 192);
                    Draw2D.drawRect(this.field287 + this.field220 + 2, this.field262, this.field300 + 10, this.field299, 16777215);
                    if (JavaPixMap.field194 > -1 && this.field250.method239(25305) > 0) {
                        JagString var14 = this.field266[JavaPixMap.field194].method240(47, 32, 68);
                        int var15 = this.field250.method239(25305);
                        if (var15 > var14.method239(25305)) {
                            var15 = var14.method239(25305);
                        }
                        this.field219.drawString(var14, this.field287 + this.field220 + 6, 20, 10066176, true);
                        this.field219.drawString(var14.method241(true, 0, var15), this.field220 + this.field287 + 6, 20, 16777215, true);
                    } else {
                        this.field219.drawString(this.field237, this.field220 + this.field287 + 6, 20, 16776960, true);
                    }
                }
            }
        }
        if (class18.field162) {
            this.method103(71);
        }
        if (arg0) {
            this.method93(-66, (byte) 120);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(I)V", line = 689)
    public final void method86(int arg0) {
        method109(arg0 + 25365);
        class4.method13((byte) -38);
        JagString.method248((byte) -87);
        JavaKeyboard.method7(110);
        HashTable.method35(arg0 ^ 0xFFFF9CB7);
        Packet.method154((byte) 87);
        GameShell.method92(123);
        Timer.method188(false);
        PixMap.method122(arg0 + 25260);
        Js5.method57(0);
        Worldmap.method157(87);
        PixFont.method203();
        WorldmapFont.method139();
        JavaMouse.method177((byte) -17);
        MonotonicTime.method74(25410);
        Js5Index.method131(-1);
        IntHashTable.method27(14572);
        GZip.method52(22953);
        Draw2D.method220();
        WorldmapOverlay.method174(arg0 ^ 0xFFFF9CD9);
        class1.method1(arg0 ^ arg0);
        DoublyLinkable.method21(222);
        Linkable.method41(-78);
        JagException.method45(false);
        PreciseSleep.method207(arg0 ^ 0x4E76);
        StringNode.method40((byte) 97);
        ByteArrayPool.method65(-20216);
        GameCanvas.method17((byte) 63);
        class18.method62(5);
        MillisTimer.method61(arg0 + 25285);
        JavaPixMap.method71(-111);
        ByteArray.method54((byte) -11);
        BZip2.method117();
        BZip2State.method254(true);
        this.field272 = null;
        this.field283 = null;
        this.field285 = null;
        this.field237 = null;
        this.field256 = null;
        this.field210 = null;
        this.field222 = null;
        this.field298 = null;
        this.field263 = null;
        this.field223 = null;
        this.field246 = null;
        this.field271 = null;
        this.field286 = null;
        this.field288 = null;
        this.field252 = null;
        this.field217 = null;
        this.field254 = null;
        this.field273 = null;
        this.field279 = null;
        this.field219 = null;
        this.field266 = null;
        this.field281 = null;
        this.field218 = null;
        this.field267 = null;
        this.field250 = null;
        this.field234 = null;
        this.field257 = null;
        this.field289 = null;
        this.field251 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(I)V", line = 765)
    public final void method79(int arg0) {
        if (JavaMouse.field386) {
            Linkable.method42(32, class18.field167);
            Js5Index.method134(-7, class18.field167);
            this.method81(106);
            JavaPixMap.method69((byte) 118, class18.field167);
            BZip2State.method253(class18.field167, 32);
        }
        GZip.method49((byte) 26);
        class4.method14((byte) -39);
        if (!JavaPixMap.field192) {
            return;
        }
        if (ByteArrayPool.field185[96]) {
            GZip.field123 = -1;
            this.field268 = true;
            StringNode.field80 = (int) ((double) StringNode.field80 - 16.0D / this.field227);
        }
        if (ByteArrayPool.field185[97]) {
            GZip.field123 = -1;
            this.field268 = true;
            StringNode.field80 = (int) (16.0D / this.field227 + (double) StringNode.field80);
        }
        if (ByteArrayPool.field185[98]) {
            GZip.field123 = -1;
            this.field268 = true;
            field275 = (int) ((double) field275 - 16.0D / this.field227);
        }
        if (ByteArrayPool.field185[99]) {
            this.field268 = true;
            GZip.field123 = -1;
            field275 = (int) (16.0D / this.field227 + (double) field275);
        }
        while (true) {
            boolean var2;
            label481: do {
                while (true) {
                    while (true) {
                        while (JavaMouse.method181(63)) {
                            if (!BZip2State.field511 || !GZip.field112) {
                                if (field295 == this.field270 || field295 == this.field221) {
                                    this.field268 = true;
                                    GZip.field112 = true;
                                }
                                if (field295 == 49) {
                                    this.field268 = true;
                                    this.field278 = 3.0D;
                                }
                                if (field295 == 50) {
                                    this.field268 = true;
                                    this.field278 = 4.0D;
                                }
                                if (field295 == 51) {
                                    this.field268 = true;
                                    this.field278 = 6.0D;
                                }
                                if (field295 == 52) {
                                    this.field268 = true;
                                    this.field278 = 8.0D;
                                }
                                if (field295 == this.field301 || field295 == this.field230) {
                                    this.field268 = true;
                                    this.field282 = !this.field282;
                                }
                                if (field295 == this.field242 || field295 == this.field213) {
                                    this.field268 = true;
                                    this.field233 = !this.field233;
                                }
                            } else if (Worldmap.field360 == 0) {
                                GZip.field112 = false;
                                this.field268 = true;
                                this.field250.method232(0, -120);
                                JavaPixMap.field194 = -1;
                            } else {
                                if (Worldmap.field360 != 84) {
                                    var2 = false;
                                    if (Worldmap.field360 == 85) {
                                        if (this.field250.method239(25305) > 0) {
                                            this.field250.method232(this.field250.method239(25305) - 1, -126);
                                            this.field268 = true;
                                            if (this.field250.method239(25305) == 0) {
                                                JavaPixMap.field194 = -1;
                                            } else {
                                                var2 = true;
                                            }
                                        }
                                    } else if (field295 != -1 && this.field250.method239(25305) <= JavaPixMap.field191) {
                                        this.field250.method230((byte) 117, field295);
                                        this.field268 = true;
                                    }
                                    continue label481;
                                }
                                this.field238 = StringNode.field80 << 16;
                                GZip.field123 = JavaPixMap.field194;
                                GZip.field112 = false;
                                this.field216 = field275 << 16;
                                this.field250.method232(0, -121);
                                this.field268 = true;
                                JavaPixMap.field194 = -1;
                            }
                        }
                        int var6 = 72 % ((31 - arg0) / 54);
                        int var7 = MillisTimer.field155;
                        int var8 = GameCanvas.field38;
                        int var9 = DoublyLinkable.field44;
                        int var10 = MillisTimer.field152;
                        int var11 = class18.field163;
                        int var12 = Timer.field402;
                        if (var7 == 1) {
                            this.field274 = var8;
                            this.field247 = field275;
                            this.field232 = StringNode.field80;
                            this.field258 = var11;
                            if (field236.length == 1) {
                                if (var11 > this.field229 && var11 < this.field229 + this.field215 && this.field228 < var8 && this.field243 + this.field228 > var8) {
                                    this.field258 = -1;
                                    this.field278 = 3.0D;
                                }
                                if (var11 > this.field293 + this.field229 && this.field293 + this.field215 + this.field229 > var11 && this.field228 < var8 && this.field228 + this.field243 > var8) {
                                    this.field278 = 4.0D;
                                    this.field258 = -1;
                                }
                                if (var11 > this.field293 * 2 + this.field229 && this.field293 * 2 + this.field229 + this.field215 > var11 && var8 > this.field228 && this.field243 + this.field228 > var8) {
                                    this.field258 = -1;
                                    this.field278 = 6.0D;
                                }
                                if (var11 > this.field229 + this.field293 * 3 && var11 < this.field293 * 3 + this.field215 + this.field229 && var8 > this.field228 && var8 < this.field243 + this.field228) {
                                    this.field278 = 8.0D;
                                    this.field258 = -1;
                                }
                            } else {
                                if (this.field229 < var11 && this.field229 + this.field215 > var11 && this.field228 < var8 && var8 < this.field243 + this.field228 + this.field265) {
                                    this.field258 = -1;
                                    this.field278 = 3.0D;
                                }
                                if (var11 > this.field229 + this.field293 && var11 < this.field293 + this.field215 + this.field229 && var8 > this.field228 && this.field228 + this.field243 + this.field265 > var8) {
                                    this.field278 = 4.0D;
                                    this.field258 = -1;
                                }
                                if (this.field293 * 2 + this.field229 < var11 && var11 < this.field293 * 2 + this.field229 + this.field215 && var8 > this.field228 && var8 < this.field228 + this.field265 + this.field243) {
                                    this.field258 = -1;
                                    this.field278 = 6.0D;
                                }
                                if (var11 > this.field293 * 3 + this.field229 && this.field293 * 3 + this.field215 + this.field229 > var11 && this.field228 < var8 && var8 < this.field243 + this.field228 + this.field265) {
                                    this.field258 = -1;
                                    this.field278 = 8.0D;
                                }
                                if (var11 > 170 && var11 < 400 && var8 > 483 && var8 < 503) {
                                    this.method105(false, this.field296);
                                    this.method103(114);
                                    this.method98(-27210);
                                    this.field258 = -1;
                                }
                            }
                            this.field212 = false;
                            this.field268 = true;
                            if (var11 > this.field239 && var8 > this.field248 + this.field244 && this.field239 + this.field259 > var11 && var8 < 503) {
                                this.field258 = -1;
                                this.field282 = !this.field282;
                            }
                            if (var11 > this.field255 && this.field297 + this.field253 < var8 && var11 < this.field261 + this.field255 && var8 < 503) {
                                this.field258 = -1;
                                this.field233 = !this.field233;
                            }
                            if (this.field282) {
                                if (this.field239 < var11 && var8 > this.field244 && var11 < this.field259 + this.field239 && this.field244 + 18 > var8 && this.field235 > 0) {
                                    this.field235 -= 24;
                                }
                                if (var11 > this.field239 && this.field248 + this.field244 - 18 < var8 && this.field259 + this.field239 > var11 && this.field248 + this.field244 > var8 && this.field235 < 48) {
                                    this.field235 += 24;
                                }
                                if (this.field239 < var11 && var8 > this.field244 && var11 < this.field259 + this.field239 && this.field248 + this.field244 > var8) {
                                    this.field258 = -1;
                                }
                            }
                            if (this.field233 && this.field255 < var11 && this.field253 < var8 && this.field261 + this.field255 > var11 && this.field297 + this.field253 > var8) {
                                this.field258 = -1;
                                StringNode.field80 = (var11 - this.field255) * JavaKeyboard.field14 / this.field261;
                                field275 = (var8 - this.field253) * GameCanvas.field42 / this.field297;
                                this.field212 = true;
                            }
                            if (BZip2State.field511 && !GZip.field112 && !this.field212 && this.field287 < var11 && this.field262 < var8 && this.field287 + this.field220 > var11 && var8 < this.field299 + this.field262) {
                                GZip.field112 = true;
                            }
                        }
                        if (this.field282) {
                            this.field294 = -1;
                            if (var10 > this.field239 && this.field259 + this.field239 > var10) {
                                int var13 = this.field214;
                                int var14 = this.field244 + 5 + 21;
                                for (int var15 = 0; var15 < 24; var15++) {
                                    if (var13 < this.field218.length && this.field218[var13].method245(class18.field170, -86)) {
                                        var13++;
                                        var15--;
                                    } else {
                                        if (var14 <= var12 && var12 < var14 + 17) {
                                            this.field294 = var13;
                                            if (var7 == 1) {
                                                this.field264 = 50;
                                                this.field225 = var13;
                                            }
                                        }
                                        var13++;
                                        var14 += 17;
                                    }
                                }
                            }
                            if (this.field294 != this.field284) {
                                this.field284 = this.field294;
                                this.field268 = true;
                            }
                        }
                        if (var9 == 1 && this.field233 && this.field212) {
                            GZip.field123 = -1;
                            this.field268 = true;
                            int var16 = var12;
                            int var17 = var10;
                            if (var10 < this.field255) {
                                var17 = this.field255;
                            } else if (this.field255 + this.field261 < var10) {
                                var17 = this.field261 + this.field255;
                            }
                            if (this.field253 > var12) {
                                var16 = this.field253;
                            } else if (this.field253 + this.field297 < var12) {
                                var16 = this.field253 + this.field297;
                            }
                            StringNode.field80 = (var17 - this.field255) * JavaKeyboard.field14 / this.field261;
                            field275 = (var16 - this.field253) * GameCanvas.field42 / this.field297;
                        } else {
                            this.field212 = false;
                        }
                        if (var9 == 1 && this.field258 != -1) {
                            this.field268 = true;
                            GZip.field123 = -1;
                            StringNode.field80 = (int) ((double) (this.field258 - var10) * 2.0D / this.field278) + this.field232;
                            field275 = this.field247 + (int) ((double) (this.field274 - var12) * 2.0D / this.field278);
                        }
                        if (this.field278 > this.field227) {
                            this.field268 = true;
                            this.field227 /= 30.0D;
                            if (this.field227 > this.field278) {
                                this.field227 = this.field278;
                            }
                        }
                        if (this.field278 < this.field227) {
                            this.field268 = true;
                            this.field227 /= 30.0D;
                            if (this.field227 < this.field278) {
                                this.field227 = this.field278;
                            }
                        }
                        if (this.field235 > this.field214) {
                            this.field214++;
                            this.field268 = true;
                        }
                        if (this.field235 < this.field214) {
                            this.field268 = true;
                            this.field214--;
                        }
                        if (this.field264 > 0) {
                            this.field264--;
                            this.field268 = true;
                        }
                        if (GZip.field123 >= 0) {
                            byte var18 = 4;
                            JavaPixMap.field195 = this.field246[GZip.field123] - ByteArrayPool.field179;
                            Linkable.field99 = HashTable.field67 + GameCanvas.field42 - this.field288[GZip.field123];
                            int var19 = (int) (635.0D / this.field227) + JavaPixMap.field195;
                            this.field268 = true;
                            int var20 = JavaPixMap.field195 - (int) (635.0D / this.field227);
                            if (var20 < 48) {
                                JavaPixMap.field195 = (int) (635.0D / this.field227) + 48;
                            }
                            int var21 = (int) (503.0D / this.field227) + Linkable.field99;
                            int var22 = Linkable.field99 - (int) (503.0D / this.field227);
                            if (var22 < 48) {
                                Linkable.field99 = (int) (503.0D / this.field227) + 48;
                            }
                            if (GameCanvas.field42 - 48 < var21) {
                                Linkable.field99 = GameCanvas.field42 - (int) (503.0D / this.field227) - 48;
                            }
                            if (JavaKeyboard.field14 - 48 < var19) {
                                JavaPixMap.field195 = JavaKeyboard.field14 - (int) (635.0D / this.field227) - 48;
                            }
                            JavaPixMap.field195 <<= 0x10;
                            Linkable.field99 <<= 0x10;
                            int var23 = Linkable.field99 - this.field216;
                            int var24 = JavaPixMap.field195 - this.field238;
                            if (var24 >> var18 == 0 && var23 >> var18 == 0) {
                                GZip.field123 = -1;
                            } else {
                                this.field238 += var24 >> var18;
                                this.field216 += var23 >> var18;
                                StringNode.field80 = this.field238 >> 16;
                                field275 = this.field216 >> 16;
                            }
                        }
                        int var25 = StringNode.field80 - (int) (635.0D / this.field227);
                        int var26 = (int) (635.0D / this.field227) + StringNode.field80;
                        int var27 = field275 - (int) (503.0D / this.field227);
                        if (var25 < 48) {
                            StringNode.field80 = (int) (635.0D / this.field227) + 48;
                        }
                        if (var26 > JavaKeyboard.field14 - 48) {
                            StringNode.field80 = JavaKeyboard.field14 - (int) (635.0D / this.field227) - 48;
                        }
                        int var28 = (int) (503.0D / this.field227) + field275;
                        if (var27 < 48) {
                            field275 = (int) (503.0D / this.field227) + 48;
                        }
                        if (GameCanvas.field42 - 48 < var28) {
                            field275 = GameCanvas.field42 - (int) (503.0D / this.field227) - 48;
                        }
                        return;
                    }
                }
            } while (this.field250.method239(25305) <= 0);
            for (int var3 = 0; var3 < this.field211; var3++) {
                if (this.field266[var3].method239(25305) >= this.field250.method239(25305)) {
                    JagString var4 = this.field250.method236((byte) 92);
                    JagString var5 = this.field266[var3].method240(47, 32, -26).method241(true, 0, this.field250.method239(25305)).method236((byte) 92);
                    if (var4.method238(var5, (byte) -65) == 0) {
                        this.field268 = true;
                        var2 = true;
                        JavaPixMap.field194 = var3;
                        break;
                    }
                }
            }
            if (!var2) {
                this.field250.method232(this.field250.method239(25305) - 1, -127);
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BIIIIIIII)V", line = 1326)
    private final void method99(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = 126 % ((-arg0 - 64) / 50);
        GameCanvas.field41.method166(arg3, true, arg4, arg8, arg7, arg5, arg1, arg2, arg6);
        if (arg7 - arg2 < arg6 - arg3) {
            return;
        }
        GameCanvas.field41.method173(arg2, true, arg1, arg3, this.field227, arg6, arg8, arg4, arg7, arg5);
        GameCanvas.field41.method162(arg2, arg3, arg5, arg1, arg7, 79, arg6, arg4, arg8);
        GameCanvas.field41.method167(arg6, arg3, this.field264, (byte) 116, this.field225, arg5, arg1, arg7, arg8, arg2, arg4);
        if (this.field278 == this.field227 && Js5.field136) {
            for (int var11 = 0; var11 < this.field211; var11++) {
                int var12 = this.field246[var11];
                int var13 = this.field288[var11];
                int var14 = HashTable.field67 + GameCanvas.field42 - var13;
                int var15 = arg1 + (arg5 - arg1) * (-arg4 + var14) / (arg8 - arg4);
                int var16 = 16777215;
                int var17 = this.field263[var11];
                int var18 = var12 - ByteArrayPool.field179;
                int var19 = (var18 - arg3) * (-arg2 + arg7) / (arg6 - arg3) + arg2;
                WorldmapFont var20 = null;
                if (var17 == 0) {
                    if (this.field227 == 3.0D) {
                        var20 = this.field271;
                    }
                    if (this.field227 == 4.0D) {
                        var20 = this.field298;
                    }
                    if (this.field227 == 6.0D) {
                        var20 = this.field252;
                    }
                    if (this.field227 == 8.0D) {
                        var20 = this.field254;
                    }
                }
                if (var17 == 1) {
                    if (this.field227 == 3.0D) {
                        var20 = this.field252;
                    }
                    if (this.field227 == 4.0D) {
                        var20 = this.field254;
                    }
                    if (this.field227 == 6.0D) {
                        var20 = this.field234;
                    }
                    if (this.field227 == 8.0D) {
                        var20 = this.field285;
                    }
                }
                if (var17 == 2) {
                    var16 = 16755200;
                    if (this.field227 == 3.0D) {
                        var20 = this.field234;
                    }
                    if (this.field227 == 4.0D) {
                        var20 = this.field285;
                    }
                    if (this.field227 == 6.0D) {
                        var20 = this.field217;
                    }
                    if (this.field227 == 8.0D) {
                        var20 = this.field289;
                    }
                }
                if (var20 != null) {
                    int var21 = 1;
                    JagString var22 = this.field266[var11];
                    for (int var23 = 0; var22.method239(25305) > var23; var23++) {
                        if (var22.method250((byte) 98, var23) == 47) {
                            var21++;
                        }
                    }
                    int var24 = var15 - (var21 - 1) * var20.method144() / 2;
                    int var25 = var24 + var20.method135() / 2;
                    while (true) {
                        int var26 = var22.method234((byte) 26, 47);
                        if (var26 == -1) {
                            var20.method143(var22, var19, var25, var16, true);
                            break;
                        }
                        JagString var27 = var22.method241(true, 0, var26);
                        var20.method143(var27, var19, var25, var16, true);
                        var25 += var20.method144();
                        var22 = var22.method243(var26 + 1, 33);
                    }
                }
            }
        }
        if (!Linkable.field94) {
            return;
        }
        for (int var28 = ByteArrayPool.field179 / 64; var28 < (ByteArrayPool.field179 + JavaKeyboard.field14) / 64; var28++) {
            for (int var29 = HashTable.field67 / 64; var29 < (HashTable.field67 + GameCanvas.field42) / 64; var29++) {
                int var30 = var28 * 64;
                int var31 = var29 * 64;
                int var32 = var30 - ByteArrayPool.field179;
                int var33 = (arg7 - arg2) * (-arg3 + var32) / (arg6 - arg3) + arg2;
                int var34 = HashTable.field67 + GameCanvas.field42 - var31;
                int var35 = (var32 + 64 - arg3) * (-arg2 + arg7) / (arg6 - arg3) + arg2;
                int var36 = arg1 + (arg5 - arg1) * (var34 + -64 + -arg4) / (arg8 - arg4);
                int var37 = arg1 + (var34 - arg4) * (-arg1 + arg5) / (arg8 - arg4);
                Draw2D.drawRect(var33, var36, var35 - var33, -var36 + var37, 16777215);
                this.field219.drawStringRight(PixMap.method123((byte) -14, new JagString[] { JavaPixMap.method73(-1, var28), ByteArrayPool.field184, JavaPixMap.method73(-1, var29) }), var35 - 5, var37 - 5, 16777215);
                if (var28 == 33 && var29 >= 71 && var29 <= 73) {
                    this.field219.drawStringCenter(class18.field168, (var33 + var35) / 2, (var36 + var37) / 2, 16711680);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(Z)V", line = 1514)
    private final void method100(boolean arg0) {
        String var3;
        try {
            String var2 = System.getProperty("user.home");
            if (var2 == null) {
                var3 = "~/";
            } else {
                var3 = var2 + "/";
            }
        } catch (Exception var13) {
            var3 = "~/";
        }
        if (!arg0) {
            this.method80((byte) -41);
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", var3, "/tmp/", "" };
        String var6 = ".file_store_32";
        for (int var7 = 0; var7 < var5.length; var7++) {
            try {
                String var8 = var5[var7];
                if (var8.length() > 0) {
                    File var9 = new File(var8);
                    if (!var9.exists()) {
                        continue;
                    }
                }
                File var10 = new File(var8 + var6);
                if (var10.exists() || var10.mkdir()) {
                    File var11 = new File(var10, "rsmap");
                    if (var11.exists() || var11.mkdir()) {
                        Worldmap.field351 = var8 + var6 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var14) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 1581)
    private final byte[] method101(int arg0, String arg1) throws IOException {
        if (arg0 != 17) {
            return (byte[]) null;
        }
        File var3 = new File(arg1);
        if (!var3.exists()) {
            return null;
        }
        int var4 = (int) var3.length();
        byte[] var5 = new byte[var4];
        DataInputStream var6 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        var6.readFully(var5, 0, var4);
        var6.close();
        return var5;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lv;ILjava/lang/String;)Z", line = 1610)
    private final boolean method102(JagString arg0, int arg1, String arg2) {
        try {
            if (ByteArrayPool.field182 == null) {
                JavaKeyboard.field17 = PixMap.method123((byte) -14, new JagString[] { this.field286, JavaMouse.field388, arg0 });
                String var4;
                if (arg2 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=-1696256772";
                } else if (arg2 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=970156457";
                } else if (arg2 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=-410260381";
                } else {
                    var4 = "mapview.sprites.js5?crc=-1238733512";
                }
                ByteArrayPool.field182 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                int var5;
                if (arg2 == "main_file_cache.dat0") {
                    var5 = 416799;
                } else if (arg2 == "main_file_cache.dat1") {
                    var5 = 153824;
                } else if (arg2 == "main_file_cache.dat2") {
                    var5 = 134029;
                } else {
                    var5 = 8466;
                }
                class1.field11 = 0;
                Js5Index.field315 = new byte[var5];
                PreciseSleep.field433 = 0;
            }
            int var6 = class1.field11;
            int var7 = 11 / ((84 - arg1) / 37);
            int var8 = Js5Index.field315.length;
            if (var6 >= var8) {
                ByteArrayPool.field182.close();
                ByteArrayPool.field182 = null;
                if (!this.method97(arg2, Js5Index.field315, false)) {
                    this.method82((byte) -124, "download");
                    Js5Index.field315 = null;
                }
                return true;
            }
            PreciseSleep.field433++;
            if (PreciseSleep.field433 >= 1500) {
                throw new IOException();
            }
            DataInputStream var9 = ByteArrayPool.field182;
            int var10 = var9.available();
            if (var10 < 0) {
                throw new EOFException();
            } else if (var10 == 0) {
                return false;
            } else {
                if (var10 > var8 - var6) {
                    var10 = var8 - var6;
                }
                int var11 = var9.read(Js5Index.field315, var6, var10);
                if (var11 < 0) {
                    throw new EOFException();
                } else if (var11 == 0) {
                    return false;
                } else {
                    PreciseSleep.field433 = 0;
                    int var12 = var6 + var11;
                    int var13 = var12 * 100 / var8;
                    JavaKeyboard.field17 = PixMap.method123((byte) -14, new JagString[] { this.field281, JavaMouse.field388, arg0, class4.field30, JavaPixMap.method73(-1, var13), MonotonicTime.field200 });
                    class1.field11 = var12;
                    return false;
                }
            }
        } catch (IOException var17) {
            try {
                ByteArrayPool.field182.close();
            } catch (Exception var16) {
            }
            ByteArrayPool.field182 = null;
            Js5Index.field315 = null;
            this.method82((byte) -127, new String("download"));
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "(I)V", line = 1733)
    private final void method103(int arg0) {
        class18.field162 = false;
        try {
            Graphics var2 = class18.field167.getGraphics();
            JagString.field466.drawImage(0, var2, false, 0);
        } catch (Exception var4) {
            class18.field167.repaint();
        }
        if (arg0 < 31) {
            method109(28);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)I", line = 1758)
    private final int method104(int arg0, int arg1) {
        arg0++;
        if (field236.length <= arg0) {
            arg0 = 0;
        }
        return arg1 > -107 ? 4 : arg0;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ZI)V", line = 1792)
    private final void method105(boolean arg0, int arg1) {
        this.method107(PixMap.method123((byte) -14, new JagString[] { Timer.field401, PreciseSleep.field440[GZip.field118], class1.field6 }), this.field249, 483, (byte) 48, 170, 18, 230, this.field245, arg1);
        if (arg0) {
            this.method105(true, 113);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;[BI)V", line = 1804)
    private final void method106(String arg0, byte[] arg1, int arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg0);
        var4.write(arg1, 0, arg1.length);
        var4.close();
        if (arg2 != 30316) {
            this.method98(-73);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lv;IIBIIIII)V", line = 1847)
    private final void method107(JagString arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Draw2D.drawRect(arg4, arg2, arg6, arg5, 0);
        int var10 = arg2 + 1;
        int var12 = arg5 - 2;
        int var13 = arg6 - 2;
        int var11 = arg4 + 1;
        Draw2D.fillRect(var11, var10, var13, var12, arg8);
        Draw2D.drawHorizontalLine(var11, var10, var13, arg1);
        Draw2D.drawVerticalLine(var11, var10, var12, arg1);
        Draw2D.drawHorizontalLine(var11, var12 + var10 - 1, var13, arg7);
        if (arg3 != 48) {
            this.method99((byte) 16, 2, 75, -98, -17, 78, -34, -9, 51);
        }
        Draw2D.drawVerticalLine(var11 + var13 - 1, var10, var12, arg7);
        this.field219.drawStringCenter(arg0, var13 / 2 + var11 + 1, var12 / 2 + 1 + var10 + 4, 0);
        this.field219.drawStringCenter(arg0, var13 / 2 + var11, var12 / 2 + var10 + 4, 16777215);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lv;ZLjava/lang/String;)Z", line = 1888)
    private final boolean method108(JagString arg0, boolean arg1, String arg2) {
        byte[] var4 = null;
        if (!JagString.field472) {
            if (Worldmap.field351 != null) {
                try {
                    var4 = this.method101(17, Worldmap.field351 + "/" + arg2);
                    if (!this.method97(arg2, var4, false)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        StringNode.field86 = new Js5(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
            JagString.field472 = true;
        }
        if (var4 == null) {
            boolean var6 = this.method102(arg0, -116, arg2);
            if (!var6) {
                return false;
            }
            var4 = Js5Index.field315;
            Js5Index.field315 = null;
        }
        if (var4 == null) {
            JagString.field472 = false;
            return true;
        }
        if (Worldmap.field351 != null && var4 != null) {
            try {
                this.method106(Worldmap.field351 + "/" + arg2, var4, 30316);
            } catch (IOException var10) {
            }
        }
        try {
            StringNode.field86 = new Js5(var4, false, arg1);
            JagString.field472 = false;
            return true;
        } catch (IOException var9) {
            throw BZip2State.method252(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "(I)V", line = 1958)
    public static void method109(int arg0) {
        field260 = null;
        field236 = null;
        field302 = null;
        field231 = null;
        field209 = null;
        field291 = null;
        if (arg0 != -18) {
            method95(-88, -43, null, -95);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(B)V", line = 1996)
    public final void method80(byte arg0) {
        GameShell.method89((byte) 86);
        GameCanvas.method18(false);
        try {
            this.field246 = null;
            this.field266 = null;
            GameCanvas.field41 = null;
            this.field218 = null;
            this.field263 = null;
            this.field219 = null;
            this.field279 = null;
            this.field288 = null;
            System.gc();
        } catch (Throwable var3) {
        }
        if (arg0 <= 124) {
            this.method83((byte) 3);
        }
    }
}
