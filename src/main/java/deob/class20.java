package deob;

import java.util.concurrent.Future;

@ObfuscatedName("f")
public class class20 {

    @ObfuscatedName("f.c")
    public Future field101;

    @ObfuscatedName("f.b")
    public String field102;

    public class20(Future arg0) {
        this.field101 = arg0;
    }

    public class20(String arg0) {
        this.method298(arg0);
    }

    @ObfuscatedName("f.c(Ljava/lang/String;I)V")
    public void method298(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field102 = arg0;
        if (this.field101 != null) {
            this.field101.cancel(true);
            this.field101 = null;
        }
    }

    @ObfuscatedName("f.b(I)Ljava/lang/String;")
    public final String method299() {
        return this.field102;
    }

    @ObfuscatedName("f.p(I)Z")
    public boolean method323() {
        return this.field102 != null || this.field101 == null;
    }

    @ObfuscatedName("f.m(I)Z")
    public final boolean method301() {
        return this.method323() ? true : this.field101.isDone();
    }

    @ObfuscatedName("f.t(B)Lq;")
    public final class22 method302() {
        if (this.method323()) {
            return new class22(this.field102);
        } else if (this.method301()) {
            try {
                return (class22) this.field101.get();
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
