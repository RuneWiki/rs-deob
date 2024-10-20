package deob;

import java.util.concurrent.Future;

@ObfuscatedName("ad")
public class class19 {

    @ObfuscatedName("ad.aq")
    public Future field85;

    @ObfuscatedName("ad.aw")
    public String field88;

    public class19(Future arg0) {
        this.field85 = arg0;
    }

    public class19(String arg0) {
        this.method235(arg0);
    }

    @ObfuscatedName("ad.aq(Ljava/lang/String;B)V")
    public void method235(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field88 = arg0;
        if (this.field85 != null) {
            this.field85.cancel(true);
            this.field85 = null;
        }
    }

    @ObfuscatedName("ad.aw(B)Ljava/lang/String;")
    public final String method232() {
        return this.field88;
    }

    @ObfuscatedName("ad.al(I)Z")
    public boolean method233() {
        return this.field88 != null || this.field85 == null;
    }

    @ObfuscatedName("ad.ai(I)Z")
    public final boolean method245() {
        return this.method233() ? true : this.field85.isDone();
    }

    @ObfuscatedName("ad.ar(I)Lay;")
    public final class21 method234() {
        if (this.method233()) {
            return new class21(this.field88);
        } else if (this.method245()) {
            try {
                return (class21) this.field85.get();
            } catch (Exception var3) {
                String var2 = "Error retrieving REST request reply";
                System.err.println(var2 + "\r\n" + var3);
                this.method235(var2);
                return new class21(var2);
            }
        } else {
            return null;
        }
    }
}
