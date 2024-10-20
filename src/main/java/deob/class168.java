package deob;

@ObfuscatedName("fy")
public class class168 {

    @ObfuscatedName("fy.e")
    public static int[][] field2106 = new int[128][128];

    @ObfuscatedName("fy.q")
    public static int[][] field2104 = new int[128][128];

    @ObfuscatedName("fy.w")
    public static int[] field2107 = new int[4096];

    @ObfuscatedName("fy.n")
    public static int[] field2111 = new int[4096];

    public class168() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ed.g(IILfv;Lfn;I)Z")
    public static final boolean method3118(int arg0, int arg1, class169 arg2, class167 arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        field2106[var6][var7] = 99;
        field2104[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        field2107[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        field2111[var10001] = arg1;
        int[][] var12 = arg3.field2102;
        while (var18 != var11) {
            var4 = field2107[var11];
            var5 = field2111[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field2098;
            int var16 = var5 - arg3.field2087;
            if (arg2.method1088(2, var4, var5, arg3)) {
                Statics.field2810 = var4;
                Statics.field2108 = var5;
                return true;
            }
            int var17 = field2104[var13][var14] + 1;
            if (var13 > 0 && field2106[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x124010E) == 0 && (var12[var15 - 1][var16 + 1] & 0x1240138) == 0) {
                field2107[var18] = var4 - 1;
                field2111[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field2106[var13 - 1][var14] = 2;
                field2104[var13 - 1][var14] = var17;
            }
            if (var13 < 126 && field2106[var13 + 1][var14] == 0 && (var12[var15 + 2][var16] & 0x1240183) == 0 && (var12[var15 + 2][var16 + 1] & 0x12401E0) == 0) {
                field2107[var18] = var4 + 1;
                field2111[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field2106[var13 + 1][var14] = 8;
                field2104[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && field2106[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x124010E) == 0 && (var12[var15 + 1][var16 - 1] & 0x1240183) == 0) {
                field2107[var18] = var4;
                field2111[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2106[var13][var14 - 1] = 1;
                field2104[var13][var14 - 1] = var17;
            }
            if (var14 < 126 && field2106[var13][var14 + 1] == 0 && (var12[var15][var16 + 2] & 0x1240138) == 0 && (var12[var15 + 1][var16 + 2] & 0x12401E0) == 0) {
                field2107[var18] = var4;
                field2111[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2106[var13][var14 + 1] = 4;
                field2104[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && field2106[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16] & 0x124013E) == 0 && (var12[var15 - 1][var16 - 1] & 0x124010E) == 0 && (var12[var15][var16 - 1] & 0x124018F) == 0) {
                field2107[var18] = var4 - 1;
                field2111[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2106[var13 - 1][var14 - 1] = 3;
                field2104[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 126 && var14 > 0 && field2106[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x124018F) == 0 && (var12[var15 + 2][var16 - 1] & 0x1240183) == 0 && (var12[var15 + 2][var16] & 0x12401E3) == 0) {
                field2107[var18] = var4 + 1;
                field2111[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2106[var13 + 1][var14 - 1] = 9;
                field2104[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 126 && field2106[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x124013E) == 0 && (var12[var15 - 1][var16 + 2] & 0x1240138) == 0 && (var12[var15][var16 + 2] & 0x12401F8) == 0) {
                field2107[var18] = var4 - 1;
                field2111[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2106[var13 - 1][var14 + 1] = 6;
                field2104[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 126 && var14 < 126 && field2106[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 2] & 0x12401F8) == 0 && (var12[var15 + 2][var16 + 2] & 0x12401E0) == 0 && (var12[var15 + 2][var16 + 1] & 0x12401E3) == 0) {
                field2107[var18] = var4 + 1;
                field2111[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2106[var13 + 1][var14 + 1] = 12;
                field2104[var13 + 1][var14 + 1] = var17;
            }
        }
        Statics.field2810 = var4;
        Statics.field2108 = var5;
        return false;
    }
}
