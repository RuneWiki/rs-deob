package deob;

import java.util.concurrent.Future;

@ObfuscatedName("h")
public class class20 {

    @ObfuscatedName("h.o")
    public Future field103;

    @ObfuscatedName("h.q")
    public String field100;

    public class20(Future arg0) {
        this.field103 = arg0;
    }

    public class20(String arg0) {
        this.method259(arg0);
    }

    @ObfuscatedName("h.o(Ljava/lang/String;I)V")
    public void method259(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field100 = arg0;
        if (this.field103 != null) {
            this.field103.cancel(true);
            this.field103 = null;
        }
    }

    @ObfuscatedName("h.q(B)Ljava/lang/String;")
    public final String method244() {
        return this.field100;
    }

    @ObfuscatedName("h.l(I)Z")
    public boolean method243() {
        return this.field100 != null || this.field103 == null;
    }

    @ObfuscatedName("h.k(I)Z")
    public final boolean method246() {
        return this.method243() ? true : this.field103.isDone();
    }

    @ObfuscatedName("h.a(B)Ld;")
    public final class22 method247() {
        if (this.method243()) {
            return new class22(this.field100);
        } else if (this.method246()) {
            try {
                return (class22) this.field103.get();
            } catch (Exception var3) {
                String var2 = "Error retrieving REST request reply";
                System.err.println(var2 + "\r\n" + var3);
                this.method259(var2);
                return new class22(var2);
            }
        } else {
            return null;
        }
    }
}
