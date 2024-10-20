package deob;

import java.util.concurrent.Future;

@ObfuscatedName("ay")
public class class19 {

    @ObfuscatedName("ay.am")
    public Future field82;

    @ObfuscatedName("ay.ap")
    public String field78;

    public class19(Future arg0) {
        this.field82 = arg0;
    }

    public class19(String arg0) {
        this.method269(arg0);
    }

    @ObfuscatedName("ay.am(Ljava/lang/String;B)V")
    public void method269(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field78 = arg0;
        if (this.field82 != null) {
            this.field82.cancel(true);
            this.field82 = null;
        }
    }

    @ObfuscatedName("ay.ap(B)Ljava/lang/String;")
    public final String method273() {
        return this.field78;
    }

    @ObfuscatedName("ay.af(I)Z")
    public boolean method271() {
        return this.field78 != null || this.field82 == null;
    }

    @ObfuscatedName("ay.aj(I)Z")
    public final boolean method272() {
        return this.method271() ? true : this.field82.isDone();
    }

    @ObfuscatedName("ay.aq(B)Lab;")
    public final class21 method283() {
        if (this.method271()) {
            return new class21(this.field78);
        } else if (this.method272()) {
            try {
                return (class21) this.field82.get();
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
