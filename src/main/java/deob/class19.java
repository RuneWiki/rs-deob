package deob;

import java.util.concurrent.Future;

@ObfuscatedName("ad")
public class class19 {

    @ObfuscatedName("ad.ap")
    public Future field66;

    @ObfuscatedName("ad.aw")
    public String field68;

    public class19(Future arg0) {
        this.field66 = arg0;
    }

    public class19(String arg0) {
        this.method255(arg0);
    }

    @ObfuscatedName("ad.ap(Ljava/lang/String;I)V")
    public void method255(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field68 = arg0;
        if (this.field66 != null) {
            this.field66.cancel(true);
            this.field66 = null;
        }
    }

    @ObfuscatedName("ad.aw(S)Ljava/lang/String;")
    public final String method258() {
        return this.field68;
    }

    @ObfuscatedName("ad.ak(I)Z")
    public boolean method272() {
        return this.field68 != null || this.field66 == null;
    }

    @ObfuscatedName("ad.aj(B)Z")
    public final boolean method263() {
        return this.method272() ? true : this.field66.isDone();
    }

    @ObfuscatedName("ad.ai(B)Lav;")
    public final class21 method261() {
        if (this.method272()) {
            return new class21(this.field68);
        } else if (this.method263()) {
            try {
                return (class21) this.field66.get();
            } catch (Exception var3) {
                String var2 = "Error retrieving REST request reply";
                System.err.println(var2 + "\r\n" + var3);
                this.method255(var2);
                return new class21(var2);
            }
        } else {
            return null;
        }
    }
}
