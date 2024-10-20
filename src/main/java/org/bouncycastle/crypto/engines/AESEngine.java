package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

public class AESEngine implements BlockCipher {

    public static final byte[] S = new byte[] { 99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, -128, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, 127, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22 };

    public static final byte[] Si = new byte[] { 82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, 61, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, -68, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, 18, 16, 89, 39, -128, -20, 95, 96, 81, 127, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125 };

    public static final int[] rcon = new int[] { 1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, 179, 125, 250, 239, 197, 145 };

    public static final int[] T0 = new int[] { -1520213050, -2072216328, -1720223762, -1921287178, 234025727, -1117033514, -1318096930, 1422247313, 1345335392, 50397442, -1452841010, 2099981142, 436141799, 1658312629, -424957107, -1703512340, 1170918031, -1652391393, 1086966153, -2021818886, 368769775, -346465870, -918075506, 200339707, -324162239, 1742001331, -39673249, -357585083, -1080255453, -140204973, -1770884380, 1539358875, -1028147339, 486407649, -1366060227, 1780885068, 1513502316, 1094664062, 49805301, 1338821763, 1546925160, -190470831, 887481809, 150073849, -1821281822, 1943591083, 1395732834, 1058346282, 201589768, 1388824469, 1696801606, 1589887901, 672667696, -1583966665, 251987210, -1248159185, 151455502, 907153956, -1686077413, 1038279391, 652995533, 1764173646, -843926913, -1619692054, 453576978, -1635548387, 1949051992, 773462580, 756751158, -1301385508, -296068428, -73359269, -162377052, 1295727478, 1641469623, -827083907, 2066295122, 1055122397, 1898917726, -1752923117, -179088474, 1758581177, 0, 753790401, 1612718144, 536673507, -927878791, -312779850, -1100322092, 1187761037, -641810841, 1262041458, -565556588, -733197160, -396863312, 1255133061, 1808847035, 720367557, -441800113, 385612781, -985447546, -682799718, 1429418854, -1803188975, -817543798, 284817897, 100794884, -2122350594, -263171936, 1144798328, -1163944155, -475486133, -212774494, -22830243, -1069531008, -1970303227, -1382903233, -1130521311, 1211644016, 83228145, -541279133, -1044990345, 1977277103, 1663115586, 806359072, 452984805, 250868733, 1842533055, 1288555905, 336333848, 890442534, 804056259, -513843266, -1567123659, -867941240, 957814574, 1472513171, -223893675, -2105639172, 1195195770, -1402706744, -413311558, 723065138, -1787595802, -1604296512, -1736343271, -783331426, 2145180835, 1713513028, 2116692564, -1416589253, -2088204277, -901364084, 703524551, -742868885, 1007948840, 2044649127, -497131844, 487262998, 1994120109, 1004593371, 1446130276, 1312438900, 503974420, -615954030, 168166924, 1814307912, -463709000, 1573044895, 1859376061, -273896381, -1503501628, -1466855111, -1533700815, 937747667, -1954973198, 854058965, 1137232011, 1496790894, -1217565222, -1936880383, 1691735473, -766620004, -525751991, -1267962664, -95005012, 133494003, 636152527, -1352309302, -1904575756, -374428089, 403179536, -709182865, -2005370640, 1864705354, 1915629148, 605822008, -240736681, -944458637, 1371981463, 602466507, 2094914977, -1670089496, 555687742, -582268010, -591544991, -2037675251, -2054518257, -1871679264, 1111375484, -994724495, -1436129588, -666351472, 84083462, 32962295, 302911004, -1553899070, 1597322602, -111716434, -793134743, -1853454825, 1489093017, 656219450, -1180787161, 954327513, 335083755, -1281845205, 856756514, -1150719534, 1893325225, -1987146233, -1483434957, -1231316179, 572399164, -1836611819, 552200649, 1238290055, -11184726, 2015897680, 2061492133, -1886614525, -123625127, -2138470135, 386731290, -624967835, 837215959, -968736124, -1201116976, -1019133566, -1332111063, 1999449434, 286199582, -877612933, -61582168, -692339859, 974525996 };

    public static final int[] Tinv0 = new int[] { 1353184337, 1399144830, -1012656358, -1772214470, -882136261, -247096033, -1420232020, -1828461749, 1442459680, -160598355, -1854485368, 625738485, -52959921, -674551099, -2143013594, -1885117771, 1230680542, 1729870373, -1743852987, -507445667, 41234371, 317738113, -1550367091, -956705941, -413167869, -1784901099, -344298049, -631680363, 763608788, -752782248, 694804553, 1154009486, 1787413109, 2021232372, 1799248025, -579749593, -1236278850, 397248752, 1722556617, -1271214467, 407560035, -2110711067, 1613975959, 1165972322, -529046351, -2068943941, 480281086, -1809118983, 1483229296, 436028815, -2022908268, -1208452270, 601060267, -503166094, 1468997603, 715871590, 120122290, 63092015, -1703164538, -1526188077, -226023376, -1297760477, -1167457534, 1552029421, 723308426, -1833666137, -252573709, -1578997426, -839591323, -708967162, 526529745, -1963022652, -1655493068, -1604979806, 853641733, 1978398372, 971801355, -1427152832, 111112542, 1360031421, -108388034, 1023860118, -1375387939, 1186850381, -1249028975, 90031217, 1876166148, -15380384, 620468249, -1746289194, -868007799, 2006899047, -1119688528, -2004121337, 945494503, -605108103, 1191869601, -384875908, -920746760, 0, -2088337399, 1223502642, -1401941730, 1316117100, -67170563, 1446544655, 517320253, 658058550, 1691946762, 564550760, -783000677, 976107044, -1318647284, 266819475, -761860428, -1634624741, 1338359936, -1574904735, 1766553434, 370807324, 179999714, -450191168, 1138762300, 488053522, 185403662, -1379431438, -1180125651, -928440812, -2061897385, 1275557295, -1143105042, -44007517, -1624899081, -1124765092, -985962940, 880737115, 1982415755, -590994485, 1761406390, 1676797112, -891538985, 277177154, 1076008723, 538035844, 2099530373, -130171950, 288553390, 1839278535, 1261411869, -214912292, -330136051, -790380169, 1813426987, -1715900247, -95906799, 577038663, -997393240, 440397984, -668172970, -275762398, -951170681, -1043253031, -22885748, 906744984, -813566554, 685669029, 646887386, -1530942145, -459458004, 227702864, -1681105046, 1648787028, -1038905866, -390539120, 1593260334, -173030526, -1098883681, 2090061929, -1456614033, -1290656305, 999926984, -1484974064, 1852021992, 2075868123, 158869197, -199730834, 28809964, -1466282109, 1701746150, 2129067946, 147831841, -420997649, -644094022, -835293366, -737566742, -696471511, -1347247055, 824393514, 815048134, -1067015627, 935087732, -1496677636, -1328508704, 366520115, 1251476721, -136647615, 240176511, 804688151, -1915335306, 1303441219, 1414376140, -553347356, -474623586, 461924940, -1205916479, 2136040774, 82468509, 1563790337, 1937016826, 776014843, 1511876531, 1389550482, 861278441, 323475053, -1939744870, 2047648055, -1911228327, -1992551445, -299390514, 902390199, -303751967, 1018251130, 1507840668, 1064563285, 2043548696, -1086863501, -355600557, 1537932639, 342834655, -2032450440, -2114736182, 1053059257, 741614648, 1598071746, 1925389590, 203809468, -1958134744, 1100287487, 1895934009, -558691320, -1662733096, -1866377628, 1636092795, 1890988757, 1952214088, 1113045200 };

    public int[][] WorkingKey = (int[][]) null;

    public static final int BLOCK_SIZE = 16;

    public int C0;

    public int C1;

    public int C2;

    public int C3;

    public int ROUNDS;

    public static final int m1 = -2139062144;

    public static final int m2 = 2139062143;

    public static final int m3 = 27;

    public static final int m4 = -1061109568;

    public static final int m5 = 1061109567;

    public boolean forEncryption;

    public byte[] s;

    public void encryptBlock(int[][] arg0) {
        int var2 = this.C0 ^ arg0[0][0];
        int var3 = this.C1 ^ arg0[0][1];
        int var4 = this.C2 ^ arg0[0][2];
        int var5 = 1;
        int var6 = this.C3 ^ arg0[0][3];
        while (var5 < this.ROUNDS - 1) {
            int var7 = T0[var2 & 0xFF] ^ shift(T0[var3 >> 8 & 0xFF], 24) ^ shift(T0[var4 >> 16 & 0xFF], 16) ^ shift(T0[var6 >> 24 & 0xFF], 8) ^ arg0[var5][0];
            int var8 = T0[var3 & 0xFF] ^ shift(T0[var4 >> 8 & 0xFF], 24) ^ shift(T0[var6 >> 16 & 0xFF], 16) ^ shift(T0[var2 >> 24 & 0xFF], 8) ^ arg0[var5][1];
            int var9 = T0[var4 & 0xFF] ^ shift(T0[var6 >> 8 & 0xFF], 24) ^ shift(T0[var2 >> 16 & 0xFF], 16) ^ shift(T0[var3 >> 24 & 0xFF], 8) ^ arg0[var5][2];
            int var10 = T0[var6 & 0xFF] ^ shift(T0[var2 >> 8 & 0xFF], 24) ^ shift(T0[var3 >> 16 & 0xFF], 16) ^ shift(T0[var4 >> 24 & 0xFF], 8) ^ arg0[var5++][3];
            var2 = T0[var7 & 0xFF] ^ shift(T0[var8 >> 8 & 0xFF], 24) ^ shift(T0[var9 >> 16 & 0xFF], 16) ^ shift(T0[var10 >> 24 & 0xFF], 8) ^ arg0[var5][0];
            var3 = T0[var8 & 0xFF] ^ shift(T0[var9 >> 8 & 0xFF], 24) ^ shift(T0[var10 >> 16 & 0xFF], 16) ^ shift(T0[var7 >> 24 & 0xFF], 8) ^ arg0[var5][1];
            var4 = T0[var9 & 0xFF] ^ shift(T0[var10 >> 8 & 0xFF], 24) ^ shift(T0[var7 >> 16 & 0xFF], 16) ^ shift(T0[var8 >> 24 & 0xFF], 8) ^ arg0[var5][2];
            var6 = T0[var10 & 0xFF] ^ shift(T0[var7 >> 8 & 0xFF], 24) ^ shift(T0[var8 >> 16 & 0xFF], 16) ^ shift(T0[var9 >> 24 & 0xFF], 8) ^ arg0[var5++][3];
        }
        int var11 = T0[var2 & 0xFF] ^ shift(T0[var3 >> 8 & 0xFF], 24) ^ shift(T0[var4 >> 16 & 0xFF], 16) ^ shift(T0[var6 >> 24 & 0xFF], 8) ^ arg0[var5][0];
        int var12 = T0[var3 & 0xFF] ^ shift(T0[var4 >> 8 & 0xFF], 24) ^ shift(T0[var6 >> 16 & 0xFF], 16) ^ shift(T0[var2 >> 24 & 0xFF], 8) ^ arg0[var5][1];
        int var13 = T0[var4 & 0xFF] ^ shift(T0[var6 >> 8 & 0xFF], 24) ^ shift(T0[var2 >> 16 & 0xFF], 16) ^ shift(T0[var3 >> 24 & 0xFF], 8) ^ arg0[var5][2];
        int var14 = T0[var6 & 0xFF] ^ shift(T0[var2 >> 8 & 0xFF], 24) ^ shift(T0[var3 >> 16 & 0xFF], 16) ^ shift(T0[var4 >> 24 & 0xFF], 8) ^ arg0[var5++][3];
        this.C0 = S[var11 & 0xFF] & 0xFF ^ (S[var12 >> 8 & 0xFF] & 0xFF) << 8 ^ (this.s[var13 >> 16 & 0xFF] & 0xFF) << 16 ^ this.s[var14 >> 24 & 0xFF] << 24 ^ arg0[var5][0];
        this.C1 = this.s[var12 & 0xFF] & 0xFF ^ (S[var13 >> 8 & 0xFF] & 0xFF) << 8 ^ (S[var14 >> 16 & 0xFF] & 0xFF) << 16 ^ this.s[var11 >> 24 & 0xFF] << 24 ^ arg0[var5][1];
        this.C2 = this.s[var13 & 0xFF] & 0xFF ^ (S[var14 >> 8 & 0xFF] & 0xFF) << 8 ^ (S[var11 >> 16 & 0xFF] & 0xFF) << 16 ^ S[var12 >> 24 & 0xFF] << 24 ^ arg0[var5][2];
        this.C3 = this.s[var14 & 0xFF] & 0xFF ^ (this.s[var11 >> 8 & 0xFF] & 0xFF) << 8 ^ (this.s[var12 >> 16 & 0xFF] & 0xFF) << 16 ^ S[var13 >> 24 & 0xFF] << 24 ^ arg0[var5][3];
    }

    public static int FFmulX(int arg0) {
        return (arg0 & 0x7F7F7F7F) << 1 ^ ((arg0 & 0x80808080) >>> 7) * 27;
    }

    public static int inv_mcol(int arg0) {
        int var2 = arg0 ^ shift(arg0, 8);
        int var3 = arg0 ^ FFmulX(var2);
        int var4 = var2 ^ FFmulX2(var3);
        return var3 ^ var4 ^ shift(var4, 16);
    }

    public static int subWord(int arg0) {
        return S[arg0 & 0xFF] & 0xFF | (S[arg0 >> 8 & 0xFF] & 0xFF) << 8 | (S[arg0 >> 16 & 0xFF] & 0xFF) << 16 | S[arg0 >> 24 & 0xFF] << 24;
    }

    public static int FFmulX2(int arg0) {
        int var1 = (arg0 & 0x3F3F3F3F) << 2;
        int var2 = arg0 & 0xC0C0C0C0;
        int var3 = var2 ^ var2 >>> 1;
        return var1 ^ var3 >>> 2 ^ var3 >>> 5;
    }

    public void init(boolean arg0, CipherParameters arg1) {
        if (!arg1 instanceof KeyParameter) {
            throw new IllegalArgumentException("invalid parameter passed to AES init - " + arg1.getClass().getName());
        }
        this.WorkingKey = this.generateWorkingKey(((KeyParameter) arg1).getKey(), arg0);
        this.forEncryption = arg0;
        if (arg0) {
            this.s = Arrays.clone(S);
        } else {
            this.s = Arrays.clone(Si);
        }
    }

    public String getAlgorithmName() {
        return "AES";
    }

    public int getBlockSize() {
        return 16;
    }

    public int processBlock(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (this.WorkingKey == null) {
            throw new IllegalStateException("AES engine not initialised");
        } else if (arg1 + 16 > arg0.length) {
            throw new DataLengthException("input buffer too short");
        } else if (arg3 + 16 > arg2.length) {
            throw new OutputLengthException("output buffer too short");
        } else {
            if (this.forEncryption) {
                this.unpackBlock(arg0, arg1);
                this.encryptBlock(this.WorkingKey);
                this.packBlock(arg2, arg3);
            } else {
                this.unpackBlock(arg0, arg1);
                this.decryptBlock(this.WorkingKey);
                this.packBlock(arg2, arg3);
            }
            return 16;
        }
    }

    public void reset() {
    }

    public void unpackBlock(byte[] arg0, int arg1) {
        int var3 = arg1 + 1;
        this.C0 = arg0[arg1] & 0xFF;
        int var10003 = var3;
        int var4 = var3 + 1;
        this.C0 |= (arg0[var10003] & 0xFF) << 8;
        int var21 = var4;
        int var5 = var4 + 1;
        this.C0 |= (arg0[var21] & 0xFF) << 16;
        int var22 = var5;
        int var6 = var5 + 1;
        this.C0 |= arg0[var22] << 24;
        int var10002 = var6;
        int var7 = var6 + 1;
        this.C1 = arg0[var10002] & 0xFF;
        int var23 = var7;
        int var8 = var7 + 1;
        this.C1 |= (arg0[var23] & 0xFF) << 8;
        int var24 = var8;
        int var9 = var8 + 1;
        this.C1 |= (arg0[var24] & 0xFF) << 16;
        int var25 = var9;
        int var10 = var9 + 1;
        this.C1 |= arg0[var25] << 24;
        int var19 = var10;
        int var11 = var10 + 1;
        this.C2 = arg0[var19] & 0xFF;
        int var26 = var11;
        int var12 = var11 + 1;
        this.C2 |= (arg0[var26] & 0xFF) << 8;
        int var27 = var12;
        int var13 = var12 + 1;
        this.C2 |= (arg0[var27] & 0xFF) << 16;
        int var28 = var13;
        int var14 = var13 + 1;
        this.C2 |= arg0[var28] << 24;
        int var20 = var14;
        int var15 = var14 + 1;
        this.C3 = arg0[var20] & 0xFF;
        int var29 = var15;
        int var16 = var15 + 1;
        this.C3 |= (arg0[var29] & 0xFF) << 8;
        int var30 = var16;
        int var17 = var16 + 1;
        this.C3 |= (arg0[var30] & 0xFF) << 16;
        int var31 = var17;
        int var18 = var17 + 1;
        this.C3 |= arg0[var31] << 24;
    }

    public void packBlock(byte[] arg0, int arg1) {
        int var3 = arg1 + 1;
        arg0[arg1] = (byte) this.C0;
        int var10001 = var3;
        int var4 = var3 + 1;
        arg0[var10001] = (byte) (this.C0 >> 8);
        int var19 = var4;
        int var5 = var4 + 1;
        arg0[var19] = (byte) (this.C0 >> 16);
        int var20 = var5;
        int var6 = var5 + 1;
        arg0[var20] = (byte) (this.C0 >> 24);
        int var21 = var6;
        int var7 = var6 + 1;
        arg0[var21] = (byte) this.C1;
        int var22 = var7;
        int var8 = var7 + 1;
        arg0[var22] = (byte) (this.C1 >> 8);
        int var23 = var8;
        int var9 = var8 + 1;
        arg0[var23] = (byte) (this.C1 >> 16);
        int var24 = var9;
        int var10 = var9 + 1;
        arg0[var24] = (byte) (this.C1 >> 24);
        int var25 = var10;
        int var11 = var10 + 1;
        arg0[var25] = (byte) this.C2;
        int var26 = var11;
        int var12 = var11 + 1;
        arg0[var26] = (byte) (this.C2 >> 8);
        int var27 = var12;
        int var13 = var12 + 1;
        arg0[var27] = (byte) (this.C2 >> 16);
        int var28 = var13;
        int var14 = var13 + 1;
        arg0[var28] = (byte) (this.C2 >> 24);
        int var29 = var14;
        int var15 = var14 + 1;
        arg0[var29] = (byte) this.C3;
        int var30 = var15;
        int var16 = var15 + 1;
        arg0[var30] = (byte) (this.C3 >> 8);
        int var31 = var16;
        int var17 = var16 + 1;
        arg0[var31] = (byte) (this.C3 >> 16);
        int var32 = var17;
        int var18 = var17 + 1;
        arg0[var32] = (byte) (this.C3 >> 24);
    }

    public static int shift(int arg0, int arg1) {
        return arg0 >>> arg1 | arg0 << -arg1;
    }

    public void decryptBlock(int[][] arg0) {
        int var2 = this.C0 ^ arg0[this.ROUNDS][0];
        int var3 = this.C1 ^ arg0[this.ROUNDS][1];
        int var4 = this.C2 ^ arg0[this.ROUNDS][2];
        int var5 = this.ROUNDS - 1;
        int var6 = this.C3 ^ arg0[this.ROUNDS][3];
        while (var5 > 1) {
            int var7 = Tinv0[var2 & 0xFF] ^ shift(Tinv0[var6 >> 8 & 0xFF], 24) ^ shift(Tinv0[var4 >> 16 & 0xFF], 16) ^ shift(Tinv0[var3 >> 24 & 0xFF], 8) ^ arg0[var5][0];
            int var8 = Tinv0[var3 & 0xFF] ^ shift(Tinv0[var2 >> 8 & 0xFF], 24) ^ shift(Tinv0[var6 >> 16 & 0xFF], 16) ^ shift(Tinv0[var4 >> 24 & 0xFF], 8) ^ arg0[var5][1];
            int var9 = Tinv0[var4 & 0xFF] ^ shift(Tinv0[var3 >> 8 & 0xFF], 24) ^ shift(Tinv0[var2 >> 16 & 0xFF], 16) ^ shift(Tinv0[var6 >> 24 & 0xFF], 8) ^ arg0[var5][2];
            int var10 = Tinv0[var6 & 0xFF] ^ shift(Tinv0[var4 >> 8 & 0xFF], 24) ^ shift(Tinv0[var3 >> 16 & 0xFF], 16) ^ shift(Tinv0[var2 >> 24 & 0xFF], 8) ^ arg0[var5--][3];
            var2 = Tinv0[var7 & 0xFF] ^ shift(Tinv0[var10 >> 8 & 0xFF], 24) ^ shift(Tinv0[var9 >> 16 & 0xFF], 16) ^ shift(Tinv0[var8 >> 24 & 0xFF], 8) ^ arg0[var5][0];
            var3 = Tinv0[var8 & 0xFF] ^ shift(Tinv0[var7 >> 8 & 0xFF], 24) ^ shift(Tinv0[var10 >> 16 & 0xFF], 16) ^ shift(Tinv0[var9 >> 24 & 0xFF], 8) ^ arg0[var5][1];
            var4 = Tinv0[var9 & 0xFF] ^ shift(Tinv0[var8 >> 8 & 0xFF], 24) ^ shift(Tinv0[var7 >> 16 & 0xFF], 16) ^ shift(Tinv0[var10 >> 24 & 0xFF], 8) ^ arg0[var5][2];
            var6 = Tinv0[var10 & 0xFF] ^ shift(Tinv0[var9 >> 8 & 0xFF], 24) ^ shift(Tinv0[var8 >> 16 & 0xFF], 16) ^ shift(Tinv0[var7 >> 24 & 0xFF], 8) ^ arg0[var5--][3];
        }
        int var11 = Tinv0[var2 & 0xFF] ^ shift(Tinv0[var6 >> 8 & 0xFF], 24) ^ shift(Tinv0[var4 >> 16 & 0xFF], 16) ^ shift(Tinv0[var3 >> 24 & 0xFF], 8) ^ arg0[var5][0];
        int var12 = Tinv0[var3 & 0xFF] ^ shift(Tinv0[var2 >> 8 & 0xFF], 24) ^ shift(Tinv0[var6 >> 16 & 0xFF], 16) ^ shift(Tinv0[var4 >> 24 & 0xFF], 8) ^ arg0[var5][1];
        int var13 = Tinv0[var4 & 0xFF] ^ shift(Tinv0[var3 >> 8 & 0xFF], 24) ^ shift(Tinv0[var2 >> 16 & 0xFF], 16) ^ shift(Tinv0[var6 >> 24 & 0xFF], 8) ^ arg0[var5][2];
        int var14 = Tinv0[var6 & 0xFF] ^ shift(Tinv0[var4 >> 8 & 0xFF], 24) ^ shift(Tinv0[var3 >> 16 & 0xFF], 16) ^ shift(Tinv0[var2 >> 24 & 0xFF], 8) ^ arg0[var5][3];
        this.C0 = Si[var11 & 0xFF] & 0xFF ^ (this.s[var14 >> 8 & 0xFF] & 0xFF) << 8 ^ (this.s[var13 >> 16 & 0xFF] & 0xFF) << 16 ^ Si[var12 >> 24 & 0xFF] << 24 ^ arg0[0][0];
        this.C1 = this.s[var12 & 0xFF] & 0xFF ^ (this.s[var11 >> 8 & 0xFF] & 0xFF) << 8 ^ (Si[var14 >> 16 & 0xFF] & 0xFF) << 16 ^ this.s[var13 >> 24 & 0xFF] << 24 ^ arg0[0][1];
        this.C2 = this.s[var13 & 0xFF] & 0xFF ^ (Si[var12 >> 8 & 0xFF] & 0xFF) << 8 ^ (Si[var11 >> 16 & 0xFF] & 0xFF) << 16 ^ this.s[var14 >> 24 & 0xFF] << 24 ^ arg0[0][2];
        this.C3 = Si[var14 & 0xFF] & 0xFF ^ (this.s[var13 >> 8 & 0xFF] & 0xFF) << 8 ^ (this.s[var12 >> 16 & 0xFF] & 0xFF) << 16 ^ this.s[var11 >> 24 & 0xFF] << 24 ^ arg0[0][3];
    }

    public int[][] generateWorkingKey(byte[] arg0, boolean arg1) {
        int var3 = arg0.length;
        if (var3 < 16 || var3 > 32 || (var3 & 0x7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int[][] var5;
        int var4 = var3 >>> 2;
        this.ROUNDS = var4 + 6;
        var5 = new int[this.ROUNDS + 1][4];
        label60: switch(var4) {
            case 4:
                int var53 = Pack.littleEndianToInt(arg0, 0);
                var5[0][0] = var53;
                int var54 = Pack.littleEndianToInt(arg0, 4);
                var5[0][1] = var54;
                int var55 = Pack.littleEndianToInt(arg0, 8);
                var5[0][2] = var55;
                int var56 = Pack.littleEndianToInt(arg0, 12);
                var5[0][3] = var56;
                int var57 = 1;
                while (true) {
                    if (var57 > 10) {
                        break label60;
                    }
                    int var58 = subWord(shift(var56, 8)) ^ rcon[var57 - 1];
                    var53 ^= var58;
                    var5[var57][0] = var53;
                    var54 ^= var53;
                    var5[var57][1] = var54;
                    var55 ^= var54;
                    var5[var57][2] = var55;
                    var56 ^= var55;
                    var5[var57][3] = var56;
                    var57++;
                }
            case 5:
            case 7:
            default:
                throw new IllegalStateException("Should never get here");
            case 6:
                int var23 = Pack.littleEndianToInt(arg0, 0);
                var5[0][0] = var23;
                int var24 = Pack.littleEndianToInt(arg0, 4);
                var5[0][1] = var24;
                int var25 = Pack.littleEndianToInt(arg0, 8);
                var5[0][2] = var25;
                int var26 = Pack.littleEndianToInt(arg0, 12);
                var5[0][3] = var26;
                int var27 = Pack.littleEndianToInt(arg0, 16);
                var5[1][0] = var27;
                int var28 = Pack.littleEndianToInt(arg0, 20);
                var5[1][1] = var28;
                byte var29 = 1;
                int var30 = subWord(shift(var28, 8)) ^ var29;
                int var31 = var29 << 1;
                int var32 = var23 ^ var30;
                var5[1][2] = var32;
                int var33 = var24 ^ var32;
                var5[1][3] = var33;
                int var34 = var25 ^ var33;
                var5[2][0] = var34;
                int var35 = var26 ^ var34;
                var5[2][1] = var35;
                int var36 = var27 ^ var35;
                var5[2][2] = var36;
                int var37 = var28 ^ var36;
                var5[2][3] = var37;
                for (int var38 = 3; var38 < 12; var38 += 3) {
                    int var39 = subWord(shift(var37, 8)) ^ var31;
                    int var40 = var31 << 1;
                    int var41 = var32 ^ var39;
                    var5[var38][0] = var41;
                    int var42 = var33 ^ var41;
                    var5[var38][1] = var42;
                    int var43 = var34 ^ var42;
                    var5[var38][2] = var43;
                    int var44 = var35 ^ var43;
                    var5[var38][3] = var44;
                    int var45 = var36 ^ var44;
                    var5[var38 + 1][0] = var45;
                    int var46 = var37 ^ var45;
                    var5[var38 + 1][1] = var46;
                    int var47 = subWord(shift(var46, 8)) ^ var40;
                    var31 = var40 << 1;
                    var32 = var41 ^ var47;
                    var5[var38 + 1][2] = var32;
                    var33 = var42 ^ var32;
                    var5[var38 + 1][3] = var33;
                    var34 = var43 ^ var33;
                    var5[var38 + 2][0] = var34;
                    var35 = var44 ^ var34;
                    var5[var38 + 2][1] = var35;
                    var36 = var45 ^ var35;
                    var5[var38 + 2][2] = var36;
                    var37 = var46 ^ var36;
                    var5[var38 + 2][3] = var37;
                }
                int var48 = subWord(shift(var37, 8)) ^ var31;
                int var49 = var32 ^ var48;
                var5[12][0] = var49;
                int var50 = var33 ^ var49;
                var5[12][1] = var50;
                int var51 = var34 ^ var50;
                var5[12][2] = var51;
                int var52 = var35 ^ var51;
                var5[12][3] = var52;
                break;
            case 8:
                int var6 = Pack.littleEndianToInt(arg0, 0);
                var5[0][0] = var6;
                int var7 = Pack.littleEndianToInt(arg0, 4);
                var5[0][1] = var7;
                int var8 = Pack.littleEndianToInt(arg0, 8);
                var5[0][2] = var8;
                int var9 = Pack.littleEndianToInt(arg0, 12);
                var5[0][3] = var9;
                int var10 = Pack.littleEndianToInt(arg0, 16);
                var5[1][0] = var10;
                int var11 = Pack.littleEndianToInt(arg0, 20);
                var5[1][1] = var11;
                int var12 = Pack.littleEndianToInt(arg0, 24);
                var5[1][2] = var12;
                int var13 = Pack.littleEndianToInt(arg0, 28);
                var5[1][3] = var13;
                int var14 = 1;
                for (int var15 = 2; var15 < 14; var15 += 2) {
                    int var16 = subWord(shift(var13, 8)) ^ var14;
                    var14 <<= 0x1;
                    var6 ^= var16;
                    var5[var15][0] = var6;
                    var7 ^= var6;
                    var5[var15][1] = var7;
                    var8 ^= var7;
                    var5[var15][2] = var8;
                    var9 ^= var8;
                    var5[var15][3] = var9;
                    int var17 = subWord(var9);
                    var10 ^= var17;
                    var5[var15 + 1][0] = var10;
                    var11 ^= var10;
                    var5[var15 + 1][1] = var11;
                    var12 ^= var11;
                    var5[var15 + 1][2] = var12;
                    var13 ^= var12;
                    var5[var15 + 1][3] = var13;
                }
                int var18 = subWord(shift(var13, 8)) ^ var14;
                int var19 = var6 ^ var18;
                var5[14][0] = var19;
                int var20 = var7 ^ var19;
                var5[14][1] = var20;
                int var21 = var8 ^ var20;
                var5[14][2] = var21;
                int var22 = var9 ^ var21;
                var5[14][3] = var22;
        }
        if (!arg1) {
            for (int var59 = 1; var59 < this.ROUNDS; var59++) {
                for (int var60 = 0; var60 < 4; var60++) {
                    var5[var59][var60] = inv_mcol(var5[var59][var60]);
                }
            }
        }
        return var5;
    }
}
