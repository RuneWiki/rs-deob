package deob;

import java.util.concurrent.Future;

@ObfuscatedName("t")
public class class20 {

    @ObfuscatedName("t.h")
    public Future field113;

    @ObfuscatedName("t.e")
    public String field110;

    public class20(Future arg0) {
        this.field113 = arg0;
    }

    public class20(String arg0) {
        this.method265(arg0);
    }

    @ObfuscatedName("t.h(Ljava/lang/String;I)V")
    public void method265(String arg0) {
        if (arg0 == null) {
            arg0 = "";
        }
        this.field110 = arg0;
        if (this.field113 != null) {
            this.field113.cancel(true);
            this.field113 = null;
        }
    }

    @ObfuscatedName("t.e(B)Ljava/lang/String;")
    public final String method266() {
        return this.field110;
    }

    @ObfuscatedName("t.v(B)Z")
    public boolean method272() {
        return this.field110 != null || this.field113 == null;
    }

    @ObfuscatedName("t.x(B)Z")
    public final boolean method270() {
        return this.method272() ? true : this.field113.isDone();
    }

    @ObfuscatedName("t.m(S)Lp;")
    public final class22 method277() {
        if (this.method272()) {
            return new class22(this.field110);
        } else if (this.method270()) {
            try {
                return (class22) this.field113.get();
            } catch (Exception var3) {
                String var2 = "Error retrieving REST request reply";
                System.err.println(var2 + "\r\n" + var3);
                this.method265(var2);
                return new class22(var2);
            }
        } else {
            return null;
        }
    }
}
