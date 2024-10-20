package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

public class CamelliaEngine implements BlockCipher {

    public boolean initialised = false;

    public int[] subkey = new int[96];

    public int[] kw = new int[8];

    public int[] ke = new int[12];

    public int[] state = new int[4];

    public static final int[] SIGMA = new int[] { -1600231809, 1003262091, -1233459112, 1286239154, -957401297, -380665154, 1426019237, -237801700, 283453434, -563598051, -1336506174, -1276722691 };

    public static final int[] SBOX1_1110 = new int[] { 1886416896, -2105376256, 741092352, -320017408, -1280068864, 656877312, -1061109760, -437918464, -454761472, -2054847232, 1465341696, 892679424, -353703424, 202116096, -1364283904, 1094795520, 589505280, -269488384, 1802201856, -1819045120, 1162167552, 421075200, -1515870976, 555819264, -303174400, 235802112, 1330597632, 1313754624, 488447232, 1701143808, -1835888128, -1111638784, -2038004224, -1195853824, -1347440896, -1886417152, 2088532992, -336860416, 522133248, -825307648, 1044266496, 808464384, -589505536, 1600085760, 1583242752, -976894720, 185273088, 437918208, -1499027968, -505290496, 960051456, -892679680, -707406592, 1195853568, 1566399744, 1027423488, -640034560, 16843008, 1515870720, -690563584, 1364283648, 1448498688, 1819044864, 1296911616, -1953789184, 218959104, -1701144064, 1717986816, -67372288, -858993664, -1330597888, 757935360, 1953788928, 303174144, 724249344, 538976256, -252645376, -1313754880, -2071690240, -1717987072, -538976512, 1280068608, -875836672, -1027423744, 875836416, 2122219008, 1987474944, 84215040, 1835887872, -1212696832, -1448498944, 825307392, -774778624, 387389184, 67372032, -673720576, 336860160, 1482184704, 976894464, 1633771776, -555819520, 454761216, 286331136, 471604224, 842150400, 252645120, -1667458048, 370546176, 1397969664, 404232192, -218959360, 572662272, -16843264, 1145324544, -808464640, -1296911872, -1010580736, -1246382848, 2054846976, -1852731136, 606348288, 134744064, -387389440, -1465341952, 1616928768, -50529280, 1768515840, 1347440640, -1431655936, -791621632, -1600086016, 2105376000, -1583243008, -1987475200, 1650614784, -1751673088, 1414812672, 1532713728, 505290240, -1785359104, -522133504, -256, 1684300800, -757935616, 269488128, -993737728, 0, 1212696576, -1549556992, -134744320, 1970631936, -606348544, -1970632192, 50529024, -421075456, -623191552, 151587072, 1061109504, -572662528, -1802202112, -2021161216, 1549556736, -2088533248, 33686016, -842150656, 1246382592, -1869574144, 858993408, 1936945920, 1734829824, -151587328, -202116352, -1650615040, 2139062016, -1077952768, -488447488, 1381126656, -1684301056, -656877568, 640034304, -926365696, 926365440, -960051712, 993737472, -2122219264, -1768516096, 1869573888, 1263225600, 320017152, -1094795776, 1667457792, 774778368, -370546432, 2038003968, -1482184960, -1936946176, -1616929024, 1852730880, -1128481792, -1903260160, 690563328, -168430336, -101058304, -1229539840, 791621376, -33686272, -1263225856, 1499027712, 2021160960, -1734830080, 101058048, 1785358848, -404232448, 1179010560, 1903259904, -1162167808, -724249600, 623191296, -1414812928, 1111638528, -2004318208, -1566400000, -1920103168, -84215296, 1920102912, 117901056, -1179010816, 1431655680, -117901312, -286331392, -1397969920, 168430080, 909522432, 1229539584, 707406336, 1751672832, 1010580480, 943208448, -235802368, -1532713984, 1077952512, 673720320, -741092608, 2071689984, -1145324800, -909522688, 1128481536, -1044266752, 353703168, -471604480, -1381126912, -185273344, 2004317952, -943208704, -2139062272, -1633772032 };

    public static final int[] SBOX4_4404 = new int[] { 1886388336, 741081132, -1280114509, -1061158720, -454819612, 1465319511, -353763094, -1364328274, 589496355, 1802174571, 1162149957, -1515913051, -303234835, 1330577487, 488439837, -1835925358, -2038038394, -1347485521, 2088501372, 522125343, 1044250686, -589561636, 1583218782, 185270283, -1499070298, 960036921, -707460907, 1566376029, -640089895, 1515847770, 1364262993, 1819017324, -1953824629, -1701183334, -67436293, -1330642768, 1953759348, 724238379, -252706576, -2071723900, -539033377, -875888437, 875823156, 1987444854, 1835860077, -1448542039, -774831919, 67371012, 336855060, 976879674, -555876130, 286326801, 842137650, -1667497828, 1397948499, -219021070, -16908034, -808517425, -1010630461, 2054815866, 606339108, -387448600, 1616904288, 1768489065, -1431699286, -1600126816, -1583284063, 1650589794, 1414791252, 505282590, -522190624, 1684275300, 269484048, 0, -1549598557, 1970602101, -1970667382, -421134106, 151584777, -572718883, -2021195641, -2088566653, -842202931, -1869610864, 1936916595, -151650058, -1650655075, -1078001473, 1381105746, -656932648, -926416696, -960102202, -2122252159, 1869545583, 320012307, 1667432547, -370605847, -1482227545, -1616969569, -1128529732, 690552873, -101121799, 791609391, -1263271756, 2021130360, 101056518, -404291353, 1903231089, -724303660, -1414856533, -2004352888, -1920139123, 1920073842, -1179057991, -117964552, -1398013780, 909508662, 707395626, 1010565180, -235863823, 1077936192, -741146413, -1145372485, 1128464451, 353697813, -1381171027, 2004287607, -2139094912, -2105409406, -320077588, 656867367, -437976859, -2054881147, 892665909, 202113036, 1094778945, -269549329, -1819082605, 421068825, 555810849, 235798542, 1313734734, 1701118053, -1111686979, -1195900744, -1886453617, -336920341, -825360178, 808452144, 1600061535, -976944955, 437911578, -505347871, -892731190, 1195835463, 1027407933, 16842753, -690618154, 1448476758, 1296891981, 218955789, 1717960806, -859045684, 757923885, 303169554, 538968096, -1313800015, -1718026087, 1280049228, -1027473214, 2122186878, 84213765, -1212743497, 825294897, 387383319, -673775401, 1482162264, 1633747041, 454754331, 471597084, 252641295, 370540566, 404226072, 572653602, 1145307204, -1296957262, -1246429003, -1852768111, 134742024, -1465384792, -50593540, 1347420240, -791674672, 2105344125, -1987510135, -1751711593, 1532690523, -1785397099, -65281, -757989166, -993787708, 1212678216, -134807305, -606404389, 50528259, -623247142, 1061093439, -1802239852, 1549533276, 33685506, 1246363722, 858980403, 1734803559, -202178317, 2139029631, -488505118, -1684340581, 640024614, 926351415, 993722427, -1768554346, 1263206475, -1094844226, 774766638, 2037973113, -1936981876, 1852702830, -1903296370, -168492811, -1229586250, -33750787, 1499005017, -1734868840, 1785331818, 1178992710, -1162215238, 623181861, 1111621698, -1566441310, -84279046, 117899271, 1431634005, -286392082, 168427530, 1229520969, 1751646312, 943194168, -1532755804, 673710120, 2071658619, -909573943, -1044315967, -471662365, -185335564, -943259449, -1633812322 };

    public static final int[] SBOX2_0222 = new int[] { 14737632, 328965, 5789784, 14277081, 6776679, 5131854, 8487297, 13355979, 13224393, 723723, 11447982, 6974058, 14013909, 1579032, 6118749, 8553090, 4605510, 14671839, 14079702, 2565927, 9079434, 3289650, 4934475, 4342338, 14408667, 1842204, 10395294, 10263708, 3815994, 13290186, 2434341, 8092539, 855309, 7434609, 6250335, 2039583, 16316664, 14145495, 4079166, 10329501, 8158332, 6316128, 12171705, 12500670, 12369084, 9145227, 1447446, 3421236, 5066061, 12829635, 7500402, 9803157, 11250603, 9342606, 12237498, 8026746, 11776947, 131586, 11842740, 11382189, 10658466, 11316396, 14211288, 10132122, 1513239, 1710618, 3487029, 13421772, 16250871, 10066329, 6381921, 5921370, 15263976, 2368548, 5658198, 4210752, 14803425, 6513507, 592137, 3355443, 12566463, 10000536, 9934743, 8750469, 6842472, 16579836, 15527148, 657930, 14342874, 7303023, 5460819, 6447714, 10724259, 3026478, 526344, 11513775, 2631720, 11579568, 7631988, 12763842, 12434877, 3552822, 2236962, 3684408, 6579300, 1973790, 3750201, 2894892, 10921638, 3158064, 15066597, 4473924, 16645629, 8947848, 10461087, 6645093, 8882055, 7039851, 16053492, 2302755, 4737096, 1052688, 13750737, 5329233, 12632256, 16382457, 13816530, 10526880, 5592405, 10592673, 4276545, 16448250, 4408131, 1250067, 12895428, 3092271, 11053224, 11974326, 3947580, 2829099, 12698049, 16777215, 13158600, 10855845, 2105376, 9013641, 0, 9474192, 4671303, 15724527, 15395562, 12040119, 1381653, 394758, 13487565, 11908533, 1184274, 8289918, 12303291, 2697513, 986895, 12105912, 460551, 263172, 10197915, 9737364, 2171169, 6710886, 15132390, 13553358, 15592941, 15198183, 3881787, 16711422, 8355711, 12961221, 10790052, 3618615, 11645361, 5000268, 9539985, 7237230, 9276813, 7763574, 197379, 2960685, 14606046, 9868950, 2500134, 8224125, 13027014, 6052956, 13882323, 15921906, 5197647, 1644825, 4144959, 14474460, 7960953, 1907997, 5395026, 15461355, 15987699, 7171437, 6184542, 16514043, 6908265, 11711154, 15790320, 3223857, 789516, 13948116, 13619151, 9211020, 14869218, 7697781, 11119017, 4868682, 5723991, 8684676, 1118481, 4539717, 1776411, 16119285, 15000804, 921102, 7566195, 11184810, 15856113, 14540253, 5855577, 1315860, 7105644, 9605778, 5526612, 13684944, 7895160, 7368816, 14935011, 4802889, 8421504, 5263440, 10987431, 16185078, 7829367, 9671571, 8816262, 8618883, 2763306, 13092807, 5987163, 15329769, 15658734, 9408399, 65793, 4013373 };

    public static final int[] SBOX3_3033 = new int[] { 939538488, 1090535745, 369104406, 1979741814, -654255655, -1828678765, 1610637408, -234818830, 1912631922, -1040137534, -1426019413, -1711236454, 1962964341, 100664838, 1459640151, -1610571616, -1862233711, -150931465, -1258244683, -922695223, -1577016670, -1946121076, -771697966, -1879011184, -167708938, 117442311, -1493129305, 654321447, -1912566130, -1308577102, 1224755529, -570368290, 1124090691, 1543527516, -687810601, -956250169, 1040203326, -184486411, -1895788657, 1728079719, 520101663, 402659352, 1845522030, -1358909521, 788541231, -503258398, -2063563387, 218107149, 1392530259, -268373776, -1677681508, 1694524773, -369038614, -1560239197, -1375686994, -1644126562, -335483668, -2147450752, 754986285, 1795189611, -1476351832, 721431339, 905983542, -1509906778, -989805115, -2046785914, 1291865421, 855651123, -50266627, 1711302246, 1476417624, -1778346346, 973093434, 150997257, -1795123819, 268439568, 2013296760, -671033128, 1107313218, -872362804, -285151249, 637543974, -452925979, 1627414881, 436214298, 1056980799, 989870907, -2113895806, -1241467210, -620700709, -738143020, -1744791400, -402593560, -1962898549, 33554946, -352261141, 167774730, 738208812, 486546717, -1342132048, 1862299503, -1929343603, -2013230968, 234884622, 419436825, -2030008441, 1308642894, 184552203, -1459574359, 201329676, 2030074233, 285217041, 2130739071, 570434082, -419371033, 1493195097, -520035871, -637478182, 1023425853, -939472696, 301994514, 67109892, 1946186868, 1409307732, 805318704, 2113961598, -1275022156, 671098920, 1426085205, 1744857192, 1342197840, -1107247426, -805252912, -1006582588, 822096177, -889140277, 704653866, -1392464467, 251662095, -905917750, 1879076976, -16711681, 838873650, 1761634665, 134219784, 1644192354, 0, 603989028, -788475439, -83821573, -1174357318, -318706195, 1157645637, -2130673279, 1929409395, 1828744557, -2080340860, -1627349089, -301928722, 1241533002, -1023360061, 771763758, -1056915007, 16777473, -436148506, 620766501, 1207978056, -1728013927, -1191134791, -1291799629, 2063629179, -117376519, -838807858, -1090469953, -553590817, 1895854449, 687876393, -855585331, 1811967084, 318771987, 1677747300, -1694458981, 1660969827, -1660904035, -1073692480, 1258310475, -1224689737, -1526684251, -1996453495, 1593859935, -1325354575, 385881879, -201263884, -1140802372, -754920493, 1174423110, -822030385, 922761015, 1577082462, 1191200583, -1811901292, -100599046, -67044100, 1526750043, -1761568873, -33489154, 1509972570, -1409241940, 1006648380, 1275087948, 50332419, 889206069, -218041357, 587211555, -1207912264, 1560304989, 1778412138, -1845456238, -721365547, 553656609, 1140868164, 1358975313, -973027642, 2097184125, 956315961, -2097118333, -603923236, -1442796886, 2080406652, 1996519287, 1442862678, 83887365, 452991771, -1543461724, 352326933, 872428596, 503324190, 469769244, -134153992, 1375752786, 536879136, 335549460, -385816087, -1124024899, -587145763, -469703452, -1593794143, -536813344, -1979676022, -251596303, -704588074, 2046851706, -1157579845, -486480925, 1073758272, 1325420367 };

    public static final int BLOCK_SIZE = 16;

    public static final int MASK8 = 255;

    public boolean _keyIs128;

    public int processBlock(byte[] arg0, int arg1, byte[] arg2, int arg3) throws DataLengthException, IllegalStateException {
        if (!this.initialised) {
            throw new IllegalStateException("Camellia engine not initialised");
        } else if (arg1 + 16 > arg0.length) {
            throw new DataLengthException("input buffer too short");
        } else if (arg3 + 16 > arg2.length) {
            throw new OutputLengthException("output buffer too short");
        } else if (this._keyIs128) {
            return this.processBlock128(arg0, arg1, arg2, arg3);
        } else {
            return this.processBlock192or256(arg0, arg1, arg2, arg3);
        }
    }

    public void init(boolean arg0, CipherParameters arg1) throws IllegalArgumentException {
        if (!(arg1 instanceof KeyParameter)) {
            throw new IllegalArgumentException("only simple KeyParameter expected.");
        }
        this.setKey(arg0, ((KeyParameter) arg1).getKey());
        this.initialised = true;
    }

    public void camelliaFLs(int[] arg0, int[] arg1, int arg2) {
        arg0[1] ^= leftRotate(arg0[0] & arg1[arg2], 1);
        arg0[0] ^= arg1[arg2 + 1] | arg0[1];
        arg0[2] ^= arg1[arg2 + 3] | arg0[3];
        arg0[3] ^= leftRotate(arg1[arg2 + 2] & arg0[2], 1);
    }

    public static void decroldq(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        arg3[arg4 + 2] = arg1[arg2] << arg0 | arg1[arg2 + 1] >>> 32 - arg0;
        arg3[arg4 + 3] = arg1[arg2 + 1] << arg0 | arg1[arg2 + 2] >>> 32 - arg0;
        arg3[arg4] = arg1[arg2 + 2] << arg0 | arg1[arg2 + 3] >>> 32 - arg0;
        arg3[arg4 + 1] = arg1[arg2 + 3] << arg0 | arg1[arg2] >>> 32 - arg0;
        arg1[arg2] = arg3[arg4 + 2];
        arg1[arg2 + 1] = arg3[arg4 + 3];
        arg1[arg2 + 2] = arg3[arg4];
        arg1[arg2 + 3] = arg3[arg4 + 1];
    }

    public static void roldqo32(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        arg3[arg4] = arg1[arg2 + 1] << arg0 - 32 | arg1[arg2 + 2] >>> 64 - arg0;
        arg3[arg4 + 1] = arg1[arg2 + 2] << arg0 - 32 | arg1[arg2 + 3] >>> 64 - arg0;
        arg3[arg4 + 2] = arg1[arg2 + 3] << arg0 - 32 | arg1[arg2] >>> 64 - arg0;
        arg3[arg4 + 3] = arg1[arg2] << arg0 - 32 | arg1[arg2 + 1] >>> 64 - arg0;
        arg1[arg2] = arg3[arg4];
        arg1[arg2 + 1] = arg3[arg4 + 1];
        arg1[arg2 + 2] = arg3[arg4 + 2];
        arg1[arg2 + 3] = arg3[arg4 + 3];
    }

    public static void decroldqo32(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        arg3[arg4 + 2] = arg1[arg2 + 1] << arg0 - 32 | arg1[arg2 + 2] >>> 64 - arg0;
        arg3[arg4 + 3] = arg1[arg2 + 2] << arg0 - 32 | arg1[arg2 + 3] >>> 64 - arg0;
        arg3[arg4] = arg1[arg2 + 3] << arg0 - 32 | arg1[arg2] >>> 64 - arg0;
        arg3[arg4 + 1] = arg1[arg2] << arg0 - 32 | arg1[arg2 + 1] >>> 64 - arg0;
        arg1[arg2] = arg3[arg4 + 2];
        arg1[arg2 + 1] = arg3[arg4 + 3];
        arg1[arg2 + 2] = arg3[arg4];
        arg1[arg2 + 3] = arg3[arg4 + 1];
    }

    public int bytes2int(byte[] arg0, int arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < 4; var4++) {
            var3 = (var3 << 8) + (arg0[arg1 + var4] & 0xFF);
        }
        return var3;
    }

    public void int2bytes(int arg0, byte[] arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            arg1[3 - var4 + arg2] = (byte) arg0;
            arg0 >>>= 0x8;
        }
    }

    public void camelliaF2(int[] arg0, int[] arg1, int arg2) {
        int var4 = arg0[0] ^ arg1[arg2];
        int var5 = SBOX4_4404[var4 & 0xFF];
        int var6 = var5 ^ SBOX3_3033[var4 >>> 8 & 0xFF];
        int var7 = var6 ^ SBOX2_0222[var4 >>> 16 & 0xFF];
        int var8 = var7 ^ SBOX1_1110[var4 >>> 24 & 0xFF];
        int var9 = arg0[1] ^ arg1[arg2 + 1];
        int var10 = SBOX1_1110[var9 & 0xFF];
        int var11 = var10 ^ SBOX4_4404[var9 >>> 8 & 0xFF];
        int var12 = var11 ^ SBOX3_3033[var9 >>> 16 & 0xFF];
        int var13 = var12 ^ SBOX2_0222[var9 >>> 24 & 0xFF];
        arg0[2] ^= var8 ^ var13;
        arg0[3] ^= var8 ^ var13 ^ rightRotate(var8, 8);
        int var14 = arg0[2] ^ arg1[arg2 + 2];
        int var15 = SBOX4_4404[var14 & 0xFF];
        int var16 = var15 ^ SBOX3_3033[var14 >>> 8 & 0xFF];
        int var17 = var16 ^ SBOX2_0222[var14 >>> 16 & 0xFF];
        int var18 = var17 ^ SBOX1_1110[var14 >>> 24 & 0xFF];
        int var19 = arg0[3] ^ arg1[arg2 + 3];
        int var20 = SBOX1_1110[var19 & 0xFF];
        int var21 = var20 ^ SBOX4_4404[var19 >>> 8 & 0xFF];
        int var22 = var21 ^ SBOX3_3033[var19 >>> 16 & 0xFF];
        int var23 = var22 ^ SBOX2_0222[var19 >>> 24 & 0xFF];
        arg0[0] ^= var18 ^ var23;
        arg0[1] ^= var18 ^ var23 ^ rightRotate(var18, 8);
    }

    public static int rightRotate(int arg0, int arg1) {
        return (arg0 >>> arg1) + (arg0 << 32 - arg1);
    }

    public void setKey(boolean arg0, byte[] arg1) {
        int[] var3 = new int[8];
        int[] var4 = new int[4];
        int[] var5 = new int[4];
        int[] var6 = new int[4];
        switch(arg1.length) {
            case 16:
                this._keyIs128 = true;
                var3[0] = this.bytes2int(arg1, 0);
                var3[1] = this.bytes2int(arg1, 4);
                var3[2] = this.bytes2int(arg1, 8);
                var3[3] = this.bytes2int(arg1, 12);
                var3[4] = var3[5] = var3[6] = var3[7] = 0;
                break;
            case 24:
                var3[0] = this.bytes2int(arg1, 0);
                var3[1] = this.bytes2int(arg1, 4);
                var3[2] = this.bytes2int(arg1, 8);
                var3[3] = this.bytes2int(arg1, 12);
                var3[4] = this.bytes2int(arg1, 16);
                var3[5] = this.bytes2int(arg1, 20);
                var3[6] = ~var3[4];
                var3[7] = ~var3[5];
                this._keyIs128 = false;
                break;
            case 32:
                var3[0] = this.bytes2int(arg1, 0);
                var3[1] = this.bytes2int(arg1, 4);
                var3[2] = this.bytes2int(arg1, 8);
                var3[3] = this.bytes2int(arg1, 12);
                var3[4] = this.bytes2int(arg1, 16);
                var3[5] = this.bytes2int(arg1, 20);
                var3[6] = this.bytes2int(arg1, 24);
                var3[7] = this.bytes2int(arg1, 28);
                this._keyIs128 = false;
                break;
            default:
                throw new IllegalArgumentException("key sizes are only 16/24/32 bytes.");
        }
        for (int var7 = 0; var7 < 4; var7++) {
            var4[var7] = var3[var7] ^ var3[var7 + 4];
        }
        this.camelliaF2(var4, SIGMA, 0);
        for (int var8 = 0; var8 < 4; var8++) {
            var4[var8] ^= var3[var8];
        }
        this.camelliaF2(var4, SIGMA, 4);
        if (!this._keyIs128) {
            for (int var9 = 0; var9 < 4; var9++) {
                var5[var9] = var4[var9] ^ var3[var9 + 4];
            }
            this.camelliaF2(var5, SIGMA, 8);
            if (arg0) {
                this.kw[0] = var3[0];
                this.kw[1] = var3[1];
                this.kw[2] = var3[2];
                this.kw[3] = var3[3];
                roldqo32(45, var3, 0, this.subkey, 16);
                roldq(15, var3, 0, this.ke, 4);
                roldq(17, var3, 0, this.subkey, 32);
                roldqo32(34, var3, 0, this.subkey, 44);
                roldq(15, var3, 4, this.subkey, 4);
                roldq(15, var3, 4, this.ke, 0);
                roldq(30, var3, 4, this.subkey, 24);
                roldqo32(34, var3, 4, this.subkey, 36);
                roldq(15, var4, 0, this.subkey, 8);
                roldq(30, var4, 0, this.subkey, 20);
                this.ke[8] = var4[1];
                this.ke[9] = var4[2];
                this.ke[10] = var4[3];
                this.ke[11] = var4[0];
                roldqo32(49, var4, 0, this.subkey, 40);
                this.subkey[0] = var5[0];
                this.subkey[1] = var5[1];
                this.subkey[2] = var5[2];
                this.subkey[3] = var5[3];
                roldq(30, var5, 0, this.subkey, 12);
                roldq(30, var5, 0, this.subkey, 28);
                roldqo32(51, var5, 0, this.kw, 4);
            } else {
                this.kw[4] = var3[0];
                this.kw[5] = var3[1];
                this.kw[6] = var3[2];
                this.kw[7] = var3[3];
                decroldqo32(45, var3, 0, this.subkey, 28);
                decroldq(15, var3, 0, this.ke, 4);
                decroldq(17, var3, 0, this.subkey, 12);
                decroldqo32(34, var3, 0, this.subkey, 0);
                decroldq(15, var3, 4, this.subkey, 40);
                decroldq(15, var3, 4, this.ke, 8);
                decroldq(30, var3, 4, this.subkey, 20);
                decroldqo32(34, var3, 4, this.subkey, 8);
                decroldq(15, var4, 0, this.subkey, 36);
                decroldq(30, var4, 0, this.subkey, 24);
                this.ke[2] = var4[1];
                this.ke[3] = var4[2];
                this.ke[0] = var4[3];
                this.ke[1] = var4[0];
                decroldqo32(49, var4, 0, this.subkey, 4);
                this.subkey[46] = var5[0];
                this.subkey[47] = var5[1];
                this.subkey[44] = var5[2];
                this.subkey[45] = var5[3];
                decroldq(30, var5, 0, this.subkey, 32);
                decroldq(30, var5, 0, this.subkey, 16);
                roldqo32(51, var5, 0, this.kw, 0);
            }
        } else if (arg0) {
            this.kw[0] = var3[0];
            this.kw[1] = var3[1];
            this.kw[2] = var3[2];
            this.kw[3] = var3[3];
            roldq(15, var3, 0, this.subkey, 4);
            roldq(30, var3, 0, this.subkey, 12);
            roldq(15, var3, 0, var6, 0);
            this.subkey[18] = var6[2];
            this.subkey[19] = var6[3];
            roldq(17, var3, 0, this.ke, 4);
            roldq(17, var3, 0, this.subkey, 24);
            roldq(17, var3, 0, this.subkey, 32);
            this.subkey[0] = var4[0];
            this.subkey[1] = var4[1];
            this.subkey[2] = var4[2];
            this.subkey[3] = var4[3];
            roldq(15, var4, 0, this.subkey, 8);
            roldq(15, var4, 0, this.ke, 0);
            roldq(15, var4, 0, var6, 0);
            this.subkey[16] = var6[0];
            this.subkey[17] = var6[1];
            roldq(15, var4, 0, this.subkey, 20);
            roldqo32(34, var4, 0, this.subkey, 28);
            roldq(17, var4, 0, this.kw, 4);
        } else {
            this.kw[4] = var3[0];
            this.kw[5] = var3[1];
            this.kw[6] = var3[2];
            this.kw[7] = var3[3];
            decroldq(15, var3, 0, this.subkey, 28);
            decroldq(30, var3, 0, this.subkey, 20);
            decroldq(15, var3, 0, var6, 0);
            this.subkey[16] = var6[0];
            this.subkey[17] = var6[1];
            decroldq(17, var3, 0, this.ke, 0);
            decroldq(17, var3, 0, this.subkey, 8);
            decroldq(17, var3, 0, this.subkey, 0);
            this.subkey[34] = var4[0];
            this.subkey[35] = var4[1];
            this.subkey[32] = var4[2];
            this.subkey[33] = var4[3];
            decroldq(15, var4, 0, this.subkey, 24);
            decroldq(15, var4, 0, this.ke, 4);
            decroldq(15, var4, 0, var6, 0);
            this.subkey[18] = var6[2];
            this.subkey[19] = var6[3];
            decroldq(15, var4, 0, this.subkey, 12);
            decroldqo32(34, var4, 0, this.subkey, 4);
            roldq(17, var4, 0, this.kw, 0);
        }
    }

    public int processBlock128(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        for (int var5 = 0; var5 < 4; var5++) {
            this.state[var5] = this.bytes2int(arg0, var5 * 4 + arg1);
            this.state[var5] ^= this.kw[var5];
        }
        this.camelliaF2(this.state, this.subkey, 0);
        this.camelliaF2(this.state, this.subkey, 4);
        this.camelliaF2(this.state, this.subkey, 8);
        this.camelliaFLs(this.state, this.ke, 0);
        this.camelliaF2(this.state, this.subkey, 12);
        this.camelliaF2(this.state, this.subkey, 16);
        this.camelliaF2(this.state, this.subkey, 20);
        this.camelliaFLs(this.state, this.ke, 4);
        this.camelliaF2(this.state, this.subkey, 24);
        this.camelliaF2(this.state, this.subkey, 28);
        this.camelliaF2(this.state, this.subkey, 32);
        this.state[2] ^= this.kw[4];
        this.state[3] ^= this.kw[5];
        this.state[0] ^= this.kw[6];
        this.state[1] ^= this.kw[7];
        this.int2bytes(this.state[2], arg2, arg3);
        this.int2bytes(this.state[3], arg2, arg3 + 4);
        this.int2bytes(this.state[0], arg2, arg3 + 8);
        this.int2bytes(this.state[1], arg2, arg3 + 12);
        return 16;
    }

    public static void roldq(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        arg3[arg4] = arg1[arg2] << arg0 | arg1[arg2 + 1] >>> 32 - arg0;
        arg3[arg4 + 1] = arg1[arg2 + 1] << arg0 | arg1[arg2 + 2] >>> 32 - arg0;
        arg3[arg4 + 2] = arg1[arg2 + 2] << arg0 | arg1[arg2 + 3] >>> 32 - arg0;
        arg3[arg4 + 3] = arg1[arg2 + 3] << arg0 | arg1[arg2] >>> 32 - arg0;
        arg1[arg2] = arg3[arg4];
        arg1[arg2 + 1] = arg3[arg4 + 1];
        arg1[arg2 + 2] = arg3[arg4 + 2];
        arg1[arg2 + 3] = arg3[arg4 + 3];
    }

    public String getAlgorithmName() {
        return "Camellia";
    }

    public static int leftRotate(int arg0, int arg1) {
        return (arg0 >>> 32 - arg1) + (arg0 << arg1);
    }

    public int getBlockSize() {
        return 16;
    }

    public void reset() {
    }

    public int processBlock192or256(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        for (int var5 = 0; var5 < 4; var5++) {
            this.state[var5] = this.bytes2int(arg0, var5 * 4 + arg1);
            this.state[var5] ^= this.kw[var5];
        }
        this.camelliaF2(this.state, this.subkey, 0);
        this.camelliaF2(this.state, this.subkey, 4);
        this.camelliaF2(this.state, this.subkey, 8);
        this.camelliaFLs(this.state, this.ke, 0);
        this.camelliaF2(this.state, this.subkey, 12);
        this.camelliaF2(this.state, this.subkey, 16);
        this.camelliaF2(this.state, this.subkey, 20);
        this.camelliaFLs(this.state, this.ke, 4);
        this.camelliaF2(this.state, this.subkey, 24);
        this.camelliaF2(this.state, this.subkey, 28);
        this.camelliaF2(this.state, this.subkey, 32);
        this.camelliaFLs(this.state, this.ke, 8);
        this.camelliaF2(this.state, this.subkey, 36);
        this.camelliaF2(this.state, this.subkey, 40);
        this.camelliaF2(this.state, this.subkey, 44);
        this.state[2] ^= this.kw[4];
        this.state[3] ^= this.kw[5];
        this.state[0] ^= this.kw[6];
        this.state[1] ^= this.kw[7];
        this.int2bytes(this.state[2], arg2, arg3);
        this.int2bytes(this.state[3], arg2, arg3 + 4);
        this.int2bytes(this.state[0], arg2, arg3 + 8);
        this.int2bytes(this.state[1], arg2, arg3 + 12);
        return 16;
    }
}
