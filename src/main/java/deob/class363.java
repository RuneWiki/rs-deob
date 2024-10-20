package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("mh")
public final class class363 {

    @ObfuscatedName("mh.o")
    public final Comparator field4284;

    @ObfuscatedName("mh.q")
    public final Map field4288;

    @ObfuscatedName("mh.l")
    public final class349 field4283;

    @ObfuscatedName("mh.k")
    public final class349 field4282;

    @ObfuscatedName("mh.a")
    public final long field4281;

    @ObfuscatedName("mh.m")
    public final class361 field4286;

    @ObfuscatedName("mh.p")
    public final int field4287;

    public class363(int arg0, class361 arg1) {
        this(-1L, arg0, arg1);
    }

    public class363(long arg0, int arg1, class361 arg2) {
        this.field4284 = new class362(this);
        this.field4281 = arg0;
        this.field4287 = arg1;
        this.field4286 = arg2;
        if (this.field4287 == -1) {
            this.field4288 = new HashMap(64);
            this.field4283 = new class349(64, this.field4284);
            this.field4282 = null;
        } else if (this.field4286 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4288 = new HashMap(this.field4287);
            this.field4283 = new class349(this.field4287, this.field4284);
            this.field4282 = new class349(this.field4287);
        }
    }

    @ObfuscatedName("mh.o(I)Z")
    public boolean method5905() {
        return this.field4287 != -1;
    }

    @ObfuscatedName("mh.q(Ljava/lang/Object;B)Ljava/lang/Object;")
    public Object method5917(Object arg0) {
        synchronized (this) {
            if (this.field4281 != -1L) {
                this.method5908();
            }
            class364 var3 = (class364) this.field4288.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method5907(var3, false);
                return var3.field4290;
            }
        }
    }

    @ObfuscatedName("mh.l(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method5906(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4281 != -1L) {
                this.method5908();
            }
            class364 var4 = (class364) this.field4288.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4290;
                var4.field4290 = arg1;
                this.method5907(var4, false);
                return var5;
            }
            if (this.method5905() && this.field4288.size() == this.field4287) {
                class364 var6 = (class364) this.field4282.remove();
                this.field4288.remove(var6.field4289);
                this.field4283.remove(var6);
            }
            class364 var7 = new class364(arg1, arg0);
            this.field4288.put(arg0, var7);
            this.method5907(var7, true);
            return null;
        }
    }

    @ObfuscatedName("mh.k(Lmw;ZI)V")
    public void method5907(class364 arg0, boolean arg1) {
        if (!arg1) {
            this.field4283.remove(arg0);
            if (this.method5905() && !this.field4282.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4291 = System.currentTimeMillis();
        if (this.method5905()) {
            switch(this.field4286.field4274) {
                case 0:
                    arg0.field4292 = arg0.field4291;
                    break;
                case 1:
                    arg0.field4292++;
            }
            this.field4282.add(arg0);
        }
        this.field4283.add(arg0);
    }

    @ObfuscatedName("mh.a(B)V")
    public void method5908() {
        if (this.field4281 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4281;
        while (!this.field4283.isEmpty()) {
            class364 var3 = (class364) this.field4283.peek();
            if (var3.field4291 >= var1) {
                return;
            }
            this.field4288.remove(var3.field4289);
            this.field4283.remove(var3);
            if (this.method5905()) {
                this.field4282.remove(var3);
            }
        }
    }
}
