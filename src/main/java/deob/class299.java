package deob;

@ObfuscatedName("kt")
public class class299 {

    public class299() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("km.c(J)V")
    public static final void method4884(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method1631(arg0 - 1L);
            method1631(1L);
        } else {
            method1631(arg0);
        }
    }

    @ObfuscatedName("bg.t(J)V")
    public static final void method1631(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
