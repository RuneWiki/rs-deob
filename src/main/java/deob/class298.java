package deob;

@ObfuscatedName("ks")
public class class298 {

    public class298() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hi.f(J)V")
    public static final void method3743(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method3300(arg0 - 1L);
            method3300(1L);
        } else {
            method3300(arg0);
        }
    }

    @ObfuscatedName("gq.i(J)V")
    public static final void method3300(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
