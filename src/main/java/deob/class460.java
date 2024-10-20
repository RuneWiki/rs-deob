package deob;

@ObfuscatedName("qb")
public class class460 {

    @ObfuscatedName("qb.c")
    public static final int field4854 = (int) (Math.pow(2.0D, 4.0D) - 1.0D);

    @ObfuscatedName("qb.x")
    public static final int field4855 = (int) (Math.pow(2.0D, 8.0D) - 1.0D);

    public class460() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("oa.a(IB)I")
    public static int method7124(int arg0) {
        return arg0 >>> 12;
    }

    @ObfuscatedName("lj.f(II)I")
    public static int method5730(int arg0) {
        return arg0 >>> 4 & field4855;
    }

    @ObfuscatedName("br.c(IB)I")
    public static int method1772(int arg0) {
        return (arg0 & field4854) - 1;
    }
}
