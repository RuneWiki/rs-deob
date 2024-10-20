package deob;

@ObfuscatedName("uo")
public class class541 {

    @ObfuscatedName("uo.ag")
    public static final int field5313 = (int) (Math.pow(2.0D, 4.0D) - 1.0D);

    @ObfuscatedName("uo.ak")
    public static final int field5314 = (int) (Math.pow(2.0D, 8.0D) - 1.0D);

    public class541() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gc.aq(II)I")
    public static int method3185(int arg0) {
        return arg0 >>> 12;
    }

    @ObfuscatedName("pa.ad(IB)I")
    public static int method6964(int arg0) {
        return arg0 >>> 4 & field5314;
    }

    @ObfuscatedName("oj.ag(II)I")
    public static int method6662(int arg0) {
        return (arg0 & field5313) - 1;
    }
}
