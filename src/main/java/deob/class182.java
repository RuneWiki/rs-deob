package deob;

@ObfuscatedName("fl")
public class class182 {

    public class182() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.i(J)V")
    public static final void method138(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L != 0L) {
            try {
                Thread.sleep(arg0);
            } catch (InterruptedException var6) {
            }
            return;
        }
        long var2 = arg0 - 1L;
        try {
            Thread.sleep(var2);
        } catch (InterruptedException var7) {
        }
        method482(1L);
    }

    @ObfuscatedName("ag.h(J)V")
    public static final void method482(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
