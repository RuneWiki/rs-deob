package deob;

@ObfuscatedName("py")
public class class417 {

    public class417() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("me.c(J)V")
    public static final void method5965(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method6588(arg0 - 1L);
            method6588(1L);
        } else {
            method6588(arg0);
        }
    }

    @ObfuscatedName("oj.b(J)V")
    public static final void method6588(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
