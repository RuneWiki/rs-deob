package deob;

import java.util.concurrent.Future;

@ObfuscatedName("x")
public class class20 {

    @ObfuscatedName("x.v")
    public Future field103;

    @ObfuscatedName("x.c")
    public String field101;

    public class20(Future arg0) {
        this.field103 = arg0;
    }

    public class20(String arg0) {
        this.method265(arg0);
    }

    @ObfuscatedName("x.v(Ljava/lang/String;I)V")
    public void method265(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field101 = arg0;
        if (this.field103 != null) {
            this.field103.cancel(true);
            this.field103 = null;
        }
    }

    @ObfuscatedName("x.c(B)Ljava/lang/String;")
    public final String method266() {
        return this.field101;
    }

    @ObfuscatedName("x.i(I)Z")
    public boolean method278() {
        return this.field101 != null || this.field103 == null;
    }

    @ObfuscatedName("x.f(B)Z")
    public final boolean method263() {
        return this.method278() ? true : this.field103.isDone();
    }

    @ObfuscatedName("x.b(I)Ly;")
    public final class22 method269() {
        if (this.method278()) {
            return new class22(this.field101);
        } else if (this.method263()) {
            try {
                return (class22) this.field103.get();
            } catch (Exception var3) {
                String var2 = "Error retrieving REST request reply";
                System.err.println(var2 + "\r\n" + var3);
                this.method265(var2);
                return new class22(var2);
            }
        } else {
            return null;
        }
    }
}
