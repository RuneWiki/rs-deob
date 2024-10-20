package deob;

@ObfuscatedName("vt")
public class class560 extends RuntimeException {

    @ObfuscatedName("vt.as")
    public String field5364;

    @ObfuscatedName("vt.aa")
    public Throwable field5370;

    public class560(Throwable arg0, String arg1) {
        this.field5364 = arg1;
        this.field5370 = arg0;
    }

    @ObfuscatedName("hn.aw(Ljava/lang/Throwable;Ljava/lang/String;)Lvt;")
    public static class560 method3457(Throwable arg0, String arg1) {
        class560 var2;
        if (arg0 instanceof class560) {
            var2 = (class560) arg0;
            var2.field5364 = var2.field5364 + ' ' + arg1;
        } else {
            var2 = new class560(arg0, arg1);
        }
        return var2;
    }
}
