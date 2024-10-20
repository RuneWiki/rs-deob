package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("rt")
public final class class444 {

    @ObfuscatedName("rt.az")
    public final Comparator field4754;

    @ObfuscatedName("rt.ah")
    public final Map field4759;

    @ObfuscatedName("rt.af")
    public final class413 field4753;

    @ObfuscatedName("rt.at")
    public final class413 field4755;

    @ObfuscatedName("rt.an")
    public final long field4756;

    @ObfuscatedName("rt.ao")
    public final class442 field4757;

    @ObfuscatedName("rt.ab")
    public final int field4758;

    public class444(int arg0, class442 arg1) {
        this(-1L, arg0, arg1);
    }

    public class444(long arg0, int arg1, class442 arg2) {
        this.field4754 = new class443(this);
        this.field4756 = arg0;
        this.field4758 = arg1;
        this.field4757 = arg2;
        if (this.field4758 == -1) {
            this.field4759 = new HashMap(64);
            this.field4753 = new class413(64, this.field4754);
            this.field4755 = null;
        } else if (this.field4757 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4759 = new HashMap(this.field4758);
            this.field4753 = new class413(this.field4758, this.field4754);
            this.field4755 = new class413(this.field4758);
        }
    }

    @ObfuscatedName("rt.az(I)Z")
    public boolean method7332() {
        return this.field4758 != -1;
    }

    @ObfuscatedName("rt.ah(Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method7340(Object arg0) {
        synchronized (this) {
            if (this.field4756 != -1L) {
                this.method7335();
            }
            class445 var3 = (class445) this.field4759.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method7339(var3, false);
                return var3.field4763;
            }
        }
    }

    @ObfuscatedName("rt.af(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method7333(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4756 != -1L) {
                this.method7335();
            }
            class445 var4 = (class445) this.field4759.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4763;
                var4.field4763 = arg1;
                this.method7339(var4, false);
                return var5;
            }
            if (this.method7332() && this.field4759.size() == this.field4758) {
                class445 var6 = (class445) this.field4755.remove();
                this.field4759.remove(var6.field4762);
                this.field4753.remove(var6);
            }
            class445 var7 = new class445(arg1, arg0);
            this.field4759.put(arg0, var7);
            this.method7339(var7, true);
            return null;
        }
    }

    @ObfuscatedName("rt.at(Lrv;ZI)V")
    public void method7339(class445 arg0, boolean arg1) {
        if (!arg1) {
            this.field4753.remove(arg0);
            if (this.method7332() && !this.field4755.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4761 = System.currentTimeMillis();
        if (this.method7332()) {
            switch(this.field4757.field4748) {
                case 0:
                    arg0.field4764++;
                    break;
                case 1:
                    arg0.field4764 = arg0.field4761;
            }
            this.field4755.add(arg0);
        }
        this.field4753.add(arg0);
    }

    @ObfuscatedName("rt.an(I)V")
    public void method7335() {
        if (this.field4756 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4756;
        while (!this.field4753.isEmpty()) {
            class445 var3 = (class445) this.field4753.peek();
            if (var3.field4761 >= var1) {
                return;
            }
            this.field4759.remove(var3.field4762);
            this.field4753.remove(var3);
            if (this.method7332()) {
                this.field4755.remove(var3);
            }
        }
    }

    @ObfuscatedName("rt.ao(B)V")
    public void method7336() {
        synchronized (this) {
            this.field4759.clear();
            this.field4753.clear();
            if (this.method7332()) {
                this.field4755.clear();
            }
        }
    }
}
