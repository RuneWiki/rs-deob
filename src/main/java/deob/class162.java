package deob;

@ObfuscatedName("fo")
public class class162 {

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aj.s(J)V")
    public static final void method746(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method152(arg0 - 1L);
            method152(1L);
        } else {
            method152(arg0);
        }
    }

    @ObfuscatedName("w.c(J)V")
    public static final void method152(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
