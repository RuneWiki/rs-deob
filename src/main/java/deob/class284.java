package deob;

@ObfuscatedName("ja")
public class class284 {

    public class284() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.h(J)V")
    public static final void method148(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method3471(arg0 - 1L);
            method3471(1L);
        } else {
            method3471(arg0);
        }
    }

    @ObfuscatedName("gd.e(J)V")
    public static final void method3471(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
