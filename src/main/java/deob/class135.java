package deob;

@ObfuscatedName("eq")
public class class135 extends RuntimeException {

    @ObfuscatedName("eq.i")
    public String field2053;

    @ObfuscatedName("eq.d")
    public Throwable field2054;

    public class135(Throwable arg0, String arg1) {
        this.field2053 = arg1;
        this.field2054 = arg0;
    }

    @ObfuscatedName("dc.x(Ljava/lang/Throwable;Ljava/lang/String;)Leq;")
    public static class135 method2344(Throwable arg0, String arg1) {
        class135 var2;
        if (arg0 instanceof class135) {
            var2 = (class135) arg0;
            var2.field2053 = var2.field2053 + ' ' + arg1;
        } else {
            var2 = new class135(arg0, arg1);
        }
        return var2;
    }
}
