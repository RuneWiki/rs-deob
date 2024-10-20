package deob;

import java.util.concurrent.Future;

@ObfuscatedName("ap")
public class class19 {

    @ObfuscatedName("ap.az")
    public Future field81;

    @ObfuscatedName("ap.ah")
    public String field82;

    public class19(Future arg0) {
        this.field81 = arg0;
    }

    public class19(String arg0) {
        this.method257(arg0);
    }

    @ObfuscatedName("ap.az(Ljava/lang/String;I)V")
    public void method257(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field82 = arg0;
        if (this.field81 != null) {
            this.field81.cancel(true);
            this.field81 = null;
        }
    }

    @ObfuscatedName("ap.ah(I)Ljava/lang/String;")
    public final String method253() {
        return this.field82;
    }

    @ObfuscatedName("ap.af(I)Z")
    public boolean method252() {
        return this.field82 != null || this.field81 == null;
    }

    @ObfuscatedName("ap.at(B)Z")
    public final boolean method254() {
        return this.method252() ? true : this.field81.isDone();
    }

    @ObfuscatedName("ap.an(I)Laa;")
    public final class21 method255() {
        if (this.method252()) {
            return new class21(this.field82);
        } else if (this.method254()) {
            try {
                return (class21) this.field81.get();
            } catch (Exception var3) {
                String var2 = "Error retrieving REST request reply";
                System.err.println(var2 + "\r\n" + var3);
                this.method257(var2);
                return new class21(var2);
            }
        } else {
            return null;
        }
    }
}
