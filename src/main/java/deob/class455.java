package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("ru")
public abstract class class455 {

    @ObfuscatedName("ru.ad")
    public final int field4796;

    @ObfuscatedName("ru.al")
    public int field4799 = 0;

    @ObfuscatedName("ru.as")
    public class453[] field4798;

    @ObfuscatedName("ru.ag")
    public HashMap field4797;

    @ObfuscatedName("ru.ai")
    public HashMap field4795;

    @ObfuscatedName("ru.ax")
    public Comparator field4794 = null;

    public class455(int arg0) {
        this.field4796 = arg0;
        this.field4798 = this.method7360(arg0);
        this.field4797 = new HashMap(arg0 / 8);
        this.field4795 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("ru.bc(B)V")
    public void method7454() {
        this.field4799 = 0;
        Arrays.fill(this.field4798, (Object) null);
        this.field4797.clear();
        this.field4795.clear();
    }

    @ObfuscatedName("ru.bf(B)I")
    public int method7461() {
        return this.field4799;
    }

    @ObfuscatedName("ru.be(S)Z")
    public boolean method7453() {
        return this.field4799 == this.field4796;
    }

    @ObfuscatedName("ru.bn(Lvx;I)Z")
    public boolean method7475(class558 arg0) {
        if (arg0.method9076()) {
            return this.field4797.containsKey(arg0) ? true : this.field4795.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ru.bd(Lvx;I)Lrr;")
    public class453 method7522(class558 arg0) {
        class453 var2 = this.method7458(arg0);
        return var2 == null ? this.method7459(arg0) : var2;
    }

    @ObfuscatedName("ru.bo(Lvx;B)Lrr;")
    public class453 method7458(class558 arg0) {
        return arg0.method9076() ? (class453) this.field4797.get(arg0) : null;
    }

    @ObfuscatedName("ru.bx(Lvx;I)Lrr;")
    public class453 method7459(class558 arg0) {
        return arg0.method9076() ? (class453) this.field4795.get(arg0) : null;
    }

    @ObfuscatedName("ru.bl(Lvx;I)Z")
    public final boolean method7460(class558 arg0) {
        class453 var2 = this.method7458(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method7474(var2);
            return true;
        }
    }

    @ObfuscatedName("ru.bh(Lrr;I)V")
    public final void method7474(class453 arg0) {
        int var2 = this.method7467(arg0);
        if (var2 != -1) {
            this.method7457(var2);
            this.method7468(arg0);
        }
    }

    @ObfuscatedName("ru.bs(Lvx;I)Lrr;")
    public class453 method7462(class558 arg0) {
        return this.method7479(arg0, (class558) null);
    }

    @ObfuscatedName("ru.bj(Lvx;Lvx;I)Lrr;")
    public class453 method7479(class558 arg0, class558 arg1) {
        if (this.method7458(arg0) != null) {
            throw new IllegalStateException();
        }
        class453 var3 = this.method7359();
        var3.method7436(arg0, arg1);
        this.method7501(var3);
        this.method7470(var3);
        return var3;
    }

    @ObfuscatedName("ru.bu(II)Lrr;")
    public final class453 method7464(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4799) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4798[arg0];
    }

    @ObfuscatedName("ru.br(I)V")
    public final void method7507() {
        if (this.field4794 == null) {
            Arrays.sort(this.field4798, 0, this.field4799);
        } else {
            Arrays.sort(this.field4798, 0, this.field4799, this.field4794);
        }
    }

    @ObfuscatedName("ru.bb(Lrr;Lvx;Lvx;I)V")
    public final void method7466(class453 arg0, class558 arg1, class558 arg2) {
        this.method7468(arg0);
        arg0.method7436(arg1, arg2);
        this.method7470(arg0);
    }

    @ObfuscatedName("ru.by(Lrr;B)I")
    public final int method7467(class453 arg0) {
        for (int var2 = 0; var2 < this.field4799; var2++) {
            if (this.field4798[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ru.bk(Lrr;I)V")
    public final void method7468(class453 arg0) {
        if (this.field4797.remove(arg0.field4792) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4791 != null) {
            this.field4795.remove(arg0.field4791);
        }
    }

    @ObfuscatedName("ru.bt(Lrr;I)V")
    public final void method7501(class453 arg0) {
        this.field4798[++this.field4799 - 1] = arg0;
    }

    @ObfuscatedName("ru.bq(Lrr;I)V")
    public final void method7470(class453 arg0) {
        this.field4797.put(arg0.field4792, arg0);
        if (arg0.field4791 != null) {
            class453 var2 = (class453) this.field4795.put(arg0.field4791, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4791 = null;
            }
        }
    }

    @ObfuscatedName("ru.bi(IB)V")
    public final void method7457(int arg0) {
        this.field4799--;
        if (arg0 < this.field4799) {
            System.arraycopy(this.field4798, arg0 + 1, this.field4798, arg0, this.field4799 - arg0);
        }
    }

    @ObfuscatedName("ru.bw(I)V")
    public final void method7498() {
        this.field4794 = null;
    }

    @ObfuscatedName("ru.bm(Ljava/util/Comparator;I)V")
    public final void method7465(Comparator arg0) {
        if (this.field4794 == null) {
            this.field4794 = arg0;
        } else if (this.field4794 instanceof class454) {
            ((class454) this.field4794).method7449(arg0);
        }
    }

    @ObfuscatedName("ru.az(I)Lrr;")
    public abstract class453 method7359();

    @ObfuscatedName("ru.ah(IB)[Lrr;")
    public abstract class453[] method7360(int arg0);
}
