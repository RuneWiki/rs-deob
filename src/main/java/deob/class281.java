package deob;

@ObfuscatedName("jf")
public class class281 {

    public class281() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gh.a(J)V")
    public static final void method3621(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method4718(arg0 - 1L);
            method4718(1L);
        } else {
            method4718(arg0);
        }
    }

    @ObfuscatedName("ip.f(J)V")
    public static final void method4718(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
