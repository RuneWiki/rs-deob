package deob;

@ObfuscatedName("kj")
public class class309 {

    public class309() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.f(J)V")
    public static final void method735(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2870(arg0 - 1L);
            method2870(1L);
        } else {
            method2870(arg0);
        }
    }

    @ObfuscatedName("ep.b(J)V")
    public static final void method2870(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
