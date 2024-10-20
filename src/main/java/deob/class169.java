package deob;

@ObfuscatedName("ff")
public class class169 {

    public class169() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gq.k(J)V")
    public static final void method3344(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method46(arg0 - 1L);
            method46(1L);
        } else {
            method46(arg0);
        }
    }

    @ObfuscatedName("r.y(J)V")
    public static final void method46(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
