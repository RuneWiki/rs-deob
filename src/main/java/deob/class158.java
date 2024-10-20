package deob;

@ObfuscatedName("ff")
public class class158 {

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.b(IB)I")
    public static int method84(int arg0) {
        int var1 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var1 += 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var1 += 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var1 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var1 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var1++;
        }
        return arg0 + var1;
    }

    @ObfuscatedName("f.e(III)I")
    public static int method174(int arg0, int arg1) {
        int var2 = arg0 >>> 31;
        return (arg0 + var2) / arg1 - var2;
    }
}
