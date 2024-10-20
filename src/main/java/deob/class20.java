package deob;

import java.util.concurrent.Future;

@ObfuscatedName("m")
public class class20 {

    @ObfuscatedName("m.a")
    public Future field106;

    @ObfuscatedName("m.f")
    public String field104;

    public class20(Future arg0) {
        this.field106 = arg0;
    }

    public class20(String arg0) {
        this.method266(arg0);
    }

    @ObfuscatedName("m.a(Ljava/lang/String;B)V")
    public void method266(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field104 = arg0;
        if (this.field106 != null) {
            this.field106.cancel(true);
            this.field106 = null;
        }
    }

    @ObfuscatedName("m.f(I)Ljava/lang/String;")
    public final String method272() {
        return this.field104;
    }

    @ObfuscatedName("m.c(B)Z")
    public boolean method280() {
        return this.field104 != null || this.field106 == null;
    }

    @ObfuscatedName("m.x(I)Z")
    public final boolean method268() {
        return this.method280() ? true : this.field106.isDone();
    }

    @ObfuscatedName("m.h(B)Li;")
    public final class22 method269() {
        if (this.method280()) {
            return new class22(this.field104);
        } else if (this.method268()) {
            try {
                return (class22) this.field106.get();
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
