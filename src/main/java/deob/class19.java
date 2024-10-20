package deob;

import java.util.concurrent.Future;

@ObfuscatedName("aq")
public class class19 {

    @ObfuscatedName("aq.at")
    public Future field87;

    @ObfuscatedName("aq.ah")
    public String field85;

    public class19(Future arg0) {
        this.field87 = arg0;
    }

    public class19(String arg0) {
        this.method259(arg0);
    }

    @ObfuscatedName("aq.at(Ljava/lang/String;I)V")
    public void method259(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field85 = arg0;
        if (this.field87 != null) {
            this.field87.cancel(true);
            this.field87 = null;
        }
    }

    @ObfuscatedName("aq.ah(B)Ljava/lang/String;")
    public final String method258() {
        return this.field85;
    }

    @ObfuscatedName("aq.ar(I)Z")
    public boolean method261() {
        return this.field85 != null || this.field87 == null;
    }

    @ObfuscatedName("aq.ao(B)Z")
    public final boolean method277() {
        return this.method261() ? true : this.field87.isDone();
    }

    @ObfuscatedName("aq.ab(B)Law;")
    public final class21 method263() {
        if (this.method261()) {
            return new class21(this.field85);
        } else if (this.method277()) {
            try {
                return (class21) this.field87.get();
            } catch (Exception var3) {
                String var2 = "Error retrieving REST request reply";
                System.err.println(var2 + "\r\n" + var3);
                this.method259(var2);
                return new class21(var2);
            }
        } else {
            return null;
        }
    }
}
