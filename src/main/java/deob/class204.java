package deob;

@ObfuscatedName("gv")
public class class204 {

    @ObfuscatedName("gv.e")
    public final int field2998;

    @ObfuscatedName("gv.a")
    public final long field3002;

    @ObfuscatedName("gv.l")
    public final class210 field3000;

    @ObfuscatedName("gv.c")
    public String field3001;

    @ObfuscatedName("gv.u")
    public String field2999;

    public class204(class111 arg0, byte arg1, int arg2) {
        this.field3001 = arg0.method2167();
        this.field2999 = arg0.method2167();
        this.field2998 = arg0.method2178();
        this.field3002 = arg0.method2265();
        int var4 = arg0.method2378();
        int var5 = arg0.method2378();
        this.field3000 = new class210();
        this.field3000.method3543(2);
        this.field3000.method3544(arg1);
        this.field3000.field3026 = var4;
        this.field3000.field3029 = var5;
        this.field3000.field3030 = 0;
        this.field3000.field3031 = 0;
        this.field3000.field3032 = arg2;
    }

    @ObfuscatedName("gv.e(I)Ljava/lang/String;")
    public String method3499() {
        return this.field3001;
    }

    @ObfuscatedName("gv.a(I)Ljava/lang/String;")
    public String method3500() {
        return this.field2999;
    }
}
