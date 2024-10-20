package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("mg")
public final class class362 {

    @ObfuscatedName("mg.v")
    public final Comparator field4218;

    @ObfuscatedName("mg.c")
    public final Map field4219;

    @ObfuscatedName("mg.i")
    public final class343 field4215;

    @ObfuscatedName("mg.f")
    public final class343 field4216;

    @ObfuscatedName("mg.b")
    public final long field4220;

    @ObfuscatedName("mg.n")
    public final class360 field4217;

    @ObfuscatedName("mg.s")
    public final int field4213;

    public class362(int arg0, class360 arg1) {
        this(-1L, arg0, arg1);
    }

    public class362(long arg0, int arg1, class360 arg2) {
        this.field4218 = new class361(this);
        this.field4220 = arg0;
        this.field4213 = arg1;
        this.field4217 = arg2;
        if (this.field4213 == -1) {
            this.field4219 = new HashMap(64);
            this.field4215 = new class343(64, this.field4218);
            this.field4216 = null;
        } else if (this.field4217 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4219 = new HashMap(this.field4213);
            this.field4215 = new class343(this.field4213, this.field4218);
            this.field4216 = new class343(this.field4213);
        }
    }

    @ObfuscatedName("mg.v(I)Z")
    public boolean method6000() {
        return this.field4213 != -1;
    }

    @ObfuscatedName("mg.c(Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method6007(Object arg0) {
        synchronized (this) {
            if (this.field4220 != -1L) {
                this.method6004();
            }
            class363 var3 = (class363) this.field4219.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method6006(var3, false);
                return var3.field4222;
            }
        }
    }

    @ObfuscatedName("mg.i(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method6002(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4220 != -1L) {
                this.method6004();
            }
            class363 var4 = (class363) this.field4219.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4222;
                var4.field4222 = arg1;
                this.method6006(var4, false);
                return var5;
            }
            if (this.method6000() && this.field4219.size() == this.field4213) {
                class363 var6 = (class363) this.field4216.remove();
                this.field4219.remove(var6.field4225);
                this.field4215.remove(var6);
            }
            class363 var7 = new class363(arg1, arg0);
            this.field4219.put(arg0, var7);
            this.method6006(var7, true);
            return null;
        }
    }

    @ObfuscatedName("mg.f(Lmv;ZI)V")
    public void method6006(class363 arg0, boolean arg1) {
        if (!arg1) {
            this.field4215.remove(arg0);
            if (this.method6000() && !this.field4216.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4223 = System.currentTimeMillis();
        if (this.method6000()) {
            switch(this.field4217.field4207) {
                case 0:
                    arg0.field4224++;
                    break;
                case 1:
                    arg0.field4224 = arg0.field4223;
            }
            this.field4216.add(arg0);
        }
        this.field4215.add(arg0);
    }

    @ObfuscatedName("mg.b(I)V")
    public void method6004() {
        if (this.field4220 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4220;
        while (!this.field4215.isEmpty()) {
            class363 var3 = (class363) this.field4215.peek();
            if (var3.field4223 >= var1) {
                return;
            }
            this.field4219.remove(var3.field4225);
            this.field4215.remove(var3);
            if (this.method6000()) {
                this.field4216.remove(var3);
            }
        }
    }
}
