package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("nb")
public final class class382 {

    @ObfuscatedName("nb.a")
    public final Comparator field4447;

    @ObfuscatedName("nb.f")
    public final Map field4443;

    @ObfuscatedName("nb.c")
    public final class364 field4442;

    @ObfuscatedName("nb.x")
    public final class364 field4444;

    @ObfuscatedName("nb.h")
    public final long field4445;

    @ObfuscatedName("nb.j")
    public final class380 field4446;

    @ObfuscatedName("nb.y")
    public final int field4448;

    public class382(int arg0, class380 arg1) {
        this(-1L, arg0, arg1);
    }

    public class382(long arg0, int arg1, class380 arg2) {
        this.field4447 = new class381(this);
        this.field4445 = arg0;
        this.field4448 = arg1;
        this.field4446 = arg2;
        if (this.field4448 == -1) {
            this.field4443 = new HashMap(64);
            this.field4442 = new class364(64, this.field4447);
            this.field4444 = null;
        } else if (this.field4446 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4443 = new HashMap(this.field4448);
            this.field4442 = new class364(this.field4448, this.field4447);
            this.field4444 = new class364(this.field4448);
        }
    }

    @ObfuscatedName("nb.a(I)Z")
    public boolean method6628() {
        return this.field4448 != -1;
    }

    @ObfuscatedName("nb.f(Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method6622(Object arg0) {
        synchronized (this) {
            if (this.field4445 != -1L) {
                this.method6625();
            }
            class383 var3 = (class383) this.field4443.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method6629(var3, false);
                return var3.field4455;
            }
        }
    }

    @ObfuscatedName("nb.c(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method6623(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4445 != -1L) {
                this.method6625();
            }
            class383 var4 = (class383) this.field4443.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4455;
                var4.field4455 = arg1;
                this.method6629(var4, false);
                return var5;
            }
            if (this.method6628() && this.field4443.size() == this.field4448) {
                class383 var6 = (class383) this.field4444.remove();
                this.field4443.remove(var6.field4451);
                this.field4442.remove(var6);
            }
            class383 var7 = new class383(arg1, arg0);
            this.field4443.put(arg0, var7);
            this.method6629(var7, true);
            return null;
        }
    }

    @ObfuscatedName("nb.x(Lng;ZI)V")
    public void method6629(class383 arg0, boolean arg1) {
        if (!arg1) {
            this.field4442.remove(arg0);
            if (this.method6628() && !this.field4444.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4452 = System.currentTimeMillis();
        if (this.method6628()) {
            switch(this.field4446.field4435) {
                case 0:
                    arg0.field4454 = arg0.field4452;
                    break;
                case 1:
                    arg0.field4454++;
            }
            this.field4444.add(arg0);
        }
        this.field4442.add(arg0);
    }

    @ObfuscatedName("nb.h(I)V")
    public void method6625() {
        if (this.field4445 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4445;
        while (!this.field4442.isEmpty()) {
            class383 var3 = (class383) this.field4442.peek();
            if (var3.field4452 >= var1) {
                return;
            }
            this.field4443.remove(var3.field4451);
            this.field4442.remove(var3);
            if (this.method6628()) {
                this.field4444.remove(var3);
            }
        }
    }
}
