package deob;

@ObfuscatedName("gc")
public class class195 {

    @ObfuscatedName("gc.l")
    public static int[][] field2258 = new int[128][128];

    @ObfuscatedName("gc.k")
    public static int[][] field2259 = new int[128][128];

    @ObfuscatedName("gc.s")
    public static int[] field2261 = new int[4096];

    @ObfuscatedName("gc.r")
    public static int[] field2262 = new int[4096];

    public class195() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iw.o(IILgw;Lgh;S)Z")
    public static final boolean method4469(int arg0, int arg1, class193 arg2, class192 arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        field2258[var6][var7] = 99;
        field2259[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        field2261[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        field2262[var10001] = arg1;
        int[][] var12 = arg3.field2230;
        while (var18 != var11) {
            var4 = field2261[var11];
            var5 = field2262[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field2237;
            int var16 = var5 - arg3.field2238;
            if (arg2.method1037(1, var4, var5, arg3)) {
                Statics.field3349 = var4;
                Statics.field2256 = var5;
                return true;
            }
            int var17 = field2259[var13][var14] + 1;
            if (var13 > 0 && field2258[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0) {
                field2261[var18] = var4 - 1;
                field2262[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field2258[var13 - 1][var14] = 2;
                field2259[var13 - 1][var14] = var17;
            }
            if (var13 < 127 && field2258[var13 + 1][var14] == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0) {
                field2261[var18] = var4 + 1;
                field2262[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field2258[var13 + 1][var14] = 8;
                field2259[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && field2258[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                field2261[var18] = var4;
                field2262[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2258[var13][var14 - 1] = 1;
                field2259[var13][var14 - 1] = var17;
            }
            if (var14 < 127 && field2258[var13][var14 + 1] == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                field2261[var18] = var4;
                field2262[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2258[var13][var14 + 1] = 4;
                field2259[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && field2258[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16 - 1] & 0x124010E) == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                field2261[var18] = var4 - 1;
                field2262[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2258[var13 - 1][var14 - 1] = 3;
                field2259[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 127 && var14 > 0 && field2258[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x1240183) == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                field2261[var18] = var4 + 1;
                field2262[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2258[var13 + 1][var14 - 1] = 9;
                field2259[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 127 && field2258[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x1240138) == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                field2261[var18] = var4 - 1;
                field2262[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2258[var13 - 1][var14 + 1] = 6;
                field2259[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 127 && var14 < 127 && field2258[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 1] & 0x12401E0) == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                field2261[var18] = var4 + 1;
                field2262[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2258[var13 + 1][var14 + 1] = 12;
                field2259[var13 + 1][var14 + 1] = var17;
            }
        }
        Statics.field3349 = var4;
        Statics.field2256 = var5;
        return false;
    }
}
