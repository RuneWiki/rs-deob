package deob;

@ObfuscatedName("hr")
public class class211 {

    public class211() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ga.m(J)V")
    public static final void method3659(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L != 0L) {
            try {
                Thread.sleep(arg0);
            } catch (InterruptedException var7) {
            }
            return;
        }
        long var2 = arg0 - 1L;
        try {
            Thread.sleep(var2);
        } catch (InterruptedException var9) {
        }
        try {
            Thread.sleep(1L);
        } catch (InterruptedException var8) {
        }
    }
}
