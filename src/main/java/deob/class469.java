package deob;

@ObfuscatedName("rr")
public class class469 extends RuntimeException {

    @ObfuscatedName("rr.w")
    public String field4869;

    @ObfuscatedName("rr.s")
    public Throwable field4866;

    public class469(Throwable arg0, String arg1) {
        this.field4869 = arg1;
        this.field4866 = arg0;
    }

    @ObfuscatedName("nk.p(Ljava/lang/Throwable;Ljava/lang/String;)Lrr;")
    public static class469 method6428(Throwable arg0, String arg1) {
        class469 var2;
        if (arg0 instanceof class469) {
            var2 = (class469) arg0;
            var2.field4869 = var2.field4869 + ' ' + arg1;
        } else {
            var2 = new class469(arg0, arg1);
        }
        return var2;
    }
}
