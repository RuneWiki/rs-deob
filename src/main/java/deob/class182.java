package deob;

@ObfuscatedName("gt")
public class class182 extends class194 {

    @ObfuscatedName("gt.ab")
    public int field1947;

    @ObfuscatedName("gt.ay")
    public int field1948;

    @ObfuscatedName("gt.an")
    public int field1949;

    @ObfuscatedName("gt.au")
    public int field1950;

    @ObfuscatedName("gt.ax")
    public int field1951;

    @ObfuscatedName("gt.ao")
    public int field1954;

    @ObfuscatedName("gt.am")
    public int field1957;

    @ObfuscatedName("gt.ac")
    public int field1956;

    @ObfuscatedName("gt.ae")
    public int field1952;

    @ObfuscatedName("gt.ad")
    public int field1953;

    @ObfuscatedName("gt.aq")
    public int field1955;

    public class182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1947 = arg0;
        this.field1948 = arg1;
        this.field1949 = arg2;
        this.field1950 = arg3;
        this.field1951 = arg4;
        this.field1954 = class181.field1941[arg3];
        this.field1957 = class181.field1942[arg3];
        this.field1956 = class181.field1941[arg4];
        this.field1952 = class181.field1942[arg4];
        this.field1953 = arg5;
        this.field1955 = arg6;
    }

    @ObfuscatedName("gt.ab(Lhs;IIIIJ)V")
    public void method3526(class189 arg0, int arg1, int arg2, int arg3, int arg4, long arg5) {
        arg0.method3665(arg1, this.field1950, this.field1951, arg2, arg3, arg4, this.field1947, this.field1948, this.field1949, arg5, this.field1953, this.field1955, false);
    }

    @ObfuscatedName("gt.ay(Lhf;Lhv;IIII)V")
    public void method3527(class186 arg0, class200 arg1, int arg2, int arg3, int arg4) {
        int var6;
        int var7 = var6 = (arg3 << 7) - this.field1947;
        int var8;
        int var9 = var8 = (arg4 << 7) - this.field1949;
        int var10;
        int var11 = var10 = var7 + 128;
        int var12;
        int var13 = var12 = var9 + 128;
        int var14 = arg0.field1992[arg2][arg3][arg4] - this.field1948;
        int var15 = arg0.field1992[arg2][arg3 + 1][arg4] - this.field1948;
        int var16 = arg0.field1992[arg2][arg3 + 1][arg4 + 1] - this.field1948;
        int var17 = arg0.field1992[arg2][arg3][arg4 + 1] - this.field1948;
        int var18 = this.field1956 * var9 + this.field1952 * var7 >> 16;
        int var19 = this.field1952 * var9 - this.field1956 * var7 >> 16;
        int var21 = this.field1957 * var14 - this.field1954 * var19 >> 16;
        int var22 = this.field1957 * var19 + this.field1954 * var14 >> 16;
        if (var22 < 50) {
            return;
        }
        int var24 = this.field1956 * var8 + this.field1952 * var11 >> 16;
        int var25 = this.field1952 * var8 - this.field1956 * var11 >> 16;
        int var27 = this.field1957 * var15 - this.field1954 * var25 >> 16;
        int var28 = this.field1957 * var25 + this.field1954 * var15 >> 16;
        if (var28 < 50) {
            return;
        }
        int var30 = this.field1956 * var13 + this.field1952 * var10 >> 16;
        int var31 = this.field1952 * var13 - this.field1956 * var10 >> 16;
        int var33 = this.field1957 * var16 - this.field1954 * var31 >> 16;
        int var34 = this.field1957 * var31 + this.field1954 * var16 >> 16;
        if (var34 < 50) {
            return;
        }
        int var36 = this.field1956 * var12 + this.field1952 * var6 >> 16;
        int var37 = this.field1952 * var12 - this.field1956 * var6 >> 16;
        int var39 = this.field1957 * var17 - this.field1954 * var37 >> 16;
        int var40 = this.field1957 * var37 + this.field1954 * var17 >> 16;
        if (var40 >= 50) {
            this.method3870(arg0, arg1, arg3, arg4, var18, var24, var30, var36, var21, var27, var33, var39, var22, var28, var34, var40);
        }
    }

    @ObfuscatedName("gt.an(Lhf;Lhc;III)V")
    public void method3525(class186 arg0, class195 arg1, int arg2, int arg3) {
        int var5 = arg1.field2134.length;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg1.field2134[var6] - this.field1947;
            int var8 = arg1.field2133[var6] - this.field1948;
            int var9 = arg1.field2128[var6] - this.field1949;
            int var10 = this.field1956 * var9 + this.field1952 * var7 >> 16;
            int var11 = this.field1952 * var9 - this.field1956 * var7 >> 16;
            int var13 = this.field1957 * var8 - this.field1954 * var11 >> 16;
            int var14 = this.field1957 * var11 + this.field1954 * var8 >> 16;
            if (var14 < 50) {
                return;
            }
            if (arg1.field2135 != null) {
                class195.field2144[var6] = var10;
                class195.field2145[var6] = var13;
                class195.field2129[var6] = var14;
            }
            class195.field2141[var6] = class181.method3438() + var10 * class181.method3447() / var14;
            class195.field2127[var6] = class181.method3512() + var13 * class181.method3447() / var14;
            class195.field2143[var6] = class196.method2694(var14);
        }
        this.method3871(arg0, arg1, arg2, arg3);
    }
}
