package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("ql")
public final class class425 {

    @ObfuscatedName("ql.aw")
    public final Comparator field4615;

    @ObfuscatedName("ql.ay")
    public final Map field4619;

    @ObfuscatedName("ql.ar")
    public final class394 field4617;

    @ObfuscatedName("ql.am")
    public final class394 field4616;

    @ObfuscatedName("ql.as")
    public final long field4622;

    @ObfuscatedName("ql.aj")
    public final class423 field4620;

    @ObfuscatedName("ql.ag")
    public final int field4621;

    public class425(int arg0, class423 arg1) {
        this(-1L, arg0, arg1);
    }

    public class425(long arg0, int arg1, class423 arg2) {
        this.field4615 = new class424(this);
        this.field4622 = arg0;
        this.field4621 = arg1;
        this.field4620 = arg2;
        if (this.field4621 == -1) {
            this.field4619 = new HashMap(64);
            this.field4617 = new class394(64, this.field4615);
            this.field4616 = null;
        } else if (this.field4620 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4619 = new HashMap(this.field4621);
            this.field4617 = new class394(this.field4621, this.field4615);
            this.field4616 = new class394(this.field4621);
        }
    }

    @ObfuscatedName("ql.aw(I)Z")
    public boolean method7124() {
        return this.field4621 != -1;
    }

    @ObfuscatedName("ql.ay(Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method7125(Object arg0) {
        synchronized (this) {
            if (this.field4622 != -1L) {
                this.method7128();
            }
            class426 var3 = (class426) this.field4619.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method7127(var3, false);
                return var3.field4625;
            }
        }
    }

    @ObfuscatedName("ql.ar(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method7126(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4622 != -1L) {
                this.method7128();
            }
            class426 var4 = (class426) this.field4619.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4625;
                var4.field4625 = arg1;
                this.method7127(var4, false);
                return var5;
            }
            if (this.method7124() && this.field4619.size() == this.field4621) {
                class426 var6 = (class426) this.field4616.remove();
                this.field4619.remove(var6.field4627);
                this.field4617.remove(var6);
            }
            class426 var7 = new class426(arg1, arg0);
            this.field4619.put(arg0, var7);
            this.method7127(var7, true);
            return null;
        }
    }

    @ObfuscatedName("ql.am(Lqr;ZI)V")
    public void method7127(class426 arg0, boolean arg1) {
        if (!arg1) {
            this.field4617.remove(arg0);
            if (this.method7124() && !this.field4616.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4626 = System.currentTimeMillis();
        if (this.method7124()) {
            switch(this.field4620.field4612) {
                case 0:
                    arg0.field4624++;
                    break;
                case 1:
                    arg0.field4624 = arg0.field4626;
            }
            this.field4616.add(arg0);
        }
        this.field4617.add(arg0);
    }

    @ObfuscatedName("ql.as(B)V")
    public void method7128() {
        if (this.field4622 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4622;
        while (!this.field4617.isEmpty()) {
            class426 var3 = (class426) this.field4617.peek();
            if (var3.field4626 >= var1) {
                return;
            }
            this.field4619.remove(var3.field4627);
            this.field4617.remove(var3);
            if (this.method7124()) {
                this.field4616.remove(var3);
            }
        }
    }

    @ObfuscatedName("ql.aj(I)V")
    public void method7145() {
        synchronized (this) {
            this.field4619.clear();
            this.field4617.clear();
            if (this.method7124()) {
                this.field4616.clear();
            }
        }
    }
}
