package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("ry")
public final class class465 {

    @ObfuscatedName("ry.ac")
    public final Comparator field4943;

    @ObfuscatedName("ry.ae")
    public final Map field4940;

    @ObfuscatedName("ry.ag")
    public final class434 field4941;

    @ObfuscatedName("ry.am")
    public final class434 field4942;

    @ObfuscatedName("ry.ax")
    public final long field4939;

    @ObfuscatedName("ry.aq")
    public final class463 field4944;

    @ObfuscatedName("ry.af")
    public final int field4946;

    public class465(int arg0, class463 arg1) {
        this(-1L, arg0, arg1);
    }

    public class465(long arg0, int arg1, class463 arg2) {
        this.field4943 = new class464(this);
        this.field4939 = arg0;
        this.field4946 = arg1;
        this.field4944 = arg2;
        if (this.field4946 == -1) {
            this.field4940 = new HashMap(64);
            this.field4941 = new class434(64, this.field4943);
            this.field4942 = null;
        } else if (this.field4944 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4940 = new HashMap(this.field4946);
            this.field4941 = new class434(this.field4946, this.field4943);
            this.field4942 = new class434(this.field4946);
        }
    }

    @ObfuscatedName("ry.ac(B)Z")
    public boolean method7958() {
        return this.field4946 != -1;
    }

    @ObfuscatedName("ry.ae(Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method7960(Object arg0) {
        synchronized (this) {
            if (this.field4939 != -1L) {
                this.method7972();
            }
            class466 var3 = (class466) this.field4940.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method7966(var3, false);
                return var3.field4948;
            }
        }
    }

    @ObfuscatedName("ry.ag(Ljava/lang/Object;Ljava/lang/Object;S)Ljava/lang/Object;")
    public Object method7961(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4939 != -1L) {
                this.method7972();
            }
            class466 var4 = (class466) this.field4940.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4948;
                var4.field4948 = arg1;
                this.method7966(var4, false);
                return var5;
            }
            if (this.method7958() && this.field4940.size() == this.field4946) {
                class466 var6 = (class466) this.field4942.remove();
                this.field4940.remove(var6.field4949);
                this.field4941.remove(var6);
            }
            class466 var7 = new class466(arg1, arg0);
            this.field4940.put(arg0, var7);
            this.method7966(var7, true);
            return null;
        }
    }

    @ObfuscatedName("ry.am(Lrt;ZI)V")
    public void method7966(class466 arg0, boolean arg1) {
        if (!arg1) {
            this.field4941.remove(arg0);
            if (this.method7958() && !this.field4942.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4950 = System.currentTimeMillis();
        if (this.method7958()) {
            switch(this.field4944.field4930) {
                case 0:
                    arg0.field4951++;
                    break;
                case 1:
                    arg0.field4951 = arg0.field4950;
            }
            this.field4942.add(arg0);
        }
        this.field4941.add(arg0);
    }

    @ObfuscatedName("ry.ax(I)V")
    public void method7972() {
        if (this.field4939 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4939;
        while (!this.field4941.isEmpty()) {
            class466 var3 = (class466) this.field4941.peek();
            if (var3.field4950 >= var1) {
                return;
            }
            this.field4940.remove(var3.field4949);
            this.field4941.remove(var3);
            if (this.method7958()) {
                this.field4942.remove(var3);
            }
        }
    }

    @ObfuscatedName("ry.aq(S)V")
    public void method7964() {
        synchronized (this) {
            this.field4940.clear();
            this.field4941.clear();
            if (this.method7958()) {
                this.field4942.clear();
            }
        }
    }
}
