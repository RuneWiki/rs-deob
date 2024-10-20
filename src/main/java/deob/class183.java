package deob;

@ObfuscatedName("gc")
public class class183 {

    @ObfuscatedName("gc.x")
    public static int[][] field2112 = new int[128][128];

    @ObfuscatedName("gc.w")
    public static int[][] field2115 = new int[128][128];

    @ObfuscatedName("gc.p")
    public static int[] field2119 = new int[4096];

    @ObfuscatedName("gc.l")
    public static int[] field2120 = new int[4096];

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hb.h(IILgz;Lfo;S)Z")
    public static final boolean method3799(int arg0, int arg1, class184 arg2, class182 arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        field2112[var6][var7] = 99;
        field2115[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        field2119[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        field2120[var10001] = arg1;
        int[][] var12 = arg3.field2108;
        while (var18 != var11) {
            var4 = field2119[var11];
            var5 = field2120[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field2104;
            int var16 = var5 - arg3.field2105;
            if (arg2.method1177(2, var4, var5, arg3)) {
                Statics.field2116 = var4;
                Statics.field2122 = var5;
                return true;
            }
            int var17 = field2115[var13][var14] + 1;
            if (var13 > 0 && field2112[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x124010E) == 0 && (var12[var15 - 1][var16 + 1] & 0x1240138) == 0) {
                field2119[var18] = var4 - 1;
                field2120[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field2112[var13 - 1][var14] = 2;
                field2115[var13 - 1][var14] = var17;
            }
            if (var13 < 126 && field2112[var13 + 1][var14] == 0 && (var12[var15 + 2][var16] & 0x1240183) == 0 && (var12[var15 + 2][var16 + 1] & 0x12401E0) == 0) {
                field2119[var18] = var4 + 1;
                field2120[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field2112[var13 + 1][var14] = 8;
                field2115[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && field2112[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x124010E) == 0 && (var12[var15 + 1][var16 - 1] & 0x1240183) == 0) {
                field2119[var18] = var4;
                field2120[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2112[var13][var14 - 1] = 1;
                field2115[var13][var14 - 1] = var17;
            }
            if (var14 < 126 && field2112[var13][var14 + 1] == 0 && (var12[var15][var16 + 2] & 0x1240138) == 0 && (var12[var15 + 1][var16 + 2] & 0x12401E0) == 0) {
                field2119[var18] = var4;
                field2120[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2112[var13][var14 + 1] = 4;
                field2115[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && field2112[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16] & 0x124013E) == 0 && (var12[var15 - 1][var16 - 1] & 0x124010E) == 0 && (var12[var15][var16 - 1] & 0x124018F) == 0) {
                field2119[var18] = var4 - 1;
                field2120[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2112[var13 - 1][var14 - 1] = 3;
                field2115[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 126 && var14 > 0 && field2112[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x124018F) == 0 && (var12[var15 + 2][var16 - 1] & 0x1240183) == 0 && (var12[var15 + 2][var16] & 0x12401E3) == 0) {
                field2119[var18] = var4 + 1;
                field2120[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2112[var13 + 1][var14 - 1] = 9;
                field2115[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 126 && field2112[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x124013E) == 0 && (var12[var15 - 1][var16 + 2] & 0x1240138) == 0 && (var12[var15][var16 + 2] & 0x12401F8) == 0) {
                field2119[var18] = var4 - 1;
                field2120[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2112[var13 - 1][var14 + 1] = 6;
                field2115[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 126 && var14 < 126 && field2112[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 2] & 0x12401F8) == 0 && (var12[var15 + 2][var16 + 2] & 0x12401E0) == 0 && (var12[var15 + 2][var16 + 1] & 0x12401E3) == 0) {
                field2119[var18] = var4 + 1;
                field2120[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2112[var13 + 1][var14 + 1] = 12;
                field2115[var13 + 1][var14 + 1] = var17;
            }
        }
        Statics.field2116 = var4;
        Statics.field2122 = var5;
        return false;
    }
}
