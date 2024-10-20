package deob;

@ObfuscatedName("nj")
public class class383 {

    public class383() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("he.s(J)V")
    public static final void method3882(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method4363(arg0 - 1L);
            method4363(1L);
        } else {
            method4363(arg0);
        }
    }

    @ObfuscatedName("ip.t(J)V")
    public static final void method4363(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
