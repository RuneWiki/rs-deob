package deob;

@ObfuscatedName("px")
public class class440 {

    @ObfuscatedName("px.w")
    public static final int field4690 = (int) (Math.pow(2.0D, 4.0D) - 1.0D);

    @ObfuscatedName("px.v")
    public static final int field4688 = (int) (Math.pow(2.0D, 8.0D) - 1.0D);

    public class440() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("et.s(IB)I")
    public static int method2761(int arg0) {
        return arg0 >>> 12;
    }

    @ObfuscatedName("eh.h(II)I")
    public static int method2681(int arg0) {
        return arg0 >>> 4 & field4688;
    }

    @ObfuscatedName("km.w(II)I")
    public static int method4928(int arg0) {
        return (arg0 & field4690) - 1;
    }
}
