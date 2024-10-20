package deob;

@ObfuscatedName("lo")
public class class302 {

    public class302() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ia.at(J)V")
    public static final void method3997(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method4145(arg0 - 1L);
            method4145(1L);
        } else {
            method4145(arg0);
        }
    }

    @ObfuscatedName("ir.an(J)V")
    public static final void method4145(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
