package deob;

@ObfuscatedName("ew")
public class class135 {

    @ObfuscatedName("ew.a")
    public static boolean field2000 = false;

    @ObfuscatedName("ew.j")
    public static int field1992 = 0;

    @ObfuscatedName("ew.n")
    public static int field1997 = 0;

    @ObfuscatedName("ew.r")
    public static boolean field1991 = false;

    @ObfuscatedName("ew.k")
    public static int field1996 = 0;

    @ObfuscatedName("ew.t")
    public static int[] field1989 = new int[1000];

    public class135() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.a(IIS)V")
    public static final void method2707(int arg0, int arg1) {
        field1992 = arg0;
        field1997 = arg1;
        field2000 = true;
        field1996 = 0;
        field1991 = false;
    }

    @ObfuscatedName("bb.j(I)V")
    public static final void method855() {
        field2000 = false;
        field1996 = 0;
    }

    @ObfuscatedName("ck.n(II)V")
    public static final void method1516(int arg0) {
        field1989[++field1996 - 1] = arg0;
    }

    @ObfuscatedName("jl.v(I)I")
    public static final int method4457() {
        return field1992;
    }

    @ObfuscatedName("r.l(Lej;IIII)Z")
    public static final boolean method10(class134 arg0, int arg1, int arg2, int arg3) {
        if (!Statics.method540()) {
            return false;
        }
        Statics.method2670();
        int var4 = arg0.field1950 + arg1;
        int var5 = arg0.field1951 + arg2;
        int var6 = arg0.field1952 + arg3;
        int var7 = arg0.field1948;
        int var8 = arg0.field1975;
        int var9 = arg0.field1955;
        int var10 = Statics.field1988 - var4;
        int var11 = Statics.field1993 - var5;
        int var12 = Statics.field323 - var6;
        if (Math.abs(var10) > Statics.field1755 + var7) {
            return false;
        } else if (Math.abs(var11) > Statics.field1994 + var8) {
            return false;
        } else if (Math.abs(var12) > Statics.field1995 + var9) {
            return false;
        } else if (Math.abs(Statics.field738 * var12 - Statics.field2436 * var11) > Statics.field1995 * var8 + Statics.field1994 * var9) {
            return false;
        } else if (Math.abs(Statics.field2436 * var10 - Statics.field3208 * var12) > Statics.field1995 * var7 + Statics.field1755 * var9) {
            return false;
        } else {
            return Math.abs(Statics.field3208 * var11 - Statics.field738 * var10) <= Statics.field1994 * var7 + Statics.field1755 * var8;
        }
    }
}
