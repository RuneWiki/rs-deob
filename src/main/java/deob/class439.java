package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("qe")
public final class class439 {

    @ObfuscatedName("qe.ac")
    public final Comparator field4656;

    @ObfuscatedName("qe.al")
    public final Map field4657;

    @ObfuscatedName("qe.ak")
    public final class408 field4658;

    @ObfuscatedName("qe.ax")
    public final class408 field4659;

    @ObfuscatedName("qe.ao")
    public final long field4660;

    @ObfuscatedName("qe.ah")
    public final class437 field4663;

    @ObfuscatedName("qe.ar")
    public final int field4661;

    public class439(int arg0, class437 arg1) {
        this(-1L, arg0, arg1);
    }

    public class439(long arg0, int arg1, class437 arg2) {
        this.field4656 = new class438(this);
        this.field4660 = arg0;
        this.field4661 = arg1;
        this.field4663 = arg2;
        if (this.field4661 == -1) {
            this.field4657 = new HashMap(64);
            this.field4658 = new class408(64, this.field4656);
            this.field4659 = null;
        } else if (this.field4663 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4657 = new HashMap(this.field4661);
            this.field4658 = new class408(this.field4661, this.field4656);
            this.field4659 = new class408(this.field4661);
        }
    }

    @ObfuscatedName("qe.ac(B)Z")
    public boolean method7227() {
        return this.field4661 != -1;
    }

    @ObfuscatedName("qe.al(Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method7237(Object arg0) {
        synchronized (this) {
            if (this.field4660 != -1L) {
                this.method7230();
            }
            class440 var3 = (class440) this.field4657.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method7241(var3, false);
                return var3.field4667;
            }
        }
    }

    @ObfuscatedName("qe.ak(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method7228(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4660 != -1L) {
                this.method7230();
            }
            class440 var4 = (class440) this.field4657.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4667;
                var4.field4667 = arg1;
                this.method7241(var4, false);
                return var5;
            }
            if (this.method7227() && this.field4657.size() == this.field4661) {
                class440 var6 = (class440) this.field4659.remove();
                this.field4657.remove(var6.field4665);
                this.field4658.remove(var6);
            }
            class440 var7 = new class440(arg1, arg0);
            this.field4657.put(arg0, var7);
            this.method7241(var7, true);
            return null;
        }
    }

    @ObfuscatedName("qe.ax(Lqd;ZI)V")
    public void method7241(class440 arg0, boolean arg1) {
        if (!arg1) {
            this.field4658.remove(arg0);
            if (this.method7227() && !this.field4659.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4666 = System.currentTimeMillis();
        if (this.method7227()) {
            switch(this.field4663.field4651) {
                case 0:
                    arg0.field4664++;
                    break;
                case 1:
                    arg0.field4664 = arg0.field4666;
            }
            this.field4659.add(arg0);
        }
        this.field4658.add(arg0);
    }

    @ObfuscatedName("qe.ao(B)V")
    public void method7230() {
        if (this.field4660 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4660;
        while (!this.field4658.isEmpty()) {
            class440 var3 = (class440) this.field4658.peek();
            if (var3.field4666 >= var1) {
                return;
            }
            this.field4657.remove(var3.field4665);
            this.field4658.remove(var3);
            if (this.method7227()) {
                this.field4659.remove(var3);
            }
        }
    }

    @ObfuscatedName("qe.ah(B)V")
    public void method7231() {
        synchronized (this) {
            this.field4657.clear();
            this.field4658.clear();
            if (this.method7227()) {
                this.field4659.clear();
            }
        }
    }
}
