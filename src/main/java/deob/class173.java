package deob;

@ObfuscatedName("ft")
public class class173 {

    @ObfuscatedName("ft.g")
    public static int[][] field2118 = new int[128][128];

    @ObfuscatedName("ft.x")
    public static int[][] field2116 = new int[128][128];

    @ObfuscatedName("ft.m")
    public static int[] field2122 = new int[4096];

    @ObfuscatedName("ft.q")
    public static int[] field2123 = new int[4096];

    public class173() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bw.a(IILfu;Lfk;I)Z")
    public static final boolean method1158(int arg0, int arg1, class174 arg2, class172 arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        field2118[var6][var7] = 99;
        field2116[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        field2122[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        field2123[var10001] = arg1;
        int[][] var12 = arg3.field2108;
        while (var18 != var11) {
            var4 = field2122[var11];
            var5 = field2123[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field2109;
            int var16 = var5 - arg3.field2112;
            if (arg2.method1104(2, var4, var5, arg3)) {
                Statics.field2120 = var4;
                Statics.field1223 = var5;
                return true;
            }
            int var17 = field2116[var13][var14] + 1;
            if (var13 > 0 && field2118[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x124010E) == 0 && (var12[var15 - 1][var16 + 1] & 0x1240138) == 0) {
                field2122[var18] = var4 - 1;
                field2123[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field2118[var13 - 1][var14] = 2;
                field2116[var13 - 1][var14] = var17;
            }
            if (var13 < 126 && field2118[var13 + 1][var14] == 0 && (var12[var15 + 2][var16] & 0x1240183) == 0 && (var12[var15 + 2][var16 + 1] & 0x12401E0) == 0) {
                field2122[var18] = var4 + 1;
                field2123[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field2118[var13 + 1][var14] = 8;
                field2116[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && field2118[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x124010E) == 0 && (var12[var15 + 1][var16 - 1] & 0x1240183) == 0) {
                field2122[var18] = var4;
                field2123[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2118[var13][var14 - 1] = 1;
                field2116[var13][var14 - 1] = var17;
            }
            if (var14 < 126 && field2118[var13][var14 + 1] == 0 && (var12[var15][var16 + 2] & 0x1240138) == 0 && (var12[var15 + 1][var16 + 2] & 0x12401E0) == 0) {
                field2122[var18] = var4;
                field2123[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2118[var13][var14 + 1] = 4;
                field2116[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && field2118[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16] & 0x124013E) == 0 && (var12[var15 - 1][var16 - 1] & 0x124010E) == 0 && (var12[var15][var16 - 1] & 0x124018F) == 0) {
                field2122[var18] = var4 - 1;
                field2123[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2118[var13 - 1][var14 - 1] = 3;
                field2116[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 126 && var14 > 0 && field2118[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x124018F) == 0 && (var12[var15 + 2][var16 - 1] & 0x1240183) == 0 && (var12[var15 + 2][var16] & 0x12401E3) == 0) {
                field2122[var18] = var4 + 1;
                field2123[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2118[var13 + 1][var14 - 1] = 9;
                field2116[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 126 && field2118[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x124013E) == 0 && (var12[var15 - 1][var16 + 2] & 0x1240138) == 0 && (var12[var15][var16 + 2] & 0x12401F8) == 0) {
                field2122[var18] = var4 - 1;
                field2123[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2118[var13 - 1][var14 + 1] = 6;
                field2116[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 126 && var14 < 126 && field2118[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 2] & 0x12401F8) == 0 && (var12[var15 + 2][var16 + 2] & 0x12401E0) == 0 && (var12[var15 + 2][var16 + 1] & 0x12401E3) == 0) {
                field2122[var18] = var4 + 1;
                field2123[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2118[var13 + 1][var14 + 1] = 12;
                field2116[var13 + 1][var14 + 1] = var17;
            }
        }
        Statics.field2120 = var4;
        Statics.field1223 = var5;
        return false;
    }
}
