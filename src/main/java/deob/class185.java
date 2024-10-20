package deob;

@ObfuscatedName("gj")
public class class185 {

    public class185() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ak.s(J)V")
    public static final void method631(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method3227(arg0 - 1L);
            method3227(1L);
        } else {
            method3227(arg0);
        }
    }

    @ObfuscatedName("gz.c(J)V")
    public static final void method3227(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
