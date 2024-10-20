package deob;

import java.util.concurrent.Future;

@ObfuscatedName("x")
public class class20 {

    @ObfuscatedName("x.n")
    public Future field97;

    @ObfuscatedName("x.c")
    public String field93;

    public class20(Future arg0) {
        this.field97 = arg0;
    }

    public class20(String arg0) {
        this.method298(arg0);
    }

    @ObfuscatedName("x.n(Ljava/lang/String;B)V")
    public void method298(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field93 = arg0;
        if (this.field97 != null) {
            this.field97.cancel(true);
            this.field97 = null;
        }
    }

    @ObfuscatedName("x.c(I)Ljava/lang/String;")
    public final String method286() {
        return this.field93;
    }

    @ObfuscatedName("x.m(S)Z")
    public boolean method287() {
        return this.field93 != null || this.field97 == null;
    }

    @ObfuscatedName("x.k(I)Z")
    public final boolean method301() {
        return this.method287() ? true : this.field97.isDone();
    }

    @ObfuscatedName("x.o(I)Lt;")
    public final class22 method289() {
        if (this.method287()) {
            return new class22(this.field93);
        } else if (this.method301()) {
            try {
                return (class22) this.field97.get();
            } catch (Exception var3) {
                String var2 = "Error retrieving REST request reply";
                System.err.println(var2 + "\r\n" + var3);
                this.method298(var2);
                return new class22(var2);
            }
        } else {
            return null;
        }
    }
}
