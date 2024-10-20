package deob;

@ObfuscatedName("mo")
public class class317 {

    public class317() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("es.am(J)V")
    public static final void method2871(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method6313(arg0 - 1L);
            method6313(1L);
        } else {
            method6313(arg0);
        }
    }

    @ObfuscatedName("nb.ap(J)V")
    public static final void method6313(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
