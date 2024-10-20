package deob;

import java.util.concurrent.Future;

@ObfuscatedName("am")
public class class19 {

    @ObfuscatedName("am.af")
    public Future field100;

    @ObfuscatedName("am.an")
    public String field96;

    public class19(Future arg0) {
        this.field100 = arg0;
    }

    public class19(String arg0) {
        this.method260(arg0);
    }

    @ObfuscatedName("am.af(Ljava/lang/String;I)V")
    public void method260(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field96 = arg0;
        if (this.field100 != null) {
            this.field100.cancel(true);
            this.field100 = null;
        }
    }

    @ObfuscatedName("am.an(I)Ljava/lang/String;")
    public final String method261() {
        return this.field96;
    }

    @ObfuscatedName("am.aw(B)Z")
    public boolean method259() {
        return this.field96 != null || this.field100 == null;
    }

    @ObfuscatedName("am.ac(I)Z")
    public final boolean method262() {
        return this.method259() ? true : this.field100.isDone();
    }

    @ObfuscatedName("am.au(I)Laj;")
    public final class21 method263() {
        if (this.method259()) {
            return new class21(this.field96);
        } else if (this.method262()) {
            try {
                return (class21) this.field100.get();
            } catch (Exception var3) {
                String var2 = "Error retrieving REST request reply";
                System.err.println(var2 + "\r\n" + var3);
                this.method260(var2);
                return new class21(var2);
            }
        } else {
            return null;
        }
    }
}
