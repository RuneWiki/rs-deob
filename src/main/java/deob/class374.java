package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("nl")
public abstract class class374 {

    @ObfuscatedName("nl.r")
    public final int field4331;

    @ObfuscatedName("nl.v")
    public int field4328 = 0;

    @ObfuscatedName("nl.y")
    public class372[] field4329;

    @ObfuscatedName("nl.c")
    public HashMap field4330;

    @ObfuscatedName("nl.w")
    public HashMap field4327;

    @ObfuscatedName("nl.b")
    public Comparator field4332 = null;

    public class374(int arg0) {
        this.field4331 = arg0;
        this.field4329 = this.method5932(arg0);
        this.field4330 = new HashMap(arg0 / 8);
        this.field4327 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("nl.ac(I)V")
    public void method6027() {
        this.field4328 = 0;
        Arrays.fill(this.field4329, (Object) null);
        this.field4330.clear();
        this.field4327.clear();
    }

    @ObfuscatedName("nl.ab(I)I")
    public int method6028() {
        return this.field4328;
    }

    @ObfuscatedName("nl.aj(B)Z")
    public boolean method6065() {
        return this.field4331 == this.field4328;
    }

    @ObfuscatedName("nl.ae(Lqv;B)Z")
    public boolean method6029(class461 arg0) {
        if (arg0.method7490()) {
            return this.field4330.containsKey(arg0) ? true : this.field4327.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("nl.az(Lqv;I)Lnb;")
    public class372 method6030(class461 arg0) {
        class372 var2 = this.method6055(arg0);
        return var2 == null ? this.method6032(arg0) : var2;
    }

    @ObfuscatedName("nl.ap(Lqv;I)Lnb;")
    public class372 method6055(class461 arg0) {
        return arg0.method7490() ? (class372) this.field4330.get(arg0) : null;
    }

    @ObfuscatedName("nl.as(Lqv;I)Lnb;")
    public class372 method6032(class461 arg0) {
        return arg0.method7490() ? (class372) this.field4327.get(arg0) : null;
    }

    @ObfuscatedName("nl.au(Lqv;I)Z")
    public final boolean method6033(class461 arg0) {
        class372 var2 = this.method6055(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method6039(var2);
            return true;
        }
    }

    @ObfuscatedName("nl.ak(Lnb;I)V")
    public final void method6039(class372 arg0) {
        int var2 = this.method6083(arg0);
        if (var2 != -1) {
            this.method6043(var2);
            this.method6042(arg0);
        }
    }

    @ObfuscatedName("nl.af(Lqv;I)Lnb;")
    public class372 method6035(class461 arg0) {
        return this.method6073(arg0, (class461) null);
    }

    @ObfuscatedName("nl.al(Lqv;Lqv;B)Lnb;")
    public class372 method6073(class461 arg0, class461 arg1) {
        if (this.method6055(arg0) != null) {
            throw new IllegalStateException();
        }
        class372 var3 = this.method5931();
        var3.method6001(arg0, arg1);
        this.method6074(var3);
        this.method6050(var3);
        return var3;
    }

    @ObfuscatedName("nl.aq(II)Lnb;")
    public final class372 method6037(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4328) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4329[arg0];
    }

    @ObfuscatedName("nl.ad(I)V")
    public final void method6040() {
        if (this.field4332 == null) {
            Arrays.sort(this.field4329, 0, this.field4328);
        } else {
            Arrays.sort(this.field4329, 0, this.field4328, this.field4332);
        }
    }

    @ObfuscatedName("nl.an(Lnb;Lqv;Lqv;I)V")
    public final void method6036(class372 arg0, class461 arg1, class461 arg2) {
        this.method6042(arg0);
        arg0.method6001(arg1, arg2);
        this.method6050(arg0);
    }

    @ObfuscatedName("nl.aw(Lnb;I)I")
    public final int method6083(class372 arg0) {
        for (int var2 = 0; var2 < this.field4328; var2++) {
            if (this.field4329[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("nl.ah(Lnb;B)V")
    public final void method6042(class372 arg0) {
        if (this.field4330.remove(arg0.field4323) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4322 != null) {
            this.field4327.remove(arg0.field4322);
        }
    }

    @ObfuscatedName("nl.ao(Lnb;I)V")
    public final void method6074(class372 arg0) {
        this.field4329[++this.field4328 - 1] = arg0;
    }

    @ObfuscatedName("nl.av(Lnb;B)V")
    public final void method6050(class372 arg0) {
        this.field4330.put(arg0.field4323, arg0);
        if (arg0.field4322 != null) {
            class372 var2 = (class372) this.field4327.put(arg0.field4322, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4322 = null;
            }
        }
    }

    @ObfuscatedName("nl.ai(II)V")
    public final void method6043(int arg0) {
        this.field4328--;
        if (arg0 < this.field4328) {
            System.arraycopy(this.field4329, arg0 + 1, this.field4329, arg0, this.field4328 - arg0);
        }
    }

    @ObfuscatedName("nl.ay(I)V")
    public final void method6048() {
        this.field4332 = null;
    }

    @ObfuscatedName("nl.aa(Ljava/util/Comparator;I)V")
    public final void method6046(Comparator arg0) {
        if (this.field4332 == null) {
            this.field4332 = arg0;
        } else if (this.field4332 instanceof class373) {
            ((class373) this.field4332).method6015(arg0);
        }
    }

    @ObfuscatedName("nl.o(I)Lnb;")
    public abstract class372 method5931();

    @ObfuscatedName("nl.q(II)[Lnb;")
    public abstract class372[] method5932(int arg0);
}
