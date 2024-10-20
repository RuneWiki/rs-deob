package deob;

@ObfuscatedName("ex")
public class class138 {

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.d(J)V")
    public static final void method15(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method1829(arg0 - 1L);
            method1829(1L);
        } else {
            method1829(arg0);
        }
    }

    @ObfuscatedName("cp.c(J)V")
    public static final void method1829(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
