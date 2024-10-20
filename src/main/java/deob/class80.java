package deob;

@ObfuscatedName("cd")
public class class80 extends RuntimeException {

    @ObfuscatedName("cd.w")
    public String field1402;

    @ObfuscatedName("cd.r")
    public Throwable field1403;

    public class80(Throwable arg0, String arg1) {
        this.field1402 = arg1;
        this.field1403 = arg0;
    }

    @ObfuscatedName("b.b(Ljava/lang/Throwable;Ljava/lang/String;)Lcd;")
    public static class80 method7(Throwable arg0, String arg1) {
        class80 var2;
        if (arg0 instanceof class80) {
            var2 = (class80) arg0;
            var2.field1402 = var2.field1402 + ' ' + arg1;
        } else {
            var2 = new class80(arg0, arg1);
        }
        return var2;
    }
}
