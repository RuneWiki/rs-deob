package deob;

@ObfuscatedName("gy")
public class class199 {

    public class199() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ee.n(J)V")
    public static final void method3065(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method1930(arg0 - 1L);
            method1930(1L);
        } else {
            method1930(arg0);
        }
    }

    @ObfuscatedName("cr.h(J)V")
    public static final void method1930(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
