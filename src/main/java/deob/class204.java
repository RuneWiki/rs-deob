package deob;

@ObfuscatedName("gu")
public class class204 {

    public class204() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("o.g(J)V")
    public static final void method48(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method854(arg0 - 1L);
            method854(1L);
        } else {
            method854(arg0);
        }
    }

    @ObfuscatedName("bz.e(J)V")
    public static final void method854(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
