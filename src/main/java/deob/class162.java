package deob;

@ObfuscatedName("fq")
public class class162 {

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.o(J)V")
    public static final void method238(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            method606(arg0 - 1L);
            method606(1L);
        } else {
            method606(arg0);
        }
    }

    @ObfuscatedName("aa.m(J)V")
    public static final void method606(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
