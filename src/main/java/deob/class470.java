package deob;

@ObfuscatedName("rr")
public class class470 {

    @ObfuscatedName("rr.v")
    public static final int field4923 = (int) (Math.pow(2.0D, 4.0D) - 1.0D);

    @ObfuscatedName("rr.s")
    public static final int field4922 = (int) (Math.pow(2.0D, 8.0D) - 1.0D);

    public class470() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ip.f(II)I")
    public static int method4524(int arg0) {
        return arg0 >>> 12;
    }

    @ObfuscatedName("ky.w(IB)I")
    public static int method5217(int arg0) {
        return arg0 >>> 4 & field4922;
    }

    @ObfuscatedName("ig.v(II)I")
    public static int method4862(int arg0) {
        return (arg0 & field4923) - 1;
    }
}
