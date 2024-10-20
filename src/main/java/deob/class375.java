package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("nq")
public abstract class class375 {

    @ObfuscatedName("nq.m")
    public final int field4360;

    @ObfuscatedName("nq.x")
    public int field4357 = 0;

    @ObfuscatedName("nq.j")
    public class373[] field4358;

    @ObfuscatedName("nq.v")
    public HashMap field4359;

    @ObfuscatedName("nq.h")
    public HashMap field4361;

    @ObfuscatedName("nq.t")
    public Comparator field4362 = null;

    public class375(int arg0) {
        this.field4360 = arg0;
        this.field4358 = this.method6159(arg0);
        this.field4359 = new HashMap(arg0 / 8);
        this.field4361 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("nq.ac(I)V")
    public void method6265() {
        this.field4357 = 0;
        Arrays.fill(this.field4358, (Object) null);
        this.field4359.clear();
        this.field4361.clear();
    }

    @ObfuscatedName("nq.ao(I)I")
    public int method6246() {
        return this.field4357;
    }

    @ObfuscatedName("nq.ar(I)Z")
    public boolean method6247() {
        return this.field4360 == this.field4357;
    }

    @ObfuscatedName("nq.aq(Lqo;I)Z")
    public boolean method6248(class466 arg0) {
        if (arg0.method7784()) {
            return this.field4359.containsKey(arg0) ? true : this.field4361.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("nq.ai(Lqo;I)Lnc;")
    public class373 method6264(class466 arg0) {
        class373 var2 = this.method6250(arg0);
        return var2 == null ? this.method6251(arg0) : var2;
    }

    @ObfuscatedName("nq.an(Lqo;B)Lnc;")
    public class373 method6250(class466 arg0) {
        return arg0.method7784() ? (class373) this.field4359.get(arg0) : null;
    }

    @ObfuscatedName("nq.aa(Lqo;I)Lnc;")
    public class373 method6251(class466 arg0) {
        return arg0.method7784() ? (class373) this.field4361.get(arg0) : null;
    }

    @ObfuscatedName("nq.ak(Lqo;I)Z")
    public final boolean method6286(class466 arg0) {
        class373 var2 = this.method6250(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method6253(var2);
            return true;
        }
    }

    @ObfuscatedName("nq.am(Lnc;I)V")
    public final void method6253(class373 arg0) {
        int var2 = this.method6280(arg0);
        if (var2 != -1) {
            this.method6261(var2);
            this.method6249(arg0);
        }
    }

    @ObfuscatedName("nq.ap(Lqo;I)Lnc;")
    public class373 method6254(class466 arg0) {
        return this.method6304(arg0, (class466) null);
    }

    @ObfuscatedName("nq.ab(Lqo;Lqo;B)Lnc;")
    public class373 method6304(class466 arg0, class466 arg1) {
        if (this.method6250(arg0) != null) {
            throw new IllegalStateException();
        }
        class373 var3 = this.method6155();
        var3.method6226(arg0, arg1);
        this.method6259(var3);
        this.method6260(var3);
        return var3;
    }

    @ObfuscatedName("nq.az(II)Lnc;")
    public final class373 method6256(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4357) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4358[arg0];
    }

    @ObfuscatedName("nq.ad(I)V")
    public final void method6268() {
        if (this.field4362 == null) {
            Arrays.sort(this.field4358, 0, this.field4357);
        } else {
            Arrays.sort(this.field4358, 0, this.field4357, this.field4362);
        }
    }

    @ObfuscatedName("nq.af(Lnc;Lqo;Lqo;I)V")
    public final void method6252(class373 arg0, class466 arg1, class466 arg2) {
        this.method6249(arg0);
        arg0.method6226(arg1, arg2);
        this.method6260(arg0);
    }

    @ObfuscatedName("nq.aj(Lnc;B)I")
    public final int method6280(class373 arg0) {
        for (int var2 = 0; var2 < this.field4357; var2++) {
            if (this.field4358[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("nq.ax(Lnc;I)V")
    public final void method6249(class373 arg0) {
        if (this.field4359.remove(arg0.field4351) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4352 != null) {
            this.field4361.remove(arg0.field4352);
        }
    }

    @ObfuscatedName("nq.av(Lnc;S)V")
    public final void method6259(class373 arg0) {
        this.field4358[++this.field4357 - 1] = arg0;
    }

    @ObfuscatedName("nq.ae(Lnc;I)V")
    public final void method6260(class373 arg0) {
        this.field4359.put(arg0.field4351, arg0);
        if (arg0.field4352 != null) {
            class373 var2 = (class373) this.field4361.put(arg0.field4352, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4352 = null;
            }
        }
    }

    @ObfuscatedName("nq.ay(IB)V")
    public final void method6261(int arg0) {
        this.field4357--;
        if (arg0 < this.field4357) {
            System.arraycopy(this.field4358, arg0 + 1, this.field4358, arg0, this.field4357 - arg0);
        }
    }

    @ObfuscatedName("nq.ag(I)V")
    public final void method6262() {
        this.field4362 = null;
    }

    @ObfuscatedName("nq.aw(Ljava/util/Comparator;I)V")
    public final void method6263(Comparator arg0) {
        if (this.field4362 == null) {
            this.field4362 = arg0;
        } else if (this.field4362 instanceof class374) {
            ((class374) this.field4362).method6244(arg0);
        }
    }

    @ObfuscatedName("nq.c(B)Lnc;")
    public abstract class373 method6155();

    @ObfuscatedName("nq.p(IB)[Lnc;")
    public abstract class373[] method6159(int arg0);
}
