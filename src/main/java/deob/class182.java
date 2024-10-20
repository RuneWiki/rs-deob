package deob;

@ObfuscatedName("fp")
public class class182 {

    public class182() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cx.n(J)V")
    public static final void method1713(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2317(arg0 - 1L);
            method2317(1L);
        } else {
            method2317(arg0);
        }
    }

    @ObfuscatedName("eu.p(J)V")
    public static final void method2317(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
