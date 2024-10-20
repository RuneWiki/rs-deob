package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("my")
public final class class362 {

    @ObfuscatedName("my.c")
    public final Comparator field4270;

    @ObfuscatedName("my.v")
    public final Map field4275;

    @ObfuscatedName("my.q")
    public final class348 field4271;

    @ObfuscatedName("my.f")
    public final class348 field4269;

    @ObfuscatedName("my.j")
    public final long field4273;

    @ObfuscatedName("my.e")
    public final class360 field4274;

    @ObfuscatedName("my.g")
    public final int field4272;

    public class362(int arg0, class360 arg1) {
        this(-1L, arg0, arg1);
    }

    public class362(long arg0, int arg1, class360 arg2) {
        this.field4270 = new class361(this);
        this.field4273 = arg0;
        this.field4272 = arg1;
        this.field4274 = arg2;
        if (this.field4272 == -1) {
            this.field4275 = new HashMap(64);
            this.field4271 = new class348(64, this.field4270);
            this.field4269 = null;
        } else if (this.field4274 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4275 = new HashMap(this.field4272);
            this.field4271 = new class348(this.field4272, this.field4270);
            this.field4269 = new class348(this.field4272);
        }
    }

    @ObfuscatedName("my.c(I)Z")
    public boolean method5978() {
        return this.field4272 != -1;
    }

    @ObfuscatedName("my.v(Ljava/lang/Object;B)Ljava/lang/Object;")
    public Object method5967(Object arg0) {
        synchronized (this) {
            if (this.field4273 != -1L) {
                this.method5970();
            }
            class363 var3 = (class363) this.field4275.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method5969(var3, false);
                return var3.field4277;
            }
        }
    }

    @ObfuscatedName("my.q(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method5968(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4273 != -1L) {
                this.method5970();
            }
            class363 var4 = (class363) this.field4275.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4277;
                var4.field4277 = arg1;
                this.method5969(var4, false);
                return var5;
            }
            if (this.method5978() && this.field4275.size() == this.field4272) {
                class363 var6 = (class363) this.field4269.remove();
                this.field4275.remove(var6.field4276);
                this.field4271.remove(var6);
            }
            class363 var7 = new class363(arg1, arg0);
            this.field4275.put(arg0, var7);
            this.method5969(var7, true);
            return null;
        }
    }

    @ObfuscatedName("my.f(Lmv;ZI)V")
    public void method5969(class363 arg0, boolean arg1) {
        if (!arg1) {
            this.field4271.remove(arg0);
            if (this.method5978() && !this.field4269.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4278 = System.currentTimeMillis();
        if (this.method5978()) {
            switch(this.field4274.field4259) {
                case 0:
                    arg0.field4279++;
                    break;
                case 1:
                    arg0.field4279 = arg0.field4278;
            }
            this.field4269.add(arg0);
        }
        this.field4271.add(arg0);
    }

    @ObfuscatedName("my.j(I)V")
    public void method5970() {
        if (this.field4273 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4273;
        while (!this.field4271.isEmpty()) {
            class363 var3 = (class363) this.field4271.peek();
            if (var3.field4278 >= var1) {
                return;
            }
            this.field4275.remove(var3.field4276);
            this.field4271.remove(var3);
            if (this.method5978()) {
                this.field4269.remove(var3);
            }
        }
    }
}
