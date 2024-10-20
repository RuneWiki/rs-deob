package deob;

import java.util.concurrent.Future;

@ObfuscatedName("ag")
public class class19 {

    @ObfuscatedName("ag.aj")
    public Future field101;

    @ObfuscatedName("ag.al")
    public String field91;

    public class19(Future arg0) {
        this.field101 = arg0;
    }

    public class19(String arg0) {
        this.method256(arg0);
    }

    @ObfuscatedName("ag.aj(Ljava/lang/String;I)V")
    public void method256(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field91 = arg0;
        if (this.field101 != null) {
            this.field101.cancel(true);
            this.field101 = null;
        }
    }

    @ObfuscatedName("ag.al(I)Ljava/lang/String;")
    public final String method263() {
        return this.field91;
    }

    @ObfuscatedName("ag.ac(B)Z")
    public boolean method266() {
        return this.field91 != null || this.field101 == null;
    }

    @ObfuscatedName("ag.ab(B)Z")
    public final boolean method258() {
        return this.method266() ? true : this.field101.isDone();
    }

    @ObfuscatedName("ag.an(B)Laf;")
    public final class21 method259() {
        if (this.method266()) {
            return new class21(this.field91);
        } else if (this.method258()) {
            try {
                return (class21) this.field101.get();
            } catch (Exception var3) {
                String var2 = "Error retrieving REST request reply";
                System.err.println(var2 + "\r\n" + var3);
                this.method256(var2);
                return new class21(var2);
            }
        } else {
            return null;
        }
    }
}
