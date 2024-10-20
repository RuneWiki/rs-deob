package deob;

@ObfuscatedName("mc")
public class class317 {

    public class317() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ei.ac(J)V")
    public static final void method2610(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L != 0L) {
            try {
                Thread.sleep(arg0);
            } catch (InterruptedException var7) {
            }
            return;
        }
        long var2 = arg0 - 1L;
        try {
            Thread.sleep(var2);
        } catch (InterruptedException var9) {
        }
        try {
            Thread.sleep(1L);
        } catch (InterruptedException var8) {
        }
    }
}
