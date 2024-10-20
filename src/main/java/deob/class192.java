package deob;

@ObfuscatedName("gq")
public class class192 {

    public class192() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.w(J)V")
    public static final void method196(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method271(arg0 - 1L);
            method271(1L);
        } else {
            method271(arg0);
        }
    }

    @ObfuscatedName("i.m(J)V")
    public static final void method271(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
