package deob;

@ObfuscatedName("gj")
public class class194 {

    public class194() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.c(J)V")
    public static final void method672(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L != 0L) {
            method195(arg0);
            return;
        }
        long var2 = arg0 - 1L;
        try {
            Thread.sleep(var2);
        } catch (InterruptedException var7) {
        }
        try {
            Thread.sleep(1L);
        } catch (InterruptedException var6) {
        }
    }

    @ObfuscatedName("x.q(J)V")
    public static final void method195(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
