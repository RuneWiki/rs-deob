package deob;

@ObfuscatedName("fo")
public class class182 {

    public class182() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.i(J)V")
    public static final void method10(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method1724(arg0 - 1L);
            method1724(1L);
        } else {
            method1724(arg0);
        }
    }

    @ObfuscatedName("ch.c(J)V")
    public static final void method1724(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
