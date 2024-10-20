package deob;

import java.util.concurrent.Future;

@ObfuscatedName("as")
public class class19 {

    @ObfuscatedName("as.ak")
    public Future field91;

    @ObfuscatedName("as.al")
    public String field92;

    public class19(Future arg0) {
        this.field91 = arg0;
    }

    public class19(String arg0) {
        this.method246(arg0);
    }

    @ObfuscatedName("as.ak(Ljava/lang/String;I)V")
    public void method246(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field92 = arg0;
        if (this.field91 != null) {
            this.field91.cancel(true);
            this.field91 = null;
        }
    }

    @ObfuscatedName("as.al(I)Ljava/lang/String;")
    public final String method250() {
        return this.field92;
    }

    @ObfuscatedName("as.aj(I)Z")
    public boolean method247() {
        return this.field92 != null || this.field91 == null;
    }

    @ObfuscatedName("as.az(S)Z")
    public final boolean method248() {
        return this.method247() ? true : this.field91.isDone();
    }

    @ObfuscatedName("as.af(I)Lad;")
    public final class21 method254() {
        if (this.method247()) {
            return new class21(this.field92);
        } else if (this.method248()) {
            try {
                return (class21) this.field91.get();
            } catch (Exception var3) {
                String var2 = "Error retrieving REST request reply";
                System.err.println(var2 + "\r\n" + var3);
                this.method246(var2);
                return new class21(var2);
            }
        } else {
            return null;
        }
    }
}
