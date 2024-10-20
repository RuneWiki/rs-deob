package deob;

@ObfuscatedName("ga")
public class class193 {

    public class193() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("de.s(J)V")
    public static final void method2520(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method1750(arg0 - 1L);
            method1750(1L);
        } else {
            method1750(arg0);
        }
    }

    @ObfuscatedName("cj.g(J)V")
    public static final void method1750(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
