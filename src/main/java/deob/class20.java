package deob;

import java.util.concurrent.Future;

@ObfuscatedName("j")
public class class20 {

    @ObfuscatedName("j.c")
    public Future field109;

    @ObfuscatedName("j.l")
    public String field103;

    public class20(Future arg0) {
        this.field109 = arg0;
    }

    public class20(String arg0) {
        this.method266(arg0);
    }

    @ObfuscatedName("j.c(Ljava/lang/String;I)V")
    public void method266(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field103 = arg0;
        if (this.field109 != null) {
            this.field109.cancel(true);
            this.field109 = null;
        }
    }

    @ObfuscatedName("j.l(B)Ljava/lang/String;")
    public final String method268() {
        return this.field103;
    }

    @ObfuscatedName("j.s(I)Z")
    public boolean method269() {
        return this.field103 != null || this.field109 == null;
    }

    @ObfuscatedName("j.e(B)Z")
    public final boolean method279() {
        return this.method269() ? true : this.field109.isDone();
    }

    @ObfuscatedName("j.r(B)Lg;")
    public final class22 method270() {
        if (this.method269()) {
            return new class22(this.field103);
        } else if (this.method279()) {
            try {
                return (class22) this.field109.get();
            } catch (Exception var3) {
                String var2 = "Error retrieving REST request reply";
                System.err.println(var2 + "\r\n" + var3);
                this.method266(var2);
                return new class22(var2);
            }
        } else {
            return null;
        }
    }
}
