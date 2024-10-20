package deob;

import java.util.concurrent.Future;

@ObfuscatedName("ax")
public class class19 {

    @ObfuscatedName("ax.au")
    public Future field94;

    @ObfuscatedName("ax.ae")
    public String field91;

    public class19(Future arg0) {
        this.field94 = arg0;
    }

    public class19(String arg0) {
        this.method262(arg0);
    }

    @ObfuscatedName("ax.au(Ljava/lang/String;I)V")
    public void method262(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field91 = arg0;
        if (this.field94 != null) {
            this.field94.cancel(true);
            this.field94 = null;
        }
    }

    @ObfuscatedName("ax.ae(I)Ljava/lang/String;")
    public final String method280() {
        return this.field91;
    }

    @ObfuscatedName("ax.ao(I)Z")
    public boolean method270() {
        return this.field91 != null || this.field94 == null;
    }

    @ObfuscatedName("ax.at(B)Z")
    public final boolean method265() {
        return this.method270() ? true : this.field94.isDone();
    }

    @ObfuscatedName("ax.ac(I)Las;")
    public final class21 method275() {
        if (this.method270()) {
            return new class21(this.field91);
        } else if (this.method265()) {
            try {
                return (class21) this.field94.get();
            } catch (Exception var3) {
                String var2 = "Error retrieving REST request reply";
                System.err.println(var2 + "\r\n" + var3);
                this.method262(var2);
                return new class21(var2);
            }
        } else {
            return null;
        }
    }
}
