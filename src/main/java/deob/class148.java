package deob;

@ObfuscatedName("ew")
public class class148 extends RuntimeException {

    @ObfuscatedName("ew.h")
    public String field2216;

    @ObfuscatedName("ew.a")
    public Throwable field2214;

    public class148(Throwable arg0, String arg1) {
        this.field2216 = arg1;
        this.field2214 = arg0;
    }

    @ObfuscatedName("d.v(Ljava/lang/Throwable;Ljava/lang/String;)Lew;")
    public static class148 method120(Throwable arg0, String arg1) {
        class148 var2;
        if (arg0 instanceof class148) {
            var2 = (class148) arg0;
            var2.field2216 = var2.field2216 + ' ' + arg1;
        } else {
            var2 = new class148(arg0, arg1);
        }
        return var2;
    }
}
