package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("ni")
public final class class385 {

    @ObfuscatedName("ni.h")
    public final Comparator field4496;

    @ObfuscatedName("ni.e")
    public final Map field4490;

    @ObfuscatedName("ni.v")
    public final class367 field4494;

    @ObfuscatedName("ni.x")
    public final class367 field4492;

    @ObfuscatedName("ni.m")
    public final long field4493;

    @ObfuscatedName("ni.q")
    public final class383 field4491;

    @ObfuscatedName("ni.f")
    public final int field4495;

    public class385(int arg0, class383 arg1) {
        this(-1L, arg0, arg1);
    }

    public class385(long arg0, int arg1, class383 arg2) {
        this.field4496 = new class384(this);
        this.field4493 = arg0;
        this.field4495 = arg1;
        this.field4491 = arg2;
        if (this.field4495 == -1) {
            this.field4490 = new HashMap(64);
            this.field4494 = new class367(64, this.field4496);
            this.field4492 = null;
        } else if (this.field4491 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4490 = new HashMap(this.field4495);
            this.field4494 = new class367(this.field4495, this.field4496);
            this.field4492 = new class367(this.field4495);
        }
    }

    @ObfuscatedName("ni.h(I)Z")
    public boolean method6732() {
        return this.field4495 != -1;
    }

    @ObfuscatedName("ni.e(Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method6746(Object arg0) {
        synchronized (this) {
            if (this.field4493 != -1L) {
                this.method6750();
            }
            class386 var3 = (class386) this.field4490.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method6735(var3, false);
                return var3.field4499;
            }
        }
    }

    @ObfuscatedName("ni.v(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method6734(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4493 != -1L) {
                this.method6750();
            }
            class386 var4 = (class386) this.field4490.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4499;
                var4.field4499 = arg1;
                this.method6735(var4, false);
                return var5;
            }
            if (this.method6732() && this.field4490.size() == this.field4495) {
                class386 var6 = (class386) this.field4492.remove();
                this.field4490.remove(var6.field4498);
                this.field4494.remove(var6);
            }
            class386 var7 = new class386(arg1, arg0);
            this.field4490.put(arg0, var7);
            this.method6735(var7, true);
            return null;
        }
    }

    @ObfuscatedName("ni.x(Lnz;ZI)V")
    public void method6735(class386 arg0, boolean arg1) {
        if (!arg1) {
            this.field4494.remove(arg0);
            if (this.method6732() && !this.field4492.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4497 = System.currentTimeMillis();
        if (this.method6732()) {
            switch(this.field4491.field4483) {
                case 0:
                    arg0.field4500 = arg0.field4497;
                    break;
                case 1:
                    arg0.field4500++;
            }
            this.field4492.add(arg0);
        }
        this.field4494.add(arg0);
    }

    @ObfuscatedName("ni.m(I)V")
    public void method6750() {
        if (this.field4493 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4493;
        while (!this.field4494.isEmpty()) {
            class386 var3 = (class386) this.field4494.peek();
            if (var3.field4497 >= var1) {
                return;
            }
            this.field4490.remove(var3.field4498);
            this.field4494.remove(var3);
            if (this.method6732()) {
                this.field4492.remove(var3);
            }
        }
    }

    @ObfuscatedName("ni.q(I)V")
    public void method6747() {
        synchronized (this) {
            this.field4490.clear();
            this.field4494.clear();
            if (this.method6732()) {
                this.field4492.clear();
            }
        }
    }
}
