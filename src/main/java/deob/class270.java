package deob;

@ObfuscatedName("jz")
public class class270 {

    public class270() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bo.c(J)V")
    public static final void method1896(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L != 0L) {
            try {
                Thread.sleep(arg0);
            } catch (InterruptedException var4) {
            }
            return;
        }
        method5432(arg0 - 1L);
        try {
            Thread.sleep(1L);
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("lq.v(J)V")
    public static final void method5432(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
