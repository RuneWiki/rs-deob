package deob;

@ObfuscatedName("mk")
public class class327 {

    public class327() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("sy.ak(J)V")
    public static final void method8101(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method2242(arg0 - 1L);
            method2242(1L);
        } else {
            method2242(arg0);
        }
    }

    @ObfuscatedName("du.al(J)V")
    public static final void method2242(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
