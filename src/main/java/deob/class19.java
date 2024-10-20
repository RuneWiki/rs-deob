package deob;

import java.util.concurrent.Future;

@ObfuscatedName("u")
public class class19 {

    @ObfuscatedName("u.f")
    public Future field101;

    @ObfuscatedName("u.w")
    public String field104;

    public class19(Future arg0) {
        this.field101 = arg0;
    }

    public class19(String arg0) {
        this.method269(arg0);
    }

    @ObfuscatedName("u.f(Ljava/lang/String;B)V")
    public void method269(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field104 = arg0;
        if (this.field101 != null) {
            this.field101.cancel(true);
            this.field101 = null;
        }
    }

    @ObfuscatedName("u.w(B)Ljava/lang/String;")
    public final String method270() {
        return this.field104;
    }

    @ObfuscatedName("u.v(B)Z")
    public boolean method275() {
        return this.field104 != null || this.field101 == null;
    }

    @ObfuscatedName("u.s(I)Z")
    public final boolean method272() {
        return this.method275() ? true : this.field101.isDone();
    }

    @ObfuscatedName("u.z(I)La;")
    public final class21 method273() {
        if (this.method275()) {
            return new class21(this.field104);
        } else if (this.method272()) {
            try {
                return (class21) this.field101.get();
            } catch (Exception var3) {
                String var2 = "Error retrieving REST request reply";
                System.err.println(var2 + "\r\n" + var3);
                this.method269(var2);
                return new class21(var2);
            }
        } else {
            return null;
        }
    }
}
