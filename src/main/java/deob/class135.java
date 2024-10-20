package deob;

@ObfuscatedName("en")
public class class135 extends RuntimeException {

    @ObfuscatedName("en.d")
    public String field2069;

    @ObfuscatedName("en.n")
    public Throwable field2072;

    public class135(Throwable arg0, String arg1) {
        this.field2069 = arg1;
        this.field2072 = arg0;
    }

    @ObfuscatedName("h.s(Ljava/lang/Throwable;Ljava/lang/String;)Len;")
    public static class135 method486(Throwable arg0, String arg1) {
        class135 var2;
        if (arg0 instanceof class135) {
            var2 = (class135) arg0;
            var2.field2069 = var2.field2069 + ' ' + arg1;
        } else {
            var2 = new class135(arg0, arg1);
        }
        return var2;
    }
}
