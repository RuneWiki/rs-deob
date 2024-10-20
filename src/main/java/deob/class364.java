package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("mk")
public final class class364 {

    @ObfuscatedName("mk.c")
    public final Comparator field4313;

    @ObfuscatedName("mk.p")
    public final Map field4310;

    @ObfuscatedName("mk.f")
    public final class350 field4308;

    @ObfuscatedName("mk.n")
    public final class350 field4309;

    @ObfuscatedName("mk.k")
    public final long field4306;

    @ObfuscatedName("mk.w")
    public final class362 field4311;

    @ObfuscatedName("mk.s")
    public final int field4312;

    public class364(int arg0, class362 arg1) {
        this(-1L, arg0, arg1);
    }

    public class364(long arg0, int arg1, class362 arg2) {
        this.field4313 = new class363(this);
        this.field4306 = arg0;
        this.field4312 = arg1;
        this.field4311 = arg2;
        if (this.field4312 == -1) {
            this.field4310 = new HashMap(64);
            this.field4308 = new class350(64, this.field4313);
            this.field4309 = null;
        } else if (this.field4311 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4310 = new HashMap(this.field4312);
            this.field4308 = new class350(this.field4312, this.field4313);
            this.field4309 = new class350(this.field4312);
        }
    }

    @ObfuscatedName("mk.c(I)Z")
    public boolean method6129() {
        return this.field4312 != -1;
    }

    @ObfuscatedName("mk.p(Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method6140(Object arg0) {
        synchronized (this) {
            if (this.field4306 != -1L) {
                this.method6131();
            }
            class365 var3 = (class365) this.field4310.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method6130(var3, false);
                return var3.field4320;
            }
        }
    }

    @ObfuscatedName("mk.f(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method6132(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4306 != -1L) {
                this.method6131();
            }
            class365 var4 = (class365) this.field4310.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4320;
                var4.field4320 = arg1;
                this.method6130(var4, false);
                return var5;
            }
            if (this.method6129() && this.field4310.size() == this.field4312) {
                class365 var6 = (class365) this.field4309.remove();
                this.field4310.remove(var6.field4317);
                this.field4308.remove(var6);
            }
            class365 var7 = new class365(arg1, arg0);
            this.field4310.put(arg0, var7);
            this.method6130(var7, true);
            return null;
        }
    }

    @ObfuscatedName("mk.n(Lns;ZI)V")
    public void method6130(class365 arg0, boolean arg1) {
        if (!arg1) {
            this.field4308.remove(arg0);
            if (this.method6129() && !this.field4309.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4318 = System.currentTimeMillis();
        if (this.method6129()) {
            switch(this.field4311.field4303) {
                case 0:
                    arg0.field4319 = arg0.field4318;
                    break;
                case 1:
                    arg0.field4319++;
            }
            this.field4309.add(arg0);
        }
        this.field4308.add(arg0);
    }

    @ObfuscatedName("mk.k(B)V")
    public void method6131() {
        if (this.field4306 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4306;
        while (!this.field4308.isEmpty()) {
            class365 var3 = (class365) this.field4308.peek();
            if (var3.field4318 >= var1) {
                return;
            }
            this.field4310.remove(var3.field4317);
            this.field4308.remove(var3);
            if (this.method6129()) {
                this.field4309.remove(var3);
            }
        }
    }
}
