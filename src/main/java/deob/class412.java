package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("pa")
public final class class412 {

    @ObfuscatedName("pa.at")
    public final Comparator field4556;

    @ObfuscatedName("pa.an")
    public final Map field4555;

    @ObfuscatedName("pa.av")
    public final class391 field4557;

    @ObfuscatedName("pa.as")
    public final class391 field4563;

    @ObfuscatedName("pa.ax")
    public final long field4558;

    @ObfuscatedName("pa.ap")
    public final class410 field4560;

    @ObfuscatedName("pa.ab")
    public final int field4561;

    public class412(int arg0, class410 arg1) {
        this(-1L, arg0, arg1);
    }

    public class412(long arg0, int arg1, class410 arg2) {
        this.field4556 = new class411(this);
        this.field4558 = arg0;
        this.field4561 = arg1;
        this.field4560 = arg2;
        if (this.field4561 == -1) {
            this.field4555 = new HashMap(64);
            this.field4557 = new class391(64, this.field4556);
            this.field4563 = null;
        } else if (this.field4560 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4555 = new HashMap(this.field4561);
            this.field4557 = new class391(this.field4561, this.field4556);
            this.field4563 = new class391(this.field4561);
        }
    }

    @ObfuscatedName("pa.at(B)Z")
    public boolean method7047() {
        return this.field4561 != -1;
    }

    @ObfuscatedName("pa.an(Ljava/lang/Object;B)Ljava/lang/Object;")
    public Object method7059(Object arg0) {
        synchronized (this) {
            if (this.field4558 != -1L) {
                this.method7043();
            }
            class413 var3 = (class413) this.field4555.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method7042(var3, false);
                return var3.field4569;
            }
        }
    }

    @ObfuscatedName("pa.av(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method7041(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4558 != -1L) {
                this.method7043();
            }
            class413 var4 = (class413) this.field4555.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4569;
                var4.field4569 = arg1;
                this.method7042(var4, false);
                return var5;
            }
            if (this.method7047() && this.field4555.size() == this.field4561) {
                class413 var6 = (class413) this.field4563.remove();
                this.field4555.remove(var6.field4566);
                this.field4557.remove(var6);
            }
            class413 var7 = new class413(arg1, arg0);
            this.field4555.put(arg0, var7);
            this.method7042(var7, true);
            return null;
        }
    }

    @ObfuscatedName("pa.as(Lpl;ZI)V")
    public void method7042(class413 arg0, boolean arg1) {
        if (!arg1) {
            this.field4557.remove(arg0);
            if (this.method7047() && !this.field4563.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4567 = System.currentTimeMillis();
        if (this.method7047()) {
            switch(this.field4560.field4548) {
                case 0:
                    arg0.field4568 = arg0.field4567;
                    break;
                case 1:
                    arg0.field4568++;
            }
            this.field4563.add(arg0);
        }
        this.field4557.add(arg0);
    }

    @ObfuscatedName("pa.ax(I)V")
    public void method7043() {
        if (this.field4558 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4558;
        while (!this.field4557.isEmpty()) {
            class413 var3 = (class413) this.field4557.peek();
            if (var3.field4567 >= var1) {
                return;
            }
            this.field4555.remove(var3.field4566);
            this.field4557.remove(var3);
            if (this.method7047()) {
                this.field4563.remove(var3);
            }
        }
    }

    @ObfuscatedName("pa.ap(I)V")
    public void method7044() {
        synchronized (this) {
            this.field4555.clear();
            this.field4557.clear();
            if (this.method7047()) {
                this.field4563.clear();
            }
        }
    }
}
