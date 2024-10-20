package deob;

import java.util.concurrent.Future;

@ObfuscatedName("az")
public class class19 {

    @ObfuscatedName("az.at")
    public Future field90;

    @ObfuscatedName("az.an")
    public String field92;

    public class19(Future arg0) {
        this.field90 = arg0;
    }

    public class19(String arg0) {
        this.method276(arg0);
    }

    @ObfuscatedName("az.at(Ljava/lang/String;I)V")
    public void method276(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field92 = arg0;
        if (this.field90 != null) {
            this.field90.cancel(true);
            this.field90 = null;
        }
    }

    @ObfuscatedName("az.an(S)Ljava/lang/String;")
    public final String method267() {
        return this.field92;
    }

    @ObfuscatedName("az.av(B)Z")
    public boolean method273() {
        return this.field92 != null || this.field90 == null;
    }

    @ObfuscatedName("az.as(B)Z")
    public final boolean method268() {
        return this.method273() ? true : this.field90.isDone();
    }

    @ObfuscatedName("az.ax(I)Lai;")
    public final class21 method269() {
        if (this.method273()) {
            return new class21(this.field92);
        } else if (this.method268()) {
            try {
                return (class21) this.field90.get();
            } catch (Exception var3) {
                String var2 = "Error retrieving REST request reply";
                System.err.println(var2 + "\r\n" + var3);
                this.method276(var2);
                return new class21(var2);
            }
        } else {
            return null;
        }
    }
}
