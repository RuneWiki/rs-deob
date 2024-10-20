package deob;

@ObfuscatedName("db")
public class class134 {

    public class134() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dl.b(J)V")
    public static final void method600(long arg0) {
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
        method1083(1L);
    }

    @ObfuscatedName("ev.h(J)V")
    public static final void method1083(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
