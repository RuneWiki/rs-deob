package deob;

import java.util.concurrent.Future;

@ObfuscatedName("ao")
public class class19 {

    @ObfuscatedName("ao.aq")
    public Future field81;

    @ObfuscatedName("ao.ad")
    public String field79;

    public class19(Future arg0) {
        this.field81 = arg0;
    }

    public class19(String arg0) {
        this.method260(arg0);
    }

    @ObfuscatedName("ao.aq(Ljava/lang/String;B)V")
    public void method260(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field79 = arg0;
        if (this.field81 != null) {
            this.field81.cancel(true);
            this.field81 = null;
        }
    }

    @ObfuscatedName("ao.ad(S)Ljava/lang/String;")
    public final String method263() {
        return this.field79;
    }

    @ObfuscatedName("ao.ag(I)Z")
    public boolean method258() {
        return this.field79 != null || this.field81 == null;
    }

    @ObfuscatedName("ao.ak(I)Z")
    public final boolean method274() {
        return this.method258() ? true : this.field81.isDone();
    }

    @ObfuscatedName("ao.ap(I)Las;")
    public final class21 method265() {
        if (this.method258()) {
            return new class21(this.field79);
        } else if (this.method274()) {
            try {
                return (class21) this.field81.get();
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
