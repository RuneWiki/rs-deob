package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("nv")
public abstract class class373 {

    @ObfuscatedName("nv.q")
    public final int field4261;

    @ObfuscatedName("nv.o")
    public int field4260 = 0;

    @ObfuscatedName("nv.r")
    public class371[] field4262;

    @ObfuscatedName("nv.p")
    public HashMap field4263;

    @ObfuscatedName("nv.w")
    public HashMap field4264;

    @ObfuscatedName("nv.k")
    public Comparator field4265 = null;

    public class373(int arg0) {
        this.field4261 = arg0;
        this.field4262 = this.method6037(arg0);
        this.field4263 = new HashMap(arg0 / 8);
        this.field4264 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("nv.al(B)V")
    public void method6142() {
        this.field4260 = 0;
        Arrays.fill(this.field4262, (Object) null);
        this.field4263.clear();
        this.field4264.clear();
    }

    @ObfuscatedName("nv.av(I)I")
    public int method6129() {
        return this.field4260;
    }

    @ObfuscatedName("nv.at(S)Z")
    public boolean method6182() {
        return this.field4261 == this.field4260;
    }

    @ObfuscatedName("nv.an(Lqb;I)Z")
    public boolean method6131(class459 arg0) {
        if (arg0.method7524()) {
            return this.field4263.containsKey(arg0) ? true : this.field4264.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("nv.ay(Lqb;I)Lnn;")
    public class371 method6132(class459 arg0) {
        class371 var2 = this.method6174(arg0);
        return var2 == null ? this.method6134(arg0) : var2;
    }

    @ObfuscatedName("nv.ag(Lqb;I)Lnn;")
    public class371 method6174(class459 arg0) {
        return arg0.method7524() ? (class371) this.field4263.get(arg0) : null;
    }

    @ObfuscatedName("nv.ah(Lqb;I)Lnn;")
    public class371 method6134(class459 arg0) {
        return arg0.method7524() ? (class371) this.field4264.get(arg0) : null;
    }

    @ObfuscatedName("nv.ac(Lqb;I)Z")
    public final boolean method6135(class459 arg0) {
        class371 var2 = this.method6174(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method6136(var2);
            return true;
        }
    }

    @ObfuscatedName("nv.ab(Lnn;I)V")
    public final void method6136(class371 arg0) {
        int var2 = this.method6185(arg0);
        if (var2 != -1) {
            this.method6181(var2);
            this.method6143(arg0);
        }
    }

    @ObfuscatedName("nv.au(Lqb;B)Lnn;")
    public class371 method6137(class459 arg0) {
        return this.method6138(arg0, (class459) null);
    }

    @ObfuscatedName("nv.af(Lqb;Lqb;I)Lnn;")
    public class371 method6138(class459 arg0, class459 arg1) {
        if (this.method6174(arg0) != null) {
            throw new IllegalStateException();
        }
        class371 var3 = this.method6030();
        var3.method6111(arg0, arg1);
        this.method6145(var3);
        this.method6149(var3);
        return var3;
    }

    @ObfuscatedName("nv.ad(II)Lnn;")
    public final class371 method6139(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4260) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4262[arg0];
    }

    @ObfuscatedName("nv.ai(B)V")
    public final void method6161() {
        if (this.field4265 == null) {
            Arrays.sort(this.field4262, 0, this.field4260);
        } else {
            Arrays.sort(this.field4262, 0, this.field4260, this.field4265);
        }
    }

    @ObfuscatedName("nv.ax(Lnn;Lqb;Lqb;I)V")
    public final void method6127(class371 arg0, class459 arg1, class459 arg2) {
        this.method6143(arg0);
        arg0.method6111(arg1, arg2);
        this.method6149(arg0);
    }

    @ObfuscatedName("nv.ar(Lnn;I)I")
    public final int method6185(class371 arg0) {
        for (int var2 = 0; var2 < this.field4260; var2++) {
            if (this.field4262[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("nv.ap(Lnn;I)V")
    public final void method6143(class371 arg0) {
        if (this.field4263.remove(arg0.field4256) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4255 != null) {
            this.field4264.remove(arg0.field4255);
        }
    }

    @ObfuscatedName("nv.az(Lnn;B)V")
    public final void method6145(class371 arg0) {
        this.field4262[++this.field4260 - 1] = arg0;
    }

    @ObfuscatedName("nv.as(Lnn;B)V")
    public final void method6149(class371 arg0) {
        this.field4263.put(arg0.field4256, arg0);
        if (arg0.field4255 != null) {
            class371 var2 = (class371) this.field4264.put(arg0.field4255, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4255 = null;
            }
        }
    }

    @ObfuscatedName("nv.aa(II)V")
    public final void method6181(int arg0) {
        this.field4260--;
        if (arg0 < this.field4260) {
            System.arraycopy(this.field4262, arg0 + 1, this.field4262, arg0, this.field4260 - arg0);
        }
    }

    @ObfuscatedName("nv.bj(I)V")
    public final void method6196() {
        this.field4265 = null;
    }

    @ObfuscatedName("nv.bm(Ljava/util/Comparator;I)V")
    public final void method6203(Comparator arg0) {
        if (this.field4265 == null) {
            this.field4265 = arg0;
        } else if (this.field4265 instanceof class372) {
            ((class372) this.field4265).method6122(arg0);
        }
    }

    @ObfuscatedName("nv.v(I)Lnn;")
    public abstract class371 method6030();

    @ObfuscatedName("nv.c(II)[Lnn;")
    public abstract class371[] method6037(int arg0);
}
