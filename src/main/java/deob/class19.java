package deob;

import java.util.concurrent.Future;

@ObfuscatedName("ag")
public class class19 {

    @ObfuscatedName("ag.ab")
    public Future field69;

    @ObfuscatedName("ag.ay")
    public String field68;

    public class19(Future arg0) {
        this.field69 = arg0;
    }

    public class19(String arg0) {
        this.method251(arg0);
    }

    @ObfuscatedName("ag.ab(Ljava/lang/String;I)V")
    public void method251(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field68 = arg0;
        if (this.field69 != null) {
            this.field69.cancel(true);
            this.field69 = null;
        }
    }

    @ObfuscatedName("ag.ay(I)Ljava/lang/String;")
    public final String method243() {
        return this.field68;
    }

    @ObfuscatedName("ag.an(I)Z")
    public boolean method244() {
        return this.field68 != null || this.field69 == null;
    }

    @ObfuscatedName("ag.au(B)Z")
    public final boolean method247() {
        return this.method244() ? true : this.field69.isDone();
    }

    @ObfuscatedName("ag.ax(I)Lar;")
    public final class21 method246() {
        if (this.method244()) {
            return new class21(this.field68);
        } else if (this.method247()) {
            try {
                return (class21) this.field69.get();
            } catch (Exception var3) {
                String var2 = "Error retrieving REST request reply";
                System.err.println(var2 + "\r\n" + var3);
                this.method251(var2);
                return new class21(var2);
            }
        } else {
            return null;
        }
    }
}
