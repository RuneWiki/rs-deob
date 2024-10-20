package deob;

import java.util.concurrent.Future;

@ObfuscatedName("e")
public class class20 {

    @ObfuscatedName("e.c")
    public Future field107;

    @ObfuscatedName("e.p")
    public String field106;

    public class20(Future arg0) {
        this.field107 = arg0;
    }

    public class20(String arg0) {
        this.method291(arg0);
    }

    @ObfuscatedName("e.c(Ljava/lang/String;I)V")
    public void method291(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field106 = arg0;
        if (this.field107 != null) {
            this.field107.cancel(true);
            this.field107 = null;
        }
    }

    @ObfuscatedName("e.p(I)Ljava/lang/String;")
    public final String method282() {
        return this.field106;
    }

    @ObfuscatedName("e.f(I)Z")
    public boolean method283() {
        return this.field106 != null || this.field107 == null;
    }

    @ObfuscatedName("e.n(I)Z")
    public final boolean method285() {
        return this.method283() ? true : this.field107.isDone();
    }

    @ObfuscatedName("e.k(I)Ly;")
    public final class22 method280() {
        if (this.method283()) {
            return new class22(this.field106);
        } else if (this.method285()) {
            try {
                return (class22) this.field107.get();
            } catch (Exception var3) {
                String var2 = "Error retrieving REST request reply";
                System.err.println(var2 + "\r\n" + var3);
                this.method291(var2);
                return new class22(var2);
            }
        } else {
            return null;
        }
    }
}
