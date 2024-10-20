package deob;

@ObfuscatedName("qb")
public class class463 {

    @ObfuscatedName("qb.v")
    public static final int field4897 = (int) (Math.pow(2.0D, 4.0D) - 1.0D);

    @ObfuscatedName("qb.x")
    public static final int field4899 = (int) (Math.pow(2.0D, 8.0D) - 1.0D);

    public class463() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ku.h(IB)I")
    public static int method5261(int arg0) {
        return arg0 >>> 12;
    }

    @ObfuscatedName("qs.e(IS)I")
    public static int method7689(int arg0) {
        return arg0 >>> 4 & field4899;
    }

    @ObfuscatedName("fk.v(II)I")
    public static int method3109(int arg0) {
        return (arg0 & field4897) - 1;
    }
}
