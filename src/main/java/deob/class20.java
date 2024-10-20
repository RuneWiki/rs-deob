package deob;

import java.util.concurrent.Future;

@ObfuscatedName("e")
public class class20 {

    @ObfuscatedName("e.s")
    public Future field100;

    @ObfuscatedName("e.h")
    public String field99;

    public class20(Future arg0) {
        this.field100 = arg0;
    }

    public class20(String arg0) {
        this.method261(arg0);
    }

    @ObfuscatedName("e.s(Ljava/lang/String;I)V")
    public void method261(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field99 = arg0;
        if (this.field100 != null) {
            this.field100.cancel(true);
            this.field100 = null;
        }
    }

    @ObfuscatedName("e.h(I)Ljava/lang/String;")
    public final String method278() {
        return this.field99;
    }

    @ObfuscatedName("e.w(S)Z")
    public boolean method263() {
        return this.field99 != null || this.field100 == null;
    }

    @ObfuscatedName("e.v(S)Z")
    public final boolean method264() {
        return this.method263() ? true : this.field100.isDone();
    }

    @ObfuscatedName("e.c(I)Lx;")
    public final class22 method265() {
        if (this.method263()) {
            return new class22(this.field99);
        } else if (this.method264()) {
            try {
                return (class22) this.field100.get();
            } catch (Exception var3) {
                String var2 = "Error retrieving REST request reply";
                System.err.println(var2 + "\r\n" + var3);
                this.method261(var2);
                return new class22(var2);
            }
        } else {
            return null;
        }
    }
}
