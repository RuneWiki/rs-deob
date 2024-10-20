package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("rw")
public abstract class class451 {

    @ObfuscatedName("rw.ae")
    public final int field4732;

    @ObfuscatedName("rw.aa")
    public int field4731 = 0;

    @ObfuscatedName("rw.au")
    public class449[] field4733;

    @ObfuscatedName("rw.an")
    public HashMap field4734;

    @ObfuscatedName("rw.ad")
    public HashMap field4735;

    @ObfuscatedName("rw.ax")
    public Comparator field4736 = null;

    public class451(int arg0) {
        this.field4732 = arg0;
        this.field4733 = this.method7476(arg0);
        this.field4734 = new HashMap(arg0 / 8);
        this.field4735 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("rw.br(I)V")
    public void method7604() {
        this.field4731 = 0;
        Arrays.fill(this.field4733, (Object) null);
        this.field4734.clear();
        this.field4735.clear();
    }

    @ObfuscatedName("rw.ba(B)I")
    public int method7622() {
        return this.field4731;
    }

    @ObfuscatedName("rw.bk(B)Z")
    public boolean method7573() {
        return this.field4732 == this.field4731;
    }

    @ObfuscatedName("rw.bn(Lvs;I)Z")
    public boolean method7574(class554 arg0) {
        if (arg0.method9168()) {
            return this.field4734.containsKey(arg0) ? true : this.field4735.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("rw.by(Lvs;S)Lrq;")
    public class449 method7575(class554 arg0) {
        class449 var2 = this.method7576(arg0);
        return var2 == null ? this.method7577(arg0) : var2;
    }

    @ObfuscatedName("rw.bc(Lvs;I)Lrq;")
    public class449 method7576(class554 arg0) {
        return arg0.method9168() ? (class449) this.field4734.get(arg0) : null;
    }

    @ObfuscatedName("rw.bx(Lvs;I)Lrq;")
    public class449 method7577(class554 arg0) {
        return arg0.method9168() ? (class449) this.field4735.get(arg0) : null;
    }

    @ObfuscatedName("rw.bf(Lvs;I)Z")
    public final boolean method7578(class554 arg0) {
        class449 var2 = this.method7576(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method7579(var2);
            return true;
        }
    }

    @ObfuscatedName("rw.bp(Lrq;I)V")
    public final void method7579(class449 arg0) {
        int var2 = this.method7585(arg0);
        if (var2 != -1) {
            this.method7589(var2);
            this.method7586(arg0);
        }
    }

    @ObfuscatedName("rw.bv(Lvs;I)Lrq;")
    public class449 method7610(class554 arg0) {
        return this.method7581(arg0, (class554) null);
    }

    @ObfuscatedName("rw.bm(Lvs;Lvs;I)Lrq;")
    public class449 method7581(class554 arg0, class554 arg1) {
        if (this.method7576(arg0) != null) {
            throw new IllegalStateException();
        }
        class449 var3 = this.method7469();
        var3.method7548(arg0, arg1);
        this.method7587(var3);
        this.method7588(var3);
        return var3;
    }

    @ObfuscatedName("rw.bq(II)Lrq;")
    public final class449 method7626(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4731) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4733[arg0];
    }

    @ObfuscatedName("rw.bb(S)V")
    public final void method7607() {
        if (this.field4736 == null) {
            Arrays.sort(this.field4733, 0, this.field4731);
        } else {
            Arrays.sort(this.field4733, 0, this.field4731, this.field4736);
        }
    }

    @ObfuscatedName("rw.bh(Lrq;Lvs;Lvs;B)V")
    public final void method7584(class449 arg0, class554 arg1, class554 arg2) {
        this.method7586(arg0);
        arg0.method7548(arg1, arg2);
        this.method7588(arg0);
    }

    @ObfuscatedName("rw.bw(Lrq;I)I")
    public final int method7585(class449 arg0) {
        for (int var2 = 0; var2 < this.field4731; var2++) {
            if (this.field4733[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("rw.bi(Lrq;B)V")
    public final void method7586(class449 arg0) {
        if (this.field4734.remove(arg0.field4729) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4728 != null) {
            this.field4735.remove(arg0.field4728);
        }
    }

    @ObfuscatedName("rw.bu(Lrq;I)V")
    public final void method7587(class449 arg0) {
        this.field4733[++this.field4731 - 1] = arg0;
    }

    @ObfuscatedName("rw.be(Lrq;I)V")
    public final void method7588(class449 arg0) {
        this.field4734.put(arg0.field4729, arg0);
        if (arg0.field4728 != null) {
            class449 var2 = (class449) this.field4735.put(arg0.field4728, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4728 = null;
            }
        }
    }

    @ObfuscatedName("rw.bs(II)V")
    public final void method7589(int arg0) {
        this.field4731--;
        if (arg0 < this.field4731) {
            System.arraycopy(this.field4733, arg0 + 1, this.field4733, arg0, this.field4731 - arg0);
        }
    }

    @ObfuscatedName("rw.bl(B)V")
    public final void method7599() {
        this.field4736 = null;
    }

    @ObfuscatedName("rw.bz(Ljava/util/Comparator;B)V")
    public final void method7596(Comparator arg0) {
        if (this.field4736 == null) {
            this.field4736 = arg0;
        } else if (this.field4736 instanceof class450) {
            ((class450) this.field4736).method7557(arg0);
        }
    }

    @ObfuscatedName("rw.ap(IB)[Lrq;")
    public abstract class449[] method7476(int arg0);

    @ObfuscatedName("rw.am(I)Lrq;")
    public abstract class449 method7469();
}
