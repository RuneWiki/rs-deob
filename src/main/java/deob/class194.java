package deob;

@ObfuscatedName("gm")
public class class194 {

    public class194() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bw.y(J)V")
    public static final void method1689(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method974(arg0 - 1L);
            method974(1L);
        } else {
            try {
                Thread.sleep(arg0);
            } catch (InterruptedException var3) {
            }
        }
    }

    @ObfuscatedName("bd.c(J)V")
    public static final void method974(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
