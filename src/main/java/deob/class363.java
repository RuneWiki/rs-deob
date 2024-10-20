package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("mv")
public final class class363 {

    @ObfuscatedName("mv.s")
    public final Comparator field4269;

    @ObfuscatedName("mv.h")
    public final Map field4262;

    @ObfuscatedName("mv.w")
    public final class349 field4265;

    @ObfuscatedName("mv.v")
    public final class349 field4264;

    @ObfuscatedName("mv.c")
    public final long field4261;

    @ObfuscatedName("mv.q")
    public final class361 field4266;

    @ObfuscatedName("mv.i")
    public final int field4267;

    public class363(int arg0, class361 arg1) {
        this(-1L, arg0, arg1);
    }

    public class363(long arg0, int arg1, class361 arg2) {
        this.field4269 = new class362(this);
        this.field4261 = arg0;
        this.field4267 = arg1;
        this.field4266 = arg2;
        if (this.field4267 == -1) {
            this.field4262 = new HashMap(64);
            this.field4265 = new class349(64, this.field4269);
            this.field4264 = null;
        } else if (this.field4266 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4262 = new HashMap(this.field4267);
            this.field4265 = new class349(this.field4267, this.field4269);
            this.field4264 = new class349(this.field4267);
        }
    }

    @ObfuscatedName("mv.s(B)Z")
    public boolean method5896() {
        return this.field4267 != -1;
    }

    @ObfuscatedName("mv.h(Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method5897(Object arg0) {
        synchronized (this) {
            if (this.field4261 != -1L) {
                this.method5907();
            }
            class364 var3 = (class364) this.field4262.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method5899(var3, false);
                return var3.field4273;
            }
        }
    }

    @ObfuscatedName("mv.w(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method5898(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4261 != -1L) {
                this.method5907();
            }
            class364 var4 = (class364) this.field4262.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4273;
                var4.field4273 = arg1;
                this.method5899(var4, false);
                return var5;
            }
            if (this.method5896() && this.field4262.size() == this.field4267) {
                class364 var6 = (class364) this.field4264.remove();
                this.field4262.remove(var6.field4272);
                this.field4265.remove(var6);
            }
            class364 var7 = new class364(arg1, arg0);
            this.field4262.put(arg0, var7);
            this.method5899(var7, true);
            return null;
        }
    }

    @ObfuscatedName("mv.v(Lmi;ZB)V")
    public void method5899(class364 arg0, boolean arg1) {
        if (!arg1) {
            this.field4265.remove(arg0);
            if (this.method5896() && !this.field4264.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4271 = System.currentTimeMillis();
        if (this.method5896()) {
            switch(this.field4266.field4259) {
                case 0:
                    arg0.field4274 = arg0.field4271;
                    break;
                case 1:
                    arg0.field4274++;
            }
            this.field4264.add(arg0);
        }
        this.field4265.add(arg0);
    }

    @ObfuscatedName("mv.c(I)V")
    public void method5907() {
        if (this.field4261 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4261;
        while (!this.field4265.isEmpty()) {
            class364 var3 = (class364) this.field4265.peek();
            if (var3.field4271 >= var1) {
                return;
            }
            this.field4262.remove(var3.field4272);
            this.field4265.remove(var3);
            if (this.method5896()) {
                this.field4264.remove(var3);
            }
        }
    }
}
