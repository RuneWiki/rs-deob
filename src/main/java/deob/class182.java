package deob;

@ObfuscatedName("fq")
public class class182 {

    public class182() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.e(II)Z")
    public static boolean method82(int arg0) {
        return (arg0 & 0x1) != 0;
    }

    @ObfuscatedName("bl.l(IIB)Z")
    public static boolean method1118(int arg0, int arg1) {
        return (arg0 >> arg1 + 1 & 0x1) != 0;
    }

    @ObfuscatedName("gs.c(II)I")
    public static int method3384(int arg0) {
        return arg0 >> 11 & 0x3F;
    }

    @ObfuscatedName("fd.h(II)I")
    public static int method3051(int arg0) {
        return arg0 >> 17 & 0x7;
    }

    @ObfuscatedName("cg.r(II)Z")
    public static boolean method2153(int arg0) {
        return (arg0 >> 31 & 0x1) != 0;
    }
}
