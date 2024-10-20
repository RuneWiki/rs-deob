package deob;

@ObfuscatedName("op")
public class class398 {

    public class398() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jx.n(J)V")
    public static final void method4655(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method3356(arg0 - 1L);
            method3356(1L);
        } else {
            method3356(arg0);
        }
    }

    @ObfuscatedName("fm.c(J)V")
    public static final void method3356(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
