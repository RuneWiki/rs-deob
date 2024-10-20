package deob;

import java.util.concurrent.Future;

@ObfuscatedName("ad")
public class class19 {

    @ObfuscatedName("ad.aw")
    public Future field97;

    @ObfuscatedName("ad.ay")
    public String field95;

    public class19(Future arg0) {
        this.field97 = arg0;
    }

    public class19(String arg0) {
        this.method254(arg0);
    }

    @ObfuscatedName("ad.aw(Ljava/lang/String;B)V")
    public void method254(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field95 = arg0;
        if (this.field97 != null) {
            this.field97.cancel(true);
            this.field97 = null;
        }
    }

    @ObfuscatedName("ad.ay(B)Ljava/lang/String;")
    public final String method255() {
        return this.field95;
    }

    @ObfuscatedName("ad.ar(S)Z")
    public boolean method256() {
        return this.field95 != null || this.field97 == null;
    }

    @ObfuscatedName("ad.am(B)Z")
    public final boolean method253() {
        return this.method256() ? true : this.field97.isDone();
    }

    @ObfuscatedName("ad.as(B)Lac;")
    public final class21 method258() {
        if (this.method256()) {
            return new class21(this.field95);
        } else if (this.method253()) {
            try {
                return (class21) this.field97.get();
            } catch (Exception var3) {
                String var2 = "Error retrieving REST request reply";
                System.err.println(var2 + "\r\n" + var3);
                this.method254(var2);
                return new class21(var2);
            }
        } else {
            return null;
        }
    }
}
