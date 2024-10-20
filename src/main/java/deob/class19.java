package deob;

import java.util.concurrent.Future;

@ObfuscatedName("ao")
public class class19 {

    @ObfuscatedName("ao.ac")
    public Future field77;

    @ObfuscatedName("ao.ae")
    public String field69;

    public class19(Future arg0) {
        this.field77 = arg0;
    }

    public class19(String arg0) {
        this.method255(arg0);
    }

    @ObfuscatedName("ao.ac(Ljava/lang/String;I)V")
    public void method255(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field69 = arg0;
        if (this.field77 != null) {
            this.field77.cancel(true);
            this.field77 = null;
        }
    }

    @ObfuscatedName("ao.ae(I)Ljava/lang/String;")
    public final String method268() {
        return this.field69;
    }

    @ObfuscatedName("ao.ag(B)Z")
    public boolean method257() {
        return this.field69 != null || this.field77 == null;
    }

    @ObfuscatedName("ao.am(I)Z")
    public final boolean method258() {
        return this.method257() ? true : this.field77.isDone();
    }

    @ObfuscatedName("ao.ax(I)Lay;")
    public final class21 method259() {
        if (this.method257()) {
            return new class21(this.field69);
        } else if (this.method258()) {
            try {
                return (class21) this.field77.get();
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
