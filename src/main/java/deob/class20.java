package deob;

import java.util.concurrent.Future;

@ObfuscatedName("d")
public class class20 {

    @ObfuscatedName("d.i")
    public Future field93;

    @ObfuscatedName("d.w")
    public String field91;

    public class20(Future arg0) {
        this.field93 = arg0;
    }

    public class20(String arg0) {
        this.method270(arg0);
    }

    @ObfuscatedName("d.i(Ljava/lang/String;I)V")
    public void method270(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field91 = arg0;
        if (this.field93 != null) {
            this.field93.cancel(true);
            this.field93 = null;
        }
    }

    @ObfuscatedName("d.w(B)Ljava/lang/String;")
    public final String method285() {
        return this.field91;
    }

    @ObfuscatedName("d.s(I)Z")
    public boolean method268() {
        return this.field91 != null || this.field93 == null;
    }

    @ObfuscatedName("d.a(I)Z")
    public final boolean method272() {
        return this.method268() ? true : this.field93.isDone();
    }

    @ObfuscatedName("d.o(I)Lm;")
    public final class22 method273() {
        if (this.method268()) {
            return new class22(this.field91);
        } else if (this.method272()) {
            try {
                return (class22) this.field93.get();
            } catch (Exception var3) {
                String var2 = "Error retrieving REST request reply";
                System.err.println(var2 + "\r\n" + var3);
                this.method270(var2);
                return new class22(var2);
            }
        } else {
            return null;
        }
    }
}
