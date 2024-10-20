package deob;

import java.util.concurrent.Future;

@ObfuscatedName("z")
public class class20 {

    @ObfuscatedName("z.l")
    public Future field102;

    @ObfuscatedName("z.q")
    public String field100;

    public class20(Future arg0) {
        this.field102 = arg0;
    }

    public class20(String arg0) {
        this.method276(arg0);
    }

    @ObfuscatedName("z.l(Ljava/lang/String;S)V")
    public void method276(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field100 = arg0;
        if (this.field102 != null) {
            this.field102.cancel(true);
            this.field102 = null;
        }
    }

    @ObfuscatedName("z.q(I)Ljava/lang/String;")
    public final String method288() {
        return this.field100;
    }

    @ObfuscatedName("z.f(I)Z")
    public boolean method278() {
        return this.field100 != null || this.field102 == null;
    }

    @ObfuscatedName("z.j(I)Z")
    public final boolean method279() {
        return this.method278() ? true : this.field102.isDone();
    }

    @ObfuscatedName("z.m(S)Lo;")
    public final class22 method280() {
        if (this.method278()) {
            return new class22(this.field100);
        } else if (this.method279()) {
            try {
                return (class22) this.field102.get();
            } catch (Exception var3) {
                String var2 = "Error retrieving REST request reply";
                System.err.println(var2 + "\r\n" + var3);
                this.method276(var2);
                return new class22(var2);
            }
        } else {
            return null;
        }
    }
}
