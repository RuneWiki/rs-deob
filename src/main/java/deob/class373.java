package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("nq")
public abstract class class373 {

    @ObfuscatedName("nq.y")
    public final int field4318;

    @ObfuscatedName("nq.i")
    public int field4319 = 0;

    @ObfuscatedName("nq.s")
    public class371[] field4314;

    @ObfuscatedName("nq.t")
    public HashMap field4315;

    @ObfuscatedName("nq.z")
    public HashMap field4317;

    @ObfuscatedName("nq.r")
    public Comparator field4316 = null;

    public class373(int arg0) {
        this.field4318 = arg0;
        this.field4314 = this.method5992(arg0);
        this.field4315 = new HashMap(arg0 / 8);
        this.field4317 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("nq.ac(I)V")
    public void method6095() {
        this.field4319 = 0;
        Arrays.fill(this.field4314, (Object) null);
        this.field4315.clear();
        this.field4317.clear();
    }

    @ObfuscatedName("nq.ae(I)I")
    public int method6096() {
        return this.field4319;
    }

    @ObfuscatedName("nq.aj(B)Z")
    public boolean method6097() {
        return this.field4319 == this.field4318;
    }

    @ObfuscatedName("nq.am(Lqa;I)Z")
    public boolean method6158(class464 arg0) {
        if (arg0.method7619()) {
            return this.field4315.containsKey(arg0) ? true : this.field4317.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("nq.an(Lqa;I)Lne;")
    public class371 method6099(class464 arg0) {
        class371 var2 = this.method6100(arg0);
        return var2 == null ? this.method6101(arg0) : var2;
    }

    @ObfuscatedName("nq.af(Lqa;I)Lne;")
    public class371 method6100(class464 arg0) {
        return arg0.method7619() ? (class371) this.field4315.get(arg0) : null;
    }

    @ObfuscatedName("nq.ax(Lqa;I)Lne;")
    public class371 method6101(class464 arg0) {
        return arg0.method7619() ? (class371) this.field4317.get(arg0) : null;
    }

    @ObfuscatedName("nq.ar(Lqa;I)Z")
    public final boolean method6102(class464 arg0) {
        class371 var2 = this.method6100(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method6103(var2);
            return true;
        }
    }

    @ObfuscatedName("nq.at(Lne;B)V")
    public final void method6103(class371 arg0) {
        int var2 = this.method6109(arg0);
        if (var2 != -1) {
            this.method6113(var2);
            this.method6110(arg0);
        }
    }

    @ObfuscatedName("nq.ag(Lqa;I)Lne;")
    public class371 method6165(class464 arg0) {
        return this.method6105(arg0, (class464) null);
    }

    @ObfuscatedName("nq.aq(Lqa;Lqa;I)Lne;")
    public class371 method6105(class464 arg0, class464 arg1) {
        if (this.method6100(arg0) != null) {
            throw new IllegalStateException();
        }
        class371 var3 = this.method5998();
        var3.method6078(arg0, arg1);
        this.method6111(var3);
        this.method6112(var3);
        return var3;
    }

    @ObfuscatedName("nq.ah(II)Lne;")
    public final class371 method6125(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4319) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4314[arg0];
    }

    @ObfuscatedName("nq.ai(I)V")
    public final void method6157() {
        if (this.field4316 == null) {
            Arrays.sort(this.field4314, 0, this.field4319);
        } else {
            Arrays.sort(this.field4314, 0, this.field4319, this.field4316);
        }
    }

    @ObfuscatedName("nq.az(Lne;Lqa;Lqa;I)V")
    public final void method6108(class371 arg0, class464 arg1, class464 arg2) {
        this.method6110(arg0);
        arg0.method6078(arg1, arg2);
        this.method6112(arg0);
    }

    @ObfuscatedName("nq.av(Lne;I)I")
    public final int method6109(class371 arg0) {
        for (int var2 = 0; var2 < this.field4319; var2++) {
            if (this.field4314[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("nq.aw(Lne;S)V")
    public final void method6110(class371 arg0) {
        if (this.field4315.remove(arg0.field4307) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4308 != null) {
            this.field4317.remove(arg0.field4308);
        }
    }

    @ObfuscatedName("nq.au(Lne;I)V")
    public final void method6111(class371 arg0) {
        this.field4314[++this.field4319 - 1] = arg0;
    }

    @ObfuscatedName("nq.ay(Lne;I)V")
    public final void method6112(class371 arg0) {
        this.field4315.put(arg0.field4307, arg0);
        if (arg0.field4308 != null) {
            class371 var2 = (class371) this.field4317.put(arg0.field4308, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4308 = null;
            }
        }
    }

    @ObfuscatedName("nq.as(II)V")
    public final void method6113(int arg0) {
        this.field4319--;
        if (arg0 < this.field4319) {
            System.arraycopy(this.field4314, arg0 + 1, this.field4314, arg0, this.field4319 - arg0);
        }
    }

    @ObfuscatedName("nq.be(B)V")
    public final void method6114() {
        this.field4316 = null;
    }

    @ObfuscatedName("nq.bz(Ljava/util/Comparator;B)V")
    public final void method6115(Comparator arg0) {
        if (this.field4316 == null) {
            this.field4316 = arg0;
        } else if (this.field4316 instanceof class372) {
            ((class372) this.field4316).method6091(arg0);
        }
    }

    @ObfuscatedName("nq.c(S)Lne;")
    public abstract class371 method5998();

    @ObfuscatedName("nq.v(II)[Lne;")
    public abstract class371[] method5992(int arg0);
}
