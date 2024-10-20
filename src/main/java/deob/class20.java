package deob;

import java.util.concurrent.Future;

@ObfuscatedName("a")
public class class20 {

    @ObfuscatedName("a.c")
    public Future field108;

    @ObfuscatedName("a.v")
    public String field107;

    public class20(Future arg0) {
        this.field108 = arg0;
    }

    public class20(String arg0) {
        this.method238(arg0);
    }

    @ObfuscatedName("a.c(Ljava/lang/String;I)V")
    public void method238(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field107 = arg0;
        if (this.field108 != null) {
            this.field108.cancel(true);
            this.field108 = null;
        }
    }

    @ObfuscatedName("a.v(I)Ljava/lang/String;")
    public final String method239() {
        return this.field107;
    }

    @ObfuscatedName("a.q(I)Z")
    public boolean method246() {
        return this.field107 != null || this.field108 == null;
    }

    @ObfuscatedName("a.f(I)Z")
    public final boolean method241() {
        return this.method246() ? true : this.field108.isDone();
    }

    @ObfuscatedName("a.j(S)Lb;")
    public final class22 method244() {
        if (this.method246()) {
            return new class22(this.field107);
        } else if (this.method241()) {
            try {
                return (class22) this.field108.get();
            } catch (Exception var3) {
                String var2 = "Error retrieving REST request reply";
                System.err.println(var2 + "\r\n" + var3);
                this.method238(var2);
                return new class22(var2);
            }
        } else {
            return null;
        }
    }
}
