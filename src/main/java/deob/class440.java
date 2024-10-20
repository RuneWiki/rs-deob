package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("qj")
public final class class440 {

    @ObfuscatedName("qj.am")
    public final Comparator field4687;

    @ObfuscatedName("qj.ap")
    public final Map field4684;

    @ObfuscatedName("qj.af")
    public final class409 field4688;

    @ObfuscatedName("qj.aj")
    public final class409 field4690;

    @ObfuscatedName("qj.aq")
    public final long field4685;

    @ObfuscatedName("qj.ar")
    public final class438 field4686;

    @ObfuscatedName("qj.ag")
    public final int field4689;

    public class440(int arg0, class438 arg1) {
        this(-1L, arg0, arg1);
    }

    public class440(long arg0, int arg1, class438 arg2) {
        this.field4687 = new class439(this);
        this.field4685 = arg0;
        this.field4689 = arg1;
        this.field4686 = arg2;
        if (this.field4689 == -1) {
            this.field4684 = new HashMap(64);
            this.field4688 = new class409(64, this.field4687);
            this.field4690 = null;
        } else if (this.field4686 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4684 = new HashMap(this.field4689);
            this.field4688 = new class409(this.field4689, this.field4687);
            this.field4690 = new class409(this.field4689);
        }
    }

    @ObfuscatedName("qj.am(I)Z")
    public boolean method7447() {
        return this.field4689 != -1;
    }

    @ObfuscatedName("qj.ap(Ljava/lang/Object;B)Ljava/lang/Object;")
    public Object method7442(Object arg0) {
        synchronized (this) {
            if (this.field4685 != -1L) {
                this.method7445();
            }
            class441 var3 = (class441) this.field4684.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method7444(var3, false);
                return var3.field4694;
            }
        }
    }

    @ObfuscatedName("qj.af(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method7449(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4685 != -1L) {
                this.method7445();
            }
            class441 var4 = (class441) this.field4684.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4694;
                var4.field4694 = arg1;
                this.method7444(var4, false);
                return var5;
            }
            if (this.method7447() && this.field4684.size() == this.field4689) {
                class441 var6 = (class441) this.field4690.remove();
                this.field4684.remove(var6.field4693);
                this.field4688.remove(var6);
            }
            class441 var7 = new class441(arg1, arg0);
            this.field4684.put(arg0, var7);
            this.method7444(var7, true);
            return null;
        }
    }

    @ObfuscatedName("qj.aj(Lqm;ZB)V")
    public void method7444(class441 arg0, boolean arg1) {
        if (!arg1) {
            this.field4688.remove(arg0);
            if (this.method7447() && !this.field4690.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4695 = System.currentTimeMillis();
        if (this.method7447()) {
            switch(this.field4686.field4680) {
                case 0:
                    arg0.field4692++;
                    break;
                case 1:
                    arg0.field4692 = arg0.field4695;
            }
            this.field4690.add(arg0);
        }
        this.field4688.add(arg0);
    }

    @ObfuscatedName("qj.aq(I)V")
    public void method7445() {
        if (this.field4685 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4685;
        while (!this.field4688.isEmpty()) {
            class441 var3 = (class441) this.field4688.peek();
            if (var3.field4695 >= var1) {
                return;
            }
            this.field4684.remove(var3.field4693);
            this.field4688.remove(var3);
            if (this.method7447()) {
                this.field4690.remove(var3);
            }
        }
    }

    @ObfuscatedName("qj.ar(I)V")
    public void method7446() {
        synchronized (this) {
            this.field4684.clear();
            this.field4688.clear();
            if (this.method7447()) {
                this.field4690.clear();
            }
        }
    }
}
