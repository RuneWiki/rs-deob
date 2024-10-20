package deob;

import java.util.concurrent.Future;

@ObfuscatedName("ai")
public class class19 {

    @ObfuscatedName("ai.ac")
    public Future field99;

    @ObfuscatedName("ai.al")
    public String field100;

    public class19(Future arg0) {
        this.field99 = arg0;
    }

    public class19(String arg0) {
        this.method259(arg0);
    }

    @ObfuscatedName("ai.ac(Ljava/lang/String;I)V")
    public void method259(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field100 = arg0;
        if (this.field99 != null) {
            this.field99.cancel(true);
            this.field99 = null;
        }
    }

    @ObfuscatedName("ai.al(I)Ljava/lang/String;")
    public final String method260() {
        return this.field100;
    }

    @ObfuscatedName("ai.ak(B)Z")
    public boolean method261() {
        return this.field100 != null || this.field99 == null;
    }

    @ObfuscatedName("ai.ax(I)Z")
    public final boolean method270() {
        return this.method261() ? true : this.field99.isDone();
    }

    @ObfuscatedName("ai.ao(I)Law;")
    public final class21 method263() {
        if (this.method261()) {
            return new class21(this.field100);
        } else if (this.method270()) {
            try {
                return (class21) this.field99.get();
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
